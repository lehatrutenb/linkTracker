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
 * CheckRunPullRequestBase
 */
@JsonTypeName("Check_Run_Pull_Request_base")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CheckRunPullRequestBase {

    private String ref;

    private RepoRef repo;

    private String sha;

    public CheckRunPullRequestBase() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CheckRunPullRequestBase(String ref, RepoRef repo, String sha) {
        this.ref = ref;
        this.repo = repo;
        this.sha = sha;
    }

    public CheckRunPullRequestBase ref(String ref) {
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

    public CheckRunPullRequestBase repo(RepoRef repo) {
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
    public RepoRef getRepo() {
        return repo;
    }

    public void setRepo(RepoRef repo) {
        this.repo = repo;
    }

    public CheckRunPullRequestBase sha(String sha) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckRunPullRequestBase checkRunPullRequestBase = (CheckRunPullRequestBase) o;
        return Objects.equals(this.ref, checkRunPullRequestBase.ref)
                && Objects.equals(this.repo, checkRunPullRequestBase.repo)
                && Objects.equals(this.sha, checkRunPullRequestBase.sha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ref, repo, sha);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckRunPullRequestBase {\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
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
