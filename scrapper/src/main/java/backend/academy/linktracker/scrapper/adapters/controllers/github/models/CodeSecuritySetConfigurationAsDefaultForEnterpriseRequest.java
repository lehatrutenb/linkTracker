package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * CodeSecuritySetConfigurationAsDefaultForEnterpriseRequest
 */
@JsonTypeName("code_security_set_configuration_as_default_for_enterprise_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeSecuritySetConfigurationAsDefaultForEnterpriseRequest {

    /**
     * Specify which types of repository this security configuration should be applied to by default.
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

    private Optional<DefaultForNewReposEnum> defaultForNewRepos = Optional.empty();

    public CodeSecuritySetConfigurationAsDefaultForEnterpriseRequest defaultForNewRepos(
            DefaultForNewReposEnum defaultForNewRepos) {
        this.defaultForNewRepos = Optional.ofNullable(defaultForNewRepos);
        return this;
    }

    /**
     * Specify which types of repository this security configuration should be applied to by default.
     * @return defaultForNewRepos
     */
    @Schema(
            name = "default_for_new_repos",
            description =
                    "Specify which types of repository this security configuration should be applied to by default.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("default_for_new_repos")
    public Optional<DefaultForNewReposEnum> getDefaultForNewRepos() {
        return defaultForNewRepos;
    }

    public void setDefaultForNewRepos(Optional<DefaultForNewReposEnum> defaultForNewRepos) {
        this.defaultForNewRepos = defaultForNewRepos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeSecuritySetConfigurationAsDefaultForEnterpriseRequest
                codeSecuritySetConfigurationAsDefaultForEnterpriseRequest =
                        (CodeSecuritySetConfigurationAsDefaultForEnterpriseRequest) o;
        return Objects.equals(
                this.defaultForNewRepos, codeSecuritySetConfigurationAsDefaultForEnterpriseRequest.defaultForNewRepos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultForNewRepos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeSecuritySetConfigurationAsDefaultForEnterpriseRequest {\n");
        sb.append("    defaultForNewRepos: ")
                .append(toIndentedString(defaultForNewRepos))
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
