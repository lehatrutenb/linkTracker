package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * An iteration setting for an iteration field
 */
@Schema(name = "projects-v2-iteration-setting", description = "An iteration setting for an iteration field")
@JsonTypeName("projects-v2-iteration-setting")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsV2IterationSetting implements WebhookProjectsV2ItemEditedChangesOneOfFieldValueFrom {

    private String id;

    private String title;

    private Optional<String> titleHtml = Optional.empty();

    private JsonNullable<BigDecimal> duration = JsonNullable.<BigDecimal>undefined();

    private JsonNullable<String> startDate = JsonNullable.<String>undefined();

    private Optional<Boolean> completed = Optional.empty();

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
        this.titleHtml = Optional.ofNullable(titleHtml);
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
    public Optional<String> getTitleHtml() {
        return titleHtml;
    }

    public void setTitleHtml(Optional<String> titleHtml) {
        this.titleHtml = titleHtml;
    }

    public ProjectsV2IterationSetting duration(BigDecimal duration) {
        this.duration = JsonNullable.of(duration);
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
    public JsonNullable<BigDecimal> getDuration() {
        return duration;
    }

    public void setDuration(JsonNullable<BigDecimal> duration) {
        this.duration = duration;
    }

    public ProjectsV2IterationSetting startDate(String startDate) {
        this.startDate = JsonNullable.of(startDate);
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
    public JsonNullable<String> getStartDate() {
        return startDate;
    }

    public void setStartDate(JsonNullable<String> startDate) {
        this.startDate = startDate;
    }

    public ProjectsV2IterationSetting completed(Boolean completed) {
        this.completed = Optional.ofNullable(completed);
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
    public Optional<Boolean> getCompleted() {
        return completed;
    }

    public void setCompleted(Optional<Boolean> completed) {
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
                && equalsNullable(this.duration, projectsV2IterationSetting.duration)
                && equalsNullable(this.startDate, projectsV2IterationSetting.startDate)
                && Objects.equals(this.completed, projectsV2IterationSetting.completed);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, titleHtml, hashCodeNullable(duration), hashCodeNullable(startDate), completed);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
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
