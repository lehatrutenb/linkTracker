package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * ProjectsAddFieldForOrgRequestOneOf1
 */
@JsonTypeName("projects_add_field_for_org_request_oneOf_1")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsAddFieldForOrgRequestOneOf1
        implements ProjectsAddFieldForOrgRequest, ProjectsAddFieldForUserRequest {

    private String name;

    /**
     * The field's data type.
     */
    public enum DataTypeEnum {
        TEXT("text"),

        NUMBER("number"),

        DATE("date");

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

    public ProjectsAddFieldForOrgRequestOneOf1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProjectsAddFieldForOrgRequestOneOf1(String name, DataTypeEnum dataType) {
        this.name = name;
        this.dataType = dataType;
    }

    public ProjectsAddFieldForOrgRequestOneOf1 name(String name) {
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

    public ProjectsAddFieldForOrgRequestOneOf1 dataType(DataTypeEnum dataType) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectsAddFieldForOrgRequestOneOf1 projectsAddFieldForOrgRequestOneOf1 =
                (ProjectsAddFieldForOrgRequestOneOf1) o;
        return Objects.equals(this.name, projectsAddFieldForOrgRequestOneOf1.name)
                && Objects.equals(this.dataType, projectsAddFieldForOrgRequestOneOf1.dataType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dataType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsAddFieldForOrgRequestOneOf1 {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
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
