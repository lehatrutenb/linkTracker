package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Restricted commit
 */
@Schema(name = "repository-rule-params-restricted-commits", description = "Restricted commit")
@JsonTypeName("repository-rule-params-restricted-commits")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleParamsRestrictedCommits {

    private String oid;

    private String reason;

    public RepositoryRuleParamsRestrictedCommits() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRuleParamsRestrictedCommits(String oid) {
        this.oid = oid;
    }

    public RepositoryRuleParamsRestrictedCommits oid(String oid) {
        this.oid = oid;
        return this;
    }

    /**
     * Full or abbreviated commit hash to reject
     * @return oid
     */
    @NotNull
    @Schema(
            name = "oid",
            description = "Full or abbreviated commit hash to reject",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("oid")
    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public RepositoryRuleParamsRestrictedCommits reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Reason for restriction
     * @return reason
     */
    @Schema(name = "reason", description = "Reason for restriction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRuleParamsRestrictedCommits repositoryRuleParamsRestrictedCommits =
                (RepositoryRuleParamsRestrictedCommits) o;
        return Objects.equals(this.oid, repositoryRuleParamsRestrictedCommits.oid)
                && Objects.equals(this.reason, repositoryRuleParamsRestrictedCommits.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oid, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRuleParamsRestrictedCommits {\n");
        sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
