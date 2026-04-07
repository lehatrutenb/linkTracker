package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Feature options for secret scanning delegated bypass. This object is only honored when &#x60;security_and_analysis.secret_scanning_delegated_bypass.status&#x60; is set to &#x60;enabled&#x60;. You can send this object in the same request as &#x60;secret_scanning_delegated_bypass&#x60;, or update just the options in a separate request.
 */
@Schema(
        name = "repos_update_request_security_and_analysis_secret_scanning_delegated_bypass_options",
        description =
                "Feature options for secret scanning delegated bypass. This object is only honored when `security_and_analysis.secret_scanning_delegated_bypass.status` is set to `enabled`. You can send this object in the same request as `secret_scanning_delegated_bypass`, or update just the options in a separate request.")
@JsonTypeName("repos_update_request_security_and_analysis_secret_scanning_delegated_bypass_options")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposUpdateRequestSecurityAndAnalysisSecretScanningDelegatedBypassOptions {

    @Valid
    private List<@Valid CodeSecurityCreateConfigurationRequestSecretScanningDelegatedBypassOptionsReviewersInner>
            reviewers = new ArrayList<>();

    public ReposUpdateRequestSecurityAndAnalysisSecretScanningDelegatedBypassOptions reviewers(
            List<@Valid CodeSecurityCreateConfigurationRequestSecretScanningDelegatedBypassOptionsReviewersInner>
                    reviewers) {
        this.reviewers = reviewers;
        return this;
    }

    public ReposUpdateRequestSecurityAndAnalysisSecretScanningDelegatedBypassOptions addReviewersItem(
            CodeSecurityCreateConfigurationRequestSecretScanningDelegatedBypassOptionsReviewersInner reviewersItem) {
        if (this.reviewers == null) {
            this.reviewers = new ArrayList<>();
        }
        this.reviewers.add(reviewersItem);
        return this;
    }

    /**
     * The bypass reviewers for secret scanning delegated bypass. If you omit this field, the existing set of reviewers is unchanged.
     * @return reviewers
     */
    @Valid
    @Schema(
            name = "reviewers",
            description =
                    "The bypass reviewers for secret scanning delegated bypass. If you omit this field, the existing set of reviewers is unchanged.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reviewers")
    public List<@Valid CodeSecurityCreateConfigurationRequestSecretScanningDelegatedBypassOptionsReviewersInner>
            getReviewers() {
        return reviewers;
    }

    public void setReviewers(
            List<@Valid CodeSecurityCreateConfigurationRequestSecretScanningDelegatedBypassOptionsReviewersInner>
                    reviewers) {
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
        ReposUpdateRequestSecurityAndAnalysisSecretScanningDelegatedBypassOptions
                reposUpdateRequestSecurityAndAnalysisSecretScanningDelegatedBypassOptions =
                        (ReposUpdateRequestSecurityAndAnalysisSecretScanningDelegatedBypassOptions) o;
        return Objects.equals(
                this.reviewers, reposUpdateRequestSecurityAndAnalysisSecretScanningDelegatedBypassOptions.reviewers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviewers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposUpdateRequestSecurityAndAnalysisSecretScanningDelegatedBypassOptions {\n");
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
