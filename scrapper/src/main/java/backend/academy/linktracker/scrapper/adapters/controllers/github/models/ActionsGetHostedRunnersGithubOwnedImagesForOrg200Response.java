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
 * ActionsGetHostedRunnersGithubOwnedImagesForOrg200Response
 */
@JsonTypeName("actions_get_hosted_runners_github_owned_images_for_org_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsGetHostedRunnersGithubOwnedImagesForOrg200Response {

    private Long totalCount;

    @Valid
    private List<@Valid ActionsHostedRunnerCuratedImage> images = new ArrayList<>();

    public ActionsGetHostedRunnersGithubOwnedImagesForOrg200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsGetHostedRunnersGithubOwnedImagesForOrg200Response(
            Long totalCount, List<@Valid ActionsHostedRunnerCuratedImage> images) {
        this.totalCount = totalCount;
        this.images = images;
    }

    public ActionsGetHostedRunnersGithubOwnedImagesForOrg200Response totalCount(Long totalCount) {
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

    public ActionsGetHostedRunnersGithubOwnedImagesForOrg200Response images(
            List<@Valid ActionsHostedRunnerCuratedImage> images) {
        this.images = images;
        return this;
    }

    public ActionsGetHostedRunnersGithubOwnedImagesForOrg200Response addImagesItem(
            ActionsHostedRunnerCuratedImage imagesItem) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(imagesItem);
        return this;
    }

    /**
     * Get images
     * @return images
     */
    @NotNull
    @Valid
    @Schema(name = "images", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("images")
    public List<@Valid ActionsHostedRunnerCuratedImage> getImages() {
        return images;
    }

    public void setImages(List<@Valid ActionsHostedRunnerCuratedImage> images) {
        this.images = images;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsGetHostedRunnersGithubOwnedImagesForOrg200Response
                actionsGetHostedRunnersGithubOwnedImagesForOrg200Response =
                        (ActionsGetHostedRunnersGithubOwnedImagesForOrg200Response) o;
        return Objects.equals(this.totalCount, actionsGetHostedRunnersGithubOwnedImagesForOrg200Response.totalCount)
                && Objects.equals(this.images, actionsGetHostedRunnersGithubOwnedImagesForOrg200Response.images);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, images);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsGetHostedRunnersGithubOwnedImagesForOrg200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
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
