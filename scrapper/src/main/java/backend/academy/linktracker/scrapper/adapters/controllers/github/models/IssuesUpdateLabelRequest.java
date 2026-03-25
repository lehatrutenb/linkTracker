package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * IssuesUpdateLabelRequest
 */
@JsonTypeName("issues_update_label_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssuesUpdateLabelRequest {

    private String newName;

    private String color;

    private String description;

    public IssuesUpdateLabelRequest newName(String newName) {
        this.newName = newName;
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
    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public IssuesUpdateLabelRequest color(String color) {
        this.color = color;
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
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public IssuesUpdateLabelRequest description(String description) {
        this.description = description;
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
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
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
