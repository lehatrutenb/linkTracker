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
 * RepositoryRuleMaxFilePathLengthParameters
 */
@JsonTypeName("repository_rule_max_file_path_length_parameters")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleMaxFilePathLengthParameters {

    private Long maxFilePathLength;

    public RepositoryRuleMaxFilePathLengthParameters() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRuleMaxFilePathLengthParameters(Long maxFilePathLength) {
        this.maxFilePathLength = maxFilePathLength;
    }

    public RepositoryRuleMaxFilePathLengthParameters maxFilePathLength(Long maxFilePathLength) {
        this.maxFilePathLength = maxFilePathLength;
        return this;
    }

    /**
     * The maximum amount of characters allowed in file paths.
     * minimum: 1
     * maximum: 32767
     * @return maxFilePathLength
     */
    @NotNull
    @Min(value = 1)
    @Max(value = 32767)
    @Schema(
            name = "max_file_path_length",
            description = "The maximum amount of characters allowed in file paths.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("max_file_path_length")
    public Long getMaxFilePathLength() {
        return maxFilePathLength;
    }

    public void setMaxFilePathLength(Long maxFilePathLength) {
        this.maxFilePathLength = maxFilePathLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRuleMaxFilePathLengthParameters repositoryRuleMaxFilePathLengthParameters =
                (RepositoryRuleMaxFilePathLengthParameters) o;
        return Objects.equals(this.maxFilePathLength, repositoryRuleMaxFilePathLengthParameters.maxFilePathLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxFilePathLength);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRuleMaxFilePathLengthParameters {\n");
        sb.append("    maxFilePathLength: ")
                .append(toIndentedString(maxFilePathLength))
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
