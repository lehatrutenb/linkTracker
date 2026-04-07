package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * WebhookTeamEditedChangesPrivacy
 */
@JsonTypeName("webhook_team_edited_changes_privacy")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookTeamEditedChangesPrivacy {

    private String from;

    public WebhookTeamEditedChangesPrivacy() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookTeamEditedChangesPrivacy(String from) {
        this.from = from;
    }

    public WebhookTeamEditedChangesPrivacy from(String from) {
        this.from = from;
        return this;
    }

    /**
     * The previous version of the team's privacy if the action was `edited`.
     * @return from
     */
    @NotNull
    @Schema(
            name = "from",
            description = "The previous version of the team's privacy if the action was `edited`.",
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
        WebhookTeamEditedChangesPrivacy webhookTeamEditedChangesPrivacy = (WebhookTeamEditedChangesPrivacy) o;
        return Objects.equals(this.from, webhookTeamEditedChangesPrivacy.from);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookTeamEditedChangesPrivacy {\n");
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
