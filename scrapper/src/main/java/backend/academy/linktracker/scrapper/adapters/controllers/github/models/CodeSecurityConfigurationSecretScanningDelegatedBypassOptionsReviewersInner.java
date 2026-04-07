package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * CodeSecurityConfigurationSecretScanningDelegatedBypassOptionsReviewersInner
 */
@JsonTypeName("code_security_configuration_secret_scanning_delegated_bypass_options_reviewers_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeSecurityConfigurationSecretScanningDelegatedBypassOptionsReviewersInner {

    private Long reviewerId;

    /**
     * The type of the bypass reviewer
     */
    public enum ReviewerTypeEnum {
        TEAM("TEAM"),

        ROLE("ROLE");

        private final String value;

        ReviewerTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ReviewerTypeEnum fromValue(String value) {
            for (ReviewerTypeEnum b : ReviewerTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ReviewerTypeEnum reviewerType;

    private Optional<Long> securityConfigurationId = Optional.empty();

    public CodeSecurityConfigurationSecretScanningDelegatedBypassOptionsReviewersInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodeSecurityConfigurationSecretScanningDelegatedBypassOptionsReviewersInner(
            Long reviewerId, ReviewerTypeEnum reviewerType) {
        this.reviewerId = reviewerId;
        this.reviewerType = reviewerType;
    }

    public CodeSecurityConfigurationSecretScanningDelegatedBypassOptionsReviewersInner reviewerId(Long reviewerId) {
        this.reviewerId = reviewerId;
        return this;
    }

    /**
     * The ID of the team or role selected as a bypass reviewer
     * @return reviewerId
     */
    @NotNull
    @Schema(
            name = "reviewer_id",
            description = "The ID of the team or role selected as a bypass reviewer",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("reviewer_id")
    public Long getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(Long reviewerId) {
        this.reviewerId = reviewerId;
    }

    public CodeSecurityConfigurationSecretScanningDelegatedBypassOptionsReviewersInner reviewerType(
            ReviewerTypeEnum reviewerType) {
        this.reviewerType = reviewerType;
        return this;
    }

    /**
     * The type of the bypass reviewer
     * @return reviewerType
     */
    @NotNull
    @Schema(
            name = "reviewer_type",
            description = "The type of the bypass reviewer",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("reviewer_type")
    public ReviewerTypeEnum getReviewerType() {
        return reviewerType;
    }

    public void setReviewerType(ReviewerTypeEnum reviewerType) {
        this.reviewerType = reviewerType;
    }

    public CodeSecurityConfigurationSecretScanningDelegatedBypassOptionsReviewersInner securityConfigurationId(
            Long securityConfigurationId) {
        this.securityConfigurationId = Optional.ofNullable(securityConfigurationId);
        return this;
    }

    /**
     * The ID of the security configuration associated with this bypass reviewer
     * @return securityConfigurationId
     */
    @Schema(
            name = "security_configuration_id",
            description = "The ID of the security configuration associated with this bypass reviewer",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("security_configuration_id")
    public Optional<Long> getSecurityConfigurationId() {
        return securityConfigurationId;
    }

    public void setSecurityConfigurationId(Optional<Long> securityConfigurationId) {
        this.securityConfigurationId = securityConfigurationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeSecurityConfigurationSecretScanningDelegatedBypassOptionsReviewersInner
                codeSecurityConfigurationSecretScanningDelegatedBypassOptionsReviewersInner =
                        (CodeSecurityConfigurationSecretScanningDelegatedBypassOptionsReviewersInner) o;
        return Objects.equals(
                        this.reviewerId,
                        codeSecurityConfigurationSecretScanningDelegatedBypassOptionsReviewersInner.reviewerId)
                && Objects.equals(
                        this.reviewerType,
                        codeSecurityConfigurationSecretScanningDelegatedBypassOptionsReviewersInner.reviewerType)
                && Objects.equals(
                        this.securityConfigurationId,
                        codeSecurityConfigurationSecretScanningDelegatedBypassOptionsReviewersInner
                                .securityConfigurationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviewerId, reviewerType, securityConfigurationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeSecurityConfigurationSecretScanningDelegatedBypassOptionsReviewersInner {\n");
        sb.append("    reviewerId: ").append(toIndentedString(reviewerId)).append("\n");
        sb.append("    reviewerType: ").append(toIndentedString(reviewerType)).append("\n");
        sb.append("    securityConfigurationId: ")
                .append(toIndentedString(securityConfigurationId))
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
