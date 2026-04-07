package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookCodeScanningAlertCreatedAlertTool
 */
@JsonTypeName("webhook_code_scanning_alert_created_alert_tool")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookCodeScanningAlertCreatedAlertTool {

    private JsonNullable<String> guid = JsonNullable.<String>undefined();

    private String name;

    private JsonNullable<String> version = JsonNullable.<String>undefined();

    public WebhookCodeScanningAlertCreatedAlertTool() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookCodeScanningAlertCreatedAlertTool(String name, String version) {
        this.name = name;
        this.version = JsonNullable.of(version);
    }

    public WebhookCodeScanningAlertCreatedAlertTool guid(String guid) {
        this.guid = JsonNullable.of(guid);
        return this;
    }

    /**
     * Get guid
     * @return guid
     */
    @Schema(name = "guid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("guid")
    public JsonNullable<String> getGuid() {
        return guid;
    }

    public void setGuid(JsonNullable<String> guid) {
        this.guid = guid;
    }

    public WebhookCodeScanningAlertCreatedAlertTool name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the tool used to generate the code scanning analysis alert.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            description = "The name of the tool used to generate the code scanning analysis alert.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebhookCodeScanningAlertCreatedAlertTool version(String version) {
        this.version = JsonNullable.of(version);
        return this;
    }

    /**
     * The version of the tool used to detect the alert.
     * @return version
     */
    @NotNull
    @Schema(
            name = "version",
            description = "The version of the tool used to detect the alert.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("version")
    public JsonNullable<String> getVersion() {
        return version;
    }

    public void setVersion(JsonNullable<String> version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookCodeScanningAlertCreatedAlertTool webhookCodeScanningAlertCreatedAlertTool =
                (WebhookCodeScanningAlertCreatedAlertTool) o;
        return equalsNullable(this.guid, webhookCodeScanningAlertCreatedAlertTool.guid)
                && Objects.equals(this.name, webhookCodeScanningAlertCreatedAlertTool.name)
                && Objects.equals(this.version, webhookCodeScanningAlertCreatedAlertTool.version);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashCodeNullable(guid), name, version);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookCodeScanningAlertCreatedAlertTool {\n");
        sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
