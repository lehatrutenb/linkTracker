package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Actions OIDC subject customization for a repository
 */
@Schema(name = "oidc-custom-sub-repo", description = "Actions OIDC subject customization for a repository")
@JsonTypeName("oidc-custom-sub-repo")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OidcCustomSubRepo {

    private Boolean useDefault;

    @Valid
    private List<String> includeClaimKeys = new ArrayList<>();

    public OidcCustomSubRepo() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OidcCustomSubRepo(Boolean useDefault) {
        this.useDefault = useDefault;
    }

    public OidcCustomSubRepo useDefault(Boolean useDefault) {
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

    public OidcCustomSubRepo includeClaimKeys(List<String> includeClaimKeys) {
        this.includeClaimKeys = includeClaimKeys;
        return this;
    }

    public OidcCustomSubRepo addIncludeClaimKeysItem(String includeClaimKeysItem) {
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
        OidcCustomSubRepo oidcCustomSubRepo = (OidcCustomSubRepo) o;
        return Objects.equals(this.useDefault, oidcCustomSubRepo.useDefault)
                && Objects.equals(this.includeClaimKeys, oidcCustomSubRepo.includeClaimKeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(useDefault, includeClaimKeys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OidcCustomSubRepo {\n");
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
