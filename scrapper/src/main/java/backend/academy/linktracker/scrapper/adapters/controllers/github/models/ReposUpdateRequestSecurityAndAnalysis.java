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
 * Specify which security and analysis features to enable or disable for the repository.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\&quot;  For example, to enable GitHub Advanced Security, use this data in the body of the &#x60;PATCH&#x60; request: &#x60;{ \&quot;security_and_analysis\&quot;: {\&quot;advanced_security\&quot;: { \&quot;status\&quot;: \&quot;enabled\&quot; } } }&#x60;.  You can check which security and analysis features are currently enabled by using a &#x60;GET /repos/{owner}/{repo}&#x60; request.
 */
@Schema(
        name = "repos_update_request_security_and_analysis",
        description =
                "Specify which security and analysis features to enable or disable for the repository.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"  For example, to enable GitHub Advanced Security, use this data in the body of the `PATCH` request: `{ \"security_and_analysis\": {\"advanced_security\": { \"status\": \"enabled\" } } }`.  You can check which security and analysis features are currently enabled by using a `GET /repos/{owner}/{repo}` request.")
@JsonTypeName("repos_update_request_security_and_analysis")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposUpdateRequestSecurityAndAnalysis {

    private ReposUpdateRequestSecurityAndAnalysisAdvancedSecurity advancedSecurity;

    private ReposUpdateRequestSecurityAndAnalysisCodeSecurity codeSecurity;

    private ReposUpdateRequestSecurityAndAnalysisSecretScanning secretScanning;

    private ReposUpdateRequestSecurityAndAnalysisSecretScanningPushProtection secretScanningPushProtection;

    private ReposUpdateRequestSecurityAndAnalysisSecretScanningAiDetection secretScanningAiDetection;

    private ReposUpdateRequestSecurityAndAnalysisSecretScanningNonProviderPatterns secretScanningNonProviderPatterns;

    private ReposUpdateRequestSecurityAndAnalysisSecretScanningDelegatedAlertDismissal
            secretScanningDelegatedAlertDismissal;

    private ReposUpdateRequestSecurityAndAnalysisSecretScanningDelegatedBypass secretScanningDelegatedBypass;

    private ReposUpdateRequestSecurityAndAnalysisSecretScanningDelegatedBypassOptions
            secretScanningDelegatedBypassOptions;

    public ReposUpdateRequestSecurityAndAnalysis advancedSecurity(
            ReposUpdateRequestSecurityAndAnalysisAdvancedSecurity advancedSecurity) {
        this.advancedSecurity = advancedSecurity;
        return this;
    }

    /**
     * Get advancedSecurity
     * @return advancedSecurity
     */
    @Valid
    @Schema(name = "advanced_security", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("advanced_security")
    public ReposUpdateRequestSecurityAndAnalysisAdvancedSecurity getAdvancedSecurity() {
        return advancedSecurity;
    }

    public void setAdvancedSecurity(ReposUpdateRequestSecurityAndAnalysisAdvancedSecurity advancedSecurity) {
        this.advancedSecurity = advancedSecurity;
    }

    public ReposUpdateRequestSecurityAndAnalysis codeSecurity(
            ReposUpdateRequestSecurityAndAnalysisCodeSecurity codeSecurity) {
        this.codeSecurity = codeSecurity;
        return this;
    }

    /**
     * Get codeSecurity
     * @return codeSecurity
     */
    @Valid
    @Schema(name = "code_security", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("code_security")
    public ReposUpdateRequestSecurityAndAnalysisCodeSecurity getCodeSecurity() {
        return codeSecurity;
    }

    public void setCodeSecurity(ReposUpdateRequestSecurityAndAnalysisCodeSecurity codeSecurity) {
        this.codeSecurity = codeSecurity;
    }

    public ReposUpdateRequestSecurityAndAnalysis secretScanning(
            ReposUpdateRequestSecurityAndAnalysisSecretScanning secretScanning) {
        this.secretScanning = secretScanning;
        return this;
    }

    /**
     * Get secretScanning
     * @return secretScanning
     */
    @Valid
    @Schema(name = "secret_scanning", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning")
    public ReposUpdateRequestSecurityAndAnalysisSecretScanning getSecretScanning() {
        return secretScanning;
    }

    public void setSecretScanning(ReposUpdateRequestSecurityAndAnalysisSecretScanning secretScanning) {
        this.secretScanning = secretScanning;
    }

    public ReposUpdateRequestSecurityAndAnalysis secretScanningPushProtection(
            ReposUpdateRequestSecurityAndAnalysisSecretScanningPushProtection secretScanningPushProtection) {
        this.secretScanningPushProtection = secretScanningPushProtection;
        return this;
    }

    /**
     * Get secretScanningPushProtection
     * @return secretScanningPushProtection
     */
    @Valid
    @Schema(name = "secret_scanning_push_protection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_push_protection")
    public ReposUpdateRequestSecurityAndAnalysisSecretScanningPushProtection getSecretScanningPushProtection() {
        return secretScanningPushProtection;
    }

    public void setSecretScanningPushProtection(
            ReposUpdateRequestSecurityAndAnalysisSecretScanningPushProtection secretScanningPushProtection) {
        this.secretScanningPushProtection = secretScanningPushProtection;
    }

    public ReposUpdateRequestSecurityAndAnalysis secretScanningAiDetection(
            ReposUpdateRequestSecurityAndAnalysisSecretScanningAiDetection secretScanningAiDetection) {
        this.secretScanningAiDetection = secretScanningAiDetection;
        return this;
    }

    /**
     * Get secretScanningAiDetection
     * @return secretScanningAiDetection
     */
    @Valid
    @Schema(name = "secret_scanning_ai_detection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_ai_detection")
    public ReposUpdateRequestSecurityAndAnalysisSecretScanningAiDetection getSecretScanningAiDetection() {
        return secretScanningAiDetection;
    }

    public void setSecretScanningAiDetection(
            ReposUpdateRequestSecurityAndAnalysisSecretScanningAiDetection secretScanningAiDetection) {
        this.secretScanningAiDetection = secretScanningAiDetection;
    }

    public ReposUpdateRequestSecurityAndAnalysis secretScanningNonProviderPatterns(
            ReposUpdateRequestSecurityAndAnalysisSecretScanningNonProviderPatterns secretScanningNonProviderPatterns) {
        this.secretScanningNonProviderPatterns = secretScanningNonProviderPatterns;
        return this;
    }

    /**
     * Get secretScanningNonProviderPatterns
     * @return secretScanningNonProviderPatterns
     */
    @Valid
    @Schema(name = "secret_scanning_non_provider_patterns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_non_provider_patterns")
    public ReposUpdateRequestSecurityAndAnalysisSecretScanningNonProviderPatterns
            getSecretScanningNonProviderPatterns() {
        return secretScanningNonProviderPatterns;
    }

    public void setSecretScanningNonProviderPatterns(
            ReposUpdateRequestSecurityAndAnalysisSecretScanningNonProviderPatterns secretScanningNonProviderPatterns) {
        this.secretScanningNonProviderPatterns = secretScanningNonProviderPatterns;
    }

    public ReposUpdateRequestSecurityAndAnalysis secretScanningDelegatedAlertDismissal(
            ReposUpdateRequestSecurityAndAnalysisSecretScanningDelegatedAlertDismissal
                    secretScanningDelegatedAlertDismissal) {
        this.secretScanningDelegatedAlertDismissal = secretScanningDelegatedAlertDismissal;
        return this;
    }

    /**
     * Get secretScanningDelegatedAlertDismissal
     * @return secretScanningDelegatedAlertDismissal
     */
    @Valid
    @Schema(name = "secret_scanning_delegated_alert_dismissal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_delegated_alert_dismissal")
    public ReposUpdateRequestSecurityAndAnalysisSecretScanningDelegatedAlertDismissal
            getSecretScanningDelegatedAlertDismissal() {
        return secretScanningDelegatedAlertDismissal;
    }

    public void setSecretScanningDelegatedAlertDismissal(
            ReposUpdateRequestSecurityAndAnalysisSecretScanningDelegatedAlertDismissal
                    secretScanningDelegatedAlertDismissal) {
        this.secretScanningDelegatedAlertDismissal = secretScanningDelegatedAlertDismissal;
    }

    public ReposUpdateRequestSecurityAndAnalysis secretScanningDelegatedBypass(
            ReposUpdateRequestSecurityAndAnalysisSecretScanningDelegatedBypass secretScanningDelegatedBypass) {
        this.secretScanningDelegatedBypass = secretScanningDelegatedBypass;
        return this;
    }

    /**
     * Get secretScanningDelegatedBypass
     * @return secretScanningDelegatedBypass
     */
    @Valid
    @Schema(name = "secret_scanning_delegated_bypass", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_delegated_bypass")
    public ReposUpdateRequestSecurityAndAnalysisSecretScanningDelegatedBypass getSecretScanningDelegatedBypass() {
        return secretScanningDelegatedBypass;
    }

    public void setSecretScanningDelegatedBypass(
            ReposUpdateRequestSecurityAndAnalysisSecretScanningDelegatedBypass secretScanningDelegatedBypass) {
        this.secretScanningDelegatedBypass = secretScanningDelegatedBypass;
    }

    public ReposUpdateRequestSecurityAndAnalysis secretScanningDelegatedBypassOptions(
            ReposUpdateRequestSecurityAndAnalysisSecretScanningDelegatedBypassOptions
                    secretScanningDelegatedBypassOptions) {
        this.secretScanningDelegatedBypassOptions = secretScanningDelegatedBypassOptions;
        return this;
    }

    /**
     * Get secretScanningDelegatedBypassOptions
     * @return secretScanningDelegatedBypassOptions
     */
    @Valid
    @Schema(name = "secret_scanning_delegated_bypass_options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_delegated_bypass_options")
    public ReposUpdateRequestSecurityAndAnalysisSecretScanningDelegatedBypassOptions
            getSecretScanningDelegatedBypassOptions() {
        return secretScanningDelegatedBypassOptions;
    }

    public void setSecretScanningDelegatedBypassOptions(
            ReposUpdateRequestSecurityAndAnalysisSecretScanningDelegatedBypassOptions
                    secretScanningDelegatedBypassOptions) {
        this.secretScanningDelegatedBypassOptions = secretScanningDelegatedBypassOptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposUpdateRequestSecurityAndAnalysis reposUpdateRequestSecurityAndAnalysis =
                (ReposUpdateRequestSecurityAndAnalysis) o;
        return Objects.equals(this.advancedSecurity, reposUpdateRequestSecurityAndAnalysis.advancedSecurity)
                && Objects.equals(this.codeSecurity, reposUpdateRequestSecurityAndAnalysis.codeSecurity)
                && Objects.equals(this.secretScanning, reposUpdateRequestSecurityAndAnalysis.secretScanning)
                && Objects.equals(
                        this.secretScanningPushProtection,
                        reposUpdateRequestSecurityAndAnalysis.secretScanningPushProtection)
                && Objects.equals(
                        this.secretScanningAiDetection, reposUpdateRequestSecurityAndAnalysis.secretScanningAiDetection)
                && Objects.equals(
                        this.secretScanningNonProviderPatterns,
                        reposUpdateRequestSecurityAndAnalysis.secretScanningNonProviderPatterns)
                && Objects.equals(
                        this.secretScanningDelegatedAlertDismissal,
                        reposUpdateRequestSecurityAndAnalysis.secretScanningDelegatedAlertDismissal)
                && Objects.equals(
                        this.secretScanningDelegatedBypass,
                        reposUpdateRequestSecurityAndAnalysis.secretScanningDelegatedBypass)
                && Objects.equals(
                        this.secretScanningDelegatedBypassOptions,
                        reposUpdateRequestSecurityAndAnalysis.secretScanningDelegatedBypassOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                advancedSecurity,
                codeSecurity,
                secretScanning,
                secretScanningPushProtection,
                secretScanningAiDetection,
                secretScanningNonProviderPatterns,
                secretScanningDelegatedAlertDismissal,
                secretScanningDelegatedBypass,
                secretScanningDelegatedBypassOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposUpdateRequestSecurityAndAnalysis {\n");
        sb.append("    advancedSecurity: ")
                .append(toIndentedString(advancedSecurity))
                .append("\n");
        sb.append("    codeSecurity: ").append(toIndentedString(codeSecurity)).append("\n");
        sb.append("    secretScanning: ")
                .append(toIndentedString(secretScanning))
                .append("\n");
        sb.append("    secretScanningPushProtection: ")
                .append(toIndentedString(secretScanningPushProtection))
                .append("\n");
        sb.append("    secretScanningAiDetection: ")
                .append(toIndentedString(secretScanningAiDetection))
                .append("\n");
        sb.append("    secretScanningNonProviderPatterns: ")
                .append(toIndentedString(secretScanningNonProviderPatterns))
                .append("\n");
        sb.append("    secretScanningDelegatedAlertDismissal: ")
                .append(toIndentedString(secretScanningDelegatedAlertDismissal))
                .append("\n");
        sb.append("    secretScanningDelegatedBypass: ")
                .append(toIndentedString(secretScanningDelegatedBypass))
                .append("\n");
        sb.append("    secretScanningDelegatedBypassOptions: ")
                .append(toIndentedString(secretScanningDelegatedBypassOptions))
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
