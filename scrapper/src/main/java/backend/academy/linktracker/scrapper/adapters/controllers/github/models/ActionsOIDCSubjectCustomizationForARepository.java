package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Actions OIDC subject customization for a repository
 */
@Schema(
        name = "Actions_OIDC_subject_customization_for_a_repository",
        description = "Actions OIDC subject customization for a repository")
@JsonTypeName("Actions_OIDC_subject_customization_for_a_repository")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsOIDCSubjectCustomizationForARepository {

    private Boolean useDefault;

    @Valid
    private List<String> includeClaimKeys = new ArrayList<>();

    public ActionsOIDCSubjectCustomizationForARepository() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsOIDCSubjectCustomizationForARepository(Boolean useDefault) {
        this.useDefault = useDefault;
    }

    public ActionsOIDCSubjectCustomizationForARepository useDefault(Boolean useDefault) {
        this.useDefault = useDefault;
        return this;
    }

    /**
     * Whether to use the default template or not. If `true`, the `include_claim_keys` field is ignored.
     * @return useDefault
     */
    @NotNull
    @Schema(
            name = "use_default",
            description =
                    "Whether to use the default template or not. If `true`, the `include_claim_keys` field is ignored.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("use_default")
    public Boolean getUseDefault() {
        return useDefault;
    }

    public void setUseDefault(Boolean useDefault) {
        this.useDefault = useDefault;
    }

    public ActionsOIDCSubjectCustomizationForARepository includeClaimKeys(List<String> includeClaimKeys) {
        this.includeClaimKeys = includeClaimKeys;
        return this;
    }

    public ActionsOIDCSubjectCustomizationForARepository addIncludeClaimKeysItem(String includeClaimKeysItem) {
        if (this.includeClaimKeys == null) {
            this.includeClaimKeys = new ArrayList<>();
        }
        this.includeClaimKeys.add(includeClaimKeysItem);
        return this;
    }

    /**
     * Array of unique strings. Each claim key can only contain alphanumeric characters and underscores.
     * @return includeClaimKeys
     */
    @Schema(
            name = "include_claim_keys",
            description =
                    "Array of unique strings. Each claim key can only contain alphanumeric characters and underscores.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("include_claim_keys")
    public List<String> getIncludeClaimKeys() {
        return includeClaimKeys;
    }

    public void setIncludeClaimKeys(List<String> includeClaimKeys) {
        this.includeClaimKeys = includeClaimKeys;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsOIDCSubjectCustomizationForARepository actionsOIDCSubjectCustomizationForARepository =
                (ActionsOIDCSubjectCustomizationForARepository) o;
        return Objects.equals(this.useDefault, actionsOIDCSubjectCustomizationForARepository.useDefault)
                && Objects.equals(
                        this.includeClaimKeys, actionsOIDCSubjectCustomizationForARepository.includeClaimKeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(useDefault, includeClaimKeys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsOIDCSubjectCustomizationForARepository {\n");
        sb.append("    useDefault: ").append(toIndentedString(useDefault)).append("\n");
        sb.append("    includeClaimKeys: ")
                .append(toIndentedString(includeClaimKeys))
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
