package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * ActionsUpdateRepoVariableRequest
 */
@JsonTypeName("actions_update_repo_variable_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsUpdateRepoVariableRequest {

    private Optional<String> name = Optional.empty();

    private Optional<String> value = Optional.empty();

    public ActionsUpdateRepoVariableRequest name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * The name of the variable.
     * @return name
     */
    @Schema(name = "name", description = "The name of the variable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public ActionsUpdateRepoVariableRequest value(String value) {
        this.value = Optional.ofNullable(value);
        return this;
    }

    /**
     * The value of the variable.
     * @return value
     */
    @Schema(name = "value", description = "The value of the variable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("value")
    public Optional<String> getValue() {
        return value;
    }

    public void setValue(Optional<String> value) {
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
