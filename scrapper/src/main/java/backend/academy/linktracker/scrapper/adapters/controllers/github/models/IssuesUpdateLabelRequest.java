package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * IssuesUpdateLabelRequest
 */
@JsonTypeName("issues_update_label_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssuesUpdateLabelRequest {

    private Optional<String> newName = Optional.empty();

    private Optional<String> color = Optional.empty();

    private Optional<String> description = Optional.empty();

    public IssuesUpdateLabelRequest newName(String newName) {
        this.newName = Optional.ofNullable(newName);
        return this;
    }

    /**
     * The new name of the label. Emoji can be added to label names, using either native emoji or colon-style markup. For example, typing `:strawberry:` will render the emoji ![:strawberry:](https://github.githubassets.com/images/icons/emoji/unicode/1f353.png \":strawberry:\"). For a full list of available emoji and codes, see \"[Emoji cheat sheet](https://github.com/ikatyang/emoji-cheat-sheet).\"
     * @return newName
     */
    @Schema(
            name = "new_name",
            description =
                    "The new name of the label. Emoji can be added to label names, using either native emoji or colon-style markup. For example, typing `:strawberry:` will render the emoji ![:strawberry:](https://github.githubassets.com/images/icons/emoji/unicode/1f353.png \":strawberry:\"). For a full list of available emoji and codes, see \"[Emoji cheat sheet](https://github.com/ikatyang/emoji-cheat-sheet).\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("new_name")
    public Optional<String> getNewName() {
        return newName;
    }

    public void setNewName(Optional<String> newName) {
        this.newName = newName;
    }

    public IssuesUpdateLabelRequest color(String color) {
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

    public IssuesUpdateLabelRequest description(String description) {
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
        IssuesUpdateLabelRequest issuesUpdateLabelRequest = (IssuesUpdateLabelRequest) o;
        return Objects.equals(this.newName, issuesUpdateLabelRequest.newName)
                && Objects.equals(this.color, issuesUpdateLabelRequest.color)
                && Objects.equals(this.description, issuesUpdateLabelRequest.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newName, color, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssuesUpdateLabelRequest {\n");
        sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
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
