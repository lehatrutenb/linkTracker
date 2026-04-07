package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * EnvironmentApprovalsEnvironmentsInner
 */
@JsonTypeName("environment_approvals_environments_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class EnvironmentApprovalsEnvironmentsInner {

    private Optional<Long> id = Optional.empty();

    private Optional<String> nodeId = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> url = Optional.empty();

    private Optional<String> htmlUrl = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> createdAt = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> updatedAt = Optional.empty();

    public EnvironmentApprovalsEnvironmentsInner id(Long id) {
        this.id = Optional.ofNullable(id);
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
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public EnvironmentApprovalsEnvironmentsInner nodeId(String nodeId) {
        this.nodeId = Optional.ofNullable(nodeId);
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
    public Optional<String> getNodeId() {
        return nodeId;
    }

    public void setNodeId(Optional<String> nodeId) {
        this.nodeId = nodeId;
    }

    public EnvironmentApprovalsEnvironmentsInner name(String name) {
        this.name = Optional.ofNullable(name);
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
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public EnvironmentApprovalsEnvironmentsInner url(String url) {
        this.url = Optional.ofNullable(url);
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
    public Optional<String> getUrl() {
        return url;
    }

    public void setUrl(Optional<String> url) {
        this.url = url;
    }

    public EnvironmentApprovalsEnvironmentsInner htmlUrl(String htmlUrl) {
        this.htmlUrl = Optional.ofNullable(htmlUrl);
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
    public Optional<String> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(Optional<String> htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public EnvironmentApprovalsEnvironmentsInner createdAt(OffsetDateTime createdAt) {
        this.createdAt = Optional.ofNullable(createdAt);
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
    public Optional<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Optional<OffsetDateTime> createdAt) {
        this.createdAt = createdAt;
    }

    public EnvironmentApprovalsEnvironmentsInner updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = Optional.ofNullable(updatedAt);
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
    public Optional<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Optional<OffsetDateTime> updatedAt) {
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
