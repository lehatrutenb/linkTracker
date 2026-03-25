package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CodespacesListSecretsForAuthenticatedUser200Response
 */
@JsonTypeName("codespaces_list_secrets_for_authenticated_user_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodespacesListSecretsForAuthenticatedUser200Response {

    private Long totalCount;

    @Valid
    private List<@Valid CodespacesSecret> secrets = new ArrayList<>();

    public CodespacesListSecretsForAuthenticatedUser200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodespacesListSecretsForAuthenticatedUser200Response(
            Long totalCount, List<@Valid CodespacesSecret> secrets) {
        this.totalCount = totalCount;
        this.secrets = secrets;
    }

    public CodespacesListSecretsForAuthenticatedUser200Response totalCount(Long totalCount) {
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

    public CodespacesListSecretsForAuthenticatedUser200Response secrets(List<@Valid CodespacesSecret> secrets) {
        this.secrets = secrets;
        return this;
    }

    public CodespacesListSecretsForAuthenticatedUser200Response addSecretsItem(CodespacesSecret secretsItem) {
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
    public List<@Valid CodespacesSecret> getSecrets() {
        return secrets;
    }

    public void setSecrets(List<@Valid CodespacesSecret> secrets) {
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
        CodespacesListSecretsForAuthenticatedUser200Response codespacesListSecretsForAuthenticatedUser200Response =
                (CodespacesListSecretsForAuthenticatedUser200Response) o;
        return Objects.equals(this.totalCount, codespacesListSecretsForAuthenticatedUser200Response.totalCount)
                && Objects.equals(this.secrets, codespacesListSecretsForAuthenticatedUser200Response.secrets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, secrets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodespacesListSecretsForAuthenticatedUser200Response {\n");
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
