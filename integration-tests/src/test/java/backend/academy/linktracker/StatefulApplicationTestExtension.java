package backend.academy.linktracker;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.springframework.cloud.context.scope.refresh.RefreshScope;

// My masterpiece # 2
public class StatefulApplicationTestExtension extends StatelessApplicationTestExtension
        implements BeforeEachCallback, AfterEachCallback {
    public StatefulApplicationTestExtension(Class<?> applicationClass, String... args) {
        super(applicationClass, args);
    }

    public void refreshScope() {
        RefreshScope refreshScope = applicationContext.getBean(RefreshScope.class);
        refreshScope.refreshAll();
    }
}
