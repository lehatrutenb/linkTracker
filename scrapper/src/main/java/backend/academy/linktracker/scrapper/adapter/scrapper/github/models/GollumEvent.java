package backend.academy.linktracker.scrapper.adapter.scrapper.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GollumEvent
 */
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GollumEvent implements EventPayload {

    @Valid
    private List<@Valid GollumEventPagesInner> pages = new ArrayList<>();

    public GollumEvent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GollumEvent(List<@Valid GollumEventPagesInner> pages) {
        this.pages = pages;
    }

    public GollumEvent pages(List<@Valid GollumEventPagesInner> pages) {
        this.pages = pages;
        return this;
    }

    public GollumEvent addPagesItem(GollumEventPagesInner pagesItem) {
        if (this.pages == null) {
            this.pages = new ArrayList<>();
        }
        this.pages.add(pagesItem);
        return this;
    }

    /**
     * Get pages
     * @return pages
     */
    @NotNull
    @Valid
    @Schema(name = "pages", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pages")
    public List<@Valid GollumEventPagesInner> getPages() {
        return pages;
    }

    public void setPages(List<@Valid GollumEventPagesInner> pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GollumEvent gollumEvent = (GollumEvent) o;
        return Objects.equals(this.pages, gollumEvent.pages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GollumEvent {\n");
        sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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
