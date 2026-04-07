package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Feature options for code scanning
 */
@Schema(name = "code_security_configuration_code_scanning_options", description = "Feature options for code scanning")
@JsonTypeName("code_security_configuration_code_scanning_options")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeSecurityConfigurationCodeScanningOptions {

    private JsonNullable<Boolean> allowAdvanced = JsonNullable.<Boolean>undefined();

    public CodeSecurityConfigurationCodeScanningOptions allowAdvanced(Boolean allowAdvanced) {
        this.allowAdvanced = JsonNullable.of(allowAdvanced);
        return this;
    }

    /**
     * Whether to allow repos which use advanced setup
     * @return allowAdvanced
     */
    @Schema(
            name = "allow_advanced",
            description = "Whether to allow repos which use advanced setup",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("allow_advanced")
    public JsonNullable<Boolean> getAllowAdvanced() {
        return allowAdvanced;
    }

    public void setAllowAdvanced(JsonNullable<Boolean> allowAdvanced) {
        this.allowAdvanced = allowAdvanced;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeSecurityConfigurationCodeScanningOptions codeSecurityConfigurationCodeScanningOptions =
                (CodeSecurityConfigurationCodeScanningOptions) o;
        return equalsNullable(this.allowAdvanced, codeSecurityConfigurationCodeScanningOptions.allowAdvanced);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashCodeNullable(allowAdvanced));
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeSecurityConfigurationCodeScanningOptions {\n");
        sb.append("    allowAdvanced: ").append(toIndentedString(allowAdvanced)).append("\n");
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
