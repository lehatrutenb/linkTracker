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
 * OrgsSetImmutableReleasesSettingsRequest
 */
@JsonTypeName("orgs_set_immutable_releases_settings_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsSetImmutableReleasesSettingsRequest {

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

    @Valid
    private List<Long> selectedRepositoryIds = new ArrayList<>();

    public OrgsSetImmutableReleasesSettingsRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrgsSetImmutableReleasesSettingsRequest(EnforcedRepositoriesEnum enforcedRepositories) {
        this.enforcedRepositories = enforcedRepositories;
    }

    public OrgsSetImmutableReleasesSettingsRequest enforcedRepositories(EnforcedRepositoriesEnum enforcedRepositories) {
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

    public OrgsSetImmutableReleasesSettingsRequest selectedRepositoryIds(List<Long> selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
        return this;
    }

    public OrgsSetImmutableReleasesSettingsRequest addSelectedRepositoryIdsItem(Long selectedRepositoryIdsItem) {
        if (this.selectedRepositoryIds == null) {
            this.selectedRepositoryIds = new ArrayList<>();
        }
        this.selectedRepositoryIds.add(selectedRepositoryIdsItem);
        return this;
    }

    /**
     * An array of repository ids for which immutable releases enforcement should be applied. You can only provide a list of repository ids when the `enforced_repositories` is set to `selected`. You can add and remove individual repositories using the [Enable a selected repository for immutable releases in an organization](https://docs.github.com/rest/orgs/orgs#enable-a-selected-repository-for-immutable-releases-in-an-organization) and [Disable a selected repository for immutable releases in an organization](https://docs.github.com/rest/orgs/orgs#disable-a-selected-repository-for-immutable-releases-in-an-organization) endpoints.
     * @return selectedRepositoryIds
     */
    @Schema(
            name = "selected_repository_ids",
            description =
                    "An array of repository ids for which immutable releases enforcement should be applied. You can only provide a list of repository ids when the `enforced_repositories` is set to `selected`. You can add and remove individual repositories using the [Enable a selected repository for immutable releases in an organization](https://docs.github.com/rest/orgs/orgs#enable-a-selected-repository-for-immutable-releases-in-an-organization) and [Disable a selected repository for immutable releases in an organization](https://docs.github.com/rest/orgs/orgs#disable-a-selected-repository-for-immutable-releases-in-an-organization) endpoints.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("selected_repository_ids")
    public List<Long> getSelectedRepositoryIds() {
        return selectedRepositoryIds;
    }

    public void setSelectedRepositoryIds(List<Long> selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsSetImmutableReleasesSettingsRequest orgsSetImmutableReleasesSettingsRequest =
                (OrgsSetImmutableReleasesSettingsRequest) o;
        return Objects.equals(this.enforcedRepositories, orgsSetImmutableReleasesSettingsRequest.enforcedRepositories)
                && Objects.equals(
                        this.selectedRepositoryIds, orgsSetImmutableReleasesSettingsRequest.selectedRepositoryIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enforcedRepositories, selectedRepositoryIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsSetImmutableReleasesSettingsRequest {\n");
        sb.append("    enforcedRepositories: ")
                .append(toIndentedString(enforcedRepositories))
                .append("\n");
        sb.append("    selectedRepositoryIds: ")
                .append(toIndentedString(selectedRepositoryIds))
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
