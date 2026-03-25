package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WebhookReleaseEditedChangesMakeLatest
 */
@JsonTypeName("webhook_release_edited_changes_make_latest")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookReleaseEditedChangesMakeLatest {

    private Boolean to;

    public WebhookReleaseEditedChangesMakeLatest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookReleaseEditedChangesMakeLatest(Boolean to) {
        this.to = to;
    }

    public WebhookReleaseEditedChangesMakeLatest to(Boolean to) {
        this.to = to;
        return this;
    }

    /**
     * Whether this release was explicitly `edited` to be the latest.
     * @return to
     */
    @NotNull
    @Schema(
            name = "to",
            description = "Whether this release was explicitly `edited` to be the latest.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("to")
    public Boolean getTo() {
        return to;
    }

    public void setTo(Boolean to) {
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
        WebhookReleaseEditedChangesMakeLatest webhookReleaseEditedChangesMakeLatest =
                (WebhookReleaseEditedChangesMakeLatest) o;
        return Objects.equals(this.to, webhookReleaseEditedChangesMakeLatest.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookReleaseEditedChangesMakeLatest {\n");
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
