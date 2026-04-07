package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * ActionsArtifactAndLogRetentionResponse
 */
@JsonTypeName("actions-artifact-and-log-retention-response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsArtifactAndLogRetentionResponse {

    private Long days;

    private Long maximumAllowedDays;

    public ActionsArtifactAndLogRetentionResponse() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsArtifactAndLogRetentionResponse(Long days, Long maximumAllowedDays) {
        this.days = days;
        this.maximumAllowedDays = maximumAllowedDays;
    }

    public ActionsArtifactAndLogRetentionResponse days(Long days) {
        this.days = days;
        return this;
    }

    /**
     * The number of days artifacts and logs are retained
     * @return days
     */
    @NotNull
    @Schema(
            name = "days",
            description = "The number of days artifacts and logs are retained",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("days")
    public Long getDays() {
        return days;
    }

    public void setDays(Long days) {
        this.days = days;
    }

    public ActionsArtifactAndLogRetentionResponse maximumAllowedDays(Long maximumAllowedDays) {
        this.maximumAllowedDays = maximumAllowedDays;
        return this;
    }

    /**
     * The maximum number of days that can be configured
     * @return maximumAllowedDays
     */
    @NotNull
    @Schema(
            name = "maximum_allowed_days",
            description = "The maximum number of days that can be configured",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("maximum_allowed_days")
    public Long getMaximumAllowedDays() {
        return maximumAllowedDays;
    }

    public void setMaximumAllowedDays(Long maximumAllowedDays) {
        this.maximumAllowedDays = maximumAllowedDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsArtifactAndLogRetentionResponse actionsArtifactAndLogRetentionResponse =
                (ActionsArtifactAndLogRetentionResponse) o;
        return Objects.equals(this.days, actionsArtifactAndLogRetentionResponse.days)
                && Objects.equals(this.maximumAllowedDays, actionsArtifactAndLogRetentionResponse.maximumAllowedDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(days, maximumAllowedDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsArtifactAndLogRetentionResponse {\n");
        sb.append("    days: ").append(toIndentedString(days)).append("\n");
        sb.append("    maximumAllowedDays: ")
                .append(toIndentedString(maximumAllowedDays))
                .append("\n");
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
