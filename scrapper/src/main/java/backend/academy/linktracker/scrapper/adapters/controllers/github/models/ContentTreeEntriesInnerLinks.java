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
 * ContentTreeEntriesInnerLinks
 */
@JsonTypeName("content_tree_entries_inner__links")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ContentTreeEntriesInnerLinks {

    private URI git = null;

    private URI html = null;

    private URI self;

    public ContentTreeEntriesInnerLinks() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ContentTreeEntriesInnerLinks(URI git, URI html, URI self) {
        this.git = git;
        this.html = html;
        this.self = self;
    }

    public ContentTreeEntriesInnerLinks git(URI git) {
        this.git = git;
        return this;
    }

    /**
     * Get git
     * @return git
     */
    @NotNull
    @Valid
    @Schema(name = "git", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("git")
    public URI getGit() {
        return git;
    }

    public void setGit(URI git) {
        this.git = git;
    }

    public ContentTreeEntriesInnerLinks html(URI html) {
        this.html = html;
        return this;
    }

    /**
     * Get html
     * @return html
     */
    @NotNull
    @Valid
    @Schema(name = "html", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html")
    public URI getHtml() {
        return html;
    }

    public void setHtml(URI html) {
        this.html = html;
    }

    public ContentTreeEntriesInnerLinks self(URI self) {
        this.self = self;
        return this;
    }

    /**
     * Get self
     * @return self
     */
    @NotNull
    @Valid
    @Schema(name = "self", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("self")
    public URI getSelf() {
        return self;
    }

    public void setSelf(URI self) {
        this.self = self;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContentTreeEntriesInnerLinks contentTreeEntriesInnerLinks = (ContentTreeEntriesInnerLinks) o;
        return Objects.equals(this.git, contentTreeEntriesInnerLinks.git)
                && Objects.equals(this.html, contentTreeEntriesInnerLinks.html)
                && Objects.equals(this.self, contentTreeEntriesInnerLinks.self);
    }

    @Override
    public int hashCode() {
        return Objects.hash(git, html, self);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentTreeEntriesInnerLinks {\n");
        sb.append("    git: ").append(toIndentedString(git)).append("\n");
        sb.append("    html: ").append(toIndentedString(html)).append("\n");
        sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
