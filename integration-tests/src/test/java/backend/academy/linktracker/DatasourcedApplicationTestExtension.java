package backend.academy.linktracker;

import org.junit.jupiter.api.extension.ExtensionContext;

public class DatasourcedApplicationTestExtension extends StatefulApplicationTestExtension {
    private SharedPostgresContainer postgresContainer;

    public DatasourcedApplicationTestExtension(
            Class<?> applicationClass, SharedPostgresContainer postgresContainer, String... args) {
        super(applicationClass, args);
        this.postgresContainer = postgresContainer;
    }

    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        super.args.add("--spring.datasource.url=" + postgresContainer.getJdbcUrl());
        super.args.add("--spring.datasource.username=" + postgresContainer.getUsername());
        super.args.add("--spring.datasource.password=" + postgresContainer.getPassword());
        super.beforeAll(context);
    }
}
