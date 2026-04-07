package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Diff Entry
 */
@Schema(name = "diff-entry", description = "Diff Entry")
@JsonTypeName("diff-entry")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DiffEntry {

    private JsonNullable<String> sha = JsonNullable.<String>undefined();

    private String filename;

    /**
     * Gets or Sets status
     */
    public enum StatusEnum {
        ADDED("added"),

        REMOVED("removed"),

        MODIFIED("modified"),

        RENAMED("renamed"),

        COPIED("copied"),

        CHANGED("changed"),

        UNCHANGED("unchanged");

        private final String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private StatusEnum status;

    private Long additions;

    private Long deletions;

    private Long changes;

    private URI blobUrl;

    private URI rawUrl;

    private URI contentsUrl;

    private Optional<String> patch = Optional.empty();

    private Optional<String> previousFilename = Optional.empty();

    public DiffEntry() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DiffEntry(
            String sha,
            String filename,
            StatusEnum status,
            Long additions,
            Long deletions,
            Long changes,
            URI blobUrl,
            URI rawUrl,
            URI contentsUrl) {
        this.sha = JsonNullable.of(sha);
        this.filename = filename;
        this.status = status;
        this.additions = additions;
        this.deletions = deletions;
        this.changes = changes;
        this.blobUrl = blobUrl;
        this.rawUrl = rawUrl;
        this.contentsUrl = contentsUrl;
    }

    public DiffEntry sha(String sha) {
        this.sha = JsonNullable.of(sha);
        return this;
    }

    /**
     * Get sha
     * @return sha
     */
    @NotNull
    @Schema(
            name = "sha",
            example = "bbcd538c8e72b8c175046e27cc8f907076331401",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sha")
    public JsonNullable<String> getSha() {
        return sha;
    }

    public void setSha(JsonNullable<String> sha) {
        this.sha = sha;
    }

    public DiffEntry filename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * Get filename
     * @return filename
     */
    @NotNull
    @Schema(name = "filename", example = "file1.txt", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("filename")
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public DiffEntry status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @NotNull
    @Schema(name = "status", example = "added", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public DiffEntry additions(Long additions) {
        this.additions = additions;
        return this;
    }

    /**
     * Get additions
     * @return additions
     */
    @NotNull
    @Schema(name = "additions", example = "103", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("additions")
    public Long getAdditions() {
        return additions;
    }

    public void setAdditions(Long additions) {
        this.additions = additions;
    }

    public DiffEntry deletions(Long deletions) {
        this.deletions = deletions;
        return this;
    }

    /**
     * Get deletions
     * @return deletions
     */
    @NotNull
    @Schema(name = "deletions", example = "21", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("deletions")
    public Long getDeletions() {
        return deletions;
    }

    public void setDeletions(Long deletions) {
        this.deletions = deletions;
    }

    public DiffEntry changes(Long changes) {
        this.changes = changes;
        return this;
    }

    /**
     * Get changes
     * @return changes
     */
    @NotNull
    @Schema(name = "changes", example = "124", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("changes")
    public Long getChanges() {
        return changes;
    }

    public void setChanges(Long changes) {
        this.changes = changes;
    }

    public DiffEntry blobUrl(URI blobUrl) {
        this.blobUrl = blobUrl;
        return this;
    }

    /**
     * Get blobUrl
     * @return blobUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "blob_url",
            example = "https://github.com/octocat/Hello-World/blob/6dcb09b5b57875f334f61aebed695e2e4193db5e/file1.txt",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("blob_url")
    public URI getBlobUrl() {
        return blobUrl;
    }

    public void setBlobUrl(URI blobUrl) {
        this.blobUrl = blobUrl;
    }

    public DiffEntry rawUrl(URI rawUrl) {
        this.rawUrl = rawUrl;
        return this;
    }

    /**
     * Get rawUrl
     * @return rawUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "raw_url",
            example = "https://github.com/octocat/Hello-World/raw/6dcb09b5b57875f334f61aebed695e2e4193db5e/file1.txt",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("raw_url")
    public URI getRawUrl() {
        return rawUrl;
    }

    public void setRawUrl(URI rawUrl) {
        this.rawUrl = rawUrl;
    }

    public DiffEntry contentsUrl(URI contentsUrl) {
        this.contentsUrl = contentsUrl;
        return this;
    }

    /**
     * Get contentsUrl
     * @return contentsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "contents_url",
            example =
                    "https://api.github.com/repos/octocat/Hello-World/contents/file1.txt?ref=6dcb09b5b57875f334f61aebed695e2e4193db5e",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("contents_url")
    public URI getContentsUrl() {
        return contentsUrl;
    }

    public void setContentsUrl(URI contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    public DiffEntry patch(String patch) {
        this.patch = Optional.ofNullable(patch);
        return this;
    }

    /**
     * Get patch
     * @return patch
     */
    @Schema(
            name = "patch",
            example = "@@ -132,7 +132,7 @@ module Test @@ -1000,7 +1000,7 @@ module Test",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("patch")
    public Optional<String> getPatch() {
        return patch;
    }

    public void setPatch(Optional<String> patch) {
        this.patch = patch;
    }

    public DiffEntry previousFilename(String previousFilename) {
        this.previousFilename = Optional.ofNullable(previousFilename);
        return this;
    }

    /**
     * Get previousFilename
     * @return previousFilename
     */
    @Schema(name = "previous_filename", example = "file.txt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("previous_filename")
    public Optional<String> getPreviousFilename() {
        return previousFilename;
    }

    public void setPreviousFilename(Optional<String> previousFilename) {
        this.previousFilename = previousFilename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiffEntry diffEntry = (DiffEntry) o;
        return Objects.equals(this.sha, diffEntry.sha)
                && Objects.equals(this.filename, diffEntry.filename)
                && Objects.equals(this.status, diffEntry.status)
                && Objects.equals(this.additions, diffEntry.additions)
                && Objects.equals(this.deletions, diffEntry.deletions)
                && Objects.equals(this.changes, diffEntry.changes)
                && Objects.equals(this.blobUrl, diffEntry.blobUrl)
                && Objects.equals(this.rawUrl, diffEntry.rawUrl)
                && Objects.equals(this.contentsUrl, diffEntry.contentsUrl)
                && Objects.equals(this.patch, diffEntry.patch)
                && Objects.equals(this.previousFilename, diffEntry.previousFilename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                sha,
                filename,
                status,
                additions,
                deletions,
                changes,
                blobUrl,
                rawUrl,
                contentsUrl,
                patch,
                previousFilename);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiffEntry {\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("    deletions: ").append(toIndentedString(deletions)).append("\n");
        sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
        sb.append("    blobUrl: ").append(toIndentedString(blobUrl)).append("\n");
        sb.append("    rawUrl: ").append(toIndentedString(rawUrl)).append("\n");
        sb.append("    contentsUrl: ").append(toIndentedString(contentsUrl)).append("\n");
        sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
        sb.append("    previousFilename: ")
                .append(toIndentedString(previousFilename))
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
