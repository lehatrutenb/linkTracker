package backend.academy.linktracker;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.springframework.cloud.context.scope.refresh.RefreshScope;

// My masterpiece # 2
public class StatefulApplicationTestExtension extends StatelessApplicationTestExtension
        implements BeforeAllCallback, AfterAllCallback {
    public StatefulApplicationTestExtension(Class<?> applicationClass, String... args) {
        super(applicationClass, args);
    }

    public void refreshScope() {
        RefreshScope refreshScope = applicationContext.getBean(RefreshScope.class);
        refreshScope.refreshAll();
    }
}
