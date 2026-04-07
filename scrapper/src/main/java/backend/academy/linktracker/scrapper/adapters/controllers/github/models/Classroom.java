package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * A GitHub Classroom classroom
 */
@Schema(name = "classroom", description = "A GitHub Classroom classroom")
@JsonTypeName("classroom")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Classroom {

    private Long id;

    private String name;

    private Boolean archived;

    private SimpleClassroomOrganization organization;

    private String url;

    public Classroom() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Classroom(Long id, String name, Boolean archived, SimpleClassroomOrganization organization, String url) {
        this.id = id;
        this.name = name;
        this.archived = archived;
        this.organization = organization;
        this.url = url;
    }

    public Classroom id(Long id) {
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

    public Classroom name(String name) {
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

    public Classroom archived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * Whether classroom is archived.
     * @return archived
     */
    @NotNull
    @Schema(
            name = "archived",
            example = "false",
            description = "Whether classroom is archived.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("archived")
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Classroom organization(SimpleClassroomOrganization organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get organization
     * @return organization
     */
    @NotNull
    @Valid
    @Schema(name = "organization", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("organization")
    public SimpleClassroomOrganization getOrganization() {
        return organization;
    }

    public void setOrganization(SimpleClassroomOrganization organization) {
        this.organization = organization;
    }

    public Classroom url(String url) {
        this.url = url;
        return this;
    }

    /**
     * The URL of the classroom on GitHub Classroom.
     * @return url
     */
    @NotNull
    @Schema(
            name = "url",
            example = "https://classroom.github.com/classrooms/1-programming-elixir",
            description = "The URL of the classroom on GitHub Classroom.",
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
        Classroom classroom = (Classroom) o;
        return Objects.equals(this.id, classroom.id)
                && Objects.equals(this.name, classroom.name)
                && Objects.equals(this.archived, classroom.archived)
                && Objects.equals(this.organization, classroom.organization)
                && Objects.equals(this.url, classroom.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, archived, organization, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Classroom {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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
