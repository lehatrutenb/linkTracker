package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * GitCreateTreeRequest
 */
@JsonTypeName("git_create_tree_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GitCreateTreeRequest {

    @Valid
    private List<@Valid GitCreateTreeRequestTreeInner> tree = new ArrayList<>();

    private Optional<String> baseTree = Optional.empty();

    public GitCreateTreeRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GitCreateTreeRequest(List<@Valid GitCreateTreeRequestTreeInner> tree) {
        this.tree = tree;
    }

    public GitCreateTreeRequest tree(List<@Valid GitCreateTreeRequestTreeInner> tree) {
        this.tree = tree;
        return this;
    }

    public GitCreateTreeRequest addTreeItem(GitCreateTreeRequestTreeInner treeItem) {
        if (this.tree == null) {
            this.tree = new ArrayList<>();
        }
        this.tree.add(treeItem);
        return this;
    }

    /**
     * Objects (of `path`, `mode`, `type`, and `sha`) specifying a tree structure.
     * @return tree
     */
    @NotNull
    @Valid
    @Schema(
            name = "tree",
            description = "Objects (of `path`, `mode`, `type`, and `sha`) specifying a tree structure.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("tree")
    public List<@Valid GitCreateTreeRequestTreeInner> getTree() {
        return tree;
    }

    public void setTree(List<@Valid GitCreateTreeRequestTreeInner> tree) {
        this.tree = tree;
    }

    public GitCreateTreeRequest baseTree(String baseTree) {
        this.baseTree = Optional.ofNullable(baseTree);
        return this;
    }

    /**
     * The SHA1 of an existing Git tree object which will be used as the base for the new tree. If provided, a new Git tree object will be created from entries in the Git tree object pointed to by `base_tree` and entries defined in the `tree` parameter. Entries defined in the `tree` parameter will overwrite items from `base_tree` with the same `path`. If you're creating new changes on a branch, then normally you'd set `base_tree` to the SHA1 of the Git tree object of the current latest commit on the branch you're working on. If not provided, GitHub will create a new Git tree object from only the entries defined in the `tree` parameter. If you create a new commit pointing to such a tree, then all files which were a part of the parent commit's tree and were not defined in the `tree` parameter will be listed as deleted by the new commit.
     * @return baseTree
     */
    @Schema(
            name = "base_tree",
            description =
                    "The SHA1 of an existing Git tree object which will be used as the base for the new tree. If provided, a new Git tree object will be created from entries in the Git tree object pointed to by `base_tree` and entries defined in the `tree` parameter. Entries defined in the `tree` parameter will overwrite items from `base_tree` with the same `path`. If you're creating new changes on a branch, then normally you'd set `base_tree` to the SHA1 of the Git tree object of the current latest commit on the branch you're working on. If not provided, GitHub will create a new Git tree object from only the entries defined in the `tree` parameter. If you create a new commit pointing to such a tree, then all files which were a part of the parent commit's tree and were not defined in the `tree` parameter will be listed as deleted by the new commit.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("base_tree")
    public Optional<String> getBaseTree() {
        return baseTree;
    }

    public void setBaseTree(Optional<String> baseTree) {
        this.baseTree = baseTree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GitCreateTreeRequest gitCreateTreeRequest = (GitCreateTreeRequest) o;
        return Objects.equals(this.tree, gitCreateTreeRequest.tree)
                && Objects.equals(this.baseTree, gitCreateTreeRequest.baseTree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tree, baseTree);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitCreateTreeRequest {\n");
        sb.append("    tree: ").append(toIndentedString(tree)).append("\n");
        sb.append("    baseTree: ").append(toIndentedString(baseTree)).append("\n");
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
