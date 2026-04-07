package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * CodespacesListDevcontainersInRepositoryForAuthenticatedUser200ResponseDevcontainersInner
 */
@JsonTypeName("codespaces_list_devcontainers_in_repository_for_authenticated_user_200_response_devcontainers_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodespacesListDevcontainersInRepositoryForAuthenticatedUser200ResponseDevcontainersInner {

    private String path;

    private Optional<String> name = Optional.empty();

    private Optional<String> displayName = Optional.empty();

    public CodespacesListDevcontainersInRepositoryForAuthenticatedUser200ResponseDevcontainersInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodespacesListDevcontainersInRepositoryForAuthenticatedUser200ResponseDevcontainersInner(String path) {
        this.path = path;
    }

    public CodespacesListDevcontainersInRepositoryForAuthenticatedUser200ResponseDevcontainersInner path(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get path
     * @return path
     */
    @NotNull
    @Schema(name = "path", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public CodespacesListDevcontainersInRepositoryForAuthenticatedUser200ResponseDevcontainersInner name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public CodespacesListDevcontainersInRepositoryForAuthenticatedUser200ResponseDevcontainersInner displayName(
            String displayName) {
        this.displayName = Optional.ofNullable(displayName);
        return this;
    }

    /**
     * Get displayName
     * @return displayName
     */
    @Schema(name = "display_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("display_name")
    public Optional<String> getDisplayName() {
        return displayName;
    }

    public void setDisplayName(Optional<String> displayName) {
        this.displayName = displayName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodespacesListDevcontainersInRepositoryForAuthenticatedUser200ResponseDevcontainersInner
                codespacesListDevcontainersInRepositoryForAuthenticatedUser200ResponseDevcontainersInner =
                        (CodespacesListDevcontainersInRepositoryForAuthenticatedUser200ResponseDevcontainersInner) o;
        return Objects.equals(
                        this.path,
                        codespacesListDevcontainersInRepositoryForAuthenticatedUser200ResponseDevcontainersInner.path)
                && Objects.equals(
                        this.name,
                        codespacesListDevcontainersInRepositoryForAuthenticatedUser200ResponseDevcontainersInner.name)
                && Objects.equals(
                        this.displayName,
                        codespacesListDevcontainersInRepositoryForAuthenticatedUser200ResponseDevcontainersInner
                                .displayName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, name, displayName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodespacesListDevcontainersInRepositoryForAuthenticatedUser200ResponseDevcontainersInner {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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
