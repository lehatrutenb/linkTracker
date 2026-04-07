package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * TopicSearchResultItemRelatedInnerTopicRelation
 */
@JsonTypeName("topic_search_result_item_related_inner_topic_relation")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class TopicSearchResultItemRelatedInnerTopicRelation {

    private Optional<Long> id = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<Long> topicId = Optional.empty();

    private Optional<String> relationType = Optional.empty();

    public TopicSearchResultItemRelatedInnerTopicRelation id(Long id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public TopicSearchResultItemRelatedInnerTopicRelation name(String name) {
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

    public TopicSearchResultItemRelatedInnerTopicRelation topicId(Long topicId) {
        this.topicId = Optional.ofNullable(topicId);
        return this;
    }

    /**
     * Get topicId
     * @return topicId
     */
    @Schema(name = "topic_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("topic_id")
    public Optional<Long> getTopicId() {
        return topicId;
    }

    public void setTopicId(Optional<Long> topicId) {
        this.topicId = topicId;
    }

    public TopicSearchResultItemRelatedInnerTopicRelation relationType(String relationType) {
        this.relationType = Optional.ofNullable(relationType);
        return this;
    }

    /**
     * Get relationType
     * @return relationType
     */
    @Schema(name = "relation_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("relation_type")
    public Optional<String> getRelationType() {
        return relationType;
    }

    public void setRelationType(Optional<String> relationType) {
        this.relationType = relationType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TopicSearchResultItemRelatedInnerTopicRelation topicSearchResultItemRelatedInnerTopicRelation =
                (TopicSearchResultItemRelatedInnerTopicRelation) o;
        return Objects.equals(this.id, topicSearchResultItemRelatedInnerTopicRelation.id)
                && Objects.equals(this.name, topicSearchResultItemRelatedInnerTopicRelation.name)
                && Objects.equals(this.topicId, topicSearchResultItemRelatedInnerTopicRelation.topicId)
                && Objects.equals(this.relationType, topicSearchResultItemRelatedInnerTopicRelation.relationType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, topicId, relationType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopicSearchResultItemRelatedInnerTopicRelation {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
        sb.append("    relationType: ").append(toIndentedString(relationType)).append("\n");
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
