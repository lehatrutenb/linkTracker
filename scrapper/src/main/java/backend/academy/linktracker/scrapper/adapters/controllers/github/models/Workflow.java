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
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A GitHub Actions workflow
 */
@Schema(name = "workflow", description = "A GitHub Actions workflow")
@JsonTypeName("workflow")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Workflow {

    private Long id;

    private String nodeId;

    private String name;

    private String path;

    /**
     * Gets or Sets state
     */
    public enum StateEnum {
        ACTIVE("active"),

        DELETED("deleted"),

        DISABLED_FORK("disabled_fork"),

        DISABLED_INACTIVITY("disabled_inactivity"),

        DISABLED_MANUALLY("disabled_manually");

        private final String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            for (StateEnum b : StateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private StateEnum state;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private String url;

    private String htmlUrl;

    private String badgeUrl;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> deletedAt = Optional.empty();

    public Workflow() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Workflow(
            Long id,
            String nodeId,
            String name,
            String path,
            StateEnum state,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            String url,
            String htmlUrl,
            String badgeUrl) {
        this.id = id;
        this.nodeId = nodeId;
        this.name = name;
        this.path = path;
        this.state = state;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.badgeUrl = badgeUrl;
    }

    public Workflow id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", example = "5", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Workflow nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", example = "MDg6V29ya2Zsb3cxMg==", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Workflow name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", example = "CI", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Workflow path(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get path
     * @return path
     */
    @NotNull
    @Schema(name = "path", example = "ruby.yaml", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Workflow state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @NotNull
    @Schema(name = "state", example = "active", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public Workflow createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", example = "2019-12-06T14:20:20Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Workflow updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", example = "2019-12-06T14:20:20Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Workflow url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Schema(
            name = "url",
            example = "https://api.github.com/repos/actions/setup-ruby/workflows/5",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Workflow htmlUrl(String htmlUrl) {
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
            example = "https://github.com/actions/setup-ruby/blob/master/.github/workflows/ruby.yaml",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public Workflow badgeUrl(String badgeUrl) {
        this.badgeUrl = badgeUrl;
        return this;
    }

    /**
     * Get badgeUrl
     * @return badgeUrl
     */
    @NotNull
    @Schema(
            name = "badge_url",
            example = "https://github.com/actions/setup-ruby/workflows/CI/badge.svg",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("badge_url")
    public String getBadgeUrl() {
        return badgeUrl;
    }

    public void setBadgeUrl(String badgeUrl) {
        this.badgeUrl = badgeUrl;
    }

    public Workflow deletedAt(OffsetDateTime deletedAt) {
        this.deletedAt = Optional.ofNullable(deletedAt);
        return this;
    }

    /**
     * Get deletedAt
     * @return deletedAt
     */
    @Valid
    @Schema(name = "deleted_at", example = "2019-12-06T14:20:20Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deleted_at")
    public Optional<OffsetDateTime> getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Optional<OffsetDateTime> deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Workflow workflow = (Workflow) o;
        return Objects.equals(this.id, workflow.id)
                && Objects.equals(this.nodeId, workflow.nodeId)
                && Objects.equals(this.name, workflow.name)
                && Objects.equals(this.path, workflow.path)
                && Objects.equals(this.state, workflow.state)
                && Objects.equals(this.createdAt, workflow.createdAt)
                && Objects.equals(this.updatedAt, workflow.updatedAt)
                && Objects.equals(this.url, workflow.url)
                && Objects.equals(this.htmlUrl, workflow.htmlUrl)
                && Objects.equals(this.badgeUrl, workflow.badgeUrl)
                && Objects.equals(this.deletedAt, workflow.deletedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nodeId, name, path, state, createdAt, updatedAt, url, htmlUrl, badgeUrl, deletedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Workflow {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    badgeUrl: ").append(toIndentedString(badgeUrl)).append("\n");
        sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
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
