package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.Objects;

/**
 * An iteration setting for an iteration field
 */
@Schema(name = "projects-v2-iteration-setting", description = "An iteration setting for an iteration field")
@JsonTypeName("projects-v2-iteration-setting")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsV2IterationSetting implements WebhookProjectsV2ItemEditedChangesOneOfFieldValueFrom {

    private String id;

    private String title;

    private String titleHtml;

    private BigDecimal duration = null;

    private String startDate = null;

    private Boolean completed;

    public ProjectsV2IterationSetting() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProjectsV2IterationSetting(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public ProjectsV2IterationSetting id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the iteration setting.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            description = "The unique identifier of the iteration setting.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProjectsV2IterationSetting title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The iteration title.
     * @return title
     */
    @NotNull
    @Schema(name = "title", description = "The iteration title.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ProjectsV2IterationSetting titleHtml(String titleHtml) {
        this.titleHtml = titleHtml;
        return this;
    }

    /**
     * The iteration title, rendered as HTML.
     * @return titleHtml
     */
    @Schema(
            name = "title_html",
            description = "The iteration title, rendered as HTML.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("title_html")
    public String getTitleHtml() {
        return titleHtml;
    }

    public void setTitleHtml(String titleHtml) {
        this.titleHtml = titleHtml;
    }

    public ProjectsV2IterationSetting duration(BigDecimal duration) {
        this.duration = duration;
        return this;
    }

    /**
     * The duration of the iteration in days.
     * @return duration
     */
    @Valid
    @Schema(
            name = "duration",
            description = "The duration of the iteration in days.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("duration")
    public BigDecimal getDuration() {
        return duration;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    public ProjectsV2IterationSetting startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * The start date of the iteration.
     * @return startDate
     */
    @Schema(
            name = "start_date",
            description = "The start date of the iteration.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("start_date")
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public ProjectsV2IterationSetting completed(Boolean completed) {
        this.completed = completed;
        return this;
    }

    /**
     * Whether the iteration has been completed.
     * @return completed
     */
    @Schema(
            name = "completed",
            description = "Whether the iteration has been completed.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("completed")
    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectsV2IterationSetting projectsV2IterationSetting = (ProjectsV2IterationSetting) o;
        return Objects.equals(this.id, projectsV2IterationSetting.id)
                && Objects.equals(this.title, projectsV2IterationSetting.title)
                && Objects.equals(this.titleHtml, projectsV2IterationSetting.titleHtml)
                && Objects.equals(this.duration, projectsV2IterationSetting.duration)
                && Objects.equals(this.startDate, projectsV2IterationSetting.startDate)
                && Objects.equals(this.completed, projectsV2IterationSetting.completed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, titleHtml, duration, startDate, completed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsV2IterationSetting {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    titleHtml: ").append(toIndentedString(titleHtml)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
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
