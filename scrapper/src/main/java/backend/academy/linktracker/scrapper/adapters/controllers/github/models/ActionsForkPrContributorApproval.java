package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * ActionsForkPrContributorApproval
 */
@JsonTypeName("actions-fork-pr-contributor-approval")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsForkPrContributorApproval {

    /**
     * The policy that controls when fork PR workflows require approval from a maintainer.
     */
    public enum ApprovalPolicyEnum {
        FIRST_TIME_CONTRIBUTORS_NEW_TO_GITHUB("first_time_contributors_new_to_github"),

        FIRST_TIME_CONTRIBUTORS("first_time_contributors"),

        ALL_EXTERNAL_CONTRIBUTORS("all_external_contributors");

        private final String value;

        ApprovalPolicyEnum(String value) {
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
        public static ApprovalPolicyEnum fromValue(String value) {
            for (ApprovalPolicyEnum b : ApprovalPolicyEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ApprovalPolicyEnum approvalPolicy;

    public ActionsForkPrContributorApproval() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsForkPrContributorApproval(ApprovalPolicyEnum approvalPolicy) {
        this.approvalPolicy = approvalPolicy;
    }

    public ActionsForkPrContributorApproval approvalPolicy(ApprovalPolicyEnum approvalPolicy) {
        this.approvalPolicy = approvalPolicy;
        return this;
    }

    /**
     * The policy that controls when fork PR workflows require approval from a maintainer.
     * @return approvalPolicy
     */
    @NotNull
    @Schema(
            name = "approval_policy",
            description = "The policy that controls when fork PR workflows require approval from a maintainer.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("approval_policy")
    public ApprovalPolicyEnum getApprovalPolicy() {
        return approvalPolicy;
    }

    public void setApprovalPolicy(ApprovalPolicyEnum approvalPolicy) {
        this.approvalPolicy = approvalPolicy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsForkPrContributorApproval actionsForkPrContributorApproval = (ActionsForkPrContributorApproval) o;
        return Objects.equals(this.approvalPolicy, actionsForkPrContributorApproval.approvalPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(approvalPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsForkPrContributorApproval {\n");
        sb.append("    approvalPolicy: ")
                .append(toIndentedString(approvalPolicy))
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
