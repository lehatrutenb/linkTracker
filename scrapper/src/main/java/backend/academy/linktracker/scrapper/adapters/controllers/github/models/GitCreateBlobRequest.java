package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * GitCreateBlobRequest
 */
@JsonTypeName("git_create_blob_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GitCreateBlobRequest {

    private String content;

    private Optional<String> encoding = Optional.of("utf-8");

    public GitCreateBlobRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GitCreateBlobRequest(String content) {
        this.content = content;
    }

    public GitCreateBlobRequest content(String content) {
        this.content = content;
        return this;
    }

    /**
     * The new blob's content.
     * @return content
     */
    @NotNull
    @Schema(name = "content", description = "The new blob's content.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public GitCreateBlobRequest encoding(String encoding) {
        this.encoding = Optional.ofNullable(encoding);
        return this;
    }

    /**
     * The encoding used for `content`. Currently, `\"utf-8\"` and `\"base64\"` are supported.
     * @return encoding
     */
    @Schema(
            name = "encoding",
            description = "The encoding used for `content`. Currently, `\"utf-8\"` and `\"base64\"` are supported.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("encoding")
    public Optional<String> getEncoding() {
        return encoding;
    }

    public void setEncoding(Optional<String> encoding) {
        this.encoding = encoding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GitCreateBlobRequest gitCreateBlobRequest = (GitCreateBlobRequest) o;
        return Objects.equals(this.content, gitCreateBlobRequest.content)
                && Objects.equals(this.encoding, gitCreateBlobRequest.encoding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, encoding);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitCreateBlobRequest {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
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
