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
 * DeploymentWorkflowRun1HeadRepository
 */
@JsonTypeName("Deployment_Workflow_Run_1_head_repository")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DeploymentWorkflowRun1HeadRepository {

    private String archiveUrl;

    private String assigneesUrl;

    private String blobsUrl;

    private String branchesUrl;

    private String collaboratorsUrl;

    private String commentsUrl;

    private String commitsUrl;

    private String compareUrl;

    private String contentsUrl;

    private String contributorsUrl;

    private String deploymentsUrl;

    private String description = null;

    private String downloadsUrl;

    private String eventsUrl;

    private Boolean fork;

    private String forksUrl;

    private String fullName;

    private String gitCommitsUrl;

    private String gitRefsUrl;

    private String gitTagsUrl;

    private String hooksUrl;

    private String htmlUrl;

    private Long id;

    private String issueCommentUrl;

    private String issueEventsUrl;

    private String issuesUrl;

    private String keysUrl;

    private String labelsUrl;

    private String languagesUrl;

    private String mergesUrl;

    private String milestonesUrl;

    private String name;

    private String nodeId;

    private String notificationsUrl;

    private WebhooksSponsorshipMaintainer owner;

    private Boolean _private;

    private String pullsUrl;

    private String releasesUrl;

    private String stargazersUrl;

    private String statusesUrl;

    private String subscribersUrl;

    private String subscriptionUrl;

    private String tagsUrl;

    private String teamsUrl;

    private String treesUrl;

    private String url;

    public DeploymentWorkflowRun1HeadRepository archiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
        return this;
    }

    /**
     * Get archiveUrl
     * @return archiveUrl
     */
    @Schema(name = "archive_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("archive_url")
    public String getArchiveUrl() {
        return archiveUrl;
    }

    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public DeploymentWorkflowRun1HeadRepository assigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
        return this;
    }

    /**
     * Get assigneesUrl
     * @return assigneesUrl
     */
    @Schema(name = "assignees_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assignees_url")
    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    public DeploymentWorkflowRun1HeadRepository blobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
        return this;
    }

    /**
     * Get blobsUrl
     * @return blobsUrl
     */
    @Schema(name = "blobs_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("blobs_url")
    public String getBlobsUrl() {
        return blobsUrl;
    }

    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    public DeploymentWorkflowRun1HeadRepository branchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
        return this;
    }

    /**
     * Get branchesUrl
     * @return branchesUrl
     */
    @Schema(name = "branches_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("branches_url")
    public String getBranchesUrl() {
        return branchesUrl;
    }

    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    public DeploymentWorkflowRun1HeadRepository collaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
        return this;
    }

    /**
     * Get collaboratorsUrl
     * @return collaboratorsUrl
     */
    @Schema(name = "collaborators_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("collaborators_url")
    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    public DeploymentWorkflowRun1HeadRepository commentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
        return this;
    }

    /**
     * Get commentsUrl
     * @return commentsUrl
     */
    @Schema(name = "comments_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("comments_url")
    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public DeploymentWorkflowRun1HeadRepository commitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
        return this;
    }

    /**
     * Get commitsUrl
     * @return commitsUrl
     */
    @Schema(name = "commits_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("commits_url")
    public String getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public DeploymentWorkflowRun1HeadRepository compareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
        return this;
    }

    /**
     * Get compareUrl
     * @return compareUrl
     */
    @Schema(name = "compare_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("compare_url")
    public String getCompareUrl() {
        return compareUrl;
    }

    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    public DeploymentWorkflowRun1HeadRepository contentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
        return this;
    }

    /**
     * Get contentsUrl
     * @return contentsUrl
     */
    @Schema(name = "contents_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("contents_url")
    public String getContentsUrl() {
        return contentsUrl;
    }

    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    public DeploymentWorkflowRun1HeadRepository contributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
        return this;
    }

    /**
     * Get contributorsUrl
     * @return contributorsUrl
     */
    @Schema(name = "contributors_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("contributors_url")
    public String getContributorsUrl() {
        return contributorsUrl;
    }

    public void setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    public DeploymentWorkflowRun1HeadRepository deploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
        return this;
    }

    /**
     * Get deploymentsUrl
     * @return deploymentsUrl
     */
    @Schema(name = "deployments_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deployments_url")
    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public void setDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    public DeploymentWorkflowRun1HeadRepository description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DeploymentWorkflowRun1HeadRepository downloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
        return this;
    }

    /**
     * Get downloadsUrl
     * @return downloadsUrl
     */
    @Schema(name = "downloads_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("downloads_url")
    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    public void setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    public DeploymentWorkflowRun1HeadRepository eventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    /**
     * Get eventsUrl
     * @return eventsUrl
     */
    @Schema(name = "events_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public DeploymentWorkflowRun1HeadRepository fork(Boolean fork) {
        this.fork = fork;
        return this;
    }

    /**
     * Get fork
     * @return fork
     */
    @Schema(name = "fork", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("fork")
    public Boolean getFork() {
        return fork;
    }

    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    public DeploymentWorkflowRun1HeadRepository forksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
        return this;
    }

    /**
     * Get forksUrl
     * @return forksUrl
     */
    @Schema(name = "forks_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("forks_url")
    public String getForksUrl() {
        return forksUrl;
    }

    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    public DeploymentWorkflowRun1HeadRepository fullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * Get fullName
     * @return fullName
     */
    @Schema(name = "full_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public DeploymentWorkflowRun1HeadRepository gitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
        return this;
    }

    /**
     * Get gitCommitsUrl
     * @return gitCommitsUrl
     */
    @Schema(name = "git_commits_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("git_commits_url")
    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    public DeploymentWorkflowRun1HeadRepository gitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
        return this;
    }

    /**
     * Get gitRefsUrl
     * @return gitRefsUrl
     */
    @Schema(name = "git_refs_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("git_refs_url")
    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    public DeploymentWorkflowRun1HeadRepository gitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
        return this;
    }

    /**
     * Get gitTagsUrl
     * @return gitTagsUrl
     */
    @Schema(name = "git_tags_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("git_tags_url")
    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    public DeploymentWorkflowRun1HeadRepository hooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
        return this;
    }

    /**
     * Get hooksUrl
     * @return hooksUrl
     */
    @Schema(name = "hooks_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("hooks_url")
    public String getHooksUrl() {
        return hooksUrl;
    }

    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public DeploymentWorkflowRun1HeadRepository htmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public DeploymentWorkflowRun1HeadRepository id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DeploymentWorkflowRun1HeadRepository issueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
        return this;
    }

    /**
     * Get issueCommentUrl
     * @return issueCommentUrl
     */
    @Schema(name = "issue_comment_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issue_comment_url")
    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    public DeploymentWorkflowRun1HeadRepository issueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
        return this;
    }

    /**
     * Get issueEventsUrl
     * @return issueEventsUrl
     */
    @Schema(name = "issue_events_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issue_events_url")
    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    public DeploymentWorkflowRun1HeadRepository issuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
        return this;
    }

    /**
     * Get issuesUrl
     * @return issuesUrl
     */
    @Schema(name = "issues_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issues_url")
    public String getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public DeploymentWorkflowRun1HeadRepository keysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
        return this;
    }

    /**
     * Get keysUrl
     * @return keysUrl
     */
    @Schema(name = "keys_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("keys_url")
    public String getKeysUrl() {
        return keysUrl;
    }

    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    public DeploymentWorkflowRun1HeadRepository labelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
        return this;
    }

    /**
     * Get labelsUrl
     * @return labelsUrl
     */
    @Schema(name = "labels_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("labels_url")
    public String getLabelsUrl() {
        return labelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public DeploymentWorkflowRun1HeadRepository languagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
        return this;
    }

    /**
     * Get languagesUrl
     * @return languagesUrl
     */
    @Schema(name = "languages_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("languages_url")
    public String getLanguagesUrl() {
        return languagesUrl;
    }

    public void setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    public DeploymentWorkflowRun1HeadRepository mergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
        return this;
    }

    /**
     * Get mergesUrl
     * @return mergesUrl
     */
    @Schema(name = "merges_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("merges_url")
    public String getMergesUrl() {
        return mergesUrl;
    }

    public void setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    public DeploymentWorkflowRun1HeadRepository milestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
        return this;
    }

    /**
     * Get milestonesUrl
     * @return milestonesUrl
     */
    @Schema(name = "milestones_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("milestones_url")
    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    public DeploymentWorkflowRun1HeadRepository name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeploymentWorkflowRun1HeadRepository nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public DeploymentWorkflowRun1HeadRepository notificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
        return this;
    }

    /**
     * Get notificationsUrl
     * @return notificationsUrl
     */
    @Schema(name = "notifications_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("notifications_url")
    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    public DeploymentWorkflowRun1HeadRepository owner(WebhooksSponsorshipMaintainer owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    @Valid
    @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("owner")
    public WebhooksSponsorshipMaintainer getOwner() {
        return owner;
    }

    public void setOwner(WebhooksSponsorshipMaintainer owner) {
        this.owner = owner;
    }

    public DeploymentWorkflowRun1HeadRepository _private(Boolean _private) {
        this._private = _private;
        return this;
    }

    /**
     * Get _private
     * @return _private
     */
    @Schema(name = "private", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("private")
    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public DeploymentWorkflowRun1HeadRepository pullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
        return this;
    }

    /**
     * Get pullsUrl
     * @return pullsUrl
     */
    @Schema(name = "pulls_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pulls_url")
    public String getPullsUrl() {
        return pullsUrl;
    }

    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    public DeploymentWorkflowRun1HeadRepository releasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
        return this;
    }

    /**
     * Get releasesUrl
     * @return releasesUrl
     */
    @Schema(name = "releases_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("releases_url")
    public String getReleasesUrl() {
        return releasesUrl;
    }

    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    public DeploymentWorkflowRun1HeadRepository stargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
        return this;
    }

    /**
     * Get stargazersUrl
     * @return stargazersUrl
     */
    @Schema(name = "stargazers_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("stargazers_url")
    public String getStargazersUrl() {
        return stargazersUrl;
    }

    public void setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    public DeploymentWorkflowRun1HeadRepository statusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
        return this;
    }

    /**
     * Get statusesUrl
     * @return statusesUrl
     */
    @Schema(name = "statuses_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("statuses_url")
    public String getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public DeploymentWorkflowRun1HeadRepository subscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
        return this;
    }

    /**
     * Get subscribersUrl
     * @return subscribersUrl
     */
    @Schema(name = "subscribers_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subscribers_url")
    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    public void setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    public DeploymentWorkflowRun1HeadRepository subscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
        return this;
    }

    /**
     * Get subscriptionUrl
     * @return subscriptionUrl
     */
    @Schema(name = "subscription_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subscription_url")
    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public DeploymentWorkflowRun1HeadRepository tagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
        return this;
    }

    /**
     * Get tagsUrl
     * @return tagsUrl
     */
    @Schema(name = "tags_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tags_url")
    public String getTagsUrl() {
        return tagsUrl;
    }

    public void setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    public DeploymentWorkflowRun1HeadRepository teamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
        return this;
    }

    /**
     * Get teamsUrl
     * @return teamsUrl
     */
    @Schema(name = "teams_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("teams_url")
    public String getTeamsUrl() {
        return teamsUrl;
    }

    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public DeploymentWorkflowRun1HeadRepository treesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
        return this;
    }

    /**
     * Get treesUrl
     * @return treesUrl
     */
    @Schema(name = "trees_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("trees_url")
    public String getTreesUrl() {
        return treesUrl;
    }

    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    public DeploymentWorkflowRun1HeadRepository url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
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
        DeploymentWorkflowRun1HeadRepository deploymentWorkflowRun1HeadRepository =
                (DeploymentWorkflowRun1HeadRepository) o;
        return Objects.equals(this.archiveUrl, deploymentWorkflowRun1HeadRepository.archiveUrl)
                && Objects.equals(this.assigneesUrl, deploymentWorkflowRun1HeadRepository.assigneesUrl)
                && Objects.equals(this.blobsUrl, deploymentWorkflowRun1HeadRepository.blobsUrl)
                && Objects.equals(this.branchesUrl, deploymentWorkflowRun1HeadRepository.branchesUrl)
                && Objects.equals(this.collaboratorsUrl, deploymentWorkflowRun1HeadRepository.collaboratorsUrl)
                && Objects.equals(this.commentsUrl, deploymentWorkflowRun1HeadRepository.commentsUrl)
                && Objects.equals(this.commitsUrl, deploymentWorkflowRun1HeadRepository.commitsUrl)
                && Objects.equals(this.compareUrl, deploymentWorkflowRun1HeadRepository.compareUrl)
                && Objects.equals(this.contentsUrl, deploymentWorkflowRun1HeadRepository.contentsUrl)
                && Objects.equals(this.contributorsUrl, deploymentWorkflowRun1HeadRepository.contributorsUrl)
                && Objects.equals(this.deploymentsUrl, deploymentWorkflowRun1HeadRepository.deploymentsUrl)
                && Objects.equals(this.description, deploymentWorkflowRun1HeadRepository.description)
                && Objects.equals(this.downloadsUrl, deploymentWorkflowRun1HeadRepository.downloadsUrl)
                && Objects.equals(this.eventsUrl, deploymentWorkflowRun1HeadRepository.eventsUrl)
                && Objects.equals(this.fork, deploymentWorkflowRun1HeadRepository.fork)
                && Objects.equals(this.forksUrl, deploymentWorkflowRun1HeadRepository.forksUrl)
                && Objects.equals(this.fullName, deploymentWorkflowRun1HeadRepository.fullName)
                && Objects.equals(this.gitCommitsUrl, deploymentWorkflowRun1HeadRepository.gitCommitsUrl)
                && Objects.equals(this.gitRefsUrl, deploymentWorkflowRun1HeadRepository.gitRefsUrl)
                && Objects.equals(this.gitTagsUrl, deploymentWorkflowRun1HeadRepository.gitTagsUrl)
                && Objects.equals(this.hooksUrl, deploymentWorkflowRun1HeadRepository.hooksUrl)
                && Objects.equals(this.htmlUrl, deploymentWorkflowRun1HeadRepository.htmlUrl)
                && Objects.equals(this.id, deploymentWorkflowRun1HeadRepository.id)
                && Objects.equals(this.issueCommentUrl, deploymentWorkflowRun1HeadRepository.issueCommentUrl)
                && Objects.equals(this.issueEventsUrl, deploymentWorkflowRun1HeadRepository.issueEventsUrl)
                && Objects.equals(this.issuesUrl, deploymentWorkflowRun1HeadRepository.issuesUrl)
                && Objects.equals(this.keysUrl, deploymentWorkflowRun1HeadRepository.keysUrl)
                && Objects.equals(this.labelsUrl, deploymentWorkflowRun1HeadRepository.labelsUrl)
                && Objects.equals(this.languagesUrl, deploymentWorkflowRun1HeadRepository.languagesUrl)
                && Objects.equals(this.mergesUrl, deploymentWorkflowRun1HeadRepository.mergesUrl)
                && Objects.equals(this.milestonesUrl, deploymentWorkflowRun1HeadRepository.milestonesUrl)
                && Objects.equals(this.name, deploymentWorkflowRun1HeadRepository.name)
                && Objects.equals(this.nodeId, deploymentWorkflowRun1HeadRepository.nodeId)
                && Objects.equals(this.notificationsUrl, deploymentWorkflowRun1HeadRepository.notificationsUrl)
                && Objects.equals(this.owner, deploymentWorkflowRun1HeadRepository.owner)
                && Objects.equals(this._private, deploymentWorkflowRun1HeadRepository._private)
                && Objects.equals(this.pullsUrl, deploymentWorkflowRun1HeadRepository.pullsUrl)
                && Objects.equals(this.releasesUrl, deploymentWorkflowRun1HeadRepository.releasesUrl)
                && Objects.equals(this.stargazersUrl, deploymentWorkflowRun1HeadRepository.stargazersUrl)
                && Objects.equals(this.statusesUrl, deploymentWorkflowRun1HeadRepository.statusesUrl)
                && Objects.equals(this.subscribersUrl, deploymentWorkflowRun1HeadRepository.subscribersUrl)
                && Objects.equals(this.subscriptionUrl, deploymentWorkflowRun1HeadRepository.subscriptionUrl)
                && Objects.equals(this.tagsUrl, deploymentWorkflowRun1HeadRepository.tagsUrl)
                && Objects.equals(this.teamsUrl, deploymentWorkflowRun1HeadRepository.teamsUrl)
                && Objects.equals(this.treesUrl, deploymentWorkflowRun1HeadRepository.treesUrl)
                && Objects.equals(this.url, deploymentWorkflowRun1HeadRepository.url);
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
                description,
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentWorkflowRun1HeadRepository {\n");
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
