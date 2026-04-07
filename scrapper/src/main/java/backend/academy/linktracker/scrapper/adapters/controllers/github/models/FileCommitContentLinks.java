package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * FileCommitContentLinks
 */
@JsonTypeName("file_commit_content__links")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class FileCommitContentLinks {

    private Optional<String> self = Optional.empty();

    private Optional<String> git = Optional.empty();

    private Optional<String> html = Optional.empty();

    public FileCommitContentLinks self(String self) {
        this.self = Optional.ofNullable(self);
        return this;
    }

    /**
     * Get self
     * @return self
     */
    @Schema(name = "self", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("self")
    public Optional<String> getSelf() {
        return self;
    }

    public void setSelf(Optional<String> self) {
        this.self = self;
    }

    public FileCommitContentLinks git(String git) {
        this.git = Optional.ofNullable(git);
        return this;
    }

    /**
     * Get git
     * @return git
     */
    @Schema(name = "git", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("git")
    public Optional<String> getGit() {
        return git;
    }

    public void setGit(Optional<String> git) {
        this.git = git;
    }

    public FileCommitContentLinks html(String html) {
        this.html = Optional.ofNullable(html);
        return this;
    }

    /**
     * Get html
     * @return html
     */
    @Schema(name = "html", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html")
    public Optional<String> getHtml() {
        return html;
    }

    public void setHtml(Optional<String> html) {
        this.html = html;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FileCommitContentLinks fileCommitContentLinks = (FileCommitContentLinks) o;
        return Objects.equals(this.self, fileCommitContentLinks.self)
                && Objects.equals(this.git, fileCommitContentLinks.git)
                && Objects.equals(this.html, fileCommitContentLinks.html);
    }

    @Override
    public int hashCode() {
        return Objects.hash(self, git, html);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileCommitContentLinks {\n");
        sb.append("    self: ").append(toIndentedString(self)).append("\n");
        sb.append("    git: ").append(toIndentedString(git)).append("\n");
        sb.append("    html: ").append(toIndentedString(html)).append("\n");
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
