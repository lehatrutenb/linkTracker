package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Information about repositories that Dependabot is able to access in an organization
 */
@Schema(
        name = "dependabot-repository-access-details",
        description = "Information about repositories that Dependabot is able to access in an organization")
@JsonTypeName("dependabot-repository-access-details")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DependabotRepositoryAccessDetails {

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
            return null;
        }
    }

    private DefaultLevelEnum defaultLevel = null;

    @Valid
    private List<@Valid NullableSimpleRepository> accessibleRepositories = new ArrayList<>();

    public DependabotRepositoryAccessDetails defaultLevel(DefaultLevelEnum defaultLevel) {
        this.defaultLevel = defaultLevel;
        return this;
    }

    /**
     * The default repository access level for Dependabot updates.
     * @return defaultLevel
     */
    @Schema(
            name = "default_level",
            example = "internal",
            description = "The default repository access level for Dependabot updates.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("default_level")
    public DefaultLevelEnum getDefaultLevel() {
        return defaultLevel;
    }

    public void setDefaultLevel(DefaultLevelEnum defaultLevel) {
        this.defaultLevel = defaultLevel;
    }

    public DependabotRepositoryAccessDetails accessibleRepositories(
            List<@Valid NullableSimpleRepository> accessibleRepositories) {
        this.accessibleRepositories = accessibleRepositories;
        return this;
    }

    public DependabotRepositoryAccessDetails addAccessibleRepositoriesItem(
            NullableSimpleRepository accessibleRepositoriesItem) {
        if (this.accessibleRepositories == null) {
            this.accessibleRepositories = new ArrayList<>();
        }
        this.accessibleRepositories.add(accessibleRepositoriesItem);
        return this;
    }

    /**
     * Get accessibleRepositories
     * @return accessibleRepositories
     */
    @Valid
    @Schema(name = "accessible_repositories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("accessible_repositories")
    public List<@Valid NullableSimpleRepository> getAccessibleRepositories() {
        return accessibleRepositories;
    }

    public void setAccessibleRepositories(List<@Valid NullableSimpleRepository> accessibleRepositories) {
        this.accessibleRepositories = accessibleRepositories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DependabotRepositoryAccessDetails dependabotRepositoryAccessDetails = (DependabotRepositoryAccessDetails) o;
        return Objects.equals(this.defaultLevel, dependabotRepositoryAccessDetails.defaultLevel)
                && Objects.equals(
                        this.accessibleRepositories, dependabotRepositoryAccessDetails.accessibleRepositories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultLevel, accessibleRepositories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependabotRepositoryAccessDetails {\n");
        sb.append("    defaultLevel: ").append(toIndentedString(defaultLevel)).append("\n");
        sb.append("    accessibleRepositories: ")
                .append(toIndentedString(accessibleRepositories))
                .append("\n");
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
