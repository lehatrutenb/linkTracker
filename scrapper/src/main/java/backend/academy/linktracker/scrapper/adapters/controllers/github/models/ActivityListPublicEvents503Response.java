package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * ActivityListPublicEvents503Response
 */
@JsonTypeName("activity_list_public_events_503_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActivityListPublicEvents503Response {

    private Optional<String> code = Optional.empty();

    private Optional<String> message = Optional.empty();

    private Optional<String> documentationUrl = Optional.empty();

    public ActivityListPublicEvents503Response code(String code) {
        this.code = Optional.ofNullable(code);
        return this;
    }

    /**
     * Get code
     * @return code
     */
    @Schema(name = "code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("code")
    public Optional<String> getCode() {
        return code;
    }

    public void setCode(Optional<String> code) {
        this.code = code;
    }

    public ActivityListPublicEvents503Response message(String message) {
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

    public ActivityListPublicEvents503Response documentationUrl(String documentationUrl) {
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
        ActivityListPublicEvents503Response activityListPublicEvents503Response =
                (ActivityListPublicEvents503Response) o;
        return Objects.equals(this.code, activityListPublicEvents503Response.code)
                && Objects.equals(this.message, activityListPublicEvents503Response.message)
                && Objects.equals(this.documentationUrl, activityListPublicEvents503Response.documentationUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, documentationUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActivityListPublicEvents503Response {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
