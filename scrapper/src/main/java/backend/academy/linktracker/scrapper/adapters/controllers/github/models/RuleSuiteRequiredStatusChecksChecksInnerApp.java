package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * The GitHub App associated with the status check.
 */
@Schema(
        name = "rule_suite_required_status_checks_checks_inner_app",
        description = "The GitHub App associated with the status check.")
@JsonTypeName("rule_suite_required_status_checks_checks_inner_app")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RuleSuiteRequiredStatusChecksChecksInnerApp {

    private Long id;

    private String slug;

    private String name;

    public RuleSuiteRequiredStatusChecksChecksInnerApp id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the GitHub App.
     * @return id
     */
    @Schema(
            name = "id",
            description = "The unique identifier of the GitHub App.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RuleSuiteRequiredStatusChecksChecksInnerApp slug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * The slug of the GitHub App.
     * @return slug
     */
    @Schema(name = "slug", description = "The slug of the GitHub App.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public RuleSuiteRequiredStatusChecksChecksInnerApp name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the GitHub App.
     * @return name
     */
    @Schema(name = "name", description = "The name of the GitHub App.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        RuleSuiteRequiredStatusChecksChecksInnerApp ruleSuiteRequiredStatusChecksChecksInnerApp =
                (RuleSuiteRequiredStatusChecksChecksInnerApp) o;
        return Objects.equals(this.id, ruleSuiteRequiredStatusChecksChecksInnerApp.id)
                && Objects.equals(this.slug, ruleSuiteRequiredStatusChecksChecksInnerApp.slug)
                && Objects.equals(this.name, ruleSuiteRequiredStatusChecksChecksInnerApp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, slug, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleSuiteRequiredStatusChecksChecksInnerApp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
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
