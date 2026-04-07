package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * CodeSecurityAttachEnterpriseConfigurationRequest
 */
@JsonTypeName("code_security_attach_enterprise_configuration_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeSecurityAttachEnterpriseConfigurationRequest {

    /**
     * The type of repositories to attach the configuration to.
     */
    public enum ScopeEnum {
        ALL("all"),

        ALL_WITHOUT_CONFIGURATIONS("all_without_configurations");

        private final String value;

        ScopeEnum(String value) {
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
        public static ScopeEnum fromValue(String value) {
            for (ScopeEnum b : ScopeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ScopeEnum scope;

    public CodeSecurityAttachEnterpriseConfigurationRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodeSecurityAttachEnterpriseConfigurationRequest(ScopeEnum scope) {
        this.scope = scope;
    }

    public CodeSecurityAttachEnterpriseConfigurationRequest scope(ScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /**
     * The type of repositories to attach the configuration to.
     * @return scope
     */
    @NotNull
    @Schema(
            name = "scope",
            description = "The type of repositories to attach the configuration to.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("scope")
    public ScopeEnum getScope() {
        return scope;
    }

    public void setScope(ScopeEnum scope) {
        this.scope = scope;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeSecurityAttachEnterpriseConfigurationRequest codeSecurityAttachEnterpriseConfigurationRequest =
                (CodeSecurityAttachEnterpriseConfigurationRequest) o;
        return Objects.equals(this.scope, codeSecurityAttachEnterpriseConfigurationRequest.scope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeSecurityAttachEnterpriseConfigurationRequest {\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
