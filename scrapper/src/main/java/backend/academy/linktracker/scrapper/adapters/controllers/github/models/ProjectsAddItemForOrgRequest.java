package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ProjectsAddItemForOrgRequest
 */
@JsonTypeName("projects_add_item_for_org_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsAddItemForOrgRequest {

    /**
     * The type of item to add to the project. Must be either Issue or PullRequest.
     */
    public enum TypeEnum {
        ISSUE("Issue"),

        PULL_REQUEST("PullRequest");

        private final String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private TypeEnum type;

    private Long id;

    private String owner;

    private String repo;

    private Long number;

    public ProjectsAddItemForOrgRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProjectsAddItemForOrgRequest(TypeEnum type) {
        this.type = type;
    }

    public ProjectsAddItemForOrgRequest type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of item to add to the project. Must be either Issue or PullRequest.
     * @return type
     */
    @NotNull
    @Schema(
            name = "type",
            description = "The type of item to add to the project. Must be either Issue or PullRequest.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ProjectsAddItemForOrgRequest id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the issue or pull request to add to the project.
     * @return id
     */
    @Schema(
            name = "id",
            description = "The unique identifier of the issue or pull request to add to the project.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProjectsAddItemForOrgRequest owner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * The repository owner login.
     * @return owner
     */
    @Schema(
            name = "owner",
            description = "The repository owner login.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("owner")
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ProjectsAddItemForOrgRequest repo(String repo) {
        this.repo = repo;
        return this;
    }

    /**
     * The repository name.
     * @return repo
     */
    @Schema(name = "repo", description = "The repository name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repo")
    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public ProjectsAddItemForOrgRequest number(Long number) {
        this.number = number;
        return this;
    }

    /**
     * The issue or pull request number.
     * @return number
     */
    @Schema(
            name = "number",
            description = "The issue or pull request number.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectsAddItemForOrgRequest projectsAddItemForOrgRequest = (ProjectsAddItemForOrgRequest) o;
        return Objects.equals(this.type, projectsAddItemForOrgRequest.type)
                && Objects.equals(this.id, projectsAddItemForOrgRequest.id)
                && Objects.equals(this.owner, projectsAddItemForOrgRequest.owner)
                && Objects.equals(this.repo, projectsAddItemForOrgRequest.repo)
                && Objects.equals(this.number, projectsAddItemForOrgRequest.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, owner, repo, number);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsAddItemForOrgRequest {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
