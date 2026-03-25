package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * The action requested by the user.
 */
@Schema(name = "webhook_check_run_requested_action_requested_action", description = "The action requested by the user.")
@JsonTypeName("webhook_check_run_requested_action_requested_action")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookCheckRunRequestedActionRequestedAction {

    private String identifier;

    public WebhookCheckRunRequestedActionRequestedAction identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * The integrator reference of the action requested by the user.
     * @return identifier
     */
    @Schema(
            name = "identifier",
            description = "The integrator reference of the action requested by the user.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookCheckRunRequestedActionRequestedAction webhookCheckRunRequestedActionRequestedAction =
                (WebhookCheckRunRequestedActionRequestedAction) o;
        return Objects.equals(this.identifier, webhookCheckRunRequestedActionRequestedAction.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookCheckRunRequestedActionRequestedAction {\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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
