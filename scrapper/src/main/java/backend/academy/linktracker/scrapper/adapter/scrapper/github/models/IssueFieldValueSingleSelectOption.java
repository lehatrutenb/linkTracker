package backend.academy.linktracker.scrapper.adapter.scrapper.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.Objects;

/**
 * Details about the selected option (only present for single_select fields)
 */
@Schema(
        name = "Issue_Field_Value_single_select_option",
        description = "Details about the selected option (only present for single_select fields)")
@JsonTypeName("Issue_Field_Value_single_select_option")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssueFieldValueSingleSelectOption {

    private Long id;

    private String name;

    private String color;

    public IssueFieldValueSingleSelectOption() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssueFieldValueSingleSelectOption(Long id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public IssueFieldValueSingleSelectOption id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier for the option.
     * @return id
     */
    @NotNull
    @Schema(name = "id", description = "Unique identifier for the option.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IssueFieldValueSingleSelectOption name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the option
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "The name of the option", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IssueFieldValueSingleSelectOption color(String color) {
        this.color = color;
        return this;
    }

    /**
     * The color of the option
     * @return color
     */
    @NotNull
    @Schema(name = "color", description = "The color of the option", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueFieldValueSingleSelectOption issueFieldValueSingleSelectOption = (IssueFieldValueSingleSelectOption) o;
        return Objects.equals(this.id, issueFieldValueSingleSelectOption.id)
                && Objects.equals(this.name, issueFieldValueSingleSelectOption.name)
                && Objects.equals(this.color, issueFieldValueSingleSelectOption.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, color);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueFieldValueSingleSelectOption {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
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
