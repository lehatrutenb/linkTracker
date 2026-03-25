package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * BranchWithProtectionLinks
 */
@JsonTypeName("branch_with_protection__links")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class BranchWithProtectionLinks {

    private String html;

    private URI self;

    public BranchWithProtectionLinks() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public BranchWithProtectionLinks(String html, URI self) {
        this.html = html;
        this.self = self;
    }

    public BranchWithProtectionLinks html(String html) {
        this.html = html;
        return this;
    }

    /**
     * Get html
     * @return html
     */
    @NotNull
    @Schema(name = "html", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html")
    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public BranchWithProtectionLinks self(URI self) {
        this.self = self;
        return this;
    }

    /**
     * Get self
     * @return self
     */
    @NotNull
    @Valid
    @Schema(name = "self", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("self")
    public URI getSelf() {
        return self;
    }

    public void setSelf(URI self) {
        this.self = self;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BranchWithProtectionLinks branchWithProtectionLinks = (BranchWithProtectionLinks) o;
        return Objects.equals(this.html, branchWithProtectionLinks.html)
                && Objects.equals(this.self, branchWithProtectionLinks.self);
    }

    @Override
    public int hashCode() {
        return Objects.hash(html, self);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BranchWithProtectionLinks {\n");
        sb.append("    html: ").append(toIndentedString(html)).append("\n");
        sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
