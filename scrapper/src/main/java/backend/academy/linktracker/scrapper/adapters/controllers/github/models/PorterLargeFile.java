package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Porter Large File
 */
@Schema(name = "porter-large-file", description = "Porter Large File")
@JsonTypeName("porter-large-file")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PorterLargeFile {

    private String refName;

    private String path;

    private String oid;

    private Long size;

    public PorterLargeFile() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PorterLargeFile(String refName, String path, String oid, Long size) {
        this.refName = refName;
        this.path = path;
        this.oid = oid;
        this.size = size;
    }

    public PorterLargeFile refName(String refName) {
        this.refName = refName;
        return this;
    }

    /**
     * Get refName
     * @return refName
     */
    @NotNull
    @Schema(name = "ref_name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ref_name")
    public String getRefName() {
        return refName;
    }

    public void setRefName(String refName) {
        this.refName = refName;
    }

    public PorterLargeFile path(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get path
     * @return path
     */
    @NotNull
    @Schema(name = "path", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public PorterLargeFile oid(String oid) {
        this.oid = oid;
        return this;
    }

    /**
     * Get oid
     * @return oid
     */
    @NotNull
    @Schema(name = "oid", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("oid")
    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public PorterLargeFile size(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get size
     * @return size
     */
    @NotNull
    @Schema(name = "size", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("size")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PorterLargeFile porterLargeFile = (PorterLargeFile) o;
        return Objects.equals(this.refName, porterLargeFile.refName)
                && Objects.equals(this.path, porterLargeFile.path)
                && Objects.equals(this.oid, porterLargeFile.oid)
                && Objects.equals(this.size, porterLargeFile.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refName, path, oid, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PorterLargeFile {\n");
        sb.append("    refName: ").append(toIndentedString(refName)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
