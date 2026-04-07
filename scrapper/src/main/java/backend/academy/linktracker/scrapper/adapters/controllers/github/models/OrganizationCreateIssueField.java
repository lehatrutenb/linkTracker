package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * OrganizationCreateIssueField
 */
@JsonTypeName("organization-create-issue-field")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrganizationCreateIssueField {

    private String name;

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    /**
     * The data type of the issue field.
     */
    public enum DataTypeEnum {
        TEXT("text"),

        DATE("date"),

        SINGLE_SELECT("single_select"),

        NUMBER("number");

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

    /**
     * The visibility of the issue field. Can be `organization_members_only` (visible only within the organization) or `all` (visible to all users who can see issues). Only used when the visibility settings feature is enabled. Defaults to `organization_members_only`.
     */
    public enum VisibilityEnum {
        ORGANIZATION_MEMBERS_ONLY("organization_members_only"),

        ALL("all");

        private final String value;

        VisibilityEnum(String value) {
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
        public static VisibilityEnum fromValue(String value) {
            for (VisibilityEnum b : VisibilityEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<VisibilityEnum> visibility = Optional.empty();

    @Valid
    private JsonNullable<List<@Valid OrganizationCreateIssueFieldOptionsInner>> options =
            JsonNullable.<List<@Valid OrganizationCreateIssueFieldOptionsInner>>undefined();

    public OrganizationCreateIssueField() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrganizationCreateIssueField(String name, DataTypeEnum dataType) {
        this.name = name;
        this.dataType = dataType;
    }

    public OrganizationCreateIssueField name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the issue field.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "Name of the issue field.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrganizationCreateIssueField description(String description) {
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Description of the issue field.
     * @return description
     */
    @Schema(
            name = "description",
            description = "Description of the issue field.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public OrganizationCreateIssueField dataType(DataTypeEnum dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * The data type of the issue field.
     * @return dataType
     */
    @NotNull
    @Schema(
            name = "data_type",
            description = "The data type of the issue field.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("data_type")
    public DataTypeEnum getDataType() {
        return dataType;
    }

    public void setDataType(DataTypeEnum dataType) {
        this.dataType = dataType;
    }

    public OrganizationCreateIssueField visibility(VisibilityEnum visibility) {
        this.visibility = Optional.ofNullable(visibility);
        return this;
    }

    /**
     * The visibility of the issue field. Can be `organization_members_only` (visible only within the organization) or `all` (visible to all users who can see issues). Only used when the visibility settings feature is enabled. Defaults to `organization_members_only`.
     * @return visibility
     */
    @Schema(
            name = "visibility",
            description =
                    "The visibility of the issue field. Can be `organization_members_only` (visible only within the organization) or `all` (visible to all users who can see issues). Only used when the visibility settings feature is enabled. Defaults to `organization_members_only`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("visibility")
    public Optional<VisibilityEnum> getVisibility() {
        return visibility;
    }

    public void setVisibility(Optional<VisibilityEnum> visibility) {
        this.visibility = visibility;
    }

    public OrganizationCreateIssueField options(List<@Valid OrganizationCreateIssueFieldOptionsInner> options) {
        this.options = JsonNullable.of(options);
        return this;
    }

    public OrganizationCreateIssueField addOptionsItem(OrganizationCreateIssueFieldOptionsInner optionsItem) {
        if (this.options == null || !this.options.isPresent()) {
            this.options = JsonNullable.of(new ArrayList<>());
        }
        this.options.get().add(optionsItem);
        return this;
    }

    /**
     * Options for single select fields. Required when data_type is 'single_select'.
     * @return options
     */
    @Valid
    @Schema(
            name = "options",
            description = "Options for single select fields. Required when data_type is 'single_select'.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("options")
    public JsonNullable<List<@Valid OrganizationCreateIssueFieldOptionsInner>> getOptions() {
        return options;
    }

    public void setOptions(JsonNullable<List<@Valid OrganizationCreateIssueFieldOptionsInner>> options) {
        this.options = options;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrganizationCreateIssueField organizationCreateIssueField = (OrganizationCreateIssueField) o;
        return Objects.equals(this.name, organizationCreateIssueField.name)
                && equalsNullable(this.description, organizationCreateIssueField.description)
                && Objects.equals(this.dataType, organizationCreateIssueField.dataType)
                && Objects.equals(this.visibility, organizationCreateIssueField.visibility)
                && equalsNullable(this.options, organizationCreateIssueField.options);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hashCodeNullable(description), dataType, visibility, hashCodeNullable(options));
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
        sb.append("class OrganizationCreateIssueField {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
