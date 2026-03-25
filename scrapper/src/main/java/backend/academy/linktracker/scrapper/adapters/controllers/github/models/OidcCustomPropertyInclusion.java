package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * An OIDC custom property inclusion for repository properties
 */
@Schema(
        name = "oidc-custom-property-inclusion",
        description = "An OIDC custom property inclusion for repository properties")
@JsonTypeName("oidc-custom-property-inclusion")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OidcCustomPropertyInclusion {

    private String customPropertyName;

    /**
     * Whether the inclusion was defined at the organization or enterprise level
     */
    public enum InclusionSourceEnum {
        ORGANIZATION("organization"),

        ENTERPRISE("enterprise");

        private final String value;

        InclusionSourceEnum(String value) {
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
        public static InclusionSourceEnum fromValue(String value) {
            for (InclusionSourceEnum b : InclusionSourceEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private InclusionSourceEnum inclusionSource;

    public OidcCustomPropertyInclusion() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OidcCustomPropertyInclusion(String customPropertyName, InclusionSourceEnum inclusionSource) {
        this.customPropertyName = customPropertyName;
        this.inclusionSource = inclusionSource;
    }

    public OidcCustomPropertyInclusion customPropertyName(String customPropertyName) {
        this.customPropertyName = customPropertyName;
        return this;
    }

    /**
     * The name of the custom property that is included in the OIDC token
     * @return customPropertyName
     */
    @NotNull
    @Schema(
            name = "custom_property_name",
            description = "The name of the custom property that is included in the OIDC token",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("custom_property_name")
    public String getCustomPropertyName() {
        return customPropertyName;
    }

    public void setCustomPropertyName(String customPropertyName) {
        this.customPropertyName = customPropertyName;
    }

    public OidcCustomPropertyInclusion inclusionSource(InclusionSourceEnum inclusionSource) {
        this.inclusionSource = inclusionSource;
        return this;
    }

    /**
     * Whether the inclusion was defined at the organization or enterprise level
     * @return inclusionSource
     */
    @NotNull
    @Schema(
            name = "inclusion_source",
            example = "organization",
            description = "Whether the inclusion was defined at the organization or enterprise level",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("inclusion_source")
    public InclusionSourceEnum getInclusionSource() {
        return inclusionSource;
    }

    public void setInclusionSource(InclusionSourceEnum inclusionSource) {
        this.inclusionSource = inclusionSource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OidcCustomPropertyInclusion oidcCustomPropertyInclusion = (OidcCustomPropertyInclusion) o;
        return Objects.equals(this.customPropertyName, oidcCustomPropertyInclusion.customPropertyName)
                && Objects.equals(this.inclusionSource, oidcCustomPropertyInclusion.inclusionSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customPropertyName, inclusionSource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OidcCustomPropertyInclusion {\n");
        sb.append("    customPropertyName: ")
                .append(toIndentedString(customPropertyName))
                .append("\n");
        sb.append("    inclusionSource: ")
                .append(toIndentedString(inclusionSource))
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
