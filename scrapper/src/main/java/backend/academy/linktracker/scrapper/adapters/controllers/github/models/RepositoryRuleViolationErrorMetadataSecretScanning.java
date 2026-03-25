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
 * RepositoryRuleViolationErrorMetadataSecretScanning
 */
@JsonTypeName("repository_rule_violation_error_metadata_secret_scanning")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleViolationErrorMetadataSecretScanning {

    @Valid
    private List<@Valid RepositoryRuleViolationErrorMetadataSecretScanningBypassPlaceholdersInner> bypassPlaceholders =
            new ArrayList<>();

    public RepositoryRuleViolationErrorMetadataSecretScanning bypassPlaceholders(
            List<@Valid RepositoryRuleViolationErrorMetadataSecretScanningBypassPlaceholdersInner> bypassPlaceholders) {
        this.bypassPlaceholders = bypassPlaceholders;
        return this;
    }

    public RepositoryRuleViolationErrorMetadataSecretScanning addBypassPlaceholdersItem(
            RepositoryRuleViolationErrorMetadataSecretScanningBypassPlaceholdersInner bypassPlaceholdersItem) {
        if (this.bypassPlaceholders == null) {
            this.bypassPlaceholders = new ArrayList<>();
        }
        this.bypassPlaceholders.add(bypassPlaceholdersItem);
        return this;
    }

    /**
     * Get bypassPlaceholders
     * @return bypassPlaceholders
     */
    @Valid
    @Schema(name = "bypass_placeholders", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("bypass_placeholders")
    public List<@Valid RepositoryRuleViolationErrorMetadataSecretScanningBypassPlaceholdersInner>
            getBypassPlaceholders() {
        return bypassPlaceholders;
    }

    public void setBypassPlaceholders(
            List<@Valid RepositoryRuleViolationErrorMetadataSecretScanningBypassPlaceholdersInner> bypassPlaceholders) {
        this.bypassPlaceholders = bypassPlaceholders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRuleViolationErrorMetadataSecretScanning repositoryRuleViolationErrorMetadataSecretScanning =
                (RepositoryRuleViolationErrorMetadataSecretScanning) o;
        return Objects.equals(
                this.bypassPlaceholders, repositoryRuleViolationErrorMetadataSecretScanning.bypassPlaceholders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bypassPlaceholders);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRuleViolationErrorMetadataSecretScanning {\n");
        sb.append("    bypassPlaceholders: ")
                .append(toIndentedString(bypassPlaceholders))
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
