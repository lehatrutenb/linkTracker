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
 * GlobalAdvisoryIdentifiersInner
 */
@JsonTypeName("global_advisory_identifiers_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GlobalAdvisoryIdentifiersInner {

    /**
     * The type of identifier.
     */
    public enum TypeEnum {
        CVE("CVE"),

        GHSA("GHSA");

        private final String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private TypeEnum type;

    private String value;

    public GlobalAdvisoryIdentifiersInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GlobalAdvisoryIdentifiersInner(TypeEnum type, String value) {
        this.type = type;
        this.value = value;
    }

    public GlobalAdvisoryIdentifiersInner type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of identifier.
     * @return type
     */
    @NotNull
    @Schema(name = "type", description = "The type of identifier.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public GlobalAdvisoryIdentifiersInner value(String value) {
        this.value = value;
        return this;
    }

    /**
     * The identifier value.
     * @return value
     */
    @NotNull
    @Schema(name = "value", description = "The identifier value.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GlobalAdvisoryIdentifiersInner globalAdvisoryIdentifiersInner = (GlobalAdvisoryIdentifiersInner) o;
        return Objects.equals(this.type, globalAdvisoryIdentifiersInner.type)
                && Objects.equals(this.value, globalAdvisoryIdentifiersInner.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlobalAdvisoryIdentifiersInner {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
