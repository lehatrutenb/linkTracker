package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * ReactionsCreateForCommitCommentRequest
 */
@JsonTypeName("reactions_create_for_commit_comment_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReactionsCreateForCommitCommentRequest {

    /**
     * The [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions) to add to the commit comment.
     */
    public enum ContentEnum {
        _1("+1"),

        _12("-1"),

        LAUGH("laugh"),

        CONFUSED("confused"),

        HEART("heart"),

        HOORAY("hooray"),

        ROCKET("rocket"),

        EYES("eyes");

        private final String value;

        ContentEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ContentEnum fromValue(String value) {
            for (ContentEnum b : ContentEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ContentEnum content;

    public ReactionsCreateForCommitCommentRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReactionsCreateForCommitCommentRequest(ContentEnum content) {
        this.content = content;
    }

    public ReactionsCreateForCommitCommentRequest content(ContentEnum content) {
        this.content = content;
        return this;
    }

    /**
     * The [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions) to add to the commit comment.
     * @return content
     */
    @NotNull
    @Schema(
            name = "content",
            description =
                    "The [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions) to add to the commit comment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("content")
    public ContentEnum getContent() {
        return content;
    }

    public void setContent(ContentEnum content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReactionsCreateForCommitCommentRequest reactionsCreateForCommitCommentRequest =
                (ReactionsCreateForCommitCommentRequest) o;
        return Objects.equals(this.content, reactionsCreateForCommitCommentRequest.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReactionsCreateForCommitCommentRequest {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
