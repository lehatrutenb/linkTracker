package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * DeploymentWorkflowRunHeadRepository
 */
@JsonTypeName("Deployment_Workflow_Run_head_repository")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DeploymentWorkflowRunHeadRepository {

    private Optional<String> archiveUrl = Optional.empty();

    private Optional<String> assigneesUrl = Optional.empty();

    private Optional<String> blobsUrl = Optional.empty();

    private Optional<String> branchesUrl = Optional.empty();

    private Optional<String> collaboratorsUrl = Optional.empty();

    private Optional<String> commentsUrl = Optional.empty();

    private Optional<String> commitsUrl = Optional.empty();

    private Optional<String> compareUrl = Optional.empty();

    private Optional<String> contentsUrl = Optional.empty();

    private Optional<String> contributorsUrl = Optional.empty();

    private Optional<String> deploymentsUrl = Optional.empty();

    private JsonNullable<Object> description = JsonNullable.<Object>undefined();

    private Optional<String> downloadsUrl = Optional.empty();

    private Optional<String> eventsUrl = Optional.empty();

    private Optional<Boolean> fork = Optional.empty();

    private Optional<String> forksUrl = Optional.empty();

    private Optional<String> fullName = Optional.empty();

    private Optional<String> gitCommitsUrl = Optional.empty();

    private Optional<String> gitRefsUrl = Optional.empty();

    private Optional<String> gitTagsUrl = Optional.empty();

    private Optional<String> hooksUrl = Optional.empty();

    private Optional<String> htmlUrl = Optional.empty();

    private Optional<Long> id = Optional.empty();

    private Optional<String> issueCommentUrl = Optional.empty();

    private Optional<String> issueEventsUrl = Optional.empty();

    private Optional<String> issuesUrl = Optional.empty();

    private Optional<String> keysUrl = Optional.empty();

    private Optional<String> labelsUrl = Optional.empty();

    private Optional<String> languagesUrl = Optional.empty();

    private Optional<String> mergesUrl = Optional.empty();

    private Optional<String> milestonesUrl = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> nodeId = Optional.empty();

    private Optional<String> notificationsUrl = Optional.empty();

    private Optional<DeploymentWorkflowRunHeadRepositoryOwner> owner = Optional.empty();

    private Optional<Boolean> _private = Optional.empty();

    private Optional<String> pullsUrl = Optional.empty();

    private Optional<String> releasesUrl = Optional.empty();

    private Optional<String> stargazersUrl = Optional.empty();

    private Optional<String> statusesUrl = Optional.empty();

    private Optional<String> subscribersUrl = Optional.empty();

    private Optional<String> subscriptionUrl = Optional.empty();

    private Optional<String> tagsUrl = Optional.empty();

    private Optional<String> teamsUrl = Optional.empty();

    private Optional<String> treesUrl = Optional.empty();

    private Optional<String> url = Optional.empty();

    public DeploymentWorkflowRunHeadRepository archiveUrl(String archiveUrl) {
        this.archiveUrl = Optional.ofNullable(archiveUrl);
        return this;
    }

    /**
     * Get archiveUrl
     * @return archiveUrl
     */
    @Schema(name = "archive_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("archive_url")
    public Optional<String> getArchiveUrl() {
        return archiveUrl;
    }

    public void setArchiveUrl(Optional<String> archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public DeploymentWorkflowRunHeadRepository assigneesUrl(String assigneesUrl) {
        this.assigneesUrl = Optional.ofNullable(assigneesUrl);
        return this;
    }

    /**
     * Get assigneesUrl
     * @return assigneesUrl
     */
    @Schema(name = "assignees_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assignees_url")
    public Optional<String> getAssigneesUrl() {
        return assigneesUrl;
    }

    public void setAssigneesUrl(Optional<String> assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    public DeploymentWorkflowRunHeadRepository blobsUrl(String blobsUrl) {
        this.blobsUrl = Optional.ofNullable(blobsUrl);
        return this;
    }

    /**
     * Get blobsUrl
     * @return blobsUrl
     */
    @Schema(name = "blobs_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("blobs_url")
    public Optional<String> getBlobsUrl() {
        return blobsUrl;
    }

    public void setBlobsUrl(Optional<String> blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    public DeploymentWorkflowRunHeadRepository branchesUrl(String branchesUrl) {
        this.branchesUrl = Optional.ofNullable(branchesUrl);
        return this;
    }

    /**
     * Get branchesUrl
     * @return branchesUrl
     */
    @Schema(name = "branches_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("branches_url")
    public Optional<String> getBranchesUrl() {
        return branchesUrl;
    }

    public void setBranchesUrl(Optional<String> branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    public DeploymentWorkflowRunHeadRepository collaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = Optional.ofNullable(collaboratorsUrl);
        return this;
    }

    /**
     * Get collaboratorsUrl
     * @return collaboratorsUrl
     */
    @Schema(name = "collaborators_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("collaborators_url")
    public Optional<String> getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public void setCollaboratorsUrl(Optional<String> collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    public DeploymentWorkflowRunHeadRepository commentsUrl(String commentsUrl) {
        this.commentsUrl = Optional.ofNullable(commentsUrl);
        return this;
    }

    /**
     * Get commentsUrl
     * @return commentsUrl
     */
    @Schema(name = "comments_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("comments_url")
    public Optional<String> getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(Optional<String> commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public DeploymentWorkflowRunHeadRepository commitsUrl(String commitsUrl) {
        this.commitsUrl = Optional.ofNullable(commitsUrl);
        return this;
    }

    /**
     * Get commitsUrl
     * @return commitsUrl
     */
    @Schema(name = "commits_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("commits_url")
    public Optional<String> getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(Optional<String> commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public DeploymentWorkflowRunHeadRepository compareUrl(String compareUrl) {
        this.compareUrl = Optional.ofNullable(compareUrl);
        return this;
    }

    /**
     * Get compareUrl
     * @return compareUrl
     */
    @Schema(name = "compare_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("compare_url")
    public Optional<String> getCompareUrl() {
        return compareUrl;
    }

    public void setCompareUrl(Optional<String> compareUrl) {
        this.compareUrl = compareUrl;
    }

    public DeploymentWorkflowRunHeadRepository contentsUrl(String contentsUrl) {
        this.contentsUrl = Optional.ofNullable(contentsUrl);
        return this;
    }

    /**
     * Get contentsUrl
     * @return contentsUrl
     */
    @Schema(name = "contents_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("contents_url")
    public Optional<String> getContentsUrl() {
        return contentsUrl;
    }

    public void setContentsUrl(Optional<String> contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    public DeploymentWorkflowRunHeadRepository contributorsUrl(String contributorsUrl) {
        this.contributorsUrl = Optional.ofNullable(contributorsUrl);
        return this;
    }

    /**
     * Get contributorsUrl
     * @return contributorsUrl
     */
    @Schema(name = "contributors_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("contributors_url")
    public Optional<String> getContributorsUrl() {
        return contributorsUrl;
    }

    public void setContributorsUrl(Optional<String> contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    public DeploymentWorkflowRunHeadRepository deploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = Optional.ofNullable(deploymentsUrl);
        return this;
    }

    /**
     * Get deploymentsUrl
     * @return deploymentsUrl
     */
    @Schema(name = "deployments_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deployments_url")
    public Optional<String> getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public void setDeploymentsUrl(Optional<String> deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    public DeploymentWorkflowRunHeadRepository description(Object description) {
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public JsonNullable<Object> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<Object> description) {
        this.description = description;
    }

    public DeploymentWorkflowRunHeadRepository downloadsUrl(String downloadsUrl) {
        this.downloadsUrl = Optional.ofNullable(downloadsUrl);
        return this;
    }

    /**
     * Get downloadsUrl
     * @return downloadsUrl
     */
    @Schema(name = "downloads_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("downloads_url")
    public Optional<String> getDownloadsUrl() {
        return downloadsUrl;
    }

    public void setDownloadsUrl(Optional<String> downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    public DeploymentWorkflowRunHeadRepository eventsUrl(String eventsUrl) {
        this.eventsUrl = Optional.ofNullable(eventsUrl);
        return this;
    }

    /**
     * Get eventsUrl
     * @return eventsUrl
     */
    @Schema(name = "events_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("events_url")
    public Optional<String> getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(Optional<String> eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public DeploymentWorkflowRunHeadRepository fork(Boolean fork) {
        this.fork = Optional.ofNullable(fork);
        return this;
    }

    /**
     * Get fork
     * @return fork
     */
    @Schema(name = "fork", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("fork")
    public Optional<Boolean> getFork() {
        return fork;
    }

    public void setFork(Optional<Boolean> fork) {
        this.fork = fork;
    }

    public DeploymentWorkflowRunHeadRepository forksUrl(String forksUrl) {
        this.forksUrl = Optional.ofNullable(forksUrl);
        return this;
    }

    /**
     * Get forksUrl
     * @return forksUrl
     */
    @Schema(name = "forks_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("forks_url")
    public Optional<String> getForksUrl() {
        return forksUrl;
    }

    public void setForksUrl(Optional<String> forksUrl) {
        this.forksUrl = forksUrl;
    }

    public DeploymentWorkflowRunHeadRepository fullName(String fullName) {
        this.fullName = Optional.ofNullable(fullName);
        return this;
    }

    /**
     * Get fullName
     * @return fullName
     */
    @Schema(name = "full_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("full_name")
    public Optional<String> getFullName() {
        return fullName;
    }

    public void setFullName(Optional<String> fullName) {
        this.fullName = fullName;
    }

    public DeploymentWorkflowRunHeadRepository gitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = Optional.ofNullable(gitCommitsUrl);
        return this;
    }

    /**
     * Get gitCommitsUrl
     * @return gitCommitsUrl
     */
    @Schema(name = "git_commits_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("git_commits_url")
    public Optional<String> getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public void setGitCommitsUrl(Optional<String> gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    public DeploymentWorkflowRunHeadRepository gitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = Optional.ofNullable(gitRefsUrl);
        return this;
    }

    /**
     * Get gitRefsUrl
     * @return gitRefsUrl
     */
    @Schema(name = "git_refs_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("git_refs_url")
    public Optional<String> getGitRefsUrl() {
        return gitRefsUrl;
    }

    public void setGitRefsUrl(Optional<String> gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    public DeploymentWorkflowRunHeadRepository gitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = Optional.ofNullable(gitTagsUrl);
        return this;
    }

    /**
     * Get gitTagsUrl
     * @return gitTagsUrl
     */
    @Schema(name = "git_tags_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("git_tags_url")
    public Optional<String> getGitTagsUrl() {
        return gitTagsUrl;
    }

    public void setGitTagsUrl(Optional<String> gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    public DeploymentWorkflowRunHeadRepository hooksUrl(String hooksUrl) {
        this.hooksUrl = Optional.ofNullable(hooksUrl);
        return this;
    }

    /**
     * Get hooksUrl
     * @return hooksUrl
     */
    @Schema(name = "hooks_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("hooks_url")
    public Optional<String> getHooksUrl() {
        return hooksUrl;
    }

    public void setHooksUrl(Optional<String> hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public DeploymentWorkflowRunHeadRepository htmlUrl(String htmlUrl) {
        this.htmlUrl = Optional.ofNullable(htmlUrl);
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public Optional<String> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(Optional<String> htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public DeploymentWorkflowRunHeadRepository id(Long id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public DeploymentWorkflowRunHeadRepository issueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = Optional.ofNullable(issueCommentUrl);
        return this;
    }

    /**
     * Get issueCommentUrl
     * @return issueCommentUrl
     */
    @Schema(name = "issue_comment_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issue_comment_url")
    public Optional<String> getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public void setIssueCommentUrl(Optional<String> issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    public DeploymentWorkflowRunHeadRepository issueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = Optional.ofNullable(issueEventsUrl);
        return this;
    }

    /**
     * Get issueEventsUrl
     * @return issueEventsUrl
     */
    @Schema(name = "issue_events_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issue_events_url")
    public Optional<String> getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public void setIssueEventsUrl(Optional<String> issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    public DeploymentWorkflowRunHeadRepository issuesUrl(String issuesUrl) {
        this.issuesUrl = Optional.ofNullable(issuesUrl);
        return this;
    }

    /**
     * Get issuesUrl
     * @return issuesUrl
     */
    @Schema(name = "issues_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issues_url")
    public Optional<String> getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(Optional<String> issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public DeploymentWorkflowRunHeadRepository keysUrl(String keysUrl) {
        this.keysUrl = Optional.ofNullable(keysUrl);
        return this;
    }

    /**
     * Get keysUrl
     * @return keysUrl
     */
    @Schema(name = "keys_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("keys_url")
    public Optional<String> getKeysUrl() {
        return keysUrl;
    }

    public void setKeysUrl(Optional<String> keysUrl) {
        this.keysUrl = keysUrl;
    }

    public DeploymentWorkflowRunHeadRepository labelsUrl(String labelsUrl) {
        this.labelsUrl = Optional.ofNullable(labelsUrl);
        return this;
    }

    /**
     * Get labelsUrl
     * @return labelsUrl
     */
    @Schema(name = "labels_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("labels_url")
    public Optional<String> getLabelsUrl() {
        return labelsUrl;
    }

    public void setLabelsUrl(Optional<String> labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public DeploymentWorkflowRunHeadRepository languagesUrl(String languagesUrl) {
        this.languagesUrl = Optional.ofNullable(languagesUrl);
        return this;
    }

    /**
     * Get languagesUrl
     * @return languagesUrl
     */
    @Schema(name = "languages_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("languages_url")
    public Optional<String> getLanguagesUrl() {
        return languagesUrl;
    }

    public void setLanguagesUrl(Optional<String> languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    public DeploymentWorkflowRunHeadRepository mergesUrl(String mergesUrl) {
        this.mergesUrl = Optional.ofNullable(mergesUrl);
        return this;
    }

    /**
     * Get mergesUrl
     * @return mergesUrl
     */
    @Schema(name = "merges_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("merges_url")
    public Optional<String> getMergesUrl() {
        return mergesUrl;
    }

    public void setMergesUrl(Optional<String> mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    public DeploymentWorkflowRunHeadRepository milestonesUrl(String milestonesUrl) {
        this.milestonesUrl = Optional.ofNullable(milestonesUrl);
        return this;
    }

    /**
     * Get milestonesUrl
     * @return milestonesUrl
     */
    @Schema(name = "milestones_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("milestones_url")
    public Optional<String> getMilestonesUrl() {
        return milestonesUrl;
    }

    public void setMilestonesUrl(Optional<String> milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    public DeploymentWorkflowRunHeadRepository name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public DeploymentWorkflowRunHeadRepository nodeId(String nodeId) {
        this.nodeId = Optional.ofNullable(nodeId);
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public Optional<String> getNodeId() {
        return nodeId;
    }

    public void setNodeId(Optional<String> nodeId) {
        this.nodeId = nodeId;
    }

    public DeploymentWorkflowRunHeadRepository notificationsUrl(String notificationsUrl) {
        this.notificationsUrl = Optional.ofNullable(notificationsUrl);
        return this;
    }

    /**
     * Get notificationsUrl
     * @return notificationsUrl
     */
    @Schema(name = "notifications_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("notifications_url")
    public Optional<String> getNotificationsUrl() {
        return notificationsUrl;
    }

    public void setNotificationsUrl(Optional<String> notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    public DeploymentWorkflowRunHeadRepository owner(DeploymentWorkflowRunHeadRepositoryOwner owner) {
        this.owner = Optional.ofNullable(owner);
        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    @Valid
    @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("owner")
    public Optional<DeploymentWorkflowRunHeadRepositoryOwner> getOwner() {
        return owner;
    }

    public void setOwner(Optional<DeploymentWorkflowRunHeadRepositoryOwner> owner) {
        this.owner = owner;
    }

    public DeploymentWorkflowRunHeadRepository _private(Boolean _private) {
        this._private = Optional.ofNullable(_private);
        return this;
    }

    /**
     * Get _private
     * @return _private
     */
    @Schema(name = "private", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("private")
    public Optional<Boolean> getPrivate() {
        return _private;
    }

    public void setPrivate(Optional<Boolean> _private) {
        this._private = _private;
    }

    public DeploymentWorkflowRunHeadRepository pullsUrl(String pullsUrl) {
        this.pullsUrl = Optional.ofNullable(pullsUrl);
        return this;
    }

    /**
     * Get pullsUrl
     * @return pullsUrl
     */
    @Schema(name = "pulls_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pulls_url")
    public Optional<String> getPullsUrl() {
        return pullsUrl;
    }

    public void setPullsUrl(Optional<String> pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    public DeploymentWorkflowRunHeadRepository releasesUrl(String releasesUrl) {
        this.releasesUrl = Optional.ofNullable(releasesUrl);
        return this;
    }

    /**
     * Get releasesUrl
     * @return releasesUrl
     */
    @Schema(name = "releases_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("releases_url")
    public Optional<String> getReleasesUrl() {
        return releasesUrl;
    }

    public void setReleasesUrl(Optional<String> releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    public DeploymentWorkflowRunHeadRepository stargazersUrl(String stargazersUrl) {
        this.stargazersUrl = Optional.ofNullable(stargazersUrl);
        return this;
    }

    /**
     * Get stargazersUrl
     * @return stargazersUrl
     */
    @Schema(name = "stargazers_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("stargazers_url")
    public Optional<String> getStargazersUrl() {
        return stargazersUrl;
    }

    public void setStargazersUrl(Optional<String> stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    public DeploymentWorkflowRunHeadRepository statusesUrl(String statusesUrl) {
        this.statusesUrl = Optional.ofNullable(statusesUrl);
        return this;
    }

    /**
     * Get statusesUrl
     * @return statusesUrl
     */
    @Schema(name = "statuses_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("statuses_url")
    public Optional<String> getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(Optional<String> statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public DeploymentWorkflowRunHeadRepository subscribersUrl(String subscribersUrl) {
        this.subscribersUrl = Optional.ofNullable(subscribersUrl);
        return this;
    }

    /**
     * Get subscribersUrl
     * @return subscribersUrl
     */
    @Schema(name = "subscribers_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subscribers_url")
    public Optional<String> getSubscribersUrl() {
        return subscribersUrl;
    }

    public void setSubscribersUrl(Optional<String> subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    public DeploymentWorkflowRunHeadRepository subscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = Optional.ofNullable(subscriptionUrl);
        return this;
    }

    /**
     * Get subscriptionUrl
     * @return subscriptionUrl
     */
    @Schema(name = "subscription_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subscription_url")
    public Optional<String> getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public void setSubscriptionUrl(Optional<String> subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public DeploymentWorkflowRunHeadRepository tagsUrl(String tagsUrl) {
        this.tagsUrl = Optional.ofNullable(tagsUrl);
        return this;
    }

    /**
     * Get tagsUrl
     * @return tagsUrl
     */
    @Schema(name = "tags_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tags_url")
    public Optional<String> getTagsUrl() {
        return tagsUrl;
    }

    public void setTagsUrl(Optional<String> tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    public DeploymentWorkflowRunHeadRepository teamsUrl(String teamsUrl) {
        this.teamsUrl = Optional.ofNullable(teamsUrl);
        return this;
    }

    /**
     * Get teamsUrl
     * @return teamsUrl
     */
    @Schema(name = "teams_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("teams_url")
    public Optional<String> getTeamsUrl() {
        return teamsUrl;
    }

    public void setTeamsUrl(Optional<String> teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public DeploymentWorkflowRunHeadRepository treesUrl(String treesUrl) {
        this.treesUrl = Optional.ofNullable(treesUrl);
        return this;
    }

    /**
     * Get treesUrl
     * @return treesUrl
     */
    @Schema(name = "trees_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("trees_url")
    public Optional<String> getTreesUrl() {
        return treesUrl;
    }

    public void setTreesUrl(Optional<String> treesUrl) {
        this.treesUrl = treesUrl;
    }

    public DeploymentWorkflowRunHeadRepository url(String url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public Optional<String> getUrl() {
        return url;
    }

    public void setUrl(Optional<String> url) {
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
        DeploymentWorkflowRunHeadRepository deploymentWorkflowRunHeadRepository =
                (DeploymentWorkflowRunHeadRepository) o;
        return Objects.equals(this.archiveUrl, deploymentWorkflowRunHeadRepository.archiveUrl)
                && Objects.equals(this.assigneesUrl, deploymentWorkflowRunHeadRepository.assigneesUrl)
                && Objects.equals(this.blobsUrl, deploymentWorkflowRunHeadRepository.blobsUrl)
                && Objects.equals(this.branchesUrl, deploymentWorkflowRunHeadRepository.branchesUrl)
                && Objects.equals(this.collaboratorsUrl, deploymentWorkflowRunHeadRepository.collaboratorsUrl)
                && Objects.equals(this.commentsUrl, deploymentWorkflowRunHeadRepository.commentsUrl)
                && Objects.equals(this.commitsUrl, deploymentWorkflowRunHeadRepository.commitsUrl)
                && Objects.equals(this.compareUrl, deploymentWorkflowRunHeadRepository.compareUrl)
                && Objects.equals(this.contentsUrl, deploymentWorkflowRunHeadRepository.contentsUrl)
                && Objects.equals(this.contributorsUrl, deploymentWorkflowRunHeadRepository.contributorsUrl)
                && Objects.equals(this.deploymentsUrl, deploymentWorkflowRunHeadRepository.deploymentsUrl)
                && equalsNullable(this.description, deploymentWorkflowRunHeadRepository.description)
                && Objects.equals(this.downloadsUrl, deploymentWorkflowRunHeadRepository.downloadsUrl)
                && Objects.equals(this.eventsUrl, deploymentWorkflowRunHeadRepository.eventsUrl)
                && Objects.equals(this.fork, deploymentWorkflowRunHeadRepository.fork)
                && Objects.equals(this.forksUrl, deploymentWorkflowRunHeadRepository.forksUrl)
                && Objects.equals(this.fullName, deploymentWorkflowRunHeadRepository.fullName)
                && Objects.equals(this.gitCommitsUrl, deploymentWorkflowRunHeadRepository.gitCommitsUrl)
                && Objects.equals(this.gitRefsUrl, deploymentWorkflowRunHeadRepository.gitRefsUrl)
                && Objects.equals(this.gitTagsUrl, deploymentWorkflowRunHeadRepository.gitTagsUrl)
                && Objects.equals(this.hooksUrl, deploymentWorkflowRunHeadRepository.hooksUrl)
                && Objects.equals(this.htmlUrl, deploymentWorkflowRunHeadRepository.htmlUrl)
                && Objects.equals(this.id, deploymentWorkflowRunHeadRepository.id)
                && Objects.equals(this.issueCommentUrl, deploymentWorkflowRunHeadRepository.issueCommentUrl)
                && Objects.equals(this.issueEventsUrl, deploymentWorkflowRunHeadRepository.issueEventsUrl)
                && Objects.equals(this.issuesUrl, deploymentWorkflowRunHeadRepository.issuesUrl)
                && Objects.equals(this.keysUrl, deploymentWorkflowRunHeadRepository.keysUrl)
                && Objects.equals(this.labelsUrl, deploymentWorkflowRunHeadRepository.labelsUrl)
                && Objects.equals(this.languagesUrl, deploymentWorkflowRunHeadRepository.languagesUrl)
                && Objects.equals(this.mergesUrl, deploymentWorkflowRunHeadRepository.mergesUrl)
                && Objects.equals(this.milestonesUrl, deploymentWorkflowRunHeadRepository.milestonesUrl)
                && Objects.equals(this.name, deploymentWorkflowRunHeadRepository.name)
                && Objects.equals(this.nodeId, deploymentWorkflowRunHeadRepository.nodeId)
                && Objects.equals(this.notificationsUrl, deploymentWorkflowRunHeadRepository.notificationsUrl)
                && Objects.equals(this.owner, deploymentWorkflowRunHeadRepository.owner)
                && Objects.equals(this._private, deploymentWorkflowRunHeadRepository._private)
                && Objects.equals(this.pullsUrl, deploymentWorkflowRunHeadRepository.pullsUrl)
                && Objects.equals(this.releasesUrl, deploymentWorkflowRunHeadRepository.releasesUrl)
                && Objects.equals(this.stargazersUrl, deploymentWorkflowRunHeadRepository.stargazersUrl)
                && Objects.equals(this.statusesUrl, deploymentWorkflowRunHeadRepository.statusesUrl)
                && Objects.equals(this.subscribersUrl, deploymentWorkflowRunHeadRepository.subscribersUrl)
                && Objects.equals(this.subscriptionUrl, deploymentWorkflowRunHeadRepository.subscriptionUrl)
                && Objects.equals(this.tagsUrl, deploymentWorkflowRunHeadRepository.tagsUrl)
                && Objects.equals(this.teamsUrl, deploymentWorkflowRunHeadRepository.teamsUrl)
                && Objects.equals(this.treesUrl, deploymentWorkflowRunHeadRepository.treesUrl)
                && Objects.equals(this.url, deploymentWorkflowRunHeadRepository.url);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                archiveUrl,
                assigneesUrl,
                blobsUrl,
                branchesUrl,
                collaboratorsUrl,
                commentsUrl,
                commitsUrl,
                compareUrl,
                contentsUrl,
                contributorsUrl,
                deploymentsUrl,
                hashCodeNullable(description),
                downloadsUrl,
                eventsUrl,
                fork,
                forksUrl,
                fullName,
                gitCommitsUrl,
                gitRefsUrl,
                gitTagsUrl,
                hooksUrl,
                htmlUrl,
                id,
                issueCommentUrl,
                issueEventsUrl,
                issuesUrl,
                keysUrl,
                labelsUrl,
                languagesUrl,
                mergesUrl,
                milestonesUrl,
                name,
                nodeId,
                notificationsUrl,
                owner,
                _private,
                pullsUrl,
                releasesUrl,
                stargazersUrl,
                statusesUrl,
                subscribersUrl,
                subscriptionUrl,
                tagsUrl,
                teamsUrl,
                treesUrl,
                url);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentWorkflowRunHeadRepository {\n");
        sb.append("    archiveUrl: ").append(toIndentedString(archiveUrl)).append("\n");
        sb.append("    assigneesUrl: ").append(toIndentedString(assigneesUrl)).append("\n");
        sb.append("    blobsUrl: ").append(toIndentedString(blobsUrl)).append("\n");
        sb.append("    branchesUrl: ").append(toIndentedString(branchesUrl)).append("\n");
        sb.append("    collaboratorsUrl: ")
                .append(toIndentedString(collaboratorsUrl))
                .append("\n");
        sb.append("    commentsUrl: ").append(toIndentedString(commentsUrl)).append("\n");
        sb.append("    commitsUrl: ").append(toIndentedString(commitsUrl)).append("\n");
        sb.append("    compareUrl: ").append(toIndentedString(compareUrl)).append("\n");
        sb.append("    contentsUrl: ").append(toIndentedString(contentsUrl)).append("\n");
        sb.append("    contributorsUrl: ")
                .append(toIndentedString(contributorsUrl))
                .append("\n");
        sb.append("    deploymentsUrl: ")
                .append(toIndentedString(deploymentsUrl))
                .append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    downloadsUrl: ").append(toIndentedString(downloadsUrl)).append("\n");
        sb.append("    eventsUrl: ").append(toIndentedString(eventsUrl)).append("\n");
        sb.append("    fork: ").append(toIndentedString(fork)).append("\n");
        sb.append("    forksUrl: ").append(toIndentedString(forksUrl)).append("\n");
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
        sb.append("    gitCommitsUrl: ").append(toIndentedString(gitCommitsUrl)).append("\n");
        sb.append("    gitRefsUrl: ").append(toIndentedString(gitRefsUrl)).append("\n");
        sb.append("    gitTagsUrl: ").append(toIndentedString(gitTagsUrl)).append("\n");
        sb.append("    hooksUrl: ").append(toIndentedString(hooksUrl)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    issueCommentUrl: ")
                .append(toIndentedString(issueCommentUrl))
                .append("\n");
        sb.append("    issueEventsUrl: ")
                .append(toIndentedString(issueEventsUrl))
                .append("\n");
        sb.append("    issuesUrl: ").append(toIndentedString(issuesUrl)).append("\n");
        sb.append("    keysUrl: ").append(toIndentedString(keysUrl)).append("\n");
        sb.append("    labelsUrl: ").append(toIndentedString(labelsUrl)).append("\n");
        sb.append("    languagesUrl: ").append(toIndentedString(languagesUrl)).append("\n");
        sb.append("    mergesUrl: ").append(toIndentedString(mergesUrl)).append("\n");
        sb.append("    milestonesUrl: ").append(toIndentedString(milestonesUrl)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    notificationsUrl: ")
                .append(toIndentedString(notificationsUrl))
                .append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
        sb.append("    pullsUrl: ").append(toIndentedString(pullsUrl)).append("\n");
        sb.append("    releasesUrl: ").append(toIndentedString(releasesUrl)).append("\n");
        sb.append("    stargazersUrl: ").append(toIndentedString(stargazersUrl)).append("\n");
        sb.append("    statusesUrl: ").append(toIndentedString(statusesUrl)).append("\n");
        sb.append("    subscribersUrl: ")
                .append(toIndentedString(subscribersUrl))
                .append("\n");
        sb.append("    subscriptionUrl: ")
                .append(toIndentedString(subscriptionUrl))
                .append("\n");
        sb.append("    tagsUrl: ").append(toIndentedString(tagsUrl)).append("\n");
        sb.append("    teamsUrl: ").append(toIndentedString(teamsUrl)).append("\n");
        sb.append("    treesUrl: ").append(toIndentedString(treesUrl)).append("\n");
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
