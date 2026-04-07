package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;

/**
 * A GitHub repository view for Classroom
 */
@Schema(name = "simple-classroom-repository", description = "A GitHub repository view for Classroom")
@JsonTypeName("simple-classroom-repository")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SimpleClassroomRepository {

    private Long id;

    private String fullName;

    private URI htmlUrl;

    private String nodeId;

    private Boolean _private;

    private String defaultBranch;

    public SimpleClassroomRepository() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SimpleClassroomRepository(
            Long id, String fullName, URI htmlUrl, String nodeId, Boolean _private, String defaultBranch) {
        this.id = id;
        this.fullName = fullName;
        this.htmlUrl = htmlUrl;
        this.nodeId = nodeId;
        this._private = _private;
        this.defaultBranch = defaultBranch;
    }

    public SimpleClassroomRepository id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * A unique identifier of the repository.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "1296269",
            description = "A unique identifier of the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SimpleClassroomRepository fullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * The full, globally unique name of the repository.
     * @return fullName
     */
    @NotNull
    @Schema(
            name = "full_name",
            example = "octocat/Hello-World",
            description = "The full, globally unique name of the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public SimpleClassroomRepository htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * The URL to view the repository on GitHub.com.
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "html_url",
            example = "https://github.com/octocat/Hello-World",
            description = "The URL to view the repository on GitHub.com.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public SimpleClassroomRepository nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * The GraphQL identifier of the repository.
     * @return nodeId
     */
    @NotNull
    @Schema(
            name = "node_id",
            example = "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
            description = "The GraphQL identifier of the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public SimpleClassroomRepository _private(Boolean _private) {
        this._private = _private;
        return this;
    }

    /**
     * Whether the repository is private.
     * @return _private
     */
    @NotNull
    @Schema(
            name = "private",
            description = "Whether the repository is private.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("private")
    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public SimpleClassroomRepository defaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }

    /**
     * The default branch for the repository.
     * @return defaultBranch
     */
    @NotNull
    @Schema(
            name = "default_branch",
            example = "main",
            description = "The default branch for the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("default_branch")
    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SimpleClassroomRepository simpleClassroomRepository = (SimpleClassroomRepository) o;
        return Objects.equals(this.id, simpleClassroomRepository.id)
                && Objects.equals(this.fullName, simpleClassroomRepository.fullName)
                && Objects.equals(this.htmlUrl, simpleClassroomRepository.htmlUrl)
                && Objects.equals(this.nodeId, simpleClassroomRepository.nodeId)
                && Objects.equals(this._private, simpleClassroomRepository._private)
                && Objects.equals(this.defaultBranch, simpleClassroomRepository.defaultBranch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, htmlUrl, nodeId, _private, defaultBranch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimpleClassroomRepository {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
        sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
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
