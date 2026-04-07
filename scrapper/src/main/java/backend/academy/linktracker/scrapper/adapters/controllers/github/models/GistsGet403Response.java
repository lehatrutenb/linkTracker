package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * GistsGet403Response
 */
@JsonTypeName("gists_get_403_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GistsGet403Response {

    private Optional<GistsGet403ResponseBlock> block = Optional.empty();

    private Optional<String> message = Optional.empty();

    private Optional<String> documentationUrl = Optional.empty();

    public GistsGet403Response block(GistsGet403ResponseBlock block) {
        this.block = Optional.ofNullable(block);
        return this;
    }

    /**
     * Get block
     * @return block
     */
    @Valid
    @Schema(name = "block", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("block")
    public Optional<GistsGet403ResponseBlock> getBlock() {
        return block;
    }

    public void setBlock(Optional<GistsGet403ResponseBlock> block) {
        this.block = block;
    }

    public GistsGet403Response message(String message) {
        this.message = Optional.ofNullable(message);
        return this;
    }

    /**
     * Get message
     * @return message
     */
    @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("message")
    public Optional<String> getMessage() {
        return message;
    }

    public void setMessage(Optional<String> message) {
        this.message = message;
    }

    public GistsGet403Response documentationUrl(String documentationUrl) {
        this.documentationUrl = Optional.ofNullable(documentationUrl);
        return this;
    }

    /**
     * Get documentationUrl
     * @return documentationUrl
     */
    @Schema(name = "documentation_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("documentation_url")
    public Optional<String> getDocumentationUrl() {
        return documentationUrl;
    }

    public void setDocumentationUrl(Optional<String> documentationUrl) {
        this.documentationUrl = documentationUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GistsGet403Response gistsGet403Response = (GistsGet403Response) o;
        return Objects.equals(this.block, gistsGet403Response.block)
                && Objects.equals(this.message, gistsGet403Response.message)
                && Objects.equals(this.documentationUrl, gistsGet403Response.documentationUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(block, message, documentationUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GistsGet403Response {\n");
        sb.append("    block: ").append(toIndentedString(block)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    documentationUrl: ")
                .append(toIndentedString(documentationUrl))
                .append("\n");
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
