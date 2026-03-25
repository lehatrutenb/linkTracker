package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Check immutable releases settings for an organization.
 */
@Schema(
        name = "immutable-releases-organization-settings",
        description = "Check immutable releases settings for an organization.")
@JsonTypeName("immutable-releases-organization-settings")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ImmutableReleasesOrganizationSettings {

    /**
     * The policy that controls how immutable releases are enforced in the organization.
     */
    public enum EnforcedRepositoriesEnum {
        ALL("all"),

        NONE("none"),

        SELECTED("selected");

        private final String value;

        EnforcedRepositoriesEnum(String value) {
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
        public static EnforcedRepositoriesEnum fromValue(String value) {
            for (EnforcedRepositoriesEnum b : EnforcedRepositoriesEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private EnforcedRepositoriesEnum enforcedRepositories;

    private String selectedRepositoriesUrl;

    public ImmutableReleasesOrganizationSettings() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ImmutableReleasesOrganizationSettings(EnforcedRepositoriesEnum enforcedRepositories) {
        this.enforcedRepositories = enforcedRepositories;
    }

    public ImmutableReleasesOrganizationSettings enforcedRepositories(EnforcedRepositoriesEnum enforcedRepositories) {
        this.enforcedRepositories = enforcedRepositories;
        return this;
    }

    /**
     * The policy that controls how immutable releases are enforced in the organization.
     * @return enforcedRepositories
     */
    @NotNull
    @Schema(
            name = "enforced_repositories",
            example = "all",
            description = "The policy that controls how immutable releases are enforced in the organization.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("enforced_repositories")
    public EnforcedRepositoriesEnum getEnforcedRepositories() {
        return enforcedRepositories;
    }

    public void setEnforcedRepositories(EnforcedRepositoriesEnum enforcedRepositories) {
        this.enforcedRepositories = enforcedRepositories;
    }

    public ImmutableReleasesOrganizationSettings selectedRepositoriesUrl(String selectedRepositoriesUrl) {
        this.selectedRepositoriesUrl = selectedRepositoriesUrl;
        return this;
    }

    /**
     * The API URL to use to get or set the selected repositories for immutable releases enforcement, when `enforced_repositories` is set to `selected`.
     * @return selectedRepositoriesUrl
     */
    @Schema(
            name = "selected_repositories_url",
            description =
                    "The API URL to use to get or set the selected repositories for immutable releases enforcement, when `enforced_repositories` is set to `selected`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("selected_repositories_url")
    public String getSelectedRepositoriesUrl() {
        return selectedRepositoriesUrl;
    }

    public void setSelectedRepositoriesUrl(String selectedRepositoriesUrl) {
        this.selectedRepositoriesUrl = selectedRepositoriesUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImmutableReleasesOrganizationSettings immutableReleasesOrganizationSettings =
                (ImmutableReleasesOrganizationSettings) o;
        return Objects.equals(this.enforcedRepositories, immutableReleasesOrganizationSettings.enforcedRepositories)
                && Objects.equals(
                        this.selectedRepositoriesUrl, immutableReleasesOrganizationSettings.selectedRepositoriesUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enforcedRepositories, selectedRepositoriesUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImmutableReleasesOrganizationSettings {\n");
        sb.append("    enforcedRepositories: ")
                .append(toIndentedString(enforcedRepositories))
                .append("\n");
        sb.append("    selectedRepositoriesUrl: ")
                .append(toIndentedString(selectedRepositoriesUrl))
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
