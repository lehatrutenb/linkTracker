package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * Require all changes made to a targeted branch to pass the specified workflows before they can be merged.
 */
@Schema(
        name = "repository-rule-workflows",
        description =
                "Require all changes made to a targeted branch to pass the specified workflows before they can be merged.")
@JsonTypeName("repository-rule-workflows")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleWorkflows implements OrgRules, RepositoryRule {

    /**
     * Gets or Sets type
     */
    public enum TypeEnum {
        WORKFLOWS("workflows");

        private final String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private TypeEnum type;

    private Optional<RepositoryRuleWorkflowsParameters> parameters = Optional.empty();

    public RepositoryRuleWorkflows() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRuleWorkflows(TypeEnum type) {
        this.type = type;
    }

    public RepositoryRuleWorkflows type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public RepositoryRuleWorkflows parameters(RepositoryRuleWorkflowsParameters parameters) {
        this.parameters = Optional.ofNullable(parameters);
        return this;
    }

    /**
     * Get parameters
     * @return parameters
     */
    @Valid
    @Schema(name = "parameters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("parameters")
    public Optional<RepositoryRuleWorkflowsParameters> getParameters() {
        return parameters;
    }

    public void setParameters(Optional<RepositoryRuleWorkflowsParameters> parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRuleWorkflows repositoryRuleWorkflows = (RepositoryRuleWorkflows) o;
        return Objects.equals(this.type, repositoryRuleWorkflows.type)
                && Objects.equals(this.parameters, repositoryRuleWorkflows.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRuleWorkflows {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
