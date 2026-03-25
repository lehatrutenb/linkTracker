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
 * CodeSecuritySetConfigurationAsDefaultForEnterprise200Response
 */
@JsonTypeName("code_security_set_configuration_as_default_for_enterprise_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeSecuritySetConfigurationAsDefaultForEnterprise200Response {

    /**
     * Specifies which types of repository this security configuration is applied to by default.
     */
    public enum DefaultForNewReposEnum {
        ALL("all"),

        NONE("none"),

        PRIVATE_AND_INTERNAL("private_and_internal"),

        PUBLIC("public");

        private final String value;

        DefaultForNewReposEnum(String value) {
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
        public static DefaultForNewReposEnum fromValue(String value) {
            for (DefaultForNewReposEnum b : DefaultForNewReposEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private DefaultForNewReposEnum defaultForNewRepos;

    private CodeSecurityConfiguration _configuration;

    public CodeSecuritySetConfigurationAsDefaultForEnterprise200Response defaultForNewRepos(
            DefaultForNewReposEnum defaultForNewRepos) {
        this.defaultForNewRepos = defaultForNewRepos;
        return this;
    }

    /**
     * Specifies which types of repository this security configuration is applied to by default.
     * @return defaultForNewRepos
     */
    @Schema(
            name = "default_for_new_repos",
            description = "Specifies which types of repository this security configuration is applied to by default.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("default_for_new_repos")
    public DefaultForNewReposEnum getDefaultForNewRepos() {
        return defaultForNewRepos;
    }

    public void setDefaultForNewRepos(DefaultForNewReposEnum defaultForNewRepos) {
        this.defaultForNewRepos = defaultForNewRepos;
    }

    public CodeSecuritySetConfigurationAsDefaultForEnterprise200Response _configuration(
            CodeSecurityConfiguration _configuration) {
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
        CodeSecuritySetConfigurationAsDefaultForEnterprise200Response
                codeSecuritySetConfigurationAsDefaultForEnterprise200Response =
                        (CodeSecuritySetConfigurationAsDefaultForEnterprise200Response) o;
        return Objects.equals(
                        this.defaultForNewRepos,
                        codeSecuritySetConfigurationAsDefaultForEnterprise200Response.defaultForNewRepos)
                && Objects.equals(
                        this._configuration,
                        codeSecuritySetConfigurationAsDefaultForEnterprise200Response._configuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultForNewRepos, _configuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeSecuritySetConfigurationAsDefaultForEnterprise200Response {\n");
        sb.append("    defaultForNewRepos: ")
                .append(toIndentedString(defaultForNewRepos))
                .append("\n");
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
