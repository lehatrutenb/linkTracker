package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * RepositoryRuleViolationErrorMetadata
 */
@JsonTypeName("repository_rule_violation_error_metadata")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleViolationErrorMetadata {

    private RepositoryRuleViolationErrorMetadataSecretScanning secretScanning;

    public RepositoryRuleViolationErrorMetadata secretScanning(
            RepositoryRuleViolationErrorMetadataSecretScanning secretScanning) {
        this.secretScanning = secretScanning;
        return this;
    }

    /**
     * Get secretScanning
     * @return secretScanning
     */
    @Valid
    @Schema(name = "secret_scanning", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning")
    public RepositoryRuleViolationErrorMetadataSecretScanning getSecretScanning() {
        return secretScanning;
    }

    public void setSecretScanning(RepositoryRuleViolationErrorMetadataSecretScanning secretScanning) {
        this.secretScanning = secretScanning;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRuleViolationErrorMetadata repositoryRuleViolationErrorMetadata =
                (RepositoryRuleViolationErrorMetadata) o;
        return Objects.equals(this.secretScanning, repositoryRuleViolationErrorMetadata.secretScanning);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secretScanning);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRuleViolationErrorMetadata {\n");
        sb.append("    secretScanning: ")
                .append(toIndentedString(secretScanning))
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
