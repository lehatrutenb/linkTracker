package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * RuleSuiteRuleEvaluationsInnerRuleSource
 */
@JsonTypeName("rule_suite_rule_evaluations_inner_rule_source")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RuleSuiteRuleEvaluationsInnerRuleSource {

    private String type;

    private Long id = null;

    private String name = null;

    public RuleSuiteRuleEvaluationsInnerRuleSource type(String type) {
        this.type = type;
        return this;
    }

    /**
     * The type of rule source.
     * @return type
     */
    @Schema(name = "type", description = "The type of rule source.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RuleSuiteRuleEvaluationsInnerRuleSource id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the rule source.
     * @return id
     */
    @Schema(name = "id", description = "The ID of the rule source.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RuleSuiteRuleEvaluationsInnerRuleSource name(String name) {
        this.name = name;
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
    public String getName() {
        return name;
    }

    public void setName(String name) {
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
                && Objects.equals(this.id, ruleSuiteRuleEvaluationsInnerRuleSource.id)
                && Objects.equals(this.name, ruleSuiteRuleEvaluationsInnerRuleSource.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, name);
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
