package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Scim Error
 */
@Schema(name = "scim-error", description = "Scim Error")
@JsonTypeName("scim-error")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ScimError {

    private String message = null;

    private String documentationUrl = null;

    private String detail = null;

    private Long status;

    private String scimType = null;

    @Valid
    private List<String> schemas = new ArrayList<>();

    public ScimError message(String message) {
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

    public ScimError documentationUrl(String documentationUrl) {
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

    public ScimError detail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * Get detail
     * @return detail
     */
    @Schema(name = "detail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("detail")
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public ScimError status(Long status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("status")
    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public ScimError scimType(String scimType) {
        this.scimType = scimType;
        return this;
    }

    /**
     * Get scimType
     * @return scimType
     */
    @Schema(name = "scimType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("scimType")
    public String getScimType() {
        return scimType;
    }

    public void setScimType(String scimType) {
        this.scimType = scimType;
    }

    public ScimError schemas(List<String> schemas) {
        this.schemas = schemas;
        return this;
    }

    public ScimError addSchemasItem(String schemasItem) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        this.schemas.add(schemasItem);
        return this;
    }

    /**
     * Get schemas
     * @return schemas
     */
    @Schema(name = "schemas", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("schemas")
    public List<String> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<String> schemas) {
        this.schemas = schemas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScimError scimError = (ScimError) o;
        return Objects.equals(this.message, scimError.message)
                && Objects.equals(this.documentationUrl, scimError.documentationUrl)
                && Objects.equals(this.detail, scimError.detail)
                && Objects.equals(this.status, scimError.status)
                && Objects.equals(this.scimType, scimError.scimType)
                && Objects.equals(this.schemas, scimError.schemas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, documentationUrl, detail, status, scimType, schemas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScimError {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    documentationUrl: ")
                .append(toIndentedString(documentationUrl))
                .append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    scimType: ").append(toIndentedString(scimType)).append("\n");
        sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
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
