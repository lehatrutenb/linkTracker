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

/**
 * ProjectsAddFieldForOrgRequestOneOf2
 */
@JsonTypeName("projects_add_field_for_org_request_oneOf_2")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsAddFieldForOrgRequestOneOf2
        implements ProjectsAddFieldForOrgRequest, ProjectsAddFieldForUserRequest {

    private String name;

    /**
     * The field's data type.
     */
    public enum DataTypeEnum {
        SINGLE_SELECT("single_select");

        private final String value;

        DataTypeEnum(String value) {
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
        public static DataTypeEnum fromValue(String value) {
            for (DataTypeEnum b : DataTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private DataTypeEnum dataType;

    @Valid
    private List<@Valid ProjectsV2FieldSingleSelectOption> singleSelectOptions = new ArrayList<>();

    public ProjectsAddFieldForOrgRequestOneOf2() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProjectsAddFieldForOrgRequestOneOf2(
            String name, DataTypeEnum dataType, List<@Valid ProjectsV2FieldSingleSelectOption> singleSelectOptions) {
        this.name = name;
        this.dataType = dataType;
        this.singleSelectOptions = singleSelectOptions;
    }

    public ProjectsAddFieldForOrgRequestOneOf2 name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the field.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "The name of the field.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectsAddFieldForOrgRequestOneOf2 dataType(DataTypeEnum dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * The field's data type.
     * @return dataType
     */
    @NotNull
    @Schema(name = "data_type", description = "The field's data type.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("data_type")
    public DataTypeEnum getDataType() {
        return dataType;
    }

    public void setDataType(DataTypeEnum dataType) {
        this.dataType = dataType;
    }

    public ProjectsAddFieldForOrgRequestOneOf2 singleSelectOptions(
            List<@Valid ProjectsV2FieldSingleSelectOption> singleSelectOptions) {
        this.singleSelectOptions = singleSelectOptions;
        return this;
    }

    public ProjectsAddFieldForOrgRequestOneOf2 addSingleSelectOptionsItem(
            ProjectsV2FieldSingleSelectOption singleSelectOptionsItem) {
        if (this.singleSelectOptions == null) {
            this.singleSelectOptions = new ArrayList<>();
        }
        this.singleSelectOptions.add(singleSelectOptionsItem);
        return this;
    }

    /**
     * The options available for single select fields. At least one option must be provided when creating a single select field.
     * @return singleSelectOptions
     */
    @NotNull
    @Valid
    @Schema(
            name = "single_select_options",
            description =
                    "The options available for single select fields. At least one option must be provided when creating a single select field.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("single_select_options")
    public List<@Valid ProjectsV2FieldSingleSelectOption> getSingleSelectOptions() {
        return singleSelectOptions;
    }

    public void setSingleSelectOptions(List<@Valid ProjectsV2FieldSingleSelectOption> singleSelectOptions) {
        this.singleSelectOptions = singleSelectOptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectsAddFieldForOrgRequestOneOf2 projectsAddFieldForOrgRequestOneOf2 =
                (ProjectsAddFieldForOrgRequestOneOf2) o;
        return Objects.equals(this.name, projectsAddFieldForOrgRequestOneOf2.name)
                && Objects.equals(this.dataType, projectsAddFieldForOrgRequestOneOf2.dataType)
                && Objects.equals(this.singleSelectOptions, projectsAddFieldForOrgRequestOneOf2.singleSelectOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dataType, singleSelectOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsAddFieldForOrgRequestOneOf2 {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    singleSelectOptions: ")
                .append(toIndentedString(singleSelectOptions))
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
