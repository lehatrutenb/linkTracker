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
 * ReposSetStatusCheckContextsRequestOneOf
 */
@JsonTypeName("repos_set_status_check_contexts_request_oneOf")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposSetStatusCheckContextsRequestOneOf implements ReposSetStatusCheckContextsRequest {

    @Valid
    private List<String> contexts = new ArrayList<>();

    public ReposSetStatusCheckContextsRequestOneOf() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposSetStatusCheckContextsRequestOneOf(List<String> contexts) {
        this.contexts = contexts;
    }

    public ReposSetStatusCheckContextsRequestOneOf contexts(List<String> contexts) {
        this.contexts = contexts;
        return this;
    }

    public ReposSetStatusCheckContextsRequestOneOf addContextsItem(String contextsItem) {
        if (this.contexts == null) {
            this.contexts = new ArrayList<>();
        }
        this.contexts.add(contextsItem);
        return this;
    }

    /**
     * The name of the status checks
     * @return contexts
     */
    @NotNull
    @Schema(
            name = "contexts",
            description = "The name of the status checks",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("contexts")
    public List<String> getContexts() {
        return contexts;
    }

    public void setContexts(List<String> contexts) {
        this.contexts = contexts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposSetStatusCheckContextsRequestOneOf reposSetStatusCheckContextsRequestOneOf =
                (ReposSetStatusCheckContextsRequestOneOf) o;
        return Objects.equals(this.contexts, reposSetStatusCheckContextsRequestOneOf.contexts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contexts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposSetStatusCheckContextsRequestOneOf {\n");
        sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
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
