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
 * RepositoryRulesetLinks
 */
@JsonTypeName("repository_ruleset__links")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRulesetLinks {

    private Optional<RepositoryRulesetLinksSelf> self = Optional.empty();

    private JsonNullable<RepositoryRulesetLinksHtml> html = JsonNullable.<RepositoryRulesetLinksHtml>undefined();

    public RepositoryRulesetLinks self(RepositoryRulesetLinksSelf self) {
        this.self = Optional.ofNullable(self);
        return this;
    }

    /**
     * Get self
     * @return self
     */
    @Valid
    @Schema(name = "self", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("self")
    public Optional<RepositoryRulesetLinksSelf> getSelf() {
        return self;
    }

    public void setSelf(Optional<RepositoryRulesetLinksSelf> self) {
        this.self = self;
    }

    public RepositoryRulesetLinks html(RepositoryRulesetLinksHtml html) {
        this.html = JsonNullable.of(html);
        return this;
    }

    /**
     * Get html
     * @return html
     */
    @Valid
    @Schema(name = "html", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html")
    public JsonNullable<RepositoryRulesetLinksHtml> getHtml() {
        return html;
    }

    public void setHtml(JsonNullable<RepositoryRulesetLinksHtml> html) {
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
                && equalsNullable(this.html, repositoryRulesetLinks.html);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(self, hashCodeNullable(html));
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
