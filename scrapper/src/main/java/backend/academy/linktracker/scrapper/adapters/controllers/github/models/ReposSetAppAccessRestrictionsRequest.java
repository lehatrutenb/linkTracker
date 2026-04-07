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
 * ReposSetAppAccessRestrictionsRequest
 */
@JsonTypeName("repos_set_app_access_restrictions_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposSetAppAccessRestrictionsRequest {

    @Valid
    private List<String> apps = new ArrayList<>();

    public ReposSetAppAccessRestrictionsRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposSetAppAccessRestrictionsRequest(List<String> apps) {
        this.apps = apps;
    }

    public ReposSetAppAccessRestrictionsRequest apps(List<String> apps) {
        this.apps = apps;
        return this;
    }

    public ReposSetAppAccessRestrictionsRequest addAppsItem(String appsItem) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        this.apps.add(appsItem);
        return this;
    }

    /**
     * The GitHub Apps that have push access to this branch. Use the slugified version of the app name. **Note**: The list of users, apps, and teams in total is limited to 100 items.
     * @return apps
     */
    @NotNull
    @Schema(
            name = "apps",
            description =
                    "The GitHub Apps that have push access to this branch. Use the slugified version of the app name. **Note**: The list of users, apps, and teams in total is limited to 100 items.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("apps")
    public List<String> getApps() {
        return apps;
    }

    public void setApps(List<String> apps) {
        this.apps = apps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposSetAppAccessRestrictionsRequest reposSetAppAccessRestrictionsRequest =
                (ReposSetAppAccessRestrictionsRequest) o;
        return Objects.equals(this.apps, reposSetAppAccessRestrictionsRequest.apps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposSetAppAccessRestrictionsRequest {\n");
        sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
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
