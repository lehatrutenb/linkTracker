package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Comments provide a way for people to collaborate on an issue.
 */
@Schema(name = "Issue_Comment_1", description = "Comments provide a way for people to collaborate on an issue.")
@JsonTypeName("Issue_Comment_1")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssueComment1 {

    private Long id;

    private String nodeId;

    private URI url;

    private Optional<String> body = Optional.empty();

    private Optional<String> bodyText = Optional.empty();

    private Optional<String> bodyHtml = Optional.empty();

    private URI htmlUrl;

    private JsonNullable<SimpleUser> user = JsonNullable.<SimpleUser>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private URI issueUrl;

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

    private Optional<AuthorAssociationEnum> authorAssociation = Optional.empty();

    private JsonNullable<GitHubApp1> performedViaGithubApp = JsonNullable.<GitHubApp1>undefined();

    private Optional<ReactionRollup> reactions = Optional.empty();

    private JsonNullable<PinnedIssueComment> pin = JsonNullable.<PinnedIssueComment>undefined();

    public IssueComment1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssueComment1(
            Long id,
            String nodeId,
            URI url,
            URI htmlUrl,
            SimpleUser user,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            URI issueUrl) {
        this.id = id;
        this.nodeId = nodeId;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.user = JsonNullable.of(user);
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.issueUrl = issueUrl;
    }

    public IssueComment1 id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the issue comment
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            description = "Unique identifier of the issue comment",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IssueComment1 nodeId(String nodeId) {
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

    public IssueComment1 url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * URL for the issue comment
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", description = "URL for the issue comment", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public IssueComment1 body(String body) {
        this.body = Optional.ofNullable(body);
        return this;
    }

    /**
     * Contents of the issue comment
     * @return body
     */
    @Schema(
            name = "body",
            description = "Contents of the issue comment",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public Optional<String> getBody() {
        return body;
    }

    public void setBody(Optional<String> body) {
        this.body = body;
    }

    public IssueComment1 bodyText(String bodyText) {
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

    public IssueComment1 bodyHtml(String bodyHtml) {
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

    public IssueComment1 htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public IssueComment1 user(SimpleUser user) {
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
    public JsonNullable<SimpleUser> getUser() {
        return user;
    }

    public void setUser(JsonNullable<SimpleUser> user) {
        this.user = user;
    }

    public IssueComment1 createdAt(OffsetDateTime createdAt) {
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

    public IssueComment1 updatedAt(OffsetDateTime updatedAt) {
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

    public IssueComment1 issueUrl(URI issueUrl) {
        this.issueUrl = issueUrl;
        return this;
    }

    /**
     * Get issueUrl
     * @return issueUrl
     */
    @NotNull
    @Valid
    @Schema(name = "issue_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue_url")
    public URI getIssueUrl() {
        return issueUrl;
    }

    public void setIssueUrl(URI issueUrl) {
        this.issueUrl = issueUrl;
    }

    public IssueComment1 authorAssociation(AuthorAssociationEnum authorAssociation) {
        this.authorAssociation = Optional.ofNullable(authorAssociation);
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
    public Optional<AuthorAssociationEnum> getAuthorAssociation() {
        return authorAssociation;
    }

    public void setAuthorAssociation(Optional<AuthorAssociationEnum> authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    public IssueComment1 performedViaGithubApp(GitHubApp1 performedViaGithubApp) {
        this.performedViaGithubApp = JsonNullable.of(performedViaGithubApp);
        return this;
    }

    /**
     * Get performedViaGithubApp
     * @return performedViaGithubApp
     */
    @Valid
    @Schema(name = "performed_via_github_app", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("performed_via_github_app")
    public JsonNullable<GitHubApp1> getPerformedViaGithubApp() {
        return performedViaGithubApp;
    }

    public void setPerformedViaGithubApp(JsonNullable<GitHubApp1> performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    public IssueComment1 reactions(ReactionRollup reactions) {
        this.reactions = Optional.ofNullable(reactions);
        return this;
    }

    /**
     * Get reactions
     * @return reactions
     */
    @Valid
    @Schema(name = "reactions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reactions")
    public Optional<ReactionRollup> getReactions() {
        return reactions;
    }

    public void setReactions(Optional<ReactionRollup> reactions) {
        this.reactions = reactions;
    }

    public IssueComment1 pin(PinnedIssueComment pin) {
        this.pin = JsonNullable.of(pin);
        return this;
    }

    /**
     * Get pin
     * @return pin
     */
    @Valid
    @Schema(name = "pin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pin")
    public JsonNullable<PinnedIssueComment> getPin() {
        return pin;
    }

    public void setPin(JsonNullable<PinnedIssueComment> pin) {
        this.pin = pin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueComment1 issueComment1 = (IssueComment1) o;
        return Objects.equals(this.id, issueComment1.id)
                && Objects.equals(this.nodeId, issueComment1.nodeId)
                && Objects.equals(this.url, issueComment1.url)
                && Objects.equals(this.body, issueComment1.body)
                && Objects.equals(this.bodyText, issueComment1.bodyText)
                && Objects.equals(this.bodyHtml, issueComment1.bodyHtml)
                && Objects.equals(this.htmlUrl, issueComment1.htmlUrl)
                && Objects.equals(this.user, issueComment1.user)
                && Objects.equals(this.createdAt, issueComment1.createdAt)
                && Objects.equals(this.updatedAt, issueComment1.updatedAt)
                && Objects.equals(this.issueUrl, issueComment1.issueUrl)
                && Objects.equals(this.authorAssociation, issueComment1.authorAssociation)
                && equalsNullable(this.performedViaGithubApp, issueComment1.performedViaGithubApp)
                && Objects.equals(this.reactions, issueComment1.reactions)
                && equalsNullable(this.pin, issueComment1.pin);
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
                url,
                body,
                bodyText,
                bodyHtml,
                htmlUrl,
                user,
                createdAt,
                updatedAt,
                issueUrl,
                authorAssociation,
                hashCodeNullable(performedViaGithubApp),
                reactions,
                hashCodeNullable(pin));
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
        sb.append("class IssueComment1 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    bodyText: ").append(toIndentedString(bodyText)).append("\n");
        sb.append("    bodyHtml: ").append(toIndentedString(bodyHtml)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    issueUrl: ").append(toIndentedString(issueUrl)).append("\n");
        sb.append("    authorAssociation: ")
                .append(toIndentedString(authorAssociation))
                .append("\n");
        sb.append("    performedViaGithubApp: ")
                .append(toIndentedString(performedViaGithubApp))
                .append("\n");
        sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
        sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
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
