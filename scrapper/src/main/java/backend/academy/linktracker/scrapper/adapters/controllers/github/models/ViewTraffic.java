package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * View Traffic
 */
@Schema(name = "view-traffic", description = "View Traffic")
@JsonTypeName("view-traffic")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ViewTraffic {

    private Long count;

    private Long uniques;

    @Valid
    private List<@Valid Traffic> views = new ArrayList<>();

    public ViewTraffic() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ViewTraffic(Long count, Long uniques, List<@Valid Traffic> views) {
        this.count = count;
        this.uniques = uniques;
        this.views = views;
    }

    public ViewTraffic count(Long count) {
        this.count = count;
        return this;
    }

    /**
     * Get count
     * @return count
     */
    @NotNull
    @Schema(name = "count", example = "14850", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("count")
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ViewTraffic uniques(Long uniques) {
        this.uniques = uniques;
        return this;
    }

    /**
     * Get uniques
     * @return uniques
     */
    @NotNull
    @Schema(name = "uniques", example = "3782", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("uniques")
    public Long getUniques() {
        return uniques;
    }

    public void setUniques(Long uniques) {
        this.uniques = uniques;
    }

    public ViewTraffic views(List<@Valid Traffic> views) {
        this.views = views;
        return this;
    }

    public ViewTraffic addViewsItem(Traffic viewsItem) {
        if (this.views == null) {
            this.views = new ArrayList<>();
        }
        this.views.add(viewsItem);
        return this;
    }

    /**
     * Get views
     * @return views
     */
    @NotNull
    @Valid
    @Schema(name = "views", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("views")
    public List<@Valid Traffic> getViews() {
        return views;
    }

    public void setViews(List<@Valid Traffic> views) {
        this.views = views;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViewTraffic viewTraffic = (ViewTraffic) o;
        return Objects.equals(this.count, viewTraffic.count)
                && Objects.equals(this.uniques, viewTraffic.uniques)
                && Objects.equals(this.views, viewTraffic.views);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, uniques, views);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ViewTraffic {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    uniques: ").append(toIndentedString(uniques)).append("\n");
        sb.append("    views: ").append(toIndentedString(views)).append("\n");
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
