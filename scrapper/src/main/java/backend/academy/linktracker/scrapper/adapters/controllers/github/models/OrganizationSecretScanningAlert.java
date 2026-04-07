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
 * OrganizationSecretScanningAlert
 */
@JsonTypeName("organization-secret-scanning-alert")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrganizationSecretScanningAlert {

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

    private Optional<String> secretType = Optional.empty();

    private Optional<String> secretTypeDisplayName = Optional.empty();

    private Optional<String> secret = Optional.empty();

    private Optional<SimpleRepository> repository = Optional.empty();

    private JsonNullable<Boolean> pushProtectionBypassed = JsonNullable.<Boolean>undefined();

    private JsonNullable<NullableSimpleUser> pushProtectionBypassedBy = JsonNullable.<NullableSimpleUser>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> pushProtectionBypassedAt = JsonNullable.<OffsetDateTime>undefined();

    private JsonNullable<NullableSimpleUser> pushProtectionBypassRequestReviewer =
            JsonNullable.<NullableSimpleUser>undefined();

    private JsonNullable<String> pushProtectionBypassRequestReviewerComment = JsonNullable.<String>undefined();

    private JsonNullable<String> pushProtectionBypassRequestComment = JsonNullable.<String>undefined();

    private JsonNullable<URI> pushProtectionBypassRequestHtmlUrl = JsonNullable.<URI>undefined();

    private JsonNullable<String> resolutionComment = JsonNullable.<String>undefined();

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

    public OrganizationSecretScanningAlert number(Long number) {
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

    public OrganizationSecretScanningAlert createdAt(OffsetDateTime createdAt) {
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

    public OrganizationSecretScanningAlert updatedAt(OffsetDateTime updatedAt) {
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

    public OrganizationSecretScanningAlert url(URI url) {
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

    public OrganizationSecretScanningAlert htmlUrl(URI htmlUrl) {
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

    public OrganizationSecretScanningAlert locationsUrl(URI locationsUrl) {
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

    public OrganizationSecretScanningAlert state(SecretScanningAlertState state) {
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

    public OrganizationSecretScanningAlert resolution(SecretScanningAlertResolution resolution) {
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

    public OrganizationSecretScanningAlert resolvedAt(OffsetDateTime resolvedAt) {
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

    public OrganizationSecretScanningAlert resolvedBy(NullableSimpleUser resolvedBy) {
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

    public OrganizationSecretScanningAlert secretType(String secretType) {
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

    public OrganizationSecretScanningAlert secretTypeDisplayName(String secretTypeDisplayName) {
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

    public OrganizationSecretScanningAlert secret(String secret) {
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

    public OrganizationSecretScanningAlert repository(SimpleRepository repository) {
        this.repository = Optional.ofNullable(repository);
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public Optional<SimpleRepository> getRepository() {
        return repository;
    }

    public void setRepository(Optional<SimpleRepository> repository) {
        this.repository = repository;
    }

    public OrganizationSecretScanningAlert pushProtectionBypassed(Boolean pushProtectionBypassed) {
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

    public OrganizationSecretScanningAlert pushProtectionBypassedBy(NullableSimpleUser pushProtectionBypassedBy) {
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

    public OrganizationSecretScanningAlert pushProtectionBypassedAt(OffsetDateTime pushProtectionBypassedAt) {
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

    public OrganizationSecretScanningAlert pushProtectionBypassRequestReviewer(
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

    public OrganizationSecretScanningAlert pushProtectionBypassRequestReviewerComment(
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

    public OrganizationSecretScanningAlert pushProtectionBypassRequestComment(
            String pushProtectionBypassRequestComment) {
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

    public OrganizationSecretScanningAlert pushProtectionBypassRequestHtmlUrl(URI pushProtectionBypassRequestHtmlUrl) {
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

    public OrganizationSecretScanningAlert resolutionComment(String resolutionComment) {
        this.resolutionComment = JsonNullable.of(resolutionComment);
        return this;
    }

    /**
     * The comment that was optionally added when this alert was closed
     * @return resolutionComment
     */
    @Schema(
            name = "resolution_comment",
            description = "The comment that was optionally added when this alert was closed",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("resolution_comment")
    public JsonNullable<String> getResolutionComment() {
        return resolutionComment;
    }

    public void setResolutionComment(JsonNullable<String> resolutionComment) {
        this.resolutionComment = resolutionComment;
    }

    public OrganizationSecretScanningAlert validity(ValidityEnum validity) {
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

    public OrganizationSecretScanningAlert publiclyLeaked(Boolean publiclyLeaked) {
        this.publiclyLeaked = JsonNullable.of(publiclyLeaked);
        return this;
    }

    /**
     * Whether the secret was publicly leaked.
     * @return publiclyLeaked
     */
    @Schema(
            name = "publicly_leaked",
            description = "Whether the secret was publicly leaked.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("publicly_leaked")
    public JsonNullable<Boolean> getPubliclyLeaked() {
        return publiclyLeaked;
    }

    public void setPubliclyLeaked(JsonNullable<Boolean> publiclyLeaked) {
        this.publiclyLeaked = publiclyLeaked;
    }

    public OrganizationSecretScanningAlert multiRepo(Boolean multiRepo) {
        this.multiRepo = JsonNullable.of(multiRepo);
        return this;
    }

    /**
     * Whether the detected secret was found in multiple repositories in the same organization or enterprise.
     * @return multiRepo
     */
    @Schema(
            name = "multi_repo",
            description =
                    "Whether the detected secret was found in multiple repositories in the same organization or enterprise.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("multi_repo")
    public JsonNullable<Boolean> getMultiRepo() {
        return multiRepo;
    }

    public void setMultiRepo(JsonNullable<Boolean> multiRepo) {
        this.multiRepo = multiRepo;
    }

    public OrganizationSecretScanningAlert isBase64Encoded(Boolean isBase64Encoded) {
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

    public OrganizationSecretScanningAlert firstLocationDetected(
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

    public OrganizationSecretScanningAlert hasMoreLocations(Boolean hasMoreLocations) {
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

    public OrganizationSecretScanningAlert assignedTo(NullableSimpleUser assignedTo) {
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
        OrganizationSecretScanningAlert organizationSecretScanningAlert = (OrganizationSecretScanningAlert) o;
        return Objects.equals(this.number, organizationSecretScanningAlert.number)
                && Objects.equals(this.createdAt, organizationSecretScanningAlert.createdAt)
                && equalsNullable(this.updatedAt, organizationSecretScanningAlert.updatedAt)
                && Objects.equals(this.url, organizationSecretScanningAlert.url)
                && Objects.equals(this.htmlUrl, organizationSecretScanningAlert.htmlUrl)
                && Objects.equals(this.locationsUrl, organizationSecretScanningAlert.locationsUrl)
                && Objects.equals(this.state, organizationSecretScanningAlert.state)
                && equalsNullable(this.resolution, organizationSecretScanningAlert.resolution)
                && equalsNullable(this.resolvedAt, organizationSecretScanningAlert.resolvedAt)
                && equalsNullable(this.resolvedBy, organizationSecretScanningAlert.resolvedBy)
                && Objects.equals(this.secretType, organizationSecretScanningAlert.secretType)
                && Objects.equals(this.secretTypeDisplayName, organizationSecretScanningAlert.secretTypeDisplayName)
                && Objects.equals(this.secret, organizationSecretScanningAlert.secret)
                && Objects.equals(this.repository, organizationSecretScanningAlert.repository)
                && equalsNullable(this.pushProtectionBypassed, organizationSecretScanningAlert.pushProtectionBypassed)
                && equalsNullable(
                        this.pushProtectionBypassedBy, organizationSecretScanningAlert.pushProtectionBypassedBy)
                && equalsNullable(
                        this.pushProtectionBypassedAt, organizationSecretScanningAlert.pushProtectionBypassedAt)
                && equalsNullable(
                        this.pushProtectionBypassRequestReviewer,
                        organizationSecretScanningAlert.pushProtectionBypassRequestReviewer)
                && equalsNullable(
                        this.pushProtectionBypassRequestReviewerComment,
                        organizationSecretScanningAlert.pushProtectionBypassRequestReviewerComment)
                && equalsNullable(
                        this.pushProtectionBypassRequestComment,
                        organizationSecretScanningAlert.pushProtectionBypassRequestComment)
                && equalsNullable(
                        this.pushProtectionBypassRequestHtmlUrl,
                        organizationSecretScanningAlert.pushProtectionBypassRequestHtmlUrl)
                && equalsNullable(this.resolutionComment, organizationSecretScanningAlert.resolutionComment)
                && Objects.equals(this.validity, organizationSecretScanningAlert.validity)
                && equalsNullable(this.publiclyLeaked, organizationSecretScanningAlert.publiclyLeaked)
                && equalsNullable(this.multiRepo, organizationSecretScanningAlert.multiRepo)
                && equalsNullable(this.isBase64Encoded, organizationSecretScanningAlert.isBase64Encoded)
                && equalsNullable(this.firstLocationDetected, organizationSecretScanningAlert.firstLocationDetected)
                && Objects.equals(this.hasMoreLocations, organizationSecretScanningAlert.hasMoreLocations)
                && equalsNullable(this.assignedTo, organizationSecretScanningAlert.assignedTo);
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
                secretType,
                secretTypeDisplayName,
                secret,
                repository,
                hashCodeNullable(pushProtectionBypassed),
                hashCodeNullable(pushProtectionBypassedBy),
                hashCodeNullable(pushProtectionBypassedAt),
                hashCodeNullable(pushProtectionBypassRequestReviewer),
                hashCodeNullable(pushProtectionBypassRequestReviewerComment),
                hashCodeNullable(pushProtectionBypassRequestComment),
                hashCodeNullable(pushProtectionBypassRequestHtmlUrl),
                hashCodeNullable(resolutionComment),
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
        sb.append("class OrganizationSecretScanningAlert {\n");
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
        sb.append("    secretType: ").append(toIndentedString(secretType)).append("\n");
        sb.append("    secretTypeDisplayName: ")
                .append(toIndentedString(secretTypeDisplayName))
                .append("\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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
        sb.append("    resolutionComment: ")
                .append(toIndentedString(resolutionComment))
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
