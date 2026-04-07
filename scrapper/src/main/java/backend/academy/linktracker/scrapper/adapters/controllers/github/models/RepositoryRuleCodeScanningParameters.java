package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * RepositoryRuleCodeScanningParameters
 */
@JsonTypeName("repository_rule_code_scanning_parameters")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleCodeScanningParameters {

    @Valid
    private List<@Valid RepositoryRuleParamsCodeScanningTool> codeScanningTools = new ArrayList<>();

    public RepositoryRuleCodeScanningParameters() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRuleCodeScanningParameters(List<@Valid RepositoryRuleParamsCodeScanningTool> codeScanningTools) {
        this.codeScanningTools = codeScanningTools;
    }

    public RepositoryRuleCodeScanningParameters codeScanningTools(
            List<@Valid RepositoryRuleParamsCodeScanningTool> codeScanningTools) {
        this.codeScanningTools = codeScanningTools;
        return this;
    }

    public RepositoryRuleCodeScanningParameters addCodeScanningToolsItem(
            RepositoryRuleParamsCodeScanningTool codeScanningToolsItem) {
        if (this.codeScanningTools == null) {
            this.codeScanningTools = new ArrayList<>();
        }
        this.codeScanningTools.add(codeScanningToolsItem);
        return this;
    }

    /**
     * Tools that must provide code scanning results for this rule to pass.
     * @return codeScanningTools
     */
    @NotNull
    @Valid
    @Schema(
            name = "code_scanning_tools",
            description = "Tools that must provide code scanning results for this rule to pass.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("code_scanning_tools")
    public List<@Valid RepositoryRuleParamsCodeScanningTool> getCodeScanningTools() {
        return codeScanningTools;
    }

    public void setCodeScanningTools(List<@Valid RepositoryRuleParamsCodeScanningTool> codeScanningTools) {
        this.codeScanningTools = codeScanningTools;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRuleCodeScanningParameters repositoryRuleCodeScanningParameters =
                (RepositoryRuleCodeScanningParameters) o;
        return Objects.equals(this.codeScanningTools, repositoryRuleCodeScanningParameters.codeScanningTools);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeScanningTools);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRuleCodeScanningParameters {\n");
        sb.append("    codeScanningTools: ")
                .append(toIndentedString(codeScanningTools))
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
