package backend.academy.linktracker.scrapper.adapters.controllers.stackoverflow.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Represents a question on a Stack Exchange site.
 */
@Schema(name = "Question", description = "Represents a question on a Stack Exchange site.")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-24T12:15:15.683209678Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Question implements ApiResponseItemsInner {

    private Long acceptedAnswerId = null;

    private Long answerCount;

    @Valid
    private List<@Valid Answer> answers = new ArrayList<>();

    private String body;

    private String bodyMarkdown;

    private Long bountyAmount = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime bountyClosesDate = null;

    private ShallowUser bountyUser;

    private Boolean canAnswer;

    private Boolean canClose;

    private Boolean canComment;

    private Boolean canEdit;

    private Boolean canFlag;

    private Boolean canSuggestEdit;

    private Long closeVoteCount;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime closedDate = null;

    private Object closedDetails;

    private String closedReason = null;

    @Valid
    private List<@Valid Collective> collectives = new ArrayList<>();

    private Long commentCount;

    @Valid
    private List<@Valid Comment> comments = new ArrayList<>();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime communityOwnedDate = null;

    private String contentLicense;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime creationDate;

    private Long deleteVoteCount;

    private Long downVoteCount;

    private Boolean downvoted;

    private Long favoriteCount;

    private Boolean favorited;

    private Boolean isAnswered;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime lastActivityDate;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime lastEditDate = null;

    private ShallowUser lastEditor;

    private URI link;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime lockedDate = null;

    private MigrationInfo migratedFrom;

    private MigrationInfo migratedTo;

    private Notice notice;

    private ShallowUser owner;

    @Valid
    private List<@Valid Collective> postedByCollectives = new ArrayList<>();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime protectedDate = null;

    private Long questionId;

    private Long reopenVoteCount;

    private Long score;

    private URI shareLink;

    @Valid
    private List<String> tags = new ArrayList<>();

    private String title;

    private Long upVoteCount;

    private Boolean upvoted;

    private Long viewCount;

    public Question() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Question(OffsetDateTime creationDate, URI link, Long questionId, String title) {
        this.creationDate = creationDate;
        this.link = link;
        this.questionId = questionId;
        this.title = title;
    }

    public Question acceptedAnswerId(Long acceptedAnswerId) {
        this.acceptedAnswerId = acceptedAnswerId;
        return this;
    }

    /**
     * The ID of the accepted answer, if any.
     * @return acceptedAnswerId
     */
    @Schema(
            name = "accepted_answer_id",
            description = "The ID of the accepted answer, if any.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("accepted_answer_id")
    public Long getAcceptedAnswerId() {
        return acceptedAnswerId;
    }

    public void setAcceptedAnswerId(Long acceptedAnswerId) {
        this.acceptedAnswerId = acceptedAnswerId;
    }

    public Question answerCount(Long answerCount) {
        this.answerCount = answerCount;
        return this;
    }

    /**
     * The total number of answers for this question.
     * @return answerCount
     */
    @Schema(
            name = "answer_count",
            description = "The total number of answers for this question.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("answer_count")
    public Long getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(Long answerCount) {
        this.answerCount = answerCount;
    }

    public Question answers(List<@Valid Answer> answers) {
        this.answers = answers;
        return this;
    }

    public Question addAnswersItem(Answer answersItem) {
        if (this.answers == null) {
            this.answers = new ArrayList<>();
        }
        this.answers.add(answersItem);
        return this;
    }

    /**
     * A list of answers for this question. Requires including 'answers' in the filter.
     * @return answers
     */
    @Valid
    @Schema(
            name = "answers",
            description = "A list of answers for this question. Requires including 'answers' in the filter.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("answers")
    public List<@Valid Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<@Valid Answer> answers) {
        this.answers = answers;
    }

    public Question body(String body) {
        this.body = body;
        return this;
    }

    /**
     * The main body of the question in HTML format.
     * @return body
     */
    @Schema(
            name = "body",
            description = "The main body of the question in HTML format.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Question bodyMarkdown(String bodyMarkdown) {
        this.bodyMarkdown = bodyMarkdown;
        return this;
    }

    /**
     * The main body of the question in Markdown format.
     * @return bodyMarkdown
     */
    @Schema(
            name = "body_markdown",
            description = "The main body of the question in Markdown format.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body_markdown")
    public String getBodyMarkdown() {
        return bodyMarkdown;
    }

    public void setBodyMarkdown(String bodyMarkdown) {
        this.bodyMarkdown = bodyMarkdown;
    }

    public Question bountyAmount(Long bountyAmount) {
        this.bountyAmount = bountyAmount;
        return this;
    }

    /**
     * The amount of bounty on this question, if any.
     * @return bountyAmount
     */
    @Schema(
            name = "bounty_amount",
            description = "The amount of bounty on this question, if any.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("bounty_amount")
    public Long getBountyAmount() {
        return bountyAmount;
    }

    public void setBountyAmount(Long bountyAmount) {
        this.bountyAmount = bountyAmount;
    }

    public Question bountyClosesDate(OffsetDateTime bountyClosesDate) {
        this.bountyClosesDate = bountyClosesDate;
        return this;
    }

    /**
     * The date when the bounty closes, if applicable.
     * @return bountyClosesDate
     */
    @Valid
    @Schema(
            name = "bounty_closes_date",
            description = "The date when the bounty closes, if applicable.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("bounty_closes_date")
    public OffsetDateTime getBountyClosesDate() {
        return bountyClosesDate;
    }

    public void setBountyClosesDate(OffsetDateTime bountyClosesDate) {
        this.bountyClosesDate = bountyClosesDate;
    }

    public Question bountyUser(ShallowUser bountyUser) {
        this.bountyUser = bountyUser;
        return this;
    }

    /**
     * Get bountyUser
     * @return bountyUser
     */
    @Valid
    @Schema(name = "bounty_user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("bounty_user")
    public ShallowUser getBountyUser() {
        return bountyUser;
    }

    public void setBountyUser(ShallowUser bountyUser) {
        this.bountyUser = bountyUser;
    }

    public Question canAnswer(Boolean canAnswer) {
        this.canAnswer = canAnswer;
        return this;
    }

    /**
     * True if the authenticated user can answer this question.
     * @return canAnswer
     */
    @Schema(
            name = "can_answer",
            description = "True if the authenticated user can answer this question.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("can_answer")
    public Boolean getCanAnswer() {
        return canAnswer;
    }

    public void setCanAnswer(Boolean canAnswer) {
        this.canAnswer = canAnswer;
    }

    public Question canClose(Boolean canClose) {
        this.canClose = canClose;
        return this;
    }

    /**
     * True if the authenticated user can close this question.
     * @return canClose
     */
    @Schema(
            name = "can_close",
            description = "True if the authenticated user can close this question.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("can_close")
    public Boolean getCanClose() {
        return canClose;
    }

    public void setCanClose(Boolean canClose) {
        this.canClose = canClose;
    }

    public Question canComment(Boolean canComment) {
        this.canComment = canComment;
        return this;
    }

    /**
     * True if the authenticated user can comment on this question.
     * @return canComment
     */
    @Schema(
            name = "can_comment",
            description = "True if the authenticated user can comment on this question.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("can_comment")
    public Boolean getCanComment() {
        return canComment;
    }

    public void setCanComment(Boolean canComment) {
        this.canComment = canComment;
    }

    public Question canEdit(Boolean canEdit) {
        this.canEdit = canEdit;
        return this;
    }

    /**
     * True if the authenticated user can edit this question.
     * @return canEdit
     */
    @Schema(
            name = "can_edit",
            description = "True if the authenticated user can edit this question.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("can_edit")
    public Boolean getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
    }

    public Question canFlag(Boolean canFlag) {
        this.canFlag = canFlag;
        return this;
    }

    /**
     * True if the authenticated user can flag this question.
     * @return canFlag
     */
    @Schema(
            name = "can_flag",
            description = "True if the authenticated user can flag this question.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("can_flag")
    public Boolean getCanFlag() {
        return canFlag;
    }

    public void setCanFlag(Boolean canFlag) {
        this.canFlag = canFlag;
    }

    public Question canSuggestEdit(Boolean canSuggestEdit) {
        this.canSuggestEdit = canSuggestEdit;
        return this;
    }

    /**
     * True if the authenticated user can suggest an edit for this question.
     * @return canSuggestEdit
     */
    @Schema(
            name = "can_suggest_edit",
            description = "True if the authenticated user can suggest an edit for this question.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("can_suggest_edit")
    public Boolean getCanSuggestEdit() {
        return canSuggestEdit;
    }

    public void setCanSuggestEdit(Boolean canSuggestEdit) {
        this.canSuggestEdit = canSuggestEdit;
    }

    public Question closeVoteCount(Long closeVoteCount) {
        this.closeVoteCount = closeVoteCount;
        return this;
    }

    /**
     * The number of close votes on this question.
     * @return closeVoteCount
     */
    @Schema(
            name = "close_vote_count",
            description = "The number of close votes on this question.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("close_vote_count")
    public Long getCloseVoteCount() {
        return closeVoteCount;
    }

    public void setCloseVoteCount(Long closeVoteCount) {
        this.closeVoteCount = closeVoteCount;
    }

    public Question closedDate(OffsetDateTime closedDate) {
        this.closedDate = closedDate;
        return this;
    }

    /**
     * The date when this question was closed, if applicable.
     * @return closedDate
     */
    @Valid
    @Schema(
            name = "closed_date",
            description = "The date when this question was closed, if applicable.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("closed_date")
    public OffsetDateTime getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(OffsetDateTime closedDate) {
        this.closedDate = closedDate;
    }

    public Question closedDetails(Object closedDetails) {
        this.closedDetails = closedDetails;
        return this;
    }

    /**
     * Detailed information about why the question was closed.
     * @return closedDetails
     */
    @Schema(
            name = "closed_details",
            description = "Detailed information about why the question was closed.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("closed_details")
    public Object getClosedDetails() {
        return closedDetails;
    }

    public void setClosedDetails(Object closedDetails) {
        this.closedDetails = closedDetails;
    }

    public Question closedReason(String closedReason) {
        this.closedReason = closedReason;
        return this;
    }

    /**
     * The reason this question was closed, if applicable.
     * @return closedReason
     */
    @Schema(
            name = "closed_reason",
            description = "The reason this question was closed, if applicable.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("closed_reason")
    public String getClosedReason() {
        return closedReason;
    }

    public void setClosedReason(String closedReason) {
        this.closedReason = closedReason;
    }

    public Question collectives(List<@Valid Collective> collectives) {
        this.collectives = collectives;
        return this;
    }

    public Question addCollectivesItem(Collective collectivesItem) {
        if (this.collectives == null) {
            this.collectives = new ArrayList<>();
        }
        this.collectives.add(collectivesItem);
        return this;
    }

    /**
     * Collectives this question is associated with.
     * @return collectives
     */
    @Valid
    @Schema(
            name = "collectives",
            description = "Collectives this question is associated with.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("collectives")
    public List<@Valid Collective> getCollectives() {
        return collectives;
    }

    public void setCollectives(List<@Valid Collective> collectives) {
        this.collectives = collectives;
    }

    public Question commentCount(Long commentCount) {
        this.commentCount = commentCount;
        return this;
    }

    /**
     * The total number of comments on this question.
     * @return commentCount
     */
    @Schema(
            name = "comment_count",
            description = "The total number of comments on this question.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("comment_count")
    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    public Question comments(List<@Valid Comment> comments) {
        this.comments = comments;
        return this;
    }

    public Question addCommentsItem(Comment commentsItem) {
        if (this.comments == null) {
            this.comments = new ArrayList<>();
        }
        this.comments.add(commentsItem);
        return this;
    }

    /**
     * A list of comments on this question. Requires including 'comments' in the filter.
     * @return comments
     */
    @Valid
    @Schema(
            name = "comments",
            description = "A list of comments on this question. Requires including 'comments' in the filter.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("comments")
    public List<@Valid Comment> getComments() {
        return comments;
    }

    public void setComments(List<@Valid Comment> comments) {
        this.comments = comments;
    }

    public Question communityOwnedDate(OffsetDateTime communityOwnedDate) {
        this.communityOwnedDate = communityOwnedDate;
        return this;
    }

    /**
     * The date when this question became community owned, if applicable.
     * @return communityOwnedDate
     */
    @Valid
    @Schema(
            name = "community_owned_date",
            description = "The date when this question became community owned, if applicable.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("community_owned_date")
    public OffsetDateTime getCommunityOwnedDate() {
        return communityOwnedDate;
    }

    public void setCommunityOwnedDate(OffsetDateTime communityOwnedDate) {
        this.communityOwnedDate = communityOwnedDate;
    }

    public Question contentLicense(String contentLicense) {
        this.contentLicense = contentLicense;
        return this;
    }

    /**
     * The content license for this question.
     * @return contentLicense
     */
    @Schema(
            name = "content_license",
            example = "CC BY-SA 4.0",
            description = "The content license for this question.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("content_license")
    public String getContentLicense() {
        return contentLicense;
    }

    public void setContentLicense(String contentLicense) {
        this.contentLicense = contentLicense;
    }

    public Question creationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * The date when this question was created.
     * @return creationDate
     */
    @NotNull
    @Valid
    @Schema(
            name = "creation_date",
            example = "2026-03-05T10:09:42Z",
            description = "The date when this question was created.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("creation_date")
    public OffsetDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Question deleteVoteCount(Long deleteVoteCount) {
        this.deleteVoteCount = deleteVoteCount;
        return this;
    }

    /**
     * The number of delete votes on this question.
     * @return deleteVoteCount
     */
    @Schema(
            name = "delete_vote_count",
            description = "The number of delete votes on this question.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("delete_vote_count")
    public Long getDeleteVoteCount() {
        return deleteVoteCount;
    }

    public void setDeleteVoteCount(Long deleteVoteCount) {
        this.deleteVoteCount = deleteVoteCount;
    }

    public Question downVoteCount(Long downVoteCount) {
        this.downVoteCount = downVoteCount;
        return this;
    }

    /**
     * The number of downvotes on this question.
     * @return downVoteCount
     */
    @Schema(
            name = "down_vote_count",
            example = "2",
            description = "The number of downvotes on this question.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("down_vote_count")
    public Long getDownVoteCount() {
        return downVoteCount;
    }

    public void setDownVoteCount(Long downVoteCount) {
        this.downVoteCount = downVoteCount;
    }

    public Question downvoted(Boolean downvoted) {
        this.downvoted = downvoted;
        return this;
    }

    /**
     * True if the authenticated user has downvoted this question. Requires private_info scope.
     * @return downvoted
     */
    @Schema(
            name = "downvoted",
            description = "True if the authenticated user has downvoted this question. Requires private_info scope.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("downvoted")
    public Boolean getDownvoted() {
        return downvoted;
    }

    public void setDownvoted(Boolean downvoted) {
        this.downvoted = downvoted;
    }

    public Question favoriteCount(Long favoriteCount) {
        this.favoriteCount = favoriteCount;
        return this;
    }

    /**
     * The number of times this question has been favorited.
     * @return favoriteCount
     */
    @Schema(
            name = "favorite_count",
            example = "1",
            description = "The number of times this question has been favorited.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("favorite_count")
    public Long getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(Long favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public Question favorited(Boolean favorited) {
        this.favorited = favorited;
        return this;
    }

    /**
     * True if the authenticated user has favorited this question. Requires private_info scope.
     * @return favorited
     */
    @Schema(
            name = "favorited",
            description = "True if the authenticated user has favorited this question. Requires private_info scope.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("favorited")
    public Boolean getFavorited() {
        return favorited;
    }

    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    public Question isAnswered(Boolean isAnswered) {
        this.isAnswered = isAnswered;
        return this;
    }

    /**
     * True if this question has at least one answer.
     * @return isAnswered
     */
    @Schema(
            name = "is_answered",
            example = "false",
            description = "True if this question has at least one answer.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_answered")
    public Boolean getIsAnswered() {
        return isAnswered;
    }

    public void setIsAnswered(Boolean isAnswered) {
        this.isAnswered = isAnswered;
    }

    public Question lastActivityDate(OffsetDateTime lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
        return this;
    }

    /**
     * The date of the last activity on this question.
     * @return lastActivityDate
     */
    @Valid
    @Schema(
            name = "last_activity_date",
            example = "2026-03-07T12:49:42Z",
            description = "The date of the last activity on this question.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("last_activity_date")
    public OffsetDateTime getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(OffsetDateTime lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public Question lastEditDate(OffsetDateTime lastEditDate) {
        this.lastEditDate = lastEditDate;
        return this;
    }

    /**
     * The date of the last edit to this question.
     * @return lastEditDate
     */
    @Valid
    @Schema(
            name = "last_edit_date",
            example = "2026-03-07T19:49:42Z",
            description = "The date of the last edit to this question.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("last_edit_date")
    public OffsetDateTime getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(OffsetDateTime lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    public Question lastEditor(ShallowUser lastEditor) {
        this.lastEditor = lastEditor;
        return this;
    }

    /**
     * Get lastEditor
     * @return lastEditor
     */
    @Valid
    @Schema(name = "last_editor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("last_editor")
    public ShallowUser getLastEditor() {
        return lastEditor;
    }

    public void setLastEditor(ShallowUser lastEditor) {
        this.lastEditor = lastEditor;
    }

    public Question link(URI link) {
        this.link = link;
        return this;
    }

    /**
     * The permanent URL to this question.
     * @return link
     */
    @NotNull
    @Valid
    @Schema(
            name = "link",
            example = "https://example.stackexchange.com/questions/1234/an-example-post-title",
            description = "The permanent URL to this question.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("link")
    public URI getLink() {
        return link;
    }

    public void setLink(URI link) {
        this.link = link;
    }

    public Question lockedDate(OffsetDateTime lockedDate) {
        this.lockedDate = lockedDate;
        return this;
    }

    /**
     * The date when this question was locked, if applicable.
     * @return lockedDate
     */
    @Valid
    @Schema(
            name = "locked_date",
            description = "The date when this question was locked, if applicable.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("locked_date")
    public OffsetDateTime getLockedDate() {
        return lockedDate;
    }

    public void setLockedDate(OffsetDateTime lockedDate) {
        this.lockedDate = lockedDate;
    }

    public Question migratedFrom(MigrationInfo migratedFrom) {
        this.migratedFrom = migratedFrom;
        return this;
    }

    /**
     * Get migratedFrom
     * @return migratedFrom
     */
    @Valid
    @Schema(name = "migrated_from", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("migrated_from")
    public MigrationInfo getMigratedFrom() {
        return migratedFrom;
    }

    public void setMigratedFrom(MigrationInfo migratedFrom) {
        this.migratedFrom = migratedFrom;
    }

    public Question migratedTo(MigrationInfo migratedTo) {
        this.migratedTo = migratedTo;
        return this;
    }

    /**
     * Get migratedTo
     * @return migratedTo
     */
    @Valid
    @Schema(name = "migrated_to", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("migrated_to")
    public MigrationInfo getMigratedTo() {
        return migratedTo;
    }

    public void setMigratedTo(MigrationInfo migratedTo) {
        this.migratedTo = migratedTo;
    }

    public Question notice(Notice notice) {
        this.notice = notice;
        return this;
    }

    /**
     * Get notice
     * @return notice
     */
    @Valid
    @Schema(name = "notice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("notice")
    public Notice getNotice() {
        return notice;
    }

    public void setNotice(Notice notice) {
        this.notice = notice;
    }

    public Question owner(ShallowUser owner) {
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
    public ShallowUser getOwner() {
        return owner;
    }

    public void setOwner(ShallowUser owner) {
        this.owner = owner;
    }

    public Question postedByCollectives(List<@Valid Collective> postedByCollectives) {
        this.postedByCollectives = postedByCollectives;
        return this;
    }

    public Question addPostedByCollectivesItem(Collective postedByCollectivesItem) {
        if (this.postedByCollectives == null) {
            this.postedByCollectives = new ArrayList<>();
        }
        this.postedByCollectives.add(postedByCollectivesItem);
        return this;
    }

    /**
     * Collectives that posted this question.
     * @return postedByCollectives
     */
    @Valid
    @Schema(
            name = "posted_by_collectives",
            description = "Collectives that posted this question.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("posted_by_collectives")
    public List<@Valid Collective> getPostedByCollectives() {
        return postedByCollectives;
    }

    public void setPostedByCollectives(List<@Valid Collective> postedByCollectives) {
        this.postedByCollectives = postedByCollectives;
    }

    public Question protectedDate(OffsetDateTime protectedDate) {
        this.protectedDate = protectedDate;
        return this;
    }

    /**
     * The date when this question was protected, if applicable.
     * @return protectedDate
     */
    @Valid
    @Schema(
            name = "protected_date",
            description = "The date when this question was protected, if applicable.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("protected_date")
    public OffsetDateTime getProtectedDate() {
        return protectedDate;
    }

    public void setProtectedDate(OffsetDateTime protectedDate) {
        this.protectedDate = protectedDate;
    }

    public Question questionId(Long questionId) {
        this.questionId = questionId;
        return this;
    }

    /**
     * The unique identifier for this question.
     * @return questionId
     */
    @NotNull
    @Schema(
            name = "question_id",
            example = "1234",
            description = "The unique identifier for this question.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("question_id")
    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Question reopenVoteCount(Long reopenVoteCount) {
        this.reopenVoteCount = reopenVoteCount;
        return this;
    }

    /**
     * The number of reopen votes on this question.
     * @return reopenVoteCount
     */
    @Schema(
            name = "reopen_vote_count",
            description = "The number of reopen votes on this question.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reopen_vote_count")
    public Long getReopenVoteCount() {
        return reopenVoteCount;
    }

    public void setReopenVoteCount(Long reopenVoteCount) {
        this.reopenVoteCount = reopenVoteCount;
    }

    public Question score(Long score) {
        this.score = score;
        return this;
    }

    /**
     * The current score (upvotes - downvotes) of this question.
     * @return score
     */
    @Schema(
            name = "score",
            example = "1",
            description = "The current score (upvotes - downvotes) of this question.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("score")
    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Question shareLink(URI shareLink) {
        this.shareLink = shareLink;
        return this;
    }

    /**
     * A short link suitable for sharing this question.
     * @return shareLink
     */
    @Valid
    @Schema(
            name = "share_link",
            description = "A short link suitable for sharing this question.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("share_link")
    public URI getShareLink() {
        return shareLink;
    }

    public void setShareLink(URI shareLink) {
        this.shareLink = shareLink;
    }

    public Question tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public Question addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * Tags associated with this question.
     * @return tags
     */
    @Schema(
            name = "tags",
            example = "[\"windows\",\"c#\",\".net\"]",
            description = "Tags associated with this question.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Question title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The title of this question.
     * @return title
     */
    @NotNull
    @Schema(
            name = "title",
            example = "An example post title",
            description = "The title of this question.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Question upVoteCount(Long upVoteCount) {
        this.upVoteCount = upVoteCount;
        return this;
    }

    /**
     * The number of upvotes on this question.
     * @return upVoteCount
     */
    @Schema(
            name = "up_vote_count",
            example = "3",
            description = "The number of upvotes on this question.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("up_vote_count")
    public Long getUpVoteCount() {
        return upVoteCount;
    }

    public void setUpVoteCount(Long upVoteCount) {
        this.upVoteCount = upVoteCount;
    }

    public Question upvoted(Boolean upvoted) {
        this.upvoted = upvoted;
        return this;
    }

    /**
     * True if the authenticated user has upvoted this question. Requires private_info scope.
     * @return upvoted
     */
    @Schema(
            name = "upvoted",
            description = "True if the authenticated user has upvoted this question. Requires private_info scope.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("upvoted")
    public Boolean getUpvoted() {
        return upvoted;
    }

    public void setUpvoted(Boolean upvoted) {
        this.upvoted = upvoted;
    }

    public Question viewCount(Long viewCount) {
        this.viewCount = viewCount;
        return this;
    }

    /**
     * The number of times this question has been viewed.
     * @return viewCount
     */
    @Schema(
            name = "view_count",
            example = "31415",
            description = "The number of times this question has been viewed.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("view_count")
    public Long getViewCount() {
        return viewCount;
    }

    public void setViewCount(Long viewCount) {
        this.viewCount = viewCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Question question = (Question) o;
        return Objects.equals(this.acceptedAnswerId, question.acceptedAnswerId)
                && Objects.equals(this.answerCount, question.answerCount)
                && Objects.equals(this.answers, question.answers)
                && Objects.equals(this.body, question.body)
                && Objects.equals(this.bodyMarkdown, question.bodyMarkdown)
                && Objects.equals(this.bountyAmount, question.bountyAmount)
                && Objects.equals(this.bountyClosesDate, question.bountyClosesDate)
                && Objects.equals(this.bountyUser, question.bountyUser)
                && Objects.equals(this.canAnswer, question.canAnswer)
                && Objects.equals(this.canClose, question.canClose)
                && Objects.equals(this.canComment, question.canComment)
                && Objects.equals(this.canEdit, question.canEdit)
                && Objects.equals(this.canFlag, question.canFlag)
                && Objects.equals(this.canSuggestEdit, question.canSuggestEdit)
                && Objects.equals(this.closeVoteCount, question.closeVoteCount)
                && Objects.equals(this.closedDate, question.closedDate)
                && Objects.equals(this.closedDetails, question.closedDetails)
                && Objects.equals(this.closedReason, question.closedReason)
                && Objects.equals(this.collectives, question.collectives)
                && Objects.equals(this.commentCount, question.commentCount)
                && Objects.equals(this.comments, question.comments)
                && Objects.equals(this.communityOwnedDate, question.communityOwnedDate)
                && Objects.equals(this.contentLicense, question.contentLicense)
                && Objects.equals(this.creationDate, question.creationDate)
                && Objects.equals(this.deleteVoteCount, question.deleteVoteCount)
                && Objects.equals(this.downVoteCount, question.downVoteCount)
                && Objects.equals(this.downvoted, question.downvoted)
                && Objects.equals(this.favoriteCount, question.favoriteCount)
                && Objects.equals(this.favorited, question.favorited)
                && Objects.equals(this.isAnswered, question.isAnswered)
                && Objects.equals(this.lastActivityDate, question.lastActivityDate)
                && Objects.equals(this.lastEditDate, question.lastEditDate)
                && Objects.equals(this.lastEditor, question.lastEditor)
                && Objects.equals(this.link, question.link)
                && Objects.equals(this.lockedDate, question.lockedDate)
                && Objects.equals(this.migratedFrom, question.migratedFrom)
                && Objects.equals(this.migratedTo, question.migratedTo)
                && Objects.equals(this.notice, question.notice)
                && Objects.equals(this.owner, question.owner)
                && Objects.equals(this.postedByCollectives, question.postedByCollectives)
                && Objects.equals(this.protectedDate, question.protectedDate)
                && Objects.equals(this.questionId, question.questionId)
                && Objects.equals(this.reopenVoteCount, question.reopenVoteCount)
                && Objects.equals(this.score, question.score)
                && Objects.equals(this.shareLink, question.shareLink)
                && Objects.equals(this.tags, question.tags)
                && Objects.equals(this.title, question.title)
                && Objects.equals(this.upVoteCount, question.upVoteCount)
                && Objects.equals(this.upvoted, question.upvoted)
                && Objects.equals(this.viewCount, question.viewCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                acceptedAnswerId,
                answerCount,
                answers,
                body,
                bodyMarkdown,
                bountyAmount,
                bountyClosesDate,
                bountyUser,
                canAnswer,
                canClose,
                canComment,
                canEdit,
                canFlag,
                canSuggestEdit,
                closeVoteCount,
                closedDate,
                closedDetails,
                closedReason,
                collectives,
                commentCount,
                comments,
                communityOwnedDate,
                contentLicense,
                creationDate,
                deleteVoteCount,
                downVoteCount,
                downvoted,
                favoriteCount,
                favorited,
                isAnswered,
                lastActivityDate,
                lastEditDate,
                lastEditor,
                link,
                lockedDate,
                migratedFrom,
                migratedTo,
                notice,
                owner,
                postedByCollectives,
                protectedDate,
                questionId,
                reopenVoteCount,
                score,
                shareLink,
                tags,
                title,
                upVoteCount,
                upvoted,
                viewCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Question {\n");
        sb.append("    acceptedAnswerId: ")
                .append(toIndentedString(acceptedAnswerId))
                .append("\n");
        sb.append("    answerCount: ").append(toIndentedString(answerCount)).append("\n");
        sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    bodyMarkdown: ").append(toIndentedString(bodyMarkdown)).append("\n");
        sb.append("    bountyAmount: ").append(toIndentedString(bountyAmount)).append("\n");
        sb.append("    bountyClosesDate: ")
                .append(toIndentedString(bountyClosesDate))
                .append("\n");
        sb.append("    bountyUser: ").append(toIndentedString(bountyUser)).append("\n");
        sb.append("    canAnswer: ").append(toIndentedString(canAnswer)).append("\n");
        sb.append("    canClose: ").append(toIndentedString(canClose)).append("\n");
        sb.append("    canComment: ").append(toIndentedString(canComment)).append("\n");
        sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
        sb.append("    canFlag: ").append(toIndentedString(canFlag)).append("\n");
        sb.append("    canSuggestEdit: ")
                .append(toIndentedString(canSuggestEdit))
                .append("\n");
        sb.append("    closeVoteCount: ")
                .append(toIndentedString(closeVoteCount))
                .append("\n");
        sb.append("    closedDate: ").append(toIndentedString(closedDate)).append("\n");
        sb.append("    closedDetails: ").append(toIndentedString(closedDetails)).append("\n");
        sb.append("    closedReason: ").append(toIndentedString(closedReason)).append("\n");
        sb.append("    collectives: ").append(toIndentedString(collectives)).append("\n");
        sb.append("    commentCount: ").append(toIndentedString(commentCount)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    communityOwnedDate: ")
                .append(toIndentedString(communityOwnedDate))
                .append("\n");
        sb.append("    contentLicense: ")
                .append(toIndentedString(contentLicense))
                .append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    deleteVoteCount: ")
                .append(toIndentedString(deleteVoteCount))
                .append("\n");
        sb.append("    downVoteCount: ").append(toIndentedString(downVoteCount)).append("\n");
        sb.append("    downvoted: ").append(toIndentedString(downvoted)).append("\n");
        sb.append("    favoriteCount: ").append(toIndentedString(favoriteCount)).append("\n");
        sb.append("    favorited: ").append(toIndentedString(favorited)).append("\n");
        sb.append("    isAnswered: ").append(toIndentedString(isAnswered)).append("\n");
        sb.append("    lastActivityDate: ")
                .append(toIndentedString(lastActivityDate))
                .append("\n");
        sb.append("    lastEditDate: ").append(toIndentedString(lastEditDate)).append("\n");
        sb.append("    lastEditor: ").append(toIndentedString(lastEditor)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    lockedDate: ").append(toIndentedString(lockedDate)).append("\n");
        sb.append("    migratedFrom: ").append(toIndentedString(migratedFrom)).append("\n");
        sb.append("    migratedTo: ").append(toIndentedString(migratedTo)).append("\n");
        sb.append("    notice: ").append(toIndentedString(notice)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    postedByCollectives: ")
                .append(toIndentedString(postedByCollectives))
                .append("\n");
        sb.append("    protectedDate: ").append(toIndentedString(protectedDate)).append("\n");
        sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
        sb.append("    reopenVoteCount: ")
                .append(toIndentedString(reopenVoteCount))
                .append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    shareLink: ").append(toIndentedString(shareLink)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    upVoteCount: ").append(toIndentedString(upVoteCount)).append("\n");
        sb.append("    upvoted: ").append(toIndentedString(upvoted)).append("\n");
        sb.append("    viewCount: ").append(toIndentedString(viewCount)).append("\n");
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
