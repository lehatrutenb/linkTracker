package backend.academy.linktracker;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.springframework.core.Ordered;

public class DatasourcedApplicationTestExtension extends StatefulApplicationTestExtension {
    private SharedPostgresContainer postgresContainer;

    public DatasourcedApplicationTestExtension(
            Class<?> applicationClass, SharedPostgresContainer postgresContainer, String... args) {
        super(applicationClass, args);
        this.postgresContainer = postgresContainer;
    }

    @Override
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public void beforeEach(ExtensionContext context) throws Exception {
        if (super.applicationContext == null) {
            args.add("--spring.datasource.url=" + postgresContainer.getJdbcUrl());
            args.add("--spring.datasource.username=" + postgresContainer.getUsername());
            args.add("--spring.datasource.password=" + postgresContainer.getPassword());
        }
        super.beforeEach(context);
    }
}
