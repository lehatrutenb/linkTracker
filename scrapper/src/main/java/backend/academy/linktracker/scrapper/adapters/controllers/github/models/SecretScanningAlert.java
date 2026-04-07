package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * SecretScanningAlert
 */
@JsonTypeName("secret-scanning-alert")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningAlert {

    private Optional<Long> number = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> createdAt = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.<OffsetDateTime>undefined();

    private Optional<URI> url = Optional.empty();

    private Optional<URI> htmlUrl = Optional.empty();

    private Optional<URI> locationsUrl = Optional.empty();

    private Optional<SecretScanningAlertState> state = Optional.empty();

    private JsonNullable<SecretScanningAlertResolution> resolution =
            JsonNullable.<SecretScanningAlertResolution>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> resolvedAt = JsonNullable.<OffsetDateTime>undefined();

    private JsonNullable<NullableSimpleUser> resolvedBy = JsonNullable.<NullableSimpleUser>undefined();

    private JsonNullable<String> resolutionComment = JsonNullable.<String>undefined();

    private Optional<String> secretType = Optional.empty();

    private Optional<String> secretTypeDisplayName = Optional.empty();

    private Optional<String> secret = Optional.empty();

    private JsonNullable<Boolean> pushProtectionBypassed = JsonNullable.<Boolean>undefined();

    private JsonNullable<NullableSimpleUser> pushProtectionBypassedBy = JsonNullable.<NullableSimpleUser>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> pushProtectionBypassedAt = JsonNullable.<OffsetDateTime>undefined();

    private JsonNullable<NullableSimpleUser> pushProtectionBypassRequestReviewer =
            JsonNullable.<NullableSimpleUser>undefined();

    private JsonNullable<String> pushProtectionBypassRequestReviewerComment = JsonNullable.<String>undefined();

    private JsonNullable<String> pushProtectionBypassRequestComment = JsonNullable.<String>undefined();

    private JsonNullable<URI> pushProtectionBypassRequestHtmlUrl = JsonNullable.<URI>undefined();

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

    private Optional<ValidityEnum> validity = Optional.empty();

    private JsonNullable<Boolean> publiclyLeaked = JsonNullable.<Boolean>undefined();

    private JsonNullable<Boolean> multiRepo = JsonNullable.<Boolean>undefined();

    private JsonNullable<Boolean> isBase64Encoded = JsonNullable.<Boolean>undefined();

    private JsonNullable<NullableSecretScanningFirstDetectedLocation> firstLocationDetected =
            JsonNullable.<NullableSecretScanningFirstDetectedLocation>undefined();

    private Optional<Boolean> hasMoreLocations = Optional.empty();

    private JsonNullable<NullableSimpleUser> assignedTo = JsonNullable.<NullableSimpleUser>undefined();

    public SecretScanningAlert number(Long number) {
        this.number = Optional.ofNullable(number);
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
    public Optional<Long> getNumber() {
        return number;
    }

    public void setNumber(Optional<Long> number) {
        this.number = number;
    }

    public SecretScanningAlert createdAt(OffsetDateTime createdAt) {
        this.createdAt = Optional.ofNullable(createdAt);
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
    public Optional<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Optional<OffsetDateTime> createdAt) {
        this.createdAt = createdAt;
    }

    public SecretScanningAlert updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = JsonNullable.of(updatedAt);
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
    public JsonNullable<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        this.updatedAt = updatedAt;
    }

    public SecretScanningAlert url(URI url) {
        this.url = Optional.ofNullable(url);
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
    public Optional<URI> getUrl() {
        return url;
    }

    public void setUrl(Optional<URI> url) {
        this.url = url;
    }

    public SecretScanningAlert htmlUrl(URI htmlUrl) {
        this.htmlUrl = Optional.ofNullable(htmlUrl);
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
    public Optional<URI> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(Optional<URI> htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public SecretScanningAlert locationsUrl(URI locationsUrl) {
        this.locationsUrl = Optional.ofNullable(locationsUrl);
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
    public Optional<URI> getLocationsUrl() {
        return locationsUrl;
    }

    public void setLocationsUrl(Optional<URI> locationsUrl) {
        this.locationsUrl = locationsUrl;
    }

    public SecretScanningAlert state(SecretScanningAlertState state) {
        this.state = Optional.ofNullable(state);
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @Valid
    @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state")
    public Optional<SecretScanningAlertState> getState() {
        return state;
    }

    public void setState(Optional<SecretScanningAlertState> state) {
        this.state = state;
    }

    public SecretScanningAlert resolution(SecretScanningAlertResolution resolution) {
        this.resolution = JsonNullable.of(resolution);
        return this;
    }

    /**
     * Get resolution
     * @return resolution
     */
    @Valid
    @Schema(name = "resolution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("resolution")
    public JsonNullable<SecretScanningAlertResolution> getResolution() {
        return resolution;
    }

    public void setResolution(JsonNullable<SecretScanningAlertResolution> resolution) {
        this.resolution = resolution;
    }

    public SecretScanningAlert resolvedAt(OffsetDateTime resolvedAt) {
        this.resolvedAt = JsonNullable.of(resolvedAt);
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
    public JsonNullable<OffsetDateTime> getResolvedAt() {
        return resolvedAt;
    }

    public void setResolvedAt(JsonNullable<OffsetDateTime> resolvedAt) {
        this.resolvedAt = resolvedAt;
    }

    public SecretScanningAlert resolvedBy(NullableSimpleUser resolvedBy) {
        this.resolvedBy = JsonNullable.of(resolvedBy);
        return this;
    }

    /**
     * Get resolvedBy
     * @return resolvedBy
     */
    @Valid
    @Schema(name = "resolved_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("resolved_by")
    public JsonNullable<NullableSimpleUser> getResolvedBy() {
        return resolvedBy;
    }

    public void setResolvedBy(JsonNullable<NullableSimpleUser> resolvedBy) {
        this.resolvedBy = resolvedBy;
    }

    public SecretScanningAlert resolutionComment(String resolutionComment) {
        this.resolutionComment = JsonNullable.of(resolutionComment);
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
    public JsonNullable<String> getResolutionComment() {
        return resolutionComment;
    }

    public void setResolutionComment(JsonNullable<String> resolutionComment) {
        this.resolutionComment = resolutionComment;
    }

    public SecretScanningAlert secretType(String secretType) {
        this.secretType = Optional.ofNullable(secretType);
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
    public Optional<String> getSecretType() {
        return secretType;
    }

    public void setSecretType(Optional<String> secretType) {
        this.secretType = secretType;
    }

    public SecretScanningAlert secretTypeDisplayName(String secretTypeDisplayName) {
        this.secretTypeDisplayName = Optional.ofNullable(secretTypeDisplayName);
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
    public Optional<String> getSecretTypeDisplayName() {
        return secretTypeDisplayName;
    }

    public void setSecretTypeDisplayName(Optional<String> secretTypeDisplayName) {
        this.secretTypeDisplayName = secretTypeDisplayName;
    }

    public SecretScanningAlert secret(String secret) {
        this.secret = Optional.ofNullable(secret);
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
    public Optional<String> getSecret() {
        return secret;
    }

    public void setSecret(Optional<String> secret) {
        this.secret = secret;
    }

    public SecretScanningAlert pushProtectionBypassed(Boolean pushProtectionBypassed) {
        this.pushProtectionBypassed = JsonNullable.of(pushProtectionBypassed);
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
    public JsonNullable<Boolean> getPushProtectionBypassed() {
        return pushProtectionBypassed;
    }

    public void setPushProtectionBypassed(JsonNullable<Boolean> pushProtectionBypassed) {
        this.pushProtectionBypassed = pushProtectionBypassed;
    }

    public SecretScanningAlert pushProtectionBypassedBy(NullableSimpleUser pushProtectionBypassedBy) {
        this.pushProtectionBypassedBy = JsonNullable.of(pushProtectionBypassedBy);
        return this;
    }

    /**
     * Get pushProtectionBypassedBy
     * @return pushProtectionBypassedBy
     */
    @Valid
    @Schema(name = "push_protection_bypassed_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("push_protection_bypassed_by")
    public JsonNullable<NullableSimpleUser> getPushProtectionBypassedBy() {
        return pushProtectionBypassedBy;
    }

    public void setPushProtectionBypassedBy(JsonNullable<NullableSimpleUser> pushProtectionBypassedBy) {
        this.pushProtectionBypassedBy = pushProtectionBypassedBy;
    }

    public SecretScanningAlert pushProtectionBypassedAt(OffsetDateTime pushProtectionBypassedAt) {
        this.pushProtectionBypassedAt = JsonNullable.of(pushProtectionBypassedAt);
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
    public JsonNullable<OffsetDateTime> getPushProtectionBypassedAt() {
        return pushProtectionBypassedAt;
    }

    public void setPushProtectionBypassedAt(JsonNullable<OffsetDateTime> pushProtectionBypassedAt) {
        this.pushProtectionBypassedAt = pushProtectionBypassedAt;
    }

    public SecretScanningAlert pushProtectionBypassRequestReviewer(
            NullableSimpleUser pushProtectionBypassRequestReviewer) {
        this.pushProtectionBypassRequestReviewer = JsonNullable.of(pushProtectionBypassRequestReviewer);
        return this;
    }

    /**
     * Get pushProtectionBypassRequestReviewer
     * @return pushProtectionBypassRequestReviewer
     */
    @Valid
    @Schema(name = "push_protection_bypass_request_reviewer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("push_protection_bypass_request_reviewer")
    public JsonNullable<NullableSimpleUser> getPushProtectionBypassRequestReviewer() {
        return pushProtectionBypassRequestReviewer;
    }

    public void setPushProtectionBypassRequestReviewer(
            JsonNullable<NullableSimpleUser> pushProtectionBypassRequestReviewer) {
        this.pushProtectionBypassRequestReviewer = pushProtectionBypassRequestReviewer;
    }

    public SecretScanningAlert pushProtectionBypassRequestReviewerComment(
            String pushProtectionBypassRequestReviewerComment) {
        this.pushProtectionBypassRequestReviewerComment = JsonNullable.of(pushProtectionBypassRequestReviewerComment);
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
    public JsonNullable<String> getPushProtectionBypassRequestReviewerComment() {
        return pushProtectionBypassRequestReviewerComment;
    }

    public void setPushProtectionBypassRequestReviewerComment(
            JsonNullable<String> pushProtectionBypassRequestReviewerComment) {
        this.pushProtectionBypassRequestReviewerComment = pushProtectionBypassRequestReviewerComment;
    }

    public SecretScanningAlert pushProtectionBypassRequestComment(String pushProtectionBypassRequestComment) {
        this.pushProtectionBypassRequestComment = JsonNullable.of(pushProtectionBypassRequestComment);
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
    public JsonNullable<String> getPushProtectionBypassRequestComment() {
        return pushProtectionBypassRequestComment;
    }

    public void setPushProtectionBypassRequestComment(JsonNullable<String> pushProtectionBypassRequestComment) {
        this.pushProtectionBypassRequestComment = pushProtectionBypassRequestComment;
    }

    public SecretScanningAlert pushProtectionBypassRequestHtmlUrl(URI pushProtectionBypassRequestHtmlUrl) {
        this.pushProtectionBypassRequestHtmlUrl = JsonNullable.of(pushProtectionBypassRequestHtmlUrl);
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
    public JsonNullable<URI> getPushProtectionBypassRequestHtmlUrl() {
        return pushProtectionBypassRequestHtmlUrl;
    }

    public void setPushProtectionBypassRequestHtmlUrl(JsonNullable<URI> pushProtectionBypassRequestHtmlUrl) {
        this.pushProtectionBypassRequestHtmlUrl = pushProtectionBypassRequestHtmlUrl;
    }

    public SecretScanningAlert validity(ValidityEnum validity) {
        this.validity = Optional.ofNullable(validity);
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
    public Optional<ValidityEnum> getValidity() {
        return validity;
    }

    public void setValidity(Optional<ValidityEnum> validity) {
        this.validity = validity;
    }

    public SecretScanningAlert publiclyLeaked(Boolean publiclyLeaked) {
        this.publiclyLeaked = JsonNullable.of(publiclyLeaked);
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
    public JsonNullable<Boolean> getPubliclyLeaked() {
        return publiclyLeaked;
    }

    public void setPubliclyLeaked(JsonNullable<Boolean> publiclyLeaked) {
        this.publiclyLeaked = publiclyLeaked;
    }

    public SecretScanningAlert multiRepo(Boolean multiRepo) {
        this.multiRepo = JsonNullable.of(multiRepo);
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
    public JsonNullable<Boolean> getMultiRepo() {
        return multiRepo;
    }

    public void setMultiRepo(JsonNullable<Boolean> multiRepo) {
        this.multiRepo = multiRepo;
    }

    public SecretScanningAlert isBase64Encoded(Boolean isBase64Encoded) {
        this.isBase64Encoded = JsonNullable.of(isBase64Encoded);
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
    public JsonNullable<Boolean> getIsBase64Encoded() {
        return isBase64Encoded;
    }

    public void setIsBase64Encoded(JsonNullable<Boolean> isBase64Encoded) {
        this.isBase64Encoded = isBase64Encoded;
    }

    public SecretScanningAlert firstLocationDetected(
            NullableSecretScanningFirstDetectedLocation firstLocationDetected) {
        this.firstLocationDetected = JsonNullable.of(firstLocationDetected);
        return this;
    }

    /**
     * Get firstLocationDetected
     * @return firstLocationDetected
     */
    @Valid
    @Schema(name = "first_location_detected", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("first_location_detected")
    public JsonNullable<NullableSecretScanningFirstDetectedLocation> getFirstLocationDetected() {
        return firstLocationDetected;
    }

    public void setFirstLocationDetected(
            JsonNullable<NullableSecretScanningFirstDetectedLocation> firstLocationDetected) {
        this.firstLocationDetected = firstLocationDetected;
    }

    public SecretScanningAlert hasMoreLocations(Boolean hasMoreLocations) {
        this.hasMoreLocations = Optional.ofNullable(hasMoreLocations);
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
    public Optional<Boolean> getHasMoreLocations() {
        return hasMoreLocations;
    }

    public void setHasMoreLocations(Optional<Boolean> hasMoreLocations) {
        this.hasMoreLocations = hasMoreLocations;
    }

    public SecretScanningAlert assignedTo(NullableSimpleUser assignedTo) {
        this.assignedTo = JsonNullable.of(assignedTo);
        return this;
    }

    /**
     * Get assignedTo
     * @return assignedTo
     */
    @Valid
    @Schema(name = "assigned_to", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assigned_to")
    public JsonNullable<NullableSimpleUser> getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(JsonNullable<NullableSimpleUser> assignedTo) {
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
                && equalsNullable(this.updatedAt, secretScanningAlert.updatedAt)
                && Objects.equals(this.url, secretScanningAlert.url)
                && Objects.equals(this.htmlUrl, secretScanningAlert.htmlUrl)
                && Objects.equals(this.locationsUrl, secretScanningAlert.locationsUrl)
                && Objects.equals(this.state, secretScanningAlert.state)
                && equalsNullable(this.resolution, secretScanningAlert.resolution)
                && equalsNullable(this.resolvedAt, secretScanningAlert.resolvedAt)
                && equalsNullable(this.resolvedBy, secretScanningAlert.resolvedBy)
                && equalsNullable(this.resolutionComment, secretScanningAlert.resolutionComment)
                && Objects.equals(this.secretType, secretScanningAlert.secretType)
                && Objects.equals(this.secretTypeDisplayName, secretScanningAlert.secretTypeDisplayName)
                && Objects.equals(this.secret, secretScanningAlert.secret)
                && equalsNullable(this.pushProtectionBypassed, secretScanningAlert.pushProtectionBypassed)
                && equalsNullable(this.pushProtectionBypassedBy, secretScanningAlert.pushProtectionBypassedBy)
                && equalsNullable(this.pushProtectionBypassedAt, secretScanningAlert.pushProtectionBypassedAt)
                && equalsNullable(
                        this.pushProtectionBypassRequestReviewer,
                        secretScanningAlert.pushProtectionBypassRequestReviewer)
                && equalsNullable(
                        this.pushProtectionBypassRequestReviewerComment,
                        secretScanningAlert.pushProtectionBypassRequestReviewerComment)
                && equalsNullable(
                        this.pushProtectionBypassRequestComment, secretScanningAlert.pushProtectionBypassRequestComment)
                && equalsNullable(
                        this.pushProtectionBypassRequestHtmlUrl, secretScanningAlert.pushProtectionBypassRequestHtmlUrl)
                && Objects.equals(this.validity, secretScanningAlert.validity)
                && equalsNullable(this.publiclyLeaked, secretScanningAlert.publiclyLeaked)
                && equalsNullable(this.multiRepo, secretScanningAlert.multiRepo)
                && equalsNullable(this.isBase64Encoded, secretScanningAlert.isBase64Encoded)
                && equalsNullable(this.firstLocationDetected, secretScanningAlert.firstLocationDetected)
                && Objects.equals(this.hasMoreLocations, secretScanningAlert.hasMoreLocations)
                && equalsNullable(this.assignedTo, secretScanningAlert.assignedTo);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                number,
                createdAt,
                hashCodeNullable(updatedAt),
                url,
                htmlUrl,
                locationsUrl,
                state,
                hashCodeNullable(resolution),
                hashCodeNullable(resolvedAt),
                hashCodeNullable(resolvedBy),
                hashCodeNullable(resolutionComment),
                secretType,
                secretTypeDisplayName,
                secret,
                hashCodeNullable(pushProtectionBypassed),
                hashCodeNullable(pushProtectionBypassedBy),
                hashCodeNullable(pushProtectionBypassedAt),
                hashCodeNullable(pushProtectionBypassRequestReviewer),
                hashCodeNullable(pushProtectionBypassRequestReviewerComment),
                hashCodeNullable(pushProtectionBypassRequestComment),
                hashCodeNullable(pushProtectionBypassRequestHtmlUrl),
                validity,
                hashCodeNullable(publiclyLeaked),
                hashCodeNullable(multiRepo),
                hashCodeNullable(isBase64Encoded),
                hashCodeNullable(firstLocationDetected),
                hasMoreLocations,
                hashCodeNullable(assignedTo));
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
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
