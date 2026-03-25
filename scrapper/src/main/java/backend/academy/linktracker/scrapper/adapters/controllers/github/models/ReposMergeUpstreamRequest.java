package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ReposMergeUpstreamRequest
 */
@JsonTypeName("repos_merge_upstream_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposMergeUpstreamRequest {

    private String branch;

    public ReposMergeUpstreamRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposMergeUpstreamRequest(String branch) {
        this.branch = branch;
    }

    public ReposMergeUpstreamRequest branch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * The name of the branch which should be updated to match upstream.
     * @return branch
     */
    @NotNull
    @Schema(
            name = "branch",
            description = "The name of the branch which should be updated to match upstream.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("branch")
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposMergeUpstreamRequest reposMergeUpstreamRequest = (ReposMergeUpstreamRequest) o;
        return Objects.equals(this.branch, reposMergeUpstreamRequest.branch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposMergeUpstreamRequest {\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
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
