package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * MarkdownRenderRequest
 */
@JsonTypeName("markdown_render_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MarkdownRenderRequest {

    private String text;

    /**
     * The rendering mode.
     */
    public enum ModeEnum {
        MARKDOWN("markdown"),

        GFM("gfm");

        private final String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            for (ModeEnum b : ModeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ModeEnum mode = ModeEnum.MARKDOWN;

    private String context;

    public MarkdownRenderRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public MarkdownRenderRequest(String text) {
        this.text = text;
    }

    public MarkdownRenderRequest text(String text) {
        this.text = text;
        return this;
    }

    /**
     * The Markdown text to render in HTML.
     * @return text
     */
    @NotNull
    @Schema(
            name = "text",
            description = "The Markdown text to render in HTML.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public MarkdownRenderRequest mode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * The rendering mode.
     * @return mode
     */
    @Schema(
            name = "mode",
            example = "markdown",
            description = "The rendering mode.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("mode")
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public MarkdownRenderRequest context(String context) {
        this.context = context;
        return this;
    }

    /**
     * The repository context to use when creating references in `gfm` mode.  For example, setting `context` to `octo-org/octo-repo` will change the text `#42` into an HTML link to issue 42 in the `octo-org/octo-repo` repository.
     * @return context
     */
    @Schema(
            name = "context",
            description =
                    "The repository context to use when creating references in `gfm` mode.  For example, setting `context` to `octo-org/octo-repo` will change the text `#42` into an HTML link to issue 42 in the `octo-org/octo-repo` repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("context")
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MarkdownRenderRequest markdownRenderRequest = (MarkdownRenderRequest) o;
        return Objects.equals(this.text, markdownRenderRequest.text)
                && Objects.equals(this.mode, markdownRenderRequest.mode)
                && Objects.equals(this.context, markdownRenderRequest.context);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, mode, context);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarkdownRenderRequest {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
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
