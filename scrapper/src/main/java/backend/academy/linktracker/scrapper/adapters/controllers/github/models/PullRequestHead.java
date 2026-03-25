package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * PullRequestHead
 */
@JsonTypeName("Pull_Request_head")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequestHead {

    private String label = null;

    private String ref;

    private Repository4 repo = null;

    private String sha;

    private User1 user = null;

    public PullRequestHead() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequestHead(String label, String ref, Repository4 repo, String sha, User1 user) {
        this.label = label;
        this.ref = ref;
        this.repo = repo;
        this.sha = sha;
        this.user = user;
    }

    public PullRequestHead label(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get label
     * @return label
     */
    @NotNull
    @Schema(name = "label", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public PullRequestHead ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * Get ref
     * @return ref
     */
    @NotNull
    @Schema(name = "ref", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public PullRequestHead repo(Repository4 repo) {
        this.repo = repo;
        return this;
    }

    /**
     * Get repo
     * @return repo
     */
    @NotNull
    @Valid
    @Schema(name = "repo", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repo")
    public Repository4 getRepo() {
        return repo;
    }

    public void setRepo(Repository4 repo) {
        this.repo = repo;
    }

    public PullRequestHead sha(String sha) {
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

    public PullRequestHead user(User1 user) {
        this.user = user;
        return this;
    }

    /**
     * Get user
     * @return user
     */
    @NotNull
    @Valid
    @Schema(name = "user", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("user")
    public User1 getUser() {
        return user;
    }

    public void setUser(User1 user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PullRequestHead pullRequestHead = (PullRequestHead) o;
        return Objects.equals(this.label, pullRequestHead.label)
                && Objects.equals(this.ref, pullRequestHead.ref)
                && Objects.equals(this.repo, pullRequestHead.repo)
                && Objects.equals(this.sha, pullRequestHead.sha)
                && Objects.equals(this.user, pullRequestHead.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, ref, repo, sha, user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullRequestHead {\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
