package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * OrgsRemoveOutsideCollaborator422Response
 */
@JsonTypeName("orgs_remove_outside_collaborator_422_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsRemoveOutsideCollaborator422Response {

    private Optional<String> message = Optional.empty();

    private Optional<String> documentationUrl = Optional.empty();

    public OrgsRemoveOutsideCollaborator422Response message(String message) {
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

    public OrgsRemoveOutsideCollaborator422Response documentationUrl(String documentationUrl) {
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
        OrgsRemoveOutsideCollaborator422Response orgsRemoveOutsideCollaborator422Response =
                (OrgsRemoveOutsideCollaborator422Response) o;
        return Objects.equals(this.message, orgsRemoveOutsideCollaborator422Response.message)
                && Objects.equals(this.documentationUrl, orgsRemoveOutsideCollaborator422Response.documentationUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, documentationUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsRemoveOutsideCollaborator422Response {\n");
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
