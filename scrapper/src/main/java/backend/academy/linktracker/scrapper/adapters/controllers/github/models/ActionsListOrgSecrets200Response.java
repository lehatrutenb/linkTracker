package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ActionsListOrgSecrets200Response
 */
@JsonTypeName("actions_list_org_secrets_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsListOrgSecrets200Response {

    private Long totalCount;

    @Valid
    private List<@Valid OrganizationActionsSecret> secrets = new ArrayList<>();

    public ActionsListOrgSecrets200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsListOrgSecrets200Response(Long totalCount, List<@Valid OrganizationActionsSecret> secrets) {
        this.totalCount = totalCount;
        this.secrets = secrets;
    }

    public ActionsListOrgSecrets200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get totalCount
     * @return totalCount
     */
    @NotNull
    @Schema(name = "total_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total_count")
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ActionsListOrgSecrets200Response secrets(List<@Valid OrganizationActionsSecret> secrets) {
        this.secrets = secrets;
        return this;
    }

    public ActionsListOrgSecrets200Response addSecretsItem(OrganizationActionsSecret secretsItem) {
        if (this.secrets == null) {
            this.secrets = new ArrayList<>();
        }
        this.secrets.add(secretsItem);
        return this;
    }

    /**
     * Get secrets
     * @return secrets
     */
    @NotNull
    @Valid
    @Schema(name = "secrets", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("secrets")
    public List<@Valid OrganizationActionsSecret> getSecrets() {
        return secrets;
    }

    public void setSecrets(List<@Valid OrganizationActionsSecret> secrets) {
        this.secrets = secrets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsListOrgSecrets200Response actionsListOrgSecrets200Response = (ActionsListOrgSecrets200Response) o;
        return Objects.equals(this.totalCount, actionsListOrgSecrets200Response.totalCount)
                && Objects.equals(this.secrets, actionsListOrgSecrets200Response.secrets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, secrets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsListOrgSecrets200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
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
