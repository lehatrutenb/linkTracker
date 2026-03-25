package backend.academy.linktracker.scrapper.adapters.controllers.stackoverflow.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Information about a question migration.
 */
@Schema(name = "MigrationInfo", description = "Information about a question migration.")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-24T12:15:15.683209678Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MigrationInfo {

    private Site otherSite;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime onDate;

    private Long questionId;

    public MigrationInfo otherSite(Site otherSite) {
        this.otherSite = otherSite;
        return this;
    }

    /**
     * Get otherSite
     * @return otherSite
     */
    @Valid
    @Schema(name = "other_site", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("other_site")
    public Site getOtherSite() {
        return otherSite;
    }

    public void setOtherSite(Site otherSite) {
        this.otherSite = otherSite;
    }

    public MigrationInfo onDate(OffsetDateTime onDate) {
        this.onDate = onDate;
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
    public OffsetDateTime getOnDate() {
        return onDate;
    }

    public void setOnDate(OffsetDateTime onDate) {
        this.onDate = onDate;
    }

    public MigrationInfo questionId(Long questionId) {
        this.questionId = questionId;
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
    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
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
