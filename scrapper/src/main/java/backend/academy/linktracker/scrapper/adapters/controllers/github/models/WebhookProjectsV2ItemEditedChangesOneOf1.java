package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * WebhookProjectsV2ItemEditedChangesOneOf1
 */
@JsonTypeName("webhook_projects_v2_item_edited_changes_oneOf_1")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectsV2ItemEditedChangesOneOf1 implements WebhookProjectsV2ItemEditedChanges {

    private WebhookMemberEditedChangesPermission body;

    public WebhookProjectsV2ItemEditedChangesOneOf1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookProjectsV2ItemEditedChangesOneOf1(WebhookMemberEditedChangesPermission body) {
        this.body = body;
    }

    public WebhookProjectsV2ItemEditedChangesOneOf1 body(WebhookMemberEditedChangesPermission body) {
        this.body = body;
        return this;
    }

    /**
     * Get body
     * @return body
     */
    @NotNull
    @Valid
    @Schema(name = "body", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("body")
    public WebhookMemberEditedChangesPermission getBody() {
        return body;
    }

    public void setBody(WebhookMemberEditedChangesPermission body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookProjectsV2ItemEditedChangesOneOf1 webhookProjectsV2ItemEditedChangesOneOf1 =
                (WebhookProjectsV2ItemEditedChangesOneOf1) o;
        return Objects.equals(this.body, webhookProjectsV2ItemEditedChangesOneOf1.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookProjectsV2ItemEditedChangesOneOf1 {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
