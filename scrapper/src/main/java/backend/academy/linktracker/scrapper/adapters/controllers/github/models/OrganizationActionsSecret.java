package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Secrets for GitHub Actions for an organization.
 */
@Schema(name = "organization-actions-secret", description = "Secrets for GitHub Actions for an organization.")
@JsonTypeName("organization-actions-secret")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrganizationActionsSecret {

    private String name;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    /**
     * Visibility of a secret
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

    private URI selectedRepositoriesUrl;

    public OrganizationActionsSecret() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrganizationActionsSecret(
            String name, OffsetDateTime createdAt, OffsetDateTime updatedAt, VisibilityEnum visibility) {
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.visibility = visibility;
    }

    public OrganizationActionsSecret name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the secret.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "SECRET_TOKEN",
            description = "The name of the secret.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrganizationActionsSecret createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public OrganizationActionsSecret updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public OrganizationActionsSecret visibility(VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Visibility of a secret
     * @return visibility
     */
    @NotNull
    @Schema(name = "visibility", description = "Visibility of a secret", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("visibility")
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public OrganizationActionsSecret selectedRepositoriesUrl(URI selectedRepositoriesUrl) {
        this.selectedRepositoriesUrl = selectedRepositoriesUrl;
        return this;
    }

    /**
     * Get selectedRepositoriesUrl
     * @return selectedRepositoriesUrl
     */
    @Valid
    @Schema(
            name = "selected_repositories_url",
            example = "https://api.github.com/organizations/org/secrets/my_secret/repositories",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("selected_repositories_url")
    public URI getSelectedRepositoriesUrl() {
        return selectedRepositoriesUrl;
    }

    public void setSelectedRepositoriesUrl(URI selectedRepositoriesUrl) {
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
        OrganizationActionsSecret organizationActionsSecret = (OrganizationActionsSecret) o;
        return Objects.equals(this.name, organizationActionsSecret.name)
                && Objects.equals(this.createdAt, organizationActionsSecret.createdAt)
                && Objects.equals(this.updatedAt, organizationActionsSecret.updatedAt)
                && Objects.equals(this.visibility, organizationActionsSecret.visibility)
                && Objects.equals(this.selectedRepositoriesUrl, organizationActionsSecret.selectedRepositoriesUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, createdAt, updatedAt, visibility, selectedRepositoriesUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationActionsSecret {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
