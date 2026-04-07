package backend.academy.linktracker.scrapper.adapters.controllers.stackoverflow.models;

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
 * Represents a Collective.
 */
@Schema(name = "Collective", description = "Represents a Collective.")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:10:37.029105836Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Collective {

    private Optional<Long> collectiveId = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> slug = Optional.empty();

    private Optional<String> description = Optional.empty();

    private Optional<URI> link = Optional.empty();

    @Valid
    private List<String> tags = new ArrayList<>();

    @Valid
    private List<@Valid CollectiveExternalLinksInner> externalLinks = new ArrayList<>();

    public Collective collectiveId(Long collectiveId) {
        this.collectiveId = Optional.ofNullable(collectiveId);
        return this;
    }

    /**
     * Get collectiveId
     * @return collectiveId
     */
    @Schema(name = "collective_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("collective_id")
    public Optional<Long> getCollectiveId() {
        return collectiveId;
    }

    public void setCollectiveId(Optional<Long> collectiveId) {
        this.collectiveId = collectiveId;
    }

    public Collective name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public Collective slug(String slug) {
        this.slug = Optional.ofNullable(slug);
        return this;
    }

    /**
     * Get slug
     * @return slug
     */
    @Schema(name = "slug", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("slug")
    public Optional<String> getSlug() {
        return slug;
    }

    public void setSlug(Optional<String> slug) {
        this.slug = slug;
    }

    public Collective description(String description) {
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(Optional<String> description) {
        this.description = description;
    }

    public Collective link(URI link) {
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

    public Collective tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public Collective addTagsItem(String tagsItem) {
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

    public Collective externalLinks(List<@Valid CollectiveExternalLinksInner> externalLinks) {
        this.externalLinks = externalLinks;
        return this;
    }

    public Collective addExternalLinksItem(CollectiveExternalLinksInner externalLinksItem) {
        if (this.externalLinks == null) {
            this.externalLinks = new ArrayList<>();
        }
        this.externalLinks.add(externalLinksItem);
        return this;
    }

    /**
     * Get externalLinks
     * @return externalLinks
     */
    @Valid
    @Schema(name = "external_links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("external_links")
    public List<@Valid CollectiveExternalLinksInner> getExternalLinks() {
        return externalLinks;
    }

    public void setExternalLinks(List<@Valid CollectiveExternalLinksInner> externalLinks) {
        this.externalLinks = externalLinks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Collective collective = (Collective) o;
        return Objects.equals(this.collectiveId, collective.collectiveId)
                && Objects.equals(this.name, collective.name)
                && Objects.equals(this.slug, collective.slug)
                && Objects.equals(this.description, collective.description)
                && Objects.equals(this.link, collective.link)
                && Objects.equals(this.tags, collective.tags)
                && Objects.equals(this.externalLinks, collective.externalLinks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collectiveId, name, slug, description, link, tags, externalLinks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Collective {\n");
        sb.append("    collectiveId: ").append(toIndentedString(collectiveId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    externalLinks: ").append(toIndentedString(externalLinks)).append("\n");
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
