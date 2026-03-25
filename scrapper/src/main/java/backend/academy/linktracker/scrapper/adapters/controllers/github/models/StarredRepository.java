package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Starred Repository
 */
@Schema(name = "starred-repository", description = "Starred Repository")
@JsonTypeName("starred-repository")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class StarredRepository {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime starredAt;

    private Repository repo;

    public StarredRepository() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public StarredRepository(OffsetDateTime starredAt, Repository repo) {
        this.starredAt = starredAt;
        this.repo = repo;
    }

    public StarredRepository starredAt(OffsetDateTime starredAt) {
        this.starredAt = starredAt;
        return this;
    }

    /**
     * Get starredAt
     * @return starredAt
     */
    @NotNull
    @Valid
    @Schema(name = "starred_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("starred_at")
    public OffsetDateTime getStarredAt() {
        return starredAt;
    }

    public void setStarredAt(OffsetDateTime starredAt) {
        this.starredAt = starredAt;
    }

    public StarredRepository repo(Repository repo) {
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
    public Repository getRepo() {
        return repo;
    }

    public void setRepo(Repository repo) {
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
        StarredRepository starredRepository = (StarredRepository) o;
        return Objects.equals(this.starredAt, starredRepository.starredAt)
                && Objects.equals(this.repo, starredRepository.repo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(starredAt, repo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StarredRepository {\n");
        sb.append("    starredAt: ").append(toIndentedString(starredAt)).append("\n");
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
