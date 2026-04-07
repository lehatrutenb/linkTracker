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
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Secrets for a GitHub Codespace.
 */
@Schema(name = "codespaces-secret", description = "Secrets for a GitHub Codespace.")
@JsonTypeName("codespaces-secret")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodespacesSecret {

    private String name;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    /**
     * The type of repositories in the organization that the secret is visible to
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

    public CodespacesSecret() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodespacesSecret(
            String name,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            VisibilityEnum visibility,
            URI selectedRepositoriesUrl) {
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.visibility = visibility;
        this.selectedRepositoriesUrl = selectedRepositoriesUrl;
    }

    public CodespacesSecret name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the secret
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "SECRET_NAME",
            description = "The name of the secret",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CodespacesSecret createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The date and time at which the secret was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "created_at",
            description =
                    "The date and time at which the secret was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CodespacesSecret updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The date and time at which the secret was last updated, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "updated_at",
            description =
                    "The date and time at which the secret was last updated, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CodespacesSecret visibility(VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * The type of repositories in the organization that the secret is visible to
     * @return visibility
     */
    @NotNull
    @Schema(
            name = "visibility",
            description = "The type of repositories in the organization that the secret is visible to",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("visibility")
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public CodespacesSecret selectedRepositoriesUrl(URI selectedRepositoriesUrl) {
        this.selectedRepositoriesUrl = selectedRepositoriesUrl;
        return this;
    }

    /**
     * The API URL at which the list of repositories this secret is visible to can be retrieved
     * @return selectedRepositoriesUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "selected_repositories_url",
            example = "https://api.github.com/user/secrets/SECRET_NAME/repositories",
            description = "The API URL at which the list of repositories this secret is visible to can be retrieved",
            requiredMode = Schema.RequiredMode.REQUIRED)
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
        CodespacesSecret codespacesSecret = (CodespacesSecret) o;
        return Objects.equals(this.name, codespacesSecret.name)
                && Objects.equals(this.createdAt, codespacesSecret.createdAt)
                && Objects.equals(this.updatedAt, codespacesSecret.updatedAt)
                && Objects.equals(this.visibility, codespacesSecret.visibility)
                && Objects.equals(this.selectedRepositoriesUrl, codespacesSecret.selectedRepositoriesUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, createdAt, updatedAt, visibility, selectedRepositoriesUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodespacesSecret {\n");
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
