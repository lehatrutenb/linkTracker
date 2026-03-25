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
 * WebhookIssuesTransferredChanges
 */
@JsonTypeName("webhook_issues_transferred_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookIssuesTransferredChanges {

    private Issue9 newIssue;

    private Repository2 newRepository;

    public WebhookIssuesTransferredChanges() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookIssuesTransferredChanges(Issue9 newIssue, Repository2 newRepository) {
        this.newIssue = newIssue;
        this.newRepository = newRepository;
    }

    public WebhookIssuesTransferredChanges newIssue(Issue9 newIssue) {
        this.newIssue = newIssue;
        return this;
    }

    /**
     * Get newIssue
     * @return newIssue
     */
    @NotNull
    @Valid
    @Schema(name = "new_issue", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("new_issue")
    public Issue9 getNewIssue() {
        return newIssue;
    }

    public void setNewIssue(Issue9 newIssue) {
        this.newIssue = newIssue;
    }

    public WebhookIssuesTransferredChanges newRepository(Repository2 newRepository) {
        this.newRepository = newRepository;
        return this;
    }

    /**
     * Get newRepository
     * @return newRepository
     */
    @NotNull
    @Valid
    @Schema(name = "new_repository", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("new_repository")
    public Repository2 getNewRepository() {
        return newRepository;
    }

    public void setNewRepository(Repository2 newRepository) {
        this.newRepository = newRepository;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookIssuesTransferredChanges webhookIssuesTransferredChanges = (WebhookIssuesTransferredChanges) o;
        return Objects.equals(this.newIssue, webhookIssuesTransferredChanges.newIssue)
                && Objects.equals(this.newRepository, webhookIssuesTransferredChanges.newRepository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newIssue, newRepository);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookIssuesTransferredChanges {\n");
        sb.append("    newIssue: ").append(toIndentedString(newIssue)).append("\n");
        sb.append("    newRepository: ").append(toIndentedString(newRepository)).append("\n");
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
