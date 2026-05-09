package backend.academy.linktracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.env.MapPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

// My masterpiece
public class StatelessApplicationTestExtension implements BeforeEachCallback, AfterEachCallback {
    private final Class<?> applicationClass;
    protected final ArrayList<String> args = new ArrayList<>();
    protected ConfigurableApplicationContext applicationContext;

    public StatelessApplicationTestExtension(Class<?> applicationClass, String... args) {
        this.applicationClass = applicationClass;
        this.args.addAll(Arrays.asList(args));
        this.args.add("--spring.profiles.active=test");
    }

    @Override
    @Order(Ordered.LOWEST_PRECEDENCE)
    public void afterEach(ExtensionContext context) throws Exception {
        if (applicationContext != null) {
            applicationContext.close();
        }
    }

    @Override
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public void beforeEach(ExtensionContext context) throws Exception {
        if (applicationContext == null) {
            addWiremockArgs(context);
        }
        applicationContext = SpringApplication.run(applicationClass, args.toArray(new String[0]));
    }

    private void addWiremockArgs(
            ExtensionContext
                    context) { // Can't set such context in DynamicPropertySource, cause config validate conf and create
        // beans before
        ApplicationContext testContext = SpringExtension.getApplicationContext(context);
        this.args.add(
                "--wiremock.server.baseUrl=" + testContext.getEnvironment().getProperty("wiremock.server.baseUrl"));
    }

    public void addProperties(String source, Map<String, Object> properties) {
        applicationContext.getEnvironment().getPropertySources().addFirst(new MapPropertySource(source, properties));
    }

    public int getServerPort() {
        // No server port exists if use 0 as it means it can be only known in runtime
        return Integer.parseInt(applicationContext.getEnvironment().getProperty("local.server.port"));
    }

    public <T> T getBean(Class<T> beanClass) {
        return applicationContext.getBean(beanClass);
    }
}
