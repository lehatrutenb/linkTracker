package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Input for creating an OIDC custom property inclusion
 */
@Schema(
        name = "oidc-custom-property-inclusion-input",
        description = "Input for creating an OIDC custom property inclusion")
@JsonTypeName("oidc-custom-property-inclusion-input")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OidcCustomPropertyInclusionInput {

    private String customPropertyName;

    public OidcCustomPropertyInclusionInput() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OidcCustomPropertyInclusionInput(String customPropertyName) {
        this.customPropertyName = customPropertyName;
    }

    public OidcCustomPropertyInclusionInput customPropertyName(String customPropertyName) {
        this.customPropertyName = customPropertyName;
        return this;
    }

    /**
     * The name of the custom property to include in the OIDC token
     * @return customPropertyName
     */
    @NotNull
    @Schema(
            name = "custom_property_name",
            description = "The name of the custom property to include in the OIDC token",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("custom_property_name")
    public String getCustomPropertyName() {
        return customPropertyName;
    }

    public void setCustomPropertyName(String customPropertyName) {
        this.customPropertyName = customPropertyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OidcCustomPropertyInclusionInput oidcCustomPropertyInclusionInput = (OidcCustomPropertyInclusionInput) o;
        return Objects.equals(this.customPropertyName, oidcCustomPropertyInclusionInput.customPropertyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customPropertyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OidcCustomPropertyInclusionInput {\n");
        sb.append("    customPropertyName: ")
                .append(toIndentedString(customPropertyName))
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
