package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * ActionsCreateRepoVariableRequest
 */
@JsonTypeName("actions_create_repo_variable_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsCreateRepoVariableRequest {

    private String name;

    private String value;

    public ActionsCreateRepoVariableRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsCreateRepoVariableRequest(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public ActionsCreateRepoVariableRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the variable.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "The name of the variable.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActionsCreateRepoVariableRequest value(String value) {
        this.value = value;
        return this;
    }

    /**
     * The value of the variable.
     * @return value
     */
    @NotNull
    @Schema(name = "value", description = "The value of the variable.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsCreateRepoVariableRequest actionsCreateRepoVariableRequest = (ActionsCreateRepoVariableRequest) o;
        return Objects.equals(this.name, actionsCreateRepoVariableRequest.name)
                && Objects.equals(this.value, actionsCreateRepoVariableRequest.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsCreateRepoVariableRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
