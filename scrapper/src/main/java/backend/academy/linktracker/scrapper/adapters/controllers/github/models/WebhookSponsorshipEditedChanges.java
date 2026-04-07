package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookSponsorshipEditedChanges
 */
@JsonTypeName("webhook_sponsorship_edited_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookSponsorshipEditedChanges {

    private Optional<WebhookSponsorshipEditedChangesPrivacyLevel> privacyLevel = Optional.empty();

    public WebhookSponsorshipEditedChanges privacyLevel(WebhookSponsorshipEditedChangesPrivacyLevel privacyLevel) {
        this.privacyLevel = Optional.ofNullable(privacyLevel);
        return this;
    }

    /**
     * Get privacyLevel
     * @return privacyLevel
     */
    @Valid
    @Schema(name = "privacy_level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("privacy_level")
    public Optional<WebhookSponsorshipEditedChangesPrivacyLevel> getPrivacyLevel() {
        return privacyLevel;
    }

    public void setPrivacyLevel(Optional<WebhookSponsorshipEditedChangesPrivacyLevel> privacyLevel) {
        this.privacyLevel = privacyLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookSponsorshipEditedChanges webhookSponsorshipEditedChanges = (WebhookSponsorshipEditedChanges) o;
        return Objects.equals(this.privacyLevel, webhookSponsorshipEditedChanges.privacyLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privacyLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookSponsorshipEditedChanges {\n");
        sb.append("    privacyLevel: ").append(toIndentedString(privacyLevel)).append("\n");
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
