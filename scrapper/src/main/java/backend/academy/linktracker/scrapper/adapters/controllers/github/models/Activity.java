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
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Activity
 */
@Schema(name = "activity", description = "Activity")
@JsonTypeName("activity")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Activity {

    private Long id;

    private String nodeId;

    private String before;

    private String after;

    private String ref;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime timestamp;

    /**
     * The type of the activity that was performed.
     */
    public enum ActivityTypeEnum {
        PUSH("push"),

        FORCE_PUSH("force_push"),

        BRANCH_DELETION("branch_deletion"),

        BRANCH_CREATION("branch_creation"),

        PR_MERGE("pr_merge"),

        MERGE_QUEUE_MERGE("merge_queue_merge");

        private final String value;

        ActivityTypeEnum(String value) {
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
        public static ActivityTypeEnum fromValue(String value) {
            for (ActivityTypeEnum b : ActivityTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ActivityTypeEnum activityType;

    private JsonNullable<NullableSimpleUser> actor = JsonNullable.<NullableSimpleUser>undefined();

    public Activity() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Activity(
            Long id,
            String nodeId,
            String before,
            String after,
            String ref,
            OffsetDateTime timestamp,
            ActivityTypeEnum activityType,
            NullableSimpleUser actor) {
        this.id = id;
        this.nodeId = nodeId;
        this.before = before;
        this.after = after;
        this.ref = ref;
        this.timestamp = timestamp;
        this.activityType = activityType;
        this.actor = JsonNullable.of(actor);
    }

    public Activity id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", example = "1296269", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Activity nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", example = "MDEwOlJlcG9zaXRvcnkxMjk2MjY5", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Activity before(String before) {
        this.before = before;
        return this;
    }

    /**
     * The SHA of the commit before the activity.
     * @return before
     */
    @NotNull
    @Schema(
            name = "before",
            example = "6dcb09b5b57875f334f61aebed695e2e4193db5e",
            description = "The SHA of the commit before the activity.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("before")
    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public Activity after(String after) {
        this.after = after;
        return this;
    }

    /**
     * The SHA of the commit after the activity.
     * @return after
     */
    @NotNull
    @Schema(
            name = "after",
            example = "827efc6d56897b048c772eb4087f854f46256132",
            description = "The SHA of the commit after the activity.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("after")
    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public Activity ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * The full Git reference, formatted as `refs/heads/<branch name>`.
     * @return ref
     */
    @NotNull
    @Schema(
            name = "ref",
            example = "refs/heads/main",
            description = "The full Git reference, formatted as `refs/heads/<branch name>`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Activity timestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * The time when the activity occurred.
     * @return timestamp
     */
    @NotNull
    @Valid
    @Schema(
            name = "timestamp",
            example = "2011-01-26T19:06:43Z",
            description = "The time when the activity occurred.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("timestamp")
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Activity activityType(ActivityTypeEnum activityType) {
        this.activityType = activityType;
        return this;
    }

    /**
     * The type of the activity that was performed.
     * @return activityType
     */
    @NotNull
    @Schema(
            name = "activity_type",
            example = "force_push",
            description = "The type of the activity that was performed.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("activity_type")
    public ActivityTypeEnum getActivityType() {
        return activityType;
    }

    public void setActivityType(ActivityTypeEnum activityType) {
        this.activityType = activityType;
    }

    public Activity actor(NullableSimpleUser actor) {
        this.actor = JsonNullable.of(actor);
        return this;
    }

    /**
     * Get actor
     * @return actor
     */
    @NotNull
    @Valid
    @Schema(name = "actor", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("actor")
    public JsonNullable<NullableSimpleUser> getActor() {
        return actor;
    }

    public void setActor(JsonNullable<NullableSimpleUser> actor) {
        this.actor = actor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Activity activity = (Activity) o;
        return Objects.equals(this.id, activity.id)
                && Objects.equals(this.nodeId, activity.nodeId)
                && Objects.equals(this.before, activity.before)
                && Objects.equals(this.after, activity.after)
                && Objects.equals(this.ref, activity.ref)
                && Objects.equals(this.timestamp, activity.timestamp)
                && Objects.equals(this.activityType, activity.activityType)
                && Objects.equals(this.actor, activity.actor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nodeId, before, after, ref, timestamp, activityType, actor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Activity {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    before: ").append(toIndentedString(before)).append("\n");
        sb.append("    after: ").append(toIndentedString(after)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
        sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
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
