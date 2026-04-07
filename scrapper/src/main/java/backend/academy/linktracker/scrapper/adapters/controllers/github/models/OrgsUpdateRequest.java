package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * OrgsUpdateRequest
 */
@JsonTypeName("orgs_update_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsUpdateRequest {

    private Optional<String> billingEmail = Optional.empty();

    private Optional<String> company = Optional.empty();

    private Optional<String> email = Optional.empty();

    private Optional<String> twitterUsername = Optional.empty();

    private Optional<String> location = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> description = Optional.empty();

    private Optional<Boolean> hasOrganizationProjects = Optional.empty();

    private Optional<Boolean> hasRepositoryProjects = Optional.empty();

    /**
     * Default permission level members have for organization repositories.
     */
    public enum DefaultRepositoryPermissionEnum {
        READ("read"),

        WRITE("write"),

        ADMIN("admin"),

        NONE("none");

        private final String value;

        DefaultRepositoryPermissionEnum(String value) {
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
        public static DefaultRepositoryPermissionEnum fromValue(String value) {
            for (DefaultRepositoryPermissionEnum b : DefaultRepositoryPermissionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<DefaultRepositoryPermissionEnum> defaultRepositoryPermission =
            Optional.of(DefaultRepositoryPermissionEnum.READ);

    private Optional<Boolean> membersCanCreateRepositories = Optional.of(true);

    private Optional<Boolean> membersCanCreateInternalRepositories = Optional.empty();

    private Optional<Boolean> membersCanCreatePrivateRepositories = Optional.empty();

    private Optional<Boolean> membersCanCreatePublicRepositories = Optional.empty();

    /**
     * Specifies which types of repositories non-admin organization members can create. `private` is only available to repositories that are part of an organization on GitHub Enterprise Cloud.  **Note:** This parameter is closing down and will be removed in the future. Its return value ignores internal repositories. Using this parameter overrides values set in `members_can_create_repositories`. See the parameter deprecation notice in the operation description for details.
     */
    public enum MembersAllowedRepositoryCreationTypeEnum {
        ALL("all"),

        PRIVATE("private"),

        NONE("none");

        private final String value;

        MembersAllowedRepositoryCreationTypeEnum(String value) {
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
        public static MembersAllowedRepositoryCreationTypeEnum fromValue(String value) {
            for (MembersAllowedRepositoryCreationTypeEnum b : MembersAllowedRepositoryCreationTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<MembersAllowedRepositoryCreationTypeEnum> membersAllowedRepositoryCreationType = Optional.empty();

    private Optional<Boolean> membersCanCreatePages = Optional.of(true);

    private Optional<Boolean> membersCanCreatePublicPages = Optional.of(true);

    private Optional<Boolean> membersCanCreatePrivatePages = Optional.of(true);

    private Optional<Boolean> membersCanForkPrivateRepositories = Optional.of(false);

    private Optional<Boolean> webCommitSignoffRequired = Optional.of(false);

    private Optional<String> blog = Optional.empty();

    @Deprecated
    private Optional<Boolean> advancedSecurityEnabledForNewRepositories = Optional.empty();

    @Deprecated
    private Optional<Boolean> dependabotAlertsEnabledForNewRepositories = Optional.empty();

    @Deprecated
    private Optional<Boolean> dependabotSecurityUpdatesEnabledForNewRepositories = Optional.empty();

    @Deprecated
    private Optional<Boolean> dependencyGraphEnabledForNewRepositories = Optional.empty();

    @Deprecated
    private Optional<Boolean> secretScanningEnabledForNewRepositories = Optional.empty();

    @Deprecated
    private Optional<Boolean> secretScanningPushProtectionEnabledForNewRepositories = Optional.empty();

    private Optional<String> secretScanningPushProtectionCustomLink = Optional.empty();

    private Optional<Boolean> deployKeysEnabledForRepositories = Optional.empty();

    public OrgsUpdateRequest billingEmail(String billingEmail) {
        this.billingEmail = Optional.ofNullable(billingEmail);
        return this;
    }

    /**
     * Billing email address. This address is not publicized.
     * @return billingEmail
     */
    @Schema(
            name = "billing_email",
            description = "Billing email address. This address is not publicized.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("billing_email")
    public Optional<String> getBillingEmail() {
        return billingEmail;
    }

    public void setBillingEmail(Optional<String> billingEmail) {
        this.billingEmail = billingEmail;
    }

    public OrgsUpdateRequest company(String company) {
        this.company = Optional.ofNullable(company);
        return this;
    }

    /**
     * The company name.
     * @return company
     */
    @Schema(name = "company", description = "The company name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("company")
    public Optional<String> getCompany() {
        return company;
    }

    public void setCompany(Optional<String> company) {
        this.company = company;
    }

    public OrgsUpdateRequest email(String email) {
        this.email = Optional.ofNullable(email);
        return this;
    }

    /**
     * The publicly visible email address.
     * @return email
     */
    @Schema(
            name = "email",
            description = "The publicly visible email address.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("email")
    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }

    public OrgsUpdateRequest twitterUsername(String twitterUsername) {
        this.twitterUsername = Optional.ofNullable(twitterUsername);
        return this;
    }

    /**
     * The Twitter username of the company.
     * @return twitterUsername
     */
    @Schema(
            name = "twitter_username",
            description = "The Twitter username of the company.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("twitter_username")
    public Optional<String> getTwitterUsername() {
        return twitterUsername;
    }

    public void setTwitterUsername(Optional<String> twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    public OrgsUpdateRequest location(String location) {
        this.location = Optional.ofNullable(location);
        return this;
    }

    /**
     * The location.
     * @return location
     */
    @Schema(name = "location", description = "The location.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("location")
    public Optional<String> getLocation() {
        return location;
    }

    public void setLocation(Optional<String> location) {
        this.location = location;
    }

    public OrgsUpdateRequest name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * The shorthand name of the company.
     * @return name
     */
    @Schema(
            name = "name",
            description = "The shorthand name of the company.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public OrgsUpdateRequest description(String description) {
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * The description of the company. The maximum size is 160 characters.
     * @return description
     */
    @Schema(
            name = "description",
            description = "The description of the company. The maximum size is 160 characters.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(Optional<String> description) {
        this.description = description;
    }

    public OrgsUpdateRequest hasOrganizationProjects(Boolean hasOrganizationProjects) {
        this.hasOrganizationProjects = Optional.ofNullable(hasOrganizationProjects);
        return this;
    }

    /**
     * Whether an organization can use organization projects.
     * @return hasOrganizationProjects
     */
    @Schema(
            name = "has_organization_projects",
            description = "Whether an organization can use organization projects.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_organization_projects")
    public Optional<Boolean> getHasOrganizationProjects() {
        return hasOrganizationProjects;
    }

    public void setHasOrganizationProjects(Optional<Boolean> hasOrganizationProjects) {
        this.hasOrganizationProjects = hasOrganizationProjects;
    }

    public OrgsUpdateRequest hasRepositoryProjects(Boolean hasRepositoryProjects) {
        this.hasRepositoryProjects = Optional.ofNullable(hasRepositoryProjects);
        return this;
    }

    /**
     * Whether repositories that belong to the organization can use repository projects.
     * @return hasRepositoryProjects
     */
    @Schema(
            name = "has_repository_projects",
            description = "Whether repositories that belong to the organization can use repository projects.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_repository_projects")
    public Optional<Boolean> getHasRepositoryProjects() {
        return hasRepositoryProjects;
    }

    public void setHasRepositoryProjects(Optional<Boolean> hasRepositoryProjects) {
        this.hasRepositoryProjects = hasRepositoryProjects;
    }

    public OrgsUpdateRequest defaultRepositoryPermission(DefaultRepositoryPermissionEnum defaultRepositoryPermission) {
        this.defaultRepositoryPermission = Optional.ofNullable(defaultRepositoryPermission);
        return this;
    }

    /**
     * Default permission level members have for organization repositories.
     * @return defaultRepositoryPermission
     */
    @Schema(
            name = "default_repository_permission",
            description = "Default permission level members have for organization repositories.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("default_repository_permission")
    public Optional<DefaultRepositoryPermissionEnum> getDefaultRepositoryPermission() {
        return defaultRepositoryPermission;
    }

    public void setDefaultRepositoryPermission(Optional<DefaultRepositoryPermissionEnum> defaultRepositoryPermission) {
        this.defaultRepositoryPermission = defaultRepositoryPermission;
    }

    public OrgsUpdateRequest membersCanCreateRepositories(Boolean membersCanCreateRepositories) {
        this.membersCanCreateRepositories = Optional.ofNullable(membersCanCreateRepositories);
        return this;
    }

    /**
     * Whether of non-admin organization members can create repositories. **Note:** A parameter can override this parameter. See `members_allowed_repository_creation_type` in this table for details.
     * @return membersCanCreateRepositories
     */
    @Schema(
            name = "members_can_create_repositories",
            description =
                    "Whether of non-admin organization members can create repositories. **Note:** A parameter can override this parameter. See `members_allowed_repository_creation_type` in this table for details.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_can_create_repositories")
    public Optional<Boolean> getMembersCanCreateRepositories() {
        return membersCanCreateRepositories;
    }

    public void setMembersCanCreateRepositories(Optional<Boolean> membersCanCreateRepositories) {
        this.membersCanCreateRepositories = membersCanCreateRepositories;
    }

    public OrgsUpdateRequest membersCanCreateInternalRepositories(Boolean membersCanCreateInternalRepositories) {
        this.membersCanCreateInternalRepositories = Optional.ofNullable(membersCanCreateInternalRepositories);
        return this;
    }

    /**
     * Whether organization members can create internal repositories, which are visible to all enterprise members. You can only allow members to create internal repositories if your organization is associated with an enterprise account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+. For more information, see \"[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)\" in the GitHub Help documentation.
     * @return membersCanCreateInternalRepositories
     */
    @Schema(
            name = "members_can_create_internal_repositories",
            description =
                    "Whether organization members can create internal repositories, which are visible to all enterprise members. You can only allow members to create internal repositories if your organization is associated with an enterprise account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+. For more information, see \"[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)\" in the GitHub Help documentation.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_can_create_internal_repositories")
    public Optional<Boolean> getMembersCanCreateInternalRepositories() {
        return membersCanCreateInternalRepositories;
    }

    public void setMembersCanCreateInternalRepositories(Optional<Boolean> membersCanCreateInternalRepositories) {
        this.membersCanCreateInternalRepositories = membersCanCreateInternalRepositories;
    }

    public OrgsUpdateRequest membersCanCreatePrivateRepositories(Boolean membersCanCreatePrivateRepositories) {
        this.membersCanCreatePrivateRepositories = Optional.ofNullable(membersCanCreatePrivateRepositories);
        return this;
    }

    /**
     * Whether organization members can create private repositories, which are visible to organization members with permission. For more information, see \"[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)\" in the GitHub Help documentation.
     * @return membersCanCreatePrivateRepositories
     */
    @Schema(
            name = "members_can_create_private_repositories",
            description =
                    "Whether organization members can create private repositories, which are visible to organization members with permission. For more information, see \"[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)\" in the GitHub Help documentation.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_can_create_private_repositories")
    public Optional<Boolean> getMembersCanCreatePrivateRepositories() {
        return membersCanCreatePrivateRepositories;
    }

    public void setMembersCanCreatePrivateRepositories(Optional<Boolean> membersCanCreatePrivateRepositories) {
        this.membersCanCreatePrivateRepositories = membersCanCreatePrivateRepositories;
    }

    public OrgsUpdateRequest membersCanCreatePublicRepositories(Boolean membersCanCreatePublicRepositories) {
        this.membersCanCreatePublicRepositories = Optional.ofNullable(membersCanCreatePublicRepositories);
        return this;
    }

    /**
     * Whether organization members can create public repositories, which are visible to anyone. For more information, see \"[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)\" in the GitHub Help documentation.
     * @return membersCanCreatePublicRepositories
     */
    @Schema(
            name = "members_can_create_public_repositories",
            description =
                    "Whether organization members can create public repositories, which are visible to anyone. For more information, see \"[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)\" in the GitHub Help documentation.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_can_create_public_repositories")
    public Optional<Boolean> getMembersCanCreatePublicRepositories() {
        return membersCanCreatePublicRepositories;
    }

    public void setMembersCanCreatePublicRepositories(Optional<Boolean> membersCanCreatePublicRepositories) {
        this.membersCanCreatePublicRepositories = membersCanCreatePublicRepositories;
    }

    public OrgsUpdateRequest membersAllowedRepositoryCreationType(
            MembersAllowedRepositoryCreationTypeEnum membersAllowedRepositoryCreationType) {
        this.membersAllowedRepositoryCreationType = Optional.ofNullable(membersAllowedRepositoryCreationType);
        return this;
    }

    /**
     * Specifies which types of repositories non-admin organization members can create. `private` is only available to repositories that are part of an organization on GitHub Enterprise Cloud.  **Note:** This parameter is closing down and will be removed in the future. Its return value ignores internal repositories. Using this parameter overrides values set in `members_can_create_repositories`. See the parameter deprecation notice in the operation description for details.
     * @return membersAllowedRepositoryCreationType
     */
    @Schema(
            name = "members_allowed_repository_creation_type",
            description =
                    "Specifies which types of repositories non-admin organization members can create. `private` is only available to repositories that are part of an organization on GitHub Enterprise Cloud.  **Note:** This parameter is closing down and will be removed in the future. Its return value ignores internal repositories. Using this parameter overrides values set in `members_can_create_repositories`. See the parameter deprecation notice in the operation description for details.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_allowed_repository_creation_type")
    public Optional<MembersAllowedRepositoryCreationTypeEnum> getMembersAllowedRepositoryCreationType() {
        return membersAllowedRepositoryCreationType;
    }

    public void setMembersAllowedRepositoryCreationType(
            Optional<MembersAllowedRepositoryCreationTypeEnum> membersAllowedRepositoryCreationType) {
        this.membersAllowedRepositoryCreationType = membersAllowedRepositoryCreationType;
    }

    public OrgsUpdateRequest membersCanCreatePages(Boolean membersCanCreatePages) {
        this.membersCanCreatePages = Optional.ofNullable(membersCanCreatePages);
        return this;
    }

    /**
     * Whether organization members can create GitHub Pages sites. Existing published sites will not be impacted.
     * @return membersCanCreatePages
     */
    @Schema(
            name = "members_can_create_pages",
            description =
                    "Whether organization members can create GitHub Pages sites. Existing published sites will not be impacted.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_can_create_pages")
    public Optional<Boolean> getMembersCanCreatePages() {
        return membersCanCreatePages;
    }

    public void setMembersCanCreatePages(Optional<Boolean> membersCanCreatePages) {
        this.membersCanCreatePages = membersCanCreatePages;
    }

    public OrgsUpdateRequest membersCanCreatePublicPages(Boolean membersCanCreatePublicPages) {
        this.membersCanCreatePublicPages = Optional.ofNullable(membersCanCreatePublicPages);
        return this;
    }

    /**
     * Whether organization members can create public GitHub Pages sites. Existing published sites will not be impacted.
     * @return membersCanCreatePublicPages
     */
    @Schema(
            name = "members_can_create_public_pages",
            description =
                    "Whether organization members can create public GitHub Pages sites. Existing published sites will not be impacted.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_can_create_public_pages")
    public Optional<Boolean> getMembersCanCreatePublicPages() {
        return membersCanCreatePublicPages;
    }

    public void setMembersCanCreatePublicPages(Optional<Boolean> membersCanCreatePublicPages) {
        this.membersCanCreatePublicPages = membersCanCreatePublicPages;
    }

    public OrgsUpdateRequest membersCanCreatePrivatePages(Boolean membersCanCreatePrivatePages) {
        this.membersCanCreatePrivatePages = Optional.ofNullable(membersCanCreatePrivatePages);
        return this;
    }

    /**
     * Whether organization members can create private GitHub Pages sites. Existing published sites will not be impacted.
     * @return membersCanCreatePrivatePages
     */
    @Schema(
            name = "members_can_create_private_pages",
            description =
                    "Whether organization members can create private GitHub Pages sites. Existing published sites will not be impacted.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_can_create_private_pages")
    public Optional<Boolean> getMembersCanCreatePrivatePages() {
        return membersCanCreatePrivatePages;
    }

    public void setMembersCanCreatePrivatePages(Optional<Boolean> membersCanCreatePrivatePages) {
        this.membersCanCreatePrivatePages = membersCanCreatePrivatePages;
    }

    public OrgsUpdateRequest membersCanForkPrivateRepositories(Boolean membersCanForkPrivateRepositories) {
        this.membersCanForkPrivateRepositories = Optional.ofNullable(membersCanForkPrivateRepositories);
        return this;
    }

    /**
     * Whether organization members can fork private organization repositories.
     * @return membersCanForkPrivateRepositories
     */
    @Schema(
            name = "members_can_fork_private_repositories",
            description = "Whether organization members can fork private organization repositories.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_can_fork_private_repositories")
    public Optional<Boolean> getMembersCanForkPrivateRepositories() {
        return membersCanForkPrivateRepositories;
    }

    public void setMembersCanForkPrivateRepositories(Optional<Boolean> membersCanForkPrivateRepositories) {
        this.membersCanForkPrivateRepositories = membersCanForkPrivateRepositories;
    }

    public OrgsUpdateRequest webCommitSignoffRequired(Boolean webCommitSignoffRequired) {
        this.webCommitSignoffRequired = Optional.ofNullable(webCommitSignoffRequired);
        return this;
    }

    /**
     * Whether contributors to organization repositories are required to sign off on commits they make through GitHub's web interface.
     * @return webCommitSignoffRequired
     */
    @Schema(
            name = "web_commit_signoff_required",
            description =
                    "Whether contributors to organization repositories are required to sign off on commits they make through GitHub's web interface.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("web_commit_signoff_required")
    public Optional<Boolean> getWebCommitSignoffRequired() {
        return webCommitSignoffRequired;
    }

    public void setWebCommitSignoffRequired(Optional<Boolean> webCommitSignoffRequired) {
        this.webCommitSignoffRequired = webCommitSignoffRequired;
    }

    public OrgsUpdateRequest blog(String blog) {
        this.blog = Optional.ofNullable(blog);
        return this;
    }

    /**
     * Get blog
     * @return blog
     */
    @Schema(name = "blog", example = "\"http://github.blog\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("blog")
    public Optional<String> getBlog() {
        return blog;
    }

    public void setBlog(Optional<String> blog) {
        this.blog = blog;
    }

    public OrgsUpdateRequest advancedSecurityEnabledForNewRepositories(
            Boolean advancedSecurityEnabledForNewRepositories) {
        this.advancedSecurityEnabledForNewRepositories = Optional.ofNullable(advancedSecurityEnabledForNewRepositories);
        return this;
    }

    /**
     * **Endpoint closing down notice.** Please use [code security configurations](https://docs.github.com/rest/code-security/configurations) instead.  Whether GitHub Advanced Security is automatically enabled for new repositories and repositories transferred to this organization.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"  You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
     * @return advancedSecurityEnabledForNewRepositories
     * @deprecated
     */
    @Schema(
            name = "advanced_security_enabled_for_new_repositories",
            description =
                    "**Endpoint closing down notice.** Please use [code security configurations](https://docs.github.com/rest/code-security/configurations) instead.  Whether GitHub Advanced Security is automatically enabled for new repositories and repositories transferred to this organization.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"  You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.",
            deprecated = true,
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("advanced_security_enabled_for_new_repositories")
    @Deprecated
    public Optional<Boolean> getAdvancedSecurityEnabledForNewRepositories() {
        return advancedSecurityEnabledForNewRepositories;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void setAdvancedSecurityEnabledForNewRepositories(
            Optional<Boolean> advancedSecurityEnabledForNewRepositories) {
        this.advancedSecurityEnabledForNewRepositories = advancedSecurityEnabledForNewRepositories;
    }

    public OrgsUpdateRequest dependabotAlertsEnabledForNewRepositories(
            Boolean dependabotAlertsEnabledForNewRepositories) {
        this.dependabotAlertsEnabledForNewRepositories = Optional.ofNullable(dependabotAlertsEnabledForNewRepositories);
        return this;
    }

    /**
     * **Endpoint closing down notice.** Please use [code security configurations](https://docs.github.com/rest/code-security/configurations) instead.  Whether Dependabot alerts are automatically enabled for new repositories and repositories transferred to this organization.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"  You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
     * @return dependabotAlertsEnabledForNewRepositories
     * @deprecated
     */
    @Schema(
            name = "dependabot_alerts_enabled_for_new_repositories",
            description =
                    "**Endpoint closing down notice.** Please use [code security configurations](https://docs.github.com/rest/code-security/configurations) instead.  Whether Dependabot alerts are automatically enabled for new repositories and repositories transferred to this organization.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"  You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.",
            deprecated = true,
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dependabot_alerts_enabled_for_new_repositories")
    @Deprecated
    public Optional<Boolean> getDependabotAlertsEnabledForNewRepositories() {
        return dependabotAlertsEnabledForNewRepositories;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void setDependabotAlertsEnabledForNewRepositories(
            Optional<Boolean> dependabotAlertsEnabledForNewRepositories) {
        this.dependabotAlertsEnabledForNewRepositories = dependabotAlertsEnabledForNewRepositories;
    }

    public OrgsUpdateRequest dependabotSecurityUpdatesEnabledForNewRepositories(
            Boolean dependabotSecurityUpdatesEnabledForNewRepositories) {
        this.dependabotSecurityUpdatesEnabledForNewRepositories =
                Optional.ofNullable(dependabotSecurityUpdatesEnabledForNewRepositories);
        return this;
    }

    /**
     * **Endpoint closing down notice.** Please use [code security configurations](https://docs.github.com/rest/code-security/configurations) instead.  Whether Dependabot security updates are automatically enabled for new repositories and repositories transferred to this organization.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"  You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
     * @return dependabotSecurityUpdatesEnabledForNewRepositories
     * @deprecated
     */
    @Schema(
            name = "dependabot_security_updates_enabled_for_new_repositories",
            description =
                    "**Endpoint closing down notice.** Please use [code security configurations](https://docs.github.com/rest/code-security/configurations) instead.  Whether Dependabot security updates are automatically enabled for new repositories and repositories transferred to this organization.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"  You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.",
            deprecated = true,
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dependabot_security_updates_enabled_for_new_repositories")
    @Deprecated
    public Optional<Boolean> getDependabotSecurityUpdatesEnabledForNewRepositories() {
        return dependabotSecurityUpdatesEnabledForNewRepositories;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void setDependabotSecurityUpdatesEnabledForNewRepositories(
            Optional<Boolean> dependabotSecurityUpdatesEnabledForNewRepositories) {
        this.dependabotSecurityUpdatesEnabledForNewRepositories = dependabotSecurityUpdatesEnabledForNewRepositories;
    }

    public OrgsUpdateRequest dependencyGraphEnabledForNewRepositories(
            Boolean dependencyGraphEnabledForNewRepositories) {
        this.dependencyGraphEnabledForNewRepositories = Optional.ofNullable(dependencyGraphEnabledForNewRepositories);
        return this;
    }

    /**
     * **Endpoint closing down notice.** Please use [code security configurations](https://docs.github.com/rest/code-security/configurations) instead.  Whether dependency graph is automatically enabled for new repositories and repositories transferred to this organization.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"  You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
     * @return dependencyGraphEnabledForNewRepositories
     * @deprecated
     */
    @Schema(
            name = "dependency_graph_enabled_for_new_repositories",
            description =
                    "**Endpoint closing down notice.** Please use [code security configurations](https://docs.github.com/rest/code-security/configurations) instead.  Whether dependency graph is automatically enabled for new repositories and repositories transferred to this organization.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"  You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.",
            deprecated = true,
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dependency_graph_enabled_for_new_repositories")
    @Deprecated
    public Optional<Boolean> getDependencyGraphEnabledForNewRepositories() {
        return dependencyGraphEnabledForNewRepositories;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void setDependencyGraphEnabledForNewRepositories(
            Optional<Boolean> dependencyGraphEnabledForNewRepositories) {
        this.dependencyGraphEnabledForNewRepositories = dependencyGraphEnabledForNewRepositories;
    }

    public OrgsUpdateRequest secretScanningEnabledForNewRepositories(Boolean secretScanningEnabledForNewRepositories) {
        this.secretScanningEnabledForNewRepositories = Optional.ofNullable(secretScanningEnabledForNewRepositories);
        return this;
    }

    /**
     * **Endpoint closing down notice.** Please use [code security configurations](https://docs.github.com/rest/code-security/configurations) instead.  Whether secret scanning is automatically enabled for new repositories and repositories transferred to this organization.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"  You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
     * @return secretScanningEnabledForNewRepositories
     * @deprecated
     */
    @Schema(
            name = "secret_scanning_enabled_for_new_repositories",
            description =
                    "**Endpoint closing down notice.** Please use [code security configurations](https://docs.github.com/rest/code-security/configurations) instead.  Whether secret scanning is automatically enabled for new repositories and repositories transferred to this organization.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"  You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.",
            deprecated = true,
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_enabled_for_new_repositories")
    @Deprecated
    public Optional<Boolean> getSecretScanningEnabledForNewRepositories() {
        return secretScanningEnabledForNewRepositories;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void setSecretScanningEnabledForNewRepositories(Optional<Boolean> secretScanningEnabledForNewRepositories) {
        this.secretScanningEnabledForNewRepositories = secretScanningEnabledForNewRepositories;
    }

    public OrgsUpdateRequest secretScanningPushProtectionEnabledForNewRepositories(
            Boolean secretScanningPushProtectionEnabledForNewRepositories) {
        this.secretScanningPushProtectionEnabledForNewRepositories =
                Optional.ofNullable(secretScanningPushProtectionEnabledForNewRepositories);
        return this;
    }

    /**
     * **Endpoint closing down notice.** Please use [code security configurations](https://docs.github.com/rest/code-security/configurations) instead.  Whether secret scanning push protection is automatically enabled for new repositories and repositories transferred to this organization.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"  You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
     * @return secretScanningPushProtectionEnabledForNewRepositories
     * @deprecated
     */
    @Schema(
            name = "secret_scanning_push_protection_enabled_for_new_repositories",
            description =
                    "**Endpoint closing down notice.** Please use [code security configurations](https://docs.github.com/rest/code-security/configurations) instead.  Whether secret scanning push protection is automatically enabled for new repositories and repositories transferred to this organization.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"  You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.",
            deprecated = true,
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_push_protection_enabled_for_new_repositories")
    @Deprecated
    public Optional<Boolean> getSecretScanningPushProtectionEnabledForNewRepositories() {
        return secretScanningPushProtectionEnabledForNewRepositories;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void setSecretScanningPushProtectionEnabledForNewRepositories(
            Optional<Boolean> secretScanningPushProtectionEnabledForNewRepositories) {
        this.secretScanningPushProtectionEnabledForNewRepositories =
                secretScanningPushProtectionEnabledForNewRepositories;
    }

    public OrgsUpdateRequest secretScanningPushProtectionCustomLink(String secretScanningPushProtectionCustomLink) {
        this.secretScanningPushProtectionCustomLink = Optional.ofNullable(secretScanningPushProtectionCustomLink);
        return this;
    }

    /**
     * If `secret_scanning_push_protection_custom_link_enabled` is true, the URL that will be displayed to contributors who are blocked from pushing a secret.
     * @return secretScanningPushProtectionCustomLink
     */
    @Schema(
            name = "secret_scanning_push_protection_custom_link",
            description =
                    "If `secret_scanning_push_protection_custom_link_enabled` is true, the URL that will be displayed to contributors who are blocked from pushing a secret.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_push_protection_custom_link")
    public Optional<String> getSecretScanningPushProtectionCustomLink() {
        return secretScanningPushProtectionCustomLink;
    }

    public void setSecretScanningPushProtectionCustomLink(Optional<String> secretScanningPushProtectionCustomLink) {
        this.secretScanningPushProtectionCustomLink = secretScanningPushProtectionCustomLink;
    }

    public OrgsUpdateRequest deployKeysEnabledForRepositories(Boolean deployKeysEnabledForRepositories) {
        this.deployKeysEnabledForRepositories = Optional.ofNullable(deployKeysEnabledForRepositories);
        return this;
    }

    /**
     * Controls whether or not deploy keys may be added and used for repositories in the organization.
     * @return deployKeysEnabledForRepositories
     */
    @Schema(
            name = "deploy_keys_enabled_for_repositories",
            description =
                    "Controls whether or not deploy keys may be added and used for repositories in the organization.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deploy_keys_enabled_for_repositories")
    public Optional<Boolean> getDeployKeysEnabledForRepositories() {
        return deployKeysEnabledForRepositories;
    }

    public void setDeployKeysEnabledForRepositories(Optional<Boolean> deployKeysEnabledForRepositories) {
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
        OrgsUpdateRequest orgsUpdateRequest = (OrgsUpdateRequest) o;
        return Objects.equals(this.billingEmail, orgsUpdateRequest.billingEmail)
                && Objects.equals(this.company, orgsUpdateRequest.company)
                && Objects.equals(this.email, orgsUpdateRequest.email)
                && Objects.equals(this.twitterUsername, orgsUpdateRequest.twitterUsername)
                && Objects.equals(this.location, orgsUpdateRequest.location)
                && Objects.equals(this.name, orgsUpdateRequest.name)
                && Objects.equals(this.description, orgsUpdateRequest.description)
                && Objects.equals(this.hasOrganizationProjects, orgsUpdateRequest.hasOrganizationProjects)
                && Objects.equals(this.hasRepositoryProjects, orgsUpdateRequest.hasRepositoryProjects)
                && Objects.equals(this.defaultRepositoryPermission, orgsUpdateRequest.defaultRepositoryPermission)
                && Objects.equals(this.membersCanCreateRepositories, orgsUpdateRequest.membersCanCreateRepositories)
                && Objects.equals(
                        this.membersCanCreateInternalRepositories,
                        orgsUpdateRequest.membersCanCreateInternalRepositories)
                && Objects.equals(
                        this.membersCanCreatePrivateRepositories, orgsUpdateRequest.membersCanCreatePrivateRepositories)
                && Objects.equals(
                        this.membersCanCreatePublicRepositories, orgsUpdateRequest.membersCanCreatePublicRepositories)
                && Objects.equals(
                        this.membersAllowedRepositoryCreationType,
                        orgsUpdateRequest.membersAllowedRepositoryCreationType)
                && Objects.equals(this.membersCanCreatePages, orgsUpdateRequest.membersCanCreatePages)
                && Objects.equals(this.membersCanCreatePublicPages, orgsUpdateRequest.membersCanCreatePublicPages)
                && Objects.equals(this.membersCanCreatePrivatePages, orgsUpdateRequest.membersCanCreatePrivatePages)
                && Objects.equals(
                        this.membersCanForkPrivateRepositories, orgsUpdateRequest.membersCanForkPrivateRepositories)
                && Objects.equals(this.webCommitSignoffRequired, orgsUpdateRequest.webCommitSignoffRequired)
                && Objects.equals(this.blog, orgsUpdateRequest.blog)
                && Objects.equals(
                        this.advancedSecurityEnabledForNewRepositories,
                        orgsUpdateRequest.advancedSecurityEnabledForNewRepositories)
                && Objects.equals(
                        this.dependabotAlertsEnabledForNewRepositories,
                        orgsUpdateRequest.dependabotAlertsEnabledForNewRepositories)
                && Objects.equals(
                        this.dependabotSecurityUpdatesEnabledForNewRepositories,
                        orgsUpdateRequest.dependabotSecurityUpdatesEnabledForNewRepositories)
                && Objects.equals(
                        this.dependencyGraphEnabledForNewRepositories,
                        orgsUpdateRequest.dependencyGraphEnabledForNewRepositories)
                && Objects.equals(
                        this.secretScanningEnabledForNewRepositories,
                        orgsUpdateRequest.secretScanningEnabledForNewRepositories)
                && Objects.equals(
                        this.secretScanningPushProtectionEnabledForNewRepositories,
                        orgsUpdateRequest.secretScanningPushProtectionEnabledForNewRepositories)
                && Objects.equals(
                        this.secretScanningPushProtectionCustomLink,
                        orgsUpdateRequest.secretScanningPushProtectionCustomLink)
                && Objects.equals(
                        this.deployKeysEnabledForRepositories, orgsUpdateRequest.deployKeysEnabledForRepositories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                billingEmail,
                company,
                email,
                twitterUsername,
                location,
                name,
                description,
                hasOrganizationProjects,
                hasRepositoryProjects,
                defaultRepositoryPermission,
                membersCanCreateRepositories,
                membersCanCreateInternalRepositories,
                membersCanCreatePrivateRepositories,
                membersCanCreatePublicRepositories,
                membersAllowedRepositoryCreationType,
                membersCanCreatePages,
                membersCanCreatePublicPages,
                membersCanCreatePrivatePages,
                membersCanForkPrivateRepositories,
                webCommitSignoffRequired,
                blog,
                advancedSecurityEnabledForNewRepositories,
                dependabotAlertsEnabledForNewRepositories,
                dependabotSecurityUpdatesEnabledForNewRepositories,
                dependencyGraphEnabledForNewRepositories,
                secretScanningEnabledForNewRepositories,
                secretScanningPushProtectionEnabledForNewRepositories,
                secretScanningPushProtectionCustomLink,
                deployKeysEnabledForRepositories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsUpdateRequest {\n");
        sb.append("    billingEmail: ").append(toIndentedString(billingEmail)).append("\n");
        sb.append("    company: ").append(toIndentedString(company)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    twitterUsername: ")
                .append(toIndentedString(twitterUsername))
                .append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    hasOrganizationProjects: ")
                .append(toIndentedString(hasOrganizationProjects))
                .append("\n");
        sb.append("    hasRepositoryProjects: ")
                .append(toIndentedString(hasRepositoryProjects))
                .append("\n");
        sb.append("    defaultRepositoryPermission: ")
                .append(toIndentedString(defaultRepositoryPermission))
                .append("\n");
        sb.append("    membersCanCreateRepositories: ")
                .append(toIndentedString(membersCanCreateRepositories))
                .append("\n");
        sb.append("    membersCanCreateInternalRepositories: ")
                .append(toIndentedString(membersCanCreateInternalRepositories))
                .append("\n");
        sb.append("    membersCanCreatePrivateRepositories: ")
                .append(toIndentedString(membersCanCreatePrivateRepositories))
                .append("\n");
        sb.append("    membersCanCreatePublicRepositories: ")
                .append(toIndentedString(membersCanCreatePublicRepositories))
                .append("\n");
        sb.append("    membersAllowedRepositoryCreationType: ")
                .append(toIndentedString(membersAllowedRepositoryCreationType))
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
        sb.append("    blog: ").append(toIndentedString(blog)).append("\n");
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
