package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * DependabotSetRepositoryAccessDefaultLevelRequest
 */
@JsonTypeName("dependabot_set_repository_access_default_level_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DependabotSetRepositoryAccessDefaultLevelRequest {

    /**
     * The default repository access level for Dependabot updates.
     */
    public enum DefaultLevelEnum {
        PUBLIC("public"),

        INTERNAL("internal");

        private final String value;

        DefaultLevelEnum(String value) {
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
        public static DefaultLevelEnum fromValue(String value) {
            for (DefaultLevelEnum b : DefaultLevelEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private DefaultLevelEnum defaultLevel;

    public DependabotSetRepositoryAccessDefaultLevelRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DependabotSetRepositoryAccessDefaultLevelRequest(DefaultLevelEnum defaultLevel) {
        this.defaultLevel = defaultLevel;
    }

    public DependabotSetRepositoryAccessDefaultLevelRequest defaultLevel(DefaultLevelEnum defaultLevel) {
        this.defaultLevel = defaultLevel;
        return this;
    }

    /**
     * The default repository access level for Dependabot updates.
     * @return defaultLevel
     */
    @NotNull
    @Schema(
            name = "default_level",
            example = "internal",
            description = "The default repository access level for Dependabot updates.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("default_level")
    public DefaultLevelEnum getDefaultLevel() {
        return defaultLevel;
    }

    public void setDefaultLevel(DefaultLevelEnum defaultLevel) {
        this.defaultLevel = defaultLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DependabotSetRepositoryAccessDefaultLevelRequest dependabotSetRepositoryAccessDefaultLevelRequest =
                (DependabotSetRepositoryAccessDefaultLevelRequest) o;
        return Objects.equals(this.defaultLevel, dependabotSetRepositoryAccessDefaultLevelRequest.defaultLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependabotSetRepositoryAccessDefaultLevelRequest {\n");
        sb.append("    defaultLevel: ").append(toIndentedString(defaultLevel)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
