package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Scim Error
 */
@Schema(name = "scim-error", description = "Scim Error")
@JsonTypeName("scim-error")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ScimError {

    private JsonNullable<String> message = JsonNullable.<String>undefined();

    private JsonNullable<String> documentationUrl = JsonNullable.<String>undefined();

    private JsonNullable<String> detail = JsonNullable.<String>undefined();

    private Optional<Long> status = Optional.empty();

    private JsonNullable<String> scimType = JsonNullable.<String>undefined();

    @Valid
    private List<String> schemas = new ArrayList<>();

    public ScimError message(String message) {
        this.message = JsonNullable.of(message);
        return this;
    }

    /**
     * Get message
     * @return message
     */
    @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("message")
    public JsonNullable<String> getMessage() {
        return message;
    }

    public void setMessage(JsonNullable<String> message) {
        this.message = message;
    }

    public ScimError documentationUrl(String documentationUrl) {
        this.documentationUrl = JsonNullable.of(documentationUrl);
        return this;
    }

    /**
     * Get documentationUrl
     * @return documentationUrl
     */
    @Schema(name = "documentation_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("documentation_url")
    public JsonNullable<String> getDocumentationUrl() {
        return documentationUrl;
    }

    public void setDocumentationUrl(JsonNullable<String> documentationUrl) {
        this.documentationUrl = documentationUrl;
    }

    public ScimError detail(String detail) {
        this.detail = JsonNullable.of(detail);
        return this;
    }

    /**
     * Get detail
     * @return detail
     */
    @Schema(name = "detail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("detail")
    public JsonNullable<String> getDetail() {
        return detail;
    }

    public void setDetail(JsonNullable<String> detail) {
        this.detail = detail;
    }

    public ScimError status(Long status) {
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("status")
    public Optional<Long> getStatus() {
        return status;
    }

    public void setStatus(Optional<Long> status) {
        this.status = status;
    }

    public ScimError scimType(String scimType) {
        this.scimType = JsonNullable.of(scimType);
        return this;
    }

    /**
     * Get scimType
     * @return scimType
     */
    @Schema(name = "scimType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("scimType")
    public JsonNullable<String> getScimType() {
        return scimType;
    }

    public void setScimType(JsonNullable<String> scimType) {
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
        return equalsNullable(this.message, scimError.message)
                && equalsNullable(this.documentationUrl, scimError.documentationUrl)
                && equalsNullable(this.detail, scimError.detail)
                && Objects.equals(this.status, scimError.status)
                && equalsNullable(this.scimType, scimError.scimType)
                && Objects.equals(this.schemas, scimError.schemas);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hashCodeNullable(message),
                hashCodeNullable(documentationUrl),
                hashCodeNullable(detail),
                status,
                hashCodeNullable(scimType),
                schemas);
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
