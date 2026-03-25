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
 * RepositoryRulesetLinks
 */
@JsonTypeName("repository_ruleset__links")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRulesetLinks {

    private RepositoryRulesetLinksSelf self;

    private RepositoryRulesetLinksHtml html = null;

    public RepositoryRulesetLinks self(RepositoryRulesetLinksSelf self) {
        this.self = self;
        return this;
    }

    /**
     * Get self
     * @return self
     */
    @Valid
    @Schema(name = "self", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("self")
    public RepositoryRulesetLinksSelf getSelf() {
        return self;
    }

    public void setSelf(RepositoryRulesetLinksSelf self) {
        this.self = self;
    }

    public RepositoryRulesetLinks html(RepositoryRulesetLinksHtml html) {
        this.html = html;
        return this;
    }

    /**
     * Get html
     * @return html
     */
    @Valid
    @Schema(name = "html", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html")
    public RepositoryRulesetLinksHtml getHtml() {
        return html;
    }

    public void setHtml(RepositoryRulesetLinksHtml html) {
        this.html = html;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRulesetLinks repositoryRulesetLinks = (RepositoryRulesetLinks) o;
        return Objects.equals(this.self, repositoryRulesetLinks.self)
                && Objects.equals(this.html, repositoryRulesetLinks.html);
    }

    @Override
    public int hashCode() {
        return Objects.hash(self, html);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRulesetLinks {\n");
        sb.append("    self: ").append(toIndentedString(self)).append("\n");
        sb.append("    html: ").append(toIndentedString(html)).append("\n");
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
