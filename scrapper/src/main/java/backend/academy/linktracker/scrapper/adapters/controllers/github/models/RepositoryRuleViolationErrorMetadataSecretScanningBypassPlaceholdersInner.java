package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * RepositoryRuleViolationErrorMetadataSecretScanningBypassPlaceholdersInner
 */
@JsonTypeName("repository_rule_violation_error_metadata_secret_scanning_bypass_placeholders_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleViolationErrorMetadataSecretScanningBypassPlaceholdersInner {

    private Optional<String> placeholderId = Optional.empty();

    private Optional<String> tokenType = Optional.empty();

    public RepositoryRuleViolationErrorMetadataSecretScanningBypassPlaceholdersInner placeholderId(
            String placeholderId) {
        this.placeholderId = Optional.ofNullable(placeholderId);
        return this;
    }

    /**
     * The ID of the push protection bypass placeholder. This value is returned on any push protected routes.
     * @return placeholderId
     */
    @Schema(
            name = "placeholder_id",
            description =
                    "The ID of the push protection bypass placeholder. This value is returned on any push protected routes.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("placeholder_id")
    public Optional<String> getPlaceholderId() {
        return placeholderId;
    }

    public void setPlaceholderId(Optional<String> placeholderId) {
        this.placeholderId = placeholderId;
    }

    public RepositoryRuleViolationErrorMetadataSecretScanningBypassPlaceholdersInner tokenType(String tokenType) {
        this.tokenType = Optional.ofNullable(tokenType);
        return this;
    }

    /**
     * Get tokenType
     * @return tokenType
     */
    @Schema(name = "token_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("token_type")
    public Optional<String> getTokenType() {
        return tokenType;
    }

    public void setTokenType(Optional<String> tokenType) {
        this.tokenType = tokenType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRuleViolationErrorMetadataSecretScanningBypassPlaceholdersInner
                repositoryRuleViolationErrorMetadataSecretScanningBypassPlaceholdersInner =
                        (RepositoryRuleViolationErrorMetadataSecretScanningBypassPlaceholdersInner) o;
        return Objects.equals(
                        this.placeholderId,
                        repositoryRuleViolationErrorMetadataSecretScanningBypassPlaceholdersInner.placeholderId)
                && Objects.equals(
                        this.tokenType,
                        repositoryRuleViolationErrorMetadataSecretScanningBypassPlaceholdersInner.tokenType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placeholderId, tokenType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRuleViolationErrorMetadataSecretScanningBypassPlaceholdersInner {\n");
        sb.append("    placeholderId: ").append(toIndentedString(placeholderId)).append("\n");
        sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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
