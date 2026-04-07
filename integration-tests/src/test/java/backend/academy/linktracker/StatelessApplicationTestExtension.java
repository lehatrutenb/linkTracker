package backend.academy.linktracker;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.MapPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

// My masterpiece
public class StatelessApplicationTestExtension implements BeforeAllCallback, AfterAllCallback {
    private final Class<?> applicationClass;
    private final ArrayList<String> args = new ArrayList<>();
    protected ConfigurableApplicationContext applicationContext;

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
}
