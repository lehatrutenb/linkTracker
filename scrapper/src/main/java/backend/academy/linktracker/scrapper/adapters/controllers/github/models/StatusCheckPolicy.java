package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Status Check Policy
 */
@Schema(name = "status-check-policy", description = "Status Check Policy")
@JsonTypeName("status-check-policy")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class StatusCheckPolicy {

    private URI url;

    private Boolean strict;

    @Valid
    private List<String> contexts = new ArrayList<>();

    @Valid
    private List<@Valid StatusCheckPolicyChecksInner> checks = new ArrayList<>();

    private URI contextsUrl;

    public StatusCheckPolicy() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public StatusCheckPolicy(
            URI url,
            Boolean strict,
            List<String> contexts,
            List<@Valid StatusCheckPolicyChecksInner> checks,
            URI contextsUrl) {
        this.url = url;
        this.strict = strict;
        this.contexts = contexts;
        this.checks = checks;
        this.contextsUrl = contextsUrl;
    }

    public StatusCheckPolicy url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(
            name = "url",
            example =
                    "https://api.github.com/repos/octocat/Hello-World/branches/master/protection/required_status_checks",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public StatusCheckPolicy strict(Boolean strict) {
        this.strict = strict;
        return this;
    }

    /**
     * Get strict
     * @return strict
     */
    @NotNull
    @Schema(name = "strict", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("strict")
    public Boolean getStrict() {
        return strict;
    }

    public void setStrict(Boolean strict) {
        this.strict = strict;
    }

    public StatusCheckPolicy contexts(List<String> contexts) {
        this.contexts = contexts;
        return this;
    }

    public StatusCheckPolicy addContextsItem(String contextsItem) {
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
    @Schema(
            name = "contexts",
            example = "[\"continuous-integration/travis-ci\"]",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("contexts")
    public List<String> getContexts() {
        return contexts;
    }

    public void setContexts(List<String> contexts) {
        this.contexts = contexts;
    }

    public StatusCheckPolicy checks(List<@Valid StatusCheckPolicyChecksInner> checks) {
        this.checks = checks;
        return this;
    }

    public StatusCheckPolicy addChecksItem(StatusCheckPolicyChecksInner checksItem) {
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
    public List<@Valid StatusCheckPolicyChecksInner> getChecks() {
        return checks;
    }

    public void setChecks(List<@Valid StatusCheckPolicyChecksInner> checks) {
        this.checks = checks;
    }

    public StatusCheckPolicy contextsUrl(URI contextsUrl) {
        this.contextsUrl = contextsUrl;
        return this;
    }

    /**
     * Get contextsUrl
     * @return contextsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "contexts_url",
            example =
                    "https://api.github.com/repos/octocat/Hello-World/branches/master/protection/required_status_checks/contexts",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("contexts_url")
    public URI getContextsUrl() {
        return contextsUrl;
    }

    public void setContextsUrl(URI contextsUrl) {
        this.contextsUrl = contextsUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StatusCheckPolicy statusCheckPolicy = (StatusCheckPolicy) o;
        return Objects.equals(this.url, statusCheckPolicy.url)
                && Objects.equals(this.strict, statusCheckPolicy.strict)
                && Objects.equals(this.contexts, statusCheckPolicy.contexts)
                && Objects.equals(this.checks, statusCheckPolicy.checks)
                && Objects.equals(this.contextsUrl, statusCheckPolicy.contextsUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, strict, contexts, checks, contextsUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatusCheckPolicy {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    strict: ").append(toIndentedString(strict)).append("\n");
        sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
        sb.append("    checks: ").append(toIndentedString(checks)).append("\n");
        sb.append("    contextsUrl: ").append(toIndentedString(contextsUrl)).append("\n");
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
