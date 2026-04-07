package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * The configuration for iteration fields.
 */
@Schema(name = "projects-v2-field-iteration-configuration", description = "The configuration for iteration fields.")
@JsonTypeName("projects-v2-field-iteration-configuration")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsV2FieldIterationConfiguration {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Optional<LocalDate> startDate = Optional.empty();

    private Optional<Long> duration = Optional.empty();

    @Valid
    private List<@Valid ProjectsV2FieldIterationConfigurationIterationsInner> iterations = new ArrayList<>();

    public ProjectsV2FieldIterationConfiguration startDate(LocalDate startDate) {
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * The start date of the first iteration.
     * @return startDate
     */
    @Valid
    @Schema(
            name = "start_date",
            description = "The start date of the first iteration.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("start_date")
    public Optional<LocalDate> getStartDate() {
        return startDate;
    }

    public void setStartDate(Optional<LocalDate> startDate) {
        this.startDate = startDate;
    }

    public ProjectsV2FieldIterationConfiguration duration(Long duration) {
        this.duration = Optional.ofNullable(duration);
        return this;
    }

    /**
     * The default duration for iterations in days. Individual iterations can override this value.
     * @return duration
     */
    @Schema(
            name = "duration",
            description = "The default duration for iterations in days. Individual iterations can override this value.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("duration")
    public Optional<Long> getDuration() {
        return duration;
    }

    public void setDuration(Optional<Long> duration) {
        this.duration = duration;
    }

    public ProjectsV2FieldIterationConfiguration iterations(
            List<@Valid ProjectsV2FieldIterationConfigurationIterationsInner> iterations) {
        this.iterations = iterations;
        return this;
    }

    public ProjectsV2FieldIterationConfiguration addIterationsItem(
            ProjectsV2FieldIterationConfigurationIterationsInner iterationsItem) {
        if (this.iterations == null) {
            this.iterations = new ArrayList<>();
        }
        this.iterations.add(iterationsItem);
        return this;
    }

    /**
     * Zero or more iterations for the field.
     * @return iterations
     */
    @Valid
    @Schema(
            name = "iterations",
            description = "Zero or more iterations for the field.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("iterations")
    public List<@Valid ProjectsV2FieldIterationConfigurationIterationsInner> getIterations() {
        return iterations;
    }

    public void setIterations(List<@Valid ProjectsV2FieldIterationConfigurationIterationsInner> iterations) {
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
        ProjectsV2FieldIterationConfiguration projectsV2FieldIterationConfiguration =
                (ProjectsV2FieldIterationConfiguration) o;
        return Objects.equals(this.startDate, projectsV2FieldIterationConfiguration.startDate)
                && Objects.equals(this.duration, projectsV2FieldIterationConfiguration.duration)
                && Objects.equals(this.iterations, projectsV2FieldIterationConfiguration.iterations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDate, duration, iterations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsV2FieldIterationConfiguration {\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
