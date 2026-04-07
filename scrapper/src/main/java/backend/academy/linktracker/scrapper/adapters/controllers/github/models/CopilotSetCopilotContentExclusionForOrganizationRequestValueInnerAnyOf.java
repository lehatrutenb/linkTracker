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
 * CopilotSetCopilotContentExclusionForOrganizationRequestValueInnerAnyOf
 */
@JsonTypeName("copilot_set_copilot_content_exclusion_for_organization_request_value_inner_anyOf")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotSetCopilotContentExclusionForOrganizationRequestValueInnerAnyOf {

    @Valid
    private List<String> ifAnyMatch = new ArrayList<>();

    public CopilotSetCopilotContentExclusionForOrganizationRequestValueInnerAnyOf() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CopilotSetCopilotContentExclusionForOrganizationRequestValueInnerAnyOf(List<String> ifAnyMatch) {
        this.ifAnyMatch = ifAnyMatch;
    }

    public CopilotSetCopilotContentExclusionForOrganizationRequestValueInnerAnyOf ifAnyMatch(List<String> ifAnyMatch) {
        this.ifAnyMatch = ifAnyMatch;
        return this;
    }

    public CopilotSetCopilotContentExclusionForOrganizationRequestValueInnerAnyOf addIfAnyMatchItem(
            String ifAnyMatchItem) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopilotSetCopilotContentExclusionForOrganizationRequestValueInnerAnyOf
                copilotSetCopilotContentExclusionForOrganizationRequestValueInnerAnyOf =
                        (CopilotSetCopilotContentExclusionForOrganizationRequestValueInnerAnyOf) o;
        return Objects.equals(
                this.ifAnyMatch, copilotSetCopilotContentExclusionForOrganizationRequestValueInnerAnyOf.ifAnyMatch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ifAnyMatch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopilotSetCopilotContentExclusionForOrganizationRequestValueInnerAnyOf {\n");
        sb.append("    ifAnyMatch: ").append(toIndentedString(ifAnyMatch)).append("\n");
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
