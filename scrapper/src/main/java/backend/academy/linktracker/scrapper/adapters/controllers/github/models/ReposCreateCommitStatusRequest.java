package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ReposCreateCommitStatusRequest
 */
@JsonTypeName("repos_create_commit_status_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreateCommitStatusRequest {

    /**
     * The state of the status.
     */
    public enum StateEnum {
        ERROR("error"),

        FAILURE("failure"),

        PENDING("pending"),

        SUCCESS("success");

        private final String value;

        StateEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StateEnum fromValue(String value) {
            for (StateEnum b : StateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private StateEnum state;

    private String targetUrl = null;

    private String description = null;

    private String context = "default";

    public ReposCreateCommitStatusRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposCreateCommitStatusRequest(StateEnum state) {
        this.state = state;
    }

    public ReposCreateCommitStatusRequest state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * The state of the status.
     * @return state
     */
    @NotNull
    @Schema(name = "state", description = "The state of the status.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ReposCreateCommitStatusRequest targetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
        return this;
    }

    /**
     * The target URL to associate with this status. This URL will be linked from the GitHub UI to allow users to easily see the source of the status.   For example, if your continuous integration system is posting build status, you would want to provide the deep link for the build output for this specific SHA:   `http://ci.example.com/user/repo/build/sha`
     * @return targetUrl
     */
    @Schema(
            name = "target_url",
            description =
                    "The target URL to associate with this status. This URL will be linked from the GitHub UI to allow users to easily see the source of the status.   For example, if your continuous integration system is posting build status, you would want to provide the deep link for the build output for this specific SHA:   `http://ci.example.com/user/repo/build/sha`",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("target_url")
    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    public ReposCreateCommitStatusRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A short description of the status.
     * @return description
     */
    @Schema(
            name = "description",
            description = "A short description of the status.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ReposCreateCommitStatusRequest context(String context) {
        this.context = context;
        return this;
    }

    /**
     * A string label to differentiate this status from the status of other systems. This field is case-insensitive.
     * @return context
     */
    @Schema(
            name = "context",
            description =
                    "A string label to differentiate this status from the status of other systems. This field is case-insensitive.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("context")
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposCreateCommitStatusRequest reposCreateCommitStatusRequest = (ReposCreateCommitStatusRequest) o;
        return Objects.equals(this.state, reposCreateCommitStatusRequest.state)
                && Objects.equals(this.targetUrl, reposCreateCommitStatusRequest.targetUrl)
                && Objects.equals(this.description, reposCreateCommitStatusRequest.description)
                && Objects.equals(this.context, reposCreateCommitStatusRequest.context);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, targetUrl, description, context);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposCreateCommitStatusRequest {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
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
