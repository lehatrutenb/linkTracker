package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * RuleSuiteRequiredStatusChecksChecksInner
 */
@JsonTypeName("rule_suite_required_status_checks_checks_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RuleSuiteRequiredStatusChecksChecksInner {

    private Optional<Long> id = Optional.empty();

    private Optional<String> context = Optional.empty();

    private Optional<String> state = Optional.empty();

    private Optional<String> type = Optional.empty();

    private JsonNullable<RuleSuiteRequiredStatusChecksChecksInnerApp> app =
            JsonNullable.<RuleSuiteRequiredStatusChecksChecksInnerApp>undefined();

    public RuleSuiteRequiredStatusChecksChecksInner id(Long id) {
        this.id = Optional.ofNullable(id);
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
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public RuleSuiteRequiredStatusChecksChecksInner context(String context) {
        this.context = Optional.ofNullable(context);
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
    public Optional<String> getContext() {
        return context;
    }

    public void setContext(Optional<String> context) {
        this.context = context;
    }

    public RuleSuiteRequiredStatusChecksChecksInner state(String state) {
        this.state = Optional.ofNullable(state);
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
    public Optional<String> getState() {
        return state;
    }

    public void setState(Optional<String> state) {
        this.state = state;
    }

    public RuleSuiteRequiredStatusChecksChecksInner type(String type) {
        this.type = Optional.ofNullable(type);
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
    public Optional<String> getType() {
        return type;
    }

    public void setType(Optional<String> type) {
        this.type = type;
    }

    public RuleSuiteRequiredStatusChecksChecksInner app(RuleSuiteRequiredStatusChecksChecksInnerApp app) {
        this.app = JsonNullable.of(app);
        return this;
    }

    /**
     * Get app
     * @return app
     */
    @Valid
    @Schema(name = "app", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("app")
    public JsonNullable<RuleSuiteRequiredStatusChecksChecksInnerApp> getApp() {
        return app;
    }

    public void setApp(JsonNullable<RuleSuiteRequiredStatusChecksChecksInnerApp> app) {
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
                && equalsNullable(this.app, ruleSuiteRequiredStatusChecksChecksInner.app);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, context, state, type, hashCodeNullable(app));
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
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
