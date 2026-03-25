package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * TopicSearchResultItemRelatedInner
 */
@JsonTypeName("topic_search_result_item_related_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class TopicSearchResultItemRelatedInner {

    private TopicSearchResultItemRelatedInnerTopicRelation topicRelation;

    public TopicSearchResultItemRelatedInner topicRelation(
            TopicSearchResultItemRelatedInnerTopicRelation topicRelation) {
        this.topicRelation = topicRelation;
        return this;
    }

    /**
     * Get topicRelation
     * @return topicRelation
     */
    @Valid
    @Schema(name = "topic_relation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("topic_relation")
    public TopicSearchResultItemRelatedInnerTopicRelation getTopicRelation() {
        return topicRelation;
    }

    public void setTopicRelation(TopicSearchResultItemRelatedInnerTopicRelation topicRelation) {
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
