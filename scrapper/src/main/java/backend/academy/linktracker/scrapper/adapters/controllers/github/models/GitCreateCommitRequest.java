package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GitCreateCommitRequest
 */
@JsonTypeName("git_create_commit_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GitCreateCommitRequest {

    private String message;

    private String tree;

    @Valid
    private List<String> parents = new ArrayList<>();

    private GitCreateCommitRequestAuthor author;

    private GitCreateCommitRequestCommitter committer;

    private String signature;

    public GitCreateCommitRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GitCreateCommitRequest(String message, String tree) {
        this.message = message;
        this.tree = tree;
    }

    public GitCreateCommitRequest message(String message) {
        this.message = message;
        return this;
    }

    /**
     * The commit message
     * @return message
     */
    @NotNull
    @Schema(name = "message", description = "The commit message", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public GitCreateCommitRequest tree(String tree) {
        this.tree = tree;
        return this;
    }

    /**
     * The SHA of the tree object this commit points to
     * @return tree
     */
    @NotNull
    @Schema(
            name = "tree",
            description = "The SHA of the tree object this commit points to",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("tree")
    public String getTree() {
        return tree;
    }

    public void setTree(String tree) {
        this.tree = tree;
    }

    public GitCreateCommitRequest parents(List<String> parents) {
        this.parents = parents;
        return this;
    }

    public GitCreateCommitRequest addParentsItem(String parentsItem) {
        if (this.parents == null) {
            this.parents = new ArrayList<>();
        }
        this.parents.add(parentsItem);
        return this;
    }

    /**
     * The full SHAs of the commits that were the parents of this commit. If omitted or empty, the commit will be written as a root commit. For a single parent, an array of one SHA should be provided; for a merge commit, an array of more than one should be provided.
     * @return parents
     */
    @Schema(
            name = "parents",
            description =
                    "The full SHAs of the commits that were the parents of this commit. If omitted or empty, the commit will be written as a root commit. For a single parent, an array of one SHA should be provided; for a merge commit, an array of more than one should be provided.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("parents")
    public List<String> getParents() {
        return parents;
    }

    public void setParents(List<String> parents) {
        this.parents = parents;
    }

    public GitCreateCommitRequest author(GitCreateCommitRequestAuthor author) {
        this.author = author;
        return this;
    }

    /**
     * Get author
     * @return author
     */
    @Valid
    @Schema(name = "author", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("author")
    public GitCreateCommitRequestAuthor getAuthor() {
        return author;
    }

    public void setAuthor(GitCreateCommitRequestAuthor author) {
        this.author = author;
    }

    public GitCreateCommitRequest committer(GitCreateCommitRequestCommitter committer) {
        this.committer = committer;
        return this;
    }

    /**
     * Get committer
     * @return committer
     */
    @Valid
    @Schema(name = "committer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("committer")
    public GitCreateCommitRequestCommitter getCommitter() {
        return committer;
    }

    public void setCommitter(GitCreateCommitRequestCommitter committer) {
        this.committer = committer;
    }

    public GitCreateCommitRequest signature(String signature) {
        this.signature = signature;
        return this;
    }

    /**
     * The [PGP signature](https://en.wikipedia.org/wiki/Pretty_Good_Privacy) of the commit. GitHub adds the signature to the `gpgsig` header of the created commit. For a commit signature to be verifiable by Git or GitHub, it must be an ASCII-armored detached PGP signature over the string commit as it would be written to the object database. To pass a `signature` parameter, you need to first manually create a valid PGP signature, which can be complicated. You may find it easier to [use the command line](https://git-scm.com/book/id/v2/Git-Tools-Signing-Your-Work) to create signed commits.
     * @return signature
     */
    @Schema(
            name = "signature",
            description =
                    "The [PGP signature](https://en.wikipedia.org/wiki/Pretty_Good_Privacy) of the commit. GitHub adds the signature to the `gpgsig` header of the created commit. For a commit signature to be verifiable by Git or GitHub, it must be an ASCII-armored detached PGP signature over the string commit as it would be written to the object database. To pass a `signature` parameter, you need to first manually create a valid PGP signature, which can be complicated. You may find it easier to [use the command line](https://git-scm.com/book/id/v2/Git-Tools-Signing-Your-Work) to create signed commits.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("signature")
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GitCreateCommitRequest gitCreateCommitRequest = (GitCreateCommitRequest) o;
        return Objects.equals(this.message, gitCreateCommitRequest.message)
                && Objects.equals(this.tree, gitCreateCommitRequest.tree)
                && Objects.equals(this.parents, gitCreateCommitRequest.parents)
                && Objects.equals(this.author, gitCreateCommitRequest.author)
                && Objects.equals(this.committer, gitCreateCommitRequest.committer)
                && Objects.equals(this.signature, gitCreateCommitRequest.signature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, tree, parents, author, committer, signature);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitCreateCommitRequest {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    tree: ").append(toIndentedString(tree)).append("\n");
        sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
        sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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
