package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Repo Search Result Item
 */
@Schema(name = "repo-search-result-item", description = "Repo Search Result Item")
@JsonTypeName("repo-search-result-item")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepoSearchResultItem {

    private Long id;

    private String nodeId;

    private String name;

    private String fullName;

    private JsonNullable<NullableSimpleUser> owner = JsonNullable.<NullableSimpleUser>undefined();

    private Boolean _private;

    private URI htmlUrl;

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    private Boolean fork;

    private URI url;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime pushedAt;

    private JsonNullable<URI> homepage = JsonNullable.<URI>undefined();

    private Long size;

    private Long stargazersCount;

    private Long watchersCount;

    private JsonNullable<String> language = JsonNullable.<String>undefined();

    private Long forksCount;

    private Long openIssuesCount;

    private Optional<String> masterBranch = Optional.empty();

    private String defaultBranch;

    private BigDecimal score;

    private URI forksUrl;

    private String keysUrl;

    private String collaboratorsUrl;

    private URI teamsUrl;

    private URI hooksUrl;

    private String issueEventsUrl;

    private URI eventsUrl;

    private String assigneesUrl;

    private String branchesUrl;

    private URI tagsUrl;

    private String blobsUrl;

    private String gitTagsUrl;

    private String gitRefsUrl;

    private String treesUrl;

    private String statusesUrl;

    private URI languagesUrl;

    private URI stargazersUrl;

    private URI contributorsUrl;

    private URI subscribersUrl;

    private URI subscriptionUrl;

    private String commitsUrl;

    private String gitCommitsUrl;

    private String commentsUrl;

    private String issueCommentUrl;

    private String contentsUrl;

    private String compareUrl;

    private URI mergesUrl;

    private String archiveUrl;

    private URI downloadsUrl;

    private String issuesUrl;

    private String pullsUrl;

    private String milestonesUrl;

    private String notificationsUrl;

    private String labelsUrl;

    private String releasesUrl;

    private URI deploymentsUrl;

    private String gitUrl;

    private String sshUrl;

    private String cloneUrl;

    private URI svnUrl;

    private Long forks;

    private Long openIssues;

    private Long watchers;

    @Valid
    private List<String> topics = new ArrayList<>();

    private JsonNullable<URI> mirrorUrl = JsonNullable.<URI>undefined();

    private Boolean hasIssues;

    private Boolean hasProjects;

    private Boolean hasPages;

    private Boolean hasWiki;

    private Boolean hasDownloads;

    private Optional<Boolean> hasDiscussions = Optional.empty();

    private Optional<Boolean> hasPullRequests = Optional.empty();

    /**
     * The policy controlling who can create pull requests: all or collaborators_only.
     */
    public enum PullRequestCreationPolicyEnum {
        ALL("all"),

        COLLABORATORS_ONLY("collaborators_only");

        private final String value;

        PullRequestCreationPolicyEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PullRequestCreationPolicyEnum fromValue(String value) {
            for (PullRequestCreationPolicyEnum b : PullRequestCreationPolicyEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<PullRequestCreationPolicyEnum> pullRequestCreationPolicy = Optional.empty();

    private Optional<Boolean> hasCommitComments = Optional.empty();

    private Boolean archived;

    private Boolean disabled;

    private Optional<String> visibility = Optional.empty();

    private JsonNullable<NullableLicenseSimple> license = JsonNullable.<NullableLicenseSimple>undefined();

    private Optional<FullRepositoryPermissions> permissions = Optional.empty();

    @Valid
    private List<@Valid SearchResultTextMatchesInner> textMatches = new ArrayList<>();

    private Optional<String> tempCloneToken = Optional.empty();

    private Optional<Boolean> allowMergeCommit = Optional.empty();

    private Optional<Boolean> allowSquashMerge = Optional.empty();

    private Optional<Boolean> allowRebaseMerge = Optional.empty();

    private Optional<Boolean> allowAutoMerge = Optional.empty();

    private Optional<Boolean> deleteBranchOnMerge = Optional.empty();

    private Optional<Boolean> allowForking = Optional.empty();

    private Optional<Boolean> isTemplate = Optional.empty();

    private Optional<Boolean> webCommitSignoffRequired = Optional.empty();

    public RepoSearchResultItem() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepoSearchResultItem(
            Long id,
            String nodeId,
            String name,
            String fullName,
            NullableSimpleUser owner,
            Boolean _private,
            URI htmlUrl,
            String description,
            Boolean fork,
            URI url,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            OffsetDateTime pushedAt,
            URI homepage,
            Long size,
            Long stargazersCount,
            Long watchersCount,
            String language,
            Long forksCount,
            Long openIssuesCount,
            String defaultBranch,
            BigDecimal score,
            URI forksUrl,
            String keysUrl,
            String collaboratorsUrl,
            URI teamsUrl,
            URI hooksUrl,
            String issueEventsUrl,
            URI eventsUrl,
            String assigneesUrl,
            String branchesUrl,
            URI tagsUrl,
            String blobsUrl,
            String gitTagsUrl,
            String gitRefsUrl,
            String treesUrl,
            String statusesUrl,
            URI languagesUrl,
            URI stargazersUrl,
            URI contributorsUrl,
            URI subscribersUrl,
            URI subscriptionUrl,
            String commitsUrl,
            String gitCommitsUrl,
            String commentsUrl,
            String issueCommentUrl,
            String contentsUrl,
            String compareUrl,
            URI mergesUrl,
            String archiveUrl,
            URI downloadsUrl,
            String issuesUrl,
            String pullsUrl,
            String milestonesUrl,
            String notificationsUrl,
            String labelsUrl,
            String releasesUrl,
            URI deploymentsUrl,
            String gitUrl,
            String sshUrl,
            String cloneUrl,
            URI svnUrl,
            Long forks,
            Long openIssues,
            Long watchers,
            URI mirrorUrl,
            Boolean hasIssues,
            Boolean hasProjects,
            Boolean hasPages,
            Boolean hasWiki,
            Boolean hasDownloads,
            Boolean archived,
            Boolean disabled,
            NullableLicenseSimple license) {
        this.id = id;
        this.nodeId = nodeId;
        this.name = name;
        this.fullName = fullName;
        this.owner = JsonNullable.of(owner);
        this._private = _private;
        this.htmlUrl = htmlUrl;
        this.description = JsonNullable.of(description);
        this.fork = fork;
        this.url = url;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.pushedAt = pushedAt;
        this.homepage = JsonNullable.of(homepage);
        this.size = size;
        this.stargazersCount = stargazersCount;
        this.watchersCount = watchersCount;
        this.language = JsonNullable.of(language);
        this.forksCount = forksCount;
        this.openIssuesCount = openIssuesCount;
        this.defaultBranch = defaultBranch;
        this.score = score;
        this.forksUrl = forksUrl;
        this.keysUrl = keysUrl;
        this.collaboratorsUrl = collaboratorsUrl;
        this.teamsUrl = teamsUrl;
        this.hooksUrl = hooksUrl;
        this.issueEventsUrl = issueEventsUrl;
        this.eventsUrl = eventsUrl;
        this.assigneesUrl = assigneesUrl;
        this.branchesUrl = branchesUrl;
        this.tagsUrl = tagsUrl;
        this.blobsUrl = blobsUrl;
        this.gitTagsUrl = gitTagsUrl;
        this.gitRefsUrl = gitRefsUrl;
        this.treesUrl = treesUrl;
        this.statusesUrl = statusesUrl;
        this.languagesUrl = languagesUrl;
        this.stargazersUrl = stargazersUrl;
        this.contributorsUrl = contributorsUrl;
        this.subscribersUrl = subscribersUrl;
        this.subscriptionUrl = subscriptionUrl;
        this.commitsUrl = commitsUrl;
        this.gitCommitsUrl = gitCommitsUrl;
        this.commentsUrl = commentsUrl;
        this.issueCommentUrl = issueCommentUrl;
        this.contentsUrl = contentsUrl;
        this.compareUrl = compareUrl;
        this.mergesUrl = mergesUrl;
        this.archiveUrl = archiveUrl;
        this.downloadsUrl = downloadsUrl;
        this.issuesUrl = issuesUrl;
        this.pullsUrl = pullsUrl;
        this.milestonesUrl = milestonesUrl;
        this.notificationsUrl = notificationsUrl;
        this.labelsUrl = labelsUrl;
        this.releasesUrl = releasesUrl;
        this.deploymentsUrl = deploymentsUrl;
        this.gitUrl = gitUrl;
        this.sshUrl = sshUrl;
        this.cloneUrl = cloneUrl;
        this.svnUrl = svnUrl;
        this.forks = forks;
        this.openIssues = openIssues;
        this.watchers = watchers;
        this.mirrorUrl = JsonNullable.of(mirrorUrl);
        this.hasIssues = hasIssues;
        this.hasProjects = hasProjects;
        this.hasPages = hasPages;
        this.hasWiki = hasWiki;
        this.hasDownloads = hasDownloads;
        this.archived = archived;
        this.disabled = disabled;
        this.license = JsonNullable.of(license);
    }

    public RepoSearchResultItem id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RepoSearchResultItem nodeId(String nodeId) {
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

    public RepoSearchResultItem name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RepoSearchResultItem fullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * Get fullName
     * @return fullName
     */
    @NotNull
    @Schema(name = "full_name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public RepoSearchResultItem owner(NullableSimpleUser owner) {
        this.owner = JsonNullable.of(owner);
        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    @NotNull
    @Valid
    @Schema(name = "owner", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("owner")
    public JsonNullable<NullableSimpleUser> getOwner() {
        return owner;
    }

    public void setOwner(JsonNullable<NullableSimpleUser> owner) {
        this.owner = owner;
    }

    public RepoSearchResultItem _private(Boolean _private) {
        this._private = _private;
        return this;
    }

    /**
     * Get _private
     * @return _private
     */
    @NotNull
    @Schema(name = "private", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("private")
    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public RepoSearchResultItem htmlUrl(URI htmlUrl) {
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

    public RepoSearchResultItem description(String description) {
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public RepoSearchResultItem fork(Boolean fork) {
        this.fork = fork;
        return this;
    }

    /**
     * Get fork
     * @return fork
     */
    @NotNull
    @Schema(name = "fork", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("fork")
    public Boolean getFork() {
        return fork;
    }

    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    public RepoSearchResultItem url(URI url) {
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

    public RepoSearchResultItem createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public RepoSearchResultItem updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public RepoSearchResultItem pushedAt(OffsetDateTime pushedAt) {
        this.pushedAt = pushedAt;
        return this;
    }

    /**
     * Get pushedAt
     * @return pushedAt
     */
    @NotNull
    @Valid
    @Schema(name = "pushed_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pushed_at")
    public OffsetDateTime getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(OffsetDateTime pushedAt) {
        this.pushedAt = pushedAt;
    }

    public RepoSearchResultItem homepage(URI homepage) {
        this.homepage = JsonNullable.of(homepage);
        return this;
    }

    /**
     * Get homepage
     * @return homepage
     */
    @NotNull
    @Valid
    @Schema(name = "homepage", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("homepage")
    public JsonNullable<URI> getHomepage() {
        return homepage;
    }

    public void setHomepage(JsonNullable<URI> homepage) {
        this.homepage = homepage;
    }

    public RepoSearchResultItem size(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get size
     * @return size
     */
    @NotNull
    @Schema(name = "size", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("size")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public RepoSearchResultItem stargazersCount(Long stargazersCount) {
        this.stargazersCount = stargazersCount;
        return this;
    }

    /**
     * Get stargazersCount
     * @return stargazersCount
     */
    @NotNull
    @Schema(name = "stargazers_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("stargazers_count")
    public Long getStargazersCount() {
        return stargazersCount;
    }

    public void setStargazersCount(Long stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    public RepoSearchResultItem watchersCount(Long watchersCount) {
        this.watchersCount = watchersCount;
        return this;
    }

    /**
     * Get watchersCount
     * @return watchersCount
     */
    @NotNull
    @Schema(name = "watchers_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("watchers_count")
    public Long getWatchersCount() {
        return watchersCount;
    }

    public void setWatchersCount(Long watchersCount) {
        this.watchersCount = watchersCount;
    }

    public RepoSearchResultItem language(String language) {
        this.language = JsonNullable.of(language);
        return this;
    }

    /**
     * Get language
     * @return language
     */
    @NotNull
    @Schema(name = "language", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("language")
    public JsonNullable<String> getLanguage() {
        return language;
    }

    public void setLanguage(JsonNullable<String> language) {
        this.language = language;
    }

    public RepoSearchResultItem forksCount(Long forksCount) {
        this.forksCount = forksCount;
        return this;
    }

    /**
     * Get forksCount
     * @return forksCount
     */
    @NotNull
    @Schema(name = "forks_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("forks_count")
    public Long getForksCount() {
        return forksCount;
    }

    public void setForksCount(Long forksCount) {
        this.forksCount = forksCount;
    }

    public RepoSearchResultItem openIssuesCount(Long openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
        return this;
    }

    /**
     * Get openIssuesCount
     * @return openIssuesCount
     */
    @NotNull
    @Schema(name = "open_issues_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("open_issues_count")
    public Long getOpenIssuesCount() {
        return openIssuesCount;
    }

    public void setOpenIssuesCount(Long openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    public RepoSearchResultItem masterBranch(String masterBranch) {
        this.masterBranch = Optional.ofNullable(masterBranch);
        return this;
    }

    /**
     * Get masterBranch
     * @return masterBranch
     */
    @Schema(name = "master_branch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("master_branch")
    public Optional<String> getMasterBranch() {
        return masterBranch;
    }

    public void setMasterBranch(Optional<String> masterBranch) {
        this.masterBranch = masterBranch;
    }

    public RepoSearchResultItem defaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }

    /**
     * Get defaultBranch
     * @return defaultBranch
     */
    @NotNull
    @Schema(name = "default_branch", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("default_branch")
    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public RepoSearchResultItem score(BigDecimal score) {
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

    public RepoSearchResultItem forksUrl(URI forksUrl) {
        this.forksUrl = forksUrl;
        return this;
    }

    /**
     * Get forksUrl
     * @return forksUrl
     */
    @NotNull
    @Valid
    @Schema(name = "forks_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("forks_url")
    public URI getForksUrl() {
        return forksUrl;
    }

    public void setForksUrl(URI forksUrl) {
        this.forksUrl = forksUrl;
    }

    public RepoSearchResultItem keysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
        return this;
    }

    /**
     * Get keysUrl
     * @return keysUrl
     */
    @NotNull
    @Schema(name = "keys_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("keys_url")
    public String getKeysUrl() {
        return keysUrl;
    }

    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    public RepoSearchResultItem collaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
        return this;
    }

    /**
     * Get collaboratorsUrl
     * @return collaboratorsUrl
     */
    @NotNull
    @Schema(name = "collaborators_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("collaborators_url")
    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    public RepoSearchResultItem teamsUrl(URI teamsUrl) {
        this.teamsUrl = teamsUrl;
        return this;
    }

    /**
     * Get teamsUrl
     * @return teamsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "teams_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("teams_url")
    public URI getTeamsUrl() {
        return teamsUrl;
    }

    public void setTeamsUrl(URI teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public RepoSearchResultItem hooksUrl(URI hooksUrl) {
        this.hooksUrl = hooksUrl;
        return this;
    }

    /**
     * Get hooksUrl
     * @return hooksUrl
     */
    @NotNull
    @Valid
    @Schema(name = "hooks_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("hooks_url")
    public URI getHooksUrl() {
        return hooksUrl;
    }

    public void setHooksUrl(URI hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public RepoSearchResultItem issueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
        return this;
    }

    /**
     * Get issueEventsUrl
     * @return issueEventsUrl
     */
    @NotNull
    @Schema(name = "issue_events_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue_events_url")
    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    public RepoSearchResultItem eventsUrl(URI eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    /**
     * Get eventsUrl
     * @return eventsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "events_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("events_url")
    public URI getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(URI eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public RepoSearchResultItem assigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
        return this;
    }

    /**
     * Get assigneesUrl
     * @return assigneesUrl
     */
    @NotNull
    @Schema(name = "assignees_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("assignees_url")
    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    public RepoSearchResultItem branchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
        return this;
    }

    /**
     * Get branchesUrl
     * @return branchesUrl
     */
    @NotNull
    @Schema(name = "branches_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("branches_url")
    public String getBranchesUrl() {
        return branchesUrl;
    }

    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    public RepoSearchResultItem tagsUrl(URI tagsUrl) {
        this.tagsUrl = tagsUrl;
        return this;
    }

    /**
     * Get tagsUrl
     * @return tagsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "tags_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("tags_url")
    public URI getTagsUrl() {
        return tagsUrl;
    }

    public void setTagsUrl(URI tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    public RepoSearchResultItem blobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
        return this;
    }

    /**
     * Get blobsUrl
     * @return blobsUrl
     */
    @NotNull
    @Schema(name = "blobs_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("blobs_url")
    public String getBlobsUrl() {
        return blobsUrl;
    }

    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    public RepoSearchResultItem gitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
        return this;
    }

    /**
     * Get gitTagsUrl
     * @return gitTagsUrl
     */
    @NotNull
    @Schema(name = "git_tags_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("git_tags_url")
    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    public RepoSearchResultItem gitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
        return this;
    }

    /**
     * Get gitRefsUrl
     * @return gitRefsUrl
     */
    @NotNull
    @Schema(name = "git_refs_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("git_refs_url")
    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    public RepoSearchResultItem treesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
        return this;
    }

    /**
     * Get treesUrl
     * @return treesUrl
     */
    @NotNull
    @Schema(name = "trees_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("trees_url")
    public String getTreesUrl() {
        return treesUrl;
    }

    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    public RepoSearchResultItem statusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
        return this;
    }

    /**
     * Get statusesUrl
     * @return statusesUrl
     */
    @NotNull
    @Schema(name = "statuses_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("statuses_url")
    public String getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public RepoSearchResultItem languagesUrl(URI languagesUrl) {
        this.languagesUrl = languagesUrl;
        return this;
    }

    /**
     * Get languagesUrl
     * @return languagesUrl
     */
    @NotNull
    @Valid
    @Schema(name = "languages_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("languages_url")
    public URI getLanguagesUrl() {
        return languagesUrl;
    }

    public void setLanguagesUrl(URI languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    public RepoSearchResultItem stargazersUrl(URI stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
        return this;
    }

    /**
     * Get stargazersUrl
     * @return stargazersUrl
     */
    @NotNull
    @Valid
    @Schema(name = "stargazers_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("stargazers_url")
    public URI getStargazersUrl() {
        return stargazersUrl;
    }

    public void setStargazersUrl(URI stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    public RepoSearchResultItem contributorsUrl(URI contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
        return this;
    }

    /**
     * Get contributorsUrl
     * @return contributorsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "contributors_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("contributors_url")
    public URI getContributorsUrl() {
        return contributorsUrl;
    }

    public void setContributorsUrl(URI contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    public RepoSearchResultItem subscribersUrl(URI subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
        return this;
    }

    /**
     * Get subscribersUrl
     * @return subscribersUrl
     */
    @NotNull
    @Valid
    @Schema(name = "subscribers_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("subscribers_url")
    public URI getSubscribersUrl() {
        return subscribersUrl;
    }

    public void setSubscribersUrl(URI subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    public RepoSearchResultItem subscriptionUrl(URI subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
        return this;
    }

    /**
     * Get subscriptionUrl
     * @return subscriptionUrl
     */
    @NotNull
    @Valid
    @Schema(name = "subscription_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("subscription_url")
    public URI getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public void setSubscriptionUrl(URI subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public RepoSearchResultItem commitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
        return this;
    }

    /**
     * Get commitsUrl
     * @return commitsUrl
     */
    @NotNull
    @Schema(name = "commits_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commits_url")
    public String getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public RepoSearchResultItem gitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
        return this;
    }

    /**
     * Get gitCommitsUrl
     * @return gitCommitsUrl
     */
    @NotNull
    @Schema(name = "git_commits_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("git_commits_url")
    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    public RepoSearchResultItem commentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
        return this;
    }

    /**
     * Get commentsUrl
     * @return commentsUrl
     */
    @NotNull
    @Schema(name = "comments_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("comments_url")
    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public RepoSearchResultItem issueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
        return this;
    }

    /**
     * Get issueCommentUrl
     * @return issueCommentUrl
     */
    @NotNull
    @Schema(name = "issue_comment_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue_comment_url")
    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    public RepoSearchResultItem contentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
        return this;
    }

    /**
     * Get contentsUrl
     * @return contentsUrl
     */
    @NotNull
    @Schema(name = "contents_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("contents_url")
    public String getContentsUrl() {
        return contentsUrl;
    }

    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    public RepoSearchResultItem compareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
        return this;
    }

    /**
     * Get compareUrl
     * @return compareUrl
     */
    @NotNull
    @Schema(name = "compare_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("compare_url")
    public String getCompareUrl() {
        return compareUrl;
    }

    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    public RepoSearchResultItem mergesUrl(URI mergesUrl) {
        this.mergesUrl = mergesUrl;
        return this;
    }

    /**
     * Get mergesUrl
     * @return mergesUrl
     */
    @NotNull
    @Valid
    @Schema(name = "merges_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("merges_url")
    public URI getMergesUrl() {
        return mergesUrl;
    }

    public void setMergesUrl(URI mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    public RepoSearchResultItem archiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
        return this;
    }

    /**
     * Get archiveUrl
     * @return archiveUrl
     */
    @NotNull
    @Schema(name = "archive_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("archive_url")
    public String getArchiveUrl() {
        return archiveUrl;
    }

    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public RepoSearchResultItem downloadsUrl(URI downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
        return this;
    }

    /**
     * Get downloadsUrl
     * @return downloadsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "downloads_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("downloads_url")
    public URI getDownloadsUrl() {
        return downloadsUrl;
    }

    public void setDownloadsUrl(URI downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    public RepoSearchResultItem issuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
        return this;
    }

    /**
     * Get issuesUrl
     * @return issuesUrl
     */
    @NotNull
    @Schema(name = "issues_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issues_url")
    public String getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public RepoSearchResultItem pullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
        return this;
    }

    /**
     * Get pullsUrl
     * @return pullsUrl
     */
    @NotNull
    @Schema(name = "pulls_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pulls_url")
    public String getPullsUrl() {
        return pullsUrl;
    }

    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    public RepoSearchResultItem milestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
        return this;
    }

    /**
     * Get milestonesUrl
     * @return milestonesUrl
     */
    @NotNull
    @Schema(name = "milestones_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("milestones_url")
    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    public RepoSearchResultItem notificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
        return this;
    }

    /**
     * Get notificationsUrl
     * @return notificationsUrl
     */
    @NotNull
    @Schema(name = "notifications_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("notifications_url")
    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    public RepoSearchResultItem labelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
        return this;
    }

    /**
     * Get labelsUrl
     * @return labelsUrl
     */
    @NotNull
    @Schema(name = "labels_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("labels_url")
    public String getLabelsUrl() {
        return labelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public RepoSearchResultItem releasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
        return this;
    }

    /**
     * Get releasesUrl
     * @return releasesUrl
     */
    @NotNull
    @Schema(name = "releases_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("releases_url")
    public String getReleasesUrl() {
        return releasesUrl;
    }

    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    public RepoSearchResultItem deploymentsUrl(URI deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
        return this;
    }

    /**
     * Get deploymentsUrl
     * @return deploymentsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "deployments_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("deployments_url")
    public URI getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public void setDeploymentsUrl(URI deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    public RepoSearchResultItem gitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    /**
     * Get gitUrl
     * @return gitUrl
     */
    @NotNull
    @Schema(name = "git_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("git_url")
    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public RepoSearchResultItem sshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
        return this;
    }

    /**
     * Get sshUrl
     * @return sshUrl
     */
    @NotNull
    @Schema(name = "ssh_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ssh_url")
    public String getSshUrl() {
        return sshUrl;
    }

    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public RepoSearchResultItem cloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
        return this;
    }

    /**
     * Get cloneUrl
     * @return cloneUrl
     */
    @NotNull
    @Schema(name = "clone_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("clone_url")
    public String getCloneUrl() {
        return cloneUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public RepoSearchResultItem svnUrl(URI svnUrl) {
        this.svnUrl = svnUrl;
        return this;
    }

    /**
     * Get svnUrl
     * @return svnUrl
     */
    @NotNull
    @Valid
    @Schema(name = "svn_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("svn_url")
    public URI getSvnUrl() {
        return svnUrl;
    }

    public void setSvnUrl(URI svnUrl) {
        this.svnUrl = svnUrl;
    }

    public RepoSearchResultItem forks(Long forks) {
        this.forks = forks;
        return this;
    }

    /**
     * Get forks
     * @return forks
     */
    @NotNull
    @Schema(name = "forks", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("forks")
    public Long getForks() {
        return forks;
    }

    public void setForks(Long forks) {
        this.forks = forks;
    }

    public RepoSearchResultItem openIssues(Long openIssues) {
        this.openIssues = openIssues;
        return this;
    }

    /**
     * Get openIssues
     * @return openIssues
     */
    @NotNull
    @Schema(name = "open_issues", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("open_issues")
    public Long getOpenIssues() {
        return openIssues;
    }

    public void setOpenIssues(Long openIssues) {
        this.openIssues = openIssues;
    }

    public RepoSearchResultItem watchers(Long watchers) {
        this.watchers = watchers;
        return this;
    }

    /**
     * Get watchers
     * @return watchers
     */
    @NotNull
    @Schema(name = "watchers", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("watchers")
    public Long getWatchers() {
        return watchers;
    }

    public void setWatchers(Long watchers) {
        this.watchers = watchers;
    }

    public RepoSearchResultItem topics(List<String> topics) {
        this.topics = topics;
        return this;
    }

    public RepoSearchResultItem addTopicsItem(String topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    /**
     * Get topics
     * @return topics
     */
    @Schema(name = "topics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("topics")
    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public RepoSearchResultItem mirrorUrl(URI mirrorUrl) {
        this.mirrorUrl = JsonNullable.of(mirrorUrl);
        return this;
    }

    /**
     * Get mirrorUrl
     * @return mirrorUrl
     */
    @NotNull
    @Valid
    @Schema(name = "mirror_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("mirror_url")
    public JsonNullable<URI> getMirrorUrl() {
        return mirrorUrl;
    }

    public void setMirrorUrl(JsonNullable<URI> mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    public RepoSearchResultItem hasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
        return this;
    }

    /**
     * Get hasIssues
     * @return hasIssues
     */
    @NotNull
    @Schema(name = "has_issues", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("has_issues")
    public Boolean getHasIssues() {
        return hasIssues;
    }

    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    public RepoSearchResultItem hasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
        return this;
    }

    /**
     * Get hasProjects
     * @return hasProjects
     */
    @NotNull
    @Schema(name = "has_projects", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("has_projects")
    public Boolean getHasProjects() {
        return hasProjects;
    }

    public void setHasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
    }

    public RepoSearchResultItem hasPages(Boolean hasPages) {
        this.hasPages = hasPages;
        return this;
    }

    /**
     * Get hasPages
     * @return hasPages
     */
    @NotNull
    @Schema(name = "has_pages", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("has_pages")
    public Boolean getHasPages() {
        return hasPages;
    }

    public void setHasPages(Boolean hasPages) {
        this.hasPages = hasPages;
    }

    public RepoSearchResultItem hasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
        return this;
    }

    /**
     * Get hasWiki
     * @return hasWiki
     */
    @NotNull
    @Schema(name = "has_wiki", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("has_wiki")
    public Boolean getHasWiki() {
        return hasWiki;
    }

    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    public RepoSearchResultItem hasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
        return this;
    }

    /**
     * Get hasDownloads
     * @return hasDownloads
     */
    @NotNull
    @Schema(name = "has_downloads", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("has_downloads")
    public Boolean getHasDownloads() {
        return hasDownloads;
    }

    public void setHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    public RepoSearchResultItem hasDiscussions(Boolean hasDiscussions) {
        this.hasDiscussions = Optional.ofNullable(hasDiscussions);
        return this;
    }

    /**
     * Get hasDiscussions
     * @return hasDiscussions
     */
    @Schema(name = "has_discussions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_discussions")
    public Optional<Boolean> getHasDiscussions() {
        return hasDiscussions;
    }

    public void setHasDiscussions(Optional<Boolean> hasDiscussions) {
        this.hasDiscussions = hasDiscussions;
    }

    public RepoSearchResultItem hasPullRequests(Boolean hasPullRequests) {
        this.hasPullRequests = Optional.ofNullable(hasPullRequests);
        return this;
    }

    /**
     * Get hasPullRequests
     * @return hasPullRequests
     */
    @Schema(name = "has_pull_requests", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_pull_requests")
    public Optional<Boolean> getHasPullRequests() {
        return hasPullRequests;
    }

    public void setHasPullRequests(Optional<Boolean> hasPullRequests) {
        this.hasPullRequests = hasPullRequests;
    }

    public RepoSearchResultItem pullRequestCreationPolicy(PullRequestCreationPolicyEnum pullRequestCreationPolicy) {
        this.pullRequestCreationPolicy = Optional.ofNullable(pullRequestCreationPolicy);
        return this;
    }

    /**
     * The policy controlling who can create pull requests: all or collaborators_only.
     * @return pullRequestCreationPolicy
     */
    @Schema(
            name = "pull_request_creation_policy",
            description = "The policy controlling who can create pull requests: all or collaborators_only.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pull_request_creation_policy")
    public Optional<PullRequestCreationPolicyEnum> getPullRequestCreationPolicy() {
        return pullRequestCreationPolicy;
    }

    public void setPullRequestCreationPolicy(Optional<PullRequestCreationPolicyEnum> pullRequestCreationPolicy) {
        this.pullRequestCreationPolicy = pullRequestCreationPolicy;
    }

    public RepoSearchResultItem hasCommitComments(Boolean hasCommitComments) {
        this.hasCommitComments = Optional.ofNullable(hasCommitComments);
        return this;
    }

    /**
     * Get hasCommitComments
     * @return hasCommitComments
     */
    @Schema(name = "has_commit_comments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_commit_comments")
    public Optional<Boolean> getHasCommitComments() {
        return hasCommitComments;
    }

    public void setHasCommitComments(Optional<Boolean> hasCommitComments) {
        this.hasCommitComments = hasCommitComments;
    }

    public RepoSearchResultItem archived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * Get archived
     * @return archived
     */
    @NotNull
    @Schema(name = "archived", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("archived")
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public RepoSearchResultItem disabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * Returns whether or not this repository disabled.
     * @return disabled
     */
    @NotNull
    @Schema(
            name = "disabled",
            description = "Returns whether or not this repository disabled.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("disabled")
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public RepoSearchResultItem visibility(String visibility) {
        this.visibility = Optional.ofNullable(visibility);
        return this;
    }

    /**
     * The repository visibility: public, private, or internal.
     * @return visibility
     */
    @Schema(
            name = "visibility",
            description = "The repository visibility: public, private, or internal.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("visibility")
    public Optional<String> getVisibility() {
        return visibility;
    }

    public void setVisibility(Optional<String> visibility) {
        this.visibility = visibility;
    }

    public RepoSearchResultItem license(NullableLicenseSimple license) {
        this.license = JsonNullable.of(license);
        return this;
    }

    /**
     * Get license
     * @return license
     */
    @NotNull
    @Valid
    @Schema(name = "license", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("license")
    public JsonNullable<NullableLicenseSimple> getLicense() {
        return license;
    }

    public void setLicense(JsonNullable<NullableLicenseSimple> license) {
        this.license = license;
    }

    public RepoSearchResultItem permissions(FullRepositoryPermissions permissions) {
        this.permissions = Optional.ofNullable(permissions);
        return this;
    }

    /**
     * Get permissions
     * @return permissions
     */
    @Valid
    @Schema(name = "permissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("permissions")
    public Optional<FullRepositoryPermissions> getPermissions() {
        return permissions;
    }

    public void setPermissions(Optional<FullRepositoryPermissions> permissions) {
        this.permissions = permissions;
    }

    public RepoSearchResultItem textMatches(List<@Valid SearchResultTextMatchesInner> textMatches) {
        this.textMatches = textMatches;
        return this;
    }

    public RepoSearchResultItem addTextMatchesItem(SearchResultTextMatchesInner textMatchesItem) {
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

    public RepoSearchResultItem tempCloneToken(String tempCloneToken) {
        this.tempCloneToken = Optional.ofNullable(tempCloneToken);
        return this;
    }

    /**
     * Get tempCloneToken
     * @return tempCloneToken
     */
    @Schema(name = "temp_clone_token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("temp_clone_token")
    public Optional<String> getTempCloneToken() {
        return tempCloneToken;
    }

    public void setTempCloneToken(Optional<String> tempCloneToken) {
        this.tempCloneToken = tempCloneToken;
    }

    public RepoSearchResultItem allowMergeCommit(Boolean allowMergeCommit) {
        this.allowMergeCommit = Optional.ofNullable(allowMergeCommit);
        return this;
    }

    /**
     * Get allowMergeCommit
     * @return allowMergeCommit
     */
    @Schema(name = "allow_merge_commit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_merge_commit")
    public Optional<Boolean> getAllowMergeCommit() {
        return allowMergeCommit;
    }

    public void setAllowMergeCommit(Optional<Boolean> allowMergeCommit) {
        this.allowMergeCommit = allowMergeCommit;
    }

    public RepoSearchResultItem allowSquashMerge(Boolean allowSquashMerge) {
        this.allowSquashMerge = Optional.ofNullable(allowSquashMerge);
        return this;
    }

    /**
     * Get allowSquashMerge
     * @return allowSquashMerge
     */
    @Schema(name = "allow_squash_merge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_squash_merge")
    public Optional<Boolean> getAllowSquashMerge() {
        return allowSquashMerge;
    }

    public void setAllowSquashMerge(Optional<Boolean> allowSquashMerge) {
        this.allowSquashMerge = allowSquashMerge;
    }

    public RepoSearchResultItem allowRebaseMerge(Boolean allowRebaseMerge) {
        this.allowRebaseMerge = Optional.ofNullable(allowRebaseMerge);
        return this;
    }

    /**
     * Get allowRebaseMerge
     * @return allowRebaseMerge
     */
    @Schema(name = "allow_rebase_merge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_rebase_merge")
    public Optional<Boolean> getAllowRebaseMerge() {
        return allowRebaseMerge;
    }

    public void setAllowRebaseMerge(Optional<Boolean> allowRebaseMerge) {
        this.allowRebaseMerge = allowRebaseMerge;
    }

    public RepoSearchResultItem allowAutoMerge(Boolean allowAutoMerge) {
        this.allowAutoMerge = Optional.ofNullable(allowAutoMerge);
        return this;
    }

    /**
     * Get allowAutoMerge
     * @return allowAutoMerge
     */
    @Schema(name = "allow_auto_merge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_auto_merge")
    public Optional<Boolean> getAllowAutoMerge() {
        return allowAutoMerge;
    }

    public void setAllowAutoMerge(Optional<Boolean> allowAutoMerge) {
        this.allowAutoMerge = allowAutoMerge;
    }

    public RepoSearchResultItem deleteBranchOnMerge(Boolean deleteBranchOnMerge) {
        this.deleteBranchOnMerge = Optional.ofNullable(deleteBranchOnMerge);
        return this;
    }

    /**
     * Get deleteBranchOnMerge
     * @return deleteBranchOnMerge
     */
    @Schema(name = "delete_branch_on_merge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("delete_branch_on_merge")
    public Optional<Boolean> getDeleteBranchOnMerge() {
        return deleteBranchOnMerge;
    }

    public void setDeleteBranchOnMerge(Optional<Boolean> deleteBranchOnMerge) {
        this.deleteBranchOnMerge = deleteBranchOnMerge;
    }

    public RepoSearchResultItem allowForking(Boolean allowForking) {
        this.allowForking = Optional.ofNullable(allowForking);
        return this;
    }

    /**
     * Get allowForking
     * @return allowForking
     */
    @Schema(name = "allow_forking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_forking")
    public Optional<Boolean> getAllowForking() {
        return allowForking;
    }

    public void setAllowForking(Optional<Boolean> allowForking) {
        this.allowForking = allowForking;
    }

    public RepoSearchResultItem isTemplate(Boolean isTemplate) {
        this.isTemplate = Optional.ofNullable(isTemplate);
        return this;
    }

    /**
     * Get isTemplate
     * @return isTemplate
     */
    @Schema(name = "is_template", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_template")
    public Optional<Boolean> getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Optional<Boolean> isTemplate) {
        this.isTemplate = isTemplate;
    }

    public RepoSearchResultItem webCommitSignoffRequired(Boolean webCommitSignoffRequired) {
        this.webCommitSignoffRequired = Optional.ofNullable(webCommitSignoffRequired);
        return this;
    }

    /**
     * Get webCommitSignoffRequired
     * @return webCommitSignoffRequired
     */
    @Schema(name = "web_commit_signoff_required", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("web_commit_signoff_required")
    public Optional<Boolean> getWebCommitSignoffRequired() {
        return webCommitSignoffRequired;
    }

    public void setWebCommitSignoffRequired(Optional<Boolean> webCommitSignoffRequired) {
        this.webCommitSignoffRequired = webCommitSignoffRequired;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepoSearchResultItem repoSearchResultItem = (RepoSearchResultItem) o;
        return Objects.equals(this.id, repoSearchResultItem.id)
                && Objects.equals(this.nodeId, repoSearchResultItem.nodeId)
                && Objects.equals(this.name, repoSearchResultItem.name)
                && Objects.equals(this.fullName, repoSearchResultItem.fullName)
                && Objects.equals(this.owner, repoSearchResultItem.owner)
                && Objects.equals(this._private, repoSearchResultItem._private)
                && Objects.equals(this.htmlUrl, repoSearchResultItem.htmlUrl)
                && Objects.equals(this.description, repoSearchResultItem.description)
                && Objects.equals(this.fork, repoSearchResultItem.fork)
                && Objects.equals(this.url, repoSearchResultItem.url)
                && Objects.equals(this.createdAt, repoSearchResultItem.createdAt)
                && Objects.equals(this.updatedAt, repoSearchResultItem.updatedAt)
                && Objects.equals(this.pushedAt, repoSearchResultItem.pushedAt)
                && Objects.equals(this.homepage, repoSearchResultItem.homepage)
                && Objects.equals(this.size, repoSearchResultItem.size)
                && Objects.equals(this.stargazersCount, repoSearchResultItem.stargazersCount)
                && Objects.equals(this.watchersCount, repoSearchResultItem.watchersCount)
                && Objects.equals(this.language, repoSearchResultItem.language)
                && Objects.equals(this.forksCount, repoSearchResultItem.forksCount)
                && Objects.equals(this.openIssuesCount, repoSearchResultItem.openIssuesCount)
                && Objects.equals(this.masterBranch, repoSearchResultItem.masterBranch)
                && Objects.equals(this.defaultBranch, repoSearchResultItem.defaultBranch)
                && Objects.equals(this.score, repoSearchResultItem.score)
                && Objects.equals(this.forksUrl, repoSearchResultItem.forksUrl)
                && Objects.equals(this.keysUrl, repoSearchResultItem.keysUrl)
                && Objects.equals(this.collaboratorsUrl, repoSearchResultItem.collaboratorsUrl)
                && Objects.equals(this.teamsUrl, repoSearchResultItem.teamsUrl)
                && Objects.equals(this.hooksUrl, repoSearchResultItem.hooksUrl)
                && Objects.equals(this.issueEventsUrl, repoSearchResultItem.issueEventsUrl)
                && Objects.equals(this.eventsUrl, repoSearchResultItem.eventsUrl)
                && Objects.equals(this.assigneesUrl, repoSearchResultItem.assigneesUrl)
                && Objects.equals(this.branchesUrl, repoSearchResultItem.branchesUrl)
                && Objects.equals(this.tagsUrl, repoSearchResultItem.tagsUrl)
                && Objects.equals(this.blobsUrl, repoSearchResultItem.blobsUrl)
                && Objects.equals(this.gitTagsUrl, repoSearchResultItem.gitTagsUrl)
                && Objects.equals(this.gitRefsUrl, repoSearchResultItem.gitRefsUrl)
                && Objects.equals(this.treesUrl, repoSearchResultItem.treesUrl)
                && Objects.equals(this.statusesUrl, repoSearchResultItem.statusesUrl)
                && Objects.equals(this.languagesUrl, repoSearchResultItem.languagesUrl)
                && Objects.equals(this.stargazersUrl, repoSearchResultItem.stargazersUrl)
                && Objects.equals(this.contributorsUrl, repoSearchResultItem.contributorsUrl)
                && Objects.equals(this.subscribersUrl, repoSearchResultItem.subscribersUrl)
                && Objects.equals(this.subscriptionUrl, repoSearchResultItem.subscriptionUrl)
                && Objects.equals(this.commitsUrl, repoSearchResultItem.commitsUrl)
                && Objects.equals(this.gitCommitsUrl, repoSearchResultItem.gitCommitsUrl)
                && Objects.equals(this.commentsUrl, repoSearchResultItem.commentsUrl)
                && Objects.equals(this.issueCommentUrl, repoSearchResultItem.issueCommentUrl)
                && Objects.equals(this.contentsUrl, repoSearchResultItem.contentsUrl)
                && Objects.equals(this.compareUrl, repoSearchResultItem.compareUrl)
                && Objects.equals(this.mergesUrl, repoSearchResultItem.mergesUrl)
                && Objects.equals(this.archiveUrl, repoSearchResultItem.archiveUrl)
                && Objects.equals(this.downloadsUrl, repoSearchResultItem.downloadsUrl)
                && Objects.equals(this.issuesUrl, repoSearchResultItem.issuesUrl)
                && Objects.equals(this.pullsUrl, repoSearchResultItem.pullsUrl)
                && Objects.equals(this.milestonesUrl, repoSearchResultItem.milestonesUrl)
                && Objects.equals(this.notificationsUrl, repoSearchResultItem.notificationsUrl)
                && Objects.equals(this.labelsUrl, repoSearchResultItem.labelsUrl)
                && Objects.equals(this.releasesUrl, repoSearchResultItem.releasesUrl)
                && Objects.equals(this.deploymentsUrl, repoSearchResultItem.deploymentsUrl)
                && Objects.equals(this.gitUrl, repoSearchResultItem.gitUrl)
                && Objects.equals(this.sshUrl, repoSearchResultItem.sshUrl)
                && Objects.equals(this.cloneUrl, repoSearchResultItem.cloneUrl)
                && Objects.equals(this.svnUrl, repoSearchResultItem.svnUrl)
                && Objects.equals(this.forks, repoSearchResultItem.forks)
                && Objects.equals(this.openIssues, repoSearchResultItem.openIssues)
                && Objects.equals(this.watchers, repoSearchResultItem.watchers)
                && Objects.equals(this.topics, repoSearchResultItem.topics)
                && Objects.equals(this.mirrorUrl, repoSearchResultItem.mirrorUrl)
                && Objects.equals(this.hasIssues, repoSearchResultItem.hasIssues)
                && Objects.equals(this.hasProjects, repoSearchResultItem.hasProjects)
                && Objects.equals(this.hasPages, repoSearchResultItem.hasPages)
                && Objects.equals(this.hasWiki, repoSearchResultItem.hasWiki)
                && Objects.equals(this.hasDownloads, repoSearchResultItem.hasDownloads)
                && Objects.equals(this.hasDiscussions, repoSearchResultItem.hasDiscussions)
                && Objects.equals(this.hasPullRequests, repoSearchResultItem.hasPullRequests)
                && Objects.equals(this.pullRequestCreationPolicy, repoSearchResultItem.pullRequestCreationPolicy)
                && Objects.equals(this.hasCommitComments, repoSearchResultItem.hasCommitComments)
                && Objects.equals(this.archived, repoSearchResultItem.archived)
                && Objects.equals(this.disabled, repoSearchResultItem.disabled)
                && Objects.equals(this.visibility, repoSearchResultItem.visibility)
                && Objects.equals(this.license, repoSearchResultItem.license)
                && Objects.equals(this.permissions, repoSearchResultItem.permissions)
                && Objects.equals(this.textMatches, repoSearchResultItem.textMatches)
                && Objects.equals(this.tempCloneToken, repoSearchResultItem.tempCloneToken)
                && Objects.equals(this.allowMergeCommit, repoSearchResultItem.allowMergeCommit)
                && Objects.equals(this.allowSquashMerge, repoSearchResultItem.allowSquashMerge)
                && Objects.equals(this.allowRebaseMerge, repoSearchResultItem.allowRebaseMerge)
                && Objects.equals(this.allowAutoMerge, repoSearchResultItem.allowAutoMerge)
                && Objects.equals(this.deleteBranchOnMerge, repoSearchResultItem.deleteBranchOnMerge)
                && Objects.equals(this.allowForking, repoSearchResultItem.allowForking)
                && Objects.equals(this.isTemplate, repoSearchResultItem.isTemplate)
                && Objects.equals(this.webCommitSignoffRequired, repoSearchResultItem.webCommitSignoffRequired);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                nodeId,
                name,
                fullName,
                owner,
                _private,
                htmlUrl,
                description,
                fork,
                url,
                createdAt,
                updatedAt,
                pushedAt,
                homepage,
                size,
                stargazersCount,
                watchersCount,
                language,
                forksCount,
                openIssuesCount,
                masterBranch,
                defaultBranch,
                score,
                forksUrl,
                keysUrl,
                collaboratorsUrl,
                teamsUrl,
                hooksUrl,
                issueEventsUrl,
                eventsUrl,
                assigneesUrl,
                branchesUrl,
                tagsUrl,
                blobsUrl,
                gitTagsUrl,
                gitRefsUrl,
                treesUrl,
                statusesUrl,
                languagesUrl,
                stargazersUrl,
                contributorsUrl,
                subscribersUrl,
                subscriptionUrl,
                commitsUrl,
                gitCommitsUrl,
                commentsUrl,
                issueCommentUrl,
                contentsUrl,
                compareUrl,
                mergesUrl,
                archiveUrl,
                downloadsUrl,
                issuesUrl,
                pullsUrl,
                milestonesUrl,
                notificationsUrl,
                labelsUrl,
                releasesUrl,
                deploymentsUrl,
                gitUrl,
                sshUrl,
                cloneUrl,
                svnUrl,
                forks,
                openIssues,
                watchers,
                topics,
                mirrorUrl,
                hasIssues,
                hasProjects,
                hasPages,
                hasWiki,
                hasDownloads,
                hasDiscussions,
                hasPullRequests,
                pullRequestCreationPolicy,
                hasCommitComments,
                archived,
                disabled,
                visibility,
                license,
                permissions,
                textMatches,
                tempCloneToken,
                allowMergeCommit,
                allowSquashMerge,
                allowRebaseMerge,
                allowAutoMerge,
                deleteBranchOnMerge,
                allowForking,
                isTemplate,
                webCommitSignoffRequired);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepoSearchResultItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    fork: ").append(toIndentedString(fork)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    pushedAt: ").append(toIndentedString(pushedAt)).append("\n");
        sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    stargazersCount: ")
                .append(toIndentedString(stargazersCount))
                .append("\n");
        sb.append("    watchersCount: ").append(toIndentedString(watchersCount)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    forksCount: ").append(toIndentedString(forksCount)).append("\n");
        sb.append("    openIssuesCount: ")
                .append(toIndentedString(openIssuesCount))
                .append("\n");
        sb.append("    masterBranch: ").append(toIndentedString(masterBranch)).append("\n");
        sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    forksUrl: ").append(toIndentedString(forksUrl)).append("\n");
        sb.append("    keysUrl: ").append(toIndentedString(keysUrl)).append("\n");
        sb.append("    collaboratorsUrl: ")
                .append(toIndentedString(collaboratorsUrl))
                .append("\n");
        sb.append("    teamsUrl: ").append(toIndentedString(teamsUrl)).append("\n");
        sb.append("    hooksUrl: ").append(toIndentedString(hooksUrl)).append("\n");
        sb.append("    issueEventsUrl: ")
                .append(toIndentedString(issueEventsUrl))
                .append("\n");
        sb.append("    eventsUrl: ").append(toIndentedString(eventsUrl)).append("\n");
        sb.append("    assigneesUrl: ").append(toIndentedString(assigneesUrl)).append("\n");
        sb.append("    branchesUrl: ").append(toIndentedString(branchesUrl)).append("\n");
        sb.append("    tagsUrl: ").append(toIndentedString(tagsUrl)).append("\n");
        sb.append("    blobsUrl: ").append(toIndentedString(blobsUrl)).append("\n");
        sb.append("    gitTagsUrl: ").append(toIndentedString(gitTagsUrl)).append("\n");
        sb.append("    gitRefsUrl: ").append(toIndentedString(gitRefsUrl)).append("\n");
        sb.append("    treesUrl: ").append(toIndentedString(treesUrl)).append("\n");
        sb.append("    statusesUrl: ").append(toIndentedString(statusesUrl)).append("\n");
        sb.append("    languagesUrl: ").append(toIndentedString(languagesUrl)).append("\n");
        sb.append("    stargazersUrl: ").append(toIndentedString(stargazersUrl)).append("\n");
        sb.append("    contributorsUrl: ")
                .append(toIndentedString(contributorsUrl))
                .append("\n");
        sb.append("    subscribersUrl: ")
                .append(toIndentedString(subscribersUrl))
                .append("\n");
        sb.append("    subscriptionUrl: ")
                .append(toIndentedString(subscriptionUrl))
                .append("\n");
        sb.append("    commitsUrl: ").append(toIndentedString(commitsUrl)).append("\n");
        sb.append("    gitCommitsUrl: ").append(toIndentedString(gitCommitsUrl)).append("\n");
        sb.append("    commentsUrl: ").append(toIndentedString(commentsUrl)).append("\n");
        sb.append("    issueCommentUrl: ")
                .append(toIndentedString(issueCommentUrl))
                .append("\n");
        sb.append("    contentsUrl: ").append(toIndentedString(contentsUrl)).append("\n");
        sb.append("    compareUrl: ").append(toIndentedString(compareUrl)).append("\n");
        sb.append("    mergesUrl: ").append(toIndentedString(mergesUrl)).append("\n");
        sb.append("    archiveUrl: ").append(toIndentedString(archiveUrl)).append("\n");
        sb.append("    downloadsUrl: ").append(toIndentedString(downloadsUrl)).append("\n");
        sb.append("    issuesUrl: ").append(toIndentedString(issuesUrl)).append("\n");
        sb.append("    pullsUrl: ").append(toIndentedString(pullsUrl)).append("\n");
        sb.append("    milestonesUrl: ").append(toIndentedString(milestonesUrl)).append("\n");
        sb.append("    notificationsUrl: ")
                .append(toIndentedString(notificationsUrl))
                .append("\n");
        sb.append("    labelsUrl: ").append(toIndentedString(labelsUrl)).append("\n");
        sb.append("    releasesUrl: ").append(toIndentedString(releasesUrl)).append("\n");
        sb.append("    deploymentsUrl: ")
                .append(toIndentedString(deploymentsUrl))
                .append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    sshUrl: ").append(toIndentedString(sshUrl)).append("\n");
        sb.append("    cloneUrl: ").append(toIndentedString(cloneUrl)).append("\n");
        sb.append("    svnUrl: ").append(toIndentedString(svnUrl)).append("\n");
        sb.append("    forks: ").append(toIndentedString(forks)).append("\n");
        sb.append("    openIssues: ").append(toIndentedString(openIssues)).append("\n");
        sb.append("    watchers: ").append(toIndentedString(watchers)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("    mirrorUrl: ").append(toIndentedString(mirrorUrl)).append("\n");
        sb.append("    hasIssues: ").append(toIndentedString(hasIssues)).append("\n");
        sb.append("    hasProjects: ").append(toIndentedString(hasProjects)).append("\n");
        sb.append("    hasPages: ").append(toIndentedString(hasPages)).append("\n");
        sb.append("    hasWiki: ").append(toIndentedString(hasWiki)).append("\n");
        sb.append("    hasDownloads: ").append(toIndentedString(hasDownloads)).append("\n");
        sb.append("    hasDiscussions: ")
                .append(toIndentedString(hasDiscussions))
                .append("\n");
        sb.append("    hasPullRequests: ")
                .append(toIndentedString(hasPullRequests))
                .append("\n");
        sb.append("    pullRequestCreationPolicy: ")
                .append(toIndentedString(pullRequestCreationPolicy))
                .append("\n");
        sb.append("    hasCommitComments: ")
                .append(toIndentedString(hasCommitComments))
                .append("\n");
        sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    license: ").append(toIndentedString(license)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    textMatches: ").append(toIndentedString(textMatches)).append("\n");
        sb.append("    tempCloneToken: ")
                .append(toIndentedString(tempCloneToken))
                .append("\n");
        sb.append("    allowMergeCommit: ")
                .append(toIndentedString(allowMergeCommit))
                .append("\n");
        sb.append("    allowSquashMerge: ")
                .append(toIndentedString(allowSquashMerge))
                .append("\n");
        sb.append("    allowRebaseMerge: ")
                .append(toIndentedString(allowRebaseMerge))
                .append("\n");
        sb.append("    allowAutoMerge: ")
                .append(toIndentedString(allowAutoMerge))
                .append("\n");
        sb.append("    deleteBranchOnMerge: ")
                .append(toIndentedString(deleteBranchOnMerge))
                .append("\n");
        sb.append("    allowForking: ").append(toIndentedString(allowForking)).append("\n");
        sb.append("    isTemplate: ").append(toIndentedString(isTemplate)).append("\n");
        sb.append("    webCommitSignoffRequired: ")
                .append(toIndentedString(webCommitSignoffRequired))
                .append("\n");
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
