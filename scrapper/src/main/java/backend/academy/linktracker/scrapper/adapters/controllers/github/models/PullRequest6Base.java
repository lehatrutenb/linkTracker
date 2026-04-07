package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * PullRequest6Base
 */
@JsonTypeName("Pull_Request_6_base")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequest6Base {

    private String label;

    private String ref;

    private Repository11 repo;

    private String sha;

    private JsonNullable<User1> user = JsonNullable.<User1>undefined();

    public PullRequest6Base() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequest6Base(String label, String ref, Repository11 repo, String sha, User1 user) {
        this.label = label;
        this.ref = ref;
        this.repo = repo;
        this.sha = sha;
        this.user = JsonNullable.of(user);
    }

    public PullRequest6Base label(String label) {
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

    public PullRequest6Base ref(String ref) {
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

    public PullRequest6Base repo(Repository11 repo) {
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
    public Repository11 getRepo() {
        return repo;
    }

    public void setRepo(Repository11 repo) {
        this.repo = repo;
    }

    public PullRequest6Base sha(String sha) {
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

    public PullRequest6Base user(User1 user) {
        this.user = JsonNullable.of(user);
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
    public JsonNullable<User1> getUser() {
        return user;
    }

    public void setUser(JsonNullable<User1> user) {
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
        PullRequest6Base pullRequest6Base = (PullRequest6Base) o;
        return Objects.equals(this.label, pullRequest6Base.label)
                && Objects.equals(this.ref, pullRequest6Base.ref)
                && Objects.equals(this.repo, pullRequest6Base.repo)
                && Objects.equals(this.sha, pullRequest6Base.sha)
                && Objects.equals(this.user, pullRequest6Base.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, ref, repo, sha, user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullRequest6Base {\n");
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
