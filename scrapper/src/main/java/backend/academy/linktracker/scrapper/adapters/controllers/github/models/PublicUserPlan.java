package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * PublicUserPlan
 */
@JsonTypeName("public_user_plan")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PublicUserPlan {

    private Long collaborators;

    private String name;

    private Long space;

    private Long privateRepos;

    public PublicUserPlan() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PublicUserPlan(Long collaborators, String name, Long space, Long privateRepos) {
        this.collaborators = collaborators;
        this.name = name;
        this.space = space;
        this.privateRepos = privateRepos;
    }

    public PublicUserPlan collaborators(Long collaborators) {
        this.collaborators = collaborators;
        return this;
    }

    /**
     * Get collaborators
     * @return collaborators
     */
    @NotNull
    @Schema(name = "collaborators", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("collaborators")
    public Long getCollaborators() {
        return collaborators;
    }

    public void setCollaborators(Long collaborators) {
        this.collaborators = collaborators;
    }

    public PublicUserPlan name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PublicUserPlan space(Long space) {
        this.space = space;
        return this;
    }

    /**
     * Get space
     * @return space
     */
    @NotNull
    @Schema(name = "space", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("space")
    public Long getSpace() {
        return space;
    }

    public void setSpace(Long space) {
        this.space = space;
    }

    public PublicUserPlan privateRepos(Long privateRepos) {
        this.privateRepos = privateRepos;
        return this;
    }

    /**
     * Get privateRepos
     * @return privateRepos
     */
    @NotNull
    @Schema(name = "private_repos", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("private_repos")
    public Long getPrivateRepos() {
        return privateRepos;
    }

    public void setPrivateRepos(Long privateRepos) {
        this.privateRepos = privateRepos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublicUserPlan publicUserPlan = (PublicUserPlan) o;
        return Objects.equals(this.collaborators, publicUserPlan.collaborators)
                && Objects.equals(this.name, publicUserPlan.name)
                && Objects.equals(this.space, publicUserPlan.space)
                && Objects.equals(this.privateRepos, publicUserPlan.privateRepos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collaborators, name, space, privateRepos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicUserPlan {\n");
        sb.append("    collaborators: ").append(toIndentedString(collaborators)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    space: ").append(toIndentedString(space)).append("\n");
        sb.append("    privateRepos: ").append(toIndentedString(privateRepos)).append("\n");
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
