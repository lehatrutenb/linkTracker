package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CodespacesListDevcontainersInRepositoryForAuthenticatedUser200Response
 */
@JsonTypeName("codespaces_list_devcontainers_in_repository_for_authenticated_user_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodespacesListDevcontainersInRepositoryForAuthenticatedUser200Response {

    private Long totalCount;

    @Valid
    private List<@Valid CodespacesListDevcontainersInRepositoryForAuthenticatedUser200ResponseDevcontainersInner>
            devcontainers = new ArrayList<>();

    public CodespacesListDevcontainersInRepositoryForAuthenticatedUser200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodespacesListDevcontainersInRepositoryForAuthenticatedUser200Response(
            Long totalCount,
            List<@Valid CodespacesListDevcontainersInRepositoryForAuthenticatedUser200ResponseDevcontainersInner>
                    devcontainers) {
        this.totalCount = totalCount;
        this.devcontainers = devcontainers;
    }

    public CodespacesListDevcontainersInRepositoryForAuthenticatedUser200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get totalCount
     * @return totalCount
     */
    @NotNull
    @Schema(name = "total_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total_count")
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public CodespacesListDevcontainersInRepositoryForAuthenticatedUser200Response devcontainers(
            List<@Valid CodespacesListDevcontainersInRepositoryForAuthenticatedUser200ResponseDevcontainersInner>
                    devcontainers) {
        this.devcontainers = devcontainers;
        return this;
    }

    public CodespacesListDevcontainersInRepositoryForAuthenticatedUser200Response addDevcontainersItem(
            CodespacesListDevcontainersInRepositoryForAuthenticatedUser200ResponseDevcontainersInner
                    devcontainersItem) {
        if (this.devcontainers == null) {
            this.devcontainers = new ArrayList<>();
        }
        this.devcontainers.add(devcontainersItem);
        return this;
    }

    /**
     * Get devcontainers
     * @return devcontainers
     */
    @NotNull
    @Valid
    @Schema(name = "devcontainers", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("devcontainers")
    public List<@Valid CodespacesListDevcontainersInRepositoryForAuthenticatedUser200ResponseDevcontainersInner>
            getDevcontainers() {
        return devcontainers;
    }

    public void setDevcontainers(
            List<@Valid CodespacesListDevcontainersInRepositoryForAuthenticatedUser200ResponseDevcontainersInner>
                    devcontainers) {
        this.devcontainers = devcontainers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodespacesListDevcontainersInRepositoryForAuthenticatedUser200Response
                codespacesListDevcontainersInRepositoryForAuthenticatedUser200Response =
                        (CodespacesListDevcontainersInRepositoryForAuthenticatedUser200Response) o;
        return Objects.equals(
                        this.totalCount,
                        codespacesListDevcontainersInRepositoryForAuthenticatedUser200Response.totalCount)
                && Objects.equals(
                        this.devcontainers,
                        codespacesListDevcontainersInRepositoryForAuthenticatedUser200Response.devcontainers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, devcontainers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodespacesListDevcontainersInRepositoryForAuthenticatedUser200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    devcontainers: ").append(toIndentedString(devcontainers)).append("\n");
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
