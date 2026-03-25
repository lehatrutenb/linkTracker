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
 * CodespacesListInOrganization200Response
 */
@JsonTypeName("codespaces_list_in_organization_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodespacesListInOrganization200Response {

    private Long totalCount;

    @Valid
    private List<@Valid Codespace> codespaces = new ArrayList<>();

    public CodespacesListInOrganization200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodespacesListInOrganization200Response(Long totalCount, List<@Valid Codespace> codespaces) {
        this.totalCount = totalCount;
        this.codespaces = codespaces;
    }

    public CodespacesListInOrganization200Response totalCount(Long totalCount) {
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

    public CodespacesListInOrganization200Response codespaces(List<@Valid Codespace> codespaces) {
        this.codespaces = codespaces;
        return this;
    }

    public CodespacesListInOrganization200Response addCodespacesItem(Codespace codespacesItem) {
        if (this.codespaces == null) {
            this.codespaces = new ArrayList<>();
        }
        this.codespaces.add(codespacesItem);
        return this;
    }

    /**
     * Get codespaces
     * @return codespaces
     */
    @NotNull
    @Valid
    @Schema(name = "codespaces", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("codespaces")
    public List<@Valid Codespace> getCodespaces() {
        return codespaces;
    }

    public void setCodespaces(List<@Valid Codespace> codespaces) {
        this.codespaces = codespaces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodespacesListInOrganization200Response codespacesListInOrganization200Response =
                (CodespacesListInOrganization200Response) o;
        return Objects.equals(this.totalCount, codespacesListInOrganization200Response.totalCount)
                && Objects.equals(this.codespaces, codespacesListInOrganization200Response.codespaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, codespaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodespacesListInOrganization200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    codespaces: ").append(toIndentedString(codespaces)).append("\n");
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
