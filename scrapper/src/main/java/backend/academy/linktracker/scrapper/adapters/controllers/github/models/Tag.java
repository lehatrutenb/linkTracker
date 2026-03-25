package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * Tag
 */
@Schema(name = "tag", description = "Tag")
@JsonTypeName("tag")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Tag {

    private String name;

    private ShortBranchCommit commit;

    private URI zipballUrl;

    private URI tarballUrl;

    private String nodeId;

    public Tag() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Tag(String name, ShortBranchCommit commit, URI zipballUrl, URI tarballUrl, String nodeId) {
        this.name = name;
        this.commit = commit;
        this.zipballUrl = zipballUrl;
        this.tarballUrl = tarballUrl;
        this.nodeId = nodeId;
    }

    public Tag name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", example = "v0.1", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tag commit(ShortBranchCommit commit) {
        this.commit = commit;
        return this;
    }

    /**
     * Get commit
     * @return commit
     */
    @NotNull
    @Valid
    @Schema(name = "commit", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit")
    public ShortBranchCommit getCommit() {
        return commit;
    }

    public void setCommit(ShortBranchCommit commit) {
        this.commit = commit;
    }

    public Tag zipballUrl(URI zipballUrl) {
        this.zipballUrl = zipballUrl;
        return this;
    }

    /**
     * Get zipballUrl
     * @return zipballUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "zipball_url",
            example = "https://github.com/octocat/Hello-World/zipball/v0.1",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("zipball_url")
    public URI getZipballUrl() {
        return zipballUrl;
    }

    public void setZipballUrl(URI zipballUrl) {
        this.zipballUrl = zipballUrl;
    }

    public Tag tarballUrl(URI tarballUrl) {
        this.tarballUrl = tarballUrl;
        return this;
    }

    /**
     * Get tarballUrl
     * @return tarballUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "tarball_url",
            example = "https://github.com/octocat/Hello-World/tarball/v0.1",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("tarball_url")
    public URI getTarballUrl() {
        return tarballUrl;
    }

    public void setTarballUrl(URI tarballUrl) {
        this.tarballUrl = tarballUrl;
    }

    public Tag nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tag tag = (Tag) o;
        return Objects.equals(this.name, tag.name)
                && Objects.equals(this.commit, tag.commit)
                && Objects.equals(this.zipballUrl, tag.zipballUrl)
                && Objects.equals(this.tarballUrl, tag.tarballUrl)
                && Objects.equals(this.nodeId, tag.nodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, commit, zipballUrl, tarballUrl, nodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Tag {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
        sb.append("    zipballUrl: ").append(toIndentedString(zipballUrl)).append("\n");
        sb.append("    tarballUrl: ").append(toIndentedString(tarballUrl)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
