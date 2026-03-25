package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A Discussion in a repository.
 */
@Schema(name = "discussion", description = "A Discussion in a repository.")
@JsonTypeName("discussion")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Discussion {

    private String activeLockReason = null;

    private String answerChosenAt = null;

    private User answerChosenBy = null;

    private String answerHtmlUrl = null;

    /**
     * How the author is associated with the repository.
     */
    public enum AuthorAssociationEnum {
        COLLABORATOR("COLLABORATOR"),

        CONTRIBUTOR("CONTRIBUTOR"),

        FIRST_TIMER("FIRST_TIMER"),

        FIRST_TIME_CONTRIBUTOR("FIRST_TIME_CONTRIBUTOR"),

        MANNEQUIN("MANNEQUIN"),

        MEMBER("MEMBER"),

        NONE("NONE"),

        OWNER("OWNER");

        private final String value;

        AuthorAssociationEnum(String value) {
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
        public static AuthorAssociationEnum fromValue(String value) {
            for (AuthorAssociationEnum b : AuthorAssociationEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private AuthorAssociationEnum authorAssociation;

    private String body;

    private DiscussionCategory category;

    private Long comments;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private String htmlUrl;

    private Long id;

    private Boolean locked;

    private String nodeId;

    private Long number;

    private Reactions reactions;

    private String repositoryUrl;

    /**
     * The current state of the discussion. `converting` means that the discussion is being converted from an issue. `transferring` means that the discussion is being transferred from another repository.
     */
    public enum StateEnum {
        OPEN("open"),

        CLOSED("closed"),

        LOCKED("locked"),

        CONVERTING("converting"),

        TRANSFERRING("transferring");

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

    /**
     * The reason for the current state
     */
    public enum StateReasonEnum {
        RESOLVED("resolved"),

        OUTDATED("outdated"),

        DUPLICATE("duplicate"),

        REOPENED("reopened");

        private final String value;

        StateReasonEnum(String value) {
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
        public static StateReasonEnum fromValue(String value) {
            for (StateReasonEnum b : StateReasonEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }

    private StateReasonEnum stateReason = null;

    private String timelineUrl;

    private String title;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private User1 user = null;

    @Valid
    private List<@Valid Label> labels = new ArrayList<>();

    public Discussion() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Discussion(
            String activeLockReason,
            String answerChosenAt,
            User answerChosenBy,
            String answerHtmlUrl,
            String body,
            DiscussionCategory category,
            Long comments,
            OffsetDateTime createdAt,
            String htmlUrl,
            Long id,
            Boolean locked,
            String nodeId,
            Long number,
            String repositoryUrl,
            StateEnum state,
            StateReasonEnum stateReason,
            String title,
            OffsetDateTime updatedAt,
            User1 user) {
        this.activeLockReason = activeLockReason;
        this.answerChosenAt = answerChosenAt;
        this.answerChosenBy = answerChosenBy;
        this.answerHtmlUrl = answerHtmlUrl;
        this.body = body;
        this.category = category;
        this.comments = comments;
        this.createdAt = createdAt;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.locked = locked;
        this.nodeId = nodeId;
        this.number = number;
        this.repositoryUrl = repositoryUrl;
        this.state = state;
        this.stateReason = stateReason;
        this.title = title;
        this.updatedAt = updatedAt;
        this.user = user;
    }

    public Discussion activeLockReason(String activeLockReason) {
        this.activeLockReason = activeLockReason;
        return this;
    }

    /**
     * Get activeLockReason
     * @return activeLockReason
     */
    @NotNull
    @Schema(name = "active_lock_reason", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("active_lock_reason")
    public String getActiveLockReason() {
        return activeLockReason;
    }

    public void setActiveLockReason(String activeLockReason) {
        this.activeLockReason = activeLockReason;
    }

    public Discussion answerChosenAt(String answerChosenAt) {
        this.answerChosenAt = answerChosenAt;
        return this;
    }

    /**
     * Get answerChosenAt
     * @return answerChosenAt
     */
    @NotNull
    @Schema(name = "answer_chosen_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("answer_chosen_at")
    public String getAnswerChosenAt() {
        return answerChosenAt;
    }

    public void setAnswerChosenAt(String answerChosenAt) {
        this.answerChosenAt = answerChosenAt;
    }

    public Discussion answerChosenBy(User answerChosenBy) {
        this.answerChosenBy = answerChosenBy;
        return this;
    }

    /**
     * Get answerChosenBy
     * @return answerChosenBy
     */
    @NotNull
    @Valid
    @Schema(name = "answer_chosen_by", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("answer_chosen_by")
    public User getAnswerChosenBy() {
        return answerChosenBy;
    }

    public void setAnswerChosenBy(User answerChosenBy) {
        this.answerChosenBy = answerChosenBy;
    }

    public Discussion answerHtmlUrl(String answerHtmlUrl) {
        this.answerHtmlUrl = answerHtmlUrl;
        return this;
    }

    /**
     * Get answerHtmlUrl
     * @return answerHtmlUrl
     */
    @NotNull
    @Schema(name = "answer_html_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("answer_html_url")
    public String getAnswerHtmlUrl() {
        return answerHtmlUrl;
    }

    public void setAnswerHtmlUrl(String answerHtmlUrl) {
        this.answerHtmlUrl = answerHtmlUrl;
    }

    public Discussion authorAssociation(AuthorAssociationEnum authorAssociation) {
        this.authorAssociation = authorAssociation;
        return this;
    }

    /**
     * How the author is associated with the repository.
     * @return authorAssociation
     */
    @Schema(
            name = "author_association",
            description = "How the author is associated with the repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("author_association")
    public AuthorAssociationEnum getAuthorAssociation() {
        return authorAssociation;
    }

    public void setAuthorAssociation(AuthorAssociationEnum authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    public Discussion body(String body) {
        this.body = body;
        return this;
    }

    /**
     * Get body
     * @return body
     */
    @NotNull
    @Schema(name = "body", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Discussion category(DiscussionCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Get category
     * @return category
     */
    @NotNull
    @Valid
    @Schema(name = "category", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("category")
    public DiscussionCategory getCategory() {
        return category;
    }

    public void setCategory(DiscussionCategory category) {
        this.category = category;
    }

    public Discussion comments(Long comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Get comments
     * @return comments
     */
    @NotNull
    @Schema(name = "comments", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("comments")
    public Long getComments() {
        return comments;
    }

    public void setComments(Long comments) {
        this.comments = comments;
    }

    public Discussion createdAt(OffsetDateTime createdAt) {
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

    public Discussion htmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public Discussion id(Long id) {
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

    public Discussion locked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    /**
     * Get locked
     * @return locked
     */
    @NotNull
    @Schema(name = "locked", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("locked")
    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Discussion nodeId(String nodeId) {
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

    public Discussion number(Long number) {
        this.number = number;
        return this;
    }

    /**
     * Get number
     * @return number
     */
    @NotNull
    @Schema(name = "number", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Discussion reactions(Reactions reactions) {
        this.reactions = reactions;
        return this;
    }

    /**
     * Get reactions
     * @return reactions
     */
    @Valid
    @Schema(name = "reactions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reactions")
    public Reactions getReactions() {
        return reactions;
    }

    public void setReactions(Reactions reactions) {
        this.reactions = reactions;
    }

    public Discussion repositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
    }

    /**
     * Get repositoryUrl
     * @return repositoryUrl
     */
    @NotNull
    @Schema(name = "repository_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_url")
    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public Discussion state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * The current state of the discussion. `converting` means that the discussion is being converted from an issue. `transferring` means that the discussion is being transferred from another repository.
     * @return state
     */
    @NotNull
    @Schema(
            name = "state",
            description =
                    "The current state of the discussion. `converting` means that the discussion is being converted from an issue. `transferring` means that the discussion is being transferred from another repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public Discussion stateReason(StateReasonEnum stateReason) {
        this.stateReason = stateReason;
        return this;
    }

    /**
     * The reason for the current state
     * @return stateReason
     */
    @NotNull
    @Schema(
            name = "state_reason",
            example = "resolved",
            description = "The reason for the current state",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state_reason")
    public StateReasonEnum getStateReason() {
        return stateReason;
    }

    public void setStateReason(StateReasonEnum stateReason) {
        this.stateReason = stateReason;
    }

    public Discussion timelineUrl(String timelineUrl) {
        this.timelineUrl = timelineUrl;
        return this;
    }

    /**
     * Get timelineUrl
     * @return timelineUrl
     */
    @Schema(name = "timeline_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("timeline_url")
    public String getTimelineUrl() {
        return timelineUrl;
    }

    public void setTimelineUrl(String timelineUrl) {
        this.timelineUrl = timelineUrl;
    }

    public Discussion title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     * @return title
     */
    @NotNull
    @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Discussion updatedAt(OffsetDateTime updatedAt) {
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

    public Discussion user(User1 user) {
        this.user = user;
        return this;
    }

    /**
     * Get user
     * @return user
     */
    @NotNull
    @Valid
    @Schema(name = "user", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("user")
    public User1 getUser() {
        return user;
    }

    public void setUser(User1 user) {
        this.user = user;
    }

    public Discussion labels(List<@Valid Label> labels) {
        this.labels = labels;
        return this;
    }

    public Discussion addLabelsItem(Label labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * Get labels
     * @return labels
     */
    @Valid
    @Schema(name = "labels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("labels")
    public List<@Valid Label> getLabels() {
        return labels;
    }

    public void setLabels(List<@Valid Label> labels) {
        this.labels = labels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Discussion discussion = (Discussion) o;
        return Objects.equals(this.activeLockReason, discussion.activeLockReason)
                && Objects.equals(this.answerChosenAt, discussion.answerChosenAt)
                && Objects.equals(this.answerChosenBy, discussion.answerChosenBy)
                && Objects.equals(this.answerHtmlUrl, discussion.answerHtmlUrl)
                && Objects.equals(this.authorAssociation, discussion.authorAssociation)
                && Objects.equals(this.body, discussion.body)
                && Objects.equals(this.category, discussion.category)
                && Objects.equals(this.comments, discussion.comments)
                && Objects.equals(this.createdAt, discussion.createdAt)
                && Objects.equals(this.htmlUrl, discussion.htmlUrl)
                && Objects.equals(this.id, discussion.id)
                && Objects.equals(this.locked, discussion.locked)
                && Objects.equals(this.nodeId, discussion.nodeId)
                && Objects.equals(this.number, discussion.number)
                && Objects.equals(this.reactions, discussion.reactions)
                && Objects.equals(this.repositoryUrl, discussion.repositoryUrl)
                && Objects.equals(this.state, discussion.state)
                && Objects.equals(this.stateReason, discussion.stateReason)
                && Objects.equals(this.timelineUrl, discussion.timelineUrl)
                && Objects.equals(this.title, discussion.title)
                && Objects.equals(this.updatedAt, discussion.updatedAt)
                && Objects.equals(this.user, discussion.user)
                && Objects.equals(this.labels, discussion.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                activeLockReason,
                answerChosenAt,
                answerChosenBy,
                answerHtmlUrl,
                authorAssociation,
                body,
                category,
                comments,
                createdAt,
                htmlUrl,
                id,
                locked,
                nodeId,
                number,
                reactions,
                repositoryUrl,
                state,
                stateReason,
                timelineUrl,
                title,
                updatedAt,
                user,
                labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Discussion {\n");
        sb.append("    activeLockReason: ")
                .append(toIndentedString(activeLockReason))
                .append("\n");
        sb.append("    answerChosenAt: ")
                .append(toIndentedString(answerChosenAt))
                .append("\n");
        sb.append("    answerChosenBy: ")
                .append(toIndentedString(answerChosenBy))
                .append("\n");
        sb.append("    answerHtmlUrl: ").append(toIndentedString(answerHtmlUrl)).append("\n");
        sb.append("    authorAssociation: ")
                .append(toIndentedString(authorAssociation))
                .append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
        sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stateReason: ").append(toIndentedString(stateReason)).append("\n");
        sb.append("    timelineUrl: ").append(toIndentedString(timelineUrl)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
