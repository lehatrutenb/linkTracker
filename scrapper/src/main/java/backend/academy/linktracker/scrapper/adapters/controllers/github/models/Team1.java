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
import java.util.*;
import java.util.Objects;

/**
 * Groups of organization members that gives permissions on specified repositories.
 */
@Schema(
        name = "Team_1",
        description = "Groups of organization members that gives permissions on specified repositories.")
@JsonTypeName("Team_1")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Team1 implements PullRequest6RequestedReviewersInner, PullRequestRequestedReviewersInner {

    private Boolean deleted;

    private String description = null;

    private URI htmlUrl;

    private Long id;

    private String membersUrl;

    private String name;

    private String nodeId;

    private TeamParent parent = null;

    private String permission;

    /**
     * Gets or Sets privacy
     */
    public enum PrivacyEnum {
        OPEN("open"),

        CLOSED("closed"),

        SECRET("secret");

        private final String value;

        PrivacyEnum(String value) {
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
        public static PrivacyEnum fromValue(String value) {
            for (PrivacyEnum b : PrivacyEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private PrivacyEnum privacy;

    private URI repositoriesUrl;

    private String slug;

    private URI url;

    public Team1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Team1(
            String description,
            URI htmlUrl,
            Long id,
            String membersUrl,
            String name,
            String nodeId,
            String permission,
            PrivacyEnum privacy,
            URI repositoriesUrl,
            String slug,
            URI url) {
        this.description = description;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.membersUrl = membersUrl;
        this.name = name;
        this.nodeId = nodeId;
        this.permission = permission;
        this.privacy = privacy;
        this.repositoriesUrl = repositoriesUrl;
        this.slug = slug;
        this.url = url;
    }

    public Team1 deleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Get deleted
     * @return deleted
     */
    @Schema(name = "deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Team1 description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of the team
     * @return description
     */
    @NotNull
    @Schema(name = "description", description = "Description of the team", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Team1 htmlUrl(URI htmlUrl) {
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

    public Team1 id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the team
     * @return id
     */
    @NotNull
    @Schema(name = "id", description = "Unique identifier of the team", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Team1 membersUrl(String membersUrl) {
        this.membersUrl = membersUrl;
        return this;
    }

    /**
     * Get membersUrl
     * @return membersUrl
     */
    @NotNull
    @Schema(name = "members_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("members_url")
    public String getMembersUrl() {
        return membersUrl;
    }

    public void setMembersUrl(String membersUrl) {
        this.membersUrl = membersUrl;
    }

    public Team1 name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the team
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "Name of the team", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team1 nodeId(String nodeId) {
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

    public Team1 parent(TeamParent parent) {
        this.parent = parent;
        return this;
    }

    /**
     * Get parent
     * @return parent
     */
    @Valid
    @Schema(name = "parent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("parent")
    public TeamParent getParent() {
        return parent;
    }

    public void setParent(TeamParent parent) {
        this.parent = parent;
    }

    public Team1 permission(String permission) {
        this.permission = permission;
        return this;
    }

    /**
     * Permission that the team will have for its repositories
     * @return permission
     */
    @NotNull
    @Schema(
            name = "permission",
            description = "Permission that the team will have for its repositories",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("permission")
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Team1 privacy(PrivacyEnum privacy) {
        this.privacy = privacy;
        return this;
    }

    /**
     * Get privacy
     * @return privacy
     */
    @NotNull
    @Schema(name = "privacy", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("privacy")
    public PrivacyEnum getPrivacy() {
        return privacy;
    }

    public void setPrivacy(PrivacyEnum privacy) {
        this.privacy = privacy;
    }

    public Team1 repositoriesUrl(URI repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
        return this;
    }

    /**
     * Get repositoriesUrl
     * @return repositoriesUrl
     */
    @NotNull
    @Valid
    @Schema(name = "repositories_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repositories_url")
    public URI getRepositoriesUrl() {
        return repositoriesUrl;
    }

    public void setRepositoriesUrl(URI repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
    }

    public Team1 slug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * Get slug
     * @return slug
     */
    @NotNull
    @Schema(name = "slug", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Team1 url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * URL for the team
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", description = "URL for the team", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Team1 team1 = (Team1) o;
        return Objects.equals(this.deleted, team1.deleted)
                && Objects.equals(this.description, team1.description)
                && Objects.equals(this.htmlUrl, team1.htmlUrl)
                && Objects.equals(this.id, team1.id)
                && Objects.equals(this.membersUrl, team1.membersUrl)
                && Objects.equals(this.name, team1.name)
                && Objects.equals(this.nodeId, team1.nodeId)
                && Objects.equals(this.parent, team1.parent)
                && Objects.equals(this.permission, team1.permission)
                && Objects.equals(this.privacy, team1.privacy)
                && Objects.equals(this.repositoriesUrl, team1.repositoriesUrl)
                && Objects.equals(this.slug, team1.slug)
                && Objects.equals(this.url, team1.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                deleted,
                description,
                htmlUrl,
                id,
                membersUrl,
                name,
                nodeId,
                parent,
                permission,
                privacy,
                repositoriesUrl,
                slug,
                url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Team1 {\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    membersUrl: ").append(toIndentedString(membersUrl)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
        sb.append("    repositoriesUrl: ")
                .append(toIndentedString(repositoriesUrl))
                .append("\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
