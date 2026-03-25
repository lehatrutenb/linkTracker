package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Topic Search Result Item
 */
@Schema(name = "topic-search-result-item", description = "Topic Search Result Item")
@JsonTypeName("topic-search-result-item")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class TopicSearchResultItem {

    private String name;

    private String displayName = null;

    private String shortDescription = null;

    private String description = null;

    private String createdBy = null;

    private String released = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private Boolean featured;

    private Boolean curated;

    private BigDecimal score;

    private Long repositoryCount = null;

    private URI logoUrl = null;

    @Valid
    private List<@Valid SearchResultTextMatchesInner> textMatches = new ArrayList<>();

    @Valid
    private List<@Valid TopicSearchResultItemRelatedInner> related;

    @Valid
    private List<@Valid TopicSearchResultItemRelatedInner> aliases;

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
        this.displayName = displayName;
        this.shortDescription = shortDescription;
        this.description = description;
        this.createdBy = createdBy;
        this.released = released;
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
        this.displayName = displayName;
        return this;
    }

    /**
     * Get displayName
     * @return displayName
     */
    @NotNull
    @Schema(name = "display_name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public TopicSearchResultItem shortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    /**
     * Get shortDescription
     * @return shortDescription
     */
    @NotNull
    @Schema(name = "short_description", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("short_description")
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public TopicSearchResultItem description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TopicSearchResultItem createdBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get createdBy
     * @return createdBy
     */
    @NotNull
    @Schema(name = "created_by", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_by")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public TopicSearchResultItem released(String released) {
        this.released = released;
        return this;
    }

    /**
     * Get released
     * @return released
     */
    @NotNull
    @Schema(name = "released", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("released")
    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
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
        this.repositoryCount = repositoryCount;
        return this;
    }

    /**
     * Get repositoryCount
     * @return repositoryCount
     */
    @Schema(name = "repository_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_count")
    public Long getRepositoryCount() {
        return repositoryCount;
    }

    public void setRepositoryCount(Long repositoryCount) {
        this.repositoryCount = repositoryCount;
    }

    public TopicSearchResultItem logoUrl(URI logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }

    /**
     * Get logoUrl
     * @return logoUrl
     */
    @Valid
    @Schema(name = "logo_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("logo_url")
    public URI getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(URI logoUrl) {
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
        this.related = related;
        return this;
    }

    public TopicSearchResultItem addRelatedItem(TopicSearchResultItemRelatedInner relatedItem) {
        if (this.related == null) {
            this.related = new ArrayList<>();
        }
        this.related.add(relatedItem);
        return this;
    }

    /**
     * Get related
     * @return related
     */
    @Valid
    @Schema(name = "related", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("related")
    public List<@Valid TopicSearchResultItemRelatedInner> getRelated() {
        return related;
    }

    public void setRelated(List<@Valid TopicSearchResultItemRelatedInner> related) {
        this.related = related;
    }

    public TopicSearchResultItem aliases(List<@Valid TopicSearchResultItemRelatedInner> aliases) {
        this.aliases = aliases;
        return this;
    }

    public TopicSearchResultItem addAliasesItem(TopicSearchResultItemRelatedInner aliasesItem) {
        if (this.aliases == null) {
            this.aliases = new ArrayList<>();
        }
        this.aliases.add(aliasesItem);
        return this;
    }

    /**
     * Get aliases
     * @return aliases
     */
    @Valid
    @Schema(name = "aliases", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("aliases")
    public List<@Valid TopicSearchResultItemRelatedInner> getAliases() {
        return aliases;
    }

    public void setAliases(List<@Valid TopicSearchResultItemRelatedInner> aliases) {
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
                && Objects.equals(this.repositoryCount, topicSearchResultItem.repositoryCount)
                && Objects.equals(this.logoUrl, topicSearchResultItem.logoUrl)
                && Objects.equals(this.textMatches, topicSearchResultItem.textMatches)
                && Objects.equals(this.related, topicSearchResultItem.related)
                && Objects.equals(this.aliases, topicSearchResultItem.aliases);
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
                repositoryCount,
                logoUrl,
                textMatches,
                related,
                aliases);
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
