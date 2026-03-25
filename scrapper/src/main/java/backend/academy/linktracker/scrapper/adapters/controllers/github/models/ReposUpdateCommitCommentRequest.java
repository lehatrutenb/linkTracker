package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ReposUpdateCommitCommentRequest
 */
@JsonTypeName("repos_update_commit_comment_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposUpdateCommitCommentRequest {

    private String body;

    public ReposUpdateCommitCommentRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposUpdateCommitCommentRequest(String body) {
        this.body = body;
    }

    public ReposUpdateCommitCommentRequest body(String body) {
        this.body = body;
        return this;
    }

    /**
     * The contents of the comment
     * @return body
     */
    @NotNull
    @Schema(name = "body", description = "The contents of the comment", requiredMode = Schema.RequiredMode.REQUIRED)
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
        ReposUpdateCommitCommentRequest reposUpdateCommitCommentRequest = (ReposUpdateCommitCommentRequest) o;
        return Objects.equals(this.body, reposUpdateCommitCommentRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposUpdateCommitCommentRequest {\n");
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
