package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Runner Application
 */
@Schema(name = "runner-application", description = "Runner Application")
@JsonTypeName("runner-application")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RunnerApplication {

    private String os;

    private String architecture;

    private String downloadUrl;

    private String filename;

    private String tempDownloadToken;

    private String sha256Checksum;

    public RunnerApplication() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RunnerApplication(String os, String architecture, String downloadUrl, String filename) {
        this.os = os;
        this.architecture = architecture;
        this.downloadUrl = downloadUrl;
        this.filename = filename;
    }

    public RunnerApplication os(String os) {
        this.os = os;
        return this;
    }

    /**
     * Get os
     * @return os
     */
    @NotNull
    @Schema(name = "os", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("os")
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public RunnerApplication architecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * Get architecture
     * @return architecture
     */
    @NotNull
    @Schema(name = "architecture", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("architecture")
    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public RunnerApplication downloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * Get downloadUrl
     * @return downloadUrl
     */
    @NotNull
    @Schema(name = "download_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("download_url")
    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public RunnerApplication filename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * Get filename
     * @return filename
     */
    @NotNull
    @Schema(name = "filename", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("filename")
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public RunnerApplication tempDownloadToken(String tempDownloadToken) {
        this.tempDownloadToken = tempDownloadToken;
        return this;
    }

    /**
     * A short lived bearer token used to download the runner, if needed.
     * @return tempDownloadToken
     */
    @Schema(
            name = "temp_download_token",
            description = "A short lived bearer token used to download the runner, if needed.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("temp_download_token")
    public String getTempDownloadToken() {
        return tempDownloadToken;
    }

    public void setTempDownloadToken(String tempDownloadToken) {
        this.tempDownloadToken = tempDownloadToken;
    }

    public RunnerApplication sha256Checksum(String sha256Checksum) {
        this.sha256Checksum = sha256Checksum;
        return this;
    }

    /**
     * Get sha256Checksum
     * @return sha256Checksum
     */
    @Schema(name = "sha256_checksum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sha256_checksum")
    public String getSha256Checksum() {
        return sha256Checksum;
    }

    public void setSha256Checksum(String sha256Checksum) {
        this.sha256Checksum = sha256Checksum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunnerApplication runnerApplication = (RunnerApplication) o;
        return Objects.equals(this.os, runnerApplication.os)
                && Objects.equals(this.architecture, runnerApplication.architecture)
                && Objects.equals(this.downloadUrl, runnerApplication.downloadUrl)
                && Objects.equals(this.filename, runnerApplication.filename)
                && Objects.equals(this.tempDownloadToken, runnerApplication.tempDownloadToken)
                && Objects.equals(this.sha256Checksum, runnerApplication.sha256Checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(os, architecture, downloadUrl, filename, tempDownloadToken, sha256Checksum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunnerApplication {\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
        sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
        sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
        sb.append("    tempDownloadToken: ")
                .append(toIndentedString(tempDownloadToken))
                .append("\n");
        sb.append("    sha256Checksum: ")
                .append(toIndentedString(sha256Checksum))
                .append("\n");
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
