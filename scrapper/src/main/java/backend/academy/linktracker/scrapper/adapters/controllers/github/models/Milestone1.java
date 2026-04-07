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
 * A collection of related issues and pull requests.
 */
@Schema(name = "Milestone_1", description = "A collection of related issues and pull requests.")
@JsonTypeName("Milestone_1")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Milestone1 {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> closedAt = JsonNullable.<OffsetDateTime>undefined();

    private Long closedIssues;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private JsonNullable<User> creator = JsonNullable.<User>undefined();

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> dueOn = JsonNullable.<OffsetDateTime>undefined();

    private URI htmlUrl;

    private Long id;

    private URI labelsUrl;

    private String nodeId;

    private Long number;

    private Long openIssues;

    /**
     * The state of the milestone.
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

    private String title;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private URI url;

    public Milestone1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Milestone1(
            OffsetDateTime closedAt,
            Long closedIssues,
            OffsetDateTime createdAt,
            User creator,
            String description,
            OffsetDateTime dueOn,
            URI htmlUrl,
            Long id,
            URI labelsUrl,
            String nodeId,
            Long number,
            Long openIssues,
            StateEnum state,
            String title,
            OffsetDateTime updatedAt,
            URI url) {
        this.closedAt = JsonNullable.of(closedAt);
        this.closedIssues = closedIssues;
        this.createdAt = createdAt;
        this.creator = JsonNullable.of(creator);
        this.description = JsonNullable.of(description);
        this.dueOn = JsonNullable.of(dueOn);
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.labelsUrl = labelsUrl;
        this.nodeId = nodeId;
        this.number = number;
        this.openIssues = openIssues;
        this.state = state;
        this.title = title;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public Milestone1 closedAt(OffsetDateTime closedAt) {
        this.closedAt = JsonNullable.of(closedAt);
        return this;
    }

    /**
     * Get closedAt
     * @return closedAt
     */
    @NotNull
    @Valid
    @Schema(name = "closed_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("closed_at")
    public JsonNullable<OffsetDateTime> getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(JsonNullable<OffsetDateTime> closedAt) {
        this.closedAt = closedAt;
    }

    public Milestone1 closedIssues(Long closedIssues) {
        this.closedIssues = closedIssues;
        return this;
    }

    /**
     * Get closedIssues
     * @return closedIssues
     */
    @NotNull
    @Schema(name = "closed_issues", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("closed_issues")
    public Long getClosedIssues() {
        return closedIssues;
    }

    public void setClosedIssues(Long closedIssues) {
        this.closedIssues = closedIssues;
    }

    public Milestone1 createdAt(OffsetDateTime createdAt) {
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

    public Milestone1 creator(User creator) {
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

    public Milestone1 description(String description) {
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public Milestone1 dueOn(OffsetDateTime dueOn) {
        this.dueOn = JsonNullable.of(dueOn);
        return this;
    }

    /**
     * Get dueOn
     * @return dueOn
     */
    @NotNull
    @Valid
    @Schema(name = "due_on", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("due_on")
    public JsonNullable<OffsetDateTime> getDueOn() {
        return dueOn;
    }

    public void setDueOn(JsonNullable<OffsetDateTime> dueOn) {
        this.dueOn = dueOn;
    }

    public Milestone1 htmlUrl(URI htmlUrl) {
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

    public Milestone1 id(Long id) {
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

    public Milestone1 labelsUrl(URI labelsUrl) {
        this.labelsUrl = labelsUrl;
        return this;
    }

    /**
     * Get labelsUrl
     * @return labelsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "labels_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("labels_url")
    public URI getLabelsUrl() {
        return labelsUrl;
    }

    public void setLabelsUrl(URI labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public Milestone1 nodeId(String nodeId) {
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

    public Milestone1 number(Long number) {
        this.number = number;
        return this;
    }

    /**
     * The number of the milestone.
     * @return number
     */
    @NotNull
    @Schema(name = "number", description = "The number of the milestone.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Milestone1 openIssues(Long openIssues) {
        this.openIssues = openIssues;
        return this;
    }

    /**
     * Get openIssues
     * @return openIssues
     */
    @NotNull
    @Schema(name = "open_issues", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("open_issues")
    public Long getOpenIssues() {
        return openIssues;
    }

    public void setOpenIssues(Long openIssues) {
        this.openIssues = openIssues;
    }

    public Milestone1 state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * The state of the milestone.
     * @return state
     */
    @NotNull
    @Schema(name = "state", description = "The state of the milestone.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public Milestone1 title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The title of the milestone.
     * @return title
     */
    @NotNull
    @Schema(name = "title", description = "The title of the milestone.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Milestone1 updatedAt(OffsetDateTime updatedAt) {
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

    public Milestone1 url(URI url) {
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
        Milestone1 milestone1 = (Milestone1) o;
        return Objects.equals(this.closedAt, milestone1.closedAt)
                && Objects.equals(this.closedIssues, milestone1.closedIssues)
                && Objects.equals(this.createdAt, milestone1.createdAt)
                && Objects.equals(this.creator, milestone1.creator)
                && Objects.equals(this.description, milestone1.description)
                && Objects.equals(this.dueOn, milestone1.dueOn)
                && Objects.equals(this.htmlUrl, milestone1.htmlUrl)
                && Objects.equals(this.id, milestone1.id)
                && Objects.equals(this.labelsUrl, milestone1.labelsUrl)
                && Objects.equals(this.nodeId, milestone1.nodeId)
                && Objects.equals(this.number, milestone1.number)
                && Objects.equals(this.openIssues, milestone1.openIssues)
                && Objects.equals(this.state, milestone1.state)
                && Objects.equals(this.title, milestone1.title)
                && Objects.equals(this.updatedAt, milestone1.updatedAt)
                && Objects.equals(this.url, milestone1.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                closedAt,
                closedIssues,
                createdAt,
                creator,
                description,
                dueOn,
                htmlUrl,
                id,
                labelsUrl,
                nodeId,
                number,
                openIssues,
                state,
                title,
                updatedAt,
                url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Milestone1 {\n");
        sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
        sb.append("    closedIssues: ").append(toIndentedString(closedIssues)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dueOn: ").append(toIndentedString(dueOn)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    labelsUrl: ").append(toIndentedString(labelsUrl)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    openIssues: ").append(toIndentedString(openIssues)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
