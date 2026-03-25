package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ActionsUpdateRepoVariableRequest
 */
@JsonTypeName("actions_update_repo_variable_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsUpdateRepoVariableRequest {

    private String name;

    private String value;

    public ActionsUpdateRepoVariableRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the variable.
     * @return name
     */
    @Schema(name = "name", description = "The name of the variable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActionsUpdateRepoVariableRequest value(String value) {
        this.value = value;
        return this;
    }

    /**
     * The value of the variable.
     * @return value
     */
    @Schema(name = "value", description = "The value of the variable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        ActionsUpdateRepoVariableRequest actionsUpdateRepoVariableRequest = (ActionsUpdateRepoVariableRequest) o;
        return Objects.equals(this.name, actionsUpdateRepoVariableRequest.name)
                && Objects.equals(this.value, actionsUpdateRepoVariableRequest.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsUpdateRepoVariableRequest {\n");
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
