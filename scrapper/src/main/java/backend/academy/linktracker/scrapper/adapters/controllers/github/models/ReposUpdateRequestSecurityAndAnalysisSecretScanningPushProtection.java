package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * Use the &#x60;status&#x60; property to enable or disable secret scanning push protection for this repository. For more information, see \&quot;[Protecting pushes with secret scanning](/code-security/secret-scanning/protecting-pushes-with-secret-scanning).\&quot;
 */
@Schema(
        name = "repos_update_request_security_and_analysis_secret_scanning_push_protection",
        description =
                "Use the `status` property to enable or disable secret scanning push protection for this repository. For more information, see \"[Protecting pushes with secret scanning](/code-security/secret-scanning/protecting-pushes-with-secret-scanning).\"")
@JsonTypeName("repos_update_request_security_and_analysis_secret_scanning_push_protection")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposUpdateRequestSecurityAndAnalysisSecretScanningPushProtection {

    private Optional<String> status = Optional.empty();

    public ReposUpdateRequestSecurityAndAnalysisSecretScanningPushProtection status(String status) {
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Can be `enabled` or `disabled`.
     * @return status
     */
    @Schema(
            name = "status",
            description = "Can be `enabled` or `disabled`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("status")
    public Optional<String> getStatus() {
        return status;
    }

    public void setStatus(Optional<String> status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposUpdateRequestSecurityAndAnalysisSecretScanningPushProtection
                reposUpdateRequestSecurityAndAnalysisSecretScanningPushProtection =
                        (ReposUpdateRequestSecurityAndAnalysisSecretScanningPushProtection) o;
        return Objects.equals(this.status, reposUpdateRequestSecurityAndAnalysisSecretScanningPushProtection.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposUpdateRequestSecurityAndAnalysisSecretScanningPushProtection {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
