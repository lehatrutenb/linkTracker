package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * DependencyGraphCreateRepositorySnapshot201Response
 */
@JsonTypeName("dependency_graph_create_repository_snapshot_201_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DependencyGraphCreateRepositorySnapshot201Response {

    private Long id;

    private String createdAt;

    private String result;

    private String message;

    public DependencyGraphCreateRepositorySnapshot201Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DependencyGraphCreateRepositorySnapshot201Response(
            Long id, String createdAt, String result, String message) {
        this.id = id;
        this.createdAt = createdAt;
        this.result = result;
        this.message = message;
    }

    public DependencyGraphCreateRepositorySnapshot201Response id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * ID of the created snapshot.
     * @return id
     */
    @NotNull
    @Schema(name = "id", description = "ID of the created snapshot.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DependencyGraphCreateRepositorySnapshot201Response createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time at which the snapshot was created.
     * @return createdAt
     */
    @NotNull
    @Schema(
            name = "created_at",
            description = "The time at which the snapshot was created.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public DependencyGraphCreateRepositorySnapshot201Response result(String result) {
        this.result = result;
        return this;
    }

    /**
     * Either \"SUCCESS\", \"ACCEPTED\", or \"INVALID\". \"SUCCESS\" indicates that the snapshot was successfully created and the repository's dependencies were updated. \"ACCEPTED\" indicates that the snapshot was successfully created, but the repository's dependencies were not updated. \"INVALID\" indicates that the snapshot was malformed.
     * @return result
     */
    @NotNull
    @Schema(
            name = "result",
            description =
                    "Either \"SUCCESS\", \"ACCEPTED\", or \"INVALID\". \"SUCCESS\" indicates that the snapshot was successfully created and the repository's dependencies were updated. \"ACCEPTED\" indicates that the snapshot was successfully created, but the repository's dependencies were not updated. \"INVALID\" indicates that the snapshot was malformed.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("result")
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public DependencyGraphCreateRepositorySnapshot201Response message(String message) {
        this.message = message;
        return this;
    }

    /**
     * A message providing further details about the result, such as why the dependencies were not updated.
     * @return message
     */
    @NotNull
    @Schema(
            name = "message",
            description =
                    "A message providing further details about the result, such as why the dependencies were not updated.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DependencyGraphCreateRepositorySnapshot201Response dependencyGraphCreateRepositorySnapshot201Response =
                (DependencyGraphCreateRepositorySnapshot201Response) o;
        return Objects.equals(this.id, dependencyGraphCreateRepositorySnapshot201Response.id)
                && Objects.equals(this.createdAt, dependencyGraphCreateRepositorySnapshot201Response.createdAt)
                && Objects.equals(this.result, dependencyGraphCreateRepositorySnapshot201Response.result)
                && Objects.equals(this.message, dependencyGraphCreateRepositorySnapshot201Response.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdAt, result, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependencyGraphCreateRepositorySnapshot201Response {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
