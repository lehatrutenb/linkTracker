package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * An iteration setting for an iteration field
 */
@Schema(name = "projects-v2-iteration-settings", description = "An iteration setting for an iteration field")
@JsonTypeName("projects-v2-iteration-settings")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsV2IterationSettings {

    private String id;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate startDate;

    private Long duration;

    private ProjectsV2IterationSettingsTitle title;

    private Boolean completed;

    public ProjectsV2IterationSettings() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProjectsV2IterationSettings(
            String id, LocalDate startDate, Long duration, ProjectsV2IterationSettingsTitle title, Boolean completed) {
        this.id = id;
        this.startDate = startDate;
        this.duration = duration;
        this.title = title;
        this.completed = completed;
    }

    public ProjectsV2IterationSettings id(String id) {
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

    public ProjectsV2IterationSettings startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * The start date of the iteration.
     * @return startDate
     */
    @NotNull
    @Valid
    @Schema(
            name = "start_date",
            description = "The start date of the iteration.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("start_date")
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public ProjectsV2IterationSettings duration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * The duration of the iteration in days.
     * @return duration
     */
    @NotNull
    @Schema(
            name = "duration",
            description = "The duration of the iteration in days.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("duration")
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public ProjectsV2IterationSettings title(ProjectsV2IterationSettingsTitle title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     * @return title
     */
    @NotNull
    @Valid
    @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("title")
    public ProjectsV2IterationSettingsTitle getTitle() {
        return title;
    }

    public void setTitle(ProjectsV2IterationSettingsTitle title) {
        this.title = title;
    }

    public ProjectsV2IterationSettings completed(Boolean completed) {
        this.completed = completed;
        return this;
    }

    /**
     * Whether the iteration has been completed.
     * @return completed
     */
    @NotNull
    @Schema(
            name = "completed",
            description = "Whether the iteration has been completed.",
            requiredMode = Schema.RequiredMode.REQUIRED)
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
        ProjectsV2IterationSettings projectsV2IterationSettings = (ProjectsV2IterationSettings) o;
        return Objects.equals(this.id, projectsV2IterationSettings.id)
                && Objects.equals(this.startDate, projectsV2IterationSettings.startDate)
                && Objects.equals(this.duration, projectsV2IterationSettings.duration)
                && Objects.equals(this.title, projectsV2IterationSettings.title)
                && Objects.equals(this.completed, projectsV2IterationSettings.completed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startDate, duration, title, completed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsV2IterationSettings {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
