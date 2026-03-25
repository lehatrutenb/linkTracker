package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Feature options for secret scanning delegated bypass
 */
@Schema(
        name = "code_security_configuration_secret_scanning_delegated_bypass_options",
        description = "Feature options for secret scanning delegated bypass")
@JsonTypeName("code_security_configuration_secret_scanning_delegated_bypass_options")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeSecurityConfigurationSecretScanningDelegatedBypassOptions {

    @Valid
    private List<@Valid CodeSecurityConfigurationSecretScanningDelegatedBypassOptionsReviewersInner> reviewers =
            new ArrayList<>();

    public CodeSecurityConfigurationSecretScanningDelegatedBypassOptions reviewers(
            List<@Valid CodeSecurityConfigurationSecretScanningDelegatedBypassOptionsReviewersInner> reviewers) {
        this.reviewers = reviewers;
        return this;
    }

    public CodeSecurityConfigurationSecretScanningDelegatedBypassOptions addReviewersItem(
            CodeSecurityConfigurationSecretScanningDelegatedBypassOptionsReviewersInner reviewersItem) {
        if (this.reviewers == null) {
            this.reviewers = new ArrayList<>();
        }
        this.reviewers.add(reviewersItem);
        return this;
    }

    /**
     * The bypass reviewers for secret scanning delegated bypass
     * @return reviewers
     */
    @Valid
    @Schema(
            name = "reviewers",
            description = "The bypass reviewers for secret scanning delegated bypass",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reviewers")
    public List<@Valid CodeSecurityConfigurationSecretScanningDelegatedBypassOptionsReviewersInner> getReviewers() {
        return reviewers;
    }

    public void setReviewers(
            List<@Valid CodeSecurityConfigurationSecretScanningDelegatedBypassOptionsReviewersInner> reviewers) {
        this.reviewers = reviewers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeSecurityConfigurationSecretScanningDelegatedBypassOptions
                codeSecurityConfigurationSecretScanningDelegatedBypassOptions =
                        (CodeSecurityConfigurationSecretScanningDelegatedBypassOptions) o;
        return Objects.equals(this.reviewers, codeSecurityConfigurationSecretScanningDelegatedBypassOptions.reviewers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviewers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeSecurityConfigurationSecretScanningDelegatedBypassOptions {\n");
        sb.append("    reviewers: ").append(toIndentedString(reviewers)).append("\n");
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
