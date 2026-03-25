package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ActionsArtifactAndLogRetention
 */
@JsonTypeName("actions-artifact-and-log-retention")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsArtifactAndLogRetention {

    private Long days;

    public ActionsArtifactAndLogRetention() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsArtifactAndLogRetention(Long days) {
        this.days = days;
    }

    public ActionsArtifactAndLogRetention days(Long days) {
        this.days = days;
        return this;
    }

    /**
     * The number of days to retain artifacts and logs
     * @return days
     */
    @NotNull
    @Schema(
            name = "days",
            description = "The number of days to retain artifacts and logs",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("days")
    public Long getDays() {
        return days;
    }

    public void setDays(Long days) {
        this.days = days;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsArtifactAndLogRetention actionsArtifactAndLogRetention = (ActionsArtifactAndLogRetention) o;
        return Objects.equals(this.days, actionsArtifactAndLogRetention.days);
    }

    @Override
    public int hashCode() {
        return Objects.hash(days);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsArtifactAndLogRetention {\n");
        sb.append("    days: ").append(toIndentedString(days)).append("\n");
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
