package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * OrganizationFullPlan
 */
@JsonTypeName("organization_full_plan")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrganizationFullPlan {

    private String name;

    private Long space;

    private Long privateRepos;

    private Optional<Long> filledSeats = Optional.empty();

    private Optional<Long> seats = Optional.empty();

    public OrganizationFullPlan() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrganizationFullPlan(String name, Long space, Long privateRepos) {
        this.name = name;
        this.space = space;
        this.privateRepos = privateRepos;
    }

    public OrganizationFullPlan name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrganizationFullPlan space(Long space) {
        this.space = space;
        return this;
    }

    /**
     * Get space
     * @return space
     */
    @NotNull
    @Schema(name = "space", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("space")
    public Long getSpace() {
        return space;
    }

    public void setSpace(Long space) {
        this.space = space;
    }

    public OrganizationFullPlan privateRepos(Long privateRepos) {
        this.privateRepos = privateRepos;
        return this;
    }

    /**
     * Get privateRepos
     * @return privateRepos
     */
    @NotNull
    @Schema(name = "private_repos", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("private_repos")
    public Long getPrivateRepos() {
        return privateRepos;
    }

    public void setPrivateRepos(Long privateRepos) {
        this.privateRepos = privateRepos;
    }

    public OrganizationFullPlan filledSeats(Long filledSeats) {
        this.filledSeats = Optional.ofNullable(filledSeats);
        return this;
    }

    /**
     * Get filledSeats
     * @return filledSeats
     */
    @Schema(name = "filled_seats", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("filled_seats")
    public Optional<Long> getFilledSeats() {
        return filledSeats;
    }

    public void setFilledSeats(Optional<Long> filledSeats) {
        this.filledSeats = filledSeats;
    }

    public OrganizationFullPlan seats(Long seats) {
        this.seats = Optional.ofNullable(seats);
        return this;
    }

    /**
     * Get seats
     * @return seats
     */
    @Schema(name = "seats", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("seats")
    public Optional<Long> getSeats() {
        return seats;
    }

    public void setSeats(Optional<Long> seats) {
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
        OrganizationFullPlan organizationFullPlan = (OrganizationFullPlan) o;
        return Objects.equals(this.name, organizationFullPlan.name)
                && Objects.equals(this.space, organizationFullPlan.space)
                && Objects.equals(this.privateRepos, organizationFullPlan.privateRepos)
                && Objects.equals(this.filledSeats, organizationFullPlan.filledSeats)
                && Objects.equals(this.seats, organizationFullPlan.seats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, space, privateRepos, filledSeats, seats);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationFullPlan {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    space: ").append(toIndentedString(space)).append("\n");
        sb.append("    privateRepos: ").append(toIndentedString(privateRepos)).append("\n");
        sb.append("    filledSeats: ").append(toIndentedString(filledSeats)).append("\n");
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
