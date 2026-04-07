package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Metadata for a required status checks rule evaluation result.
 */
@Schema(
        name = "rule-suite-required-status-checks",
        description = "Metadata for a required status checks rule evaluation result.")
@JsonTypeName("rule-suite-required-status-checks")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RuleSuiteRequiredStatusChecks {

    @Valid
    private List<@Valid RuleSuiteRequiredStatusChecksChecksInner> checks = new ArrayList<>();

    public RuleSuiteRequiredStatusChecks checks(List<@Valid RuleSuiteRequiredStatusChecksChecksInner> checks) {
        this.checks = checks;
        return this;
    }

    public RuleSuiteRequiredStatusChecks addChecksItem(RuleSuiteRequiredStatusChecksChecksInner checksItem) {
        if (this.checks == null) {
            this.checks = new ArrayList<>();
        }
        this.checks.add(checksItem);
        return this;
    }

    /**
     * The status checks associated with the rule evaluation.
     * @return checks
     */
    @Valid
    @Schema(
            name = "checks",
            description = "The status checks associated with the rule evaluation.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("checks")
    public List<@Valid RuleSuiteRequiredStatusChecksChecksInner> getChecks() {
        return checks;
    }

    public void setChecks(List<@Valid RuleSuiteRequiredStatusChecksChecksInner> checks) {
        this.checks = checks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuleSuiteRequiredStatusChecks ruleSuiteRequiredStatusChecks = (RuleSuiteRequiredStatusChecks) o;
        return Objects.equals(this.checks, ruleSuiteRequiredStatusChecks.checks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleSuiteRequiredStatusChecks {\n");
        sb.append("    checks: ").append(toIndentedString(checks)).append("\n");
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
