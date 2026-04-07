package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * RepositoryRuleMaxFileSizeParameters
 */
@JsonTypeName("repository_rule_max_file_size_parameters")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleMaxFileSizeParameters {

    private Long maxFileSize;

    public RepositoryRuleMaxFileSizeParameters() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRuleMaxFileSizeParameters(Long maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public RepositoryRuleMaxFileSizeParameters maxFileSize(Long maxFileSize) {
        this.maxFileSize = maxFileSize;
        return this;
    }

    /**
     * The maximum file size allowed in megabytes. This limit does not apply to Git Large File Storage (Git LFS).
     * minimum: 1
     * maximum: 100
     * @return maxFileSize
     */
    @NotNull
    @Min(value = 1)
    @Max(value = 100)
    @Schema(
            name = "max_file_size",
            description =
                    "The maximum file size allowed in megabytes. This limit does not apply to Git Large File Storage (Git LFS).",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("max_file_size")
    public Long getMaxFileSize() {
        return maxFileSize;
    }

    public void setMaxFileSize(Long maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRuleMaxFileSizeParameters repositoryRuleMaxFileSizeParameters =
                (RepositoryRuleMaxFileSizeParameters) o;
        return Objects.equals(this.maxFileSize, repositoryRuleMaxFileSizeParameters.maxFileSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxFileSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRuleMaxFileSizeParameters {\n");
        sb.append("    maxFileSize: ").append(toIndentedString(maxFileSize)).append("\n");
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
