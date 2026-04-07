package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.Objects;

/**
 * GistsCreateCommentRequest
 */
@JsonTypeName("gists_create_comment_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GistsCreateCommentRequest {

    private String body;

    public GistsCreateCommentRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GistsCreateCommentRequest(String body) {
        this.body = body;
    }

    public GistsCreateCommentRequest body(String body) {
        this.body = body;
        return this;
    }

    /**
     * The comment text.
     * @return body
     */
    @NotNull
    @Size(max = 65535)
    @Schema(
            name = "body",
            example = "Body of the attachment",
            description = "The comment text.",
            requiredMode = Schema.RequiredMode.REQUIRED)
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
        GistsCreateCommentRequest gistsCreateCommentRequest = (GistsCreateCommentRequest) o;
        return Objects.equals(this.body, gistsCreateCommentRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GistsCreateCommentRequest {\n");
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
