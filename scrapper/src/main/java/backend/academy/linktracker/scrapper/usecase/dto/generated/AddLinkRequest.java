package backend.academy.linktracker.scrapper.usecase.dto.generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * AddLinkRequest
 */
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:05:18.391121671Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class AddLinkRequest {

    private Optional<URI> link = Optional.empty();

    @Valid
    private List<String> tags = new ArrayList<>();

    @Valid
    private List<String> filters = new ArrayList<>();

    public AddLinkRequest link(URI link) {
        this.link = Optional.ofNullable(link);
        return this;
    }

    /**
     * Get link
     * @return link
     */
    @Valid
    @Schema(name = "link", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("link")
    public Optional<URI> getLink() {
        return link;
    }

    public void setLink(Optional<URI> link) {
        this.link = link;
    }

    public AddLinkRequest tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public AddLinkRequest addTagsItem(String tagsItem) {
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

    public AddLinkRequest filters(List<String> filters) {
        this.filters = filters;
        return this;
    }

    public AddLinkRequest addFiltersItem(String filtersItem) {
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
        AddLinkRequest addLinkRequest = (AddLinkRequest) o;
        return Objects.equals(this.link, addLinkRequest.link)
                && Objects.equals(this.tags, addLinkRequest.tags)
                && Objects.equals(this.filters, addLinkRequest.filters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(link, tags, filters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddLinkRequest {\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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
