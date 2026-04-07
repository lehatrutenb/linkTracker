package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.annotation.Generated;

/**
 * The package's language or package management ecosystem.
 */
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public enum SecurityAdvisoryEcosystems {
    RUBYGEMS("rubygems"),

    NPM("npm"),

    PIP("pip"),

    MAVEN("maven"),

    NUGET("nuget"),

    COMPOSER("composer"),

    GO("go"),

    RUST("rust"),

    ERLANG("erlang"),

    ACTIONS("actions"),

    PUB("pub"),

    OTHER("other"),

    SWIFT("swift");

    private final String value;

    SecurityAdvisoryEcosystems(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static SecurityAdvisoryEcosystems fromValue(String value) {
        for (SecurityAdvisoryEcosystems b : SecurityAdvisoryEcosystems.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
