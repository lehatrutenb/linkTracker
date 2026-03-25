package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Basic Error
 */
@Schema(name = "basic-error", description = "Basic Error")
@JsonTypeName("basic-error")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class BasicError implements ReposCreateOrUpdateFileContents409Response {

    private String message;

    private String documentationUrl;

    private String url;

    private String status;

    public BasicError message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     * @return message
     */
    @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BasicError documentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
        return this;
    }

    /**
     * Get documentationUrl
     * @return documentationUrl
     */
    @Schema(name = "documentation_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("documentation_url")
    public String getDocumentationUrl() {
        return documentationUrl;
    }

    public void setDocumentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
    }

    public BasicError url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public BasicError status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BasicError basicError = (BasicError) o;
        return Objects.equals(this.message, basicError.message)
                && Objects.equals(this.documentationUrl, basicError.documentationUrl)
                && Objects.equals(this.url, basicError.url)
                && Objects.equals(this.status, basicError.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, documentationUrl, url, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BasicError {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    documentationUrl: ")
                .append(toIndentedString(documentationUrl))
                .append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
