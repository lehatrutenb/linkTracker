package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookStatus
 */
@JsonTypeName("webhook-status")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookStatus {

    private JsonNullable<URI> avatarUrl = JsonNullable.<URI>undefined();

    @Valid
    private List<@Valid WebhookStatusBranchesInner> branches = new ArrayList<>();

    private WebhookStatusCommit commit;

    private String context;

    private String createdAt;

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    private Optional<EnterpriseWebhooks> enterprise = Optional.empty();

    private Long id;

    private Optional<SimpleInstallation> installation = Optional.empty();

    private String name;

    private Optional<OrganizationSimpleWebhooks> organization = Optional.empty();

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    private String sha;

    /**
     * The new state. Can be `pending`, `success`, `failure`, or `error`.
     */
    public enum StateEnum {
        PENDING("pending"),

        SUCCESS("success"),

        FAILURE("failure"),

        ERROR("error");

        private final String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            for (StateEnum b : StateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private StateEnum state;

    private JsonNullable<String> targetUrl = JsonNullable.<String>undefined();

    private String updatedAt;

    public WebhookStatus() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookStatus(
            List<@Valid WebhookStatusBranchesInner> branches,
            WebhookStatusCommit commit,
            String context,
            String createdAt,
            String description,
            Long id,
            String name,
            RepositoryWebhooks repository,
            SimpleUser sender,
            String sha,
            StateEnum state,
            String targetUrl,
            String updatedAt) {
        this.branches = branches;
        this.commit = commit;
        this.context = context;
        this.createdAt = createdAt;
        this.description = JsonNullable.of(description);
        this.id = id;
        this.name = name;
        this.repository = repository;
        this.sender = sender;
        this.sha = sha;
        this.state = state;
        this.targetUrl = JsonNullable.of(targetUrl);
        this.updatedAt = updatedAt;
    }

    public WebhookStatus avatarUrl(URI avatarUrl) {
        this.avatarUrl = JsonNullable.of(avatarUrl);
        return this;
    }

    /**
     * Get avatarUrl
     * @return avatarUrl
     */
    @Valid
    @Schema(name = "avatar_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("avatar_url")
    public JsonNullable<URI> getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(JsonNullable<URI> avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public WebhookStatus branches(List<@Valid WebhookStatusBranchesInner> branches) {
        this.branches = branches;
        return this;
    }

    public WebhookStatus addBranchesItem(WebhookStatusBranchesInner branchesItem) {
        if (this.branches == null) {
            this.branches = new ArrayList<>();
        }
        this.branches.add(branchesItem);
        return this;
    }

    /**
     * An array of branch objects containing the status' SHA. Each branch contains the given SHA, but the SHA may or may not be the head of the branch. The array includes a maximum of 10 branches.
     * @return branches
     */
    @NotNull
    @Valid
    @Schema(
            name = "branches",
            description =
                    "An array of branch objects containing the status' SHA. Each branch contains the given SHA, but the SHA may or may not be the head of the branch. The array includes a maximum of 10 branches.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("branches")
    public List<@Valid WebhookStatusBranchesInner> getBranches() {
        return branches;
    }

    public void setBranches(List<@Valid WebhookStatusBranchesInner> branches) {
        this.branches = branches;
    }

    public WebhookStatus commit(WebhookStatusCommit commit) {
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
    public WebhookStatusCommit getCommit() {
        return commit;
    }

    public void setCommit(WebhookStatusCommit commit) {
        this.commit = commit;
    }

    public WebhookStatus context(String context) {
        this.context = context;
        return this;
    }

    /**
     * Get context
     * @return context
     */
    @NotNull
    @Schema(name = "context", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("context")
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public WebhookStatus createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public WebhookStatus description(String description) {
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * The optional human-readable description added to the status.
     * @return description
     */
    @NotNull
    @Schema(
            name = "description",
            description = "The optional human-readable description added to the status.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public WebhookStatus enterprise(EnterpriseWebhooks enterprise) {
        this.enterprise = Optional.ofNullable(enterprise);
        return this;
    }

    /**
     * Get enterprise
     * @return enterprise
     */
    @Valid
    @Schema(name = "enterprise", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enterprise")
    public Optional<EnterpriseWebhooks> getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Optional<EnterpriseWebhooks> enterprise) {
        this.enterprise = enterprise;
    }

    public WebhookStatus id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the status.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            description = "The unique identifier of the status.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WebhookStatus installation(SimpleInstallation installation) {
        this.installation = Optional.ofNullable(installation);
        return this;
    }

    /**
     * Get installation
     * @return installation
     */
    @Valid
    @Schema(name = "installation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("installation")
    public Optional<SimpleInstallation> getInstallation() {
        return installation;
    }

    public void setInstallation(Optional<SimpleInstallation> installation) {
        this.installation = installation;
    }

    public WebhookStatus name(String name) {
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

    public WebhookStatus organization(OrganizationSimpleWebhooks organization) {
        this.organization = Optional.ofNullable(organization);
        return this;
    }

    /**
     * Get organization
     * @return organization
     */
    @Valid
    @Schema(name = "organization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization")
    public Optional<OrganizationSimpleWebhooks> getOrganization() {
        return organization;
    }

    public void setOrganization(Optional<OrganizationSimpleWebhooks> organization) {
        this.organization = organization;
    }

    public WebhookStatus repository(RepositoryWebhooks repository) {
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
    public RepositoryWebhooks getRepository() {
        return repository;
    }

    public void setRepository(RepositoryWebhooks repository) {
        this.repository = repository;
    }

    public WebhookStatus sender(SimpleUser sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Get sender
     * @return sender
     */
    @NotNull
    @Valid
    @Schema(name = "sender", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sender")
    public SimpleUser getSender() {
        return sender;
    }

    public void setSender(SimpleUser sender) {
        this.sender = sender;
    }

    public WebhookStatus sha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * The Commit SHA.
     * @return sha
     */
    @NotNull
    @Schema(name = "sha", description = "The Commit SHA.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public WebhookStatus state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * The new state. Can be `pending`, `success`, `failure`, or `error`.
     * @return state
     */
    @NotNull
    @Schema(
            name = "state",
            description = "The new state. Can be `pending`, `success`, `failure`, or `error`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public WebhookStatus targetUrl(String targetUrl) {
        this.targetUrl = JsonNullable.of(targetUrl);
        return this;
    }

    /**
     * The optional link added to the status.
     * @return targetUrl
     */
    @NotNull
    @Schema(
            name = "target_url",
            description = "The optional link added to the status.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("target_url")
    public JsonNullable<String> getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(JsonNullable<String> targetUrl) {
        this.targetUrl = targetUrl;
    }

    public WebhookStatus updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookStatus webhookStatus = (WebhookStatus) o;
        return equalsNullable(this.avatarUrl, webhookStatus.avatarUrl)
                && Objects.equals(this.branches, webhookStatus.branches)
                && Objects.equals(this.commit, webhookStatus.commit)
                && Objects.equals(this.context, webhookStatus.context)
                && Objects.equals(this.createdAt, webhookStatus.createdAt)
                && Objects.equals(this.description, webhookStatus.description)
                && Objects.equals(this.enterprise, webhookStatus.enterprise)
                && Objects.equals(this.id, webhookStatus.id)
                && Objects.equals(this.installation, webhookStatus.installation)
                && Objects.equals(this.name, webhookStatus.name)
                && Objects.equals(this.organization, webhookStatus.organization)
                && Objects.equals(this.repository, webhookStatus.repository)
                && Objects.equals(this.sender, webhookStatus.sender)
                && Objects.equals(this.sha, webhookStatus.sha)
                && Objects.equals(this.state, webhookStatus.state)
                && Objects.equals(this.targetUrl, webhookStatus.targetUrl)
                && Objects.equals(this.updatedAt, webhookStatus.updatedAt);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hashCodeNullable(avatarUrl),
                branches,
                commit,
                context,
                createdAt,
                description,
                enterprise,
                id,
                installation,
                name,
                organization,
                repository,
                sender,
                sha,
                state,
                targetUrl,
                updatedAt);
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
        sb.append("class WebhookStatus {\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
        sb.append("    branches: ").append(toIndentedString(branches)).append("\n");
        sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
