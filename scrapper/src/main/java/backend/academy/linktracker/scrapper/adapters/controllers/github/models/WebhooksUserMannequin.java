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
 * WebhooksUserMannequin
 */
@JsonTypeName("webhooks_user_mannequin")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksUserMannequin {

    private URI avatarUrl;

    private Boolean deleted;

    private String email = null;

    private String eventsUrl;

    private URI followersUrl;

    private String followingUrl;

    private String gistsUrl;

    private String gravatarId;

    private URI htmlUrl;

    private Long id;

    private String login;

    private String name;

    private String nodeId;

    private URI organizationsUrl;

    private URI receivedEventsUrl;

    private URI reposUrl;

    private Boolean siteAdmin;

    private String starredUrl;

    private URI subscriptionsUrl;

    /**
     * Gets or Sets type
     */
    public enum TypeEnum {
        BOT("Bot"),

        USER("User"),

        ORGANIZATION("Organization"),

        MANNEQUIN("Mannequin");

        private final String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private TypeEnum type;

    private URI url;

    private String userViewType;

    public WebhooksUserMannequin() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksUserMannequin(Long id, String login) {
        this.id = id;
        this.login = login;
    }

    public WebhooksUserMannequin avatarUrl(URI avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    /**
     * Get avatarUrl
     * @return avatarUrl
     */
    @Valid
    @Schema(name = "avatar_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("avatar_url")
    public URI getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(URI avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public WebhooksUserMannequin deleted(Boolean deleted) {
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

    public WebhooksUserMannequin email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     * @return email
     */
    @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public WebhooksUserMannequin eventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    /**
     * Get eventsUrl
     * @return eventsUrl
     */
    @Schema(name = "events_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public WebhooksUserMannequin followersUrl(URI followersUrl) {
        this.followersUrl = followersUrl;
        return this;
    }

    /**
     * Get followersUrl
     * @return followersUrl
     */
    @Valid
    @Schema(name = "followers_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("followers_url")
    public URI getFollowersUrl() {
        return followersUrl;
    }

    public void setFollowersUrl(URI followersUrl) {
        this.followersUrl = followersUrl;
    }

    public WebhooksUserMannequin followingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
        return this;
    }

    /**
     * Get followingUrl
     * @return followingUrl
     */
    @Schema(name = "following_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("following_url")
    public String getFollowingUrl() {
        return followingUrl;
    }

    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    public WebhooksUserMannequin gistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
        return this;
    }

    /**
     * Get gistsUrl
     * @return gistsUrl
     */
    @Schema(name = "gists_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("gists_url")
    public String getGistsUrl() {
        return gistsUrl;
    }

    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    public WebhooksUserMannequin gravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
        return this;
    }

    /**
     * Get gravatarId
     * @return gravatarId
     */
    @Schema(name = "gravatar_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("gravatar_id")
    public String getGravatarId() {
        return gravatarId;
    }

    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    public WebhooksUserMannequin htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Valid
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public WebhooksUserMannequin id(Long id) {
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

    public WebhooksUserMannequin login(String login) {
        this.login = login;
        return this;
    }

    /**
     * Get login
     * @return login
     */
    @NotNull
    @Schema(name = "login", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public WebhooksUserMannequin name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebhooksUserMannequin nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public WebhooksUserMannequin organizationsUrl(URI organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
        return this;
    }

    /**
     * Get organizationsUrl
     * @return organizationsUrl
     */
    @Valid
    @Schema(name = "organizations_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organizations_url")
    public URI getOrganizationsUrl() {
        return organizationsUrl;
    }

    public void setOrganizationsUrl(URI organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    public WebhooksUserMannequin receivedEventsUrl(URI receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
        return this;
    }

    /**
     * Get receivedEventsUrl
     * @return receivedEventsUrl
     */
    @Valid
    @Schema(name = "received_events_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("received_events_url")
    public URI getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    public void setReceivedEventsUrl(URI receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    public WebhooksUserMannequin reposUrl(URI reposUrl) {
        this.reposUrl = reposUrl;
        return this;
    }

    /**
     * Get reposUrl
     * @return reposUrl
     */
    @Valid
    @Schema(name = "repos_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repos_url")
    public URI getReposUrl() {
        return reposUrl;
    }

    public void setReposUrl(URI reposUrl) {
        this.reposUrl = reposUrl;
    }

    public WebhooksUserMannequin siteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
        return this;
    }

    /**
     * Get siteAdmin
     * @return siteAdmin
     */
    @Schema(name = "site_admin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("site_admin")
    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

    public void setSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    public WebhooksUserMannequin starredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
        return this;
    }

    /**
     * Get starredUrl
     * @return starredUrl
     */
    @Schema(name = "starred_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("starred_url")
    public String getStarredUrl() {
        return starredUrl;
    }

    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    public WebhooksUserMannequin subscriptionsUrl(URI subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
        return this;
    }

    /**
     * Get subscriptionsUrl
     * @return subscriptionsUrl
     */
    @Valid
    @Schema(name = "subscriptions_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subscriptions_url")
    public URI getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    public void setSubscriptionsUrl(URI subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    public WebhooksUserMannequin type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public WebhooksUserMannequin url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public WebhooksUserMannequin userViewType(String userViewType) {
        this.userViewType = userViewType;
        return this;
    }

    /**
     * Get userViewType
     * @return userViewType
     */
    @Schema(name = "user_view_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("user_view_type")
    public String getUserViewType() {
        return userViewType;
    }

    public void setUserViewType(String userViewType) {
        this.userViewType = userViewType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhooksUserMannequin webhooksUserMannequin = (WebhooksUserMannequin) o;
        return Objects.equals(this.avatarUrl, webhooksUserMannequin.avatarUrl)
                && Objects.equals(this.deleted, webhooksUserMannequin.deleted)
                && Objects.equals(this.email, webhooksUserMannequin.email)
                && Objects.equals(this.eventsUrl, webhooksUserMannequin.eventsUrl)
                && Objects.equals(this.followersUrl, webhooksUserMannequin.followersUrl)
                && Objects.equals(this.followingUrl, webhooksUserMannequin.followingUrl)
                && Objects.equals(this.gistsUrl, webhooksUserMannequin.gistsUrl)
                && Objects.equals(this.gravatarId, webhooksUserMannequin.gravatarId)
                && Objects.equals(this.htmlUrl, webhooksUserMannequin.htmlUrl)
                && Objects.equals(this.id, webhooksUserMannequin.id)
                && Objects.equals(this.login, webhooksUserMannequin.login)
                && Objects.equals(this.name, webhooksUserMannequin.name)
                && Objects.equals(this.nodeId, webhooksUserMannequin.nodeId)
                && Objects.equals(this.organizationsUrl, webhooksUserMannequin.organizationsUrl)
                && Objects.equals(this.receivedEventsUrl, webhooksUserMannequin.receivedEventsUrl)
                && Objects.equals(this.reposUrl, webhooksUserMannequin.reposUrl)
                && Objects.equals(this.siteAdmin, webhooksUserMannequin.siteAdmin)
                && Objects.equals(this.starredUrl, webhooksUserMannequin.starredUrl)
                && Objects.equals(this.subscriptionsUrl, webhooksUserMannequin.subscriptionsUrl)
                && Objects.equals(this.type, webhooksUserMannequin.type)
                && Objects.equals(this.url, webhooksUserMannequin.url)
                && Objects.equals(this.userViewType, webhooksUserMannequin.userViewType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                avatarUrl,
                deleted,
                email,
                eventsUrl,
                followersUrl,
                followingUrl,
                gistsUrl,
                gravatarId,
                htmlUrl,
                id,
                login,
                name,
                nodeId,
                organizationsUrl,
                receivedEventsUrl,
                reposUrl,
                siteAdmin,
                starredUrl,
                subscriptionsUrl,
                type,
                url,
                userViewType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksUserMannequin {\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    eventsUrl: ").append(toIndentedString(eventsUrl)).append("\n");
        sb.append("    followersUrl: ").append(toIndentedString(followersUrl)).append("\n");
        sb.append("    followingUrl: ").append(toIndentedString(followingUrl)).append("\n");
        sb.append("    gistsUrl: ").append(toIndentedString(gistsUrl)).append("\n");
        sb.append("    gravatarId: ").append(toIndentedString(gravatarId)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    organizationsUrl: ")
                .append(toIndentedString(organizationsUrl))
                .append("\n");
        sb.append("    receivedEventsUrl: ")
                .append(toIndentedString(receivedEventsUrl))
                .append("\n");
        sb.append("    reposUrl: ").append(toIndentedString(reposUrl)).append("\n");
        sb.append("    siteAdmin: ").append(toIndentedString(siteAdmin)).append("\n");
        sb.append("    starredUrl: ").append(toIndentedString(starredUrl)).append("\n");
        sb.append("    subscriptionsUrl: ")
                .append(toIndentedString(subscriptionsUrl))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    userViewType: ").append(toIndentedString(userViewType)).append("\n");
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
