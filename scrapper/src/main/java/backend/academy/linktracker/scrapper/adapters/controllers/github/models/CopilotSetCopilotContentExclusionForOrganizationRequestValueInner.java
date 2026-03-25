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
 * CopilotSetCopilotContentExclusionForOrganizationRequestValueInner
 */
@JsonTypeName("copilot_set_copilot_content_exclusion_for_organization_request_value_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotSetCopilotContentExclusionForOrganizationRequestValueInner {

    @Valid
    private List<String> ifAnyMatch = new ArrayList<>();

    @Valid
    private List<String> ifNoneMatch = new ArrayList<>();

    public CopilotSetCopilotContentExclusionForOrganizationRequestValueInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CopilotSetCopilotContentExclusionForOrganizationRequestValueInner(
            List<String> ifAnyMatch, List<String> ifNoneMatch) {
        this.ifAnyMatch = ifAnyMatch;
        this.ifNoneMatch = ifNoneMatch;
    }

    public CopilotSetCopilotContentExclusionForOrganizationRequestValueInner ifAnyMatch(List<String> ifAnyMatch) {
        this.ifAnyMatch = ifAnyMatch;
        return this;
    }

    public CopilotSetCopilotContentExclusionForOrganizationRequestValueInner addIfAnyMatchItem(String ifAnyMatchItem) {
        if (this.ifAnyMatch == null) {
            this.ifAnyMatch = new ArrayList<>();
        }
        this.ifAnyMatch.add(ifAnyMatchItem);
        return this;
    }

    /**
     * Get ifAnyMatch
     * @return ifAnyMatch
     */
    @NotNull
    @Schema(name = "ifAnyMatch", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ifAnyMatch")
    public List<String> getIfAnyMatch() {
        return ifAnyMatch;
    }

    public void setIfAnyMatch(List<String> ifAnyMatch) {
        this.ifAnyMatch = ifAnyMatch;
    }

    public CopilotSetCopilotContentExclusionForOrganizationRequestValueInner ifNoneMatch(List<String> ifNoneMatch) {
        this.ifNoneMatch = ifNoneMatch;
        return this;
    }

    public CopilotSetCopilotContentExclusionForOrganizationRequestValueInner addIfNoneMatchItem(
            String ifNoneMatchItem) {
        if (this.ifNoneMatch == null) {
            this.ifNoneMatch = new ArrayList<>();
        }
        this.ifNoneMatch.add(ifNoneMatchItem);
        return this;
    }

    /**
     * Get ifNoneMatch
     * @return ifNoneMatch
     */
    @NotNull
    @Schema(name = "ifNoneMatch", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ifNoneMatch")
    public List<String> getIfNoneMatch() {
        return ifNoneMatch;
    }

    public void setIfNoneMatch(List<String> ifNoneMatch) {
        this.ifNoneMatch = ifNoneMatch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopilotSetCopilotContentExclusionForOrganizationRequestValueInner
                copilotSetCopilotContentExclusionForOrganizationRequestValueInner =
                        (CopilotSetCopilotContentExclusionForOrganizationRequestValueInner) o;
        return Objects.equals(
                        this.ifAnyMatch, copilotSetCopilotContentExclusionForOrganizationRequestValueInner.ifAnyMatch)
                && Objects.equals(
                        this.ifNoneMatch,
                        copilotSetCopilotContentExclusionForOrganizationRequestValueInner.ifNoneMatch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ifAnyMatch, ifNoneMatch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopilotSetCopilotContentExclusionForOrganizationRequestValueInner {\n");
        sb.append("    ifAnyMatch: ").append(toIndentedString(ifAnyMatch)).append("\n");
        sb.append("    ifNoneMatch: ").append(toIndentedString(ifNoneMatch)).append("\n");
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
