package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * GollumEventPagesInner
 */
@JsonTypeName("gollum_event_pages_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GollumEventPagesInner {

    private JsonNullable<String> pageName = JsonNullable.<String>undefined();

    private JsonNullable<String> title = JsonNullable.<String>undefined();

    private JsonNullable<String> summary = JsonNullable.<String>undefined();

    private Optional<String> action = Optional.empty();

    private Optional<String> sha = Optional.empty();

    private Optional<String> htmlUrl = Optional.empty();

    public GollumEventPagesInner pageName(String pageName) {
        this.pageName = JsonNullable.of(pageName);
        return this;
    }

    /**
     * Get pageName
     * @return pageName
     */
    @Schema(name = "page_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("page_name")
    public JsonNullable<String> getPageName() {
        return pageName;
    }

    public void setPageName(JsonNullable<String> pageName) {
        this.pageName = pageName;
    }

    public GollumEventPagesInner title(String title) {
        this.title = JsonNullable.of(title);
        return this;
    }

    /**
     * Get title
     * @return title
     */
    @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("title")
    public JsonNullable<String> getTitle() {
        return title;
    }

    public void setTitle(JsonNullable<String> title) {
        this.title = title;
    }

    public GollumEventPagesInner summary(String summary) {
        this.summary = JsonNullable.of(summary);
        return this;
    }

    /**
     * Get summary
     * @return summary
     */
    @Schema(name = "summary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("summary")
    public JsonNullable<String> getSummary() {
        return summary;
    }

    public void setSummary(JsonNullable<String> summary) {
        this.summary = summary;
    }

    public GollumEventPagesInner action(String action) {
        this.action = Optional.ofNullable(action);
        return this;
    }

    /**
     * Get action
     * @return action
     */
    @Schema(name = "action", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("action")
    public Optional<String> getAction() {
        return action;
    }

    public void setAction(Optional<String> action) {
        this.action = action;
    }

    public GollumEventPagesInner sha(String sha) {
        this.sha = Optional.ofNullable(sha);
        return this;
    }

    /**
     * Get sha
     * @return sha
     */
    @Schema(name = "sha", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sha")
    public Optional<String> getSha() {
        return sha;
    }

    public void setSha(Optional<String> sha) {
        this.sha = sha;
    }

    public GollumEventPagesInner htmlUrl(String htmlUrl) {
        this.htmlUrl = Optional.ofNullable(htmlUrl);
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public Optional<String> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(Optional<String> htmlUrl) {
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
        return equalsNullable(this.pageName, gollumEventPagesInner.pageName)
                && equalsNullable(this.title, gollumEventPagesInner.title)
                && equalsNullable(this.summary, gollumEventPagesInner.summary)
                && Objects.equals(this.action, gollumEventPagesInner.action)
                && Objects.equals(this.sha, gollumEventPagesInner.sha)
                && Objects.equals(this.htmlUrl, gollumEventPagesInner.htmlUrl);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hashCodeNullable(pageName), hashCodeNullable(title), hashCodeNullable(summary), action, sha, htmlUrl);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
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
