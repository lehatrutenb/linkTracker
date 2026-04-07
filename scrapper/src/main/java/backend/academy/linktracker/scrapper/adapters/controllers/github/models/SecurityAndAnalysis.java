package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * SecurityAndAnalysis
 */
@JsonTypeName("security-and-analysis")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecurityAndAnalysis {

    private Optional<SecurityAndAnalysisAdvancedSecurity> advancedSecurity = Optional.empty();

    private Optional<SecurityAndAnalysisCodeSecurity> codeSecurity = Optional.empty();

    private Optional<SecurityAndAnalysisDependabotSecurityUpdates> dependabotSecurityUpdates = Optional.empty();

    private Optional<SecurityAndAnalysisCodeSecurity> secretScanning = Optional.empty();

    private Optional<SecurityAndAnalysisCodeSecurity> secretScanningPushProtection = Optional.empty();

    private Optional<SecurityAndAnalysisCodeSecurity> secretScanningNonProviderPatterns = Optional.empty();

    private Optional<SecurityAndAnalysisCodeSecurity> secretScanningAiDetection = Optional.empty();

    private Optional<SecurityAndAnalysisCodeSecurity> secretScanningDelegatedAlertDismissal = Optional.empty();

    private Optional<SecurityAndAnalysisCodeSecurity> secretScanningDelegatedBypass = Optional.empty();

    private Optional<SecurityAndAnalysisSecretScanningDelegatedBypassOptions> secretScanningDelegatedBypassOptions =
            Optional.empty();

    public SecurityAndAnalysis advancedSecurity(SecurityAndAnalysisAdvancedSecurity advancedSecurity) {
        this.advancedSecurity = Optional.ofNullable(advancedSecurity);
        return this;
    }

    /**
     * Get advancedSecurity
     * @return advancedSecurity
     */
    @Valid
    @Schema(name = "advanced_security", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("advanced_security")
    public Optional<SecurityAndAnalysisAdvancedSecurity> getAdvancedSecurity() {
        return advancedSecurity;
    }

    public void setAdvancedSecurity(Optional<SecurityAndAnalysisAdvancedSecurity> advancedSecurity) {
        this.advancedSecurity = advancedSecurity;
    }

    public SecurityAndAnalysis codeSecurity(SecurityAndAnalysisCodeSecurity codeSecurity) {
        this.codeSecurity = Optional.ofNullable(codeSecurity);
        return this;
    }

    /**
     * Get codeSecurity
     * @return codeSecurity
     */
    @Valid
    @Schema(name = "code_security", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("code_security")
    public Optional<SecurityAndAnalysisCodeSecurity> getCodeSecurity() {
        return codeSecurity;
    }

    public void setCodeSecurity(Optional<SecurityAndAnalysisCodeSecurity> codeSecurity) {
        this.codeSecurity = codeSecurity;
    }

    public SecurityAndAnalysis dependabotSecurityUpdates(
            SecurityAndAnalysisDependabotSecurityUpdates dependabotSecurityUpdates) {
        this.dependabotSecurityUpdates = Optional.ofNullable(dependabotSecurityUpdates);
        return this;
    }

    /**
     * Get dependabotSecurityUpdates
     * @return dependabotSecurityUpdates
     */
    @Valid
    @Schema(name = "dependabot_security_updates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dependabot_security_updates")
    public Optional<SecurityAndAnalysisDependabotSecurityUpdates> getDependabotSecurityUpdates() {
        return dependabotSecurityUpdates;
    }

    public void setDependabotSecurityUpdates(
            Optional<SecurityAndAnalysisDependabotSecurityUpdates> dependabotSecurityUpdates) {
        this.dependabotSecurityUpdates = dependabotSecurityUpdates;
    }

    public SecurityAndAnalysis secretScanning(SecurityAndAnalysisCodeSecurity secretScanning) {
        this.secretScanning = Optional.ofNullable(secretScanning);
        return this;
    }

    /**
     * Get secretScanning
     * @return secretScanning
     */
    @Valid
    @Schema(name = "secret_scanning", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning")
    public Optional<SecurityAndAnalysisCodeSecurity> getSecretScanning() {
        return secretScanning;
    }

    public void setSecretScanning(Optional<SecurityAndAnalysisCodeSecurity> secretScanning) {
        this.secretScanning = secretScanning;
    }

    public SecurityAndAnalysis secretScanningPushProtection(
            SecurityAndAnalysisCodeSecurity secretScanningPushProtection) {
        this.secretScanningPushProtection = Optional.ofNullable(secretScanningPushProtection);
        return this;
    }

    /**
     * Get secretScanningPushProtection
     * @return secretScanningPushProtection
     */
    @Valid
    @Schema(name = "secret_scanning_push_protection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_push_protection")
    public Optional<SecurityAndAnalysisCodeSecurity> getSecretScanningPushProtection() {
        return secretScanningPushProtection;
    }

    public void setSecretScanningPushProtection(
            Optional<SecurityAndAnalysisCodeSecurity> secretScanningPushProtection) {
        this.secretScanningPushProtection = secretScanningPushProtection;
    }

    public SecurityAndAnalysis secretScanningNonProviderPatterns(
            SecurityAndAnalysisCodeSecurity secretScanningNonProviderPatterns) {
        this.secretScanningNonProviderPatterns = Optional.ofNullable(secretScanningNonProviderPatterns);
        return this;
    }

    /**
     * Get secretScanningNonProviderPatterns
     * @return secretScanningNonProviderPatterns
     */
    @Valid
    @Schema(name = "secret_scanning_non_provider_patterns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_non_provider_patterns")
    public Optional<SecurityAndAnalysisCodeSecurity> getSecretScanningNonProviderPatterns() {
        return secretScanningNonProviderPatterns;
    }

    public void setSecretScanningNonProviderPatterns(
            Optional<SecurityAndAnalysisCodeSecurity> secretScanningNonProviderPatterns) {
        this.secretScanningNonProviderPatterns = secretScanningNonProviderPatterns;
    }

    public SecurityAndAnalysis secretScanningAiDetection(SecurityAndAnalysisCodeSecurity secretScanningAiDetection) {
        this.secretScanningAiDetection = Optional.ofNullable(secretScanningAiDetection);
        return this;
    }

    /**
     * Get secretScanningAiDetection
     * @return secretScanningAiDetection
     */
    @Valid
    @Schema(name = "secret_scanning_ai_detection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_ai_detection")
    public Optional<SecurityAndAnalysisCodeSecurity> getSecretScanningAiDetection() {
        return secretScanningAiDetection;
    }

    public void setSecretScanningAiDetection(Optional<SecurityAndAnalysisCodeSecurity> secretScanningAiDetection) {
        this.secretScanningAiDetection = secretScanningAiDetection;
    }

    public SecurityAndAnalysis secretScanningDelegatedAlertDismissal(
            SecurityAndAnalysisCodeSecurity secretScanningDelegatedAlertDismissal) {
        this.secretScanningDelegatedAlertDismissal = Optional.ofNullable(secretScanningDelegatedAlertDismissal);
        return this;
    }

    /**
     * Get secretScanningDelegatedAlertDismissal
     * @return secretScanningDelegatedAlertDismissal
     */
    @Valid
    @Schema(name = "secret_scanning_delegated_alert_dismissal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_delegated_alert_dismissal")
    public Optional<SecurityAndAnalysisCodeSecurity> getSecretScanningDelegatedAlertDismissal() {
        return secretScanningDelegatedAlertDismissal;
    }

    public void setSecretScanningDelegatedAlertDismissal(
            Optional<SecurityAndAnalysisCodeSecurity> secretScanningDelegatedAlertDismissal) {
        this.secretScanningDelegatedAlertDismissal = secretScanningDelegatedAlertDismissal;
    }

    public SecurityAndAnalysis secretScanningDelegatedBypass(
            SecurityAndAnalysisCodeSecurity secretScanningDelegatedBypass) {
        this.secretScanningDelegatedBypass = Optional.ofNullable(secretScanningDelegatedBypass);
        return this;
    }

    /**
     * Get secretScanningDelegatedBypass
     * @return secretScanningDelegatedBypass
     */
    @Valid
    @Schema(name = "secret_scanning_delegated_bypass", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_delegated_bypass")
    public Optional<SecurityAndAnalysisCodeSecurity> getSecretScanningDelegatedBypass() {
        return secretScanningDelegatedBypass;
    }

    public void setSecretScanningDelegatedBypass(
            Optional<SecurityAndAnalysisCodeSecurity> secretScanningDelegatedBypass) {
        this.secretScanningDelegatedBypass = secretScanningDelegatedBypass;
    }

    public SecurityAndAnalysis secretScanningDelegatedBypassOptions(
            SecurityAndAnalysisSecretScanningDelegatedBypassOptions secretScanningDelegatedBypassOptions) {
        this.secretScanningDelegatedBypassOptions = Optional.ofNullable(secretScanningDelegatedBypassOptions);
        return this;
    }

    /**
     * Get secretScanningDelegatedBypassOptions
     * @return secretScanningDelegatedBypassOptions
     */
    @Valid
    @Schema(name = "secret_scanning_delegated_bypass_options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_delegated_bypass_options")
    public Optional<SecurityAndAnalysisSecretScanningDelegatedBypassOptions> getSecretScanningDelegatedBypassOptions() {
        return secretScanningDelegatedBypassOptions;
    }

    public void setSecretScanningDelegatedBypassOptions(
            Optional<SecurityAndAnalysisSecretScanningDelegatedBypassOptions> secretScanningDelegatedBypassOptions) {
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
        SecurityAndAnalysis securityAndAnalysis = (SecurityAndAnalysis) o;
        return Objects.equals(this.advancedSecurity, securityAndAnalysis.advancedSecurity)
                && Objects.equals(this.codeSecurity, securityAndAnalysis.codeSecurity)
                && Objects.equals(this.dependabotSecurityUpdates, securityAndAnalysis.dependabotSecurityUpdates)
                && Objects.equals(this.secretScanning, securityAndAnalysis.secretScanning)
                && Objects.equals(this.secretScanningPushProtection, securityAndAnalysis.secretScanningPushProtection)
                && Objects.equals(
                        this.secretScanningNonProviderPatterns, securityAndAnalysis.secretScanningNonProviderPatterns)
                && Objects.equals(this.secretScanningAiDetection, securityAndAnalysis.secretScanningAiDetection)
                && Objects.equals(
                        this.secretScanningDelegatedAlertDismissal,
                        securityAndAnalysis.secretScanningDelegatedAlertDismissal)
                && Objects.equals(this.secretScanningDelegatedBypass, securityAndAnalysis.secretScanningDelegatedBypass)
                && Objects.equals(
                        this.secretScanningDelegatedBypassOptions,
                        securityAndAnalysis.secretScanningDelegatedBypassOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                advancedSecurity,
                codeSecurity,
                dependabotSecurityUpdates,
                secretScanning,
                secretScanningPushProtection,
                secretScanningNonProviderPatterns,
                secretScanningAiDetection,
                secretScanningDelegatedAlertDismissal,
                secretScanningDelegatedBypass,
                secretScanningDelegatedBypassOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityAndAnalysis {\n");
        sb.append("    advancedSecurity: ")
                .append(toIndentedString(advancedSecurity))
                .append("\n");
        sb.append("    codeSecurity: ").append(toIndentedString(codeSecurity)).append("\n");
        sb.append("    dependabotSecurityUpdates: ")
                .append(toIndentedString(dependabotSecurityUpdates))
                .append("\n");
        sb.append("    secretScanning: ")
                .append(toIndentedString(secretScanning))
                .append("\n");
        sb.append("    secretScanningPushProtection: ")
                .append(toIndentedString(secretScanningPushProtection))
                .append("\n");
        sb.append("    secretScanningNonProviderPatterns: ")
                .append(toIndentedString(secretScanningNonProviderPatterns))
                .append("\n");
        sb.append("    secretScanningAiDetection: ")
                .append(toIndentedString(secretScanningAiDetection))
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
