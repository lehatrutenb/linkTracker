package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CheckRunWithSimpleCheckSuiteOutput
 */
@JsonTypeName("check_run_with_simple_check_suite_output")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CheckRunWithSimpleCheckSuiteOutput {

    private Long annotationsCount;

    private URI annotationsUrl;

    private JsonNullable<String> summary = JsonNullable.<String>undefined();

    private JsonNullable<String> text = JsonNullable.<String>undefined();

    private JsonNullable<String> title = JsonNullable.<String>undefined();

    public CheckRunWithSimpleCheckSuiteOutput() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CheckRunWithSimpleCheckSuiteOutput(
            Long annotationsCount, URI annotationsUrl, String summary, String text, String title) {
        this.annotationsCount = annotationsCount;
        this.annotationsUrl = annotationsUrl;
        this.summary = JsonNullable.of(summary);
        this.text = JsonNullable.of(text);
        this.title = JsonNullable.of(title);
    }

    public CheckRunWithSimpleCheckSuiteOutput annotationsCount(Long annotationsCount) {
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

    public CheckRunWithSimpleCheckSuiteOutput annotationsUrl(URI annotationsUrl) {
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

    public CheckRunWithSimpleCheckSuiteOutput summary(String summary) {
        this.summary = JsonNullable.of(summary);
        return this;
    }

    /**
     * Get summary
     * @return summary
     */
    @NotNull
    @Schema(name = "summary", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("summary")
    public JsonNullable<String> getSummary() {
        return summary;
    }

    public void setSummary(JsonNullable<String> summary) {
        this.summary = summary;
    }

    public CheckRunWithSimpleCheckSuiteOutput text(String text) {
        this.text = JsonNullable.of(text);
        return this;
    }

    /**
     * Get text
     * @return text
     */
    @NotNull
    @Schema(name = "text", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("text")
    public JsonNullable<String> getText() {
        return text;
    }

    public void setText(JsonNullable<String> text) {
        this.text = text;
    }

    public CheckRunWithSimpleCheckSuiteOutput title(String title) {
        this.title = JsonNullable.of(title);
        return this;
    }

    /**
     * Get title
     * @return title
     */
    @NotNull
    @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("title")
    public JsonNullable<String> getTitle() {
        return title;
    }

    public void setTitle(JsonNullable<String> title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckRunWithSimpleCheckSuiteOutput checkRunWithSimpleCheckSuiteOutput = (CheckRunWithSimpleCheckSuiteOutput) o;
        return Objects.equals(this.annotationsCount, checkRunWithSimpleCheckSuiteOutput.annotationsCount)
                && Objects.equals(this.annotationsUrl, checkRunWithSimpleCheckSuiteOutput.annotationsUrl)
                && Objects.equals(this.summary, checkRunWithSimpleCheckSuiteOutput.summary)
                && Objects.equals(this.text, checkRunWithSimpleCheckSuiteOutput.text)
                && Objects.equals(this.title, checkRunWithSimpleCheckSuiteOutput.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(annotationsCount, annotationsUrl, summary, text, title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckRunWithSimpleCheckSuiteOutput {\n");
        sb.append("    annotationsCount: ")
                .append(toIndentedString(annotationsCount))
                .append("\n");
        sb.append("    annotationsUrl: ")
                .append(toIndentedString(annotationsUrl))
                .append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
