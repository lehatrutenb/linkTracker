package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OrganizationUpdateIssueField
 */
@JsonTypeName("organization-update-issue-field")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrganizationUpdateIssueField {

    private String name;

    private String description = null;

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

    private VisibilityEnum visibility;

    @Valid
    private List<@Valid OrganizationCreateIssueFieldOptionsInner> options = new ArrayList<>();

    public OrganizationUpdateIssueField name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the issue field.
     * @return name
     */
    @Schema(name = "name", description = "Name of the issue field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrganizationUpdateIssueField description(String description) {
        this.description = description;
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
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OrganizationUpdateIssueField visibility(VisibilityEnum visibility) {
        this.visibility = visibility;
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
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
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
                && Objects.equals(this.description, organizationUpdateIssueField.description)
                && Objects.equals(this.visibility, organizationUpdateIssueField.visibility)
                && Objects.equals(this.options, organizationUpdateIssueField.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, visibility, options);
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
