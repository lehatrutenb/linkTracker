package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Require all commits be made to a non-target branch and submitted via a pull request before they can be merged.
 */
@Schema(
        name = "repository-rule-pull-request",
        description =
                "Require all commits be made to a non-target branch and submitted via a pull request before they can be merged.")
@JsonTypeName("repository-rule-pull-request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRulePullRequest implements OrgRules, RepositoryRule {

    /**
     * Gets or Sets type
     */
    public enum TypeEnum {
        PULL_REQUEST("pull_request");

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

    private RepositoryRulePullRequestParameters parameters;

    public RepositoryRulePullRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRulePullRequest(TypeEnum type) {
        this.type = type;
    }

    public RepositoryRulePullRequest type(TypeEnum type) {
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

    public RepositoryRulePullRequest parameters(RepositoryRulePullRequestParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get parameters
     * @return parameters
     */
    @Valid
    @Schema(name = "parameters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("parameters")
    public RepositoryRulePullRequestParameters getParameters() {
        return parameters;
    }

    public void setParameters(RepositoryRulePullRequestParameters parameters) {
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
        RepositoryRulePullRequest repositoryRulePullRequest = (RepositoryRulePullRequest) o;
        return Objects.equals(this.type, repositoryRulePullRequest.type)
                && Objects.equals(this.parameters, repositoryRulePullRequest.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRulePullRequest {\n");
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
