package backend.academy.linktracker.bot.usecases.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.lang.Nullable;

/**
 * LinkResponse
 */
public class LinkResponse {

    private @Nullable Long id;

    private @Nullable URI url;

    @Valid
    private List<String> tags = new ArrayList<>();

    @Valid
    private List<String> filters = new ArrayList<>();

    public LinkResponse id(@Nullable Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public @Nullable Long getId() {
        return id;
    }

    public void setId(@Nullable Long id) {
        this.id = id;
    }

    public LinkResponse url(@Nullable URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public @Nullable URI getUrl() {
        return url;
    }

    public void setUrl(@Nullable URI url) {
        this.url = url;
    }

    public LinkResponse tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public LinkResponse addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * Get tags
     * @return tags
     */
    @Schema(name = "tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public LinkResponse filters(List<String> filters) {
        this.filters = filters;
        return this;
    }

    public LinkResponse addFiltersItem(String filtersItem) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filtersItem);
        return this;
    }

    /**
     * Get filters
     * @return filters
     */
    @Schema(name = "filters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("filters")
    public List<String> getFilters() {
        return filters;
    }

    public void setFilters(List<String> filters) {
        this.filters = filters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LinkResponse linkResponse = (LinkResponse) o;
        return Objects.equals(this.id, linkResponse.id)
                && Objects.equals(this.url, linkResponse.url)
                && Objects.equals(this.tags, linkResponse.tags)
                && Objects.equals(this.filters, linkResponse.filters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url, tags, filters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinkResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(@Nullable Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
