package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Issue Event Label
 */
@Schema(name = "issue-event-label", description = "Issue Event Label")
@JsonTypeName("issue-event-label")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssueEventLabel {

    private JsonNullable<String> name = JsonNullable.<String>undefined();

    private JsonNullable<String> color = JsonNullable.<String>undefined();

    public IssueEventLabel() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssueEventLabel(String name, String color) {
        this.name = JsonNullable.of(name);
        this.color = JsonNullable.of(color);
    }

    public IssueEventLabel name(String name) {
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public JsonNullable<String> getName() {
        return name;
    }

    public void setName(JsonNullable<String> name) {
        this.name = name;
    }

    public IssueEventLabel color(String color) {
        this.color = JsonNullable.of(color);
        return this;
    }

    /**
     * Get color
     * @return color
     */
    @NotNull
    @Schema(name = "color", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("color")
    public JsonNullable<String> getColor() {
        return color;
    }

    public void setColor(JsonNullable<String> color) {
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
        IssueEventLabel issueEventLabel = (IssueEventLabel) o;
        return Objects.equals(this.name, issueEventLabel.name) && Objects.equals(this.color, issueEventLabel.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueEventLabel {\n");
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
