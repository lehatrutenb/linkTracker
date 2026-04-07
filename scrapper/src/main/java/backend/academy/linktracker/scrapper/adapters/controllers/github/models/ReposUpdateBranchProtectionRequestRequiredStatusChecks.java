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
 * Require status checks to pass before merging. Set to &#x60;null&#x60; to disable.
 */
@Schema(
        name = "repos_update_branch_protection_request_required_status_checks",
        description = "Require status checks to pass before merging. Set to `null` to disable.")
@JsonTypeName("repos_update_branch_protection_request_required_status_checks")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposUpdateBranchProtectionRequestRequiredStatusChecks {

    private Boolean strict;

    @Deprecated
    @Valid
    private List<String> contexts = new ArrayList<>();

    @Valid
    private List<@Valid ReposUpdateBranchProtectionRequestRequiredStatusChecksChecksInner> checks = new ArrayList<>();

    public ReposUpdateBranchProtectionRequestRequiredStatusChecks() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposUpdateBranchProtectionRequestRequiredStatusChecks(Boolean strict, List<String> contexts) {
        this.strict = strict;
        this.contexts = contexts;
    }

    public ReposUpdateBranchProtectionRequestRequiredStatusChecks strict(Boolean strict) {
        this.strict = strict;
        return this;
    }

    /**
     * Require branches to be up to date before merging.
     * @return strict
     */
    @NotNull
    @Schema(
            name = "strict",
            description = "Require branches to be up to date before merging.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("strict")
    public Boolean getStrict() {
        return strict;
    }

    public void setStrict(Boolean strict) {
        this.strict = strict;
    }

    public ReposUpdateBranchProtectionRequestRequiredStatusChecks contexts(List<String> contexts) {
        this.contexts = contexts;
        return this;
    }

    public ReposUpdateBranchProtectionRequestRequiredStatusChecks addContextsItem(String contextsItem) {
        if (this.contexts == null) {
            this.contexts = new ArrayList<>();
        }
        this.contexts.add(contextsItem);
        return this;
    }

    /**
     * **Closing down notice**: The list of status checks to require in order to merge into this branch. If any of these checks have recently been set by a particular GitHub App, they will be required to come from that app in future for the branch to merge. Use `checks` instead of `contexts` for more fine-grained control.
     * @return contexts
     * @deprecated
     */
    @NotNull
    @Schema(
            name = "contexts",
            description =
                    "**Closing down notice**: The list of status checks to require in order to merge into this branch. If any of these checks have recently been set by a particular GitHub App, they will be required to come from that app in future for the branch to merge. Use `checks` instead of `contexts` for more fine-grained control.",
            deprecated = true,
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("contexts")
    @Deprecated
    public List<String> getContexts() {
        return contexts;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void setContexts(List<String> contexts) {
        this.contexts = contexts;
    }

    public ReposUpdateBranchProtectionRequestRequiredStatusChecks checks(
            List<@Valid ReposUpdateBranchProtectionRequestRequiredStatusChecksChecksInner> checks) {
        this.checks = checks;
        return this;
    }

    public ReposUpdateBranchProtectionRequestRequiredStatusChecks addChecksItem(
            ReposUpdateBranchProtectionRequestRequiredStatusChecksChecksInner checksItem) {
        if (this.checks == null) {
            this.checks = new ArrayList<>();
        }
        this.checks.add(checksItem);
        return this;
    }

    /**
     * The list of status checks to require in order to merge into this branch.
     * @return checks
     */
    @Valid
    @Schema(
            name = "checks",
            description = "The list of status checks to require in order to merge into this branch.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("checks")
    public List<@Valid ReposUpdateBranchProtectionRequestRequiredStatusChecksChecksInner> getChecks() {
        return checks;
    }

    public void setChecks(List<@Valid ReposUpdateBranchProtectionRequestRequiredStatusChecksChecksInner> checks) {
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
        ReposUpdateBranchProtectionRequestRequiredStatusChecks reposUpdateBranchProtectionRequestRequiredStatusChecks =
                (ReposUpdateBranchProtectionRequestRequiredStatusChecks) o;
        return Objects.equals(this.strict, reposUpdateBranchProtectionRequestRequiredStatusChecks.strict)
                && Objects.equals(this.contexts, reposUpdateBranchProtectionRequestRequiredStatusChecks.contexts)
                && Objects.equals(this.checks, reposUpdateBranchProtectionRequestRequiredStatusChecks.checks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strict, contexts, checks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposUpdateBranchProtectionRequestRequiredStatusChecks {\n");
        sb.append("    strict: ").append(toIndentedString(strict)).append("\n");
        sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
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
