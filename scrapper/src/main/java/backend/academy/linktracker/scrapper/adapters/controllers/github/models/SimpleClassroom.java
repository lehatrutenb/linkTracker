package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * A GitHub Classroom classroom
 */
@Schema(name = "simple-classroom", description = "A GitHub Classroom classroom")
@JsonTypeName("simple-classroom")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SimpleClassroom {

    private Long id;

    private String name;

    private Boolean archived;

    private String url;

    public SimpleClassroom() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SimpleClassroom(Long id, String name, Boolean archived, String url) {
        this.id = id;
        this.name = name;
        this.archived = archived;
        this.url = url;
    }

    public SimpleClassroom id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the classroom.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "42",
            description = "Unique identifier of the classroom.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SimpleClassroom name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the classroom.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "Programming Elixir",
            description = "The name of the classroom.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SimpleClassroom archived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * Returns whether classroom is archived or not.
     * @return archived
     */
    @NotNull
    @Schema(
            name = "archived",
            example = "false",
            description = "Returns whether classroom is archived or not.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("archived")
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public SimpleClassroom url(String url) {
        this.url = url;
        return this;
    }

    /**
     * The url of the classroom on GitHub Classroom.
     * @return url
     */
    @NotNull
    @Schema(
            name = "url",
            example = "https://classroom.github.com/classrooms/1-programming-elixir",
            description = "The url of the classroom on GitHub Classroom.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SimpleClassroom simpleClassroom = (SimpleClassroom) o;
        return Objects.equals(this.id, simpleClassroom.id)
                && Objects.equals(this.name, simpleClassroom.name)
                && Objects.equals(this.archived, simpleClassroom.archived)
                && Objects.equals(this.url, simpleClassroom.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, archived, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimpleClassroom {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
