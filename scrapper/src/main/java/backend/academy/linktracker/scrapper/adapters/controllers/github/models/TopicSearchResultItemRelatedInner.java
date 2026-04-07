package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * TopicSearchResultItemRelatedInner
 */
@JsonTypeName("topic_search_result_item_related_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class TopicSearchResultItemRelatedInner {

    private Optional<TopicSearchResultItemRelatedInnerTopicRelation> topicRelation = Optional.empty();

    public TopicSearchResultItemRelatedInner topicRelation(
            TopicSearchResultItemRelatedInnerTopicRelation topicRelation) {
        this.topicRelation = Optional.ofNullable(topicRelation);
        return this;
    }

    /**
     * Get topicRelation
     * @return topicRelation
     */
    @Valid
    @Schema(name = "topic_relation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("topic_relation")
    public Optional<TopicSearchResultItemRelatedInnerTopicRelation> getTopicRelation() {
        return topicRelation;
    }

    public void setTopicRelation(Optional<TopicSearchResultItemRelatedInnerTopicRelation> topicRelation) {
        this.topicRelation = topicRelation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TopicSearchResultItemRelatedInner topicSearchResultItemRelatedInner = (TopicSearchResultItemRelatedInner) o;
        return Objects.equals(this.topicRelation, topicSearchResultItemRelatedInner.topicRelation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicRelation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopicSearchResultItemRelatedInner {\n");
        sb.append("    topicRelation: ").append(toIndentedString(topicRelation)).append("\n");
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
