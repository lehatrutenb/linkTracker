package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ProtectedBranchRequiredStatusCheckChecksInner
 */
@JsonTypeName("protected_branch_required_status_check_checks_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProtectedBranchRequiredStatusCheckChecksInner {

    private String context;

    private Long appId = null;

    public ProtectedBranchRequiredStatusCheckChecksInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProtectedBranchRequiredStatusCheckChecksInner(String context, Long appId) {
        this.context = context;
        this.appId = appId;
    }

    public ProtectedBranchRequiredStatusCheckChecksInner context(String context) {
        this.context = context;
        return this;
    }

    /**
     * Get context
     * @return context
     */
    @NotNull
    @Schema(name = "context", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("context")
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public ProtectedBranchRequiredStatusCheckChecksInner appId(Long appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Get appId
     * @return appId
     */
    @NotNull
    @Schema(name = "app_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("app_id")
    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProtectedBranchRequiredStatusCheckChecksInner protectedBranchRequiredStatusCheckChecksInner =
                (ProtectedBranchRequiredStatusCheckChecksInner) o;
        return Objects.equals(this.context, protectedBranchRequiredStatusCheckChecksInner.context)
                && Objects.equals(this.appId, protectedBranchRequiredStatusCheckChecksInner.appId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(context, appId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectedBranchRequiredStatusCheckChecksInner {\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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
