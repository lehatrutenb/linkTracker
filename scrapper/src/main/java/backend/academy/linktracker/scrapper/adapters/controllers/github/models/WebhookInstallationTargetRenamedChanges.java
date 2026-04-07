package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookInstallationTargetRenamedChanges
 */
@JsonTypeName("webhook_installation_target_renamed_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookInstallationTargetRenamedChanges {

    private Optional<WebhookDiscussionCommentEditedChangesBody> login = Optional.empty();

    private Optional<WebhookDiscussionCommentEditedChangesBody> slug = Optional.empty();

    public WebhookInstallationTargetRenamedChanges login(WebhookDiscussionCommentEditedChangesBody login) {
        this.login = Optional.ofNullable(login);
        return this;
    }

    /**
     * Get login
     * @return login
     */
    @Valid
    @Schema(name = "login", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("login")
    public Optional<WebhookDiscussionCommentEditedChangesBody> getLogin() {
        return login;
    }

    public void setLogin(Optional<WebhookDiscussionCommentEditedChangesBody> login) {
        this.login = login;
    }

    public WebhookInstallationTargetRenamedChanges slug(WebhookDiscussionCommentEditedChangesBody slug) {
        this.slug = Optional.ofNullable(slug);
        return this;
    }

    /**
     * Get slug
     * @return slug
     */
    @Valid
    @Schema(name = "slug", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("slug")
    public Optional<WebhookDiscussionCommentEditedChangesBody> getSlug() {
        return slug;
    }

    public void setSlug(Optional<WebhookDiscussionCommentEditedChangesBody> slug) {
        this.slug = slug;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookInstallationTargetRenamedChanges webhookInstallationTargetRenamedChanges =
                (WebhookInstallationTargetRenamedChanges) o;
        return Objects.equals(this.login, webhookInstallationTargetRenamedChanges.login)
                && Objects.equals(this.slug, webhookInstallationTargetRenamedChanges.slug);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, slug);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookInstallationTargetRenamedChanges {\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
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
