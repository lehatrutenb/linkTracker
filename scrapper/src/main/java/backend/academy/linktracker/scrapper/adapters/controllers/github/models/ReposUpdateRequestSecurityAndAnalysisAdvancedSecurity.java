package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Use the &#x60;status&#x60; property to enable or disable GitHub Advanced Security for this repository. For more information, see \&quot;[About GitHub Advanced Security](/github/getting-started-with-github/learning-about-github/about-github-advanced-security).\&quot;  For standalone Code Scanning or Secret Protection products, this parameter cannot be used.
 */
@Schema(
        name = "repos_update_request_security_and_analysis_advanced_security",
        description =
                "Use the `status` property to enable or disable GitHub Advanced Security for this repository. For more information, see \"[About GitHub Advanced Security](/github/getting-started-with-github/learning-about-github/about-github-advanced-security).\"  For standalone Code Scanning or Secret Protection products, this parameter cannot be used.")
@JsonTypeName("repos_update_request_security_and_analysis_advanced_security")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposUpdateRequestSecurityAndAnalysisAdvancedSecurity {

    private String status;

    public ReposUpdateRequestSecurityAndAnalysisAdvancedSecurity status(String status) {
        this.status = status;
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
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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
        ReposUpdateRequestSecurityAndAnalysisAdvancedSecurity reposUpdateRequestSecurityAndAnalysisAdvancedSecurity =
                (ReposUpdateRequestSecurityAndAnalysisAdvancedSecurity) o;
        return Objects.equals(this.status, reposUpdateRequestSecurityAndAnalysisAdvancedSecurity.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposUpdateRequestSecurityAndAnalysisAdvancedSecurity {\n");
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
