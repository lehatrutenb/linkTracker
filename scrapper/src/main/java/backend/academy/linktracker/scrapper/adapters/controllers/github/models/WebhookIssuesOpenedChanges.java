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
 * WebhookIssuesOpenedChanges
 */
@JsonTypeName("webhook_issues_opened_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookIssuesOpenedChanges {

    private Issue6 oldIssue = null;

    private Repository1 oldRepository;

    public WebhookIssuesOpenedChanges() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookIssuesOpenedChanges(Issue6 oldIssue, Repository1 oldRepository) {
        this.oldIssue = oldIssue;
        this.oldRepository = oldRepository;
    }

    public WebhookIssuesOpenedChanges oldIssue(Issue6 oldIssue) {
        this.oldIssue = oldIssue;
        return this;
    }

    /**
     * Get oldIssue
     * @return oldIssue
     */
    @NotNull
    @Valid
    @Schema(name = "old_issue", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("old_issue")
    public Issue6 getOldIssue() {
        return oldIssue;
    }

    public void setOldIssue(Issue6 oldIssue) {
        this.oldIssue = oldIssue;
    }

    public WebhookIssuesOpenedChanges oldRepository(Repository1 oldRepository) {
        this.oldRepository = oldRepository;
        return this;
    }

    /**
     * Get oldRepository
     * @return oldRepository
     */
    @NotNull
    @Valid
    @Schema(name = "old_repository", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("old_repository")
    public Repository1 getOldRepository() {
        return oldRepository;
    }

    public void setOldRepository(Repository1 oldRepository) {
        this.oldRepository = oldRepository;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookIssuesOpenedChanges webhookIssuesOpenedChanges = (WebhookIssuesOpenedChanges) o;
        return Objects.equals(this.oldIssue, webhookIssuesOpenedChanges.oldIssue)
                && Objects.equals(this.oldRepository, webhookIssuesOpenedChanges.oldRepository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oldIssue, oldRepository);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookIssuesOpenedChanges {\n");
        sb.append("    oldIssue: ").append(toIndentedString(oldIssue)).append("\n");
        sb.append("    oldRepository: ").append(toIndentedString(oldRepository)).append("\n");
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
