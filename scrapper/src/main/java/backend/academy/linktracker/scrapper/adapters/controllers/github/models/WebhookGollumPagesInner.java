package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookGollumPagesInner
 */
@JsonTypeName("webhook_gollum_pages_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookGollumPagesInner {

    /**
     * The action that was performed on the page. Can be `created` or `edited`.
     */
    public enum ActionEnum {
        CREATED("created"),

        EDITED("edited");

        private final String value;

        ActionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ActionEnum fromValue(String value) {
            for (ActionEnum b : ActionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ActionEnum action;

    private URI htmlUrl;

    private String pageName;

    private String sha;

    private JsonNullable<String> summary = JsonNullable.<String>undefined();

    private String title;

    public WebhookGollumPagesInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookGollumPagesInner(
            ActionEnum action, URI htmlUrl, String pageName, String sha, String summary, String title) {
        this.action = action;
        this.htmlUrl = htmlUrl;
        this.pageName = pageName;
        this.sha = sha;
        this.summary = JsonNullable.of(summary);
        this.title = title;
    }

    public WebhookGollumPagesInner action(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * The action that was performed on the page. Can be `created` or `edited`.
     * @return action
     */
    @NotNull
    @Schema(
            name = "action",
            description = "The action that was performed on the page. Can be `created` or `edited`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("action")
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public WebhookGollumPagesInner htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Points to the HTML wiki page.
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "html_url",
            description = "Points to the HTML wiki page.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public WebhookGollumPagesInner pageName(String pageName) {
        this.pageName = pageName;
        return this;
    }

    /**
     * The name of the page.
     * @return pageName
     */
    @NotNull
    @Schema(name = "page_name", description = "The name of the page.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("page_name")
    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public WebhookGollumPagesInner sha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * The latest commit SHA of the page.
     * @return sha
     */
    @NotNull
    @Schema(
            name = "sha",
            description = "The latest commit SHA of the page.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public WebhookGollumPagesInner summary(String summary) {
        this.summary = JsonNullable.of(summary);
        return this;
    }

    /**
     * Get summary
     * @return summary
     */
    @NotNull
    @Schema(name = "summary", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("summary")
    public JsonNullable<String> getSummary() {
        return summary;
    }

    public void setSummary(JsonNullable<String> summary) {
        this.summary = summary;
    }

    public WebhookGollumPagesInner title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The current page title.
     * @return title
     */
    @NotNull
    @Schema(name = "title", description = "The current page title.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookGollumPagesInner webhookGollumPagesInner = (WebhookGollumPagesInner) o;
        return Objects.equals(this.action, webhookGollumPagesInner.action)
                && Objects.equals(this.htmlUrl, webhookGollumPagesInner.htmlUrl)
                && Objects.equals(this.pageName, webhookGollumPagesInner.pageName)
                && Objects.equals(this.sha, webhookGollumPagesInner.sha)
                && Objects.equals(this.summary, webhookGollumPagesInner.summary)
                && Objects.equals(this.title, webhookGollumPagesInner.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, htmlUrl, pageName, sha, summary, title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookGollumPagesInner {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    pageName: ").append(toIndentedString(pageName)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
