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
 * PullRequest12Head
 */
@JsonTypeName("Pull_Request_12_head")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequest12Head {

    private JsonNullable<String> label = JsonNullable.<String>undefined();

    private String ref;

    private JsonNullable<Repository15> repo = JsonNullable.<Repository15>undefined();

    private String sha;

    private JsonNullable<User1> user = JsonNullable.<User1>undefined();

    public PullRequest12Head() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequest12Head(String label, String ref, Repository15 repo, String sha, User1 user) {
        this.label = JsonNullable.of(label);
        this.ref = ref;
        this.repo = JsonNullable.of(repo);
        this.sha = sha;
        this.user = JsonNullable.of(user);
    }

    public PullRequest12Head label(String label) {
        this.label = JsonNullable.of(label);
        return this;
    }

    /**
     * Get label
     * @return label
     */
    @NotNull
    @Schema(name = "label", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("label")
    public JsonNullable<String> getLabel() {
        return label;
    }

    public void setLabel(JsonNullable<String> label) {
        this.label = label;
    }

    public PullRequest12Head ref(String ref) {
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

    public PullRequest12Head repo(Repository15 repo) {
        this.repo = JsonNullable.of(repo);
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
    public JsonNullable<Repository15> getRepo() {
        return repo;
    }

    public void setRepo(JsonNullable<Repository15> repo) {
        this.repo = repo;
    }

    public PullRequest12Head sha(String sha) {
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

    public PullRequest12Head user(User1 user) {
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
        PullRequest12Head pullRequest12Head = (PullRequest12Head) o;
        return Objects.equals(this.label, pullRequest12Head.label)
                && Objects.equals(this.ref, pullRequest12Head.ref)
                && Objects.equals(this.repo, pullRequest12Head.repo)
                && Objects.equals(this.sha, pullRequest12Head.sha)
                && Objects.equals(this.user, pullRequest12Head.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, ref, repo, sha, user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullRequest12Head {\n");
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
