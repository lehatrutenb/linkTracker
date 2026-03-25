package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ImportProjectChoicesInner
 */
@JsonTypeName("import_project_choices_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ImportProjectChoicesInner {

    private String vcs;

    private String tfvcProject;

    private String humanName;

    public ImportProjectChoicesInner vcs(String vcs) {
        this.vcs = vcs;
        return this;
    }

    /**
     * Get vcs
     * @return vcs
     */
    @Schema(name = "vcs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("vcs")
    public String getVcs() {
        return vcs;
    }

    public void setVcs(String vcs) {
        this.vcs = vcs;
    }

    public ImportProjectChoicesInner tfvcProject(String tfvcProject) {
        this.tfvcProject = tfvcProject;
        return this;
    }

    /**
     * Get tfvcProject
     * @return tfvcProject
     */
    @Schema(name = "tfvc_project", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tfvc_project")
    public String getTfvcProject() {
        return tfvcProject;
    }

    public void setTfvcProject(String tfvcProject) {
        this.tfvcProject = tfvcProject;
    }

    public ImportProjectChoicesInner humanName(String humanName) {
        this.humanName = humanName;
        return this;
    }

    /**
     * Get humanName
     * @return humanName
     */
    @Schema(name = "human_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("human_name")
    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportProjectChoicesInner importProjectChoicesInner = (ImportProjectChoicesInner) o;
        return Objects.equals(this.vcs, importProjectChoicesInner.vcs)
                && Objects.equals(this.tfvcProject, importProjectChoicesInner.tfvcProject)
                && Objects.equals(this.humanName, importProjectChoicesInner.humanName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vcs, tfvcProject, humanName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportProjectChoicesInner {\n");
        sb.append("    vcs: ").append(toIndentedString(vcs)).append("\n");
        sb.append("    tfvcProject: ").append(toIndentedString(tfvcProject)).append("\n");
        sb.append("    humanName: ").append(toIndentedString(humanName)).append("\n");
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
