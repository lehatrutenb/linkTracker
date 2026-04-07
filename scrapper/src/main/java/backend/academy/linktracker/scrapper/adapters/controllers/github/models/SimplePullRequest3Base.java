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
 * SimplePullRequest3Base
 */
@JsonTypeName("Simple_Pull_Request_3_base")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SimplePullRequest3Base {

    private String label;

    private String ref;

    private Repository12 repo;

    private String sha;

    private JsonNullable<User1> user = JsonNullable.<User1>undefined();

    public SimplePullRequest3Base() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SimplePullRequest3Base(String label, String ref, Repository12 repo, String sha, User1 user) {
        this.label = label;
        this.ref = ref;
        this.repo = repo;
        this.sha = sha;
        this.user = JsonNullable.of(user);
    }

    public SimplePullRequest3Base label(String label) {
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

    public SimplePullRequest3Base ref(String ref) {
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

    public SimplePullRequest3Base repo(Repository12 repo) {
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
    public Repository12 getRepo() {
        return repo;
    }

    public void setRepo(Repository12 repo) {
        this.repo = repo;
    }

    public SimplePullRequest3Base sha(String sha) {
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

    public SimplePullRequest3Base user(User1 user) {
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
        SimplePullRequest3Base simplePullRequest3Base = (SimplePullRequest3Base) o;
        return Objects.equals(this.label, simplePullRequest3Base.label)
                && Objects.equals(this.ref, simplePullRequest3Base.ref)
                && Objects.equals(this.repo, simplePullRequest3Base.repo)
                && Objects.equals(this.sha, simplePullRequest3Base.sha)
                && Objects.equals(this.user, simplePullRequest3Base.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, ref, repo, sha, user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimplePullRequest3Base {\n");
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
