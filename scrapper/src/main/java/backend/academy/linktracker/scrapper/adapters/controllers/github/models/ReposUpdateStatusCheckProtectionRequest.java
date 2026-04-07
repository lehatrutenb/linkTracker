package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * ReposUpdateStatusCheckProtectionRequest
 */
@JsonTypeName("repos_update_status_check_protection_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposUpdateStatusCheckProtectionRequest {

    private Optional<Boolean> strict = Optional.empty();

    @Deprecated
    @Valid
    private List<String> contexts = new ArrayList<>();

    @Valid
    private List<@Valid ReposUpdateBranchProtectionRequestRequiredStatusChecksChecksInner> checks = new ArrayList<>();

    public ReposUpdateStatusCheckProtectionRequest strict(Boolean strict) {
        this.strict = Optional.ofNullable(strict);
        return this;
    }

    /**
     * Require branches to be up to date before merging.
     * @return strict
     */
    @Schema(
            name = "strict",
            description = "Require branches to be up to date before merging.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("strict")
    public Optional<Boolean> getStrict() {
        return strict;
    }

    public void setStrict(Optional<Boolean> strict) {
        this.strict = strict;
    }

    public ReposUpdateStatusCheckProtectionRequest contexts(List<String> contexts) {
        this.contexts = contexts;
        return this;
    }

    public ReposUpdateStatusCheckProtectionRequest addContextsItem(String contextsItem) {
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
    @Schema(
            name = "contexts",
            description =
                    "**Closing down notice**: The list of status checks to require in order to merge into this branch. If any of these checks have recently been set by a particular GitHub App, they will be required to come from that app in future for the branch to merge. Use `checks` instead of `contexts` for more fine-grained control.",
            deprecated = true,
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

    public ReposUpdateStatusCheckProtectionRequest checks(
            List<@Valid ReposUpdateBranchProtectionRequestRequiredStatusChecksChecksInner> checks) {
        this.checks = checks;
        return this;
    }

    public ReposUpdateStatusCheckProtectionRequest addChecksItem(
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
        ReposUpdateStatusCheckProtectionRequest reposUpdateStatusCheckProtectionRequest =
                (ReposUpdateStatusCheckProtectionRequest) o;
        return Objects.equals(this.strict, reposUpdateStatusCheckProtectionRequest.strict)
                && Objects.equals(this.contexts, reposUpdateStatusCheckProtectionRequest.contexts)
                && Objects.equals(this.checks, reposUpdateStatusCheckProtectionRequest.checks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strict, contexts, checks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposUpdateStatusCheckProtectionRequest {\n");
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
