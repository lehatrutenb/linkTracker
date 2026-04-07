package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * ReposUpdateBranchProtectionRequestRequiredStatusChecksChecksInner
 */
@JsonTypeName("repos_update_branch_protection_request_required_status_checks_checks_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposUpdateBranchProtectionRequestRequiredStatusChecksChecksInner {

    private String context;

    private Optional<Long> appId = Optional.empty();

    public ReposUpdateBranchProtectionRequestRequiredStatusChecksChecksInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposUpdateBranchProtectionRequestRequiredStatusChecksChecksInner(String context) {
        this.context = context;
    }

    public ReposUpdateBranchProtectionRequestRequiredStatusChecksChecksInner context(String context) {
        this.context = context;
        return this;
    }

    /**
     * The name of the required check
     * @return context
     */
    @NotNull
    @Schema(
            name = "context",
            description = "The name of the required check",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("context")
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public ReposUpdateBranchProtectionRequestRequiredStatusChecksChecksInner appId(Long appId) {
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    /**
     * The ID of the GitHub App that must provide this check. Omit this field to automatically select the GitHub App that has recently provided this check, or any app if it was not set by a GitHub App. Pass -1 to explicitly allow any app to set the status.
     * @return appId
     */
    @Schema(
            name = "app_id",
            description =
                    "The ID of the GitHub App that must provide this check. Omit this field to automatically select the GitHub App that has recently provided this check, or any app if it was not set by a GitHub App. Pass -1 to explicitly allow any app to set the status.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("app_id")
    public Optional<Long> getAppId() {
        return appId;
    }

    public void setAppId(Optional<Long> appId) {
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
        ReposUpdateBranchProtectionRequestRequiredStatusChecksChecksInner
                reposUpdateBranchProtectionRequestRequiredStatusChecksChecksInner =
                        (ReposUpdateBranchProtectionRequestRequiredStatusChecksChecksInner) o;
        return Objects.equals(this.context, reposUpdateBranchProtectionRequestRequiredStatusChecksChecksInner.context)
                && Objects.equals(this.appId, reposUpdateBranchProtectionRequestRequiredStatusChecksChecksInner.appId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(context, appId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposUpdateBranchProtectionRequestRequiredStatusChecksChecksInner {\n");
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
