package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * ProjectsAddFieldForOrgRequestOneOf3
 */
@JsonTypeName("projects_add_field_for_org_request_oneOf_3")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsAddFieldForOrgRequestOneOf3
        implements ProjectsAddFieldForOrgRequest, ProjectsAddFieldForUserRequest {

    private String name;

    /**
     * The field's data type.
     */
    public enum DataTypeEnum {
        ITERATION("iteration");

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

    private ProjectsV2FieldIterationConfiguration iterationConfiguration;

    public ProjectsAddFieldForOrgRequestOneOf3() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProjectsAddFieldForOrgRequestOneOf3(
            String name, DataTypeEnum dataType, ProjectsV2FieldIterationConfiguration iterationConfiguration) {
        this.name = name;
        this.dataType = dataType;
        this.iterationConfiguration = iterationConfiguration;
    }

    public ProjectsAddFieldForOrgRequestOneOf3 name(String name) {
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

    public ProjectsAddFieldForOrgRequestOneOf3 dataType(DataTypeEnum dataType) {
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

    public ProjectsAddFieldForOrgRequestOneOf3 iterationConfiguration(
            ProjectsV2FieldIterationConfiguration iterationConfiguration) {
        this.iterationConfiguration = iterationConfiguration;
        return this;
    }

    /**
     * Get iterationConfiguration
     * @return iterationConfiguration
     */
    @NotNull
    @Valid
    @Schema(name = "iteration_configuration", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("iteration_configuration")
    public ProjectsV2FieldIterationConfiguration getIterationConfiguration() {
        return iterationConfiguration;
    }

    public void setIterationConfiguration(ProjectsV2FieldIterationConfiguration iterationConfiguration) {
        this.iterationConfiguration = iterationConfiguration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectsAddFieldForOrgRequestOneOf3 projectsAddFieldForOrgRequestOneOf3 =
                (ProjectsAddFieldForOrgRequestOneOf3) o;
        return Objects.equals(this.name, projectsAddFieldForOrgRequestOneOf3.name)
                && Objects.equals(this.dataType, projectsAddFieldForOrgRequestOneOf3.dataType)
                && Objects.equals(
                        this.iterationConfiguration, projectsAddFieldForOrgRequestOneOf3.iterationConfiguration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dataType, iterationConfiguration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsAddFieldForOrgRequestOneOf3 {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    iterationConfiguration: ")
                .append(toIndentedString(iterationConfiguration))
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
