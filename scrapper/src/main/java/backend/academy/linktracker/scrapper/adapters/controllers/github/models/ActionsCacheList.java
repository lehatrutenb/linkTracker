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
 * Repository actions caches
 */
@Schema(name = "actions-cache-list", description = "Repository actions caches")
@JsonTypeName("actions-cache-list")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsCacheList {

    private Long totalCount;

    @Valid
    private List<@Valid ActionsCacheListActionsCachesInner> actionsCaches = new ArrayList<>();

    public ActionsCacheList() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsCacheList(Long totalCount, List<@Valid ActionsCacheListActionsCachesInner> actionsCaches) {
        this.totalCount = totalCount;
        this.actionsCaches = actionsCaches;
    }

    public ActionsCacheList totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Total number of caches
     * @return totalCount
     */
    @NotNull
    @Schema(
            name = "total_count",
            example = "2",
            description = "Total number of caches",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total_count")
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ActionsCacheList actionsCaches(List<@Valid ActionsCacheListActionsCachesInner> actionsCaches) {
        this.actionsCaches = actionsCaches;
        return this;
    }

    public ActionsCacheList addActionsCachesItem(ActionsCacheListActionsCachesInner actionsCachesItem) {
        if (this.actionsCaches == null) {
            this.actionsCaches = new ArrayList<>();
        }
        this.actionsCaches.add(actionsCachesItem);
        return this;
    }

    /**
     * Array of caches
     * @return actionsCaches
     */
    @NotNull
    @Valid
    @Schema(name = "actions_caches", description = "Array of caches", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("actions_caches")
    public List<@Valid ActionsCacheListActionsCachesInner> getActionsCaches() {
        return actionsCaches;
    }

    public void setActionsCaches(List<@Valid ActionsCacheListActionsCachesInner> actionsCaches) {
        this.actionsCaches = actionsCaches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsCacheList actionsCacheList = (ActionsCacheList) o;
        return Objects.equals(this.totalCount, actionsCacheList.totalCount)
                && Objects.equals(this.actionsCaches, actionsCacheList.actionsCaches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, actionsCaches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsCacheList {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    actionsCaches: ").append(toIndentedString(actionsCaches)).append("\n");
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
