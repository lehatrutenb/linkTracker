package backend.academy.linktracker;

import backend.academy.linktracker.bot.properties.RefreshScopeProperty;
import lombok.Getter;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.server.servlet.context.ServletWebServerApplicationContext;
import org.springframework.cloud.context.scope.refresh.RefreshScope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import static com.github.tomakehurst.wiremock.client.WireMock.*;
import com.github.tomakehurst.wiremock.junit.WireMockClassRule;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

// My masterpiece
public class StatelessApplicationTestExtension implements BeforeAllCallback, AfterAllCallback {
    private final Class<?> applicationClass;
    private final ArrayList<String> args = new ArrayList<>();
    private ConfigurableApplicationContext applicationContext;

    public StatelessApplicationTestExtension(Class<?> applicationClass, String... args) {
        this.applicationClass = applicationClass;
        this.args.addAll(Arrays.asList(args));
        this.args.add("--spring.profiles.active=test");
    }


    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        if (applicationContext != null) {
            applicationContext.close();
        }
    }

    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        addWiremockArgs(context);
        applicationContext = SpringApplication.run(applicationClass, args.toArray(new String[0]));
    }

    private void addWiremockArgs(ExtensionContext context) { // Can't set such context in DynamicPropertySource, cause config validate conf and create beans before
        ApplicationContext testContext = SpringExtension.getApplicationContext(context);
        this.args.add("--wiremock.server.baseUrl=" + testContext.getEnvironment().getProperty("wiremock.server.baseUrl"));
    }

    public void addProperties(String source, Map<String, Object> properties) {
        applicationContext
            .getEnvironment()
            .getPropertySources()
            .addFirst(new MapPropertySource(source, properties));
    }

    public int getServerPort() {
        // No server port exists if use 0 as it means it can be only known in runtime
        return Integer.parseInt(applicationContext.getEnvironment().getProperty("local.server.port"));
    }

    public void refreshScope() {
        // Firstly destroy property beans
        DefaultSingletonBeanRegistry registry = (DefaultSingletonBeanRegistry) applicationContext.getAutowireCapableBeanFactory();
        Arrays.stream(applicationContext.getBeanNamesForAnnotation(RefreshScopeProperty.class)).forEach(
            registry::destroySingleton
        );

        // Ask to refresh services with refresh contexts that will recreate property beans with new data inside
        RefreshScope refreshScope = applicationContext.getBean(RefreshScope.class);
        refreshScope.refreshAll();
    }
}
