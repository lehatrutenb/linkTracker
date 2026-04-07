package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Commit Search Result Item
 */
@Schema(name = "commit-search-result-item", description = "Commit Search Result Item")
@JsonTypeName("commit-search-result-item")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CommitSearchResultItem {

    private URI url;

    private String sha;

    private URI htmlUrl;

    private URI commentsUrl;

    private CommitSearchResultItemCommit commit;

    private JsonNullable<NullableSimpleUser> author = JsonNullable.<NullableSimpleUser>undefined();

    private JsonNullable<NullableGitUser> committer = JsonNullable.<NullableGitUser>undefined();

    @Valid
    private List<@Valid FileCommitCommitParentsInner> parents = new ArrayList<>();

    private MinimalRepository repository;

    private BigDecimal score;

    private String nodeId;

    @Valid
    private List<@Valid SearchResultTextMatchesInner> textMatches = new ArrayList<>();

    public CommitSearchResultItem() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CommitSearchResultItem(
            URI url,
            String sha,
            URI htmlUrl,
            URI commentsUrl,
            CommitSearchResultItemCommit commit,
            NullableSimpleUser author,
            NullableGitUser committer,
            List<@Valid FileCommitCommitParentsInner> parents,
            MinimalRepository repository,
            BigDecimal score,
            String nodeId) {
        this.url = url;
        this.sha = sha;
        this.htmlUrl = htmlUrl;
        this.commentsUrl = commentsUrl;
        this.commit = commit;
        this.author = JsonNullable.of(author);
        this.committer = JsonNullable.of(committer);
        this.parents = parents;
        this.repository = repository;
        this.score = score;
        this.nodeId = nodeId;
    }

    public CommitSearchResultItem url(URI url) {
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

    public CommitSearchResultItem sha(String sha) {
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

    public CommitSearchResultItem htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public CommitSearchResultItem commentsUrl(URI commentsUrl) {
        this.commentsUrl = commentsUrl;
        return this;
    }

    /**
     * Get commentsUrl
     * @return commentsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "comments_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("comments_url")
    public URI getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(URI commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public CommitSearchResultItem commit(CommitSearchResultItemCommit commit) {
        this.commit = commit;
        return this;
    }

    /**
     * Get commit
     * @return commit
     */
    @NotNull
    @Valid
    @Schema(name = "commit", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit")
    public CommitSearchResultItemCommit getCommit() {
        return commit;
    }

    public void setCommit(CommitSearchResultItemCommit commit) {
        this.commit = commit;
    }

    public CommitSearchResultItem author(NullableSimpleUser author) {
        this.author = JsonNullable.of(author);
        return this;
    }

    /**
     * Get author
     * @return author
     */
    @NotNull
    @Valid
    @Schema(name = "author", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("author")
    public JsonNullable<NullableSimpleUser> getAuthor() {
        return author;
    }

    public void setAuthor(JsonNullable<NullableSimpleUser> author) {
        this.author = author;
    }

    public CommitSearchResultItem committer(NullableGitUser committer) {
        this.committer = JsonNullable.of(committer);
        return this;
    }

    /**
     * Get committer
     * @return committer
     */
    @NotNull
    @Valid
    @Schema(name = "committer", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("committer")
    public JsonNullable<NullableGitUser> getCommitter() {
        return committer;
    }

    public void setCommitter(JsonNullable<NullableGitUser> committer) {
        this.committer = committer;
    }

    public CommitSearchResultItem parents(List<@Valid FileCommitCommitParentsInner> parents) {
        this.parents = parents;
        return this;
    }

    public CommitSearchResultItem addParentsItem(FileCommitCommitParentsInner parentsItem) {
        if (this.parents == null) {
            this.parents = new ArrayList<>();
        }
        this.parents.add(parentsItem);
        return this;
    }

    /**
     * Get parents
     * @return parents
     */
    @NotNull
    @Valid
    @Schema(name = "parents", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("parents")
    public List<@Valid FileCommitCommitParentsInner> getParents() {
        return parents;
    }

    public void setParents(List<@Valid FileCommitCommitParentsInner> parents) {
        this.parents = parents;
    }

    public CommitSearchResultItem repository(MinimalRepository repository) {
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

    public CommitSearchResultItem score(BigDecimal score) {
        this.score = score;
        return this;
    }

    /**
     * Get score
     * @return score
     */
    @NotNull
    @Valid
    @Schema(name = "score", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("score")
    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public CommitSearchResultItem nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public CommitSearchResultItem textMatches(List<@Valid SearchResultTextMatchesInner> textMatches) {
        this.textMatches = textMatches;
        return this;
    }

    public CommitSearchResultItem addTextMatchesItem(SearchResultTextMatchesInner textMatchesItem) {
        if (this.textMatches == null) {
            this.textMatches = new ArrayList<>();
        }
        this.textMatches.add(textMatchesItem);
        return this;
    }

    /**
     * Get textMatches
     * @return textMatches
     */
    @Valid
    @Schema(name = "text_matches", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("text_matches")
    public List<@Valid SearchResultTextMatchesInner> getTextMatches() {
        return textMatches;
    }

    public void setTextMatches(List<@Valid SearchResultTextMatchesInner> textMatches) {
        this.textMatches = textMatches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommitSearchResultItem commitSearchResultItem = (CommitSearchResultItem) o;
        return Objects.equals(this.url, commitSearchResultItem.url)
                && Objects.equals(this.sha, commitSearchResultItem.sha)
                && Objects.equals(this.htmlUrl, commitSearchResultItem.htmlUrl)
                && Objects.equals(this.commentsUrl, commitSearchResultItem.commentsUrl)
                && Objects.equals(this.commit, commitSearchResultItem.commit)
                && Objects.equals(this.author, commitSearchResultItem.author)
                && Objects.equals(this.committer, commitSearchResultItem.committer)
                && Objects.equals(this.parents, commitSearchResultItem.parents)
                && Objects.equals(this.repository, commitSearchResultItem.repository)
                && Objects.equals(this.score, commitSearchResultItem.score)
                && Objects.equals(this.nodeId, commitSearchResultItem.nodeId)
                && Objects.equals(this.textMatches, commitSearchResultItem.textMatches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                url,
                sha,
                htmlUrl,
                commentsUrl,
                commit,
                author,
                committer,
                parents,
                repository,
                score,
                nodeId,
                textMatches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommitSearchResultItem {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    commentsUrl: ").append(toIndentedString(commentsUrl)).append("\n");
        sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
        sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    textMatches: ").append(toIndentedString(textMatches)).append("\n");
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
