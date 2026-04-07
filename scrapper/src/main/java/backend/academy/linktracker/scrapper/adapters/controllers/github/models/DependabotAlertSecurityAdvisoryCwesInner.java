package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;

/**
 * A CWE weakness assigned to the advisory.
 */
@Schema(
        name = "dependabot_alert_security_advisory_cwes_inner",
        description = "A CWE weakness assigned to the advisory.")
@JsonTypeName("dependabot_alert_security_advisory_cwes_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DependabotAlertSecurityAdvisoryCwesInner {

    private String cweId;

    private String name;

    public DependabotAlertSecurityAdvisoryCwesInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DependabotAlertSecurityAdvisoryCwesInner(String cweId, String name) {
        this.cweId = cweId;
        this.name = name;
    }

    public DependabotAlertSecurityAdvisoryCwesInner cweId(String cweId) {
        this.cweId = cweId;
        return this;
    }

    /**
     * The unique CWE ID.
     * @return cweId
     */
    @Schema(
            name = "cwe_id",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The unique CWE ID.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("cwe_id")
    public String getCweId() {
        return cweId;
    }

    public void setCweId(String cweId) {
        this.cweId = cweId;
    }

    public DependabotAlertSecurityAdvisoryCwesInner name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The short, plain text name of the CWE.
     * @return name
     */
    @Schema(
            name = "name",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The short, plain text name of the CWE.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DependabotAlertSecurityAdvisoryCwesInner dependabotAlertSecurityAdvisoryCwesInner =
                (DependabotAlertSecurityAdvisoryCwesInner) o;
        return Objects.equals(this.cweId, dependabotAlertSecurityAdvisoryCwesInner.cweId)
                && Objects.equals(this.name, dependabotAlertSecurityAdvisoryCwesInner.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cweId, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependabotAlertSecurityAdvisoryCwesInner {\n");
        sb.append("    cweId: ").append(toIndentedString(cweId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
