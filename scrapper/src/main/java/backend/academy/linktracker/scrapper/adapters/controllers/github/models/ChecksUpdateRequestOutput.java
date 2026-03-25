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
 * Check runs can accept a variety of data in the &#x60;output&#x60; object, including a &#x60;title&#x60; and &#x60;summary&#x60; and can optionally provide descriptive details about the run.
 */
@Schema(
        name = "checks_update_request_output",
        description =
                "Check runs can accept a variety of data in the `output` object, including a `title` and `summary` and can optionally provide descriptive details about the run.")
@JsonTypeName("checks_update_request_output")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ChecksUpdateRequestOutput {

    private String title;

    private String summary;

    private String text;

    @Valid
    private List<@Valid ChecksCreateRequestOutputAnnotationsInner> annotations = new ArrayList<>();

    @Valid
    private List<@Valid ChecksCreateRequestOutputImagesInner> images = new ArrayList<>();

    public ChecksUpdateRequestOutput() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ChecksUpdateRequestOutput(String summary) {
        this.summary = summary;
    }

    public ChecksUpdateRequestOutput title(String title) {
        this.title = title;
        return this;
    }

    /**
     * **Required**.
     * @return title
     */
    @Schema(name = "title", description = "**Required**.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ChecksUpdateRequestOutput summary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Can contain Markdown.
     * @return summary
     */
    @NotNull
    @Size(max = 65535)
    @Schema(name = "summary", description = "Can contain Markdown.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public ChecksUpdateRequestOutput text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Can contain Markdown.
     * @return text
     */
    @Size(max = 65535)
    @Schema(name = "text", description = "Can contain Markdown.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ChecksUpdateRequestOutput annotations(List<@Valid ChecksCreateRequestOutputAnnotationsInner> annotations) {
        this.annotations = annotations;
        return this;
    }

    public ChecksUpdateRequestOutput addAnnotationsItem(ChecksCreateRequestOutputAnnotationsInner annotationsItem) {
        if (this.annotations == null) {
            this.annotations = new ArrayList<>();
        }
        this.annotations.add(annotationsItem);
        return this;
    }

    /**
     * Adds information from your analysis to specific lines of code. Annotations are visible in GitHub's pull request UI. Annotations are visible in GitHub's pull request UI. The Checks API limits the number of annotations to a maximum of 50 per API request. To create more than 50 annotations, you have to make multiple requests to the [Update a check run](https://docs.github.com/rest/checks/runs#update-a-check-run) endpoint. Each time you update the check run, annotations are appended to the list of annotations that already exist for the check run. GitHub Actions are limited to 10 warning annotations and 10 error annotations per step. For details about annotations in the UI, see \"[About status checks](https://docs.github.com/articles/about-status-checks#checks)\".
     * @return annotations
     */
    @Valid
    @Size(max = 50)
    @Schema(
            name = "annotations",
            description =
                    "Adds information from your analysis to specific lines of code. Annotations are visible in GitHub's pull request UI. Annotations are visible in GitHub's pull request UI. The Checks API limits the number of annotations to a maximum of 50 per API request. To create more than 50 annotations, you have to make multiple requests to the [Update a check run](https://docs.github.com/rest/checks/runs#update-a-check-run) endpoint. Each time you update the check run, annotations are appended to the list of annotations that already exist for the check run. GitHub Actions are limited to 10 warning annotations and 10 error annotations per step. For details about annotations in the UI, see \"[About status checks](https://docs.github.com/articles/about-status-checks#checks)\".",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("annotations")
    public List<@Valid ChecksCreateRequestOutputAnnotationsInner> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(List<@Valid ChecksCreateRequestOutputAnnotationsInner> annotations) {
        this.annotations = annotations;
    }

    public ChecksUpdateRequestOutput images(List<@Valid ChecksCreateRequestOutputImagesInner> images) {
        this.images = images;
        return this;
    }

    public ChecksUpdateRequestOutput addImagesItem(ChecksCreateRequestOutputImagesInner imagesItem) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(imagesItem);
        return this;
    }

    /**
     * Adds images to the output displayed in the GitHub pull request UI.
     * @return images
     */
    @Valid
    @Schema(
            name = "images",
            description = "Adds images to the output displayed in the GitHub pull request UI.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("images")
    public List<@Valid ChecksCreateRequestOutputImagesInner> getImages() {
        return images;
    }

    public void setImages(List<@Valid ChecksCreateRequestOutputImagesInner> images) {
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
        ChecksUpdateRequestOutput checksUpdateRequestOutput = (ChecksUpdateRequestOutput) o;
        return Objects.equals(this.title, checksUpdateRequestOutput.title)
                && Objects.equals(this.summary, checksUpdateRequestOutput.summary)
                && Objects.equals(this.text, checksUpdateRequestOutput.text)
                && Objects.equals(this.annotations, checksUpdateRequestOutput.annotations)
                && Objects.equals(this.images, checksUpdateRequestOutput.images);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, summary, text, annotations, images);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChecksUpdateRequestOutput {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
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
