package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ReposCreateOrUpdateEnvironmentRequestReviewersInner
 */
@JsonTypeName("repos_create_or_update_environment_request_reviewers_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreateOrUpdateEnvironmentRequestReviewersInner {

    private DeploymentReviewerType type;

    private Long id;

    public ReposCreateOrUpdateEnvironmentRequestReviewersInner type(DeploymentReviewerType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @Valid
    @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public DeploymentReviewerType getType() {
        return type;
    }

    public void setType(DeploymentReviewerType type) {
        this.type = type;
    }

    public ReposCreateOrUpdateEnvironmentRequestReviewersInner id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the user or team who can review the deployment
     * @return id
     */
    @Schema(
            name = "id",
            example = "4532992",
            description = "The id of the user or team who can review the deployment",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        ReposCreateOrUpdateEnvironmentRequestReviewersInner reposCreateOrUpdateEnvironmentRequestReviewersInner =
                (ReposCreateOrUpdateEnvironmentRequestReviewersInner) o;
        return Objects.equals(this.type, reposCreateOrUpdateEnvironmentRequestReviewersInner.type)
                && Objects.equals(this.id, reposCreateOrUpdateEnvironmentRequestReviewersInner.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposCreateOrUpdateEnvironmentRequestReviewersInner {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
