package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * ReposCreateUsingTemplateRequest
 */
@JsonTypeName("repos_create_using_template_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreateUsingTemplateRequest {

    private Optional<String> owner = Optional.empty();

    private String name;

    private Optional<String> description = Optional.empty();

    private Optional<Boolean> includeAllBranches = Optional.of(false);

    private Optional<Boolean> _private = Optional.of(false);

    public ReposCreateUsingTemplateRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposCreateUsingTemplateRequest(String name) {
        this.name = name;
    }

    public ReposCreateUsingTemplateRequest owner(String owner) {
        this.owner = Optional.ofNullable(owner);
        return this;
    }

    /**
     * The organization or person who will own the new repository. To create a new repository in an organization, the authenticated user must be a member of the specified organization.
     * @return owner
     */
    @Schema(
            name = "owner",
            description =
                    "The organization or person who will own the new repository. To create a new repository in an organization, the authenticated user must be a member of the specified organization.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("owner")
    public Optional<String> getOwner() {
        return owner;
    }

    public void setOwner(Optional<String> owner) {
        this.owner = owner;
    }

    public ReposCreateUsingTemplateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the new repository.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "The name of the new repository.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReposCreateUsingTemplateRequest description(String description) {
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * A short description of the new repository.
     * @return description
     */
    @Schema(
            name = "description",
            description = "A short description of the new repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(Optional<String> description) {
        this.description = description;
    }

    public ReposCreateUsingTemplateRequest includeAllBranches(Boolean includeAllBranches) {
        this.includeAllBranches = Optional.ofNullable(includeAllBranches);
        return this;
    }

    /**
     * Set to `true` to include the directory structure and files from all branches in the template repository, and not just the default branch. Default: `false`.
     * @return includeAllBranches
     */
    @Schema(
            name = "include_all_branches",
            description =
                    "Set to `true` to include the directory structure and files from all branches in the template repository, and not just the default branch. Default: `false`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("include_all_branches")
    public Optional<Boolean> getIncludeAllBranches() {
        return includeAllBranches;
    }

    public void setIncludeAllBranches(Optional<Boolean> includeAllBranches) {
        this.includeAllBranches = includeAllBranches;
    }

    public ReposCreateUsingTemplateRequest _private(Boolean _private) {
        this._private = Optional.ofNullable(_private);
        return this;
    }

    /**
     * Either `true` to create a new private repository or `false` to create a new public one.
     * @return _private
     */
    @Schema(
            name = "private",
            description = "Either `true` to create a new private repository or `false` to create a new public one.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("private")
    public Optional<Boolean> getPrivate() {
        return _private;
    }

    public void setPrivate(Optional<Boolean> _private) {
        this._private = _private;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposCreateUsingTemplateRequest reposCreateUsingTemplateRequest = (ReposCreateUsingTemplateRequest) o;
        return Objects.equals(this.owner, reposCreateUsingTemplateRequest.owner)
                && Objects.equals(this.name, reposCreateUsingTemplateRequest.name)
                && Objects.equals(this.description, reposCreateUsingTemplateRequest.description)
                && Objects.equals(this.includeAllBranches, reposCreateUsingTemplateRequest.includeAllBranches)
                && Objects.equals(this._private, reposCreateUsingTemplateRequest._private);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, name, description, includeAllBranches, _private);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposCreateUsingTemplateRequest {\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    includeAllBranches: ")
                .append(toIndentedString(includeAllBranches))
                .append("\n");
        sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
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
