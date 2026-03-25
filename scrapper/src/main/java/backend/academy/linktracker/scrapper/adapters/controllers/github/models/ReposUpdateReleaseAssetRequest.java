package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ReposUpdateReleaseAssetRequest
 */
@JsonTypeName("repos_update_release_asset_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposUpdateReleaseAssetRequest {

    private String name;

    private String label;

    private String state;

    public ReposUpdateReleaseAssetRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The file name of the asset.
     * @return name
     */
    @Schema(name = "name", description = "The file name of the asset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReposUpdateReleaseAssetRequest label(String label) {
        this.label = label;
        return this;
    }

    /**
     * An alternate short description of the asset. Used in place of the filename.
     * @return label
     */
    @Schema(
            name = "label",
            description = "An alternate short description of the asset. Used in place of the filename.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ReposUpdateReleaseAssetRequest state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @Schema(name = "state", example = "\"uploaded\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposUpdateReleaseAssetRequest reposUpdateReleaseAssetRequest = (ReposUpdateReleaseAssetRequest) o;
        return Objects.equals(this.name, reposUpdateReleaseAssetRequest.name)
                && Objects.equals(this.label, reposUpdateReleaseAssetRequest.label)
                && Objects.equals(this.state, reposUpdateReleaseAssetRequest.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, label, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposUpdateReleaseAssetRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
