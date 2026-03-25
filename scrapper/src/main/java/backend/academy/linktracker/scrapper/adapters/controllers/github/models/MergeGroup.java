package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * A group of pull requests that the merge queue has grouped together to be merged.
 */
@Schema(
        name = "merge-group",
        description = "A group of pull requests that the merge queue has grouped together to be merged.")
@JsonTypeName("merge-group")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MergeGroup {

    private String headSha;

    private String headRef;

    private String baseSha;

    private String baseRef;

    private SimpleCommit headCommit;

    public MergeGroup() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public MergeGroup(String headSha, String headRef, String baseSha, String baseRef, SimpleCommit headCommit) {
        this.headSha = headSha;
        this.headRef = headRef;
        this.baseSha = baseSha;
        this.baseRef = baseRef;
        this.headCommit = headCommit;
    }

    public MergeGroup headSha(String headSha) {
        this.headSha = headSha;
        return this;
    }

    /**
     * The SHA of the merge group.
     * @return headSha
     */
    @NotNull
    @Schema(name = "head_sha", description = "The SHA of the merge group.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head_sha")
    public String getHeadSha() {
        return headSha;
    }

    public void setHeadSha(String headSha) {
        this.headSha = headSha;
    }

    public MergeGroup headRef(String headRef) {
        this.headRef = headRef;
        return this;
    }

    /**
     * The full ref of the merge group.
     * @return headRef
     */
    @NotNull
    @Schema(
            name = "head_ref",
            description = "The full ref of the merge group.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head_ref")
    public String getHeadRef() {
        return headRef;
    }

    public void setHeadRef(String headRef) {
        this.headRef = headRef;
    }

    public MergeGroup baseSha(String baseSha) {
        this.baseSha = baseSha;
        return this;
    }

    /**
     * The SHA of the merge group's parent commit.
     * @return baseSha
     */
    @NotNull
    @Schema(
            name = "base_sha",
            description = "The SHA of the merge group's parent commit.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("base_sha")
    public String getBaseSha() {
        return baseSha;
    }

    public void setBaseSha(String baseSha) {
        this.baseSha = baseSha;
    }

    public MergeGroup baseRef(String baseRef) {
        this.baseRef = baseRef;
        return this;
    }

    /**
     * The full ref of the branch the merge group will be merged into.
     * @return baseRef
     */
    @NotNull
    @Schema(
            name = "base_ref",
            description = "The full ref of the branch the merge group will be merged into.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("base_ref")
    public String getBaseRef() {
        return baseRef;
    }

    public void setBaseRef(String baseRef) {
        this.baseRef = baseRef;
    }

    public MergeGroup headCommit(SimpleCommit headCommit) {
        this.headCommit = headCommit;
        return this;
    }

    /**
     * Get headCommit
     * @return headCommit
     */
    @NotNull
    @Valid
    @Schema(name = "head_commit", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head_commit")
    public SimpleCommit getHeadCommit() {
        return headCommit;
    }

    public void setHeadCommit(SimpleCommit headCommit) {
        this.headCommit = headCommit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MergeGroup mergeGroup = (MergeGroup) o;
        return Objects.equals(this.headSha, mergeGroup.headSha)
                && Objects.equals(this.headRef, mergeGroup.headRef)
                && Objects.equals(this.baseSha, mergeGroup.baseSha)
                && Objects.equals(this.baseRef, mergeGroup.baseRef)
                && Objects.equals(this.headCommit, mergeGroup.headCommit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headSha, headRef, baseSha, baseRef, headCommit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeGroup {\n");
        sb.append("    headSha: ").append(toIndentedString(headSha)).append("\n");
        sb.append("    headRef: ").append(toIndentedString(headRef)).append("\n");
        sb.append("    baseSha: ").append(toIndentedString(baseSha)).append("\n");
        sb.append("    baseRef: ").append(toIndentedString(baseRef)).append("\n");
        sb.append("    headCommit: ").append(toIndentedString(headCommit)).append("\n");
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
