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
 * CopilotSetCopilotContentExclusionForOrganizationRequestValueInnerAnyOf1
 */
@JsonTypeName("copilot_set_copilot_content_exclusion_for_organization_request_value_inner_anyOf_1")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotSetCopilotContentExclusionForOrganizationRequestValueInnerAnyOf1 {

    @Valid
    private List<String> ifNoneMatch = new ArrayList<>();

    public CopilotSetCopilotContentExclusionForOrganizationRequestValueInnerAnyOf1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CopilotSetCopilotContentExclusionForOrganizationRequestValueInnerAnyOf1(List<String> ifNoneMatch) {
        this.ifNoneMatch = ifNoneMatch;
    }

    public CopilotSetCopilotContentExclusionForOrganizationRequestValueInnerAnyOf1 ifNoneMatch(
            List<String> ifNoneMatch) {
        this.ifNoneMatch = ifNoneMatch;
        return this;
    }

    public CopilotSetCopilotContentExclusionForOrganizationRequestValueInnerAnyOf1 addIfNoneMatchItem(
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
        CopilotSetCopilotContentExclusionForOrganizationRequestValueInnerAnyOf1
                copilotSetCopilotContentExclusionForOrganizationRequestValueInnerAnyOf1 =
                        (CopilotSetCopilotContentExclusionForOrganizationRequestValueInnerAnyOf1) o;
        return Objects.equals(
                this.ifNoneMatch, copilotSetCopilotContentExclusionForOrganizationRequestValueInnerAnyOf1.ifNoneMatch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ifNoneMatch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopilotSetCopilotContentExclusionForOrganizationRequestValueInnerAnyOf1 {\n");
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
