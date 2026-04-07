package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * ProjectsV2FieldIterationConfigurationIterationsInner
 */
@JsonTypeName("projects_v2_field_iteration_configuration_iterations_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsV2FieldIterationConfigurationIterationsInner {

    private Optional<String> title = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Optional<LocalDate> startDate = Optional.empty();

    private Optional<Long> duration = Optional.empty();

    public ProjectsV2FieldIterationConfigurationIterationsInner title(String title) {
        this.title = Optional.ofNullable(title);
        return this;
    }

    /**
     * The title of the iteration.
     * @return title
     */
    @Schema(
            name = "title",
            description = "The title of the iteration.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("title")
    public Optional<String> getTitle() {
        return title;
    }

    public void setTitle(Optional<String> title) {
        this.title = title;
    }

    public ProjectsV2FieldIterationConfigurationIterationsInner startDate(LocalDate startDate) {
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * The start date of the iteration.
     * @return startDate
     */
    @Valid
    @Schema(
            name = "start_date",
            description = "The start date of the iteration.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("start_date")
    public Optional<LocalDate> getStartDate() {
        return startDate;
    }

    public void setStartDate(Optional<LocalDate> startDate) {
        this.startDate = startDate;
    }

    public ProjectsV2FieldIterationConfigurationIterationsInner duration(Long duration) {
        this.duration = Optional.ofNullable(duration);
        return this;
    }

    /**
     * The duration of the iteration in days.
     * @return duration
     */
    @Schema(
            name = "duration",
            description = "The duration of the iteration in days.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("duration")
    public Optional<Long> getDuration() {
        return duration;
    }

    public void setDuration(Optional<Long> duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectsV2FieldIterationConfigurationIterationsInner projectsV2FieldIterationConfigurationIterationsInner =
                (ProjectsV2FieldIterationConfigurationIterationsInner) o;
        return Objects.equals(this.title, projectsV2FieldIterationConfigurationIterationsInner.title)
                && Objects.equals(this.startDate, projectsV2FieldIterationConfigurationIterationsInner.startDate)
                && Objects.equals(this.duration, projectsV2FieldIterationConfigurationIterationsInner.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, startDate, duration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsV2FieldIterationConfigurationIterationsInner {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
