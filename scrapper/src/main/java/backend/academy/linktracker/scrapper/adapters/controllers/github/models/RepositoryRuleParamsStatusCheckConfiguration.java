package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * Required status check
 */
@Schema(name = "repository-rule-params-status-check-configuration", description = "Required status check")
@JsonTypeName("repository-rule-params-status-check-configuration")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleParamsStatusCheckConfiguration {

    private String context;

    private Optional<Long> integrationId = Optional.empty();

    public RepositoryRuleParamsStatusCheckConfiguration() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRuleParamsStatusCheckConfiguration(String context) {
        this.context = context;
    }

    public RepositoryRuleParamsStatusCheckConfiguration context(String context) {
        this.context = context;
        return this;
    }

    /**
     * The status check context name that must be present on the commit.
     * @return context
     */
    @NotNull
    @Schema(
            name = "context",
            description = "The status check context name that must be present on the commit.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("context")
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public RepositoryRuleParamsStatusCheckConfiguration integrationId(Long integrationId) {
        this.integrationId = Optional.ofNullable(integrationId);
        return this;
    }

    /**
     * The optional integration ID that this status check must originate from.
     * @return integrationId
     */
    @Schema(
            name = "integration_id",
            description = "The optional integration ID that this status check must originate from.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("integration_id")
    public Optional<Long> getIntegrationId() {
        return integrationId;
    }

    public void setIntegrationId(Optional<Long> integrationId) {
        this.integrationId = integrationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRuleParamsStatusCheckConfiguration repositoryRuleParamsStatusCheckConfiguration =
                (RepositoryRuleParamsStatusCheckConfiguration) o;
        return Objects.equals(this.context, repositoryRuleParamsStatusCheckConfiguration.context)
                && Objects.equals(this.integrationId, repositoryRuleParamsStatusCheckConfiguration.integrationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(context, integrationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRuleParamsStatusCheckConfiguration {\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
        sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
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
