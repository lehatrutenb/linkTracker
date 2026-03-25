package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ActionsCreateWorkflowDispatchRequest
 */
@JsonTypeName("actions_create_workflow_dispatch_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsCreateWorkflowDispatchRequest {

    private String ref;

    @Valid
    private Map<String, Object> inputs = new HashMap<>();

    public ActionsCreateWorkflowDispatchRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsCreateWorkflowDispatchRequest(String ref) {
        this.ref = ref;
    }

    public ActionsCreateWorkflowDispatchRequest ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * The git reference for the workflow. The reference can be a branch or tag name.
     * @return ref
     */
    @NotNull
    @Schema(
            name = "ref",
            description = "The git reference for the workflow. The reference can be a branch or tag name.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public ActionsCreateWorkflowDispatchRequest inputs(Map<String, Object> inputs) {
        this.inputs = inputs;
        return this;
    }

    public ActionsCreateWorkflowDispatchRequest putInputsItem(String key, Object inputsItem) {
        if (this.inputs == null) {
            this.inputs = new HashMap<>();
        }
        this.inputs.put(key, inputsItem);
        return this;
    }

    /**
     * Input keys and values configured in the workflow file. The maximum number of properties is 25. Any default properties configured in the workflow file will be used when `inputs` are omitted.
     * @return inputs
     */
    @Size(max = 25)
    @Schema(
            name = "inputs",
            description =
                    "Input keys and values configured in the workflow file. The maximum number of properties is 25. Any default properties configured in the workflow file will be used when `inputs` are omitted.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("inputs")
    public Map<String, Object> getInputs() {
        return inputs;
    }

    public void setInputs(Map<String, Object> inputs) {
        this.inputs = inputs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsCreateWorkflowDispatchRequest actionsCreateWorkflowDispatchRequest =
                (ActionsCreateWorkflowDispatchRequest) o;
        return Objects.equals(this.ref, actionsCreateWorkflowDispatchRequest.ref)
                && Objects.equals(this.inputs, actionsCreateWorkflowDispatchRequest.inputs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ref, inputs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsCreateWorkflowDispatchRequest {\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
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
