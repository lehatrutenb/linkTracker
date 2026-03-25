package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * HookResponse
 */
@JsonTypeName("hook-response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class HookResponse {

    private Long code = null;

    private String status = null;

    private String message = null;

    public HookResponse() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public HookResponse(Long code, String status, String message) {
        this.code = code;
        this.status = status;
        this.message = message;
    }

    public HookResponse code(Long code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     * @return code
     */
    @NotNull
    @Schema(name = "code", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("code")
    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public HookResponse status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @NotNull
    @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HookResponse message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     * @return message
     */
    @NotNull
    @Schema(name = "message", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HookResponse hookResponse = (HookResponse) o;
        return Objects.equals(this.code, hookResponse.code)
                && Objects.equals(this.status, hookResponse.status)
                && Objects.equals(this.message, hookResponse.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, status, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HookResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
