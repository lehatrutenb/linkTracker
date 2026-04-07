package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * IssuesCreateLabelRequest
 */
@JsonTypeName("issues_create_label_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssuesCreateLabelRequest {

    private String name;

    private Optional<String> color = Optional.empty();

    private Optional<String> description = Optional.empty();

    public IssuesCreateLabelRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssuesCreateLabelRequest(String name) {
        this.name = name;
    }

    public IssuesCreateLabelRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the label. Emoji can be added to label names, using either native emoji or colon-style markup. For example, typing `:strawberry:` will render the emoji ![:strawberry:](https://github.githubassets.com/images/icons/emoji/unicode/1f353.png \":strawberry:\"). For a full list of available emoji and codes, see \"[Emoji cheat sheet](https://github.com/ikatyang/emoji-cheat-sheet).\"
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            description =
                    "The name of the label. Emoji can be added to label names, using either native emoji or colon-style markup. For example, typing `:strawberry:` will render the emoji ![:strawberry:](https://github.githubassets.com/images/icons/emoji/unicode/1f353.png \":strawberry:\"). For a full list of available emoji and codes, see \"[Emoji cheat sheet](https://github.com/ikatyang/emoji-cheat-sheet).\"",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IssuesCreateLabelRequest color(String color) {
        this.color = Optional.ofNullable(color);
        return this;
    }

    /**
     * The [hexadecimal color code](http://www.color-hex.com/) for the label, without the leading `#`.
     * @return color
     */
    @Schema(
            name = "color",
            description =
                    "The [hexadecimal color code](http://www.color-hex.com/) for the label, without the leading `#`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("color")
    public Optional<String> getColor() {
        return color;
    }

    public void setColor(Optional<String> color) {
        this.color = color;
    }

    public IssuesCreateLabelRequest description(String description) {
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * A short description of the label. Must be 100 characters or fewer.
     * @return description
     */
    @Schema(
            name = "description",
            description = "A short description of the label. Must be 100 characters or fewer.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(Optional<String> description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssuesCreateLabelRequest issuesCreateLabelRequest = (IssuesCreateLabelRequest) o;
        return Objects.equals(this.name, issuesCreateLabelRequest.name)
                && Objects.equals(this.color, issuesCreateLabelRequest.color)
                && Objects.equals(this.description, issuesCreateLabelRequest.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssuesCreateLabelRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
