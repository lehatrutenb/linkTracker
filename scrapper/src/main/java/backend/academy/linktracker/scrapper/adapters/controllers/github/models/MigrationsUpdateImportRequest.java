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
 * MigrationsUpdateImportRequest
 */
@JsonTypeName("migrations_update_import_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MigrationsUpdateImportRequest {

    private String vcsUsername;

    private String vcsPassword;

    /**
     * The type of version control system you are migrating from.
     */
    public enum VcsEnum {
        SUBVERSION("subversion"),

        TFVC("tfvc"),

        GIT("git"),

        MERCURIAL("mercurial");

        private final String value;

        VcsEnum(String value) {
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
        public static VcsEnum fromValue(String value) {
            for (VcsEnum b : VcsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private VcsEnum vcs;

    private String tfvcProject;

    public MigrationsUpdateImportRequest vcsUsername(String vcsUsername) {
        this.vcsUsername = vcsUsername;
        return this;
    }

    /**
     * The username to provide to the originating repository.
     * @return vcsUsername
     */
    @Schema(
            name = "vcs_username",
            description = "The username to provide to the originating repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("vcs_username")
    public String getVcsUsername() {
        return vcsUsername;
    }

    public void setVcsUsername(String vcsUsername) {
        this.vcsUsername = vcsUsername;
    }

    public MigrationsUpdateImportRequest vcsPassword(String vcsPassword) {
        this.vcsPassword = vcsPassword;
        return this;
    }

    /**
     * The password to provide to the originating repository.
     * @return vcsPassword
     */
    @Schema(
            name = "vcs_password",
            description = "The password to provide to the originating repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("vcs_password")
    public String getVcsPassword() {
        return vcsPassword;
    }

    public void setVcsPassword(String vcsPassword) {
        this.vcsPassword = vcsPassword;
    }

    public MigrationsUpdateImportRequest vcs(VcsEnum vcs) {
        this.vcs = vcs;
        return this;
    }

    /**
     * The type of version control system you are migrating from.
     * @return vcs
     */
    @Schema(
            name = "vcs",
            example = "\"git\"",
            description = "The type of version control system you are migrating from.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("vcs")
    public VcsEnum getVcs() {
        return vcs;
    }

    public void setVcs(VcsEnum vcs) {
        this.vcs = vcs;
    }

    public MigrationsUpdateImportRequest tfvcProject(String tfvcProject) {
        this.tfvcProject = tfvcProject;
        return this;
    }

    /**
     * For a tfvc import, the name of the project that is being imported.
     * @return tfvcProject
     */
    @Schema(
            name = "tfvc_project",
            example = "\"project1\"",
            description = "For a tfvc import, the name of the project that is being imported.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tfvc_project")
    public String getTfvcProject() {
        return tfvcProject;
    }

    public void setTfvcProject(String tfvcProject) {
        this.tfvcProject = tfvcProject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MigrationsUpdateImportRequest migrationsUpdateImportRequest = (MigrationsUpdateImportRequest) o;
        return Objects.equals(this.vcsUsername, migrationsUpdateImportRequest.vcsUsername)
                && Objects.equals(this.vcsPassword, migrationsUpdateImportRequest.vcsPassword)
                && Objects.equals(this.vcs, migrationsUpdateImportRequest.vcs)
                && Objects.equals(this.tfvcProject, migrationsUpdateImportRequest.tfvcProject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vcsUsername, vcsPassword, vcs, tfvcProject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrationsUpdateImportRequest {\n");
        sb.append("    vcsUsername: ").append(toIndentedString(vcsUsername)).append("\n");
        sb.append("    vcsPassword: ").append(toIndentedString(vcsPassword)).append("\n");
        sb.append("    vcs: ").append(toIndentedString(vcs)).append("\n");
        sb.append("    tfvcProject: ").append(toIndentedString(tfvcProject)).append("\n");
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
