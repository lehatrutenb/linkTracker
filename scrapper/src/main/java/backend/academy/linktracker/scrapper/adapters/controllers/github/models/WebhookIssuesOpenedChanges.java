package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookIssuesOpenedChanges
 */
@JsonTypeName("webhook_issues_opened_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookIssuesOpenedChanges {

    private JsonNullable<Issue6> oldIssue = JsonNullable.<Issue6>undefined();

    private Repository1 oldRepository;

    public WebhookIssuesOpenedChanges() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookIssuesOpenedChanges(Issue6 oldIssue, Repository1 oldRepository) {
        this.oldIssue = JsonNullable.of(oldIssue);
        this.oldRepository = oldRepository;
    }

    public WebhookIssuesOpenedChanges oldIssue(Issue6 oldIssue) {
        this.oldIssue = JsonNullable.of(oldIssue);
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
    public JsonNullable<Issue6> getOldIssue() {
        return oldIssue;
    }

    public void setOldIssue(JsonNullable<Issue6> oldIssue) {
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
