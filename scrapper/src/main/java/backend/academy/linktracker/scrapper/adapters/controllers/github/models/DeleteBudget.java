package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * DeleteBudget
 */
@JsonTypeName("delete-budget")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DeleteBudget {

    private String message;

    private String id;

    public DeleteBudget() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DeleteBudget(String message, String id) {
        this.message = message;
        this.id = id;
    }

    public DeleteBudget message(String message) {
        this.message = message;
        return this;
    }

    /**
     * A message indicating the result of the deletion operation
     * @return message
     */
    @NotNull
    @Schema(
            name = "message",
            description = "A message indicating the result of the deletion operation",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DeleteBudget id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the deleted budget
     * @return id
     */
    @NotNull
    @Schema(name = "id", description = "The ID of the deleted budget", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteBudget deleteBudget = (DeleteBudget) o;
        return Objects.equals(this.message, deleteBudget.message) && Objects.equals(this.id, deleteBudget.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteBudget {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
