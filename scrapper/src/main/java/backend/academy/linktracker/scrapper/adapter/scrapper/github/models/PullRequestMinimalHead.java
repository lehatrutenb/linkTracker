package backend.academy.linktracker.scrapper.adapter.scrapper.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.Objects;

/**
 * PullRequestMinimalHead
 */
@JsonTypeName("Pull_Request_Minimal_head")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequestMinimalHead {

    private String ref;

    private String sha;

    private PullRequestMinimalHeadRepo repo;

    public PullRequestMinimalHead() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequestMinimalHead(String ref, String sha, PullRequestMinimalHeadRepo repo) {
        this.ref = ref;
        this.sha = sha;
        this.repo = repo;
    }

    public PullRequestMinimalHead ref(String ref) {
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

    public PullRequestMinimalHead sha(String sha) {
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

    public PullRequestMinimalHead repo(PullRequestMinimalHeadRepo repo) {
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
    public PullRequestMinimalHeadRepo getRepo() {
        return repo;
    }

    public void setRepo(PullRequestMinimalHeadRepo repo) {
        this.repo = repo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PullRequestMinimalHead pullRequestMinimalHead = (PullRequestMinimalHead) o;
        return Objects.equals(this.ref, pullRequestMinimalHead.ref)
                && Objects.equals(this.sha, pullRequestMinimalHead.sha)
                && Objects.equals(this.repo, pullRequestMinimalHead.repo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ref, sha, repo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullRequestMinimalHead {\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
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
