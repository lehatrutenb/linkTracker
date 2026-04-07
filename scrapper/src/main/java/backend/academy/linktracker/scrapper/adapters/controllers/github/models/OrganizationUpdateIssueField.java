package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * OrganizationUpdateIssueField
 */
@JsonTypeName("organization-update-issue-field")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrganizationUpdateIssueField {

    private Optional<String> name = Optional.empty();

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    /**
     * The visibility of the issue field. Can be `organization_members_only` (visible only within the organization) or `all` (visible to all users who can see issues). Only used when the visibility settings feature is enabled.
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
    private List<@Valid OrganizationCreateIssueFieldOptionsInner> options = new ArrayList<>();

    public OrganizationUpdateIssueField name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Name of the issue field.
     * @return name
     */
    @Schema(name = "name", description = "Name of the issue field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public OrganizationUpdateIssueField description(String description) {
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

    public OrganizationUpdateIssueField visibility(VisibilityEnum visibility) {
        this.visibility = Optional.ofNullable(visibility);
        return this;
    }

    /**
     * The visibility of the issue field. Can be `organization_members_only` (visible only within the organization) or `all` (visible to all users who can see issues). Only used when the visibility settings feature is enabled.
     * @return visibility
     */
    @Schema(
            name = "visibility",
            description =
                    "The visibility of the issue field. Can be `organization_members_only` (visible only within the organization) or `all` (visible to all users who can see issues). Only used when the visibility settings feature is enabled.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("visibility")
    public Optional<VisibilityEnum> getVisibility() {
        return visibility;
    }

    public void setVisibility(Optional<VisibilityEnum> visibility) {
        this.visibility = visibility;
    }

    public OrganizationUpdateIssueField options(List<@Valid OrganizationCreateIssueFieldOptionsInner> options) {
        this.options = options;
        return this;
    }

    public OrganizationUpdateIssueField addOptionsItem(OrganizationCreateIssueFieldOptionsInner optionsItem) {
        if (this.options == null) {
            this.options = new ArrayList<>();
        }
        this.options.add(optionsItem);
        return this;
    }

    /**
     * Options for single select fields. Only applicable when updating single_select fields.
     * @return options
     */
    @Valid
    @Schema(
            name = "options",
            description = "Options for single select fields. Only applicable when updating single_select fields.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("options")
    public List<@Valid OrganizationCreateIssueFieldOptionsInner> getOptions() {
        return options;
    }

    public void setOptions(List<@Valid OrganizationCreateIssueFieldOptionsInner> options) {
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
        OrganizationUpdateIssueField organizationUpdateIssueField = (OrganizationUpdateIssueField) o;
        return Objects.equals(this.name, organizationUpdateIssueField.name)
                && equalsNullable(this.description, organizationUpdateIssueField.description)
                && Objects.equals(this.visibility, organizationUpdateIssueField.visibility)
                && Objects.equals(this.options, organizationUpdateIssueField.options);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hashCodeNullable(description), visibility, options);
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
        sb.append("class OrganizationUpdateIssueField {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
