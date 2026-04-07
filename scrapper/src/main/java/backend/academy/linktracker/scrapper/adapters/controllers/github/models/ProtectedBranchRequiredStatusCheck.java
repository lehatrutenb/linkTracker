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
import java.util.Optional;

/**
 * Protected Branch Required Status Check
 */
@Schema(name = "protected-branch-required-status-check", description = "Protected Branch Required Status Check")
@JsonTypeName("protected-branch-required-status-check")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProtectedBranchRequiredStatusCheck {

    private Optional<String> url = Optional.empty();

    private Optional<String> enforcementLevel = Optional.empty();

    @Valid
    private List<String> contexts = new ArrayList<>();

    @Valid
    private List<@Valid ProtectedBranchRequiredStatusCheckChecksInner> checks = new ArrayList<>();

    private Optional<String> contextsUrl = Optional.empty();

    private Optional<Boolean> strict = Optional.empty();

    public ProtectedBranchRequiredStatusCheck() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProtectedBranchRequiredStatusCheck(
            List<String> contexts, List<@Valid ProtectedBranchRequiredStatusCheckChecksInner> checks) {
        this.contexts = contexts;
        this.checks = checks;
    }

    public ProtectedBranchRequiredStatusCheck url(String url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public Optional<String> getUrl() {
        return url;
    }

    public void setUrl(Optional<String> url) {
        this.url = url;
    }

    public ProtectedBranchRequiredStatusCheck enforcementLevel(String enforcementLevel) {
        this.enforcementLevel = Optional.ofNullable(enforcementLevel);
        return this;
    }

    /**
     * Get enforcementLevel
     * @return enforcementLevel
     */
    @Schema(name = "enforcement_level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enforcement_level")
    public Optional<String> getEnforcementLevel() {
        return enforcementLevel;
    }

    public void setEnforcementLevel(Optional<String> enforcementLevel) {
        this.enforcementLevel = enforcementLevel;
    }

    public ProtectedBranchRequiredStatusCheck contexts(List<String> contexts) {
        this.contexts = contexts;
        return this;
    }

    public ProtectedBranchRequiredStatusCheck addContextsItem(String contextsItem) {
        if (this.contexts == null) {
            this.contexts = new ArrayList<>();
        }
        this.contexts.add(contextsItem);
        return this;
    }

    /**
     * Get contexts
     * @return contexts
     */
    @NotNull
    @Schema(name = "contexts", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("contexts")
    public List<String> getContexts() {
        return contexts;
    }

    public void setContexts(List<String> contexts) {
        this.contexts = contexts;
    }

    public ProtectedBranchRequiredStatusCheck checks(
            List<@Valid ProtectedBranchRequiredStatusCheckChecksInner> checks) {
        this.checks = checks;
        return this;
    }

    public ProtectedBranchRequiredStatusCheck addChecksItem(ProtectedBranchRequiredStatusCheckChecksInner checksItem) {
        if (this.checks == null) {
            this.checks = new ArrayList<>();
        }
        this.checks.add(checksItem);
        return this;
    }

    /**
     * Get checks
     * @return checks
     */
    @NotNull
    @Valid
    @Schema(name = "checks", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("checks")
    public List<@Valid ProtectedBranchRequiredStatusCheckChecksInner> getChecks() {
        return checks;
    }

    public void setChecks(List<@Valid ProtectedBranchRequiredStatusCheckChecksInner> checks) {
        this.checks = checks;
    }

    public ProtectedBranchRequiredStatusCheck contextsUrl(String contextsUrl) {
        this.contextsUrl = Optional.ofNullable(contextsUrl);
        return this;
    }

    /**
     * Get contextsUrl
     * @return contextsUrl
     */
    @Schema(name = "contexts_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("contexts_url")
    public Optional<String> getContextsUrl() {
        return contextsUrl;
    }

    public void setContextsUrl(Optional<String> contextsUrl) {
        this.contextsUrl = contextsUrl;
    }

    public ProtectedBranchRequiredStatusCheck strict(Boolean strict) {
        this.strict = Optional.ofNullable(strict);
        return this;
    }

    /**
     * Get strict
     * @return strict
     */
    @Schema(name = "strict", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("strict")
    public Optional<Boolean> getStrict() {
        return strict;
    }

    public void setStrict(Optional<Boolean> strict) {
        this.strict = strict;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProtectedBranchRequiredStatusCheck protectedBranchRequiredStatusCheck = (ProtectedBranchRequiredStatusCheck) o;
        return Objects.equals(this.url, protectedBranchRequiredStatusCheck.url)
                && Objects.equals(this.enforcementLevel, protectedBranchRequiredStatusCheck.enforcementLevel)
                && Objects.equals(this.contexts, protectedBranchRequiredStatusCheck.contexts)
                && Objects.equals(this.checks, protectedBranchRequiredStatusCheck.checks)
                && Objects.equals(this.contextsUrl, protectedBranchRequiredStatusCheck.contextsUrl)
                && Objects.equals(this.strict, protectedBranchRequiredStatusCheck.strict);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, enforcementLevel, contexts, checks, contextsUrl, strict);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectedBranchRequiredStatusCheck {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    enforcementLevel: ")
                .append(toIndentedString(enforcementLevel))
                .append("\n");
        sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
        sb.append("    checks: ").append(toIndentedString(checks)).append("\n");
        sb.append("    contextsUrl: ").append(toIndentedString(contextsUrl)).append("\n");
        sb.append("    strict: ").append(toIndentedString(strict)).append("\n");
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
