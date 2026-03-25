package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * WebhookStatusBranchesInnerCommit
 */
@JsonTypeName("webhook_status_branches_inner_commit")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookStatusBranchesInnerCommit {

    private String sha = null;

    private URI url = null;

    public WebhookStatusBranchesInnerCommit() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookStatusBranchesInnerCommit(String sha, URI url) {
        this.sha = sha;
        this.url = url;
    }

    public WebhookStatusBranchesInnerCommit sha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * Get sha
     * @return sha
     */
    @NotNull
    @Schema(name = "sha", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public WebhookStatusBranchesInnerCommit url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookStatusBranchesInnerCommit webhookStatusBranchesInnerCommit = (WebhookStatusBranchesInnerCommit) o;
        return Objects.equals(this.sha, webhookStatusBranchesInnerCommit.sha)
                && Objects.equals(this.url, webhookStatusBranchesInnerCommit.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sha, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookStatusBranchesInnerCommit {\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
