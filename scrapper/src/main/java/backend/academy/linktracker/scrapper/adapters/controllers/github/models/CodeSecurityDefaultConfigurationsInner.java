package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * CodeSecurityDefaultConfigurationsInner
 */
@JsonTypeName("code_security_default_configurations_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeSecurityDefaultConfigurationsInner {

    /**
     * The visibility of newly created repositories for which the code security configuration will be applied to by default
     */
    public enum DefaultForNewReposEnum {
        PUBLIC("public"),

        PRIVATE_AND_INTERNAL("private_and_internal"),

        ALL("all");

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

    private Optional<CodeSecurityConfiguration> _configuration = Optional.empty();

    public CodeSecurityDefaultConfigurationsInner defaultForNewRepos(DefaultForNewReposEnum defaultForNewRepos) {
        this.defaultForNewRepos = Optional.ofNullable(defaultForNewRepos);
        return this;
    }

    /**
     * The visibility of newly created repositories for which the code security configuration will be applied to by default
     * @return defaultForNewRepos
     */
    @Schema(
            name = "default_for_new_repos",
            description =
                    "The visibility of newly created repositories for which the code security configuration will be applied to by default",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("default_for_new_repos")
    public Optional<DefaultForNewReposEnum> getDefaultForNewRepos() {
        return defaultForNewRepos;
    }

    public void setDefaultForNewRepos(Optional<DefaultForNewReposEnum> defaultForNewRepos) {
        this.defaultForNewRepos = defaultForNewRepos;
    }

    public CodeSecurityDefaultConfigurationsInner _configuration(CodeSecurityConfiguration _configuration) {
        this._configuration = Optional.ofNullable(_configuration);
        return this;
    }

    /**
     * Get _configuration
     * @return _configuration
     */
    @Valid
    @Schema(name = "configuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("configuration")
    public Optional<CodeSecurityConfiguration> getConfiguration() {
        return _configuration;
    }

    public void setConfiguration(Optional<CodeSecurityConfiguration> _configuration) {
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
        CodeSecurityDefaultConfigurationsInner codeSecurityDefaultConfigurationsInner =
                (CodeSecurityDefaultConfigurationsInner) o;
        return Objects.equals(this.defaultForNewRepos, codeSecurityDefaultConfigurationsInner.defaultForNewRepos)
                && Objects.equals(this._configuration, codeSecurityDefaultConfigurationsInner._configuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultForNewRepos, _configuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeSecurityDefaultConfigurationsInner {\n");
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
