package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * GitCreateTreeRequestTreeInner
 */
@JsonTypeName("git_create_tree_request_tree_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GitCreateTreeRequestTreeInner {

    private Optional<String> path = Optional.empty();

    /**
     * The file mode; one of `100644` for file (blob), `100755` for executable (blob), `040000` for subdirectory (tree), `160000` for submodule (commit), or `120000` for a blob that specifies the path of a symlink.
     */
    public enum ModeEnum {
        _100644("100644"),

        _100755("100755"),

        _040000("040000"),

        _160000("160000"),

        _120000("120000");

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

    private Optional<ModeEnum> mode = Optional.empty();

    /**
     * Either `blob`, `tree`, or `commit`.
     */
    public enum TypeEnum {
        BLOB("blob"),

        TREE("tree"),

        COMMIT("commit");

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

    private Optional<TypeEnum> type = Optional.empty();

    private JsonNullable<String> sha = JsonNullable.<String>undefined();

    private Optional<String> content = Optional.empty();

    public GitCreateTreeRequestTreeInner path(String path) {
        this.path = Optional.ofNullable(path);
        return this;
    }

    /**
     * The file referenced in the tree.
     * @return path
     */
    @Schema(
            name = "path",
            description = "The file referenced in the tree.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("path")
    public Optional<String> getPath() {
        return path;
    }

    public void setPath(Optional<String> path) {
        this.path = path;
    }

    public GitCreateTreeRequestTreeInner mode(ModeEnum mode) {
        this.mode = Optional.ofNullable(mode);
        return this;
    }

    /**
     * The file mode; one of `100644` for file (blob), `100755` for executable (blob), `040000` for subdirectory (tree), `160000` for submodule (commit), or `120000` for a blob that specifies the path of a symlink.
     * @return mode
     */
    @Schema(
            name = "mode",
            description =
                    "The file mode; one of `100644` for file (blob), `100755` for executable (blob), `040000` for subdirectory (tree), `160000` for submodule (commit), or `120000` for a blob that specifies the path of a symlink.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("mode")
    public Optional<ModeEnum> getMode() {
        return mode;
    }

    public void setMode(Optional<ModeEnum> mode) {
        this.mode = mode;
    }

    public GitCreateTreeRequestTreeInner type(TypeEnum type) {
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * Either `blob`, `tree`, or `commit`.
     * @return type
     */
    @Schema(
            name = "type",
            description = "Either `blob`, `tree`, or `commit`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public Optional<TypeEnum> getType() {
        return type;
    }

    public void setType(Optional<TypeEnum> type) {
        this.type = type;
    }

    public GitCreateTreeRequestTreeInner sha(String sha) {
        this.sha = JsonNullable.of(sha);
        return this;
    }

    /**
     * The SHA1 checksum ID of the object in the tree. Also called `tree.sha`. If the value is `null` then the file will be deleted.      **Note:** Use either `tree.sha` or `content` to specify the contents of the entry. Using both `tree.sha` and `content` will return an error.
     * @return sha
     */
    @Schema(
            name = "sha",
            description =
                    "The SHA1 checksum ID of the object in the tree. Also called `tree.sha`. If the value is `null` then the file will be deleted.      **Note:** Use either `tree.sha` or `content` to specify the contents of the entry. Using both `tree.sha` and `content` will return an error.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sha")
    public JsonNullable<String> getSha() {
        return sha;
    }

    public void setSha(JsonNullable<String> sha) {
        this.sha = sha;
    }

    public GitCreateTreeRequestTreeInner content(String content) {
        this.content = Optional.ofNullable(content);
        return this;
    }

    /**
     * The content you want this file to have. GitHub will write this blob out and use that SHA for this entry. Use either this, or `tree.sha`.      **Note:** Use either `tree.sha` or `content` to specify the contents of the entry. Using both `tree.sha` and `content` will return an error.
     * @return content
     */
    @Schema(
            name = "content",
            description =
                    "The content you want this file to have. GitHub will write this blob out and use that SHA for this entry. Use either this, or `tree.sha`.      **Note:** Use either `tree.sha` or `content` to specify the contents of the entry. Using both `tree.sha` and `content` will return an error.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("content")
    public Optional<String> getContent() {
        return content;
    }

    public void setContent(Optional<String> content) {
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
        GitCreateTreeRequestTreeInner gitCreateTreeRequestTreeInner = (GitCreateTreeRequestTreeInner) o;
        return Objects.equals(this.path, gitCreateTreeRequestTreeInner.path)
                && Objects.equals(this.mode, gitCreateTreeRequestTreeInner.mode)
                && Objects.equals(this.type, gitCreateTreeRequestTreeInner.type)
                && equalsNullable(this.sha, gitCreateTreeRequestTreeInner.sha)
                && Objects.equals(this.content, gitCreateTreeRequestTreeInner.content);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, mode, type, hashCodeNullable(sha), content);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitCreateTreeRequestTreeInner {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
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
