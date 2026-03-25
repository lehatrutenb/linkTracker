package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * GollumEventPagesInner
 */
@JsonTypeName("gollum_event_pages_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GollumEventPagesInner {

    private String pageName = null;

    private String title = null;

    private String summary = null;

    private String action;

    private String sha;

    private String htmlUrl;

    public GollumEventPagesInner pageName(String pageName) {
        this.pageName = pageName;
        return this;
    }

    /**
     * Get pageName
     * @return pageName
     */
    @Schema(name = "page_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("page_name")
    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public GollumEventPagesInner title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     * @return title
     */
    @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GollumEventPagesInner summary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get summary
     * @return summary
     */
    @Schema(name = "summary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public GollumEventPagesInner action(String action) {
        this.action = action;
        return this;
    }

    /**
     * Get action
     * @return action
     */
    @Schema(name = "action", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public GollumEventPagesInner sha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * Get sha
     * @return sha
     */
    @Schema(name = "sha", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public GollumEventPagesInner htmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GollumEventPagesInner gollumEventPagesInner = (GollumEventPagesInner) o;
        return Objects.equals(this.pageName, gollumEventPagesInner.pageName)
                && Objects.equals(this.title, gollumEventPagesInner.title)
                && Objects.equals(this.summary, gollumEventPagesInner.summary)
                && Objects.equals(this.action, gollumEventPagesInner.action)
                && Objects.equals(this.sha, gollumEventPagesInner.sha)
                && Objects.equals(this.htmlUrl, gollumEventPagesInner.htmlUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageName, title, summary, action, sha, htmlUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GollumEventPagesInner {\n");
        sb.append("    pageName: ").append(toIndentedString(pageName)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
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
