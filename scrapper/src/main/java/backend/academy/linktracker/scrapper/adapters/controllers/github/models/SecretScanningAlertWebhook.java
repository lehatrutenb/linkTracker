package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * SecretScanningAlertWebhook
 */
@JsonTypeName("secret-scanning-alert-webhook")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningAlertWebhook {

    private Long number;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt = null;

    private URI url;

    private URI htmlUrl;

    private URI locationsUrl;

    private SecretScanningAlertResolutionWebhook resolution = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime resolvedAt = null;

    private NullableSimpleUser resolvedBy = null;

    private String resolutionComment = null;

    private String secretType;

    private String secretTypeDisplayName;

    /**
     * The token status as of the latest validity check.
     */
    public enum ValidityEnum {
        ACTIVE("active"),

        INACTIVE("inactive"),

        UNKNOWN("unknown");

        private final String value;

        ValidityEnum(String value) {
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
        public static ValidityEnum fromValue(String value) {
            for (ValidityEnum b : ValidityEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ValidityEnum validity;

    private Boolean pushProtectionBypassed = null;

    private NullableSimpleUser pushProtectionBypassedBy = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime pushProtectionBypassedAt = null;

    private NullableSimpleUser pushProtectionBypassRequestReviewer = null;

    private String pushProtectionBypassRequestReviewerComment = null;

    private String pushProtectionBypassRequestComment = null;

    private URI pushProtectionBypassRequestHtmlUrl = null;

    private Boolean publiclyLeaked = null;

    private Boolean multiRepo = null;

    private NullableSimpleUser assignedTo = null;

    public SecretScanningAlertWebhook number(Long number) {
        this.number = number;
        return this;
    }

    /**
     * The security alert number.
     * @return number
     */
    @Schema(
            name = "number",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The security alert number.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public SecretScanningAlertWebhook createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return createdAt
     */
    @Valid
    @Schema(
            name = "created_at",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public SecretScanningAlertWebhook updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The time that the alert was last updated in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return updatedAt
     */
    @Valid
    @Schema(
            name = "updated_at",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The time that the alert was last updated in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public SecretScanningAlertWebhook url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * The REST API URL of the alert resource.
     * @return url
     */
    @Valid
    @Schema(
            name = "url",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The REST API URL of the alert resource.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public SecretScanningAlertWebhook htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * The GitHub URL of the alert resource.
     * @return htmlUrl
     */
    @Valid
    @Schema(
            name = "html_url",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The GitHub URL of the alert resource.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public SecretScanningAlertWebhook locationsUrl(URI locationsUrl) {
        this.locationsUrl = locationsUrl;
        return this;
    }

    /**
     * The REST API URL of the code locations for this alert.
     * @return locationsUrl
     */
    @Valid
    @Schema(
            name = "locations_url",
            description = "The REST API URL of the code locations for this alert.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("locations_url")
    public URI getLocationsUrl() {
        return locationsUrl;
    }

    public void setLocationsUrl(URI locationsUrl) {
        this.locationsUrl = locationsUrl;
    }

    public SecretScanningAlertWebhook resolution(SecretScanningAlertResolutionWebhook resolution) {
        this.resolution = resolution;
        return this;
    }

    /**
     * Get resolution
     * @return resolution
     */
    @Valid
    @Schema(name = "resolution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("resolution")
    public SecretScanningAlertResolutionWebhook getResolution() {
        return resolution;
    }

    public void setResolution(SecretScanningAlertResolutionWebhook resolution) {
        this.resolution = resolution;
    }

    public SecretScanningAlertWebhook resolvedAt(OffsetDateTime resolvedAt) {
        this.resolvedAt = resolvedAt;
        return this;
    }

    /**
     * The time that the alert was resolved in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return resolvedAt
     */
    @Valid
    @Schema(
            name = "resolved_at",
            description = "The time that the alert was resolved in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("resolved_at")
    public OffsetDateTime getResolvedAt() {
        return resolvedAt;
    }

    public void setResolvedAt(OffsetDateTime resolvedAt) {
        this.resolvedAt = resolvedAt;
    }

    public SecretScanningAlertWebhook resolvedBy(NullableSimpleUser resolvedBy) {
        this.resolvedBy = resolvedBy;
        return this;
    }

    /**
     * Get resolvedBy
     * @return resolvedBy
     */
    @Valid
    @Schema(name = "resolved_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("resolved_by")
    public NullableSimpleUser getResolvedBy() {
        return resolvedBy;
    }

    public void setResolvedBy(NullableSimpleUser resolvedBy) {
        this.resolvedBy = resolvedBy;
    }

    public SecretScanningAlertWebhook resolutionComment(String resolutionComment) {
        this.resolutionComment = resolutionComment;
        return this;
    }

    /**
     * An optional comment to resolve an alert.
     * @return resolutionComment
     */
    @Schema(
            name = "resolution_comment",
            description = "An optional comment to resolve an alert.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("resolution_comment")
    public String getResolutionComment() {
        return resolutionComment;
    }

    public void setResolutionComment(String resolutionComment) {
        this.resolutionComment = resolutionComment;
    }

    public SecretScanningAlertWebhook secretType(String secretType) {
        this.secretType = secretType;
        return this;
    }

    /**
     * The type of secret that secret scanning detected.
     * @return secretType
     */
    @Schema(
            name = "secret_type",
            description = "The type of secret that secret scanning detected.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_type")
    public String getSecretType() {
        return secretType;
    }

    public void setSecretType(String secretType) {
        this.secretType = secretType;
    }

    public SecretScanningAlertWebhook secretTypeDisplayName(String secretTypeDisplayName) {
        this.secretTypeDisplayName = secretTypeDisplayName;
        return this;
    }

    /**
     * User-friendly name for the detected secret, matching the `secret_type`. For a list of built-in patterns, see \"[Supported secret scanning patterns](https://docs.github.com/code-security/secret-scanning/introduction/supported-secret-scanning-patterns#supported-secrets).\"
     * @return secretTypeDisplayName
     */
    @Schema(
            name = "secret_type_display_name",
            description =
                    "User-friendly name for the detected secret, matching the `secret_type`. For a list of built-in patterns, see \"[Supported secret scanning patterns](https://docs.github.com/code-security/secret-scanning/introduction/supported-secret-scanning-patterns#supported-secrets).\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_type_display_name")
    public String getSecretTypeDisplayName() {
        return secretTypeDisplayName;
    }

    public void setSecretTypeDisplayName(String secretTypeDisplayName) {
        this.secretTypeDisplayName = secretTypeDisplayName;
    }

    public SecretScanningAlertWebhook validity(ValidityEnum validity) {
        this.validity = validity;
        return this;
    }

    /**
     * The token status as of the latest validity check.
     * @return validity
     */
    @Schema(
            name = "validity",
            description = "The token status as of the latest validity check.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("validity")
    public ValidityEnum getValidity() {
        return validity;
    }

    public void setValidity(ValidityEnum validity) {
        this.validity = validity;
    }

    public SecretScanningAlertWebhook pushProtectionBypassed(Boolean pushProtectionBypassed) {
        this.pushProtectionBypassed = pushProtectionBypassed;
        return this;
    }

    /**
     * Whether push protection was bypassed for the detected secret.
     * @return pushProtectionBypassed
     */
    @Schema(
            name = "push_protection_bypassed",
            description = "Whether push protection was bypassed for the detected secret.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("push_protection_bypassed")
    public Boolean getPushProtectionBypassed() {
        return pushProtectionBypassed;
    }

    public void setPushProtectionBypassed(Boolean pushProtectionBypassed) {
        this.pushProtectionBypassed = pushProtectionBypassed;
    }

    public SecretScanningAlertWebhook pushProtectionBypassedBy(NullableSimpleUser pushProtectionBypassedBy) {
        this.pushProtectionBypassedBy = pushProtectionBypassedBy;
        return this;
    }

    /**
     * Get pushProtectionBypassedBy
     * @return pushProtectionBypassedBy
     */
    @Valid
    @Schema(name = "push_protection_bypassed_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("push_protection_bypassed_by")
    public NullableSimpleUser getPushProtectionBypassedBy() {
        return pushProtectionBypassedBy;
    }

    public void setPushProtectionBypassedBy(NullableSimpleUser pushProtectionBypassedBy) {
        this.pushProtectionBypassedBy = pushProtectionBypassedBy;
    }

    public SecretScanningAlertWebhook pushProtectionBypassedAt(OffsetDateTime pushProtectionBypassedAt) {
        this.pushProtectionBypassedAt = pushProtectionBypassedAt;
        return this;
    }

    /**
     * The time that push protection was bypassed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return pushProtectionBypassedAt
     */
    @Valid
    @Schema(
            name = "push_protection_bypassed_at",
            description = "The time that push protection was bypassed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("push_protection_bypassed_at")
    public OffsetDateTime getPushProtectionBypassedAt() {
        return pushProtectionBypassedAt;
    }

    public void setPushProtectionBypassedAt(OffsetDateTime pushProtectionBypassedAt) {
        this.pushProtectionBypassedAt = pushProtectionBypassedAt;
    }

    public SecretScanningAlertWebhook pushProtectionBypassRequestReviewer(
            NullableSimpleUser pushProtectionBypassRequestReviewer) {
        this.pushProtectionBypassRequestReviewer = pushProtectionBypassRequestReviewer;
        return this;
    }

    /**
     * Get pushProtectionBypassRequestReviewer
     * @return pushProtectionBypassRequestReviewer
     */
    @Valid
    @Schema(name = "push_protection_bypass_request_reviewer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("push_protection_bypass_request_reviewer")
    public NullableSimpleUser getPushProtectionBypassRequestReviewer() {
        return pushProtectionBypassRequestReviewer;
    }

    public void setPushProtectionBypassRequestReviewer(NullableSimpleUser pushProtectionBypassRequestReviewer) {
        this.pushProtectionBypassRequestReviewer = pushProtectionBypassRequestReviewer;
    }

    public SecretScanningAlertWebhook pushProtectionBypassRequestReviewerComment(
            String pushProtectionBypassRequestReviewerComment) {
        this.pushProtectionBypassRequestReviewerComment = pushProtectionBypassRequestReviewerComment;
        return this;
    }

    /**
     * An optional comment when reviewing a push protection bypass.
     * @return pushProtectionBypassRequestReviewerComment
     */
    @Schema(
            name = "push_protection_bypass_request_reviewer_comment",
            description = "An optional comment when reviewing a push protection bypass.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("push_protection_bypass_request_reviewer_comment")
    public String getPushProtectionBypassRequestReviewerComment() {
        return pushProtectionBypassRequestReviewerComment;
    }

    public void setPushProtectionBypassRequestReviewerComment(String pushProtectionBypassRequestReviewerComment) {
        this.pushProtectionBypassRequestReviewerComment = pushProtectionBypassRequestReviewerComment;
    }

    public SecretScanningAlertWebhook pushProtectionBypassRequestComment(String pushProtectionBypassRequestComment) {
        this.pushProtectionBypassRequestComment = pushProtectionBypassRequestComment;
        return this;
    }

    /**
     * An optional comment when requesting a push protection bypass.
     * @return pushProtectionBypassRequestComment
     */
    @Schema(
            name = "push_protection_bypass_request_comment",
            description = "An optional comment when requesting a push protection bypass.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("push_protection_bypass_request_comment")
    public String getPushProtectionBypassRequestComment() {
        return pushProtectionBypassRequestComment;
    }

    public void setPushProtectionBypassRequestComment(String pushProtectionBypassRequestComment) {
        this.pushProtectionBypassRequestComment = pushProtectionBypassRequestComment;
    }

    public SecretScanningAlertWebhook pushProtectionBypassRequestHtmlUrl(URI pushProtectionBypassRequestHtmlUrl) {
        this.pushProtectionBypassRequestHtmlUrl = pushProtectionBypassRequestHtmlUrl;
        return this;
    }

    /**
     * The URL to a push protection bypass request.
     * @return pushProtectionBypassRequestHtmlUrl
     */
    @Valid
    @Schema(
            name = "push_protection_bypass_request_html_url",
            description = "The URL to a push protection bypass request.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("push_protection_bypass_request_html_url")
    public URI getPushProtectionBypassRequestHtmlUrl() {
        return pushProtectionBypassRequestHtmlUrl;
    }

    public void setPushProtectionBypassRequestHtmlUrl(URI pushProtectionBypassRequestHtmlUrl) {
        this.pushProtectionBypassRequestHtmlUrl = pushProtectionBypassRequestHtmlUrl;
    }

    public SecretScanningAlertWebhook publiclyLeaked(Boolean publiclyLeaked) {
        this.publiclyLeaked = publiclyLeaked;
        return this;
    }

    /**
     * Whether the detected secret was publicly leaked.
     * @return publiclyLeaked
     */
    @Schema(
            name = "publicly_leaked",
            description = "Whether the detected secret was publicly leaked.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("publicly_leaked")
    public Boolean getPubliclyLeaked() {
        return publiclyLeaked;
    }

    public void setPubliclyLeaked(Boolean publiclyLeaked) {
        this.publiclyLeaked = publiclyLeaked;
    }

    public SecretScanningAlertWebhook multiRepo(Boolean multiRepo) {
        this.multiRepo = multiRepo;
        return this;
    }

    /**
     * Whether the detected secret was found in multiple repositories in the same organization or business.
     * @return multiRepo
     */
    @Schema(
            name = "multi_repo",
            description =
                    "Whether the detected secret was found in multiple repositories in the same organization or business.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("multi_repo")
    public Boolean getMultiRepo() {
        return multiRepo;
    }

    public void setMultiRepo(Boolean multiRepo) {
        this.multiRepo = multiRepo;
    }

    public SecretScanningAlertWebhook assignedTo(NullableSimpleUser assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }

    /**
     * Get assignedTo
     * @return assignedTo
     */
    @Valid
    @Schema(name = "assigned_to", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assigned_to")
    public NullableSimpleUser getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(NullableSimpleUser assignedTo) {
        this.assignedTo = assignedTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretScanningAlertWebhook secretScanningAlertWebhook = (SecretScanningAlertWebhook) o;
        return Objects.equals(this.number, secretScanningAlertWebhook.number)
                && Objects.equals(this.createdAt, secretScanningAlertWebhook.createdAt)
                && Objects.equals(this.updatedAt, secretScanningAlertWebhook.updatedAt)
                && Objects.equals(this.url, secretScanningAlertWebhook.url)
                && Objects.equals(this.htmlUrl, secretScanningAlertWebhook.htmlUrl)
                && Objects.equals(this.locationsUrl, secretScanningAlertWebhook.locationsUrl)
                && Objects.equals(this.resolution, secretScanningAlertWebhook.resolution)
                && Objects.equals(this.resolvedAt, secretScanningAlertWebhook.resolvedAt)
                && Objects.equals(this.resolvedBy, secretScanningAlertWebhook.resolvedBy)
                && Objects.equals(this.resolutionComment, secretScanningAlertWebhook.resolutionComment)
                && Objects.equals(this.secretType, secretScanningAlertWebhook.secretType)
                && Objects.equals(this.secretTypeDisplayName, secretScanningAlertWebhook.secretTypeDisplayName)
                && Objects.equals(this.validity, secretScanningAlertWebhook.validity)
                && Objects.equals(this.pushProtectionBypassed, secretScanningAlertWebhook.pushProtectionBypassed)
                && Objects.equals(this.pushProtectionBypassedBy, secretScanningAlertWebhook.pushProtectionBypassedBy)
                && Objects.equals(this.pushProtectionBypassedAt, secretScanningAlertWebhook.pushProtectionBypassedAt)
                && Objects.equals(
                        this.pushProtectionBypassRequestReviewer,
                        secretScanningAlertWebhook.pushProtectionBypassRequestReviewer)
                && Objects.equals(
                        this.pushProtectionBypassRequestReviewerComment,
                        secretScanningAlertWebhook.pushProtectionBypassRequestReviewerComment)
                && Objects.equals(
                        this.pushProtectionBypassRequestComment,
                        secretScanningAlertWebhook.pushProtectionBypassRequestComment)
                && Objects.equals(
                        this.pushProtectionBypassRequestHtmlUrl,
                        secretScanningAlertWebhook.pushProtectionBypassRequestHtmlUrl)
                && Objects.equals(this.publiclyLeaked, secretScanningAlertWebhook.publiclyLeaked)
                && Objects.equals(this.multiRepo, secretScanningAlertWebhook.multiRepo)
                && Objects.equals(this.assignedTo, secretScanningAlertWebhook.assignedTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                number,
                createdAt,
                updatedAt,
                url,
                htmlUrl,
                locationsUrl,
                resolution,
                resolvedAt,
                resolvedBy,
                resolutionComment,
                secretType,
                secretTypeDisplayName,
                validity,
                pushProtectionBypassed,
                pushProtectionBypassedBy,
                pushProtectionBypassedAt,
                pushProtectionBypassRequestReviewer,
                pushProtectionBypassRequestReviewerComment,
                pushProtectionBypassRequestComment,
                pushProtectionBypassRequestHtmlUrl,
                publiclyLeaked,
                multiRepo,
                assignedTo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningAlertWebhook {\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    locationsUrl: ").append(toIndentedString(locationsUrl)).append("\n");
        sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
        sb.append("    resolvedAt: ").append(toIndentedString(resolvedAt)).append("\n");
        sb.append("    resolvedBy: ").append(toIndentedString(resolvedBy)).append("\n");
        sb.append("    resolutionComment: ")
                .append(toIndentedString(resolutionComment))
                .append("\n");
        sb.append("    secretType: ").append(toIndentedString(secretType)).append("\n");
        sb.append("    secretTypeDisplayName: ")
                .append(toIndentedString(secretTypeDisplayName))
                .append("\n");
        sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
        sb.append("    pushProtectionBypassed: ")
                .append(toIndentedString(pushProtectionBypassed))
                .append("\n");
        sb.append("    pushProtectionBypassedBy: ")
                .append(toIndentedString(pushProtectionBypassedBy))
                .append("\n");
        sb.append("    pushProtectionBypassedAt: ")
                .append(toIndentedString(pushProtectionBypassedAt))
                .append("\n");
        sb.append("    pushProtectionBypassRequestReviewer: ")
                .append(toIndentedString(pushProtectionBypassRequestReviewer))
                .append("\n");
        sb.append("    pushProtectionBypassRequestReviewerComment: ")
                .append(toIndentedString(pushProtectionBypassRequestReviewerComment))
                .append("\n");
        sb.append("    pushProtectionBypassRequestComment: ")
                .append(toIndentedString(pushProtectionBypassRequestComment))
                .append("\n");
        sb.append("    pushProtectionBypassRequestHtmlUrl: ")
                .append(toIndentedString(pushProtectionBypassRequestHtmlUrl))
                .append("\n");
        sb.append("    publiclyLeaked: ")
                .append(toIndentedString(publiclyLeaked))
                .append("\n");
        sb.append("    multiRepo: ").append(toIndentedString(multiRepo)).append("\n");
        sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
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
