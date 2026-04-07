package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * IssuesSetLabelsRequestOneOf1LabelsInner
 */
@JsonTypeName("issues_set_labels_request_oneOf_1_labels_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssuesSetLabelsRequestOneOf1LabelsInner {

    private String name;

    public IssuesSetLabelsRequestOneOf1LabelsInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssuesSetLabelsRequestOneOf1LabelsInner(String name) {
        this.name = name;
    }

    public IssuesSetLabelsRequestOneOf1LabelsInner name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssuesSetLabelsRequestOneOf1LabelsInner issuesSetLabelsRequestOneOf1LabelsInner =
                (IssuesSetLabelsRequestOneOf1LabelsInner) o;
        return Objects.equals(this.name, issuesSetLabelsRequestOneOf1LabelsInner.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssuesSetLabelsRequestOneOf1LabelsInner {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
