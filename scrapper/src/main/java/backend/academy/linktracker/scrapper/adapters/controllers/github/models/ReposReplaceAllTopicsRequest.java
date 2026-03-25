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
 * ReposReplaceAllTopicsRequest
 */
@JsonTypeName("repos_replace_all_topics_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposReplaceAllTopicsRequest {

    @Valid
    private List<String> names = new ArrayList<>();

    public ReposReplaceAllTopicsRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposReplaceAllTopicsRequest(List<String> names) {
        this.names = names;
    }

    public ReposReplaceAllTopicsRequest names(List<String> names) {
        this.names = names;
        return this;
    }

    public ReposReplaceAllTopicsRequest addNamesItem(String namesItem) {
        if (this.names == null) {
            this.names = new ArrayList<>();
        }
        this.names.add(namesItem);
        return this;
    }

    /**
     * An array of topics to add to the repository. Pass one or more topics to _replace_ the set of existing topics. Send an empty array (`[]`) to clear all topics from the repository. **Note:** Topic `names` will be saved as lowercase.
     * @return names
     */
    @NotNull
    @Schema(
            name = "names",
            description =
                    "An array of topics to add to the repository. Pass one or more topics to _replace_ the set of existing topics. Send an empty array (`[]`) to clear all topics from the repository. **Note:** Topic `names` will be saved as lowercase.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("names")
    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposReplaceAllTopicsRequest reposReplaceAllTopicsRequest = (ReposReplaceAllTopicsRequest) o;
        return Objects.equals(this.names, reposReplaceAllTopicsRequest.names);
    }

    @Override
    public int hashCode() {
        return Objects.hash(names);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposReplaceAllTopicsRequest {\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
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
