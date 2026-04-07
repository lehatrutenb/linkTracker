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
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A view inside a projects v2 project
 */
@Schema(name = "projects-v2-view", description = "A view inside a projects v2 project")
@JsonTypeName("projects-v2-view")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsV2View {

    private Long id;

    private Long number;

    private String name;

    /**
     * The layout of the view.
     */
    public enum LayoutEnum {
        TABLE("table"),

        BOARD("board"),

        ROADMAP("roadmap");

        private final String value;

        LayoutEnum(String value) {
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
        public static LayoutEnum fromValue(String value) {
            for (LayoutEnum b : LayoutEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private LayoutEnum layout;

    private String nodeId;

    private String projectUrl;

    private URI htmlUrl;

    private SimpleUser creator;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private JsonNullable<String> filter = JsonNullable.<String>undefined();

    @Valid
    private List<Long> visibleFields = new ArrayList<>();

    @Valid
    private List<List<ActionsGetWorkflowWorkflowIdParameter>> sortBy = new ArrayList<>();

    @Valid
    private List<Long> groupBy = new ArrayList<>();

    @Valid
    private List<Long> verticalGroupBy = new ArrayList<>();

    public ProjectsV2View() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProjectsV2View(
            Long id,
            Long number,
            String name,
            LayoutEnum layout,
            String nodeId,
            String projectUrl,
            URI htmlUrl,
            SimpleUser creator,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            List<Long> visibleFields,
            List<List<ActionsGetWorkflowWorkflowIdParameter>> sortBy,
            List<Long> groupBy,
            List<Long> verticalGroupBy) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.layout = layout;
        this.nodeId = nodeId;
        this.projectUrl = projectUrl;
        this.htmlUrl = htmlUrl;
        this.creator = creator;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.visibleFields = visibleFields;
        this.sortBy = sortBy;
        this.groupBy = groupBy;
        this.verticalGroupBy = verticalGroupBy;
    }

    public ProjectsV2View id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the view.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            description = "The unique identifier of the view.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProjectsV2View number(Long number) {
        this.number = number;
        return this;
    }

    /**
     * The number of the view within the project.
     * @return number
     */
    @NotNull
    @Schema(
            name = "number",
            description = "The number of the view within the project.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public ProjectsV2View name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the view.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "The name of the view.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectsV2View layout(LayoutEnum layout) {
        this.layout = layout;
        return this;
    }

    /**
     * The layout of the view.
     * @return layout
     */
    @NotNull
    @Schema(name = "layout", description = "The layout of the view.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("layout")
    public LayoutEnum getLayout() {
        return layout;
    }

    public void setLayout(LayoutEnum layout) {
        this.layout = layout;
    }

    public ProjectsV2View nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * The node ID of the view.
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", description = "The node ID of the view.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ProjectsV2View projectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
        return this;
    }

    /**
     * The API URL of the project that contains the view.
     * @return projectUrl
     */
    @NotNull
    @Schema(
            name = "project_url",
            example = "https://api.github.com/orgs/octocat/projectsV2/1",
            description = "The API URL of the project that contains the view.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("project_url")
    public String getProjectUrl() {
        return projectUrl;
    }

    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
    }

    public ProjectsV2View htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * The web URL of the view.
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "html_url",
            example = "https://github.com/orgs/octocat/projects/1/views/1",
            description = "The web URL of the view.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public ProjectsV2View creator(SimpleUser creator) {
        this.creator = creator;
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
    public SimpleUser getCreator() {
        return creator;
    }

    public void setCreator(SimpleUser creator) {
        this.creator = creator;
    }

    public ProjectsV2View createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time when the view was created.
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "created_at",
            example = "2022-04-28T12:00Z",
            description = "The time when the view was created.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ProjectsV2View updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The time when the view was last updated.
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "updated_at",
            example = "2022-04-28T12:00Z",
            description = "The time when the view was last updated.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ProjectsV2View filter(String filter) {
        this.filter = JsonNullable.of(filter);
        return this;
    }

    /**
     * The filter query for the view.
     * @return filter
     */
    @Schema(
            name = "filter",
            example = "is:issue is:open",
            description = "The filter query for the view.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("filter")
    public JsonNullable<String> getFilter() {
        return filter;
    }

    public void setFilter(JsonNullable<String> filter) {
        this.filter = filter;
    }

    public ProjectsV2View visibleFields(List<Long> visibleFields) {
        this.visibleFields = visibleFields;
        return this;
    }

    public ProjectsV2View addVisibleFieldsItem(Long visibleFieldsItem) {
        if (this.visibleFields == null) {
            this.visibleFields = new ArrayList<>();
        }
        this.visibleFields.add(visibleFieldsItem);
        return this;
    }

    /**
     * The list of field IDs that are visible in the view.
     * @return visibleFields
     */
    @NotNull
    @Schema(
            name = "visible_fields",
            description = "The list of field IDs that are visible in the view.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("visible_fields")
    public List<Long> getVisibleFields() {
        return visibleFields;
    }

    public void setVisibleFields(List<Long> visibleFields) {
        this.visibleFields = visibleFields;
    }

    public ProjectsV2View sortBy(List<List<ActionsGetWorkflowWorkflowIdParameter>> sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    public ProjectsV2View addSortByItem(List<ActionsGetWorkflowWorkflowIdParameter> sortByItem) {
        if (this.sortBy == null) {
            this.sortBy = new ArrayList<>();
        }
        this.sortBy.add(sortByItem);
        return this;
    }

    /**
     * The sorting configuration for the view. Each element is a tuple of [field_id, direction] where direction is \"asc\" or \"desc\".
     * @return sortBy
     */
    @NotNull
    @Valid
    @Schema(
            name = "sort_by",
            description =
                    "The sorting configuration for the view. Each element is a tuple of [field_id, direction] where direction is \"asc\" or \"desc\".",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sort_by")
    public List<List<ActionsGetWorkflowWorkflowIdParameter>> getSortBy() {
        return sortBy;
    }

    public void setSortBy(List<List<ActionsGetWorkflowWorkflowIdParameter>> sortBy) {
        this.sortBy = sortBy;
    }

    public ProjectsV2View groupBy(List<Long> groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    public ProjectsV2View addGroupByItem(Long groupByItem) {
        if (this.groupBy == null) {
            this.groupBy = new ArrayList<>();
        }
        this.groupBy.add(groupByItem);
        return this;
    }

    /**
     * The list of field IDs used for horizontal grouping.
     * @return groupBy
     */
    @NotNull
    @Schema(
            name = "group_by",
            description = "The list of field IDs used for horizontal grouping.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("group_by")
    public List<Long> getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(List<Long> groupBy) {
        this.groupBy = groupBy;
    }

    public ProjectsV2View verticalGroupBy(List<Long> verticalGroupBy) {
        this.verticalGroupBy = verticalGroupBy;
        return this;
    }

    public ProjectsV2View addVerticalGroupByItem(Long verticalGroupByItem) {
        if (this.verticalGroupBy == null) {
            this.verticalGroupBy = new ArrayList<>();
        }
        this.verticalGroupBy.add(verticalGroupByItem);
        return this;
    }

    /**
     * The list of field IDs used for vertical grouping (board layout).
     * @return verticalGroupBy
     */
    @NotNull
    @Schema(
            name = "vertical_group_by",
            description = "The list of field IDs used for vertical grouping (board layout).",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("vertical_group_by")
    public List<Long> getVerticalGroupBy() {
        return verticalGroupBy;
    }

    public void setVerticalGroupBy(List<Long> verticalGroupBy) {
        this.verticalGroupBy = verticalGroupBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectsV2View projectsV2View = (ProjectsV2View) o;
        return Objects.equals(this.id, projectsV2View.id)
                && Objects.equals(this.number, projectsV2View.number)
                && Objects.equals(this.name, projectsV2View.name)
                && Objects.equals(this.layout, projectsV2View.layout)
                && Objects.equals(this.nodeId, projectsV2View.nodeId)
                && Objects.equals(this.projectUrl, projectsV2View.projectUrl)
                && Objects.equals(this.htmlUrl, projectsV2View.htmlUrl)
                && Objects.equals(this.creator, projectsV2View.creator)
                && Objects.equals(this.createdAt, projectsV2View.createdAt)
                && Objects.equals(this.updatedAt, projectsV2View.updatedAt)
                && equalsNullable(this.filter, projectsV2View.filter)
                && Objects.equals(this.visibleFields, projectsV2View.visibleFields)
                && Objects.equals(this.sortBy, projectsV2View.sortBy)
                && Objects.equals(this.groupBy, projectsV2View.groupBy)
                && Objects.equals(this.verticalGroupBy, projectsV2View.verticalGroupBy);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                number,
                name,
                layout,
                nodeId,
                projectUrl,
                htmlUrl,
                creator,
                createdAt,
                updatedAt,
                hashCodeNullable(filter),
                visibleFields,
                sortBy,
                groupBy,
                verticalGroupBy);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsV2View {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    projectUrl: ").append(toIndentedString(projectUrl)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    visibleFields: ").append(toIndentedString(visibleFields)).append("\n");
        sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
        sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
        sb.append("    verticalGroupBy: ")
                .append(toIndentedString(verticalGroupBy))
                .append("\n");
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
