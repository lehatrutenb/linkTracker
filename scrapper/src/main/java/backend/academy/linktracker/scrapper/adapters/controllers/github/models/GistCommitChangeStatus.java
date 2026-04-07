package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * GistCommitChangeStatus
 */
@JsonTypeName("gist_commit_change_status")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GistCommitChangeStatus {

    private Optional<Long> total = Optional.empty();

    private Optional<Long> additions = Optional.empty();

    private Optional<Long> deletions = Optional.empty();

    public GistCommitChangeStatus total(Long total) {
        this.total = Optional.ofNullable(total);
        return this;
    }

    /**
     * Get total
     * @return total
     */
    @Schema(name = "total", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total")
    public Optional<Long> getTotal() {
        return total;
    }

    public void setTotal(Optional<Long> total) {
        this.total = total;
    }

    public GistCommitChangeStatus additions(Long additions) {
        this.additions = Optional.ofNullable(additions);
        return this;
    }

    /**
     * Get additions
     * @return additions
     */
    @Schema(name = "additions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("additions")
    public Optional<Long> getAdditions() {
        return additions;
    }

    public void setAdditions(Optional<Long> additions) {
        this.additions = additions;
    }

    public GistCommitChangeStatus deletions(Long deletions) {
        this.deletions = Optional.ofNullable(deletions);
        return this;
    }

    /**
     * Get deletions
     * @return deletions
     */
    @Schema(name = "deletions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deletions")
    public Optional<Long> getDeletions() {
        return deletions;
    }

    public void setDeletions(Optional<Long> deletions) {
        this.deletions = deletions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GistCommitChangeStatus gistCommitChangeStatus = (GistCommitChangeStatus) o;
        return Objects.equals(this.total, gistCommitChangeStatus.total)
                && Objects.equals(this.additions, gistCommitChangeStatus.additions)
                && Objects.equals(this.deletions, gistCommitChangeStatus.deletions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, additions, deletions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GistCommitChangeStatus {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("    deletions: ").append(toIndentedString(deletions)).append("\n");
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
