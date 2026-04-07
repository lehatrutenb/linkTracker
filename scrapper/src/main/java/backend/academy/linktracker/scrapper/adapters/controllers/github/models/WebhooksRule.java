package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * The branch protection rule. Includes a &#x60;name&#x60; and all the [branch protection settings](https://docs.github.com/github/administering-a-repository/defining-the-mergeability-of-pull-requests/about-protected-branches#about-branch-protection-settings) applied to branches that match the name. Binary settings are boolean. Multi-level configurations are one of &#x60;off&#x60;, &#x60;non_admins&#x60;, or &#x60;everyone&#x60;. Actor and build lists are arrays of strings.
 */
@Schema(
        name = "webhooks_rule",
        description =
                "The branch protection rule. Includes a `name` and all the [branch protection settings](https://docs.github.com/github/administering-a-repository/defining-the-mergeability-of-pull-requests/about-protected-branches#about-branch-protection-settings) applied to branches that match the name. Binary settings are boolean. Multi-level configurations are one of `off`, `non_admins`, or `everyone`. Actor and build lists are arrays of strings.")
@JsonTypeName("webhooks_rule")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksRule {

    private Boolean adminEnforced;

    /**
     * Gets or Sets allowDeletionsEnforcementLevel
     */
    public enum AllowDeletionsEnforcementLevelEnum {
        OFF("off"),

        NON_ADMINS("non_admins"),

        EVERYONE("everyone");

        private final String value;

        AllowDeletionsEnforcementLevelEnum(String value) {
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
        public static AllowDeletionsEnforcementLevelEnum fromValue(String value) {
            for (AllowDeletionsEnforcementLevelEnum b : AllowDeletionsEnforcementLevelEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private AllowDeletionsEnforcementLevelEnum allowDeletionsEnforcementLevel;

    /**
     * Gets or Sets allowForcePushesEnforcementLevel
     */
    public enum AllowForcePushesEnforcementLevelEnum {
        OFF("off"),

        NON_ADMINS("non_admins"),

        EVERYONE("everyone");

        private final String value;

        AllowForcePushesEnforcementLevelEnum(String value) {
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
        public static AllowForcePushesEnforcementLevelEnum fromValue(String value) {
            for (AllowForcePushesEnforcementLevelEnum b : AllowForcePushesEnforcementLevelEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private AllowForcePushesEnforcementLevelEnum allowForcePushesEnforcementLevel;

    @Valid
    private List<String> authorizedActorNames = new ArrayList<>();

    private Boolean authorizedActorsOnly;

    private Boolean authorizedDismissalActorsOnly;

    private Optional<Boolean> createProtected = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private Boolean dismissStaleReviewsOnPush;

    private Long id;

    private Boolean ignoreApprovalsFromContributors;

    /**
     * Gets or Sets linearHistoryRequirementEnforcementLevel
     */
    public enum LinearHistoryRequirementEnforcementLevelEnum {
        OFF("off"),

        NON_ADMINS("non_admins"),

        EVERYONE("everyone");

        private final String value;

        LinearHistoryRequirementEnforcementLevelEnum(String value) {
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
        public static LinearHistoryRequirementEnforcementLevelEnum fromValue(String value) {
            for (LinearHistoryRequirementEnforcementLevelEnum b :
                    LinearHistoryRequirementEnforcementLevelEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private LinearHistoryRequirementEnforcementLevelEnum linearHistoryRequirementEnforcementLevel;

    /**
     * The enforcement level of the branch lock setting. `off` means the branch is not locked, `non_admins` means the branch is read-only for non_admins, and `everyone` means the branch is read-only for everyone.
     */
    public enum LockBranchEnforcementLevelEnum {
        OFF("off"),

        NON_ADMINS("non_admins"),

        EVERYONE("everyone");

        private final String value;

        LockBranchEnforcementLevelEnum(String value) {
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
        public static LockBranchEnforcementLevelEnum fromValue(String value) {
            for (LockBranchEnforcementLevelEnum b : LockBranchEnforcementLevelEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private LockBranchEnforcementLevelEnum lockBranchEnforcementLevel;

    private Optional<Boolean> lockAllowsForkSync = Optional.empty();

    /**
     * Gets or Sets mergeQueueEnforcementLevel
     */
    public enum MergeQueueEnforcementLevelEnum {
        OFF("off"),

        NON_ADMINS("non_admins"),

        EVERYONE("everyone");

        private final String value;

        MergeQueueEnforcementLevelEnum(String value) {
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
        public static MergeQueueEnforcementLevelEnum fromValue(String value) {
            for (MergeQueueEnforcementLevelEnum b : MergeQueueEnforcementLevelEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private MergeQueueEnforcementLevelEnum mergeQueueEnforcementLevel;

    private String name;

    /**
     * Gets or Sets pullRequestReviewsEnforcementLevel
     */
    public enum PullRequestReviewsEnforcementLevelEnum {
        OFF("off"),

        NON_ADMINS("non_admins"),

        EVERYONE("everyone");

        private final String value;

        PullRequestReviewsEnforcementLevelEnum(String value) {
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
        public static PullRequestReviewsEnforcementLevelEnum fromValue(String value) {
            for (PullRequestReviewsEnforcementLevelEnum b : PullRequestReviewsEnforcementLevelEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private PullRequestReviewsEnforcementLevelEnum pullRequestReviewsEnforcementLevel;

    private Long repositoryId;

    private Boolean requireCodeOwnerReview;

    private Optional<Boolean> requireLastPushApproval = Optional.empty();

    private Long requiredApprovingReviewCount;

    /**
     * Gets or Sets requiredConversationResolutionLevel
     */
    public enum RequiredConversationResolutionLevelEnum {
        OFF("off"),

        NON_ADMINS("non_admins"),

        EVERYONE("everyone");

        private final String value;

        RequiredConversationResolutionLevelEnum(String value) {
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
        public static RequiredConversationResolutionLevelEnum fromValue(String value) {
            for (RequiredConversationResolutionLevelEnum b : RequiredConversationResolutionLevelEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private RequiredConversationResolutionLevelEnum requiredConversationResolutionLevel;

    /**
     * Gets or Sets requiredDeploymentsEnforcementLevel
     */
    public enum RequiredDeploymentsEnforcementLevelEnum {
        OFF("off"),

        NON_ADMINS("non_admins"),

        EVERYONE("everyone");

        private final String value;

        RequiredDeploymentsEnforcementLevelEnum(String value) {
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
        public static RequiredDeploymentsEnforcementLevelEnum fromValue(String value) {
            for (RequiredDeploymentsEnforcementLevelEnum b : RequiredDeploymentsEnforcementLevelEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private RequiredDeploymentsEnforcementLevelEnum requiredDeploymentsEnforcementLevel;

    @Valid
    private List<String> requiredStatusChecks = new ArrayList<>();

    /**
     * Gets or Sets requiredStatusChecksEnforcementLevel
     */
    public enum RequiredStatusChecksEnforcementLevelEnum {
        OFF("off"),

        NON_ADMINS("non_admins"),

        EVERYONE("everyone");

        private final String value;

        RequiredStatusChecksEnforcementLevelEnum(String value) {
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
        public static RequiredStatusChecksEnforcementLevelEnum fromValue(String value) {
            for (RequiredStatusChecksEnforcementLevelEnum b : RequiredStatusChecksEnforcementLevelEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private RequiredStatusChecksEnforcementLevelEnum requiredStatusChecksEnforcementLevel;

    /**
     * Gets or Sets signatureRequirementEnforcementLevel
     */
    public enum SignatureRequirementEnforcementLevelEnum {
        OFF("off"),

        NON_ADMINS("non_admins"),

        EVERYONE("everyone");

        private final String value;

        SignatureRequirementEnforcementLevelEnum(String value) {
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
        public static SignatureRequirementEnforcementLevelEnum fromValue(String value) {
            for (SignatureRequirementEnforcementLevelEnum b : SignatureRequirementEnforcementLevelEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private SignatureRequirementEnforcementLevelEnum signatureRequirementEnforcementLevel;

    private Boolean strictRequiredStatusChecksPolicy;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    public WebhooksRule() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksRule(
            Boolean adminEnforced,
            AllowDeletionsEnforcementLevelEnum allowDeletionsEnforcementLevel,
            AllowForcePushesEnforcementLevelEnum allowForcePushesEnforcementLevel,
            List<String> authorizedActorNames,
            Boolean authorizedActorsOnly,
            Boolean authorizedDismissalActorsOnly,
            OffsetDateTime createdAt,
            Boolean dismissStaleReviewsOnPush,
            Long id,
            Boolean ignoreApprovalsFromContributors,
            LinearHistoryRequirementEnforcementLevelEnum linearHistoryRequirementEnforcementLevel,
            LockBranchEnforcementLevelEnum lockBranchEnforcementLevel,
            MergeQueueEnforcementLevelEnum mergeQueueEnforcementLevel,
            String name,
            PullRequestReviewsEnforcementLevelEnum pullRequestReviewsEnforcementLevel,
            Long repositoryId,
            Boolean requireCodeOwnerReview,
            Long requiredApprovingReviewCount,
            RequiredConversationResolutionLevelEnum requiredConversationResolutionLevel,
            RequiredDeploymentsEnforcementLevelEnum requiredDeploymentsEnforcementLevel,
            List<String> requiredStatusChecks,
            RequiredStatusChecksEnforcementLevelEnum requiredStatusChecksEnforcementLevel,
            SignatureRequirementEnforcementLevelEnum signatureRequirementEnforcementLevel,
            Boolean strictRequiredStatusChecksPolicy,
            OffsetDateTime updatedAt) {
        this.adminEnforced = adminEnforced;
        this.allowDeletionsEnforcementLevel = allowDeletionsEnforcementLevel;
        this.allowForcePushesEnforcementLevel = allowForcePushesEnforcementLevel;
        this.authorizedActorNames = authorizedActorNames;
        this.authorizedActorsOnly = authorizedActorsOnly;
        this.authorizedDismissalActorsOnly = authorizedDismissalActorsOnly;
        this.createdAt = createdAt;
        this.dismissStaleReviewsOnPush = dismissStaleReviewsOnPush;
        this.id = id;
        this.ignoreApprovalsFromContributors = ignoreApprovalsFromContributors;
        this.linearHistoryRequirementEnforcementLevel = linearHistoryRequirementEnforcementLevel;
        this.lockBranchEnforcementLevel = lockBranchEnforcementLevel;
        this.mergeQueueEnforcementLevel = mergeQueueEnforcementLevel;
        this.name = name;
        this.pullRequestReviewsEnforcementLevel = pullRequestReviewsEnforcementLevel;
        this.repositoryId = repositoryId;
        this.requireCodeOwnerReview = requireCodeOwnerReview;
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
        this.requiredConversationResolutionLevel = requiredConversationResolutionLevel;
        this.requiredDeploymentsEnforcementLevel = requiredDeploymentsEnforcementLevel;
        this.requiredStatusChecks = requiredStatusChecks;
        this.requiredStatusChecksEnforcementLevel = requiredStatusChecksEnforcementLevel;
        this.signatureRequirementEnforcementLevel = signatureRequirementEnforcementLevel;
        this.strictRequiredStatusChecksPolicy = strictRequiredStatusChecksPolicy;
        this.updatedAt = updatedAt;
    }

    public WebhooksRule adminEnforced(Boolean adminEnforced) {
        this.adminEnforced = adminEnforced;
        return this;
    }

    /**
     * Get adminEnforced
     * @return adminEnforced
     */
    @NotNull
    @Schema(name = "admin_enforced", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("admin_enforced")
    public Boolean getAdminEnforced() {
        return adminEnforced;
    }

    public void setAdminEnforced(Boolean adminEnforced) {
        this.adminEnforced = adminEnforced;
    }

    public WebhooksRule allowDeletionsEnforcementLevel(
            AllowDeletionsEnforcementLevelEnum allowDeletionsEnforcementLevel) {
        this.allowDeletionsEnforcementLevel = allowDeletionsEnforcementLevel;
        return this;
    }

    /**
     * Get allowDeletionsEnforcementLevel
     * @return allowDeletionsEnforcementLevel
     */
    @NotNull
    @Schema(name = "allow_deletions_enforcement_level", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("allow_deletions_enforcement_level")
    public AllowDeletionsEnforcementLevelEnum getAllowDeletionsEnforcementLevel() {
        return allowDeletionsEnforcementLevel;
    }

    public void setAllowDeletionsEnforcementLevel(AllowDeletionsEnforcementLevelEnum allowDeletionsEnforcementLevel) {
        this.allowDeletionsEnforcementLevel = allowDeletionsEnforcementLevel;
    }

    public WebhooksRule allowForcePushesEnforcementLevel(
            AllowForcePushesEnforcementLevelEnum allowForcePushesEnforcementLevel) {
        this.allowForcePushesEnforcementLevel = allowForcePushesEnforcementLevel;
        return this;
    }

    /**
     * Get allowForcePushesEnforcementLevel
     * @return allowForcePushesEnforcementLevel
     */
    @NotNull
    @Schema(name = "allow_force_pushes_enforcement_level", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("allow_force_pushes_enforcement_level")
    public AllowForcePushesEnforcementLevelEnum getAllowForcePushesEnforcementLevel() {
        return allowForcePushesEnforcementLevel;
    }

    public void setAllowForcePushesEnforcementLevel(
            AllowForcePushesEnforcementLevelEnum allowForcePushesEnforcementLevel) {
        this.allowForcePushesEnforcementLevel = allowForcePushesEnforcementLevel;
    }

    public WebhooksRule authorizedActorNames(List<String> authorizedActorNames) {
        this.authorizedActorNames = authorizedActorNames;
        return this;
    }

    public WebhooksRule addAuthorizedActorNamesItem(String authorizedActorNamesItem) {
        if (this.authorizedActorNames == null) {
            this.authorizedActorNames = new ArrayList<>();
        }
        this.authorizedActorNames.add(authorizedActorNamesItem);
        return this;
    }

    /**
     * Get authorizedActorNames
     * @return authorizedActorNames
     */
    @NotNull
    @Schema(name = "authorized_actor_names", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("authorized_actor_names")
    public List<String> getAuthorizedActorNames() {
        return authorizedActorNames;
    }

    public void setAuthorizedActorNames(List<String> authorizedActorNames) {
        this.authorizedActorNames = authorizedActorNames;
    }

    public WebhooksRule authorizedActorsOnly(Boolean authorizedActorsOnly) {
        this.authorizedActorsOnly = authorizedActorsOnly;
        return this;
    }

    /**
     * Get authorizedActorsOnly
     * @return authorizedActorsOnly
     */
    @NotNull
    @Schema(name = "authorized_actors_only", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("authorized_actors_only")
    public Boolean getAuthorizedActorsOnly() {
        return authorizedActorsOnly;
    }

    public void setAuthorizedActorsOnly(Boolean authorizedActorsOnly) {
        this.authorizedActorsOnly = authorizedActorsOnly;
    }

    public WebhooksRule authorizedDismissalActorsOnly(Boolean authorizedDismissalActorsOnly) {
        this.authorizedDismissalActorsOnly = authorizedDismissalActorsOnly;
        return this;
    }

    /**
     * Get authorizedDismissalActorsOnly
     * @return authorizedDismissalActorsOnly
     */
    @NotNull
    @Schema(name = "authorized_dismissal_actors_only", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("authorized_dismissal_actors_only")
    public Boolean getAuthorizedDismissalActorsOnly() {
        return authorizedDismissalActorsOnly;
    }

    public void setAuthorizedDismissalActorsOnly(Boolean authorizedDismissalActorsOnly) {
        this.authorizedDismissalActorsOnly = authorizedDismissalActorsOnly;
    }

    public WebhooksRule createProtected(Boolean createProtected) {
        this.createProtected = Optional.ofNullable(createProtected);
        return this;
    }

    /**
     * Get createProtected
     * @return createProtected
     */
    @Schema(name = "create_protected", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("create_protected")
    public Optional<Boolean> getCreateProtected() {
        return createProtected;
    }

    public void setCreateProtected(Optional<Boolean> createProtected) {
        this.createProtected = createProtected;
    }

    public WebhooksRule createdAt(OffsetDateTime createdAt) {
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

    public WebhooksRule dismissStaleReviewsOnPush(Boolean dismissStaleReviewsOnPush) {
        this.dismissStaleReviewsOnPush = dismissStaleReviewsOnPush;
        return this;
    }

    /**
     * Get dismissStaleReviewsOnPush
     * @return dismissStaleReviewsOnPush
     */
    @NotNull
    @Schema(name = "dismiss_stale_reviews_on_push", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("dismiss_stale_reviews_on_push")
    public Boolean getDismissStaleReviewsOnPush() {
        return dismissStaleReviewsOnPush;
    }

    public void setDismissStaleReviewsOnPush(Boolean dismissStaleReviewsOnPush) {
        this.dismissStaleReviewsOnPush = dismissStaleReviewsOnPush;
    }

    public WebhooksRule id(Long id) {
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

    public WebhooksRule ignoreApprovalsFromContributors(Boolean ignoreApprovalsFromContributors) {
        this.ignoreApprovalsFromContributors = ignoreApprovalsFromContributors;
        return this;
    }

    /**
     * Get ignoreApprovalsFromContributors
     * @return ignoreApprovalsFromContributors
     */
    @NotNull
    @Schema(name = "ignore_approvals_from_contributors", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ignore_approvals_from_contributors")
    public Boolean getIgnoreApprovalsFromContributors() {
        return ignoreApprovalsFromContributors;
    }

    public void setIgnoreApprovalsFromContributors(Boolean ignoreApprovalsFromContributors) {
        this.ignoreApprovalsFromContributors = ignoreApprovalsFromContributors;
    }

    public WebhooksRule linearHistoryRequirementEnforcementLevel(
            LinearHistoryRequirementEnforcementLevelEnum linearHistoryRequirementEnforcementLevel) {
        this.linearHistoryRequirementEnforcementLevel = linearHistoryRequirementEnforcementLevel;
        return this;
    }

    /**
     * Get linearHistoryRequirementEnforcementLevel
     * @return linearHistoryRequirementEnforcementLevel
     */
    @NotNull
    @Schema(name = "linear_history_requirement_enforcement_level", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("linear_history_requirement_enforcement_level")
    public LinearHistoryRequirementEnforcementLevelEnum getLinearHistoryRequirementEnforcementLevel() {
        return linearHistoryRequirementEnforcementLevel;
    }

    public void setLinearHistoryRequirementEnforcementLevel(
            LinearHistoryRequirementEnforcementLevelEnum linearHistoryRequirementEnforcementLevel) {
        this.linearHistoryRequirementEnforcementLevel = linearHistoryRequirementEnforcementLevel;
    }

    public WebhooksRule lockBranchEnforcementLevel(LockBranchEnforcementLevelEnum lockBranchEnforcementLevel) {
        this.lockBranchEnforcementLevel = lockBranchEnforcementLevel;
        return this;
    }

    /**
     * The enforcement level of the branch lock setting. `off` means the branch is not locked, `non_admins` means the branch is read-only for non_admins, and `everyone` means the branch is read-only for everyone.
     * @return lockBranchEnforcementLevel
     */
    @NotNull
    @Schema(
            name = "lock_branch_enforcement_level",
            description =
                    "The enforcement level of the branch lock setting. `off` means the branch is not locked, `non_admins` means the branch is read-only for non_admins, and `everyone` means the branch is read-only for everyone.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("lock_branch_enforcement_level")
    public LockBranchEnforcementLevelEnum getLockBranchEnforcementLevel() {
        return lockBranchEnforcementLevel;
    }

    public void setLockBranchEnforcementLevel(LockBranchEnforcementLevelEnum lockBranchEnforcementLevel) {
        this.lockBranchEnforcementLevel = lockBranchEnforcementLevel;
    }

    public WebhooksRule lockAllowsForkSync(Boolean lockAllowsForkSync) {
        this.lockAllowsForkSync = Optional.ofNullable(lockAllowsForkSync);
        return this;
    }

    /**
     * Whether users can pull changes from upstream when the branch is locked. Set to `true` to allow users to pull changes from upstream when the branch is locked. This setting is only applicable for forks.
     * @return lockAllowsForkSync
     */
    @Schema(
            name = "lock_allows_fork_sync",
            description =
                    "Whether users can pull changes from upstream when the branch is locked. Set to `true` to allow users to pull changes from upstream when the branch is locked. This setting is only applicable for forks.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("lock_allows_fork_sync")
    public Optional<Boolean> getLockAllowsForkSync() {
        return lockAllowsForkSync;
    }

    public void setLockAllowsForkSync(Optional<Boolean> lockAllowsForkSync) {
        this.lockAllowsForkSync = lockAllowsForkSync;
    }

    public WebhooksRule mergeQueueEnforcementLevel(MergeQueueEnforcementLevelEnum mergeQueueEnforcementLevel) {
        this.mergeQueueEnforcementLevel = mergeQueueEnforcementLevel;
        return this;
    }

    /**
     * Get mergeQueueEnforcementLevel
     * @return mergeQueueEnforcementLevel
     */
    @NotNull
    @Schema(name = "merge_queue_enforcement_level", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("merge_queue_enforcement_level")
    public MergeQueueEnforcementLevelEnum getMergeQueueEnforcementLevel() {
        return mergeQueueEnforcementLevel;
    }

    public void setMergeQueueEnforcementLevel(MergeQueueEnforcementLevelEnum mergeQueueEnforcementLevel) {
        this.mergeQueueEnforcementLevel = mergeQueueEnforcementLevel;
    }

    public WebhooksRule name(String name) {
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

    public WebhooksRule pullRequestReviewsEnforcementLevel(
            PullRequestReviewsEnforcementLevelEnum pullRequestReviewsEnforcementLevel) {
        this.pullRequestReviewsEnforcementLevel = pullRequestReviewsEnforcementLevel;
        return this;
    }

    /**
     * Get pullRequestReviewsEnforcementLevel
     * @return pullRequestReviewsEnforcementLevel
     */
    @NotNull
    @Schema(name = "pull_request_reviews_enforcement_level", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pull_request_reviews_enforcement_level")
    public PullRequestReviewsEnforcementLevelEnum getPullRequestReviewsEnforcementLevel() {
        return pullRequestReviewsEnforcementLevel;
    }

    public void setPullRequestReviewsEnforcementLevel(
            PullRequestReviewsEnforcementLevelEnum pullRequestReviewsEnforcementLevel) {
        this.pullRequestReviewsEnforcementLevel = pullRequestReviewsEnforcementLevel;
    }

    public WebhooksRule repositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * Get repositoryId
     * @return repositoryId
     */
    @NotNull
    @Schema(name = "repository_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_id")
    public Long getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
    }

    public WebhooksRule requireCodeOwnerReview(Boolean requireCodeOwnerReview) {
        this.requireCodeOwnerReview = requireCodeOwnerReview;
        return this;
    }

    /**
     * Get requireCodeOwnerReview
     * @return requireCodeOwnerReview
     */
    @NotNull
    @Schema(name = "require_code_owner_review", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("require_code_owner_review")
    public Boolean getRequireCodeOwnerReview() {
        return requireCodeOwnerReview;
    }

    public void setRequireCodeOwnerReview(Boolean requireCodeOwnerReview) {
        this.requireCodeOwnerReview = requireCodeOwnerReview;
    }

    public WebhooksRule requireLastPushApproval(Boolean requireLastPushApproval) {
        this.requireLastPushApproval = Optional.ofNullable(requireLastPushApproval);
        return this;
    }

    /**
     * Whether the most recent push must be approved by someone other than the person who pushed it
     * @return requireLastPushApproval
     */
    @Schema(
            name = "require_last_push_approval",
            description =
                    "Whether the most recent push must be approved by someone other than the person who pushed it",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("require_last_push_approval")
    public Optional<Boolean> getRequireLastPushApproval() {
        return requireLastPushApproval;
    }

    public void setRequireLastPushApproval(Optional<Boolean> requireLastPushApproval) {
        this.requireLastPushApproval = requireLastPushApproval;
    }

    public WebhooksRule requiredApprovingReviewCount(Long requiredApprovingReviewCount) {
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
        return this;
    }

    /**
     * Get requiredApprovingReviewCount
     * @return requiredApprovingReviewCount
     */
    @NotNull
    @Schema(name = "required_approving_review_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("required_approving_review_count")
    public Long getRequiredApprovingReviewCount() {
        return requiredApprovingReviewCount;
    }

    public void setRequiredApprovingReviewCount(Long requiredApprovingReviewCount) {
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
    }

    public WebhooksRule requiredConversationResolutionLevel(
            RequiredConversationResolutionLevelEnum requiredConversationResolutionLevel) {
        this.requiredConversationResolutionLevel = requiredConversationResolutionLevel;
        return this;
    }

    /**
     * Get requiredConversationResolutionLevel
     * @return requiredConversationResolutionLevel
     */
    @NotNull
    @Schema(name = "required_conversation_resolution_level", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("required_conversation_resolution_level")
    public RequiredConversationResolutionLevelEnum getRequiredConversationResolutionLevel() {
        return requiredConversationResolutionLevel;
    }

    public void setRequiredConversationResolutionLevel(
            RequiredConversationResolutionLevelEnum requiredConversationResolutionLevel) {
        this.requiredConversationResolutionLevel = requiredConversationResolutionLevel;
    }

    public WebhooksRule requiredDeploymentsEnforcementLevel(
            RequiredDeploymentsEnforcementLevelEnum requiredDeploymentsEnforcementLevel) {
        this.requiredDeploymentsEnforcementLevel = requiredDeploymentsEnforcementLevel;
        return this;
    }

    /**
     * Get requiredDeploymentsEnforcementLevel
     * @return requiredDeploymentsEnforcementLevel
     */
    @NotNull
    @Schema(name = "required_deployments_enforcement_level", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("required_deployments_enforcement_level")
    public RequiredDeploymentsEnforcementLevelEnum getRequiredDeploymentsEnforcementLevel() {
        return requiredDeploymentsEnforcementLevel;
    }

    public void setRequiredDeploymentsEnforcementLevel(
            RequiredDeploymentsEnforcementLevelEnum requiredDeploymentsEnforcementLevel) {
        this.requiredDeploymentsEnforcementLevel = requiredDeploymentsEnforcementLevel;
    }

    public WebhooksRule requiredStatusChecks(List<String> requiredStatusChecks) {
        this.requiredStatusChecks = requiredStatusChecks;
        return this;
    }

    public WebhooksRule addRequiredStatusChecksItem(String requiredStatusChecksItem) {
        if (this.requiredStatusChecks == null) {
            this.requiredStatusChecks = new ArrayList<>();
        }
        this.requiredStatusChecks.add(requiredStatusChecksItem);
        return this;
    }

    /**
     * Get requiredStatusChecks
     * @return requiredStatusChecks
     */
    @NotNull
    @Schema(name = "required_status_checks", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("required_status_checks")
    public List<String> getRequiredStatusChecks() {
        return requiredStatusChecks;
    }

    public void setRequiredStatusChecks(List<String> requiredStatusChecks) {
        this.requiredStatusChecks = requiredStatusChecks;
    }

    public WebhooksRule requiredStatusChecksEnforcementLevel(
            RequiredStatusChecksEnforcementLevelEnum requiredStatusChecksEnforcementLevel) {
        this.requiredStatusChecksEnforcementLevel = requiredStatusChecksEnforcementLevel;
        return this;
    }

    /**
     * Get requiredStatusChecksEnforcementLevel
     * @return requiredStatusChecksEnforcementLevel
     */
    @NotNull
    @Schema(name = "required_status_checks_enforcement_level", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("required_status_checks_enforcement_level")
    public RequiredStatusChecksEnforcementLevelEnum getRequiredStatusChecksEnforcementLevel() {
        return requiredStatusChecksEnforcementLevel;
    }

    public void setRequiredStatusChecksEnforcementLevel(
            RequiredStatusChecksEnforcementLevelEnum requiredStatusChecksEnforcementLevel) {
        this.requiredStatusChecksEnforcementLevel = requiredStatusChecksEnforcementLevel;
    }

    public WebhooksRule signatureRequirementEnforcementLevel(
            SignatureRequirementEnforcementLevelEnum signatureRequirementEnforcementLevel) {
        this.signatureRequirementEnforcementLevel = signatureRequirementEnforcementLevel;
        return this;
    }

    /**
     * Get signatureRequirementEnforcementLevel
     * @return signatureRequirementEnforcementLevel
     */
    @NotNull
    @Schema(name = "signature_requirement_enforcement_level", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("signature_requirement_enforcement_level")
    public SignatureRequirementEnforcementLevelEnum getSignatureRequirementEnforcementLevel() {
        return signatureRequirementEnforcementLevel;
    }

    public void setSignatureRequirementEnforcementLevel(
            SignatureRequirementEnforcementLevelEnum signatureRequirementEnforcementLevel) {
        this.signatureRequirementEnforcementLevel = signatureRequirementEnforcementLevel;
    }

    public WebhooksRule strictRequiredStatusChecksPolicy(Boolean strictRequiredStatusChecksPolicy) {
        this.strictRequiredStatusChecksPolicy = strictRequiredStatusChecksPolicy;
        return this;
    }

    /**
     * Get strictRequiredStatusChecksPolicy
     * @return strictRequiredStatusChecksPolicy
     */
    @NotNull
    @Schema(name = "strict_required_status_checks_policy", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("strict_required_status_checks_policy")
    public Boolean getStrictRequiredStatusChecksPolicy() {
        return strictRequiredStatusChecksPolicy;
    }

    public void setStrictRequiredStatusChecksPolicy(Boolean strictRequiredStatusChecksPolicy) {
        this.strictRequiredStatusChecksPolicy = strictRequiredStatusChecksPolicy;
    }

    public WebhooksRule updatedAt(OffsetDateTime updatedAt) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhooksRule webhooksRule = (WebhooksRule) o;
        return Objects.equals(this.adminEnforced, webhooksRule.adminEnforced)
                && Objects.equals(this.allowDeletionsEnforcementLevel, webhooksRule.allowDeletionsEnforcementLevel)
                && Objects.equals(this.allowForcePushesEnforcementLevel, webhooksRule.allowForcePushesEnforcementLevel)
                && Objects.equals(this.authorizedActorNames, webhooksRule.authorizedActorNames)
                && Objects.equals(this.authorizedActorsOnly, webhooksRule.authorizedActorsOnly)
                && Objects.equals(this.authorizedDismissalActorsOnly, webhooksRule.authorizedDismissalActorsOnly)
                && Objects.equals(this.createProtected, webhooksRule.createProtected)
                && Objects.equals(this.createdAt, webhooksRule.createdAt)
                && Objects.equals(this.dismissStaleReviewsOnPush, webhooksRule.dismissStaleReviewsOnPush)
                && Objects.equals(this.id, webhooksRule.id)
                && Objects.equals(this.ignoreApprovalsFromContributors, webhooksRule.ignoreApprovalsFromContributors)
                && Objects.equals(
                        this.linearHistoryRequirementEnforcementLevel,
                        webhooksRule.linearHistoryRequirementEnforcementLevel)
                && Objects.equals(this.lockBranchEnforcementLevel, webhooksRule.lockBranchEnforcementLevel)
                && Objects.equals(this.lockAllowsForkSync, webhooksRule.lockAllowsForkSync)
                && Objects.equals(this.mergeQueueEnforcementLevel, webhooksRule.mergeQueueEnforcementLevel)
                && Objects.equals(this.name, webhooksRule.name)
                && Objects.equals(
                        this.pullRequestReviewsEnforcementLevel, webhooksRule.pullRequestReviewsEnforcementLevel)
                && Objects.equals(this.repositoryId, webhooksRule.repositoryId)
                && Objects.equals(this.requireCodeOwnerReview, webhooksRule.requireCodeOwnerReview)
                && Objects.equals(this.requireLastPushApproval, webhooksRule.requireLastPushApproval)
                && Objects.equals(this.requiredApprovingReviewCount, webhooksRule.requiredApprovingReviewCount)
                && Objects.equals(
                        this.requiredConversationResolutionLevel, webhooksRule.requiredConversationResolutionLevel)
                && Objects.equals(
                        this.requiredDeploymentsEnforcementLevel, webhooksRule.requiredDeploymentsEnforcementLevel)
                && Objects.equals(this.requiredStatusChecks, webhooksRule.requiredStatusChecks)
                && Objects.equals(
                        this.requiredStatusChecksEnforcementLevel, webhooksRule.requiredStatusChecksEnforcementLevel)
                && Objects.equals(
                        this.signatureRequirementEnforcementLevel, webhooksRule.signatureRequirementEnforcementLevel)
                && Objects.equals(this.strictRequiredStatusChecksPolicy, webhooksRule.strictRequiredStatusChecksPolicy)
                && Objects.equals(this.updatedAt, webhooksRule.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                adminEnforced,
                allowDeletionsEnforcementLevel,
                allowForcePushesEnforcementLevel,
                authorizedActorNames,
                authorizedActorsOnly,
                authorizedDismissalActorsOnly,
                createProtected,
                createdAt,
                dismissStaleReviewsOnPush,
                id,
                ignoreApprovalsFromContributors,
                linearHistoryRequirementEnforcementLevel,
                lockBranchEnforcementLevel,
                lockAllowsForkSync,
                mergeQueueEnforcementLevel,
                name,
                pullRequestReviewsEnforcementLevel,
                repositoryId,
                requireCodeOwnerReview,
                requireLastPushApproval,
                requiredApprovingReviewCount,
                requiredConversationResolutionLevel,
                requiredDeploymentsEnforcementLevel,
                requiredStatusChecks,
                requiredStatusChecksEnforcementLevel,
                signatureRequirementEnforcementLevel,
                strictRequiredStatusChecksPolicy,
                updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksRule {\n");
        sb.append("    adminEnforced: ").append(toIndentedString(adminEnforced)).append("\n");
        sb.append("    allowDeletionsEnforcementLevel: ")
                .append(toIndentedString(allowDeletionsEnforcementLevel))
                .append("\n");
        sb.append("    allowForcePushesEnforcementLevel: ")
                .append(toIndentedString(allowForcePushesEnforcementLevel))
                .append("\n");
        sb.append("    authorizedActorNames: ")
                .append(toIndentedString(authorizedActorNames))
                .append("\n");
        sb.append("    authorizedActorsOnly: ")
                .append(toIndentedString(authorizedActorsOnly))
                .append("\n");
        sb.append("    authorizedDismissalActorsOnly: ")
                .append(toIndentedString(authorizedDismissalActorsOnly))
                .append("\n");
        sb.append("    createProtected: ")
                .append(toIndentedString(createProtected))
                .append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    dismissStaleReviewsOnPush: ")
                .append(toIndentedString(dismissStaleReviewsOnPush))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ignoreApprovalsFromContributors: ")
                .append(toIndentedString(ignoreApprovalsFromContributors))
                .append("\n");
        sb.append("    linearHistoryRequirementEnforcementLevel: ")
                .append(toIndentedString(linearHistoryRequirementEnforcementLevel))
                .append("\n");
        sb.append("    lockBranchEnforcementLevel: ")
                .append(toIndentedString(lockBranchEnforcementLevel))
                .append("\n");
        sb.append("    lockAllowsForkSync: ")
                .append(toIndentedString(lockAllowsForkSync))
                .append("\n");
        sb.append("    mergeQueueEnforcementLevel: ")
                .append(toIndentedString(mergeQueueEnforcementLevel))
                .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    pullRequestReviewsEnforcementLevel: ")
                .append(toIndentedString(pullRequestReviewsEnforcementLevel))
                .append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    requireCodeOwnerReview: ")
                .append(toIndentedString(requireCodeOwnerReview))
                .append("\n");
        sb.append("    requireLastPushApproval: ")
                .append(toIndentedString(requireLastPushApproval))
                .append("\n");
        sb.append("    requiredApprovingReviewCount: ")
                .append(toIndentedString(requiredApprovingReviewCount))
                .append("\n");
        sb.append("    requiredConversationResolutionLevel: ")
                .append(toIndentedString(requiredConversationResolutionLevel))
                .append("\n");
        sb.append("    requiredDeploymentsEnforcementLevel: ")
                .append(toIndentedString(requiredDeploymentsEnforcementLevel))
                .append("\n");
        sb.append("    requiredStatusChecks: ")
                .append(toIndentedString(requiredStatusChecks))
                .append("\n");
        sb.append("    requiredStatusChecksEnforcementLevel: ")
                .append(toIndentedString(requiredStatusChecksEnforcementLevel))
                .append("\n");
        sb.append("    signatureRequirementEnforcementLevel: ")
                .append(toIndentedString(signatureRequirementEnforcementLevel))
                .append("\n");
        sb.append("    strictRequiredStatusChecksPolicy: ")
                .append(toIndentedString(strictRequiredStatusChecksPolicy))
                .append("\n");
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
