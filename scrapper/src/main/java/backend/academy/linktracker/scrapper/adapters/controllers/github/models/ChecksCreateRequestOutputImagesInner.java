package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * ChecksCreateRequestOutputImagesInner
 */
@JsonTypeName("checks_create_request_output_images_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ChecksCreateRequestOutputImagesInner {

    private String alt;

    private String imageUrl;

    private Optional<String> caption = Optional.empty();

    public ChecksCreateRequestOutputImagesInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ChecksCreateRequestOutputImagesInner(String alt, String imageUrl) {
        this.alt = alt;
        this.imageUrl = imageUrl;
    }

    public ChecksCreateRequestOutputImagesInner alt(String alt) {
        this.alt = alt;
        return this;
    }

    /**
     * The alternative text for the image.
     * @return alt
     */
    @NotNull
    @Schema(
            name = "alt",
            description = "The alternative text for the image.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("alt")
    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public ChecksCreateRequestOutputImagesInner imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * The full URL of the image.
     * @return imageUrl
     */
    @NotNull
    @Schema(name = "image_url", description = "The full URL of the image.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ChecksCreateRequestOutputImagesInner caption(String caption) {
        this.caption = Optional.ofNullable(caption);
        return this;
    }

    /**
     * A short image description.
     * @return caption
     */
    @Schema(
            name = "caption",
            description = "A short image description.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("caption")
    public Optional<String> getCaption() {
        return caption;
    }

    public void setCaption(Optional<String> caption) {
        this.caption = caption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChecksCreateRequestOutputImagesInner checksCreateRequestOutputImagesInner =
                (ChecksCreateRequestOutputImagesInner) o;
        return Objects.equals(this.alt, checksCreateRequestOutputImagesInner.alt)
                && Objects.equals(this.imageUrl, checksCreateRequestOutputImagesInner.imageUrl)
                && Objects.equals(this.caption, checksCreateRequestOutputImagesInner.caption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alt, imageUrl, caption);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChecksCreateRequestOutputImagesInner {\n");
        sb.append("    alt: ").append(toIndentedString(alt)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
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
