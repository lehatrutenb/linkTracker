package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;

/**
 * An advisory identifier.
 */
@Schema(name = "dependabot_alert_security_advisory_identifiers_inner", description = "An advisory identifier.")
@JsonTypeName("dependabot_alert_security_advisory_identifiers_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DependabotAlertSecurityAdvisoryIdentifiersInner {

    /**
     * The type of advisory identifier.
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

    public DependabotAlertSecurityAdvisoryIdentifiersInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DependabotAlertSecurityAdvisoryIdentifiersInner(TypeEnum type, String value) {
        this.type = type;
        this.value = value;
    }

    public DependabotAlertSecurityAdvisoryIdentifiersInner type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of advisory identifier.
     * @return type
     */
    @Schema(
            name = "type",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The type of advisory identifier.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public DependabotAlertSecurityAdvisoryIdentifiersInner value(String value) {
        this.value = value;
        return this;
    }

    /**
     * The value of the advisory identifer.
     * @return value
     */
    @Schema(
            name = "value",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The value of the advisory identifer.",
            requiredMode = Schema.RequiredMode.REQUIRED)
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
        DependabotAlertSecurityAdvisoryIdentifiersInner dependabotAlertSecurityAdvisoryIdentifiersInner =
                (DependabotAlertSecurityAdvisoryIdentifiersInner) o;
        return Objects.equals(this.type, dependabotAlertSecurityAdvisoryIdentifiersInner.type)
                && Objects.equals(this.value, dependabotAlertSecurityAdvisoryIdentifiersInner.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependabotAlertSecurityAdvisoryIdentifiersInner {\n");
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
