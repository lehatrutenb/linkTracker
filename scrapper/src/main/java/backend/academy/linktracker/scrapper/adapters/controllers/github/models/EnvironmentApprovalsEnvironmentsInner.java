package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * EnvironmentApprovalsEnvironmentsInner
 */
@JsonTypeName("environment_approvals_environments_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class EnvironmentApprovalsEnvironmentsInner {

    private Long id;

    private String nodeId;

    private String name;

    private String url;

    private String htmlUrl;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    public EnvironmentApprovalsEnvironmentsInner id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the environment.
     * @return id
     */
    @Schema(
            name = "id",
            example = "56780428",
            description = "The id of the environment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EnvironmentApprovalsEnvironmentsInner nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(
            name = "node_id",
            example = "MDExOkVudmlyb25tZW50NTY3ODA0Mjg=",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public EnvironmentApprovalsEnvironmentsInner name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the environment.
     * @return name
     */
    @Schema(
            name = "name",
            example = "staging",
            description = "The name of the environment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnvironmentApprovalsEnvironmentsInner url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(
            name = "url",
            example = "https://api.github.com/repos/github/hello-world/environments/staging",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public EnvironmentApprovalsEnvironmentsInner htmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Schema(
            name = "html_url",
            example = "https://github.com/github/hello-world/deployments/activity_log?environments_filter=staging",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public EnvironmentApprovalsEnvironmentsInner createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time that the environment was created, in ISO 8601 format.
     * @return createdAt
     */
    @Valid
    @Schema(
            name = "created_at",
            example = "2020-11-23T22:00:40Z",
            description = "The time that the environment was created, in ISO 8601 format.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public EnvironmentApprovalsEnvironmentsInner updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The time that the environment was last updated, in ISO 8601 format.
     * @return updatedAt
     */
    @Valid
    @Schema(
            name = "updated_at",
            example = "2020-11-23T22:00:40Z",
            description = "The time that the environment was last updated, in ISO 8601 format.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnvironmentApprovalsEnvironmentsInner environmentApprovalsEnvironmentsInner =
                (EnvironmentApprovalsEnvironmentsInner) o;
        return Objects.equals(this.id, environmentApprovalsEnvironmentsInner.id)
                && Objects.equals(this.nodeId, environmentApprovalsEnvironmentsInner.nodeId)
                && Objects.equals(this.name, environmentApprovalsEnvironmentsInner.name)
                && Objects.equals(this.url, environmentApprovalsEnvironmentsInner.url)
                && Objects.equals(this.htmlUrl, environmentApprovalsEnvironmentsInner.htmlUrl)
                && Objects.equals(this.createdAt, environmentApprovalsEnvironmentsInner.createdAt)
                && Objects.equals(this.updatedAt, environmentApprovalsEnvironmentsInner.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nodeId, name, url, htmlUrl, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvironmentApprovalsEnvironmentsInner {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
