package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * IssuesCreateRequestLabelsInnerOneOf
 */
@JsonTypeName("issues_create_request_labels_inner_oneOf")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssuesCreateRequestLabelsInnerOneOf implements IssuesCreateRequestLabelsInner {

    private Optional<Long> id = Optional.empty();

    private Optional<String> name = Optional.empty();

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    private JsonNullable<String> color = JsonNullable.<String>undefined();

    public IssuesCreateRequestLabelsInnerOneOf id(Long id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public IssuesCreateRequestLabelsInnerOneOf name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public IssuesCreateRequestLabelsInnerOneOf description(String description) {
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public IssuesCreateRequestLabelsInnerOneOf color(String color) {
        this.color = JsonNullable.of(color);
        return this;
    }

    /**
     * Get color
     * @return color
     */
    @Schema(name = "color", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        IssuesCreateRequestLabelsInnerOneOf issuesCreateRequestLabelsInnerOneOf =
                (IssuesCreateRequestLabelsInnerOneOf) o;
        return Objects.equals(this.id, issuesCreateRequestLabelsInnerOneOf.id)
                && Objects.equals(this.name, issuesCreateRequestLabelsInnerOneOf.name)
                && equalsNullable(this.description, issuesCreateRequestLabelsInnerOneOf.description)
                && equalsNullable(this.color, issuesCreateRequestLabelsInnerOneOf.color);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, hashCodeNullable(description), hashCodeNullable(color));
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
        sb.append("class IssuesCreateRequestLabelsInnerOneOf {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
