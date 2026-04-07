package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * RuleSuiteRuleEvaluationsInnerRuleSource
 */
@JsonTypeName("rule_suite_rule_evaluations_inner_rule_source")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RuleSuiteRuleEvaluationsInnerRuleSource {

    private Optional<String> type = Optional.empty();

    private JsonNullable<Long> id = JsonNullable.<Long>undefined();

    private JsonNullable<String> name = JsonNullable.<String>undefined();

    public RuleSuiteRuleEvaluationsInnerRuleSource type(String type) {
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * The type of rule source.
     * @return type
     */
    @Schema(name = "type", description = "The type of rule source.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public Optional<String> getType() {
        return type;
    }

    public void setType(Optional<String> type) {
        this.type = type;
    }

    public RuleSuiteRuleEvaluationsInnerRuleSource id(Long id) {
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * The ID of the rule source.
     * @return id
     */
    @Schema(name = "id", description = "The ID of the rule source.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public JsonNullable<Long> getId() {
        return id;
    }

    public void setId(JsonNullable<Long> id) {
        this.id = id;
    }

    public RuleSuiteRuleEvaluationsInnerRuleSource name(String name) {
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * The name of the rule source.
     * @return name
     */
    @Schema(
            name = "name",
            description = "The name of the rule source.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public JsonNullable<String> getName() {
        return name;
    }

    public void setName(JsonNullable<String> name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuleSuiteRuleEvaluationsInnerRuleSource ruleSuiteRuleEvaluationsInnerRuleSource =
                (RuleSuiteRuleEvaluationsInnerRuleSource) o;
        return Objects.equals(this.type, ruleSuiteRuleEvaluationsInnerRuleSource.type)
                && equalsNullable(this.id, ruleSuiteRuleEvaluationsInnerRuleSource.id)
                && equalsNullable(this.name, ruleSuiteRuleEvaluationsInnerRuleSource.name);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, hashCodeNullable(id), hashCodeNullable(name));
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
        sb.append("class RuleSuiteRuleEvaluationsInnerRuleSource {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
