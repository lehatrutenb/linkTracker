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
 * CopilotListCopilotSeats200Response
 */
@JsonTypeName("copilot_list_copilot_seats_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotListCopilotSeats200Response {

    private Optional<Long> totalSeats = Optional.empty();

    @Valid
    private List<@Valid CopilotSeatDetails> seats = new ArrayList<>();

    public CopilotListCopilotSeats200Response totalSeats(Long totalSeats) {
        this.totalSeats = Optional.ofNullable(totalSeats);
        return this;
    }

    /**
     * Total number of Copilot seats for the organization currently being billed.
     * @return totalSeats
     */
    @Schema(
            name = "total_seats",
            description = "Total number of Copilot seats for the organization currently being billed.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_seats")
    public Optional<Long> getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(Optional<Long> totalSeats) {
        this.totalSeats = totalSeats;
    }

    public CopilotListCopilotSeats200Response seats(List<@Valid CopilotSeatDetails> seats) {
        this.seats = seats;
        return this;
    }

    public CopilotListCopilotSeats200Response addSeatsItem(CopilotSeatDetails seatsItem) {
        if (this.seats == null) {
            this.seats = new ArrayList<>();
        }
        this.seats.add(seatsItem);
        return this;
    }

    /**
     * Get seats
     * @return seats
     */
    @Valid
    @Schema(name = "seats", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("seats")
    public List<@Valid CopilotSeatDetails> getSeats() {
        return seats;
    }

    public void setSeats(List<@Valid CopilotSeatDetails> seats) {
        this.seats = seats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopilotListCopilotSeats200Response copilotListCopilotSeats200Response = (CopilotListCopilotSeats200Response) o;
        return Objects.equals(this.totalSeats, copilotListCopilotSeats200Response.totalSeats)
                && Objects.equals(this.seats, copilotListCopilotSeats200Response.seats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalSeats, seats);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopilotListCopilotSeats200Response {\n");
        sb.append("    totalSeats: ").append(toIndentedString(totalSeats)).append("\n");
        sb.append("    seats: ").append(toIndentedString(seats)).append("\n");
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
