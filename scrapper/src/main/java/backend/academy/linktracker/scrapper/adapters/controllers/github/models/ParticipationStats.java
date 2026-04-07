package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ParticipationStats
 */
@JsonTypeName("participation-stats")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ParticipationStats {

    @Valid
    private List<Long> all = new ArrayList<>();

    @Valid
    private List<Long> owner = new ArrayList<>();

    public ParticipationStats() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ParticipationStats(List<Long> all, List<Long> owner) {
        this.all = all;
        this.owner = owner;
    }

    public ParticipationStats all(List<Long> all) {
        this.all = all;
        return this;
    }

    public ParticipationStats addAllItem(Long allItem) {
        if (this.all == null) {
            this.all = new ArrayList<>();
        }
        this.all.add(allItem);
        return this;
    }

    /**
     * Get all
     * @return all
     */
    @NotNull
    @Schema(name = "all", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("all")
    public List<Long> getAll() {
        return all;
    }

    public void setAll(List<Long> all) {
        this.all = all;
    }

    public ParticipationStats owner(List<Long> owner) {
        this.owner = owner;
        return this;
    }

    public ParticipationStats addOwnerItem(Long ownerItem) {
        if (this.owner == null) {
            this.owner = new ArrayList<>();
        }
        this.owner.add(ownerItem);
        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    @NotNull
    @Schema(name = "owner", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("owner")
    public List<Long> getOwner() {
        return owner;
    }

    public void setOwner(List<Long> owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParticipationStats participationStats = (ParticipationStats) o;
        return Objects.equals(this.all, participationStats.all) && Objects.equals(this.owner, participationStats.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(all, owner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParticipationStats {\n");
        sb.append("    all: ").append(toIndentedString(all)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
