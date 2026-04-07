package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * The total number of seats created for the specified user(s).
 */
@Schema(
        name = "copilot_add_copilot_seats_for_users_201_response",
        description = "The total number of seats created for the specified user(s).")
@JsonTypeName("copilot_add_copilot_seats_for_users_201_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotAddCopilotSeatsForUsers201Response {

    private Long seatsCreated;

    public CopilotAddCopilotSeatsForUsers201Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CopilotAddCopilotSeatsForUsers201Response(Long seatsCreated) {
        this.seatsCreated = seatsCreated;
    }

    public CopilotAddCopilotSeatsForUsers201Response seatsCreated(Long seatsCreated) {
        this.seatsCreated = seatsCreated;
        return this;
    }

    /**
     * Get seatsCreated
     * @return seatsCreated
     */
    @NotNull
    @Schema(name = "seats_created", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("seats_created")
    public Long getSeatsCreated() {
        return seatsCreated;
    }

    public void setSeatsCreated(Long seatsCreated) {
        this.seatsCreated = seatsCreated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopilotAddCopilotSeatsForUsers201Response copilotAddCopilotSeatsForUsers201Response =
                (CopilotAddCopilotSeatsForUsers201Response) o;
        return Objects.equals(this.seatsCreated, copilotAddCopilotSeatsForUsers201Response.seatsCreated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seatsCreated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopilotAddCopilotSeatsForUsers201Response {\n");
        sb.append("    seatsCreated: ").append(toIndentedString(seatsCreated)).append("\n");
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
