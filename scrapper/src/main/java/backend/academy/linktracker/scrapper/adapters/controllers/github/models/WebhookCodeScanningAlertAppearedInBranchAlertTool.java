package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WebhookCodeScanningAlertAppearedInBranchAlertTool
 */
@JsonTypeName("webhook_code_scanning_alert_appeared_in_branch_alert_tool")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookCodeScanningAlertAppearedInBranchAlertTool {

    private String name;

    private String version = null;

    public WebhookCodeScanningAlertAppearedInBranchAlertTool() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookCodeScanningAlertAppearedInBranchAlertTool(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public WebhookCodeScanningAlertAppearedInBranchAlertTool name(String name) {
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

    public WebhookCodeScanningAlertAppearedInBranchAlertTool version(String version) {
        this.version = version;
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
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
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
        WebhookCodeScanningAlertAppearedInBranchAlertTool webhookCodeScanningAlertAppearedInBranchAlertTool =
                (WebhookCodeScanningAlertAppearedInBranchAlertTool) o;
        return Objects.equals(this.name, webhookCodeScanningAlertAppearedInBranchAlertTool.name)
                && Objects.equals(this.version, webhookCodeScanningAlertAppearedInBranchAlertTool.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookCodeScanningAlertAppearedInBranchAlertTool {\n");
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
