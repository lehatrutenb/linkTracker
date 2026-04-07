package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookProjectsV2ProjectEditedChanges
 */
@JsonTypeName("webhook_projects_v2_project_edited_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectsV2ProjectEditedChanges {

    private Optional<WebhookMemberEditedChangesPermission> description = Optional.empty();

    private Optional<WebhookProjectsV2ProjectEditedChangesPublic> _public = Optional.empty();

    private Optional<WebhookMemberEditedChangesPermission> shortDescription = Optional.empty();

    private Optional<WebhookProjectsV2ProjectEditedChangesTitle> title = Optional.empty();

    public WebhookProjectsV2ProjectEditedChanges description(WebhookMemberEditedChangesPermission description) {
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Valid
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public Optional<WebhookMemberEditedChangesPermission> getDescription() {
        return description;
    }

    public void setDescription(Optional<WebhookMemberEditedChangesPermission> description) {
        this.description = description;
    }

    public WebhookProjectsV2ProjectEditedChanges _public(WebhookProjectsV2ProjectEditedChangesPublic _public) {
        this._public = Optional.ofNullable(_public);
        return this;
    }

    /**
     * Get _public
     * @return _public
     */
    @Valid
    @Schema(name = "public", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("public")
    public Optional<WebhookProjectsV2ProjectEditedChangesPublic> getPublic() {
        return _public;
    }

    public void setPublic(Optional<WebhookProjectsV2ProjectEditedChangesPublic> _public) {
        this._public = _public;
    }

    public WebhookProjectsV2ProjectEditedChanges shortDescription(
            WebhookMemberEditedChangesPermission shortDescription) {
        this.shortDescription = Optional.ofNullable(shortDescription);
        return this;
    }

    /**
     * Get shortDescription
     * @return shortDescription
     */
    @Valid
    @Schema(name = "short_description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("short_description")
    public Optional<WebhookMemberEditedChangesPermission> getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(Optional<WebhookMemberEditedChangesPermission> shortDescription) {
        this.shortDescription = shortDescription;
    }

    public WebhookProjectsV2ProjectEditedChanges title(WebhookProjectsV2ProjectEditedChangesTitle title) {
        this.title = Optional.ofNullable(title);
        return this;
    }

    /**
     * Get title
     * @return title
     */
    @Valid
    @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("title")
    public Optional<WebhookProjectsV2ProjectEditedChangesTitle> getTitle() {
        return title;
    }

    public void setTitle(Optional<WebhookProjectsV2ProjectEditedChangesTitle> title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookProjectsV2ProjectEditedChanges webhookProjectsV2ProjectEditedChanges =
                (WebhookProjectsV2ProjectEditedChanges) o;
        return Objects.equals(this.description, webhookProjectsV2ProjectEditedChanges.description)
                && Objects.equals(this._public, webhookProjectsV2ProjectEditedChanges._public)
                && Objects.equals(this.shortDescription, webhookProjectsV2ProjectEditedChanges.shortDescription)
                && Objects.equals(this.title, webhookProjectsV2ProjectEditedChanges.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, _public, shortDescription, title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookProjectsV2ProjectEditedChanges {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
        sb.append("    shortDescription: ")
                .append(toIndentedString(shortDescription))
                .append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
