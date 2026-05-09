package backend.academy.linktracker;

import backend.academy.linktracker.properties.RefreshScopeProperty;
import java.util.Arrays;
import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;
import org.springframework.cloud.context.scope.refresh.RefreshScope;

// My masterpiece # 2
public class StatefulApplicationTestExtension extends StatelessApplicationTestExtension
        implements BeforeEachCallback, AfterEachCallback {
    public StatefulApplicationTestExtension(Class<?> applicationClass, String... args) {
        super(applicationClass, args);
    }

    public void refreshScope() {
        // Firstly destroy property beans
        DefaultSingletonBeanRegistry registry =
                (DefaultSingletonBeanRegistry) applicationContext.getAutowireCapableBeanFactory();
        Arrays.stream(applicationContext.getBeanNamesForAnnotation(RefreshScopeProperty.class))
                .forEach(registry::destroySingleton);

        // Ask to refresh services with refresh contexts that will recreate property beans with new data inside
        RefreshScope refreshScope = applicationContext.getBean(RefreshScope.class);
        refreshScope.refreshAll();
    }
}
