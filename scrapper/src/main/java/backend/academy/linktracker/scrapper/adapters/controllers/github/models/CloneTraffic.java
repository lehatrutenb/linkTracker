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
 * Clone Traffic
 */
@Schema(name = "clone-traffic", description = "Clone Traffic")
@JsonTypeName("clone-traffic")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CloneTraffic {

    private Long count;

    private Long uniques;

    @Valid
    private List<@Valid Traffic> clones = new ArrayList<>();

    public CloneTraffic() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CloneTraffic(Long count, Long uniques, List<@Valid Traffic> clones) {
        this.count = count;
        this.uniques = uniques;
        this.clones = clones;
    }

    public CloneTraffic count(Long count) {
        this.count = count;
        return this;
    }

    /**
     * Get count
     * @return count
     */
    @NotNull
    @Schema(name = "count", example = "173", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("count")
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public CloneTraffic uniques(Long uniques) {
        this.uniques = uniques;
        return this;
    }

    /**
     * Get uniques
     * @return uniques
     */
    @NotNull
    @Schema(name = "uniques", example = "128", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("uniques")
    public Long getUniques() {
        return uniques;
    }

    public void setUniques(Long uniques) {
        this.uniques = uniques;
    }

    public CloneTraffic clones(List<@Valid Traffic> clones) {
        this.clones = clones;
        return this;
    }

    public CloneTraffic addClonesItem(Traffic clonesItem) {
        if (this.clones == null) {
            this.clones = new ArrayList<>();
        }
        this.clones.add(clonesItem);
        return this;
    }

    /**
     * Get clones
     * @return clones
     */
    @NotNull
    @Valid
    @Schema(name = "clones", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("clones")
    public List<@Valid Traffic> getClones() {
        return clones;
    }

    public void setClones(List<@Valid Traffic> clones) {
        this.clones = clones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CloneTraffic cloneTraffic = (CloneTraffic) o;
        return Objects.equals(this.count, cloneTraffic.count)
                && Objects.equals(this.uniques, cloneTraffic.uniques)
                && Objects.equals(this.clones, cloneTraffic.clones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, uniques, clones);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloneTraffic {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    uniques: ").append(toIndentedString(uniques)).append("\n");
        sb.append("    clones: ").append(toIndentedString(clones)).append("\n");
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
