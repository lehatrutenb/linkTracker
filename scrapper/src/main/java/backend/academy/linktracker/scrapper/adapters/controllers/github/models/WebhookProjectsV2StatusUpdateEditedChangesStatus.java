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
 * WebhookProjectsV2StatusUpdateEditedChangesStatus
 */
@JsonTypeName("webhook_projects_v2_status_update_edited_changes_status")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectsV2StatusUpdateEditedChangesStatus {

    /**
     * Gets or Sets from
     */
    public enum FromEnum {
        INACTIVE("INACTIVE"),

        ON_TRACK("ON_TRACK"),

        AT_RISK("AT_RISK"),

        OFF_TRACK("OFF_TRACK"),

        COMPLETE("COMPLETE");

        private final String value;

        FromEnum(String value) {
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
        public static FromEnum fromValue(String value) {
            for (FromEnum b : FromEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }

    private FromEnum from = null;

    /**
     * Gets or Sets to
     */
    public enum ToEnum {
        INACTIVE("INACTIVE"),

        ON_TRACK("ON_TRACK"),

        AT_RISK("AT_RISK"),

        OFF_TRACK("OFF_TRACK"),

        COMPLETE("COMPLETE");

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
            return null;
        }
    }

    private ToEnum to = null;

    public WebhookProjectsV2StatusUpdateEditedChangesStatus from(FromEnum from) {
        this.from = from;
        return this;
    }

    /**
     * Get from
     * @return from
     */
    @Schema(name = "from", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("from")
    public FromEnum getFrom() {
        return from;
    }

    public void setFrom(FromEnum from) {
        this.from = from;
    }

    public WebhookProjectsV2StatusUpdateEditedChangesStatus to(ToEnum to) {
        this.to = to;
        return this;
    }

    /**
     * Get to
     * @return to
     */
    @Schema(name = "to", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        WebhookProjectsV2StatusUpdateEditedChangesStatus webhookProjectsV2StatusUpdateEditedChangesStatus =
                (WebhookProjectsV2StatusUpdateEditedChangesStatus) o;
        return Objects.equals(this.from, webhookProjectsV2StatusUpdateEditedChangesStatus.from)
                && Objects.equals(this.to, webhookProjectsV2StatusUpdateEditedChangesStatus.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookProjectsV2StatusUpdateEditedChangesStatus {\n");
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
