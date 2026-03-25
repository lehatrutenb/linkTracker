package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Combined Commit Status
 */
@Schema(name = "combined-commit-status", description = "Combined Commit Status")
@JsonTypeName("combined-commit-status")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CombinedCommitStatus {

    private String state;

    @Valid
    private List<@Valid SimpleCommitStatus> statuses = new ArrayList<>();

    private String sha;

    private Long totalCount;

    private MinimalRepository repository;

    private URI commitUrl;

    private URI url;

    public CombinedCommitStatus() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CombinedCommitStatus(
            String state,
            List<@Valid SimpleCommitStatus> statuses,
            String sha,
            Long totalCount,
            MinimalRepository repository,
            URI commitUrl,
            URI url) {
        this.state = state;
        this.statuses = statuses;
        this.sha = sha;
        this.totalCount = totalCount;
        this.repository = repository;
        this.commitUrl = commitUrl;
        this.url = url;
    }

    public CombinedCommitStatus state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @NotNull
    @Schema(name = "state", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public CombinedCommitStatus statuses(List<@Valid SimpleCommitStatus> statuses) {
        this.statuses = statuses;
        return this;
    }

    public CombinedCommitStatus addStatusesItem(SimpleCommitStatus statusesItem) {
        if (this.statuses == null) {
            this.statuses = new ArrayList<>();
        }
        this.statuses.add(statusesItem);
        return this;
    }

    /**
     * Get statuses
     * @return statuses
     */
    @NotNull
    @Valid
    @Schema(name = "statuses", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("statuses")
    public List<@Valid SimpleCommitStatus> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<@Valid SimpleCommitStatus> statuses) {
        this.statuses = statuses;
    }

    public CombinedCommitStatus sha(String sha) {
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

    public CombinedCommitStatus totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get totalCount
     * @return totalCount
     */
    @NotNull
    @Schema(name = "total_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total_count")
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public CombinedCommitStatus repository(MinimalRepository repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @NotNull
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository")
    public MinimalRepository getRepository() {
        return repository;
    }

    public void setRepository(MinimalRepository repository) {
        this.repository = repository;
    }

    public CombinedCommitStatus commitUrl(URI commitUrl) {
        this.commitUrl = commitUrl;
        return this;
    }

    /**
     * Get commitUrl
     * @return commitUrl
     */
    @NotNull
    @Valid
    @Schema(name = "commit_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_url")
    public URI getCommitUrl() {
        return commitUrl;
    }

    public void setCommitUrl(URI commitUrl) {
        this.commitUrl = commitUrl;
    }

    public CombinedCommitStatus url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CombinedCommitStatus combinedCommitStatus = (CombinedCommitStatus) o;
        return Objects.equals(this.state, combinedCommitStatus.state)
                && Objects.equals(this.statuses, combinedCommitStatus.statuses)
                && Objects.equals(this.sha, combinedCommitStatus.sha)
                && Objects.equals(this.totalCount, combinedCommitStatus.totalCount)
                && Objects.equals(this.repository, combinedCommitStatus.repository)
                && Objects.equals(this.commitUrl, combinedCommitStatus.commitUrl)
                && Objects.equals(this.url, combinedCommitStatus.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, statuses, sha, totalCount, repository, commitUrl, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CombinedCommitStatus {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    commitUrl: ").append(toIndentedString(commitUrl)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
