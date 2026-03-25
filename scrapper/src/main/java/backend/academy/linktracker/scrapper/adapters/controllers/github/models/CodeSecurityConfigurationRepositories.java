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
 * Repositories associated with a code security configuration and attachment status
 */
@Schema(
        name = "code-security-configuration-repositories",
        description = "Repositories associated with a code security configuration and attachment status")
@JsonTypeName("code-security-configuration-repositories")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeSecurityConfigurationRepositories {

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

    private SimpleRepository repository;

    public CodeSecurityConfigurationRepositories status(StatusEnum status) {
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

    public CodeSecurityConfigurationRepositories repository(SimpleRepository repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public SimpleRepository getRepository() {
        return repository;
    }

    public void setRepository(SimpleRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeSecurityConfigurationRepositories codeSecurityConfigurationRepositories =
                (CodeSecurityConfigurationRepositories) o;
        return Objects.equals(this.status, codeSecurityConfigurationRepositories.status)
                && Objects.equals(this.repository, codeSecurityConfigurationRepositories.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, repository);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeSecurityConfigurationRepositories {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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
