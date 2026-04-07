package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Organization variable for GitHub Actions.
 */
@Schema(name = "organization-actions-variable", description = "Organization variable for GitHub Actions.")
@JsonTypeName("organization-actions-variable")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrganizationActionsVariable {

    private String name;

    private String value;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    /**
     * Visibility of a variable
     */
    public enum VisibilityEnum {
        ALL("all"),

        PRIVATE("private"),

        SELECTED("selected");

        private final String value;

        VisibilityEnum(String value) {
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
        public static VisibilityEnum fromValue(String value) {
            for (VisibilityEnum b : VisibilityEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private VisibilityEnum visibility;

    private Optional<URI> selectedRepositoriesUrl = Optional.empty();

    public OrganizationActionsVariable() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrganizationActionsVariable(
            String name, String value, OffsetDateTime createdAt, OffsetDateTime updatedAt, VisibilityEnum visibility) {
        this.name = name;
        this.value = value;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.visibility = visibility;
    }

    public OrganizationActionsVariable name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the variable.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "USERNAME",
            description = "The name of the variable.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrganizationActionsVariable value(String value) {
        this.value = value;
        return this;
    }

    /**
     * The value of the variable.
     * @return value
     */
    @NotNull
    @Schema(
            name = "value",
            example = "octocat",
            description = "The value of the variable.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public OrganizationActionsVariable createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The date and time at which the variable was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "created_at",
            example = "2019-01-24T22:45:36Z",
            description =
                    "The date and time at which the variable was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public OrganizationActionsVariable updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The date and time at which the variable was last updated, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "updated_at",
            example = "2019-01-24T22:45:36Z",
            description =
                    "The date and time at which the variable was last updated, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public OrganizationActionsVariable visibility(VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Visibility of a variable
     * @return visibility
     */
    @NotNull
    @Schema(name = "visibility", description = "Visibility of a variable", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("visibility")
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public OrganizationActionsVariable selectedRepositoriesUrl(URI selectedRepositoriesUrl) {
        this.selectedRepositoriesUrl = Optional.ofNullable(selectedRepositoriesUrl);
        return this;
    }

    /**
     * Get selectedRepositoriesUrl
     * @return selectedRepositoriesUrl
     */
    @Valid
    @Schema(
            name = "selected_repositories_url",
            example = "https://api.github.com/organizations/org/variables/USERNAME/repositories",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("selected_repositories_url")
    public Optional<URI> getSelectedRepositoriesUrl() {
        return selectedRepositoriesUrl;
    }

    public void setSelectedRepositoriesUrl(Optional<URI> selectedRepositoriesUrl) {
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
        OrganizationActionsVariable organizationActionsVariable = (OrganizationActionsVariable) o;
        return Objects.equals(this.name, organizationActionsVariable.name)
                && Objects.equals(this.value, organizationActionsVariable.value)
                && Objects.equals(this.createdAt, organizationActionsVariable.createdAt)
                && Objects.equals(this.updatedAt, organizationActionsVariable.updatedAt)
                && Objects.equals(this.visibility, organizationActionsVariable.visibility)
                && Objects.equals(this.selectedRepositoriesUrl, organizationActionsVariable.selectedRepositoriesUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, createdAt, updatedAt, visibility, selectedRepositoriesUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationActionsVariable {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
