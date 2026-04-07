package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * MigrationsStartImportRequest
 */
@JsonTypeName("migrations_start_import_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MigrationsStartImportRequest {

    private String vcsUrl;

    /**
     * The originating VCS type. Without this parameter, the import job will take additional time to detect the VCS type before beginning the import. This detection step will be reflected in the response.
     */
    public enum VcsEnum {
        SUBVERSION("subversion"),

        GIT("git"),

        MERCURIAL("mercurial"),

        TFVC("tfvc");

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

    private Optional<VcsEnum> vcs = Optional.empty();

    private Optional<String> vcsUsername = Optional.empty();

    private Optional<String> vcsPassword = Optional.empty();

    private Optional<String> tfvcProject = Optional.empty();

    public MigrationsStartImportRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public MigrationsStartImportRequest(String vcsUrl) {
        this.vcsUrl = vcsUrl;
    }

    public MigrationsStartImportRequest vcsUrl(String vcsUrl) {
        this.vcsUrl = vcsUrl;
        return this;
    }

    /**
     * The URL of the originating repository.
     * @return vcsUrl
     */
    @NotNull
    @Schema(
            name = "vcs_url",
            description = "The URL of the originating repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("vcs_url")
    public String getVcsUrl() {
        return vcsUrl;
    }

    public void setVcsUrl(String vcsUrl) {
        this.vcsUrl = vcsUrl;
    }

    public MigrationsStartImportRequest vcs(VcsEnum vcs) {
        this.vcs = Optional.ofNullable(vcs);
        return this;
    }

    /**
     * The originating VCS type. Without this parameter, the import job will take additional time to detect the VCS type before beginning the import. This detection step will be reflected in the response.
     * @return vcs
     */
    @Schema(
            name = "vcs",
            description =
                    "The originating VCS type. Without this parameter, the import job will take additional time to detect the VCS type before beginning the import. This detection step will be reflected in the response.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("vcs")
    public Optional<VcsEnum> getVcs() {
        return vcs;
    }

    public void setVcs(Optional<VcsEnum> vcs) {
        this.vcs = vcs;
    }

    public MigrationsStartImportRequest vcsUsername(String vcsUsername) {
        this.vcsUsername = Optional.ofNullable(vcsUsername);
        return this;
    }

    /**
     * If authentication is required, the username to provide to `vcs_url`.
     * @return vcsUsername
     */
    @Schema(
            name = "vcs_username",
            description = "If authentication is required, the username to provide to `vcs_url`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("vcs_username")
    public Optional<String> getVcsUsername() {
        return vcsUsername;
    }

    public void setVcsUsername(Optional<String> vcsUsername) {
        this.vcsUsername = vcsUsername;
    }

    public MigrationsStartImportRequest vcsPassword(String vcsPassword) {
        this.vcsPassword = Optional.ofNullable(vcsPassword);
        return this;
    }

    /**
     * If authentication is required, the password to provide to `vcs_url`.
     * @return vcsPassword
     */
    @Schema(
            name = "vcs_password",
            description = "If authentication is required, the password to provide to `vcs_url`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("vcs_password")
    public Optional<String> getVcsPassword() {
        return vcsPassword;
    }

    public void setVcsPassword(Optional<String> vcsPassword) {
        this.vcsPassword = vcsPassword;
    }

    public MigrationsStartImportRequest tfvcProject(String tfvcProject) {
        this.tfvcProject = Optional.ofNullable(tfvcProject);
        return this;
    }

    /**
     * For a tfvc import, the name of the project that is being imported.
     * @return tfvcProject
     */
    @Schema(
            name = "tfvc_project",
            description = "For a tfvc import, the name of the project that is being imported.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tfvc_project")
    public Optional<String> getTfvcProject() {
        return tfvcProject;
    }

    public void setTfvcProject(Optional<String> tfvcProject) {
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
        MigrationsStartImportRequest migrationsStartImportRequest = (MigrationsStartImportRequest) o;
        return Objects.equals(this.vcsUrl, migrationsStartImportRequest.vcsUrl)
                && Objects.equals(this.vcs, migrationsStartImportRequest.vcs)
                && Objects.equals(this.vcsUsername, migrationsStartImportRequest.vcsUsername)
                && Objects.equals(this.vcsPassword, migrationsStartImportRequest.vcsPassword)
                && Objects.equals(this.tfvcProject, migrationsStartImportRequest.tfvcProject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vcsUrl, vcs, vcsUsername, vcsPassword, tfvcProject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrationsStartImportRequest {\n");
        sb.append("    vcsUrl: ").append(toIndentedString(vcsUrl)).append("\n");
        sb.append("    vcs: ").append(toIndentedString(vcs)).append("\n");
        sb.append("    vcsUsername: ").append(toIndentedString(vcsUsername)).append("\n");
        sb.append("    vcsPassword: ").append(toIndentedString(vcsPassword)).append("\n");
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
