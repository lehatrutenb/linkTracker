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
 * SecretScanningAlert
 */
@JsonTypeName("secret-scanning-alert")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningAlert {

    private Long number;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt = null;

    private URI url;

    private URI htmlUrl;

    private URI locationsUrl;

    private SecretScanningAlertState state;

    private SecretScanningAlertResolution resolution = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime resolvedAt = null;

    private NullableSimpleUser resolvedBy = null;

    private String resolutionComment = null;

    private String secretType;

    private String secretTypeDisplayName;

    private String secret;

    private Boolean pushProtectionBypassed = null;

    private NullableSimpleUser pushProtectionBypassedBy = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime pushProtectionBypassedAt = null;

    private NullableSimpleUser pushProtectionBypassRequestReviewer = null;

    private String pushProtectionBypassRequestReviewerComment = null;

    private String pushProtectionBypassRequestComment = null;

    private URI pushProtectionBypassRequestHtmlUrl = null;

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

    private Boolean publiclyLeaked = null;

    private Boolean multiRepo = null;

    private Boolean isBase64Encoded = null;

    private NullableSecretScanningFirstDetectedLocation firstLocationDetected = null;

    private Boolean hasMoreLocations;

    private NullableSimpleUser assignedTo = null;

    public SecretScanningAlert number(Long number) {
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

    public SecretScanningAlert createdAt(OffsetDateTime createdAt) {
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

    public SecretScanningAlert updatedAt(OffsetDateTime updatedAt) {
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

    public SecretScanningAlert url(URI url) {
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

    public SecretScanningAlert htmlUrl(URI htmlUrl) {
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

    public SecretScanningAlert locationsUrl(URI locationsUrl) {
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

    public SecretScanningAlert state(SecretScanningAlertState state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @Valid
    @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state")
    public SecretScanningAlertState getState() {
        return state;
    }

    public void setState(SecretScanningAlertState state) {
        this.state = state;
    }

    public SecretScanningAlert resolution(SecretScanningAlertResolution resolution) {
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
    public SecretScanningAlertResolution getResolution() {
        return resolution;
    }

    public void setResolution(SecretScanningAlertResolution resolution) {
        this.resolution = resolution;
    }

    public SecretScanningAlert resolvedAt(OffsetDateTime resolvedAt) {
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

    public SecretScanningAlert resolvedBy(NullableSimpleUser resolvedBy) {
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

    public SecretScanningAlert resolutionComment(String resolutionComment) {
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

    public SecretScanningAlert secretType(String secretType) {
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

    public SecretScanningAlert secretTypeDisplayName(String secretTypeDisplayName) {
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

    public SecretScanningAlert secret(String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * The secret that was detected.
     * @return secret
     */
    @Schema(
            name = "secret",
            description = "The secret that was detected.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret")
    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public SecretScanningAlert pushProtectionBypassed(Boolean pushProtectionBypassed) {
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

    public SecretScanningAlert pushProtectionBypassedBy(NullableSimpleUser pushProtectionBypassedBy) {
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

    public SecretScanningAlert pushProtectionBypassedAt(OffsetDateTime pushProtectionBypassedAt) {
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

    public SecretScanningAlert pushProtectionBypassRequestReviewer(
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

    public SecretScanningAlert pushProtectionBypassRequestReviewerComment(
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

    public SecretScanningAlert pushProtectionBypassRequestComment(String pushProtectionBypassRequestComment) {
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

    public SecretScanningAlert pushProtectionBypassRequestHtmlUrl(URI pushProtectionBypassRequestHtmlUrl) {
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

    public SecretScanningAlert validity(ValidityEnum validity) {
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

    public SecretScanningAlert publiclyLeaked(Boolean publiclyLeaked) {
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

    public SecretScanningAlert multiRepo(Boolean multiRepo) {
        this.multiRepo = multiRepo;
        return this;
    }

    /**
     * Whether the detected secret was found in multiple repositories under the same organization or enterprise.
     * @return multiRepo
     */
    @Schema(
            name = "multi_repo",
            description =
                    "Whether the detected secret was found in multiple repositories under the same organization or enterprise.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("multi_repo")
    public Boolean getMultiRepo() {
        return multiRepo;
    }

    public void setMultiRepo(Boolean multiRepo) {
        this.multiRepo = multiRepo;
    }

    public SecretScanningAlert isBase64Encoded(Boolean isBase64Encoded) {
        this.isBase64Encoded = isBase64Encoded;
        return this;
    }

    /**
     * A boolean value representing whether or not alert is base64 encoded
     * @return isBase64Encoded
     */
    @Schema(
            name = "is_base64_encoded",
            description = "A boolean value representing whether or not alert is base64 encoded",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_base64_encoded")
    public Boolean getIsBase64Encoded() {
        return isBase64Encoded;
    }

    public void setIsBase64Encoded(Boolean isBase64Encoded) {
        this.isBase64Encoded = isBase64Encoded;
    }

    public SecretScanningAlert firstLocationDetected(
            NullableSecretScanningFirstDetectedLocation firstLocationDetected) {
        this.firstLocationDetected = firstLocationDetected;
        return this;
    }

    /**
     * Get firstLocationDetected
     * @return firstLocationDetected
     */
    @Valid
    @Schema(name = "first_location_detected", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("first_location_detected")
    public NullableSecretScanningFirstDetectedLocation getFirstLocationDetected() {
        return firstLocationDetected;
    }

    public void setFirstLocationDetected(NullableSecretScanningFirstDetectedLocation firstLocationDetected) {
        this.firstLocationDetected = firstLocationDetected;
    }

    public SecretScanningAlert hasMoreLocations(Boolean hasMoreLocations) {
        this.hasMoreLocations = hasMoreLocations;
        return this;
    }

    /**
     * A boolean value representing whether or not the token in the alert was detected in more than one location.
     * @return hasMoreLocations
     */
    @Schema(
            name = "has_more_locations",
            description =
                    "A boolean value representing whether or not the token in the alert was detected in more than one location.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_more_locations")
    public Boolean getHasMoreLocations() {
        return hasMoreLocations;
    }

    public void setHasMoreLocations(Boolean hasMoreLocations) {
        this.hasMoreLocations = hasMoreLocations;
    }

    public SecretScanningAlert assignedTo(NullableSimpleUser assignedTo) {
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
        SecretScanningAlert secretScanningAlert = (SecretScanningAlert) o;
        return Objects.equals(this.number, secretScanningAlert.number)
                && Objects.equals(this.createdAt, secretScanningAlert.createdAt)
                && Objects.equals(this.updatedAt, secretScanningAlert.updatedAt)
                && Objects.equals(this.url, secretScanningAlert.url)
                && Objects.equals(this.htmlUrl, secretScanningAlert.htmlUrl)
                && Objects.equals(this.locationsUrl, secretScanningAlert.locationsUrl)
                && Objects.equals(this.state, secretScanningAlert.state)
                && Objects.equals(this.resolution, secretScanningAlert.resolution)
                && Objects.equals(this.resolvedAt, secretScanningAlert.resolvedAt)
                && Objects.equals(this.resolvedBy, secretScanningAlert.resolvedBy)
                && Objects.equals(this.resolutionComment, secretScanningAlert.resolutionComment)
                && Objects.equals(this.secretType, secretScanningAlert.secretType)
                && Objects.equals(this.secretTypeDisplayName, secretScanningAlert.secretTypeDisplayName)
                && Objects.equals(this.secret, secretScanningAlert.secret)
                && Objects.equals(this.pushProtectionBypassed, secretScanningAlert.pushProtectionBypassed)
                && Objects.equals(this.pushProtectionBypassedBy, secretScanningAlert.pushProtectionBypassedBy)
                && Objects.equals(this.pushProtectionBypassedAt, secretScanningAlert.pushProtectionBypassedAt)
                && Objects.equals(
                        this.pushProtectionBypassRequestReviewer,
                        secretScanningAlert.pushProtectionBypassRequestReviewer)
                && Objects.equals(
                        this.pushProtectionBypassRequestReviewerComment,
                        secretScanningAlert.pushProtectionBypassRequestReviewerComment)
                && Objects.equals(
                        this.pushProtectionBypassRequestComment, secretScanningAlert.pushProtectionBypassRequestComment)
                && Objects.equals(
                        this.pushProtectionBypassRequestHtmlUrl, secretScanningAlert.pushProtectionBypassRequestHtmlUrl)
                && Objects.equals(this.validity, secretScanningAlert.validity)
                && Objects.equals(this.publiclyLeaked, secretScanningAlert.publiclyLeaked)
                && Objects.equals(this.multiRepo, secretScanningAlert.multiRepo)
                && Objects.equals(this.isBase64Encoded, secretScanningAlert.isBase64Encoded)
                && Objects.equals(this.firstLocationDetected, secretScanningAlert.firstLocationDetected)
                && Objects.equals(this.hasMoreLocations, secretScanningAlert.hasMoreLocations)
                && Objects.equals(this.assignedTo, secretScanningAlert.assignedTo);
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
                state,
                resolution,
                resolvedAt,
                resolvedBy,
                resolutionComment,
                secretType,
                secretTypeDisplayName,
                secret,
                pushProtectionBypassed,
                pushProtectionBypassedBy,
                pushProtectionBypassedAt,
                pushProtectionBypassRequestReviewer,
                pushProtectionBypassRequestReviewerComment,
                pushProtectionBypassRequestComment,
                pushProtectionBypassRequestHtmlUrl,
                validity,
                publiclyLeaked,
                multiRepo,
                isBase64Encoded,
                firstLocationDetected,
                hasMoreLocations,
                assignedTo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningAlert {\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    locationsUrl: ").append(toIndentedString(locationsUrl)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
        sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
        sb.append("    publiclyLeaked: ")
                .append(toIndentedString(publiclyLeaked))
                .append("\n");
        sb.append("    multiRepo: ").append(toIndentedString(multiRepo)).append("\n");
        sb.append("    isBase64Encoded: ")
                .append(toIndentedString(isBase64Encoded))
                .append("\n");
        sb.append("    firstLocationDetected: ")
                .append(toIndentedString(firstLocationDetected))
                .append("\n");
        sb.append("    hasMoreLocations: ")
                .append(toIndentedString(hasMoreLocations))
                .append("\n");
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
