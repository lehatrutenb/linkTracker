package backend.academy.linktracker.scrapper.adapters.controllers.stackoverflow.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Information about a question migration.
 */
@Schema(name = "MigrationInfo", description = "Information about a question migration.")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:10:37.029105836Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MigrationInfo {

    private Optional<Site> otherSite = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> onDate = Optional.empty();

    private Optional<Long> questionId = Optional.empty();

    public MigrationInfo otherSite(Site otherSite) {
        this.otherSite = Optional.ofNullable(otherSite);
        return this;
    }

    /**
     * Get otherSite
     * @return otherSite
     */
    @Valid
    @Schema(name = "other_site", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("other_site")
    public Optional<Site> getOtherSite() {
        return otherSite;
    }

    public void setOtherSite(Optional<Site> otherSite) {
        this.otherSite = otherSite;
    }

    public MigrationInfo onDate(OffsetDateTime onDate) {
        this.onDate = Optional.ofNullable(onDate);
        return this;
    }

    /**
     * The date when the migration occurred.
     * @return onDate
     */
    @Valid
    @Schema(
            name = "on_date",
            description = "The date when the migration occurred.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("on_date")
    public Optional<OffsetDateTime> getOnDate() {
        return onDate;
    }

    public void setOnDate(Optional<OffsetDateTime> onDate) {
        this.onDate = onDate;
    }

    public MigrationInfo questionId(Long questionId) {
        this.questionId = Optional.ofNullable(questionId);
        return this;
    }

    /**
     * The ID of the question on the other site.
     * @return questionId
     */
    @Schema(
            name = "question_id",
            description = "The ID of the question on the other site.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("question_id")
    public Optional<Long> getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Optional<Long> questionId) {
        this.questionId = questionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MigrationInfo migrationInfo = (MigrationInfo) o;
        return Objects.equals(this.otherSite, migrationInfo.otherSite)
                && Objects.equals(this.onDate, migrationInfo.onDate)
                && Objects.equals(this.questionId, migrationInfo.questionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(otherSite, onDate, questionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrationInfo {\n");
        sb.append("    otherSite: ").append(toIndentedString(otherSite)).append("\n");
        sb.append("    onDate: ").append(toIndentedString(onDate)).append("\n");
        sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
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
