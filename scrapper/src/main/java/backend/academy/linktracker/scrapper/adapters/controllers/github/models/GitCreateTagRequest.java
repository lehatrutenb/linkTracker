package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * GitCreateTagRequest
 */
@JsonTypeName("git_create_tag_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GitCreateTagRequest {

    private String tag;

    private String message;

    private String _object;

    /**
     * The type of the object we're tagging. Normally this is a `commit` but it can also be a `tree` or a `blob`.
     */
    public enum TypeEnum {
        COMMIT("commit"),

        TREE("tree"),

        BLOB("blob");

        private final String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private TypeEnum type;

    private Optional<GitCreateTagRequestTagger> tagger = Optional.empty();

    public GitCreateTagRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GitCreateTagRequest(String tag, String message, String _object, TypeEnum type) {
        this.tag = tag;
        this.message = message;
        this._object = _object;
        this.type = type;
    }

    public GitCreateTagRequest tag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * The tag's name. This is typically a version (e.g., \"v0.0.1\").
     * @return tag
     */
    @NotNull
    @Schema(
            name = "tag",
            description = "The tag's name. This is typically a version (e.g., \"v0.0.1\").",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("tag")
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public GitCreateTagRequest message(String message) {
        this.message = message;
        return this;
    }

    /**
     * The tag message.
     * @return message
     */
    @NotNull
    @Schema(name = "message", description = "The tag message.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public GitCreateTagRequest _object(String _object) {
        this._object = _object;
        return this;
    }

    /**
     * The SHA of the git object this is tagging.
     * @return _object
     */
    @NotNull
    @Schema(
            name = "object",
            description = "The SHA of the git object this is tagging.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("object")
    public String getObject() {
        return _object;
    }

    public void setObject(String _object) {
        this._object = _object;
    }

    public GitCreateTagRequest type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of the object we're tagging. Normally this is a `commit` but it can also be a `tree` or a `blob`.
     * @return type
     */
    @NotNull
    @Schema(
            name = "type",
            description =
                    "The type of the object we're tagging. Normally this is a `commit` but it can also be a `tree` or a `blob`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public GitCreateTagRequest tagger(GitCreateTagRequestTagger tagger) {
        this.tagger = Optional.ofNullable(tagger);
        return this;
    }

    /**
     * Get tagger
     * @return tagger
     */
    @Valid
    @Schema(name = "tagger", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tagger")
    public Optional<GitCreateTagRequestTagger> getTagger() {
        return tagger;
    }

    public void setTagger(Optional<GitCreateTagRequestTagger> tagger) {
        this.tagger = tagger;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GitCreateTagRequest gitCreateTagRequest = (GitCreateTagRequest) o;
        return Objects.equals(this.tag, gitCreateTagRequest.tag)
                && Objects.equals(this.message, gitCreateTagRequest.message)
                && Objects.equals(this._object, gitCreateTagRequest._object)
                && Objects.equals(this.type, gitCreateTagRequest.type)
                && Objects.equals(this.tagger, gitCreateTagRequest.tagger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag, message, _object, type, tagger);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitCreateTagRequest {\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    tagger: ").append(toIndentedString(tagger)).append("\n");
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
