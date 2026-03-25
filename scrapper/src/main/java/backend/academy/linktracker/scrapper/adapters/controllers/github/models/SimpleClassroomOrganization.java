package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * A GitHub organization.
 */
@Schema(name = "simple-classroom-organization", description = "A GitHub organization.")
@JsonTypeName("simple-classroom-organization")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SimpleClassroomOrganization {

    private Long id;

    private String login;

    private String nodeId;

    private URI htmlUrl;

    private String name = null;

    private String avatarUrl;

    public SimpleClassroomOrganization() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SimpleClassroomOrganization(
            Long id, String login, String nodeId, URI htmlUrl, String name, String avatarUrl) {
        this.id = id;
        this.login = login;
        this.nodeId = nodeId;
        this.htmlUrl = htmlUrl;
        this.name = name;
        this.avatarUrl = avatarUrl;
    }

    public SimpleClassroomOrganization id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SimpleClassroomOrganization login(String login) {
        this.login = login;
        return this;
    }

    /**
     * Get login
     * @return login
     */
    @NotNull
    @Schema(name = "login", example = "github", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public SimpleClassroomOrganization nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", example = "MDEyOk9yZ2FuaXphdGlvbjE=", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public SimpleClassroomOrganization htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(name = "html_url", example = "https://github.com/github", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public SimpleClassroomOrganization name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", example = "Github - Code thigns happen here", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SimpleClassroomOrganization avatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    /**
     * Get avatarUrl
     * @return avatarUrl
     */
    @NotNull
    @Schema(
            name = "avatar_url",
            example = "https://github.com/images/error/octocat_happy.gif",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("avatar_url")
    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SimpleClassroomOrganization simpleClassroomOrganization = (SimpleClassroomOrganization) o;
        return Objects.equals(this.id, simpleClassroomOrganization.id)
                && Objects.equals(this.login, simpleClassroomOrganization.login)
                && Objects.equals(this.nodeId, simpleClassroomOrganization.nodeId)
                && Objects.equals(this.htmlUrl, simpleClassroomOrganization.htmlUrl)
                && Objects.equals(this.name, simpleClassroomOrganization.name)
                && Objects.equals(this.avatarUrl, simpleClassroomOrganization.avatarUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, nodeId, htmlUrl, name, avatarUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimpleClassroomOrganization {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
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
