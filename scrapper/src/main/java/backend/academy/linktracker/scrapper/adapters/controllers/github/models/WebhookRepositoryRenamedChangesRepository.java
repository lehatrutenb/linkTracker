package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WebhookRepositoryRenamedChangesRepository
 */
@JsonTypeName("webhook_repository_renamed_changes_repository")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRepositoryRenamedChangesRepository {

    private WebhookDiscussionCommentEditedChangesBody name;

    public WebhookRepositoryRenamedChangesRepository() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookRepositoryRenamedChangesRepository(WebhookDiscussionCommentEditedChangesBody name) {
        this.name = name;
    }

    public WebhookRepositoryRenamedChangesRepository name(WebhookDiscussionCommentEditedChangesBody name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Valid
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public WebhookDiscussionCommentEditedChangesBody getName() {
        return name;
    }

    public void setName(WebhookDiscussionCommentEditedChangesBody name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookRepositoryRenamedChangesRepository webhookRepositoryRenamedChangesRepository =
                (WebhookRepositoryRenamedChangesRepository) o;
        return Objects.equals(this.name, webhookRepositoryRenamedChangesRepository.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookRepositoryRenamedChangesRepository {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
