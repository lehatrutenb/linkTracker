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
 * WebhookStatusCommitParentsInner
 */
@JsonTypeName("webhook_status_commit_parents_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookStatusCommitParentsInner {

    private URI htmlUrl;

    private String sha;

    private URI url;

    public WebhookStatusCommitParentsInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookStatusCommitParentsInner(URI htmlUrl, String sha, URI url) {
        this.htmlUrl = htmlUrl;
        this.sha = sha;
        this.url = url;
    }

    public WebhookStatusCommitParentsInner htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public WebhookStatusCommitParentsInner sha(String sha) {
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

    public WebhookStatusCommitParentsInner url(URI url) {
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
        WebhookStatusCommitParentsInner webhookStatusCommitParentsInner = (WebhookStatusCommitParentsInner) o;
        return Objects.equals(this.htmlUrl, webhookStatusCommitParentsInner.htmlUrl)
                && Objects.equals(this.sha, webhookStatusCommitParentsInner.sha)
                && Objects.equals(this.url, webhookStatusCommitParentsInner.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(htmlUrl, sha, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookStatusCommitParentsInner {\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
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
