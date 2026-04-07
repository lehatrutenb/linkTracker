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
 * Actions OIDC Subject customization
 */
@Schema(name = "oidc-custom-sub", description = "Actions OIDC Subject customization")
@JsonTypeName("oidc-custom-sub")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OidcCustomSub {

    @Valid
    private List<String> includeClaimKeys = new ArrayList<>();

    public OidcCustomSub() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OidcCustomSub(List<String> includeClaimKeys) {
        this.includeClaimKeys = includeClaimKeys;
    }

    public OidcCustomSub includeClaimKeys(List<String> includeClaimKeys) {
        this.includeClaimKeys = includeClaimKeys;
        return this;
    }

    public OidcCustomSub addIncludeClaimKeysItem(String includeClaimKeysItem) {
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
    @NotNull
    @Schema(
            name = "include_claim_keys",
            description =
                    "Array of unique strings. Each claim key can only contain alphanumeric characters and underscores.",
            requiredMode = Schema.RequiredMode.REQUIRED)
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
        OidcCustomSub oidcCustomSub = (OidcCustomSub) o;
        return Objects.equals(this.includeClaimKeys, oidcCustomSub.includeClaimKeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(includeClaimKeys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OidcCustomSub {\n");
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
