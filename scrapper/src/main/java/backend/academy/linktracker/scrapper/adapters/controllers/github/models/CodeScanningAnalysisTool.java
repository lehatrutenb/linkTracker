package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * CodeScanningAnalysisTool
 */
@JsonTypeName("code-scanning-analysis-tool")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningAnalysisTool {

    private String name;

    private String version = null;

    private String guid = null;

    public CodeScanningAnalysisTool name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the tool used to generate the code scanning analysis.
     * @return name
     */
    @Schema(
            name = "name",
            description = "The name of the tool used to generate the code scanning analysis.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CodeScanningAnalysisTool version(String version) {
        this.version = version;
        return this;
    }

    /**
     * The version of the tool used to generate the code scanning analysis.
     * @return version
     */
    @Schema(
            name = "version",
            description = "The version of the tool used to generate the code scanning analysis.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public CodeScanningAnalysisTool guid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * The GUID of the tool used to generate the code scanning analysis, if provided in the uploaded SARIF data.
     * @return guid
     */
    @Schema(
            name = "guid",
            description =
                    "The GUID of the tool used to generate the code scanning analysis, if provided in the uploaded SARIF data.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("guid")
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeScanningAnalysisTool codeScanningAnalysisTool = (CodeScanningAnalysisTool) o;
        return Objects.equals(this.name, codeScanningAnalysisTool.name)
                && Objects.equals(this.version, codeScanningAnalysisTool.version)
                && Objects.equals(this.guid, codeScanningAnalysisTool.guid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, version, guid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeScanningAnalysisTool {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
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
