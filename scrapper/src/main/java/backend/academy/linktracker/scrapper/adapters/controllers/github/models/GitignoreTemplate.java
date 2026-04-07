package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Gitignore Template
 */
@Schema(name = "gitignore-template", description = "Gitignore Template")
@JsonTypeName("gitignore-template")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GitignoreTemplate {

    private String name;

    private String source;

    public GitignoreTemplate() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GitignoreTemplate(String name, String source) {
        this.name = name;
        this.source = source;
    }

    public GitignoreTemplate name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", example = "C", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GitignoreTemplate source(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     * @return source
     */
    @NotNull
    @Schema(
            name = "source",
            example =
                    "# Object files *.o  # Libraries *.lib *.a  # Shared objects (inc. Windows DLLs) *.dll *.so *.so.* *.dylib  # Executables *.exe *.out *.app ",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GitignoreTemplate gitignoreTemplate = (GitignoreTemplate) o;
        return Objects.equals(this.name, gitignoreTemplate.name)
                && Objects.equals(this.source, gitignoreTemplate.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, source);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitignoreTemplate {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
