package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ActionsListCustomImageVersionsForOrg200Response
 */
@JsonTypeName("actions_list_custom_image_versions_for_org_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsListCustomImageVersionsForOrg200Response {

    private Long totalCount;

    @Valid
    private List<@Valid ActionsHostedRunnerCustomImageVersion> imageVersions = new ArrayList<>();

    public ActionsListCustomImageVersionsForOrg200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsListCustomImageVersionsForOrg200Response(
            Long totalCount, List<@Valid ActionsHostedRunnerCustomImageVersion> imageVersions) {
        this.totalCount = totalCount;
        this.imageVersions = imageVersions;
    }

    public ActionsListCustomImageVersionsForOrg200Response totalCount(Long totalCount) {
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

    public ActionsListCustomImageVersionsForOrg200Response imageVersions(
            List<@Valid ActionsHostedRunnerCustomImageVersion> imageVersions) {
        this.imageVersions = imageVersions;
        return this;
    }

    public ActionsListCustomImageVersionsForOrg200Response addImageVersionsItem(
            ActionsHostedRunnerCustomImageVersion imageVersionsItem) {
        if (this.imageVersions == null) {
            this.imageVersions = new ArrayList<>();
        }
        this.imageVersions.add(imageVersionsItem);
        return this;
    }

    /**
     * Get imageVersions
     * @return imageVersions
     */
    @NotNull
    @Valid
    @Schema(name = "image_versions", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("image_versions")
    public List<@Valid ActionsHostedRunnerCustomImageVersion> getImageVersions() {
        return imageVersions;
    }

    public void setImageVersions(List<@Valid ActionsHostedRunnerCustomImageVersion> imageVersions) {
        this.imageVersions = imageVersions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsListCustomImageVersionsForOrg200Response actionsListCustomImageVersionsForOrg200Response =
                (ActionsListCustomImageVersionsForOrg200Response) o;
        return Objects.equals(this.totalCount, actionsListCustomImageVersionsForOrg200Response.totalCount)
                && Objects.equals(this.imageVersions, actionsListCustomImageVersionsForOrg200Response.imageVersions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, imageVersions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsListCustomImageVersionsForOrg200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    imageVersions: ").append(toIndentedString(imageVersions)).append("\n");
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
