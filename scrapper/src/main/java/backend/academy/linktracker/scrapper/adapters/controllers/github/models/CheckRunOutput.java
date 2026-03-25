package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * CheckRunOutput
 */
@JsonTypeName("check_run_output")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CheckRunOutput {

    private String title = null;

    private String summary = null;

    private String text = null;

    private Long annotationsCount;

    private URI annotationsUrl;

    public CheckRunOutput() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CheckRunOutput(String title, String summary, String text, Long annotationsCount, URI annotationsUrl) {
        this.title = title;
        this.summary = summary;
        this.text = text;
        this.annotationsCount = annotationsCount;
        this.annotationsUrl = annotationsUrl;
    }

    public CheckRunOutput title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     * @return title
     */
    @NotNull
    @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CheckRunOutput summary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get summary
     * @return summary
     */
    @NotNull
    @Schema(name = "summary", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public CheckRunOutput text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get text
     * @return text
     */
    @NotNull
    @Schema(name = "text", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public CheckRunOutput annotationsCount(Long annotationsCount) {
        this.annotationsCount = annotationsCount;
        return this;
    }

    /**
     * Get annotationsCount
     * @return annotationsCount
     */
    @NotNull
    @Schema(name = "annotations_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("annotations_count")
    public Long getAnnotationsCount() {
        return annotationsCount;
    }

    public void setAnnotationsCount(Long annotationsCount) {
        this.annotationsCount = annotationsCount;
    }

    public CheckRunOutput annotationsUrl(URI annotationsUrl) {
        this.annotationsUrl = annotationsUrl;
        return this;
    }

    /**
     * Get annotationsUrl
     * @return annotationsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "annotations_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("annotations_url")
    public URI getAnnotationsUrl() {
        return annotationsUrl;
    }

    public void setAnnotationsUrl(URI annotationsUrl) {
        this.annotationsUrl = annotationsUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckRunOutput checkRunOutput = (CheckRunOutput) o;
        return Objects.equals(this.title, checkRunOutput.title)
                && Objects.equals(this.summary, checkRunOutput.summary)
                && Objects.equals(this.text, checkRunOutput.text)
                && Objects.equals(this.annotationsCount, checkRunOutput.annotationsCount)
                && Objects.equals(this.annotationsUrl, checkRunOutput.annotationsUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, summary, text, annotationsCount, annotationsUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckRunOutput {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    annotationsCount: ")
                .append(toIndentedString(annotationsCount))
                .append("\n");
        sb.append("    annotationsUrl: ")
                .append(toIndentedString(annotationsUrl))
                .append("\n");
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
