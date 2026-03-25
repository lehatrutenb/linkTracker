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
 * Team Organization
 */
@Schema(name = "team-organization", description = "Team Organization")
@JsonTypeName("team-organization")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class TeamOrganization {

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

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private String type;

    private Long totalPrivateRepos;

    private Long ownedPrivateRepos;

    private Long privateGists = null;

    private Long diskUsage = null;

    private Long collaborators = null;

    private String billingEmail = null;

    private OrganizationFullPlan plan;

    private String defaultRepositoryPermission = null;

    private Boolean membersCanCreateRepositories = null;

    private Boolean twoFactorRequirementEnabled = null;

    private String membersAllowedRepositoryCreationType;

    private Boolean membersCanCreatePublicRepositories;

    private Boolean membersCanCreatePrivateRepositories;

    private Boolean membersCanCreateInternalRepositories;

    private Boolean membersCanCreatePages;

    private Boolean membersCanCreatePublicPages;

    private Boolean membersCanCreatePrivatePages;

    private Boolean membersCanForkPrivateRepositories = null;

    private Boolean webCommitSignoffRequired;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime archivedAt = null;

    public TeamOrganization() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TeamOrganization(
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
            OffsetDateTime createdAt,
            String type,
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
        this.createdAt = createdAt;
        this.type = type;
        this.updatedAt = updatedAt;
        this.archivedAt = archivedAt;
    }

    public TeamOrganization login(String login) {
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

    public TeamOrganization id(Long id) {
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

    public TeamOrganization nodeId(String nodeId) {
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

    public TeamOrganization url(URI url) {
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

    public TeamOrganization reposUrl(URI reposUrl) {
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

    public TeamOrganization eventsUrl(URI eventsUrl) {
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

    public TeamOrganization hooksUrl(String hooksUrl) {
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

    public TeamOrganization issuesUrl(String issuesUrl) {
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

    public TeamOrganization membersUrl(String membersUrl) {
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

    public TeamOrganization publicMembersUrl(String publicMembersUrl) {
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

    public TeamOrganization avatarUrl(String avatarUrl) {
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

    public TeamOrganization description(String description) {
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

    public TeamOrganization name(String name) {
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

    public TeamOrganization company(String company) {
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

    public TeamOrganization blog(URI blog) {
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

    public TeamOrganization location(String location) {
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

    public TeamOrganization email(String email) {
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

    public TeamOrganization twitterUsername(String twitterUsername) {
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

    public TeamOrganization isVerified(Boolean isVerified) {
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

    public TeamOrganization hasOrganizationProjects(Boolean hasOrganizationProjects) {
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

    public TeamOrganization hasRepositoryProjects(Boolean hasRepositoryProjects) {
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

    public TeamOrganization publicRepos(Long publicRepos) {
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

    public TeamOrganization publicGists(Long publicGists) {
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

    public TeamOrganization followers(Long followers) {
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

    public TeamOrganization following(Long following) {
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

    public TeamOrganization htmlUrl(URI htmlUrl) {
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

    public TeamOrganization createdAt(OffsetDateTime createdAt) {
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

    public TeamOrganization type(String type) {
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

    public TeamOrganization totalPrivateRepos(Long totalPrivateRepos) {
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

    public TeamOrganization ownedPrivateRepos(Long ownedPrivateRepos) {
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

    public TeamOrganization privateGists(Long privateGists) {
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

    public TeamOrganization diskUsage(Long diskUsage) {
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

    public TeamOrganization collaborators(Long collaborators) {
        this.collaborators = collaborators;
        return this;
    }

    /**
     * Get collaborators
     * @return collaborators
     */
    @Schema(name = "collaborators", example = "8", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("collaborators")
    public Long getCollaborators() {
        return collaborators;
    }

    public void setCollaborators(Long collaborators) {
        this.collaborators = collaborators;
    }

    public TeamOrganization billingEmail(String billingEmail) {
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

    public TeamOrganization plan(OrganizationFullPlan plan) {
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

    public TeamOrganization defaultRepositoryPermission(String defaultRepositoryPermission) {
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

    public TeamOrganization membersCanCreateRepositories(Boolean membersCanCreateRepositories) {
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

    public TeamOrganization twoFactorRequirementEnabled(Boolean twoFactorRequirementEnabled) {
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

    public TeamOrganization membersAllowedRepositoryCreationType(String membersAllowedRepositoryCreationType) {
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

    public TeamOrganization membersCanCreatePublicRepositories(Boolean membersCanCreatePublicRepositories) {
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

    public TeamOrganization membersCanCreatePrivateRepositories(Boolean membersCanCreatePrivateRepositories) {
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

    public TeamOrganization membersCanCreateInternalRepositories(Boolean membersCanCreateInternalRepositories) {
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

    public TeamOrganization membersCanCreatePages(Boolean membersCanCreatePages) {
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

    public TeamOrganization membersCanCreatePublicPages(Boolean membersCanCreatePublicPages) {
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

    public TeamOrganization membersCanCreatePrivatePages(Boolean membersCanCreatePrivatePages) {
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

    public TeamOrganization membersCanForkPrivateRepositories(Boolean membersCanForkPrivateRepositories) {
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

    public TeamOrganization webCommitSignoffRequired(Boolean webCommitSignoffRequired) {
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

    public TeamOrganization updatedAt(OffsetDateTime updatedAt) {
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

    public TeamOrganization archivedAt(OffsetDateTime archivedAt) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TeamOrganization teamOrganization = (TeamOrganization) o;
        return Objects.equals(this.login, teamOrganization.login)
                && Objects.equals(this.id, teamOrganization.id)
                && Objects.equals(this.nodeId, teamOrganization.nodeId)
                && Objects.equals(this.url, teamOrganization.url)
                && Objects.equals(this.reposUrl, teamOrganization.reposUrl)
                && Objects.equals(this.eventsUrl, teamOrganization.eventsUrl)
                && Objects.equals(this.hooksUrl, teamOrganization.hooksUrl)
                && Objects.equals(this.issuesUrl, teamOrganization.issuesUrl)
                && Objects.equals(this.membersUrl, teamOrganization.membersUrl)
                && Objects.equals(this.publicMembersUrl, teamOrganization.publicMembersUrl)
                && Objects.equals(this.avatarUrl, teamOrganization.avatarUrl)
                && Objects.equals(this.description, teamOrganization.description)
                && Objects.equals(this.name, teamOrganization.name)
                && Objects.equals(this.company, teamOrganization.company)
                && Objects.equals(this.blog, teamOrganization.blog)
                && Objects.equals(this.location, teamOrganization.location)
                && Objects.equals(this.email, teamOrganization.email)
                && Objects.equals(this.twitterUsername, teamOrganization.twitterUsername)
                && Objects.equals(this.isVerified, teamOrganization.isVerified)
                && Objects.equals(this.hasOrganizationProjects, teamOrganization.hasOrganizationProjects)
                && Objects.equals(this.hasRepositoryProjects, teamOrganization.hasRepositoryProjects)
                && Objects.equals(this.publicRepos, teamOrganization.publicRepos)
                && Objects.equals(this.publicGists, teamOrganization.publicGists)
                && Objects.equals(this.followers, teamOrganization.followers)
                && Objects.equals(this.following, teamOrganization.following)
                && Objects.equals(this.htmlUrl, teamOrganization.htmlUrl)
                && Objects.equals(this.createdAt, teamOrganization.createdAt)
                && Objects.equals(this.type, teamOrganization.type)
                && Objects.equals(this.totalPrivateRepos, teamOrganization.totalPrivateRepos)
                && Objects.equals(this.ownedPrivateRepos, teamOrganization.ownedPrivateRepos)
                && Objects.equals(this.privateGists, teamOrganization.privateGists)
                && Objects.equals(this.diskUsage, teamOrganization.diskUsage)
                && Objects.equals(this.collaborators, teamOrganization.collaborators)
                && Objects.equals(this.billingEmail, teamOrganization.billingEmail)
                && Objects.equals(this.plan, teamOrganization.plan)
                && Objects.equals(this.defaultRepositoryPermission, teamOrganization.defaultRepositoryPermission)
                && Objects.equals(this.membersCanCreateRepositories, teamOrganization.membersCanCreateRepositories)
                && Objects.equals(this.twoFactorRequirementEnabled, teamOrganization.twoFactorRequirementEnabled)
                && Objects.equals(
                        this.membersAllowedRepositoryCreationType,
                        teamOrganization.membersAllowedRepositoryCreationType)
                && Objects.equals(
                        this.membersCanCreatePublicRepositories, teamOrganization.membersCanCreatePublicRepositories)
                && Objects.equals(
                        this.membersCanCreatePrivateRepositories, teamOrganization.membersCanCreatePrivateRepositories)
                && Objects.equals(
                        this.membersCanCreateInternalRepositories,
                        teamOrganization.membersCanCreateInternalRepositories)
                && Objects.equals(this.membersCanCreatePages, teamOrganization.membersCanCreatePages)
                && Objects.equals(this.membersCanCreatePublicPages, teamOrganization.membersCanCreatePublicPages)
                && Objects.equals(this.membersCanCreatePrivatePages, teamOrganization.membersCanCreatePrivatePages)
                && Objects.equals(
                        this.membersCanForkPrivateRepositories, teamOrganization.membersCanForkPrivateRepositories)
                && Objects.equals(this.webCommitSignoffRequired, teamOrganization.webCommitSignoffRequired)
                && Objects.equals(this.updatedAt, teamOrganization.updatedAt)
                && Objects.equals(this.archivedAt, teamOrganization.archivedAt);
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
                createdAt,
                type,
                totalPrivateRepos,
                ownedPrivateRepos,
                privateGists,
                diskUsage,
                collaborators,
                billingEmail,
                plan,
                defaultRepositoryPermission,
                membersCanCreateRepositories,
                twoFactorRequirementEnabled,
                membersAllowedRepositoryCreationType,
                membersCanCreatePublicRepositories,
                membersCanCreatePrivateRepositories,
                membersCanCreateInternalRepositories,
                membersCanCreatePages,
                membersCanCreatePublicPages,
                membersCanCreatePrivatePages,
                membersCanForkPrivateRepositories,
                webCommitSignoffRequired,
                updatedAt,
                archivedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TeamOrganization {\n");
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
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
        sb.append("    membersCanForkPrivateRepositories: ")
                .append(toIndentedString(membersCanForkPrivateRepositories))
                .append("\n");
        sb.append("    webCommitSignoffRequired: ")
                .append(toIndentedString(webCommitSignoffRequired))
                .append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    archivedAt: ").append(toIndentedString(archivedAt)).append("\n");
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
