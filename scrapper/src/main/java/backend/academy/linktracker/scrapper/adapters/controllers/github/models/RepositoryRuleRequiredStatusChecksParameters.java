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
 * RepositoryRuleRequiredStatusChecksParameters
 */
@JsonTypeName("repository_rule_required_status_checks_parameters")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleRequiredStatusChecksParameters {

    private Boolean doNotEnforceOnCreate;

    @Valid
    private List<@Valid RepositoryRuleParamsStatusCheckConfiguration> requiredStatusChecks = new ArrayList<>();

    private Boolean strictRequiredStatusChecksPolicy;

    public RepositoryRuleRequiredStatusChecksParameters() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRuleRequiredStatusChecksParameters(
            List<@Valid RepositoryRuleParamsStatusCheckConfiguration> requiredStatusChecks,
            Boolean strictRequiredStatusChecksPolicy) {
        this.requiredStatusChecks = requiredStatusChecks;
        this.strictRequiredStatusChecksPolicy = strictRequiredStatusChecksPolicy;
    }

    public RepositoryRuleRequiredStatusChecksParameters doNotEnforceOnCreate(Boolean doNotEnforceOnCreate) {
        this.doNotEnforceOnCreate = doNotEnforceOnCreate;
        return this;
    }

    /**
     * Allow repositories and branches to be created if a check would otherwise prohibit it.
     * @return doNotEnforceOnCreate
     */
    @Schema(
            name = "do_not_enforce_on_create",
            description = "Allow repositories and branches to be created if a check would otherwise prohibit it.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("do_not_enforce_on_create")
    public Boolean getDoNotEnforceOnCreate() {
        return doNotEnforceOnCreate;
    }

    public void setDoNotEnforceOnCreate(Boolean doNotEnforceOnCreate) {
        this.doNotEnforceOnCreate = doNotEnforceOnCreate;
    }

    public RepositoryRuleRequiredStatusChecksParameters requiredStatusChecks(
            List<@Valid RepositoryRuleParamsStatusCheckConfiguration> requiredStatusChecks) {
        this.requiredStatusChecks = requiredStatusChecks;
        return this;
    }

    public RepositoryRuleRequiredStatusChecksParameters addRequiredStatusChecksItem(
            RepositoryRuleParamsStatusCheckConfiguration requiredStatusChecksItem) {
        if (this.requiredStatusChecks == null) {
            this.requiredStatusChecks = new ArrayList<>();
        }
        this.requiredStatusChecks.add(requiredStatusChecksItem);
        return this;
    }

    /**
     * Status checks that are required.
     * @return requiredStatusChecks
     */
    @NotNull
    @Valid
    @Schema(
            name = "required_status_checks",
            description = "Status checks that are required.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("required_status_checks")
    public List<@Valid RepositoryRuleParamsStatusCheckConfiguration> getRequiredStatusChecks() {
        return requiredStatusChecks;
    }

    public void setRequiredStatusChecks(
            List<@Valid RepositoryRuleParamsStatusCheckConfiguration> requiredStatusChecks) {
        this.requiredStatusChecks = requiredStatusChecks;
    }

    public RepositoryRuleRequiredStatusChecksParameters strictRequiredStatusChecksPolicy(
            Boolean strictRequiredStatusChecksPolicy) {
        this.strictRequiredStatusChecksPolicy = strictRequiredStatusChecksPolicy;
        return this;
    }

    /**
     * Whether pull requests targeting a matching branch must be tested with the latest code. This setting will not take effect unless at least one status check is enabled.
     * @return strictRequiredStatusChecksPolicy
     */
    @NotNull
    @Schema(
            name = "strict_required_status_checks_policy",
            description =
                    "Whether pull requests targeting a matching branch must be tested with the latest code. This setting will not take effect unless at least one status check is enabled.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("strict_required_status_checks_policy")
    public Boolean getStrictRequiredStatusChecksPolicy() {
        return strictRequiredStatusChecksPolicy;
    }

    public void setStrictRequiredStatusChecksPolicy(Boolean strictRequiredStatusChecksPolicy) {
        this.strictRequiredStatusChecksPolicy = strictRequiredStatusChecksPolicy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRuleRequiredStatusChecksParameters repositoryRuleRequiredStatusChecksParameters =
                (RepositoryRuleRequiredStatusChecksParameters) o;
        return Objects.equals(
                        this.doNotEnforceOnCreate, repositoryRuleRequiredStatusChecksParameters.doNotEnforceOnCreate)
                && Objects.equals(
                        this.requiredStatusChecks, repositoryRuleRequiredStatusChecksParameters.requiredStatusChecks)
                && Objects.equals(
                        this.strictRequiredStatusChecksPolicy,
                        repositoryRuleRequiredStatusChecksParameters.strictRequiredStatusChecksPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doNotEnforceOnCreate, requiredStatusChecks, strictRequiredStatusChecksPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRuleRequiredStatusChecksParameters {\n");
        sb.append("    doNotEnforceOnCreate: ")
                .append(toIndentedString(doNotEnforceOnCreate))
                .append("\n");
        sb.append("    requiredStatusChecks: ")
                .append(toIndentedString(requiredStatusChecks))
                .append("\n");
        sb.append("    strictRequiredStatusChecksPolicy: ")
                .append(toIndentedString(strictRequiredStatusChecksPolicy))
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
