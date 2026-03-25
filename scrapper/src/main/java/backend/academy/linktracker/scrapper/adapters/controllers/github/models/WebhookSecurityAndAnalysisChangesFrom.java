package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WebhookSecurityAndAnalysisChangesFrom
 */
@JsonTypeName("webhook_security_and_analysis_changes_from")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookSecurityAndAnalysisChangesFrom {

    private SecurityAndAnalysis securityAndAnalysis = null;

    public WebhookSecurityAndAnalysisChangesFrom securityAndAnalysis(SecurityAndAnalysis securityAndAnalysis) {
        this.securityAndAnalysis = securityAndAnalysis;
        return this;
    }

    /**
     * Get securityAndAnalysis
     * @return securityAndAnalysis
     */
    @Valid
    @Schema(name = "security_and_analysis", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("security_and_analysis")
    public SecurityAndAnalysis getSecurityAndAnalysis() {
        return securityAndAnalysis;
    }

    public void setSecurityAndAnalysis(SecurityAndAnalysis securityAndAnalysis) {
        this.securityAndAnalysis = securityAndAnalysis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookSecurityAndAnalysisChangesFrom webhookSecurityAndAnalysisChangesFrom =
                (WebhookSecurityAndAnalysisChangesFrom) o;
        return Objects.equals(this.securityAndAnalysis, webhookSecurityAndAnalysisChangesFrom.securityAndAnalysis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityAndAnalysis);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookSecurityAndAnalysisChangesFrom {\n");
        sb.append("    securityAndAnalysis: ")
                .append(toIndentedString(securityAndAnalysis))
                .append("\n");
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
