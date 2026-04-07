package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookPush
 */
@JsonTypeName("webhook-push")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPush {

    private String after;

    private JsonNullable<String> baseRef = JsonNullable.<String>undefined();

    private String before;

    @Valid
    private List<@Valid Commit> commits = new ArrayList<>();

    private String compare;

    private Boolean created;

    private Boolean deleted;

    private Optional<EnterpriseWebhooks> enterprise = Optional.empty();

    private Boolean forced;

    private JsonNullable<Commit1> headCommit = JsonNullable.<Commit1>undefined();

    private Optional<SimpleInstallation> installation = Optional.empty();

    private Optional<OrganizationSimpleWebhooks> organization = Optional.empty();

    private Committer1 pusher;

    private String ref;

    private Repository2 repository;

    private Optional<SimpleUser> sender = Optional.empty();

    public WebhookPush() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookPush(
            String after,
            String baseRef,
            String before,
            List<@Valid Commit> commits,
            String compare,
            Boolean created,
            Boolean deleted,
            Boolean forced,
            Commit1 headCommit,
            Committer1 pusher,
            String ref,
            Repository2 repository) {
        this.after = after;
        this.baseRef = JsonNullable.of(baseRef);
        this.before = before;
        this.commits = commits;
        this.compare = compare;
        this.created = created;
        this.deleted = deleted;
        this.forced = forced;
        this.headCommit = JsonNullable.of(headCommit);
        this.pusher = pusher;
        this.ref = ref;
        this.repository = repository;
    }

    public WebhookPush after(String after) {
        this.after = after;
        return this;
    }

    /**
     * The SHA of the most recent commit on `ref` after the push.
     * @return after
     */
    @NotNull
    @Schema(
            name = "after",
            description = "The SHA of the most recent commit on `ref` after the push.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("after")
    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public WebhookPush baseRef(String baseRef) {
        this.baseRef = JsonNullable.of(baseRef);
        return this;
    }

    /**
     * Get baseRef
     * @return baseRef
     */
    @NotNull
    @Schema(name = "base_ref", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("base_ref")
    public JsonNullable<String> getBaseRef() {
        return baseRef;
    }

    public void setBaseRef(JsonNullable<String> baseRef) {
        this.baseRef = baseRef;
    }

    public WebhookPush before(String before) {
        this.before = before;
        return this;
    }

    /**
     * The SHA of the most recent commit on `ref` before the push.
     * @return before
     */
    @NotNull
    @Schema(
            name = "before",
            description = "The SHA of the most recent commit on `ref` before the push.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("before")
    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public WebhookPush commits(List<@Valid Commit> commits) {
        this.commits = commits;
        return this;
    }

    public WebhookPush addCommitsItem(Commit commitsItem) {
        if (this.commits == null) {
            this.commits = new ArrayList<>();
        }
        this.commits.add(commitsItem);
        return this;
    }

    /**
     * An array of commit objects describing the pushed commits. (Pushed commits are all commits that are included in the `compare` between the `before` commit and the `after` commit.) The array includes a maximum of 2048 commits. If necessary, you can use the [Commits API](https://docs.github.com/rest/commits) to fetch additional commits.
     * @return commits
     */
    @NotNull
    @Valid
    @Schema(
            name = "commits",
            description =
                    "An array of commit objects describing the pushed commits. (Pushed commits are all commits that are included in the `compare` between the `before` commit and the `after` commit.) The array includes a maximum of 2048 commits. If necessary, you can use the [Commits API](https://docs.github.com/rest/commits) to fetch additional commits.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commits")
    public List<@Valid Commit> getCommits() {
        return commits;
    }

    public void setCommits(List<@Valid Commit> commits) {
        this.commits = commits;
    }

    public WebhookPush compare(String compare) {
        this.compare = compare;
        return this;
    }

    /**
     * URL that shows the changes in this `ref` update, from the `before` commit to the `after` commit. For a newly created `ref` that is directly based on the default branch, this is the comparison between the head of the default branch and the `after` commit. Otherwise, this shows all commits until the `after` commit.
     * @return compare
     */
    @NotNull
    @Schema(
            name = "compare",
            description =
                    "URL that shows the changes in this `ref` update, from the `before` commit to the `after` commit. For a newly created `ref` that is directly based on the default branch, this is the comparison between the head of the default branch and the `after` commit. Otherwise, this shows all commits until the `after` commit.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("compare")
    public String getCompare() {
        return compare;
    }

    public void setCompare(String compare) {
        this.compare = compare;
    }

    public WebhookPush created(Boolean created) {
        this.created = created;
        return this;
    }

    /**
     * Whether this push created the `ref`.
     * @return created
     */
    @NotNull
    @Schema(
            name = "created",
            description = "Whether this push created the `ref`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created")
    public Boolean getCreated() {
        return created;
    }

    public void setCreated(Boolean created) {
        this.created = created;
    }

    public WebhookPush deleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Whether this push deleted the `ref`.
     * @return deleted
     */
    @NotNull
    @Schema(
            name = "deleted",
            description = "Whether this push deleted the `ref`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public WebhookPush enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookPush forced(Boolean forced) {
        this.forced = forced;
        return this;
    }

    /**
     * Whether this push was a force push of the `ref`.
     * @return forced
     */
    @NotNull
    @Schema(
            name = "forced",
            description = "Whether this push was a force push of the `ref`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("forced")
    public Boolean getForced() {
        return forced;
    }

    public void setForced(Boolean forced) {
        this.forced = forced;
    }

    public WebhookPush headCommit(Commit1 headCommit) {
        this.headCommit = JsonNullable.of(headCommit);
        return this;
    }

    /**
     * Get headCommit
     * @return headCommit
     */
    @NotNull
    @Valid
    @Schema(name = "head_commit", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head_commit")
    public JsonNullable<Commit1> getHeadCommit() {
        return headCommit;
    }

    public void setHeadCommit(JsonNullable<Commit1> headCommit) {
        this.headCommit = headCommit;
    }

    public WebhookPush installation(SimpleInstallation installation) {
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

    public WebhookPush organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookPush pusher(Committer1 pusher) {
        this.pusher = pusher;
        return this;
    }

    /**
     * Get pusher
     * @return pusher
     */
    @NotNull
    @Valid
    @Schema(name = "pusher", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pusher")
    public Committer1 getPusher() {
        return pusher;
    }

    public void setPusher(Committer1 pusher) {
        this.pusher = pusher;
    }

    public WebhookPush ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * The full git ref that was pushed. Example: `refs/heads/main` or `refs/tags/v3.14.1`.
     * @return ref
     */
    @NotNull
    @Schema(
            name = "ref",
            description = "The full git ref that was pushed. Example: `refs/heads/main` or `refs/tags/v3.14.1`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public WebhookPush repository(Repository2 repository) {
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
    public Repository2 getRepository() {
        return repository;
    }

    public void setRepository(Repository2 repository) {
        this.repository = repository;
    }

    public WebhookPush sender(SimpleUser sender) {
        this.sender = Optional.ofNullable(sender);
        return this;
    }

    /**
     * Get sender
     * @return sender
     */
    @Valid
    @Schema(name = "sender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sender")
    public Optional<SimpleUser> getSender() {
        return sender;
    }

    public void setSender(Optional<SimpleUser> sender) {
        this.sender = sender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookPush webhookPush = (WebhookPush) o;
        return Objects.equals(this.after, webhookPush.after)
                && Objects.equals(this.baseRef, webhookPush.baseRef)
                && Objects.equals(this.before, webhookPush.before)
                && Objects.equals(this.commits, webhookPush.commits)
                && Objects.equals(this.compare, webhookPush.compare)
                && Objects.equals(this.created, webhookPush.created)
                && Objects.equals(this.deleted, webhookPush.deleted)
                && Objects.equals(this.enterprise, webhookPush.enterprise)
                && Objects.equals(this.forced, webhookPush.forced)
                && Objects.equals(this.headCommit, webhookPush.headCommit)
                && Objects.equals(this.installation, webhookPush.installation)
                && Objects.equals(this.organization, webhookPush.organization)
                && Objects.equals(this.pusher, webhookPush.pusher)
                && Objects.equals(this.ref, webhookPush.ref)
                && Objects.equals(this.repository, webhookPush.repository)
                && Objects.equals(this.sender, webhookPush.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                after,
                baseRef,
                before,
                commits,
                compare,
                created,
                deleted,
                enterprise,
                forced,
                headCommit,
                installation,
                organization,
                pusher,
                ref,
                repository,
                sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPush {\n");
        sb.append("    after: ").append(toIndentedString(after)).append("\n");
        sb.append("    baseRef: ").append(toIndentedString(baseRef)).append("\n");
        sb.append("    before: ").append(toIndentedString(before)).append("\n");
        sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
        sb.append("    compare: ").append(toIndentedString(compare)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    forced: ").append(toIndentedString(forced)).append("\n");
        sb.append("    headCommit: ").append(toIndentedString(headCommit)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    pusher: ").append(toIndentedString(pusher)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
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
