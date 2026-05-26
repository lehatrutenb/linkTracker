package backend.academy.linktracker.scrapper.adapter.scrapper.stackoverflow.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Represents an answer to a question on a Stack Exchange site.
 */
@Schema(name = "Answer", description = "Represents an answer to a question on a Stack Exchange site.")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:10:37.029105836Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Answer implements ApiResponseItemsInner {

    private Optional<Boolean> accepted = Optional.empty();

    private Long answerId;

    private JsonNullable<Long> awardedBountyAmount = JsonNullable.<Long>undefined();

    @Valid
    private List<@Valid ShallowUser> awardedBountyUsers = new ArrayList<>();

    private Optional<String> body = Optional.empty();

    private Optional<String> bodyMarkdown = Optional.empty();

    private Optional<Boolean> canComment = Optional.empty();

    private Optional<Boolean> canEdit = Optional.empty();

    private Optional<Boolean> canFlag = Optional.empty();

    private Optional<Boolean> canSuggestEdit = Optional.empty();

    @Valid
    private List<@Valid Collective> collectives = new ArrayList<>();

    private Optional<Long> commentCount = Optional.empty();

    @Valid
    private List<@Valid Comment> comments = new ArrayList<>();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> communityOwnedDate = JsonNullable.<OffsetDateTime>undefined();

    private Optional<String> contentLicense = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime creationDate;

    private Optional<Long> downVoteCount = Optional.empty();

    private Optional<Boolean> downvoted = Optional.empty();

    private Optional<Boolean> isAccepted = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> lastActivityDate = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> lastEditDate = JsonNullable.<OffsetDateTime>undefined();

    private Optional<ShallowUser> lastEditor = Optional.empty();

    private URI link;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> lockedDate = JsonNullable.<OffsetDateTime>undefined();

    private Optional<ShallowUser> owner = Optional.empty();

    @Valid
    private List<@Valid Collective> postedByCollectives = new ArrayList<>();

    private Long questionId;

    private Optional<Long> recommendations = Optional.empty();

    private Optional<Long> score = Optional.empty();

    private Optional<URI> shareLink = Optional.empty();

    @Valid
    private List<String> tags = new ArrayList<>();

    private Optional<String> title = Optional.empty();

    private Optional<Long> upVoteCount = Optional.empty();

    private Optional<Boolean> upvoted = Optional.empty();

    public Answer() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Answer(Long answerId, OffsetDateTime creationDate, URI link, Long questionId) {
        this.answerId = answerId;
        this.creationDate = creationDate;
        this.link = link;
        this.questionId = questionId;
    }

    public Answer accepted(Boolean accepted) {
        this.accepted = Optional.ofNullable(accepted);
        return this;
    }

    /**
     * Whether the answer is accepted.
     * @return accepted
     */
    @Schema(
            name = "accepted",
            example = "false",
            description = "Whether the answer is accepted.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("accepted")
    public Optional<Boolean> getAccepted() {
        return accepted;
    }

    public void setAccepted(Optional<Boolean> accepted) {
        this.accepted = accepted;
    }

    public Answer answerId(Long answerId) {
        this.answerId = answerId;
        return this;
    }

    /**
     * The unique identifier for this answer.
     * @return answerId
     */
    @NotNull
    @Schema(
            name = "answer_id",
            example = "5678",
            description = "The unique identifier for this answer.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("answer_id")
    public Long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Long answerId) {
        this.answerId = answerId;
    }

    public Answer awardedBountyAmount(Long awardedBountyAmount) {
        this.awardedBountyAmount = JsonNullable.of(awardedBountyAmount);
        return this;
    }

    /**
     * The amount of bounty awarded to this answer, if any.
     * @return awardedBountyAmount
     */
    @Schema(
            name = "awarded_bounty_amount",
            description = "The amount of bounty awarded to this answer, if any.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("awarded_bounty_amount")
    public JsonNullable<Long> getAwardedBountyAmount() {
        return awardedBountyAmount;
    }

    public void setAwardedBountyAmount(JsonNullable<Long> awardedBountyAmount) {
        this.awardedBountyAmount = awardedBountyAmount;
    }

    public Answer awardedBountyUsers(List<@Valid ShallowUser> awardedBountyUsers) {
        this.awardedBountyUsers = awardedBountyUsers;
        return this;
    }

    public Answer addAwardedBountyUsersItem(ShallowUser awardedBountyUsersItem) {
        if (this.awardedBountyUsers == null) {
            this.awardedBountyUsers = new ArrayList<>();
        }
        this.awardedBountyUsers.add(awardedBountyUsersItem);
        return this;
    }

    /**
     * Users who contributed to the bounty on this answer.
     * @return awardedBountyUsers
     */
    @Valid
    @Schema(
            name = "awarded_bounty_users",
            description = "Users who contributed to the bounty on this answer.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("awarded_bounty_users")
    public List<@Valid ShallowUser> getAwardedBountyUsers() {
        return awardedBountyUsers;
    }

    public void setAwardedBountyUsers(List<@Valid ShallowUser> awardedBountyUsers) {
        this.awardedBountyUsers = awardedBountyUsers;
    }

    public Answer body(String body) {
        this.body = Optional.ofNullable(body);
        return this;
    }

    /**
     * The main body of the answer in HTML format.
     * @return body
     */
    @Schema(
            name = "body",
            example = "An example post body",
            description = "The main body of the answer in HTML format.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public Optional<String> getBody() {
        return body;
    }

    public void setBody(Optional<String> body) {
        this.body = body;
    }

    public Answer bodyMarkdown(String bodyMarkdown) {
        this.bodyMarkdown = Optional.ofNullable(bodyMarkdown);
        return this;
    }

    /**
     * The main body of the answer in Markdown format.
     * @return bodyMarkdown
     */
    @Schema(
            name = "body_markdown",
            description = "The main body of the answer in Markdown format.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body_markdown")
    public Optional<String> getBodyMarkdown() {
        return bodyMarkdown;
    }

    public void setBodyMarkdown(Optional<String> bodyMarkdown) {
        this.bodyMarkdown = bodyMarkdown;
    }

    public Answer canComment(Boolean canComment) {
        this.canComment = Optional.ofNullable(canComment);
        return this;
    }

    /**
     * True if the authenticated user can comment on this answer.
     * @return canComment
     */
    @Schema(
            name = "can_comment",
            description = "True if the authenticated user can comment on this answer.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("can_comment")
    public Optional<Boolean> getCanComment() {
        return canComment;
    }

    public void setCanComment(Optional<Boolean> canComment) {
        this.canComment = canComment;
    }

    public Answer canEdit(Boolean canEdit) {
        this.canEdit = Optional.ofNullable(canEdit);
        return this;
    }

    /**
     * True if the authenticated user can edit this answer.
     * @return canEdit
     */
    @Schema(
            name = "can_edit",
            description = "True if the authenticated user can edit this answer.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("can_edit")
    public Optional<Boolean> getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(Optional<Boolean> canEdit) {
        this.canEdit = canEdit;
    }

    public Answer canFlag(Boolean canFlag) {
        this.canFlag = Optional.ofNullable(canFlag);
        return this;
    }

    /**
     * True if the authenticated user can flag this answer.
     * @return canFlag
     */
    @Schema(
            name = "can_flag",
            description = "True if the authenticated user can flag this answer.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("can_flag")
    public Optional<Boolean> getCanFlag() {
        return canFlag;
    }

    public void setCanFlag(Optional<Boolean> canFlag) {
        this.canFlag = canFlag;
    }

    public Answer canSuggestEdit(Boolean canSuggestEdit) {
        this.canSuggestEdit = Optional.ofNullable(canSuggestEdit);
        return this;
    }

    /**
     * True if the authenticated user can suggest an edit for this answer.
     * @return canSuggestEdit
     */
    @Schema(
            name = "can_suggest_edit",
            description = "True if the authenticated user can suggest an edit for this answer.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("can_suggest_edit")
    public Optional<Boolean> getCanSuggestEdit() {
        return canSuggestEdit;
    }

    public void setCanSuggestEdit(Optional<Boolean> canSuggestEdit) {
        this.canSuggestEdit = canSuggestEdit;
    }

    public Answer collectives(List<@Valid Collective> collectives) {
        this.collectives = collectives;
        return this;
    }

    public Answer addCollectivesItem(Collective collectivesItem) {
        if (this.collectives == null) {
            this.collectives = new ArrayList<>();
        }
        this.collectives.add(collectivesItem);
        return this;
    }

    /**
     * Collectives this answer is associated with.
     * @return collectives
     */
    @Valid
    @Schema(
            name = "collectives",
            description = "Collectives this answer is associated with.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("collectives")
    public List<@Valid Collective> getCollectives() {
        return collectives;
    }

    public void setCollectives(List<@Valid Collective> collectives) {
        this.collectives = collectives;
    }

    public Answer commentCount(Long commentCount) {
        this.commentCount = Optional.ofNullable(commentCount);
        return this;
    }

    /**
     * The total number of comments on this answer.
     * @return commentCount
     */
    @Schema(
            name = "comment_count",
            example = "2",
            description = "The total number of comments on this answer.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("comment_count")
    public Optional<Long> getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Optional<Long> commentCount) {
        this.commentCount = commentCount;
    }

    public Answer comments(List<@Valid Comment> comments) {
        this.comments = comments;
        return this;
    }

    public Answer addCommentsItem(Comment commentsItem) {
        if (this.comments == null) {
            this.comments = new ArrayList<>();
        }
        this.comments.add(commentsItem);
        return this;
    }

    /**
     * A list of comments on this answer. Requires including 'comments' in the filter.
     * @return comments
     */
    @Valid
    @Schema(
            name = "comments",
            description = "A list of comments on this answer. Requires including 'comments' in the filter.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("comments")
    public List<@Valid Comment> getComments() {
        return comments;
    }

    public void setComments(List<@Valid Comment> comments) {
        this.comments = comments;
    }

    public Answer communityOwnedDate(OffsetDateTime communityOwnedDate) {
        this.communityOwnedDate = JsonNullable.of(communityOwnedDate);
        return this;
    }

    /**
     * The date when this answer became community owned, if applicable.
     * @return communityOwnedDate
     */
    @Valid
    @Schema(
            name = "community_owned_date",
            description = "The date when this answer became community owned, if applicable.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("community_owned_date")
    public JsonNullable<OffsetDateTime> getCommunityOwnedDate() {
        return communityOwnedDate;
    }

    public void setCommunityOwnedDate(JsonNullable<OffsetDateTime> communityOwnedDate) {
        this.communityOwnedDate = communityOwnedDate;
    }

    public Answer contentLicense(String contentLicense) {
        this.contentLicense = Optional.ofNullable(contentLicense);
        return this;
    }

    /**
     * The content license for this answer.
     * @return contentLicense
     */
    @Schema(
            name = "content_license",
            example = "CC BY-SA 4.0",
            description = "The content license for this answer.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("content_license")
    public Optional<String> getContentLicense() {
        return contentLicense;
    }

    public void setContentLicense(Optional<String> contentLicense) {
        this.contentLicense = contentLicense;
    }

    public Answer creationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * The date when this answer was created.
     * @return creationDate
     */
    @NotNull
    @Valid
    @Schema(
            name = "creation_date",
            example = "2026-03-05T10:09:42Z",
            description = "The date when this answer was created.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("creation_date")
    public OffsetDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Answer downVoteCount(Long downVoteCount) {
        this.downVoteCount = Optional.ofNullable(downVoteCount);
        return this;
    }

    /**
     * The number of downvotes on this answer.
     * @return downVoteCount
     */
    @Schema(
            name = "down_vote_count",
            example = "2",
            description = "The number of downvotes on this answer.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("down_vote_count")
    public Optional<Long> getDownVoteCount() {
        return downVoteCount;
    }

    public void setDownVoteCount(Optional<Long> downVoteCount) {
        this.downVoteCount = downVoteCount;
    }

    public Answer downvoted(Boolean downvoted) {
        this.downvoted = Optional.ofNullable(downvoted);
        return this;
    }

    /**
     * True if the authenticated user has downvoted this answer. Requires private_info scope.
     * @return downvoted
     */
    @Schema(
            name = "downvoted",
            description = "True if the authenticated user has downvoted this answer. Requires private_info scope.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("downvoted")
    public Optional<Boolean> getDownvoted() {
        return downvoted;
    }

    public void setDownvoted(Optional<Boolean> downvoted) {
        this.downvoted = downvoted;
    }

    public Answer isAccepted(Boolean isAccepted) {
        this.isAccepted = Optional.ofNullable(isAccepted);
        return this;
    }

    /**
     * Whether the answer is accepted.
     * @return isAccepted
     */
    @Schema(
            name = "is_accepted",
            example = "false",
            description = "Whether the answer is accepted.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_accepted")
    public Optional<Boolean> getIsAccepted() {
        return isAccepted;
    }

    public void setIsAccepted(Optional<Boolean> isAccepted) {
        this.isAccepted = isAccepted;
    }

    public Answer lastActivityDate(OffsetDateTime lastActivityDate) {
        this.lastActivityDate = Optional.ofNullable(lastActivityDate);
        return this;
    }

    /**
     * The date of the last activity on this answer.
     * @return lastActivityDate
     */
    @Valid
    @Schema(
            name = "last_activity_date",
            example = "2026-03-07T12:49:42Z",
            description = "The date of the last activity on this answer.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("last_activity_date")
    public Optional<OffsetDateTime> getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(Optional<OffsetDateTime> lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public Answer lastEditDate(OffsetDateTime lastEditDate) {
        this.lastEditDate = JsonNullable.of(lastEditDate);
        return this;
    }

    /**
     * The date of the last edit to this answer.
     * @return lastEditDate
     */
    @Valid
    @Schema(
            name = "last_edit_date",
            example = "2026-03-07T19:49:42Z",
            description = "The date of the last edit to this answer.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("last_edit_date")
    public JsonNullable<OffsetDateTime> getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(JsonNullable<OffsetDateTime> lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    public Answer lastEditor(ShallowUser lastEditor) {
        this.lastEditor = Optional.ofNullable(lastEditor);
        return this;
    }

    /**
     * Get lastEditor
     * @return lastEditor
     */
    @Valid
    @Schema(name = "last_editor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("last_editor")
    public Optional<ShallowUser> getLastEditor() {
        return lastEditor;
    }

    public void setLastEditor(Optional<ShallowUser> lastEditor) {
        this.lastEditor = lastEditor;
    }

    public Answer link(URI link) {
        this.link = link;
        return this;
    }

    /**
     * The permanent URL to this answer.
     * @return link
     */
    @NotNull
    @Valid
    @Schema(
            name = "link",
            example = "http://example.stackexchange.com/questions/1234/an-example-post-title/5678#5678",
            description = "The permanent URL to this answer.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("link")
    public URI getLink() {
        return link;
    }

    public void setLink(URI link) {
        this.link = link;
    }

    public Answer lockedDate(OffsetDateTime lockedDate) {
        this.lockedDate = JsonNullable.of(lockedDate);
        return this;
    }

    /**
     * The date when this answer was locked, if applicable.
     * @return lockedDate
     */
    @Valid
    @Schema(
            name = "locked_date",
            description = "The date when this answer was locked, if applicable.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("locked_date")
    public JsonNullable<OffsetDateTime> getLockedDate() {
        return lockedDate;
    }

    public void setLockedDate(JsonNullable<OffsetDateTime> lockedDate) {
        this.lockedDate = lockedDate;
    }

    public Answer owner(ShallowUser owner) {
        this.owner = Optional.ofNullable(owner);
        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    @Valid
    @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("owner")
    public Optional<ShallowUser> getOwner() {
        return owner;
    }

    public void setOwner(Optional<ShallowUser> owner) {
        this.owner = owner;
    }

    public Answer postedByCollectives(List<@Valid Collective> postedByCollectives) {
        this.postedByCollectives = postedByCollectives;
        return this;
    }

    public Answer addPostedByCollectivesItem(Collective postedByCollectivesItem) {
        if (this.postedByCollectives == null) {
            this.postedByCollectives = new ArrayList<>();
        }
        this.postedByCollectives.add(postedByCollectivesItem);
        return this;
    }

    /**
     * Collectives that posted this answer.
     * @return postedByCollectives
     */
    @Valid
    @Schema(
            name = "posted_by_collectives",
            description = "Collectives that posted this answer.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("posted_by_collectives")
    public List<@Valid Collective> getPostedByCollectives() {
        return postedByCollectives;
    }

    public void setPostedByCollectives(List<@Valid Collective> postedByCollectives) {
        this.postedByCollectives = postedByCollectives;
    }

    public Answer questionId(Long questionId) {
        this.questionId = questionId;
        return this;
    }

    /**
     * The unique identifier for the question this answer belongs to.
     * @return questionId
     */
    @NotNull
    @Schema(
            name = "question_id",
            example = "1234",
            description = "The unique identifier for the question this answer belongs to.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("question_id")
    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Answer recommendations(Long recommendations) {
        this.recommendations = Optional.ofNullable(recommendations);
        return this;
    }

    /**
     * Recommendations for this answer.
     * @return recommendations
     */
    @Schema(
            name = "recommendations",
            description = "Recommendations for this answer.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("recommendations")
    public Optional<Long> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(Optional<Long> recommendations) {
        this.recommendations = recommendations;
    }

    public Answer score(Long score) {
        this.score = Optional.ofNullable(score);
        return this;
    }

    /**
     * The current score (upvotes - downvotes) of this answer.
     * @return score
     */
    @Schema(
            name = "score",
            example = "1",
            description = "The current score (upvotes - downvotes) of this answer.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("score")
    public Optional<Long> getScore() {
        return score;
    }

    public void setScore(Optional<Long> score) {
        this.score = score;
    }

    public Answer shareLink(URI shareLink) {
        this.shareLink = Optional.ofNullable(shareLink);
        return this;
    }

    /**
     * A short link suitable for sharing this answer.
     * @return shareLink
     */
    @Valid
    @Schema(
            name = "share_link",
            description = "A short link suitable for sharing this answer.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("share_link")
    public Optional<URI> getShareLink() {
        return shareLink;
    }

    public void setShareLink(Optional<URI> shareLink) {
        this.shareLink = shareLink;
    }

    public Answer tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public Answer addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * Tags associated with the parent question. Included by default in filters from version 2.1.
     * @return tags
     */
    @Schema(
            name = "tags",
            example = "[\"java\",\"spring\"]",
            description = "Tags associated with the parent question. Included by default in filters from version 2.1.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Answer title(String title) {
        this.title = Optional.ofNullable(title);
        return this;
    }

    /**
     * The title of the parent question.
     * @return title
     */
    @Schema(
            name = "title",
            example = "An example post title",
            description = "The title of the parent question.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("title")
    public Optional<String> getTitle() {
        return title;
    }

    public void setTitle(Optional<String> title) {
        this.title = title;
    }

    public Answer upVoteCount(Long upVoteCount) {
        this.upVoteCount = Optional.ofNullable(upVoteCount);
        return this;
    }

    /**
     * The number of upvotes on this answer.
     * @return upVoteCount
     */
    @Schema(
            name = "up_vote_count",
            example = "3",
            description = "The number of upvotes on this answer.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("up_vote_count")
    public Optional<Long> getUpVoteCount() {
        return upVoteCount;
    }

    public void setUpVoteCount(Optional<Long> upVoteCount) {
        this.upVoteCount = upVoteCount;
    }

    public Answer upvoted(Boolean upvoted) {
        this.upvoted = Optional.ofNullable(upvoted);
        return this;
    }

    /**
     * True if the authenticated user has upvoted this answer. Requires private_info scope.
     * @return upvoted
     */
    @Schema(
            name = "upvoted",
            description = "True if the authenticated user has upvoted this answer. Requires private_info scope.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("upvoted")
    public Optional<Boolean> getUpvoted() {
        return upvoted;
    }

    public void setUpvoted(Optional<Boolean> upvoted) {
        this.upvoted = upvoted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Answer answer = (Answer) o;
        return Objects.equals(this.accepted, answer.accepted)
                && Objects.equals(this.answerId, answer.answerId)
                && equalsNullable(this.awardedBountyAmount, answer.awardedBountyAmount)
                && Objects.equals(this.awardedBountyUsers, answer.awardedBountyUsers)
                && Objects.equals(this.body, answer.body)
                && Objects.equals(this.bodyMarkdown, answer.bodyMarkdown)
                && Objects.equals(this.canComment, answer.canComment)
                && Objects.equals(this.canEdit, answer.canEdit)
                && Objects.equals(this.canFlag, answer.canFlag)
                && Objects.equals(this.canSuggestEdit, answer.canSuggestEdit)
                && Objects.equals(this.collectives, answer.collectives)
                && Objects.equals(this.commentCount, answer.commentCount)
                && Objects.equals(this.comments, answer.comments)
                && equalsNullable(this.communityOwnedDate, answer.communityOwnedDate)
                && Objects.equals(this.contentLicense, answer.contentLicense)
                && Objects.equals(this.creationDate, answer.creationDate)
                && Objects.equals(this.downVoteCount, answer.downVoteCount)
                && Objects.equals(this.downvoted, answer.downvoted)
                && Objects.equals(this.isAccepted, answer.isAccepted)
                && Objects.equals(this.lastActivityDate, answer.lastActivityDate)
                && equalsNullable(this.lastEditDate, answer.lastEditDate)
                && Objects.equals(this.lastEditor, answer.lastEditor)
                && Objects.equals(this.link, answer.link)
                && equalsNullable(this.lockedDate, answer.lockedDate)
                && Objects.equals(this.owner, answer.owner)
                && Objects.equals(this.postedByCollectives, answer.postedByCollectives)
                && Objects.equals(this.questionId, answer.questionId)
                && Objects.equals(this.recommendations, answer.recommendations)
                && Objects.equals(this.score, answer.score)
                && Objects.equals(this.shareLink, answer.shareLink)
                && Objects.equals(this.tags, answer.tags)
                && Objects.equals(this.title, answer.title)
                && Objects.equals(this.upVoteCount, answer.upVoteCount)
                && Objects.equals(this.upvoted, answer.upvoted);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                accepted,
                answerId,
                hashCodeNullable(awardedBountyAmount),
                awardedBountyUsers,
                body,
                bodyMarkdown,
                canComment,
                canEdit,
                canFlag,
                canSuggestEdit,
                collectives,
                commentCount,
                comments,
                hashCodeNullable(communityOwnedDate),
                contentLicense,
                creationDate,
                downVoteCount,
                downvoted,
                isAccepted,
                lastActivityDate,
                hashCodeNullable(lastEditDate),
                lastEditor,
                link,
                hashCodeNullable(lockedDate),
                owner,
                postedByCollectives,
                questionId,
                recommendations,
                score,
                shareLink,
                tags,
                title,
                upVoteCount,
                upvoted);
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
        sb.append("class Answer {\n");
        sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
        sb.append("    answerId: ").append(toIndentedString(answerId)).append("\n");
        sb.append("    awardedBountyAmount: ")
                .append(toIndentedString(awardedBountyAmount))
                .append("\n");
        sb.append("    awardedBountyUsers: ")
                .append(toIndentedString(awardedBountyUsers))
                .append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    bodyMarkdown: ").append(toIndentedString(bodyMarkdown)).append("\n");
        sb.append("    canComment: ").append(toIndentedString(canComment)).append("\n");
        sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
        sb.append("    canFlag: ").append(toIndentedString(canFlag)).append("\n");
        sb.append("    canSuggestEdit: ")
                .append(toIndentedString(canSuggestEdit))
                .append("\n");
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
        sb.append("    downVoteCount: ").append(toIndentedString(downVoteCount)).append("\n");
        sb.append("    downvoted: ").append(toIndentedString(downvoted)).append("\n");
        sb.append("    isAccepted: ").append(toIndentedString(isAccepted)).append("\n");
        sb.append("    lastActivityDate: ")
                .append(toIndentedString(lastActivityDate))
                .append("\n");
        sb.append("    lastEditDate: ").append(toIndentedString(lastEditDate)).append("\n");
        sb.append("    lastEditor: ").append(toIndentedString(lastEditor)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    lockedDate: ").append(toIndentedString(lockedDate)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    postedByCollectives: ")
                .append(toIndentedString(postedByCollectives))
                .append("\n");
        sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
        sb.append("    recommendations: ")
                .append(toIndentedString(recommendations))
                .append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    shareLink: ").append(toIndentedString(shareLink)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    upVoteCount: ").append(toIndentedString(upVoteCount)).append("\n");
        sb.append("    upvoted: ").append(toIndentedString(upvoted)).append("\n");
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
