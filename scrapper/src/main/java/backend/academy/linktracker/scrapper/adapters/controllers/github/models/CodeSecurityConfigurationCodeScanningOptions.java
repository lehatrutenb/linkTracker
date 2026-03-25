package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Feature options for code scanning
 */
@Schema(name = "code_security_configuration_code_scanning_options", description = "Feature options for code scanning")
@JsonTypeName("code_security_configuration_code_scanning_options")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeSecurityConfigurationCodeScanningOptions {

    private Boolean allowAdvanced = null;

    public CodeSecurityConfigurationCodeScanningOptions allowAdvanced(Boolean allowAdvanced) {
        this.allowAdvanced = allowAdvanced;
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
    public Boolean getAllowAdvanced() {
        return allowAdvanced;
    }

    public void setAllowAdvanced(Boolean allowAdvanced) {
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
        return Objects.equals(this.allowAdvanced, codeSecurityConfigurationCodeScanningOptions.allowAdvanced);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowAdvanced);
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
