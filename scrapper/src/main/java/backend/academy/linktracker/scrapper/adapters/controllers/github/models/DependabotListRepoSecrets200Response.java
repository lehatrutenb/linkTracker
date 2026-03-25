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
 * DependabotListRepoSecrets200Response
 */
@JsonTypeName("dependabot_list_repo_secrets_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DependabotListRepoSecrets200Response {

    private Long totalCount;

    @Valid
    private List<@Valid DependabotSecret> secrets = new ArrayList<>();

    public DependabotListRepoSecrets200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DependabotListRepoSecrets200Response(Long totalCount, List<@Valid DependabotSecret> secrets) {
        this.totalCount = totalCount;
        this.secrets = secrets;
    }

    public DependabotListRepoSecrets200Response totalCount(Long totalCount) {
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

    public DependabotListRepoSecrets200Response secrets(List<@Valid DependabotSecret> secrets) {
        this.secrets = secrets;
        return this;
    }

    public DependabotListRepoSecrets200Response addSecretsItem(DependabotSecret secretsItem) {
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
    public List<@Valid DependabotSecret> getSecrets() {
        return secrets;
    }

    public void setSecrets(List<@Valid DependabotSecret> secrets) {
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
        DependabotListRepoSecrets200Response dependabotListRepoSecrets200Response =
                (DependabotListRepoSecrets200Response) o;
        return Objects.equals(this.totalCount, dependabotListRepoSecrets200Response.totalCount)
                && Objects.equals(this.secrets, dependabotListRepoSecrets200Response.secrets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, secrets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependabotListRepoSecrets200Response {\n");
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
