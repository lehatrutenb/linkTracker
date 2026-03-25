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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CodeSecurityAttachConfigurationRequest
 */
@JsonTypeName("code_security_attach_configuration_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeSecurityAttachConfigurationRequest {

    /**
     * The type of repositories to attach the configuration to. `selected` means the configuration will be attached to only the repositories specified by `selected_repository_ids`
     */
    public enum ScopeEnum {
        ALL("all"),

        ALL_WITHOUT_CONFIGURATIONS("all_without_configurations"),

        PUBLIC("public"),

        PRIVATE_OR_INTERNAL("private_or_internal"),

        SELECTED("selected");

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

    @Valid
    private List<Long> selectedRepositoryIds = new ArrayList<>();

    public CodeSecurityAttachConfigurationRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodeSecurityAttachConfigurationRequest(ScopeEnum scope) {
        this.scope = scope;
    }

    public CodeSecurityAttachConfigurationRequest scope(ScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /**
     * The type of repositories to attach the configuration to. `selected` means the configuration will be attached to only the repositories specified by `selected_repository_ids`
     * @return scope
     */
    @NotNull
    @Schema(
            name = "scope",
            description =
                    "The type of repositories to attach the configuration to. `selected` means the configuration will be attached to only the repositories specified by `selected_repository_ids`",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("scope")
    public ScopeEnum getScope() {
        return scope;
    }

    public void setScope(ScopeEnum scope) {
        this.scope = scope;
    }

    public CodeSecurityAttachConfigurationRequest selectedRepositoryIds(List<Long> selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
        return this;
    }

    public CodeSecurityAttachConfigurationRequest addSelectedRepositoryIdsItem(Long selectedRepositoryIdsItem) {
        if (this.selectedRepositoryIds == null) {
            this.selectedRepositoryIds = new ArrayList<>();
        }
        this.selectedRepositoryIds.add(selectedRepositoryIdsItem);
        return this;
    }

    /**
     * An array of repository IDs to attach the configuration to. You can only provide a list of repository ids when the `scope` is set to `selected`.
     * @return selectedRepositoryIds
     */
    @Schema(
            name = "selected_repository_ids",
            description =
                    "An array of repository IDs to attach the configuration to. You can only provide a list of repository ids when the `scope` is set to `selected`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("selected_repository_ids")
    public List<Long> getSelectedRepositoryIds() {
        return selectedRepositoryIds;
    }

    public void setSelectedRepositoryIds(List<Long> selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeSecurityAttachConfigurationRequest codeSecurityAttachConfigurationRequest =
                (CodeSecurityAttachConfigurationRequest) o;
        return Objects.equals(this.scope, codeSecurityAttachConfigurationRequest.scope)
                && Objects.equals(
                        this.selectedRepositoryIds, codeSecurityAttachConfigurationRequest.selectedRepositoryIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scope, selectedRepositoryIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeSecurityAttachConfigurationRequest {\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    selectedRepositoryIds: ")
                .append(toIndentedString(selectedRepositoryIds))
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
