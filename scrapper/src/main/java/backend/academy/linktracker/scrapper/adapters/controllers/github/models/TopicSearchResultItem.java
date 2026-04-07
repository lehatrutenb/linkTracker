package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Topic Search Result Item
 */
@Schema(name = "topic-search-result-item", description = "Topic Search Result Item")
@JsonTypeName("topic-search-result-item")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class TopicSearchResultItem {

    private String name;

    private JsonNullable<String> displayName = JsonNullable.<String>undefined();

    private JsonNullable<String> shortDescription = JsonNullable.<String>undefined();

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    private JsonNullable<String> createdBy = JsonNullable.<String>undefined();

    private JsonNullable<String> released = JsonNullable.<String>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private Boolean featured;

    private Boolean curated;

    private BigDecimal score;

    private JsonNullable<Long> repositoryCount = JsonNullable.<Long>undefined();

    private JsonNullable<URI> logoUrl = JsonNullable.<URI>undefined();

    @Valid
    private List<@Valid SearchResultTextMatchesInner> textMatches = new ArrayList<>();

    @Valid
    private JsonNullable<List<@Valid TopicSearchResultItemRelatedInner>> related =
            JsonNullable.<List<@Valid TopicSearchResultItemRelatedInner>>undefined();

    @Valid
    private JsonNullable<List<@Valid TopicSearchResultItemRelatedInner>> aliases =
            JsonNullable.<List<@Valid TopicSearchResultItemRelatedInner>>undefined();

    public TopicSearchResultItem() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TopicSearchResultItem(
            String name,
            String displayName,
            String shortDescription,
            String description,
            String createdBy,
            String released,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Boolean featured,
            Boolean curated,
            BigDecimal score) {
        this.name = name;
        this.displayName = JsonNullable.of(displayName);
        this.shortDescription = JsonNullable.of(shortDescription);
        this.description = JsonNullable.of(description);
        this.createdBy = JsonNullable.of(createdBy);
        this.released = JsonNullable.of(released);
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.featured = featured;
        this.curated = curated;
        this.score = score;
    }

    public TopicSearchResultItem name(String name) {
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

    public TopicSearchResultItem displayName(String displayName) {
        this.displayName = JsonNullable.of(displayName);
        return this;
    }

    /**
     * Get displayName
     * @return displayName
     */
    @NotNull
    @Schema(name = "display_name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("display_name")
    public JsonNullable<String> getDisplayName() {
        return displayName;
    }

    public void setDisplayName(JsonNullable<String> displayName) {
        this.displayName = displayName;
    }

    public TopicSearchResultItem shortDescription(String shortDescription) {
        this.shortDescription = JsonNullable.of(shortDescription);
        return this;
    }

    /**
     * Get shortDescription
     * @return shortDescription
     */
    @NotNull
    @Schema(name = "short_description", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("short_description")
    public JsonNullable<String> getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(JsonNullable<String> shortDescription) {
        this.shortDescription = shortDescription;
    }

    public TopicSearchResultItem description(String description) {
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public TopicSearchResultItem createdBy(String createdBy) {
        this.createdBy = JsonNullable.of(createdBy);
        return this;
    }

    /**
     * Get createdBy
     * @return createdBy
     */
    @NotNull
    @Schema(name = "created_by", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_by")
    public JsonNullable<String> getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(JsonNullable<String> createdBy) {
        this.createdBy = createdBy;
    }

    public TopicSearchResultItem released(String released) {
        this.released = JsonNullable.of(released);
        return this;
    }

    /**
     * Get released
     * @return released
     */
    @NotNull
    @Schema(name = "released", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("released")
    public JsonNullable<String> getReleased() {
        return released;
    }

    public void setReleased(JsonNullable<String> released) {
        this.released = released;
    }

    public TopicSearchResultItem createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public TopicSearchResultItem updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public TopicSearchResultItem featured(Boolean featured) {
        this.featured = featured;
        return this;
    }

    /**
     * Get featured
     * @return featured
     */
    @NotNull
    @Schema(name = "featured", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("featured")
    public Boolean getFeatured() {
        return featured;
    }

    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public TopicSearchResultItem curated(Boolean curated) {
        this.curated = curated;
        return this;
    }

    /**
     * Get curated
     * @return curated
     */
    @NotNull
    @Schema(name = "curated", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("curated")
    public Boolean getCurated() {
        return curated;
    }

    public void setCurated(Boolean curated) {
        this.curated = curated;
    }

    public TopicSearchResultItem score(BigDecimal score) {
        this.score = score;
        return this;
    }

    /**
     * Get score
     * @return score
     */
    @NotNull
    @Valid
    @Schema(name = "score", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("score")
    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public TopicSearchResultItem repositoryCount(Long repositoryCount) {
        this.repositoryCount = JsonNullable.of(repositoryCount);
        return this;
    }

    /**
     * Get repositoryCount
     * @return repositoryCount
     */
    @Schema(name = "repository_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_count")
    public JsonNullable<Long> getRepositoryCount() {
        return repositoryCount;
    }

    public void setRepositoryCount(JsonNullable<Long> repositoryCount) {
        this.repositoryCount = repositoryCount;
    }

    public TopicSearchResultItem logoUrl(URI logoUrl) {
        this.logoUrl = JsonNullable.of(logoUrl);
        return this;
    }

    /**
     * Get logoUrl
     * @return logoUrl
     */
    @Valid
    @Schema(name = "logo_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("logo_url")
    public JsonNullable<URI> getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(JsonNullable<URI> logoUrl) {
        this.logoUrl = logoUrl;
    }

    public TopicSearchResultItem textMatches(List<@Valid SearchResultTextMatchesInner> textMatches) {
        this.textMatches = textMatches;
        return this;
    }

    public TopicSearchResultItem addTextMatchesItem(SearchResultTextMatchesInner textMatchesItem) {
        if (this.textMatches == null) {
            this.textMatches = new ArrayList<>();
        }
        this.textMatches.add(textMatchesItem);
        return this;
    }

    /**
     * Get textMatches
     * @return textMatches
     */
    @Valid
    @Schema(name = "text_matches", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("text_matches")
    public List<@Valid SearchResultTextMatchesInner> getTextMatches() {
        return textMatches;
    }

    public void setTextMatches(List<@Valid SearchResultTextMatchesInner> textMatches) {
        this.textMatches = textMatches;
    }

    public TopicSearchResultItem related(List<@Valid TopicSearchResultItemRelatedInner> related) {
        this.related = JsonNullable.of(related);
        return this;
    }

    public TopicSearchResultItem addRelatedItem(TopicSearchResultItemRelatedInner relatedItem) {
        if (this.related == null || !this.related.isPresent()) {
            this.related = JsonNullable.of(new ArrayList<>());
        }
        this.related.get().add(relatedItem);
        return this;
    }

    /**
     * Get related
     * @return related
     */
    @Valid
    @Schema(name = "related", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("related")
    public JsonNullable<List<@Valid TopicSearchResultItemRelatedInner>> getRelated() {
        return related;
    }

    public void setRelated(JsonNullable<List<@Valid TopicSearchResultItemRelatedInner>> related) {
        this.related = related;
    }

    public TopicSearchResultItem aliases(List<@Valid TopicSearchResultItemRelatedInner> aliases) {
        this.aliases = JsonNullable.of(aliases);
        return this;
    }

    public TopicSearchResultItem addAliasesItem(TopicSearchResultItemRelatedInner aliasesItem) {
        if (this.aliases == null || !this.aliases.isPresent()) {
            this.aliases = JsonNullable.of(new ArrayList<>());
        }
        this.aliases.get().add(aliasesItem);
        return this;
    }

    /**
     * Get aliases
     * @return aliases
     */
    @Valid
    @Schema(name = "aliases", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("aliases")
    public JsonNullable<List<@Valid TopicSearchResultItemRelatedInner>> getAliases() {
        return aliases;
    }

    public void setAliases(JsonNullable<List<@Valid TopicSearchResultItemRelatedInner>> aliases) {
        this.aliases = aliases;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TopicSearchResultItem topicSearchResultItem = (TopicSearchResultItem) o;
        return Objects.equals(this.name, topicSearchResultItem.name)
                && Objects.equals(this.displayName, topicSearchResultItem.displayName)
                && Objects.equals(this.shortDescription, topicSearchResultItem.shortDescription)
                && Objects.equals(this.description, topicSearchResultItem.description)
                && Objects.equals(this.createdBy, topicSearchResultItem.createdBy)
                && Objects.equals(this.released, topicSearchResultItem.released)
                && Objects.equals(this.createdAt, topicSearchResultItem.createdAt)
                && Objects.equals(this.updatedAt, topicSearchResultItem.updatedAt)
                && Objects.equals(this.featured, topicSearchResultItem.featured)
                && Objects.equals(this.curated, topicSearchResultItem.curated)
                && Objects.equals(this.score, topicSearchResultItem.score)
                && equalsNullable(this.repositoryCount, topicSearchResultItem.repositoryCount)
                && equalsNullable(this.logoUrl, topicSearchResultItem.logoUrl)
                && Objects.equals(this.textMatches, topicSearchResultItem.textMatches)
                && equalsNullable(this.related, topicSearchResultItem.related)
                && equalsNullable(this.aliases, topicSearchResultItem.aliases);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                displayName,
                shortDescription,
                description,
                createdBy,
                released,
                createdAt,
                updatedAt,
                featured,
                curated,
                score,
                hashCodeNullable(repositoryCount),
                hashCodeNullable(logoUrl),
                textMatches,
                hashCodeNullable(related),
                hashCodeNullable(aliases));
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopicSearchResultItem {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    shortDescription: ")
                .append(toIndentedString(shortDescription))
                .append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    released: ").append(toIndentedString(released)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    featured: ").append(toIndentedString(featured)).append("\n");
        sb.append("    curated: ").append(toIndentedString(curated)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    repositoryCount: ")
                .append(toIndentedString(repositoryCount))
                .append("\n");
        sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
        sb.append("    textMatches: ").append(toIndentedString(textMatches)).append("\n");
        sb.append("    related: ").append(toIndentedString(related)).append("\n");
        sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
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
