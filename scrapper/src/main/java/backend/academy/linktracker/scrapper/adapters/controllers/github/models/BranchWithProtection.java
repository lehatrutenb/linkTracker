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
 * Branch With Protection
 */
@Schema(name = "branch-with-protection", description = "Branch With Protection")
@JsonTypeName("branch-with-protection")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class BranchWithProtection {

    private String name;

    private Commit commit;

    private BranchWithProtectionLinks links;

    private Boolean _protected;

    private BranchProtection protection;

    private URI protectionUrl;

    private String pattern;

    private Long requiredApprovingReviewCount;

    public BranchWithProtection() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public BranchWithProtection(
            String name,
            Commit commit,
            BranchWithProtectionLinks links,
            Boolean _protected,
            BranchProtection protection,
            URI protectionUrl) {
        this.name = name;
        this.commit = commit;
        this.links = links;
        this._protected = _protected;
        this.protection = protection;
        this.protectionUrl = protectionUrl;
    }

    public BranchWithProtection name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BranchWithProtection commit(Commit commit) {
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
    public Commit getCommit() {
        return commit;
    }

    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    public BranchWithProtection links(BranchWithProtectionLinks links) {
        this.links = links;
        return this;
    }

    /**
     * Get links
     * @return links
     */
    @NotNull
    @Valid
    @Schema(name = "_links", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("_links")
    public BranchWithProtectionLinks getLinks() {
        return links;
    }

    public void setLinks(BranchWithProtectionLinks links) {
        this.links = links;
    }

    public BranchWithProtection _protected(Boolean _protected) {
        this._protected = _protected;
        return this;
    }

    /**
     * Get _protected
     * @return _protected
     */
    @NotNull
    @Schema(name = "protected", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("protected")
    public Boolean getProtected() {
        return _protected;
    }

    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    public BranchWithProtection protection(BranchProtection protection) {
        this.protection = protection;
        return this;
    }

    /**
     * Get protection
     * @return protection
     */
    @NotNull
    @Valid
    @Schema(name = "protection", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("protection")
    public BranchProtection getProtection() {
        return protection;
    }

    public void setProtection(BranchProtection protection) {
        this.protection = protection;
    }

    public BranchWithProtection protectionUrl(URI protectionUrl) {
        this.protectionUrl = protectionUrl;
        return this;
    }

    /**
     * Get protectionUrl
     * @return protectionUrl
     */
    @NotNull
    @Valid
    @Schema(name = "protection_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("protection_url")
    public URI getProtectionUrl() {
        return protectionUrl;
    }

    public void setProtectionUrl(URI protectionUrl) {
        this.protectionUrl = protectionUrl;
    }

    public BranchWithProtection pattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Get pattern
     * @return pattern
     */
    @Schema(name = "pattern", example = "\"mas*\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pattern")
    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public BranchWithProtection requiredApprovingReviewCount(Long requiredApprovingReviewCount) {
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
        return this;
    }

    /**
     * Get requiredApprovingReviewCount
     * @return requiredApprovingReviewCount
     */
    @Schema(name = "required_approving_review_count", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("required_approving_review_count")
    public Long getRequiredApprovingReviewCount() {
        return requiredApprovingReviewCount;
    }

    public void setRequiredApprovingReviewCount(Long requiredApprovingReviewCount) {
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BranchWithProtection branchWithProtection = (BranchWithProtection) o;
        return Objects.equals(this.name, branchWithProtection.name)
                && Objects.equals(this.commit, branchWithProtection.commit)
                && Objects.equals(this.links, branchWithProtection.links)
                && Objects.equals(this._protected, branchWithProtection._protected)
                && Objects.equals(this.protection, branchWithProtection.protection)
                && Objects.equals(this.protectionUrl, branchWithProtection.protectionUrl)
                && Objects.equals(this.pattern, branchWithProtection.pattern)
                && Objects.equals(this.requiredApprovingReviewCount, branchWithProtection.requiredApprovingReviewCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name, commit, links, _protected, protection, protectionUrl, pattern, requiredApprovingReviewCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BranchWithProtection {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
        sb.append("    protection: ").append(toIndentedString(protection)).append("\n");
        sb.append("    protectionUrl: ").append(toIndentedString(protectionUrl)).append("\n");
        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
        sb.append("    requiredApprovingReviewCount: ")
                .append(toIndentedString(requiredApprovingReviewCount))
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
