package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A draft issue in a project
 */
@Schema(name = "projects-v2-draft-issue", description = "A draft issue in a project")
@JsonTypeName("projects-v2-draft-issue")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsV2DraftIssue implements ProjectsV2ItemSimpleContent {

    private BigDecimal id;

    private String nodeId;

    private String title;

    private JsonNullable<String> body = JsonNullable.<String>undefined();

    private JsonNullable<NullableSimpleUser> user = JsonNullable.<NullableSimpleUser>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private JsonNullable<NullableSimpleUser> closedBy = JsonNullable.<NullableSimpleUser>undefined();

    private Optional<String> bodyHtml = Optional.empty();

    private Optional<String> bodyText = Optional.empty();

    private Optional<Repository> repository = Optional.empty();

    private JsonNullable<URI> parentIssueUrl = JsonNullable.<URI>undefined();

    public ProjectsV2DraftIssue() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProjectsV2DraftIssue(
            BigDecimal id,
            String nodeId,
            String title,
            NullableSimpleUser user,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt) {
        this.id = id;
        this.nodeId = nodeId;
        this.title = title;
        this.user = JsonNullable.of(user);
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public ProjectsV2DraftIssue id(BigDecimal id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the draft issue
     * @return id
     */
    @NotNull
    @Valid
    @Schema(name = "id", description = "The ID of the draft issue", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public ProjectsV2DraftIssue nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * The node ID of the draft issue
     * @return nodeId
     */
    @NotNull
    @Schema(
            name = "node_id",
            description = "The node ID of the draft issue",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ProjectsV2DraftIssue title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The title of the draft issue
     * @return title
     */
    @NotNull
    @Schema(name = "title", description = "The title of the draft issue", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ProjectsV2DraftIssue body(String body) {
        this.body = JsonNullable.of(body);
        return this;
    }

    /**
     * The body content of the draft issue
     * @return body
     */
    @Schema(
            name = "body",
            description = "The body content of the draft issue",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public JsonNullable<String> getBody() {
        return body;
    }

    public void setBody(JsonNullable<String> body) {
        this.body = body;
    }

    public ProjectsV2DraftIssue user(NullableSimpleUser user) {
        this.user = JsonNullable.of(user);
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
    public JsonNullable<NullableSimpleUser> getUser() {
        return user;
    }

    public void setUser(JsonNullable<NullableSimpleUser> user) {
        this.user = user;
    }

    public ProjectsV2DraftIssue createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time the draft issue was created
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "created_at",
            description = "The time the draft issue was created",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ProjectsV2DraftIssue updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The time the draft issue was last updated
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "updated_at",
            description = "The time the draft issue was last updated",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ProjectsV2DraftIssue closedBy(NullableSimpleUser closedBy) {
        this.closedBy = JsonNullable.of(closedBy);
        return this;
    }

    /**
     * Get closedBy
     * @return closedBy
     */
    @Valid
    @Schema(name = "closed_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("closed_by")
    public JsonNullable<NullableSimpleUser> getClosedBy() {
        return closedBy;
    }

    public void setClosedBy(JsonNullable<NullableSimpleUser> closedBy) {
        this.closedBy = closedBy;
    }

    public ProjectsV2DraftIssue bodyHtml(String bodyHtml) {
        this.bodyHtml = Optional.ofNullable(bodyHtml);
        return this;
    }

    /**
     * Get bodyHtml
     * @return bodyHtml
     */
    @Schema(name = "body_html", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body_html")
    public Optional<String> getBodyHtml() {
        return bodyHtml;
    }

    public void setBodyHtml(Optional<String> bodyHtml) {
        this.bodyHtml = bodyHtml;
    }

    public ProjectsV2DraftIssue bodyText(String bodyText) {
        this.bodyText = Optional.ofNullable(bodyText);
        return this;
    }

    /**
     * Get bodyText
     * @return bodyText
     */
    @Schema(name = "body_text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body_text")
    public Optional<String> getBodyText() {
        return bodyText;
    }

    public void setBodyText(Optional<String> bodyText) {
        this.bodyText = bodyText;
    }

    public ProjectsV2DraftIssue repository(Repository repository) {
        this.repository = Optional.ofNullable(repository);
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public Optional<Repository> getRepository() {
        return repository;
    }

    public void setRepository(Optional<Repository> repository) {
        this.repository = repository;
    }

    public ProjectsV2DraftIssue parentIssueUrl(URI parentIssueUrl) {
        this.parentIssueUrl = JsonNullable.of(parentIssueUrl);
        return this;
    }

    /**
     * URL to get the parent issue of this issue, if it is a sub-issue
     * @return parentIssueUrl
     */
    @Valid
    @Schema(
            name = "parent_issue_url",
            description = "URL to get the parent issue of this issue, if it is a sub-issue",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("parent_issue_url")
    public JsonNullable<URI> getParentIssueUrl() {
        return parentIssueUrl;
    }

    public void setParentIssueUrl(JsonNullable<URI> parentIssueUrl) {
        this.parentIssueUrl = parentIssueUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectsV2DraftIssue projectsV2DraftIssue = (ProjectsV2DraftIssue) o;
        return Objects.equals(this.id, projectsV2DraftIssue.id)
                && Objects.equals(this.nodeId, projectsV2DraftIssue.nodeId)
                && Objects.equals(this.title, projectsV2DraftIssue.title)
                && equalsNullable(this.body, projectsV2DraftIssue.body)
                && Objects.equals(this.user, projectsV2DraftIssue.user)
                && Objects.equals(this.createdAt, projectsV2DraftIssue.createdAt)
                && Objects.equals(this.updatedAt, projectsV2DraftIssue.updatedAt)
                && equalsNullable(this.closedBy, projectsV2DraftIssue.closedBy)
                && Objects.equals(this.bodyHtml, projectsV2DraftIssue.bodyHtml)
                && Objects.equals(this.bodyText, projectsV2DraftIssue.bodyText)
                && Objects.equals(this.repository, projectsV2DraftIssue.repository)
                && equalsNullable(this.parentIssueUrl, projectsV2DraftIssue.parentIssueUrl);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                nodeId,
                title,
                hashCodeNullable(body),
                user,
                createdAt,
                updatedAt,
                hashCodeNullable(closedBy),
                bodyHtml,
                bodyText,
                repository,
                hashCodeNullable(parentIssueUrl));
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
        sb.append("class ProjectsV2DraftIssue {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    closedBy: ").append(toIndentedString(closedBy)).append("\n");
        sb.append("    bodyHtml: ").append(toIndentedString(bodyHtml)).append("\n");
        sb.append("    bodyText: ").append(toIndentedString(bodyText)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    parentIssueUrl: ")
                .append(toIndentedString(parentIssueUrl))
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
