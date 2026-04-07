package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * ProjectsCreateViewForOrgRequest
 */
@JsonTypeName("projects_create_view_for_org_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsCreateViewForOrgRequest {

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

    private Optional<String> filter = Optional.empty();

    @Valid
    private List<Long> visibleFields = new ArrayList<>();

    public ProjectsCreateViewForOrgRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProjectsCreateViewForOrgRequest(String name, LayoutEnum layout) {
        this.name = name;
        this.layout = layout;
    }

    public ProjectsCreateViewForOrgRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the view.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "Sprint Board",
            description = "The name of the view.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectsCreateViewForOrgRequest layout(LayoutEnum layout) {
        this.layout = layout;
        return this;
    }

    /**
     * The layout of the view.
     * @return layout
     */
    @NotNull
    @Schema(
            name = "layout",
            example = "board",
            description = "The layout of the view.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("layout")
    public LayoutEnum getLayout() {
        return layout;
    }

    public void setLayout(LayoutEnum layout) {
        this.layout = layout;
    }

    public ProjectsCreateViewForOrgRequest filter(String filter) {
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    /**
     * The filter query for the view. See [Filtering projects](https://docs.github.com/issues/planning-and-tracking-with-projects/customizing-views-in-your-project/filtering-projects) for more information.
     * @return filter
     */
    @Schema(
            name = "filter",
            example = "is:issue is:open",
            description =
                    "The filter query for the view. See [Filtering projects](https://docs.github.com/issues/planning-and-tracking-with-projects/customizing-views-in-your-project/filtering-projects) for more information.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("filter")
    public Optional<String> getFilter() {
        return filter;
    }

    public void setFilter(Optional<String> filter) {
        this.filter = filter;
    }

    public ProjectsCreateViewForOrgRequest visibleFields(List<Long> visibleFields) {
        this.visibleFields = visibleFields;
        return this;
    }

    public ProjectsCreateViewForOrgRequest addVisibleFieldsItem(Long visibleFieldsItem) {
        if (this.visibleFields == null) {
            this.visibleFields = new ArrayList<>();
        }
        this.visibleFields.add(visibleFieldsItem);
        return this;
    }

    /**
     * `visible_fields` is not applicable to `roadmap` layout views. For `table` and `board` layouts, this represents the field IDs that should be visible in the view. If not provided, the default visible fields will be used.
     * @return visibleFields
     */
    @Schema(
            name = "visible_fields",
            example = "[123,456,789]",
            description =
                    "`visible_fields` is not applicable to `roadmap` layout views. For `table` and `board` layouts, this represents the field IDs that should be visible in the view. If not provided, the default visible fields will be used.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("visible_fields")
    public List<Long> getVisibleFields() {
        return visibleFields;
    }

    public void setVisibleFields(List<Long> visibleFields) {
        this.visibleFields = visibleFields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectsCreateViewForOrgRequest projectsCreateViewForOrgRequest = (ProjectsCreateViewForOrgRequest) o;
        return Objects.equals(this.name, projectsCreateViewForOrgRequest.name)
                && Objects.equals(this.layout, projectsCreateViewForOrgRequest.layout)
                && Objects.equals(this.filter, projectsCreateViewForOrgRequest.filter)
                && Objects.equals(this.visibleFields, projectsCreateViewForOrgRequest.visibleFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, layout, filter, visibleFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsCreateViewForOrgRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    visibleFields: ").append(toIndentedString(visibleFields)).append("\n");
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
