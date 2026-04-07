package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookProjectsV2ProjectEditedChangesTitle
 */
@JsonTypeName("webhook_projects_v2_project_edited_changes_title")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectsV2ProjectEditedChangesTitle {

    private Optional<String> from = Optional.empty();

    private Optional<String> to = Optional.empty();

    public WebhookProjectsV2ProjectEditedChangesTitle from(String from) {
        this.from = Optional.ofNullable(from);
        return this;
    }

    /**
     * Get from
     * @return from
     */
    @Schema(name = "from", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("from")
    public Optional<String> getFrom() {
        return from;
    }

    public void setFrom(Optional<String> from) {
        this.from = from;
    }

    public WebhookProjectsV2ProjectEditedChangesTitle to(String to) {
        this.to = Optional.ofNullable(to);
        return this;
    }

    /**
     * Get to
     * @return to
     */
    @Schema(name = "to", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("to")
    public Optional<String> getTo() {
        return to;
    }

    public void setTo(Optional<String> to) {
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookProjectsV2ProjectEditedChangesTitle webhookProjectsV2ProjectEditedChangesTitle =
                (WebhookProjectsV2ProjectEditedChangesTitle) o;
        return Objects.equals(this.from, webhookProjectsV2ProjectEditedChangesTitle.from)
                && Objects.equals(this.to, webhookProjectsV2ProjectEditedChangesTitle.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookProjectsV2ProjectEditedChangesTitle {\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
