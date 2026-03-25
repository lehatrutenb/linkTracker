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
 * WebhookStatusBranchesInner
 */
@JsonTypeName("webhook_status_branches_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookStatusBranchesInner {

    private WebhookStatusBranchesInnerCommit commit;

    private String name;

    private Boolean _protected;

    public WebhookStatusBranchesInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookStatusBranchesInner(WebhookStatusBranchesInnerCommit commit, String name, Boolean _protected) {
        this.commit = commit;
        this.name = name;
        this._protected = _protected;
    }

    public WebhookStatusBranchesInner commit(WebhookStatusBranchesInnerCommit commit) {
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
    public WebhookStatusBranchesInnerCommit getCommit() {
        return commit;
    }

    public void setCommit(WebhookStatusBranchesInnerCommit commit) {
        this.commit = commit;
    }

    public WebhookStatusBranchesInner name(String name) {
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

    public WebhookStatusBranchesInner _protected(Boolean _protected) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookStatusBranchesInner webhookStatusBranchesInner = (WebhookStatusBranchesInner) o;
        return Objects.equals(this.commit, webhookStatusBranchesInner.commit)
                && Objects.equals(this.name, webhookStatusBranchesInner.name)
                && Objects.equals(this._protected, webhookStatusBranchesInner._protected);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commit, name, _protected);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookStatusBranchesInner {\n");
        sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
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
