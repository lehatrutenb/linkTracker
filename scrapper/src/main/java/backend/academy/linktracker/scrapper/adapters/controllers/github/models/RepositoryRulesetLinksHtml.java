package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * RepositoryRulesetLinksHtml
 */
@JsonTypeName("repository_ruleset__links_html")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRulesetLinksHtml {

    private Optional<String> href = Optional.empty();

    public RepositoryRulesetLinksHtml href(String href) {
        this.href = Optional.ofNullable(href);
        return this;
    }

    /**
     * The html URL of the ruleset
     * @return href
     */
    @Schema(name = "href", description = "The html URL of the ruleset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("href")
    public Optional<String> getHref() {
        return href;
    }

    public void setHref(Optional<String> href) {
        this.href = href;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRulesetLinksHtml repositoryRulesetLinksHtml = (RepositoryRulesetLinksHtml) o;
        return Objects.equals(this.href, repositoryRulesetLinksHtml.href);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRulesetLinksHtml {\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
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
