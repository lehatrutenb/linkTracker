package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * WebhooksProject
 */
@JsonTypeName("webhooks_project")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksProject {

    private JsonNullable<String> body = JsonNullable.<String>undefined();

    private URI columnsUrl;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private JsonNullable<User> creator = JsonNullable.<User>undefined();

    private URI htmlUrl;

    private Long id;

    private String name;

    private String nodeId;

    private Long number;

    private URI ownerUrl;

    /**
     * State of the project; either 'open' or 'closed'
     */
    public enum StateEnum {
        OPEN("open"),

        CLOSED("closed");

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
    private OffsetDateTime updatedAt;

    private URI url;

    public WebhooksProject() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksProject(
            String body,
            URI columnsUrl,
            OffsetDateTime createdAt,
            User creator,
            URI htmlUrl,
            Long id,
            String name,
            String nodeId,
            Long number,
            URI ownerUrl,
            StateEnum state,
            OffsetDateTime updatedAt,
            URI url) {
        this.body = JsonNullable.of(body);
        this.columnsUrl = columnsUrl;
        this.createdAt = createdAt;
        this.creator = JsonNullable.of(creator);
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.name = name;
        this.nodeId = nodeId;
        this.number = number;
        this.ownerUrl = ownerUrl;
        this.state = state;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public WebhooksProject body(String body) {
        this.body = JsonNullable.of(body);
        return this;
    }

    /**
     * Body of the project
     * @return body
     */
    @NotNull
    @Schema(name = "body", description = "Body of the project", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("body")
    public JsonNullable<String> getBody() {
        return body;
    }

    public void setBody(JsonNullable<String> body) {
        this.body = body;
    }

    public WebhooksProject columnsUrl(URI columnsUrl) {
        this.columnsUrl = columnsUrl;
        return this;
    }

    /**
     * Get columnsUrl
     * @return columnsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "columns_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("columns_url")
    public URI getColumnsUrl() {
        return columnsUrl;
    }

    public void setColumnsUrl(URI columnsUrl) {
        this.columnsUrl = columnsUrl;
    }

    public WebhooksProject createdAt(OffsetDateTime createdAt) {
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

    public WebhooksProject creator(User creator) {
        this.creator = JsonNullable.of(creator);
        return this;
    }

    /**
     * Get creator
     * @return creator
     */
    @NotNull
    @Valid
    @Schema(name = "creator", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("creator")
    public JsonNullable<User> getCreator() {
        return creator;
    }

    public void setCreator(JsonNullable<User> creator) {
        this.creator = creator;
    }

    public WebhooksProject htmlUrl(URI htmlUrl) {
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

    public WebhooksProject id(Long id) {
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

    public WebhooksProject name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the project
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "Name of the project", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebhooksProject nodeId(String nodeId) {
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

    public WebhooksProject number(Long number) {
        this.number = number;
        return this;
    }

    /**
     * Get number
     * @return number
     */
    @NotNull
    @Schema(name = "number", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public WebhooksProject ownerUrl(URI ownerUrl) {
        this.ownerUrl = ownerUrl;
        return this;
    }

    /**
     * Get ownerUrl
     * @return ownerUrl
     */
    @NotNull
    @Valid
    @Schema(name = "owner_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("owner_url")
    public URI getOwnerUrl() {
        return ownerUrl;
    }

    public void setOwnerUrl(URI ownerUrl) {
        this.ownerUrl = ownerUrl;
    }

    public WebhooksProject state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * State of the project; either 'open' or 'closed'
     * @return state
     */
    @NotNull
    @Schema(
            name = "state",
            description = "State of the project; either 'open' or 'closed'",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public WebhooksProject updatedAt(OffsetDateTime updatedAt) {
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

    public WebhooksProject url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
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
        WebhooksProject webhooksProject = (WebhooksProject) o;
        return Objects.equals(this.body, webhooksProject.body)
                && Objects.equals(this.columnsUrl, webhooksProject.columnsUrl)
                && Objects.equals(this.createdAt, webhooksProject.createdAt)
                && Objects.equals(this.creator, webhooksProject.creator)
                && Objects.equals(this.htmlUrl, webhooksProject.htmlUrl)
                && Objects.equals(this.id, webhooksProject.id)
                && Objects.equals(this.name, webhooksProject.name)
                && Objects.equals(this.nodeId, webhooksProject.nodeId)
                && Objects.equals(this.number, webhooksProject.number)
                && Objects.equals(this.ownerUrl, webhooksProject.ownerUrl)
                && Objects.equals(this.state, webhooksProject.state)
                && Objects.equals(this.updatedAt, webhooksProject.updatedAt)
                && Objects.equals(this.url, webhooksProject.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                body,
                columnsUrl,
                createdAt,
                creator,
                htmlUrl,
                id,
                name,
                nodeId,
                number,
                ownerUrl,
                state,
                updatedAt,
                url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksProject {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    columnsUrl: ").append(toIndentedString(columnsUrl)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    ownerUrl: ").append(toIndentedString(ownerUrl)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
