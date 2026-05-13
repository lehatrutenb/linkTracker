package backend.academy.linktracker.bot.usecase.dto.generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * ListLinksResponse
 */
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:05:18.391121671Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ListLinksResponse {

    @Valid
    private List<@Valid LinkResponse> links = new ArrayList<>();

    private Optional<Integer> size = Optional.empty();

    public ListLinksResponse links(List<@Valid LinkResponse> links) {
        this.links = links;
        return this;
    }

    public ListLinksResponse addLinksItem(LinkResponse linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    /**
     * Get links
     * @return links
     */
    @Valid
    @Schema(name = "links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("links")
    public List<@Valid LinkResponse> getLinks() {
        return links;
    }

    public void setLinks(List<@Valid LinkResponse> links) {
        this.links = links;
    }

    public ListLinksResponse size(Integer size) {
        this.size = Optional.ofNullable(size);
        return this;
    }

    /**
     * Get size
     * @return size
     */
    @Schema(name = "size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("size")
    public Optional<Integer> getSize() {
        return size;
    }

    public void setSize(Optional<Integer> size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLinksResponse listLinksResponse = (ListLinksResponse) o;
        return Objects.equals(this.links, listLinksResponse.links) && Objects.equals(this.size, listLinksResponse.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLinksResponse {\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
