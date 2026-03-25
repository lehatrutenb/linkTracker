package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * RuleSuiteRequiredStatusChecksChecksInner
 */
@JsonTypeName("rule_suite_required_status_checks_checks_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RuleSuiteRequiredStatusChecksChecksInner {

    private Long id;

    private String context;

    private String state;

    private String type;

    private RuleSuiteRequiredStatusChecksChecksInnerApp app = null;

    public RuleSuiteRequiredStatusChecksChecksInner id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the status check.
     * @return id
     */
    @Schema(
            name = "id",
            description = "The unique identifier of the status check.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RuleSuiteRequiredStatusChecksChecksInner context(String context) {
        this.context = context;
        return this;
    }

    /**
     * The context name of the status check.
     * @return context
     */
    @Schema(
            name = "context",
            description = "The context name of the status check.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("context")
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public RuleSuiteRequiredStatusChecksChecksInner state(String state) {
        this.state = state;
        return this;
    }

    /**
     * The state of the status check.
     * @return state
     */
    @Schema(
            name = "state",
            description = "The state of the status check.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public RuleSuiteRequiredStatusChecksChecksInner type(String type) {
        this.type = type;
        return this;
    }

    /**
     * The type of the status check.
     * @return type
     */
    @Schema(
            name = "type",
            description = "The type of the status check.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RuleSuiteRequiredStatusChecksChecksInner app(RuleSuiteRequiredStatusChecksChecksInnerApp app) {
        this.app = app;
        return this;
    }

    /**
     * Get app
     * @return app
     */
    @Valid
    @Schema(name = "app", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("app")
    public RuleSuiteRequiredStatusChecksChecksInnerApp getApp() {
        return app;
    }

    public void setApp(RuleSuiteRequiredStatusChecksChecksInnerApp app) {
        this.app = app;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuleSuiteRequiredStatusChecksChecksInner ruleSuiteRequiredStatusChecksChecksInner =
                (RuleSuiteRequiredStatusChecksChecksInner) o;
        return Objects.equals(this.id, ruleSuiteRequiredStatusChecksChecksInner.id)
                && Objects.equals(this.context, ruleSuiteRequiredStatusChecksChecksInner.context)
                && Objects.equals(this.state, ruleSuiteRequiredStatusChecksChecksInner.state)
                && Objects.equals(this.type, ruleSuiteRequiredStatusChecksChecksInner.type)
                && Objects.equals(this.app, ruleSuiteRequiredStatusChecksChecksInner.app);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, context, state, type, app);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleSuiteRequiredStatusChecksChecksInner {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
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
