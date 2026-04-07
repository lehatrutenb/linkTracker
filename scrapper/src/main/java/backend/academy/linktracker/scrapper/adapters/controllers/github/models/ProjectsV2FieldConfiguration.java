package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Configuration for iteration fields.
 */
@Schema(name = "projects_v2_field_configuration", description = "Configuration for iteration fields.")
@JsonTypeName("projects_v2_field_configuration")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsV2FieldConfiguration {

    private Optional<Long> startDay = Optional.empty();

    private Optional<Long> duration = Optional.empty();

    @Valid
    private List<@Valid ProjectsV2IterationSettings> iterations = new ArrayList<>();

    public ProjectsV2FieldConfiguration startDay(Long startDay) {
        this.startDay = Optional.ofNullable(startDay);
        return this;
    }

    /**
     * The day of the week when the iteration starts.
     * @return startDay
     */
    @Schema(
            name = "start_day",
            description = "The day of the week when the iteration starts.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("start_day")
    public Optional<Long> getStartDay() {
        return startDay;
    }

    public void setStartDay(Optional<Long> startDay) {
        this.startDay = startDay;
    }

    public ProjectsV2FieldConfiguration duration(Long duration) {
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

    public ProjectsV2FieldConfiguration iterations(List<@Valid ProjectsV2IterationSettings> iterations) {
        this.iterations = iterations;
        return this;
    }

    public ProjectsV2FieldConfiguration addIterationsItem(ProjectsV2IterationSettings iterationsItem) {
        if (this.iterations == null) {
            this.iterations = new ArrayList<>();
        }
        this.iterations.add(iterationsItem);
        return this;
    }

    /**
     * Get iterations
     * @return iterations
     */
    @Valid
    @Schema(name = "iterations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("iterations")
    public List<@Valid ProjectsV2IterationSettings> getIterations() {
        return iterations;
    }

    public void setIterations(List<@Valid ProjectsV2IterationSettings> iterations) {
        this.iterations = iterations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectsV2FieldConfiguration projectsV2FieldConfiguration = (ProjectsV2FieldConfiguration) o;
        return Objects.equals(this.startDay, projectsV2FieldConfiguration.startDay)
                && Objects.equals(this.duration, projectsV2FieldConfiguration.duration)
                && Objects.equals(this.iterations, projectsV2FieldConfiguration.iterations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDay, duration, iterations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsV2FieldConfiguration {\n");
        sb.append("    startDay: ").append(toIndentedString(startDay)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    iterations: ").append(toIndentedString(iterations)).append("\n");
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
