package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * This field is included for legacy purposes; use the &#x60;role_name&#x60; field instead. The &#x60;maintain&#x60; role is mapped to &#x60;write&#x60; and the &#x60;triage&#x60; role is mapped to &#x60;read&#x60;. To determine the role assigned to the collaborator, use the &#x60;role_name&#x60; field instead, which will provide the full role name, including custom roles.
 */
@Schema(
        name = "webhook_member_added_changes_permission",
        description =
                "This field is included for legacy purposes; use the `role_name` field instead. The `maintain` role is mapped to `write` and the `triage` role is mapped to `read`. To determine the role assigned to the collaborator, use the `role_name` field instead, which will provide the full role name, including custom roles.")
@JsonTypeName("webhook_member_added_changes_permission")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookMemberAddedChangesPermission {

    /**
     * Gets or Sets to
     */
    public enum ToEnum {
        WRITE("write"),

        ADMIN("admin"),

        READ("read");

        private final String value;

        ToEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ToEnum fromValue(String value) {
            for (ToEnum b : ToEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ToEnum to;

    public WebhookMemberAddedChangesPermission() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookMemberAddedChangesPermission(ToEnum to) {
        this.to = to;
    }

    public WebhookMemberAddedChangesPermission to(ToEnum to) {
        this.to = to;
        return this;
    }

    /**
     * Get to
     * @return to
     */
    @NotNull
    @Schema(name = "to", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("to")
    public ToEnum getTo() {
        return to;
    }

    public void setTo(ToEnum to) {
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
        WebhookMemberAddedChangesPermission webhookMemberAddedChangesPermission =
                (WebhookMemberAddedChangesPermission) o;
        return Objects.equals(this.to, webhookMemberAddedChangesPermission.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookMemberAddedChangesPermission {\n");
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
