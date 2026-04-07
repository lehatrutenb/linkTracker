package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CodeScanningAnalysisTool
 */
@JsonTypeName("code-scanning-analysis-tool")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningAnalysisTool {

    private Optional<String> name = Optional.empty();

    private JsonNullable<String> version = JsonNullable.<String>undefined();

    private JsonNullable<String> guid = JsonNullable.<String>undefined();

    public CodeScanningAnalysisTool name(String name) {
        this.name = Optional.ofNullable(name);
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
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public CodeScanningAnalysisTool version(String version) {
        this.version = JsonNullable.of(version);
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
    public JsonNullable<String> getVersion() {
        return version;
    }

    public void setVersion(JsonNullable<String> version) {
        this.version = version;
    }

    public CodeScanningAnalysisTool guid(String guid) {
        this.guid = JsonNullable.of(guid);
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
    public JsonNullable<String> getGuid() {
        return guid;
    }

    public void setGuid(JsonNullable<String> guid) {
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
                && equalsNullable(this.version, codeScanningAnalysisTool.version)
                && equalsNullable(this.guid, codeScanningAnalysisTool.guid);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hashCodeNullable(version), hashCodeNullable(guid));
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
