package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The hierarchy between files in a Git repository.
 */
@Schema(name = "git-tree", description = "The hierarchy between files in a Git repository.")
@JsonTypeName("git-tree")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GitTree {

    private String sha;

    private URI url;

    private Boolean truncated;

    @Valid
    private List<@Valid GitTreeTreeInner> tree = new ArrayList<>();

    public GitTree() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GitTree(String sha, Boolean truncated, List<@Valid GitTreeTreeInner> tree) {
        this.sha = sha;
        this.truncated = truncated;
        this.tree = tree;
    }

    public GitTree sha(String sha) {
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

    public GitTree url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public GitTree truncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }

    /**
     * Get truncated
     * @return truncated
     */
    @NotNull
    @Schema(name = "truncated", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("truncated")
    public Boolean getTruncated() {
        return truncated;
    }

    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    public GitTree tree(List<@Valid GitTreeTreeInner> tree) {
        this.tree = tree;
        return this;
    }

    public GitTree addTreeItem(GitTreeTreeInner treeItem) {
        if (this.tree == null) {
            this.tree = new ArrayList<>();
        }
        this.tree.add(treeItem);
        return this;
    }

    /**
     * Objects specifying a tree structure
     * @return tree
     */
    @NotNull
    @Valid
    @Schema(
            name = "tree",
            example =
                    "[{\"path\":\"file.rb\",\"mode\":\"100644\",\"type\":\"blob\",\"size\":30,\"sha\":\"44b4fc6d56897b048c772eb4087f854f46256132\",\"url\":\"https://api.github.com/repos/octocat/Hello-World/git/blobs/44b4fc6d56897b048c772eb4087f854f46256132\"}]",
            description = "Objects specifying a tree structure",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("tree")
    public List<@Valid GitTreeTreeInner> getTree() {
        return tree;
    }

    public void setTree(List<@Valid GitTreeTreeInner> tree) {
        this.tree = tree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GitTree gitTree = (GitTree) o;
        return Objects.equals(this.sha, gitTree.sha)
                && Objects.equals(this.url, gitTree.url)
                && Objects.equals(this.truncated, gitTree.truncated)
                && Objects.equals(this.tree, gitTree.tree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sha, url, truncated, tree);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitTree {\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    truncated: ").append(toIndentedString(truncated)).append("\n");
        sb.append("    tree: ").append(toIndentedString(tree)).append("\n");
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
