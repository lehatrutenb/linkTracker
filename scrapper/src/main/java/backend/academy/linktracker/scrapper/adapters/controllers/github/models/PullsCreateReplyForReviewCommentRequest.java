package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * PullsCreateReplyForReviewCommentRequest
 */
@JsonTypeName("pulls_create_reply_for_review_comment_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullsCreateReplyForReviewCommentRequest {

    private String body;

    public PullsCreateReplyForReviewCommentRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullsCreateReplyForReviewCommentRequest(String body) {
        this.body = body;
    }

    public PullsCreateReplyForReviewCommentRequest body(String body) {
        this.body = body;
        return this;
    }

    /**
     * The text of the review comment.
     * @return body
     */
    @NotNull
    @Schema(name = "body", description = "The text of the review comment.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PullsCreateReplyForReviewCommentRequest pullsCreateReplyForReviewCommentRequest =
                (PullsCreateReplyForReviewCommentRequest) o;
        return Objects.equals(this.body, pullsCreateReplyForReviewCommentRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullsCreateReplyForReviewCommentRequest {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
