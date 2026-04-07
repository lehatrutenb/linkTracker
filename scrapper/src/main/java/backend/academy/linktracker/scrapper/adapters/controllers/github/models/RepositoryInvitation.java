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
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Repository invitations let you manage who you collaborate with.
 */
@Schema(name = "repository-invitation", description = "Repository invitations let you manage who you collaborate with.")
@JsonTypeName("repository-invitation")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryInvitation {

    private Long id;

    private MinimalRepository repository;

    private JsonNullable<NullableSimpleUser> invitee = JsonNullable.<NullableSimpleUser>undefined();

    private JsonNullable<NullableSimpleUser> inviter = JsonNullable.<NullableSimpleUser>undefined();

    /**
     * The permission associated with the invitation.
     */
    public enum PermissionsEnum {
        READ("read"),

        WRITE("write"),

        ADMIN("admin"),

        TRIAGE("triage"),

        MAINTAIN("maintain");

        private final String value;

        PermissionsEnum(String value) {
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
        public static PermissionsEnum fromValue(String value) {
            for (PermissionsEnum b : PermissionsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private PermissionsEnum permissions;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private Optional<Boolean> expired = Optional.empty();

    private String url;

    private String htmlUrl;

    private String nodeId;

    public RepositoryInvitation() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryInvitation(
            Long id,
            MinimalRepository repository,
            NullableSimpleUser invitee,
            NullableSimpleUser inviter,
            PermissionsEnum permissions,
            OffsetDateTime createdAt,
            String url,
            String htmlUrl,
            String nodeId) {
        this.id = id;
        this.repository = repository;
        this.invitee = JsonNullable.of(invitee);
        this.inviter = JsonNullable.of(inviter);
        this.permissions = permissions;
        this.createdAt = createdAt;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.nodeId = nodeId;
    }

    public RepositoryInvitation id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the repository invitation.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "42",
            description = "Unique identifier of the repository invitation.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RepositoryInvitation repository(MinimalRepository repository) {
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
    public MinimalRepository getRepository() {
        return repository;
    }

    public void setRepository(MinimalRepository repository) {
        this.repository = repository;
    }

    public RepositoryInvitation invitee(NullableSimpleUser invitee) {
        this.invitee = JsonNullable.of(invitee);
        return this;
    }

    /**
     * Get invitee
     * @return invitee
     */
    @NotNull
    @Valid
    @Schema(name = "invitee", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("invitee")
    public JsonNullable<NullableSimpleUser> getInvitee() {
        return invitee;
    }

    public void setInvitee(JsonNullable<NullableSimpleUser> invitee) {
        this.invitee = invitee;
    }

    public RepositoryInvitation inviter(NullableSimpleUser inviter) {
        this.inviter = JsonNullable.of(inviter);
        return this;
    }

    /**
     * Get inviter
     * @return inviter
     */
    @NotNull
    @Valid
    @Schema(name = "inviter", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("inviter")
    public JsonNullable<NullableSimpleUser> getInviter() {
        return inviter;
    }

    public void setInviter(JsonNullable<NullableSimpleUser> inviter) {
        this.inviter = inviter;
    }

    public RepositoryInvitation permissions(PermissionsEnum permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * The permission associated with the invitation.
     * @return permissions
     */
    @NotNull
    @Schema(
            name = "permissions",
            example = "read",
            description = "The permission associated with the invitation.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("permissions")
    public PermissionsEnum getPermissions() {
        return permissions;
    }

    public void setPermissions(PermissionsEnum permissions) {
        this.permissions = permissions;
    }

    public RepositoryInvitation createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", example = "2016-06-13T14:52:50-05:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public RepositoryInvitation expired(Boolean expired) {
        this.expired = Optional.ofNullable(expired);
        return this;
    }

    /**
     * Whether or not the invitation has expired
     * @return expired
     */
    @Schema(
            name = "expired",
            description = "Whether or not the invitation has expired",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("expired")
    public Optional<Boolean> getExpired() {
        return expired;
    }

    public void setExpired(Optional<Boolean> expired) {
        this.expired = expired;
    }

    public RepositoryInvitation url(String url) {
        this.url = url;
        return this;
    }

    /**
     * URL for the repository invitation
     * @return url
     */
    @NotNull
    @Schema(
            name = "url",
            example = "https://api.github.com/user/repository-invitations/1",
            description = "URL for the repository invitation",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public RepositoryInvitation htmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Schema(
            name = "html_url",
            example = "https://github.com/octocat/Hello-World/invitations",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public RepositoryInvitation nodeId(String nodeId) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryInvitation repositoryInvitation = (RepositoryInvitation) o;
        return Objects.equals(this.id, repositoryInvitation.id)
                && Objects.equals(this.repository, repositoryInvitation.repository)
                && Objects.equals(this.invitee, repositoryInvitation.invitee)
                && Objects.equals(this.inviter, repositoryInvitation.inviter)
                && Objects.equals(this.permissions, repositoryInvitation.permissions)
                && Objects.equals(this.createdAt, repositoryInvitation.createdAt)
                && Objects.equals(this.expired, repositoryInvitation.expired)
                && Objects.equals(this.url, repositoryInvitation.url)
                && Objects.equals(this.htmlUrl, repositoryInvitation.htmlUrl)
                && Objects.equals(this.nodeId, repositoryInvitation.nodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, repository, invitee, inviter, permissions, createdAt, expired, url, htmlUrl, nodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryInvitation {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    invitee: ").append(toIndentedString(invitee)).append("\n");
        sb.append("    inviter: ").append(toIndentedString(inviter)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
