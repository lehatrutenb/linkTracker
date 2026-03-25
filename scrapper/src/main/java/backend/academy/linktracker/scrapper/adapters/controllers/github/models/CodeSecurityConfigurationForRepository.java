package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Code security configuration associated with a repository and attachment status
 */
@Schema(
        name = "code-security-configuration-for-repository",
        description = "Code security configuration associated with a repository and attachment status")
@JsonTypeName("code-security-configuration-for-repository")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeSecurityConfigurationForRepository {

    /**
     * The attachment status of the code security configuration on the repository.
     */
    public enum StatusEnum {
        ATTACHED("attached"),

        ATTACHING("attaching"),

        DETACHED("detached"),

        REMOVED("removed"),

        ENFORCED("enforced"),

        FAILED("failed"),

        UPDATING("updating"),

        REMOVED_BY_ENTERPRISE("removed_by_enterprise");

        private final String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private StatusEnum status;

    private CodeSecurityConfiguration _configuration;

    public CodeSecurityConfigurationForRepository status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The attachment status of the code security configuration on the repository.
     * @return status
     */
    @Schema(
            name = "status",
            description = "The attachment status of the code security configuration on the repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public CodeSecurityConfigurationForRepository _configuration(CodeSecurityConfiguration _configuration) {
        this._configuration = _configuration;
        return this;
    }

    /**
     * Get _configuration
     * @return _configuration
     */
    @Valid
    @Schema(name = "configuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("configuration")
    public CodeSecurityConfiguration getConfiguration() {
        return _configuration;
    }

    public void setConfiguration(CodeSecurityConfiguration _configuration) {
        this._configuration = _configuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeSecurityConfigurationForRepository codeSecurityConfigurationForRepository =
                (CodeSecurityConfigurationForRepository) o;
        return Objects.equals(this.status, codeSecurityConfigurationForRepository.status)
                && Objects.equals(this._configuration, codeSecurityConfigurationForRepository._configuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, _configuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeSecurityConfigurationForRepository {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    _configuration: ")
                .append(toIndentedString(_configuration))
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
