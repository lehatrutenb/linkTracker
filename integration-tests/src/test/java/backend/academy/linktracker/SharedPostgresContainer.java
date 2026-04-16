package backend.academy.linktracker;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.testcontainers.postgresql.PostgreSQLContainer;

public final class SharedPostgresContainer implements AfterAllCallback {
    private static final PostgreSQLContainer postgres;

    static {
        postgres = new PostgreSQLContainer("postgres:18-alpine");
        postgres.start();
        // Runtime.getRuntime().addShutdownHook(new Thread(postgres::stop));
    }

    public static PostgreSQLContainer getContainer() {
        return postgres;
    }

    public static String getJdbcUrl() {
        return postgres.getJdbcUrl();
    }

    public static String getPassword() {
        return postgres.getPassword();
    }

    public static String getUsername() {
        return postgres.getUsername();
    }

    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        postgres.stop();
    }
}
