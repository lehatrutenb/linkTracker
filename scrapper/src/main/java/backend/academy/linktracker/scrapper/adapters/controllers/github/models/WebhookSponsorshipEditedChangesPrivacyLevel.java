package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WebhookSponsorshipEditedChangesPrivacyLevel
 */
@JsonTypeName("webhook_sponsorship_edited_changes_privacy_level")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookSponsorshipEditedChangesPrivacyLevel {

    private String from;

    public WebhookSponsorshipEditedChangesPrivacyLevel() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookSponsorshipEditedChangesPrivacyLevel(String from) {
        this.from = from;
    }

    public WebhookSponsorshipEditedChangesPrivacyLevel from(String from) {
        this.from = from;
        return this;
    }

    /**
     * The `edited` event types include the details about the change when someone edits a sponsorship to change the privacy.
     * @return from
     */
    @NotNull
    @Schema(
            name = "from",
            description =
                    "The `edited` event types include the details about the change when someone edits a sponsorship to change the privacy.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookSponsorshipEditedChangesPrivacyLevel webhookSponsorshipEditedChangesPrivacyLevel =
                (WebhookSponsorshipEditedChangesPrivacyLevel) o;
        return Objects.equals(this.from, webhookSponsorshipEditedChangesPrivacyLevel.from);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookSponsorshipEditedChangesPrivacyLevel {\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
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
