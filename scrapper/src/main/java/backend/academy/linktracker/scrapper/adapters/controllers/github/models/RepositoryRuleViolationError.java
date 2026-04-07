package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * Repository rule violation was detected
 */
@Schema(name = "repository-rule-violation-error", description = "Repository rule violation was detected")
@JsonTypeName("repository-rule-violation-error")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleViolationError
        implements GitCreateBlob422Response, ReposCreateOrUpdateFileContents409Response {

    private Optional<String> message = Optional.empty();

    private Optional<String> documentationUrl = Optional.empty();

    private Optional<String> status = Optional.empty();

    private Optional<RepositoryRuleViolationErrorMetadata> metadata = Optional.empty();

    public RepositoryRuleViolationError message(String message) {
        this.message = Optional.ofNullable(message);
        return this;
    }

    /**
     * Get message
     * @return message
     */
    @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("message")
    public Optional<String> getMessage() {
        return message;
    }

    public void setMessage(Optional<String> message) {
        this.message = message;
    }

    public RepositoryRuleViolationError documentationUrl(String documentationUrl) {
        this.documentationUrl = Optional.ofNullable(documentationUrl);
        return this;
    }

    /**
     * Get documentationUrl
     * @return documentationUrl
     */
    @Schema(name = "documentation_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("documentation_url")
    public Optional<String> getDocumentationUrl() {
        return documentationUrl;
    }

    public void setDocumentationUrl(Optional<String> documentationUrl) {
        this.documentationUrl = documentationUrl;
    }

    public RepositoryRuleViolationError status(String status) {
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("status")
    public Optional<String> getStatus() {
        return status;
    }

    public void setStatus(Optional<String> status) {
        this.status = status;
    }

    public RepositoryRuleViolationError metadata(RepositoryRuleViolationErrorMetadata metadata) {
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    @Valid
    @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("metadata")
    public Optional<RepositoryRuleViolationErrorMetadata> getMetadata() {
        return metadata;
    }

    public void setMetadata(Optional<RepositoryRuleViolationErrorMetadata> metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRuleViolationError repositoryRuleViolationError = (RepositoryRuleViolationError) o;
        return Objects.equals(this.message, repositoryRuleViolationError.message)
                && Objects.equals(this.documentationUrl, repositoryRuleViolationError.documentationUrl)
                && Objects.equals(this.status, repositoryRuleViolationError.status)
                && Objects.equals(this.metadata, repositoryRuleViolationError.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, documentationUrl, status, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRuleViolationError {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    documentationUrl: ")
                .append(toIndentedString(documentationUrl))
                .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
