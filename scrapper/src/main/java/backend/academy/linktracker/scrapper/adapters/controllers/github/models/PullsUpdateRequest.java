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
 * PullsUpdateRequest
 */
@JsonTypeName("pulls_update_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullsUpdateRequest {

    private String title;

    private String body;

    /**
     * State of this Pull Request. Either `open` or `closed`.
     */
    public enum StateEnum {
        OPEN("open"),

        CLOSED("closed");

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

    private String base;

    private Boolean maintainerCanModify;

    public PullsUpdateRequest title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The title of the pull request.
     * @return title
     */
    @Schema(
            name = "title",
            description = "The title of the pull request.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PullsUpdateRequest body(String body) {
        this.body = body;
        return this;
    }

    /**
     * The contents of the pull request.
     * @return body
     */
    @Schema(
            name = "body",
            description = "The contents of the pull request.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public PullsUpdateRequest state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * State of this Pull Request. Either `open` or `closed`.
     * @return state
     */
    @Schema(
            name = "state",
            description = "State of this Pull Request. Either `open` or `closed`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public PullsUpdateRequest base(String base) {
        this.base = base;
        return this;
    }

    /**
     * The name of the branch you want your changes pulled into. This should be an existing branch on the current repository. You cannot update the base branch on a pull request to point to another repository.
     * @return base
     */
    @Schema(
            name = "base",
            description =
                    "The name of the branch you want your changes pulled into. This should be an existing branch on the current repository. You cannot update the base branch on a pull request to point to another repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("base")
    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public PullsUpdateRequest maintainerCanModify(Boolean maintainerCanModify) {
        this.maintainerCanModify = maintainerCanModify;
        return this;
    }

    /**
     * Indicates whether [maintainers can modify](https://docs.github.com/articles/allowing-changes-to-a-pull-request-branch-created-from-a-fork/) the pull request.
     * @return maintainerCanModify
     */
    @Schema(
            name = "maintainer_can_modify",
            description =
                    "Indicates whether [maintainers can modify](https://docs.github.com/articles/allowing-changes-to-a-pull-request-branch-created-from-a-fork/) the pull request.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("maintainer_can_modify")
    public Boolean getMaintainerCanModify() {
        return maintainerCanModify;
    }

    public void setMaintainerCanModify(Boolean maintainerCanModify) {
        this.maintainerCanModify = maintainerCanModify;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PullsUpdateRequest pullsUpdateRequest = (PullsUpdateRequest) o;
        return Objects.equals(this.title, pullsUpdateRequest.title)
                && Objects.equals(this.body, pullsUpdateRequest.body)
                && Objects.equals(this.state, pullsUpdateRequest.state)
                && Objects.equals(this.base, pullsUpdateRequest.base)
                && Objects.equals(this.maintainerCanModify, pullsUpdateRequest.maintainerCanModify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, body, state, base, maintainerCanModify);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullsUpdateRequest {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    base: ").append(toIndentedString(base)).append("\n");
        sb.append("    maintainerCanModify: ")
                .append(toIndentedString(maintainerCanModify))
                .append("\n");
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
