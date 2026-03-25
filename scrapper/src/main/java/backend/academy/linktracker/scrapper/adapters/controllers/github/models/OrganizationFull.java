package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Organization Full
 */
@Schema(name = "organization-full", description = "Organization Full")
@JsonTypeName("organization-full")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrganizationFull {

    private String login;

    private Long id;

    private String nodeId;

    private URI url;

    private URI reposUrl;

    private URI eventsUrl;

    private String hooksUrl;

    private String issuesUrl;

    private String membersUrl;

    private String publicMembersUrl;

    private String avatarUrl;

    private String description = null;

    private String name;

    private String company;

    private URI blog;

    private String location;

    private String email;

    private String twitterUsername = null;

    private Boolean isVerified;

    private Boolean hasOrganizationProjects;

    private Boolean hasRepositoryProjects;

    private Long publicRepos;

    private Long publicGists;

    private Long followers;

    private Long following;

    private URI htmlUrl;

    private String type;

    private Long totalPrivateRepos;

    private Long ownedPrivateRepos;

    private Long privateGists = null;

    private Long diskUsage = null;

    private Long collaborators = null;

    private String billingEmail = null;

    private OrganizationFullPlan plan;

    private String defaultRepositoryPermission = null;

    private String defaultRepositoryBranch = null;

    private Boolean membersCanCreateRepositories = null;

    private Boolean twoFactorRequirementEnabled = null;

    private String membersAllowedRepositoryCreationType;

    private Boolean membersCanCreatePublicRepositories;

    private Boolean membersCanCreatePrivateRepositories;

    private Boolean membersCanCreateInternalRepositories;

    private Boolean membersCanCreatePages;

    private Boolean membersCanCreatePublicPages;

    private Boolean membersCanCreatePrivatePages;

    private Boolean membersCanDeleteRepositories;

    private Boolean membersCanChangeRepoVisibility;

    private Boolean membersCanInviteOutsideCollaborators;

    private Boolean membersCanDeleteIssues;

    private Boolean displayCommenterFullNameSettingEnabled;

    private Boolean readersCanCreateDiscussions;

    private Boolean membersCanCreateTeams;

    private Boolean membersCanViewDependencyInsights;

    private Boolean membersCanForkPrivateRepositories = null;

    private Boolean webCommitSignoffRequired;

    @Deprecated
    private Boolean advancedSecurityEnabledForNewRepositories;

    @Deprecated
    private Boolean dependabotAlertsEnabledForNewRepositories;

    @Deprecated
    private Boolean dependabotSecurityUpdatesEnabledForNewRepositories;

    @Deprecated
    private Boolean dependencyGraphEnabledForNewRepositories;

    @Deprecated
    private Boolean secretScanningEnabledForNewRepositories;

    @Deprecated
    private Boolean secretScanningPushProtectionEnabledForNewRepositories;

    private String secretScanningPushProtectionCustomLink = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime archivedAt = null;

    private Boolean deployKeysEnabledForRepositories;

    public OrganizationFull() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrganizationFull(
            String login,
            Long id,
            String nodeId,
            URI url,
            URI reposUrl,
            URI eventsUrl,
            String hooksUrl,
            String issuesUrl,
            String membersUrl,
            String publicMembersUrl,
            String avatarUrl,
            String description,
            Boolean hasOrganizationProjects,
            Boolean hasRepositoryProjects,
            Long publicRepos,
            Long publicGists,
            Long followers,
            Long following,
            URI htmlUrl,
            String type,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            OffsetDateTime archivedAt) {
        this.login = login;
        this.id = id;
        this.nodeId = nodeId;
        this.url = url;
        this.reposUrl = reposUrl;
        this.eventsUrl = eventsUrl;
        this.hooksUrl = hooksUrl;
        this.issuesUrl = issuesUrl;
        this.membersUrl = membersUrl;
        this.publicMembersUrl = publicMembersUrl;
        this.avatarUrl = avatarUrl;
        this.description = description;
        this.hasOrganizationProjects = hasOrganizationProjects;
        this.hasRepositoryProjects = hasRepositoryProjects;
        this.publicRepos = publicRepos;
        this.publicGists = publicGists;
        this.followers = followers;
        this.following = following;
        this.htmlUrl = htmlUrl;
        this.type = type;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.archivedAt = archivedAt;
    }

    public OrganizationFull login(String login) {
        this.login = login;
        return this;
    }

    /**
     * Get login
     * @return login
     */
    @NotNull
    @Schema(name = "login", example = "github", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public OrganizationFull id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrganizationFull nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", example = "MDEyOk9yZ2FuaXphdGlvbjE=", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public OrganizationFull url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", example = "https://api.github.com/orgs/github", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public OrganizationFull reposUrl(URI reposUrl) {
        this.reposUrl = reposUrl;
        return this;
    }

    /**
     * Get reposUrl
     * @return reposUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "repos_url",
            example = "https://api.github.com/orgs/github/repos",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repos_url")
    public URI getReposUrl() {
        return reposUrl;
    }

    public void setReposUrl(URI reposUrl) {
        this.reposUrl = reposUrl;
    }

    public OrganizationFull eventsUrl(URI eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    /**
     * Get eventsUrl
     * @return eventsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "events_url",
            example = "https://api.github.com/orgs/github/events",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("events_url")
    public URI getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(URI eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public OrganizationFull hooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
        return this;
    }

    /**
     * Get hooksUrl
     * @return hooksUrl
     */
    @NotNull
    @Schema(
            name = "hooks_url",
            example = "https://api.github.com/orgs/github/hooks",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("hooks_url")
    public String getHooksUrl() {
        return hooksUrl;
    }

    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public OrganizationFull issuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
        return this;
    }

    /**
     * Get issuesUrl
     * @return issuesUrl
     */
    @NotNull
    @Schema(
            name = "issues_url",
            example = "https://api.github.com/orgs/github/issues",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issues_url")
    public String getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public OrganizationFull membersUrl(String membersUrl) {
        this.membersUrl = membersUrl;
        return this;
    }

    /**
     * Get membersUrl
     * @return membersUrl
     */
    @NotNull
    @Schema(
            name = "members_url",
            example = "https://api.github.com/orgs/github/members{/member}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("members_url")
    public String getMembersUrl() {
        return membersUrl;
    }

    public void setMembersUrl(String membersUrl) {
        this.membersUrl = membersUrl;
    }

    public OrganizationFull publicMembersUrl(String publicMembersUrl) {
        this.publicMembersUrl = publicMembersUrl;
        return this;
    }

    /**
     * Get publicMembersUrl
     * @return publicMembersUrl
     */
    @NotNull
    @Schema(
            name = "public_members_url",
            example = "https://api.github.com/orgs/github/public_members{/member}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("public_members_url")
    public String getPublicMembersUrl() {
        return publicMembersUrl;
    }

    public void setPublicMembersUrl(String publicMembersUrl) {
        this.publicMembersUrl = publicMembersUrl;
    }

    public OrganizationFull avatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    /**
     * Get avatarUrl
     * @return avatarUrl
     */
    @NotNull
    @Schema(
            name = "avatar_url",
            example = "https://github.com/images/error/octocat_happy.gif",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("avatar_url")
    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public OrganizationFull description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", example = "A great organization", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OrganizationFull name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", example = "github", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrganizationFull company(String company) {
        this.company = company;
        return this;
    }

    /**
     * Get company
     * @return company
     */
    @Schema(name = "company", example = "GitHub", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("company")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public OrganizationFull blog(URI blog) {
        this.blog = blog;
        return this;
    }

    /**
     * Get blog
     * @return blog
     */
    @Valid
    @Schema(name = "blog", example = "https://github.com/blog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("blog")
    public URI getBlog() {
        return blog;
    }

    public void setBlog(URI blog) {
        this.blog = blog;
    }

    public OrganizationFull location(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get location
     * @return location
     */
    @Schema(name = "location", example = "San Francisco", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public OrganizationFull email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     * @return email
     */
    @jakarta.validation.constraints.Email
    @Schema(name = "email", example = "octocat@github.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public OrganizationFull twitterUsername(String twitterUsername) {
        this.twitterUsername = twitterUsername;
        return this;
    }

    /**
     * Get twitterUsername
     * @return twitterUsername
     */
    @Schema(name = "twitter_username", example = "github", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("twitter_username")
    public String getTwitterUsername() {
        return twitterUsername;
    }

    public void setTwitterUsername(String twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    public OrganizationFull isVerified(Boolean isVerified) {
        this.isVerified = isVerified;
        return this;
    }

    /**
     * Get isVerified
     * @return isVerified
     */
    @Schema(name = "is_verified", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_verified")
    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public OrganizationFull hasOrganizationProjects(Boolean hasOrganizationProjects) {
        this.hasOrganizationProjects = hasOrganizationProjects;
        return this;
    }

    /**
     * Get hasOrganizationProjects
     * @return hasOrganizationProjects
     */
    @NotNull
    @Schema(name = "has_organization_projects", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("has_organization_projects")
    public Boolean getHasOrganizationProjects() {
        return hasOrganizationProjects;
    }

    public void setHasOrganizationProjects(Boolean hasOrganizationProjects) {
        this.hasOrganizationProjects = hasOrganizationProjects;
    }

    public OrganizationFull hasRepositoryProjects(Boolean hasRepositoryProjects) {
        this.hasRepositoryProjects = hasRepositoryProjects;
        return this;
    }

    /**
     * Get hasRepositoryProjects
     * @return hasRepositoryProjects
     */
    @NotNull
    @Schema(name = "has_repository_projects", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("has_repository_projects")
    public Boolean getHasRepositoryProjects() {
        return hasRepositoryProjects;
    }

    public void setHasRepositoryProjects(Boolean hasRepositoryProjects) {
        this.hasRepositoryProjects = hasRepositoryProjects;
    }

    public OrganizationFull publicRepos(Long publicRepos) {
        this.publicRepos = publicRepos;
        return this;
    }

    /**
     * Get publicRepos
     * @return publicRepos
     */
    @NotNull
    @Schema(name = "public_repos", example = "2", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("public_repos")
    public Long getPublicRepos() {
        return publicRepos;
    }

    public void setPublicRepos(Long publicRepos) {
        this.publicRepos = publicRepos;
    }

    public OrganizationFull publicGists(Long publicGists) {
        this.publicGists = publicGists;
        return this;
    }

    /**
     * Get publicGists
     * @return publicGists
     */
    @NotNull
    @Schema(name = "public_gists", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("public_gists")
    public Long getPublicGists() {
        return publicGists;
    }

    public void setPublicGists(Long publicGists) {
        this.publicGists = publicGists;
    }

    public OrganizationFull followers(Long followers) {
        this.followers = followers;
        return this;
    }

    /**
     * Get followers
     * @return followers
     */
    @NotNull
    @Schema(name = "followers", example = "20", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("followers")
    public Long getFollowers() {
        return followers;
    }

    public void setFollowers(Long followers) {
        this.followers = followers;
    }

    public OrganizationFull following(Long following) {
        this.following = following;
        return this;
    }

    /**
     * Get following
     * @return following
     */
    @NotNull
    @Schema(name = "following", example = "0", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("following")
    public Long getFollowing() {
        return following;
    }

    public void setFollowing(Long following) {
        this.following = following;
    }

    public OrganizationFull htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(name = "html_url", example = "https://github.com/octocat", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public OrganizationFull type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @Schema(name = "type", example = "Organization", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OrganizationFull totalPrivateRepos(Long totalPrivateRepos) {
        this.totalPrivateRepos = totalPrivateRepos;
        return this;
    }

    /**
     * Get totalPrivateRepos
     * @return totalPrivateRepos
     */
    @Schema(name = "total_private_repos", example = "100", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_private_repos")
    public Long getTotalPrivateRepos() {
        return totalPrivateRepos;
    }

    public void setTotalPrivateRepos(Long totalPrivateRepos) {
        this.totalPrivateRepos = totalPrivateRepos;
    }

    public OrganizationFull ownedPrivateRepos(Long ownedPrivateRepos) {
        this.ownedPrivateRepos = ownedPrivateRepos;
        return this;
    }

    /**
     * Get ownedPrivateRepos
     * @return ownedPrivateRepos
     */
    @Schema(name = "owned_private_repos", example = "100", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("owned_private_repos")
    public Long getOwnedPrivateRepos() {
        return ownedPrivateRepos;
    }

    public void setOwnedPrivateRepos(Long ownedPrivateRepos) {
        this.ownedPrivateRepos = ownedPrivateRepos;
    }

    public OrganizationFull privateGists(Long privateGists) {
        this.privateGists = privateGists;
        return this;
    }

    /**
     * Get privateGists
     * @return privateGists
     */
    @Schema(name = "private_gists", example = "81", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("private_gists")
    public Long getPrivateGists() {
        return privateGists;
    }

    public void setPrivateGists(Long privateGists) {
        this.privateGists = privateGists;
    }

    public OrganizationFull diskUsage(Long diskUsage) {
        this.diskUsage = diskUsage;
        return this;
    }

    /**
     * Get diskUsage
     * @return diskUsage
     */
    @Schema(name = "disk_usage", example = "10000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("disk_usage")
    public Long getDiskUsage() {
        return diskUsage;
    }

    public void setDiskUsage(Long diskUsage) {
        this.diskUsage = diskUsage;
    }

    public OrganizationFull collaborators(Long collaborators) {
        this.collaborators = collaborators;
        return this;
    }

    /**
     * The number of collaborators on private repositories.  This field may be null if the number of private repositories is over 50,000.
     * @return collaborators
     */
    @Schema(
            name = "collaborators",
            example = "8",
            description =
                    "The number of collaborators on private repositories.  This field may be null if the number of private repositories is over 50,000.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("collaborators")
    public Long getCollaborators() {
        return collaborators;
    }

    public void setCollaborators(Long collaborators) {
        this.collaborators = collaborators;
    }

    public OrganizationFull billingEmail(String billingEmail) {
        this.billingEmail = billingEmail;
        return this;
    }

    /**
     * Get billingEmail
     * @return billingEmail
     */
    @jakarta.validation.constraints.Email
    @Schema(name = "billing_email", example = "org@example.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("billing_email")
    public String getBillingEmail() {
        return billingEmail;
    }

    public void setBillingEmail(String billingEmail) {
        this.billingEmail = billingEmail;
    }

    public OrganizationFull plan(OrganizationFullPlan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get plan
     * @return plan
     */
    @Valid
    @Schema(name = "plan", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("plan")
    public OrganizationFullPlan getPlan() {
        return plan;
    }

    public void setPlan(OrganizationFullPlan plan) {
        this.plan = plan;
    }

    public OrganizationFull defaultRepositoryPermission(String defaultRepositoryPermission) {
        this.defaultRepositoryPermission = defaultRepositoryPermission;
        return this;
    }

    /**
     * Get defaultRepositoryPermission
     * @return defaultRepositoryPermission
     */
    @Schema(name = "default_repository_permission", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("default_repository_permission")
    public String getDefaultRepositoryPermission() {
        return defaultRepositoryPermission;
    }

    public void setDefaultRepositoryPermission(String defaultRepositoryPermission) {
        this.defaultRepositoryPermission = defaultRepositoryPermission;
    }

    public OrganizationFull defaultRepositoryBranch(String defaultRepositoryBranch) {
        this.defaultRepositoryBranch = defaultRepositoryBranch;
        return this;
    }

    /**
     * The default branch for repositories created in this organization.
     * @return defaultRepositoryBranch
     */
    @Schema(
            name = "default_repository_branch",
            example = "main",
            description = "The default branch for repositories created in this organization.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("default_repository_branch")
    public String getDefaultRepositoryBranch() {
        return defaultRepositoryBranch;
    }

    public void setDefaultRepositoryBranch(String defaultRepositoryBranch) {
        this.defaultRepositoryBranch = defaultRepositoryBranch;
    }

    public OrganizationFull membersCanCreateRepositories(Boolean membersCanCreateRepositories) {
        this.membersCanCreateRepositories = membersCanCreateRepositories;
        return this;
    }

    /**
     * Get membersCanCreateRepositories
     * @return membersCanCreateRepositories
     */
    @Schema(name = "members_can_create_repositories", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_can_create_repositories")
    public Boolean getMembersCanCreateRepositories() {
        return membersCanCreateRepositories;
    }

    public void setMembersCanCreateRepositories(Boolean membersCanCreateRepositories) {
        this.membersCanCreateRepositories = membersCanCreateRepositories;
    }

    public OrganizationFull twoFactorRequirementEnabled(Boolean twoFactorRequirementEnabled) {
        this.twoFactorRequirementEnabled = twoFactorRequirementEnabled;
        return this;
    }

    /**
     * Get twoFactorRequirementEnabled
     * @return twoFactorRequirementEnabled
     */
    @Schema(name = "two_factor_requirement_enabled", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("two_factor_requirement_enabled")
    public Boolean getTwoFactorRequirementEnabled() {
        return twoFactorRequirementEnabled;
    }

    public void setTwoFactorRequirementEnabled(Boolean twoFactorRequirementEnabled) {
        this.twoFactorRequirementEnabled = twoFactorRequirementEnabled;
    }

    public OrganizationFull membersAllowedRepositoryCreationType(String membersAllowedRepositoryCreationType) {
        this.membersAllowedRepositoryCreationType = membersAllowedRepositoryCreationType;
        return this;
    }

    /**
     * Get membersAllowedRepositoryCreationType
     * @return membersAllowedRepositoryCreationType
     */
    @Schema(
            name = "members_allowed_repository_creation_type",
            example = "all",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_allowed_repository_creation_type")
    public String getMembersAllowedRepositoryCreationType() {
        return membersAllowedRepositoryCreationType;
    }

    public void setMembersAllowedRepositoryCreationType(String membersAllowedRepositoryCreationType) {
        this.membersAllowedRepositoryCreationType = membersAllowedRepositoryCreationType;
    }

    public OrganizationFull membersCanCreatePublicRepositories(Boolean membersCanCreatePublicRepositories) {
        this.membersCanCreatePublicRepositories = membersCanCreatePublicRepositories;
        return this;
    }

    /**
     * Get membersCanCreatePublicRepositories
     * @return membersCanCreatePublicRepositories
     */
    @Schema(
            name = "members_can_create_public_repositories",
            example = "true",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_can_create_public_repositories")
    public Boolean getMembersCanCreatePublicRepositories() {
        return membersCanCreatePublicRepositories;
    }

    public void setMembersCanCreatePublicRepositories(Boolean membersCanCreatePublicRepositories) {
        this.membersCanCreatePublicRepositories = membersCanCreatePublicRepositories;
    }

    public OrganizationFull membersCanCreatePrivateRepositories(Boolean membersCanCreatePrivateRepositories) {
        this.membersCanCreatePrivateRepositories = membersCanCreatePrivateRepositories;
        return this;
    }

    /**
     * Get membersCanCreatePrivateRepositories
     * @return membersCanCreatePrivateRepositories
     */
    @Schema(
            name = "members_can_create_private_repositories",
            example = "true",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_can_create_private_repositories")
    public Boolean getMembersCanCreatePrivateRepositories() {
        return membersCanCreatePrivateRepositories;
    }

    public void setMembersCanCreatePrivateRepositories(Boolean membersCanCreatePrivateRepositories) {
        this.membersCanCreatePrivateRepositories = membersCanCreatePrivateRepositories;
    }

    public OrganizationFull membersCanCreateInternalRepositories(Boolean membersCanCreateInternalRepositories) {
        this.membersCanCreateInternalRepositories = membersCanCreateInternalRepositories;
        return this;
    }

    /**
     * Get membersCanCreateInternalRepositories
     * @return membersCanCreateInternalRepositories
     */
    @Schema(
            name = "members_can_create_internal_repositories",
            example = "true",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_can_create_internal_repositories")
    public Boolean getMembersCanCreateInternalRepositories() {
        return membersCanCreateInternalRepositories;
    }

    public void setMembersCanCreateInternalRepositories(Boolean membersCanCreateInternalRepositories) {
        this.membersCanCreateInternalRepositories = membersCanCreateInternalRepositories;
    }

    public OrganizationFull membersCanCreatePages(Boolean membersCanCreatePages) {
        this.membersCanCreatePages = membersCanCreatePages;
        return this;
    }

    /**
     * Get membersCanCreatePages
     * @return membersCanCreatePages
     */
    @Schema(name = "members_can_create_pages", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_can_create_pages")
    public Boolean getMembersCanCreatePages() {
        return membersCanCreatePages;
    }

    public void setMembersCanCreatePages(Boolean membersCanCreatePages) {
        this.membersCanCreatePages = membersCanCreatePages;
    }

    public OrganizationFull membersCanCreatePublicPages(Boolean membersCanCreatePublicPages) {
        this.membersCanCreatePublicPages = membersCanCreatePublicPages;
        return this;
    }

    /**
     * Get membersCanCreatePublicPages
     * @return membersCanCreatePublicPages
     */
    @Schema(name = "members_can_create_public_pages", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_can_create_public_pages")
    public Boolean getMembersCanCreatePublicPages() {
        return membersCanCreatePublicPages;
    }

    public void setMembersCanCreatePublicPages(Boolean membersCanCreatePublicPages) {
        this.membersCanCreatePublicPages = membersCanCreatePublicPages;
    }

    public OrganizationFull membersCanCreatePrivatePages(Boolean membersCanCreatePrivatePages) {
        this.membersCanCreatePrivatePages = membersCanCreatePrivatePages;
        return this;
    }

    /**
     * Get membersCanCreatePrivatePages
     * @return membersCanCreatePrivatePages
     */
    @Schema(
            name = "members_can_create_private_pages",
            example = "true",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_can_create_private_pages")
    public Boolean getMembersCanCreatePrivatePages() {
        return membersCanCreatePrivatePages;
    }

    public void setMembersCanCreatePrivatePages(Boolean membersCanCreatePrivatePages) {
        this.membersCanCreatePrivatePages = membersCanCreatePrivatePages;
    }

    public OrganizationFull membersCanDeleteRepositories(Boolean membersCanDeleteRepositories) {
        this.membersCanDeleteRepositories = membersCanDeleteRepositories;
        return this;
    }

    /**
     * Get membersCanDeleteRepositories
     * @return membersCanDeleteRepositories
     */
    @Schema(name = "members_can_delete_repositories", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_can_delete_repositories")
    public Boolean getMembersCanDeleteRepositories() {
        return membersCanDeleteRepositories;
    }

    public void setMembersCanDeleteRepositories(Boolean membersCanDeleteRepositories) {
        this.membersCanDeleteRepositories = membersCanDeleteRepositories;
    }

    public OrganizationFull membersCanChangeRepoVisibility(Boolean membersCanChangeRepoVisibility) {
        this.membersCanChangeRepoVisibility = membersCanChangeRepoVisibility;
        return this;
    }

    /**
     * Get membersCanChangeRepoVisibility
     * @return membersCanChangeRepoVisibility
     */
    @Schema(
            name = "members_can_change_repo_visibility",
            example = "true",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_can_change_repo_visibility")
    public Boolean getMembersCanChangeRepoVisibility() {
        return membersCanChangeRepoVisibility;
    }

    public void setMembersCanChangeRepoVisibility(Boolean membersCanChangeRepoVisibility) {
        this.membersCanChangeRepoVisibility = membersCanChangeRepoVisibility;
    }

    public OrganizationFull membersCanInviteOutsideCollaborators(Boolean membersCanInviteOutsideCollaborators) {
        this.membersCanInviteOutsideCollaborators = membersCanInviteOutsideCollaborators;
        return this;
    }

    /**
     * Get membersCanInviteOutsideCollaborators
     * @return membersCanInviteOutsideCollaborators
     */
    @Schema(
            name = "members_can_invite_outside_collaborators",
            example = "true",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_can_invite_outside_collaborators")
    public Boolean getMembersCanInviteOutsideCollaborators() {
        return membersCanInviteOutsideCollaborators;
    }

    public void setMembersCanInviteOutsideCollaborators(Boolean membersCanInviteOutsideCollaborators) {
        this.membersCanInviteOutsideCollaborators = membersCanInviteOutsideCollaborators;
    }

    public OrganizationFull membersCanDeleteIssues(Boolean membersCanDeleteIssues) {
        this.membersCanDeleteIssues = membersCanDeleteIssues;
        return this;
    }

    /**
     * Get membersCanDeleteIssues
     * @return membersCanDeleteIssues
     */
    @Schema(name = "members_can_delete_issues", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_can_delete_issues")
    public Boolean getMembersCanDeleteIssues() {
        return membersCanDeleteIssues;
    }

    public void setMembersCanDeleteIssues(Boolean membersCanDeleteIssues) {
        this.membersCanDeleteIssues = membersCanDeleteIssues;
    }

    public OrganizationFull displayCommenterFullNameSettingEnabled(Boolean displayCommenterFullNameSettingEnabled) {
        this.displayCommenterFullNameSettingEnabled = displayCommenterFullNameSettingEnabled;
        return this;
    }

    /**
     * Get displayCommenterFullNameSettingEnabled
     * @return displayCommenterFullNameSettingEnabled
     */
    @Schema(
            name = "display_commenter_full_name_setting_enabled",
            example = "true",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("display_commenter_full_name_setting_enabled")
    public Boolean getDisplayCommenterFullNameSettingEnabled() {
        return displayCommenterFullNameSettingEnabled;
    }

    public void setDisplayCommenterFullNameSettingEnabled(Boolean displayCommenterFullNameSettingEnabled) {
        this.displayCommenterFullNameSettingEnabled = displayCommenterFullNameSettingEnabled;
    }

    public OrganizationFull readersCanCreateDiscussions(Boolean readersCanCreateDiscussions) {
        this.readersCanCreateDiscussions = readersCanCreateDiscussions;
        return this;
    }

    /**
     * Get readersCanCreateDiscussions
     * @return readersCanCreateDiscussions
     */
    @Schema(name = "readers_can_create_discussions", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("readers_can_create_discussions")
    public Boolean getReadersCanCreateDiscussions() {
        return readersCanCreateDiscussions;
    }

    public void setReadersCanCreateDiscussions(Boolean readersCanCreateDiscussions) {
        this.readersCanCreateDiscussions = readersCanCreateDiscussions;
    }

    public OrganizationFull membersCanCreateTeams(Boolean membersCanCreateTeams) {
        this.membersCanCreateTeams = membersCanCreateTeams;
        return this;
    }

    /**
     * Get membersCanCreateTeams
     * @return membersCanCreateTeams
     */
    @Schema(name = "members_can_create_teams", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_can_create_teams")
    public Boolean getMembersCanCreateTeams() {
        return membersCanCreateTeams;
    }

    public void setMembersCanCreateTeams(Boolean membersCanCreateTeams) {
        this.membersCanCreateTeams = membersCanCreateTeams;
    }

    public OrganizationFull membersCanViewDependencyInsights(Boolean membersCanViewDependencyInsights) {
        this.membersCanViewDependencyInsights = membersCanViewDependencyInsights;
        return this;
    }

    /**
     * Get membersCanViewDependencyInsights
     * @return membersCanViewDependencyInsights
     */
    @Schema(
            name = "members_can_view_dependency_insights",
            example = "true",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_can_view_dependency_insights")
    public Boolean getMembersCanViewDependencyInsights() {
        return membersCanViewDependencyInsights;
    }

    public void setMembersCanViewDependencyInsights(Boolean membersCanViewDependencyInsights) {
        this.membersCanViewDependencyInsights = membersCanViewDependencyInsights;
    }

    public OrganizationFull membersCanForkPrivateRepositories(Boolean membersCanForkPrivateRepositories) {
        this.membersCanForkPrivateRepositories = membersCanForkPrivateRepositories;
        return this;
    }

    /**
     * Get membersCanForkPrivateRepositories
     * @return membersCanForkPrivateRepositories
     */
    @Schema(
            name = "members_can_fork_private_repositories",
            example = "false",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_can_fork_private_repositories")
    public Boolean getMembersCanForkPrivateRepositories() {
        return membersCanForkPrivateRepositories;
    }

    public void setMembersCanForkPrivateRepositories(Boolean membersCanForkPrivateRepositories) {
        this.membersCanForkPrivateRepositories = membersCanForkPrivateRepositories;
    }

    public OrganizationFull webCommitSignoffRequired(Boolean webCommitSignoffRequired) {
        this.webCommitSignoffRequired = webCommitSignoffRequired;
        return this;
    }

    /**
     * Get webCommitSignoffRequired
     * @return webCommitSignoffRequired
     */
    @Schema(name = "web_commit_signoff_required", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("web_commit_signoff_required")
    public Boolean getWebCommitSignoffRequired() {
        return webCommitSignoffRequired;
    }

    public void setWebCommitSignoffRequired(Boolean webCommitSignoffRequired) {
        this.webCommitSignoffRequired = webCommitSignoffRequired;
    }

    public OrganizationFull advancedSecurityEnabledForNewRepositories(
            Boolean advancedSecurityEnabledForNewRepositories) {
        this.advancedSecurityEnabledForNewRepositories = advancedSecurityEnabledForNewRepositories;
        return this;
    }

    /**
     * **Endpoint closing down notice.** Please use [code security configurations](https://docs.github.com/rest/code-security/configurations) instead.  Whether GitHub Advanced Security is enabled for new repositories and repositories transferred to this organization.  This field is only visible to organization owners or members of a team with the security manager role.
     * @return advancedSecurityEnabledForNewRepositories
     * @deprecated
     */
    @Schema(
            name = "advanced_security_enabled_for_new_repositories",
            example = "false",
            description =
                    "**Endpoint closing down notice.** Please use [code security configurations](https://docs.github.com/rest/code-security/configurations) instead.  Whether GitHub Advanced Security is enabled for new repositories and repositories transferred to this organization.  This field is only visible to organization owners or members of a team with the security manager role.",
            deprecated = true,
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("advanced_security_enabled_for_new_repositories")
    @Deprecated
    public Boolean getAdvancedSecurityEnabledForNewRepositories() {
        return advancedSecurityEnabledForNewRepositories;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void setAdvancedSecurityEnabledForNewRepositories(Boolean advancedSecurityEnabledForNewRepositories) {
        this.advancedSecurityEnabledForNewRepositories = advancedSecurityEnabledForNewRepositories;
    }

    public OrganizationFull dependabotAlertsEnabledForNewRepositories(
            Boolean dependabotAlertsEnabledForNewRepositories) {
        this.dependabotAlertsEnabledForNewRepositories = dependabotAlertsEnabledForNewRepositories;
        return this;
    }

    /**
     * **Endpoint closing down notice.** Please use [code security configurations](https://docs.github.com/rest/code-security/configurations) instead.  Whether Dependabot alerts are automatically enabled for new repositories and repositories transferred to this organization.  This field is only visible to organization owners or members of a team with the security manager role.
     * @return dependabotAlertsEnabledForNewRepositories
     * @deprecated
     */
    @Schema(
            name = "dependabot_alerts_enabled_for_new_repositories",
            example = "false",
            description =
                    "**Endpoint closing down notice.** Please use [code security configurations](https://docs.github.com/rest/code-security/configurations) instead.  Whether Dependabot alerts are automatically enabled for new repositories and repositories transferred to this organization.  This field is only visible to organization owners or members of a team with the security manager role.",
            deprecated = true,
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dependabot_alerts_enabled_for_new_repositories")
    @Deprecated
    public Boolean getDependabotAlertsEnabledForNewRepositories() {
        return dependabotAlertsEnabledForNewRepositories;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void setDependabotAlertsEnabledForNewRepositories(Boolean dependabotAlertsEnabledForNewRepositories) {
        this.dependabotAlertsEnabledForNewRepositories = dependabotAlertsEnabledForNewRepositories;
    }

    public OrganizationFull dependabotSecurityUpdatesEnabledForNewRepositories(
            Boolean dependabotSecurityUpdatesEnabledForNewRepositories) {
        this.dependabotSecurityUpdatesEnabledForNewRepositories = dependabotSecurityUpdatesEnabledForNewRepositories;
        return this;
    }

    /**
     * **Endpoint closing down notice.** Please use [code security configurations](https://docs.github.com/rest/code-security/configurations) instead.  Whether Dependabot security updates are automatically enabled for new repositories and repositories transferred to this organization.  This field is only visible to organization owners or members of a team with the security manager role.
     * @return dependabotSecurityUpdatesEnabledForNewRepositories
     * @deprecated
     */
    @Schema(
            name = "dependabot_security_updates_enabled_for_new_repositories",
            example = "false",
            description =
                    "**Endpoint closing down notice.** Please use [code security configurations](https://docs.github.com/rest/code-security/configurations) instead.  Whether Dependabot security updates are automatically enabled for new repositories and repositories transferred to this organization.  This field is only visible to organization owners or members of a team with the security manager role.",
            deprecated = true,
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dependabot_security_updates_enabled_for_new_repositories")
    @Deprecated
    public Boolean getDependabotSecurityUpdatesEnabledForNewRepositories() {
        return dependabotSecurityUpdatesEnabledForNewRepositories;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void setDependabotSecurityUpdatesEnabledForNewRepositories(
            Boolean dependabotSecurityUpdatesEnabledForNewRepositories) {
        this.dependabotSecurityUpdatesEnabledForNewRepositories = dependabotSecurityUpdatesEnabledForNewRepositories;
    }

    public OrganizationFull dependencyGraphEnabledForNewRepositories(Boolean dependencyGraphEnabledForNewRepositories) {
        this.dependencyGraphEnabledForNewRepositories = dependencyGraphEnabledForNewRepositories;
        return this;
    }

    /**
     * **Endpoint closing down notice.** Please use [code security configurations](https://docs.github.com/rest/code-security/configurations) instead.  Whether dependency graph is automatically enabled for new repositories and repositories transferred to this organization.  This field is only visible to organization owners or members of a team with the security manager role.
     * @return dependencyGraphEnabledForNewRepositories
     * @deprecated
     */
    @Schema(
            name = "dependency_graph_enabled_for_new_repositories",
            example = "false",
            description =
                    "**Endpoint closing down notice.** Please use [code security configurations](https://docs.github.com/rest/code-security/configurations) instead.  Whether dependency graph is automatically enabled for new repositories and repositories transferred to this organization.  This field is only visible to organization owners or members of a team with the security manager role.",
            deprecated = true,
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dependency_graph_enabled_for_new_repositories")
    @Deprecated
    public Boolean getDependencyGraphEnabledForNewRepositories() {
        return dependencyGraphEnabledForNewRepositories;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void setDependencyGraphEnabledForNewRepositories(Boolean dependencyGraphEnabledForNewRepositories) {
        this.dependencyGraphEnabledForNewRepositories = dependencyGraphEnabledForNewRepositories;
    }

    public OrganizationFull secretScanningEnabledForNewRepositories(Boolean secretScanningEnabledForNewRepositories) {
        this.secretScanningEnabledForNewRepositories = secretScanningEnabledForNewRepositories;
        return this;
    }

    /**
     * **Endpoint closing down notice.** Please use [code security configurations](https://docs.github.com/rest/code-security/configurations) instead.  Whether secret scanning is automatically enabled for new repositories and repositories transferred to this organization.  This field is only visible to organization owners or members of a team with the security manager role.
     * @return secretScanningEnabledForNewRepositories
     * @deprecated
     */
    @Schema(
            name = "secret_scanning_enabled_for_new_repositories",
            example = "false",
            description =
                    "**Endpoint closing down notice.** Please use [code security configurations](https://docs.github.com/rest/code-security/configurations) instead.  Whether secret scanning is automatically enabled for new repositories and repositories transferred to this organization.  This field is only visible to organization owners or members of a team with the security manager role.",
            deprecated = true,
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_enabled_for_new_repositories")
    @Deprecated
    public Boolean getSecretScanningEnabledForNewRepositories() {
        return secretScanningEnabledForNewRepositories;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void setSecretScanningEnabledForNewRepositories(Boolean secretScanningEnabledForNewRepositories) {
        this.secretScanningEnabledForNewRepositories = secretScanningEnabledForNewRepositories;
    }

    public OrganizationFull secretScanningPushProtectionEnabledForNewRepositories(
            Boolean secretScanningPushProtectionEnabledForNewRepositories) {
        this.secretScanningPushProtectionEnabledForNewRepositories =
                secretScanningPushProtectionEnabledForNewRepositories;
        return this;
    }

    /**
     * **Endpoint closing down notice.** Please use [code security configurations](https://docs.github.com/rest/code-security/configurations) instead.  Whether secret scanning push protection is automatically enabled for new repositories and repositories transferred to this organization.  This field is only visible to organization owners or members of a team with the security manager role.
     * @return secretScanningPushProtectionEnabledForNewRepositories
     * @deprecated
     */
    @Schema(
            name = "secret_scanning_push_protection_enabled_for_new_repositories",
            example = "false",
            description =
                    "**Endpoint closing down notice.** Please use [code security configurations](https://docs.github.com/rest/code-security/configurations) instead.  Whether secret scanning push protection is automatically enabled for new repositories and repositories transferred to this organization.  This field is only visible to organization owners or members of a team with the security manager role.",
            deprecated = true,
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_push_protection_enabled_for_new_repositories")
    @Deprecated
    public Boolean getSecretScanningPushProtectionEnabledForNewRepositories() {
        return secretScanningPushProtectionEnabledForNewRepositories;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void setSecretScanningPushProtectionEnabledForNewRepositories(
            Boolean secretScanningPushProtectionEnabledForNewRepositories) {
        this.secretScanningPushProtectionEnabledForNewRepositories =
                secretScanningPushProtectionEnabledForNewRepositories;
    }

    public OrganizationFull secretScanningPushProtectionCustomLink(String secretScanningPushProtectionCustomLink) {
        this.secretScanningPushProtectionCustomLink = secretScanningPushProtectionCustomLink;
        return this;
    }

    /**
     * An optional URL string to display to contributors who are blocked from pushing a secret.
     * @return secretScanningPushProtectionCustomLink
     */
    @Schema(
            name = "secret_scanning_push_protection_custom_link",
            example = "https://github.com/test-org/test-repo/blob/main/README.md",
            description = "An optional URL string to display to contributors who are blocked from pushing a secret.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_push_protection_custom_link")
    public String getSecretScanningPushProtectionCustomLink() {
        return secretScanningPushProtectionCustomLink;
    }

    public void setSecretScanningPushProtectionCustomLink(String secretScanningPushProtectionCustomLink) {
        this.secretScanningPushProtectionCustomLink = secretScanningPushProtectionCustomLink;
    }

    public OrganizationFull createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", example = "2008-01-14T04:33:35Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public OrganizationFull updatedAt(OffsetDateTime updatedAt) {
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

    public OrganizationFull archivedAt(OffsetDateTime archivedAt) {
        this.archivedAt = archivedAt;
        return this;
    }

    /**
     * Get archivedAt
     * @return archivedAt
     */
    @NotNull
    @Valid
    @Schema(name = "archived_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("archived_at")
    public OffsetDateTime getArchivedAt() {
        return archivedAt;
    }

    public void setArchivedAt(OffsetDateTime archivedAt) {
        this.archivedAt = archivedAt;
    }

    public OrganizationFull deployKeysEnabledForRepositories(Boolean deployKeysEnabledForRepositories) {
        this.deployKeysEnabledForRepositories = deployKeysEnabledForRepositories;
        return this;
    }

    /**
     * Controls whether or not deploy keys may be added and used for repositories in the organization.
     * @return deployKeysEnabledForRepositories
     */
    @Schema(
            name = "deploy_keys_enabled_for_repositories",
            example = "false",
            description =
                    "Controls whether or not deploy keys may be added and used for repositories in the organization.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deploy_keys_enabled_for_repositories")
    public Boolean getDeployKeysEnabledForRepositories() {
        return deployKeysEnabledForRepositories;
    }

    public void setDeployKeysEnabledForRepositories(Boolean deployKeysEnabledForRepositories) {
        this.deployKeysEnabledForRepositories = deployKeysEnabledForRepositories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrganizationFull organizationFull = (OrganizationFull) o;
        return Objects.equals(this.login, organizationFull.login)
                && Objects.equals(this.id, organizationFull.id)
                && Objects.equals(this.nodeId, organizationFull.nodeId)
                && Objects.equals(this.url, organizationFull.url)
                && Objects.equals(this.reposUrl, organizationFull.reposUrl)
                && Objects.equals(this.eventsUrl, organizationFull.eventsUrl)
                && Objects.equals(this.hooksUrl, organizationFull.hooksUrl)
                && Objects.equals(this.issuesUrl, organizationFull.issuesUrl)
                && Objects.equals(this.membersUrl, organizationFull.membersUrl)
                && Objects.equals(this.publicMembersUrl, organizationFull.publicMembersUrl)
                && Objects.equals(this.avatarUrl, organizationFull.avatarUrl)
                && Objects.equals(this.description, organizationFull.description)
                && Objects.equals(this.name, organizationFull.name)
                && Objects.equals(this.company, organizationFull.company)
                && Objects.equals(this.blog, organizationFull.blog)
                && Objects.equals(this.location, organizationFull.location)
                && Objects.equals(this.email, organizationFull.email)
                && Objects.equals(this.twitterUsername, organizationFull.twitterUsername)
                && Objects.equals(this.isVerified, organizationFull.isVerified)
                && Objects.equals(this.hasOrganizationProjects, organizationFull.hasOrganizationProjects)
                && Objects.equals(this.hasRepositoryProjects, organizationFull.hasRepositoryProjects)
                && Objects.equals(this.publicRepos, organizationFull.publicRepos)
                && Objects.equals(this.publicGists, organizationFull.publicGists)
                && Objects.equals(this.followers, organizationFull.followers)
                && Objects.equals(this.following, organizationFull.following)
                && Objects.equals(this.htmlUrl, organizationFull.htmlUrl)
                && Objects.equals(this.type, organizationFull.type)
                && Objects.equals(this.totalPrivateRepos, organizationFull.totalPrivateRepos)
                && Objects.equals(this.ownedPrivateRepos, organizationFull.ownedPrivateRepos)
                && Objects.equals(this.privateGists, organizationFull.privateGists)
                && Objects.equals(this.diskUsage, organizationFull.diskUsage)
                && Objects.equals(this.collaborators, organizationFull.collaborators)
                && Objects.equals(this.billingEmail, organizationFull.billingEmail)
                && Objects.equals(this.plan, organizationFull.plan)
                && Objects.equals(this.defaultRepositoryPermission, organizationFull.defaultRepositoryPermission)
                && Objects.equals(this.defaultRepositoryBranch, organizationFull.defaultRepositoryBranch)
                && Objects.equals(this.membersCanCreateRepositories, organizationFull.membersCanCreateRepositories)
                && Objects.equals(this.twoFactorRequirementEnabled, organizationFull.twoFactorRequirementEnabled)
                && Objects.equals(
                        this.membersAllowedRepositoryCreationType,
                        organizationFull.membersAllowedRepositoryCreationType)
                && Objects.equals(
                        this.membersCanCreatePublicRepositories, organizationFull.membersCanCreatePublicRepositories)
                && Objects.equals(
                        this.membersCanCreatePrivateRepositories, organizationFull.membersCanCreatePrivateRepositories)
                && Objects.equals(
                        this.membersCanCreateInternalRepositories,
                        organizationFull.membersCanCreateInternalRepositories)
                && Objects.equals(this.membersCanCreatePages, organizationFull.membersCanCreatePages)
                && Objects.equals(this.membersCanCreatePublicPages, organizationFull.membersCanCreatePublicPages)
                && Objects.equals(this.membersCanCreatePrivatePages, organizationFull.membersCanCreatePrivatePages)
                && Objects.equals(this.membersCanDeleteRepositories, organizationFull.membersCanDeleteRepositories)
                && Objects.equals(this.membersCanChangeRepoVisibility, organizationFull.membersCanChangeRepoVisibility)
                && Objects.equals(
                        this.membersCanInviteOutsideCollaborators,
                        organizationFull.membersCanInviteOutsideCollaborators)
                && Objects.equals(this.membersCanDeleteIssues, organizationFull.membersCanDeleteIssues)
                && Objects.equals(
                        this.displayCommenterFullNameSettingEnabled,
                        organizationFull.displayCommenterFullNameSettingEnabled)
                && Objects.equals(this.readersCanCreateDiscussions, organizationFull.readersCanCreateDiscussions)
                && Objects.equals(this.membersCanCreateTeams, organizationFull.membersCanCreateTeams)
                && Objects.equals(
                        this.membersCanViewDependencyInsights, organizationFull.membersCanViewDependencyInsights)
                && Objects.equals(
                        this.membersCanForkPrivateRepositories, organizationFull.membersCanForkPrivateRepositories)
                && Objects.equals(this.webCommitSignoffRequired, organizationFull.webCommitSignoffRequired)
                && Objects.equals(
                        this.advancedSecurityEnabledForNewRepositories,
                        organizationFull.advancedSecurityEnabledForNewRepositories)
                && Objects.equals(
                        this.dependabotAlertsEnabledForNewRepositories,
                        organizationFull.dependabotAlertsEnabledForNewRepositories)
                && Objects.equals(
                        this.dependabotSecurityUpdatesEnabledForNewRepositories,
                        organizationFull.dependabotSecurityUpdatesEnabledForNewRepositories)
                && Objects.equals(
                        this.dependencyGraphEnabledForNewRepositories,
                        organizationFull.dependencyGraphEnabledForNewRepositories)
                && Objects.equals(
                        this.secretScanningEnabledForNewRepositories,
                        organizationFull.secretScanningEnabledForNewRepositories)
                && Objects.equals(
                        this.secretScanningPushProtectionEnabledForNewRepositories,
                        organizationFull.secretScanningPushProtectionEnabledForNewRepositories)
                && Objects.equals(
                        this.secretScanningPushProtectionCustomLink,
                        organizationFull.secretScanningPushProtectionCustomLink)
                && Objects.equals(this.createdAt, organizationFull.createdAt)
                && Objects.equals(this.updatedAt, organizationFull.updatedAt)
                && Objects.equals(this.archivedAt, organizationFull.archivedAt)
                && Objects.equals(
                        this.deployKeysEnabledForRepositories, organizationFull.deployKeysEnabledForRepositories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                login,
                id,
                nodeId,
                url,
                reposUrl,
                eventsUrl,
                hooksUrl,
                issuesUrl,
                membersUrl,
                publicMembersUrl,
                avatarUrl,
                description,
                name,
                company,
                blog,
                location,
                email,
                twitterUsername,
                isVerified,
                hasOrganizationProjects,
                hasRepositoryProjects,
                publicRepos,
                publicGists,
                followers,
                following,
                htmlUrl,
                type,
                totalPrivateRepos,
                ownedPrivateRepos,
                privateGists,
                diskUsage,
                collaborators,
                billingEmail,
                plan,
                defaultRepositoryPermission,
                defaultRepositoryBranch,
                membersCanCreateRepositories,
                twoFactorRequirementEnabled,
                membersAllowedRepositoryCreationType,
                membersCanCreatePublicRepositories,
                membersCanCreatePrivateRepositories,
                membersCanCreateInternalRepositories,
                membersCanCreatePages,
                membersCanCreatePublicPages,
                membersCanCreatePrivatePages,
                membersCanDeleteRepositories,
                membersCanChangeRepoVisibility,
                membersCanInviteOutsideCollaborators,
                membersCanDeleteIssues,
                displayCommenterFullNameSettingEnabled,
                readersCanCreateDiscussions,
                membersCanCreateTeams,
                membersCanViewDependencyInsights,
                membersCanForkPrivateRepositories,
                webCommitSignoffRequired,
                advancedSecurityEnabledForNewRepositories,
                dependabotAlertsEnabledForNewRepositories,
                dependabotSecurityUpdatesEnabledForNewRepositories,
                dependencyGraphEnabledForNewRepositories,
                secretScanningEnabledForNewRepositories,
                secretScanningPushProtectionEnabledForNewRepositories,
                secretScanningPushProtectionCustomLink,
                createdAt,
                updatedAt,
                archivedAt,
                deployKeysEnabledForRepositories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationFull {\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    reposUrl: ").append(toIndentedString(reposUrl)).append("\n");
        sb.append("    eventsUrl: ").append(toIndentedString(eventsUrl)).append("\n");
        sb.append("    hooksUrl: ").append(toIndentedString(hooksUrl)).append("\n");
        sb.append("    issuesUrl: ").append(toIndentedString(issuesUrl)).append("\n");
        sb.append("    membersUrl: ").append(toIndentedString(membersUrl)).append("\n");
        sb.append("    publicMembersUrl: ")
                .append(toIndentedString(publicMembersUrl))
                .append("\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    company: ").append(toIndentedString(company)).append("\n");
        sb.append("    blog: ").append(toIndentedString(blog)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    twitterUsername: ")
                .append(toIndentedString(twitterUsername))
                .append("\n");
        sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
        sb.append("    hasOrganizationProjects: ")
                .append(toIndentedString(hasOrganizationProjects))
                .append("\n");
        sb.append("    hasRepositoryProjects: ")
                .append(toIndentedString(hasRepositoryProjects))
                .append("\n");
        sb.append("    publicRepos: ").append(toIndentedString(publicRepos)).append("\n");
        sb.append("    publicGists: ").append(toIndentedString(publicGists)).append("\n");
        sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
        sb.append("    following: ").append(toIndentedString(following)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    totalPrivateRepos: ")
                .append(toIndentedString(totalPrivateRepos))
                .append("\n");
        sb.append("    ownedPrivateRepos: ")
                .append(toIndentedString(ownedPrivateRepos))
                .append("\n");
        sb.append("    privateGists: ").append(toIndentedString(privateGists)).append("\n");
        sb.append("    diskUsage: ").append(toIndentedString(diskUsage)).append("\n");
        sb.append("    collaborators: ").append(toIndentedString(collaborators)).append("\n");
        sb.append("    billingEmail: ").append(toIndentedString(billingEmail)).append("\n");
        sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
        sb.append("    defaultRepositoryPermission: ")
                .append(toIndentedString(defaultRepositoryPermission))
                .append("\n");
        sb.append("    defaultRepositoryBranch: ")
                .append(toIndentedString(defaultRepositoryBranch))
                .append("\n");
        sb.append("    membersCanCreateRepositories: ")
                .append(toIndentedString(membersCanCreateRepositories))
                .append("\n");
        sb.append("    twoFactorRequirementEnabled: ")
                .append(toIndentedString(twoFactorRequirementEnabled))
                .append("\n");
        sb.append("    membersAllowedRepositoryCreationType: ")
                .append(toIndentedString(membersAllowedRepositoryCreationType))
                .append("\n");
        sb.append("    membersCanCreatePublicRepositories: ")
                .append(toIndentedString(membersCanCreatePublicRepositories))
                .append("\n");
        sb.append("    membersCanCreatePrivateRepositories: ")
                .append(toIndentedString(membersCanCreatePrivateRepositories))
                .append("\n");
        sb.append("    membersCanCreateInternalRepositories: ")
                .append(toIndentedString(membersCanCreateInternalRepositories))
                .append("\n");
        sb.append("    membersCanCreatePages: ")
                .append(toIndentedString(membersCanCreatePages))
                .append("\n");
        sb.append("    membersCanCreatePublicPages: ")
                .append(toIndentedString(membersCanCreatePublicPages))
                .append("\n");
        sb.append("    membersCanCreatePrivatePages: ")
                .append(toIndentedString(membersCanCreatePrivatePages))
                .append("\n");
        sb.append("    membersCanDeleteRepositories: ")
                .append(toIndentedString(membersCanDeleteRepositories))
                .append("\n");
        sb.append("    membersCanChangeRepoVisibility: ")
                .append(toIndentedString(membersCanChangeRepoVisibility))
                .append("\n");
        sb.append("    membersCanInviteOutsideCollaborators: ")
                .append(toIndentedString(membersCanInviteOutsideCollaborators))
                .append("\n");
        sb.append("    membersCanDeleteIssues: ")
                .append(toIndentedString(membersCanDeleteIssues))
                .append("\n");
        sb.append("    displayCommenterFullNameSettingEnabled: ")
                .append(toIndentedString(displayCommenterFullNameSettingEnabled))
                .append("\n");
        sb.append("    readersCanCreateDiscussions: ")
                .append(toIndentedString(readersCanCreateDiscussions))
                .append("\n");
        sb.append("    membersCanCreateTeams: ")
                .append(toIndentedString(membersCanCreateTeams))
                .append("\n");
        sb.append("    membersCanViewDependencyInsights: ")
                .append(toIndentedString(membersCanViewDependencyInsights))
                .append("\n");
        sb.append("    membersCanForkPrivateRepositories: ")
                .append(toIndentedString(membersCanForkPrivateRepositories))
                .append("\n");
        sb.append("    webCommitSignoffRequired: ")
                .append(toIndentedString(webCommitSignoffRequired))
                .append("\n");
        sb.append("    advancedSecurityEnabledForNewRepositories: ")
                .append(toIndentedString(advancedSecurityEnabledForNewRepositories))
                .append("\n");
        sb.append("    dependabotAlertsEnabledForNewRepositories: ")
                .append(toIndentedString(dependabotAlertsEnabledForNewRepositories))
                .append("\n");
        sb.append("    dependabotSecurityUpdatesEnabledForNewRepositories: ")
                .append(toIndentedString(dependabotSecurityUpdatesEnabledForNewRepositories))
                .append("\n");
        sb.append("    dependencyGraphEnabledForNewRepositories: ")
                .append(toIndentedString(dependencyGraphEnabledForNewRepositories))
                .append("\n");
        sb.append("    secretScanningEnabledForNewRepositories: ")
                .append(toIndentedString(secretScanningEnabledForNewRepositories))
                .append("\n");
        sb.append("    secretScanningPushProtectionEnabledForNewRepositories: ")
                .append(toIndentedString(secretScanningPushProtectionEnabledForNewRepositories))
                .append("\n");
        sb.append("    secretScanningPushProtectionCustomLink: ")
                .append(toIndentedString(secretScanningPushProtectionCustomLink))
                .append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    archivedAt: ").append(toIndentedString(archivedAt)).append("\n");
        sb.append("    deployKeysEnabledForRepositories: ")
                .append(toIndentedString(deployKeysEnabledForRepositories))
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
