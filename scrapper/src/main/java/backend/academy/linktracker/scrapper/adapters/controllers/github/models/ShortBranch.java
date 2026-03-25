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
 * Short Branch
 */
@Schema(name = "short-branch", description = "Short Branch")
@JsonTypeName("short-branch")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ShortBranch {

    private String name;

    private ShortBranchCommit commit;

    private Boolean _protected;

    private BranchProtection protection;

    private URI protectionUrl;

    public ShortBranch() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ShortBranch(String name, ShortBranchCommit commit, Boolean _protected) {
        this.name = name;
        this.commit = commit;
        this._protected = _protected;
    }

    public ShortBranch name(String name) {
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

    public ShortBranch commit(ShortBranchCommit commit) {
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

    public ShortBranch _protected(Boolean _protected) {
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

    public ShortBranch protection(BranchProtection protection) {
        this.protection = protection;
        return this;
    }

    /**
     * Get protection
     * @return protection
     */
    @Valid
    @Schema(name = "protection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("protection")
    public BranchProtection getProtection() {
        return protection;
    }

    public void setProtection(BranchProtection protection) {
        this.protection = protection;
    }

    public ShortBranch protectionUrl(URI protectionUrl) {
        this.protectionUrl = protectionUrl;
        return this;
    }

    /**
     * Get protectionUrl
     * @return protectionUrl
     */
    @Valid
    @Schema(name = "protection_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("protection_url")
    public URI getProtectionUrl() {
        return protectionUrl;
    }

    public void setProtectionUrl(URI protectionUrl) {
        this.protectionUrl = protectionUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShortBranch shortBranch = (ShortBranch) o;
        return Objects.equals(this.name, shortBranch.name)
                && Objects.equals(this.commit, shortBranch.commit)
                && Objects.equals(this._protected, shortBranch._protected)
                && Objects.equals(this.protection, shortBranch.protection)
                && Objects.equals(this.protectionUrl, shortBranch.protectionUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, commit, _protected, protection, protectionUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShortBranch {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
        sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
        sb.append("    protection: ").append(toIndentedString(protection)).append("\n");
        sb.append("    protectionUrl: ").append(toIndentedString(protectionUrl)).append("\n");
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
