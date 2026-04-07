package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * ThreadSubject
 */
@JsonTypeName("thread_subject")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ThreadSubject {

    private String title;

    private String url;

    private String latestCommentUrl;

    private String type;

    public ThreadSubject() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ThreadSubject(String title, String url, String latestCommentUrl, String type) {
        this.title = title;
        this.url = url;
        this.latestCommentUrl = latestCommentUrl;
        this.type = type;
    }

    public ThreadSubject title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     * @return title
     */
    @NotNull
    @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ThreadSubject url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ThreadSubject latestCommentUrl(String latestCommentUrl) {
        this.latestCommentUrl = latestCommentUrl;
        return this;
    }

    /**
     * Get latestCommentUrl
     * @return latestCommentUrl
     */
    @NotNull
    @Schema(name = "latest_comment_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("latest_comment_url")
    public String getLatestCommentUrl() {
        return latestCommentUrl;
    }

    public void setLatestCommentUrl(String latestCommentUrl) {
        this.latestCommentUrl = latestCommentUrl;
    }

    public ThreadSubject type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ThreadSubject threadSubject = (ThreadSubject) o;
        return Objects.equals(this.title, threadSubject.title)
                && Objects.equals(this.url, threadSubject.url)
                && Objects.equals(this.latestCommentUrl, threadSubject.latestCommentUrl)
                && Objects.equals(this.type, threadSubject.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, url, latestCommentUrl, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThreadSubject {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    latestCommentUrl: ")
                .append(toIndentedString(latestCommentUrl))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
