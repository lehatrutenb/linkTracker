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
 * ActionsGetHostedRunnersPlatformsForOrg200Response
 */
@JsonTypeName("actions_get_hosted_runners_platforms_for_org_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsGetHostedRunnersPlatformsForOrg200Response {

    private Long totalCount;

    @Valid
    private List<String> platforms = new ArrayList<>();

    public ActionsGetHostedRunnersPlatformsForOrg200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsGetHostedRunnersPlatformsForOrg200Response(Long totalCount, List<String> platforms) {
        this.totalCount = totalCount;
        this.platforms = platforms;
    }

    public ActionsGetHostedRunnersPlatformsForOrg200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get totalCount
     * @return totalCount
     */
    @NotNull
    @Schema(name = "total_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total_count")
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ActionsGetHostedRunnersPlatformsForOrg200Response platforms(List<String> platforms) {
        this.platforms = platforms;
        return this;
    }

    public ActionsGetHostedRunnersPlatformsForOrg200Response addPlatformsItem(String platformsItem) {
        if (this.platforms == null) {
            this.platforms = new ArrayList<>();
        }
        this.platforms.add(platformsItem);
        return this;
    }

    /**
     * Get platforms
     * @return platforms
     */
    @NotNull
    @Schema(name = "platforms", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("platforms")
    public List<String> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<String> platforms) {
        this.platforms = platforms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsGetHostedRunnersPlatformsForOrg200Response actionsGetHostedRunnersPlatformsForOrg200Response =
                (ActionsGetHostedRunnersPlatformsForOrg200Response) o;
        return Objects.equals(this.totalCount, actionsGetHostedRunnersPlatformsForOrg200Response.totalCount)
                && Objects.equals(this.platforms, actionsGetHostedRunnersPlatformsForOrg200Response.platforms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, platforms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsGetHostedRunnersPlatformsForOrg200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
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
