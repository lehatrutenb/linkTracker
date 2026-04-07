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
 * ActionsListCustomImagesForOrg200Response
 */
@JsonTypeName("actions_list_custom_images_for_org_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsListCustomImagesForOrg200Response {

    private Long totalCount;

    @Valid
    private List<@Valid ActionsHostedRunnerCustomImage> images = new ArrayList<>();

    public ActionsListCustomImagesForOrg200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsListCustomImagesForOrg200Response(
            Long totalCount, List<@Valid ActionsHostedRunnerCustomImage> images) {
        this.totalCount = totalCount;
        this.images = images;
    }

    public ActionsListCustomImagesForOrg200Response totalCount(Long totalCount) {
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

    public ActionsListCustomImagesForOrg200Response images(List<@Valid ActionsHostedRunnerCustomImage> images) {
        this.images = images;
        return this;
    }

    public ActionsListCustomImagesForOrg200Response addImagesItem(ActionsHostedRunnerCustomImage imagesItem) {
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
    public List<@Valid ActionsHostedRunnerCustomImage> getImages() {
        return images;
    }

    public void setImages(List<@Valid ActionsHostedRunnerCustomImage> images) {
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
        ActionsListCustomImagesForOrg200Response actionsListCustomImagesForOrg200Response =
                (ActionsListCustomImagesForOrg200Response) o;
        return Objects.equals(this.totalCount, actionsListCustomImagesForOrg200Response.totalCount)
                && Objects.equals(this.images, actionsListCustomImagesForOrg200Response.images);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, images);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsListCustomImagesForOrg200Response {\n");
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
