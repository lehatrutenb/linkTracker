package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SelectedActions
 */
@JsonTypeName("selected-actions")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SelectedActions {

    private Boolean githubOwnedAllowed;

    private Boolean verifiedAllowed;

    @Valid
    private List<String> patternsAllowed = new ArrayList<>();

    public SelectedActions githubOwnedAllowed(Boolean githubOwnedAllowed) {
        this.githubOwnedAllowed = githubOwnedAllowed;
        return this;
    }

    /**
     * Whether GitHub-owned actions are allowed. For example, this includes the actions in the `actions` organization.
     * @return githubOwnedAllowed
     */
    @Schema(
            name = "github_owned_allowed",
            description =
                    "Whether GitHub-owned actions are allowed. For example, this includes the actions in the `actions` organization.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("github_owned_allowed")
    public Boolean getGithubOwnedAllowed() {
        return githubOwnedAllowed;
    }

    public void setGithubOwnedAllowed(Boolean githubOwnedAllowed) {
        this.githubOwnedAllowed = githubOwnedAllowed;
    }

    public SelectedActions verifiedAllowed(Boolean verifiedAllowed) {
        this.verifiedAllowed = verifiedAllowed;
        return this;
    }

    /**
     * Whether actions from GitHub Marketplace verified creators are allowed. Set to `true` to allow all actions by GitHub Marketplace verified creators.
     * @return verifiedAllowed
     */
    @Schema(
            name = "verified_allowed",
            description =
                    "Whether actions from GitHub Marketplace verified creators are allowed. Set to `true` to allow all actions by GitHub Marketplace verified creators.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("verified_allowed")
    public Boolean getVerifiedAllowed() {
        return verifiedAllowed;
    }

    public void setVerifiedAllowed(Boolean verifiedAllowed) {
        this.verifiedAllowed = verifiedAllowed;
    }

    public SelectedActions patternsAllowed(List<String> patternsAllowed) {
        this.patternsAllowed = patternsAllowed;
        return this;
    }

    public SelectedActions addPatternsAllowedItem(String patternsAllowedItem) {
        if (this.patternsAllowed == null) {
            this.patternsAllowed = new ArrayList<>();
        }
        this.patternsAllowed.add(patternsAllowedItem);
        return this;
    }

    /**
     * Specifies a list of string-matching patterns to allow specific action(s) and reusable workflow(s). Wildcards, tags, and SHAs are allowed. For example, `monalisa/octocat@*`, `monalisa/octocat@v2`, `monalisa/_*`.  > [!NOTE] > The `patterns_allowed` setting only applies to public repositories.
     * @return patternsAllowed
     */
    @Schema(
            name = "patterns_allowed",
            description =
                    "Specifies a list of string-matching patterns to allow specific action(s) and reusable workflow(s). Wildcards, tags, and SHAs are allowed. For example, `monalisa/octocat@*`, `monalisa/octocat@v2`, `monalisa/_*`.  > [!NOTE] > The `patterns_allowed` setting only applies to public repositories.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("patterns_allowed")
    public List<String> getPatternsAllowed() {
        return patternsAllowed;
    }

    public void setPatternsAllowed(List<String> patternsAllowed) {
        this.patternsAllowed = patternsAllowed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SelectedActions selectedActions = (SelectedActions) o;
        return Objects.equals(this.githubOwnedAllowed, selectedActions.githubOwnedAllowed)
                && Objects.equals(this.verifiedAllowed, selectedActions.verifiedAllowed)
                && Objects.equals(this.patternsAllowed, selectedActions.patternsAllowed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(githubOwnedAllowed, verifiedAllowed, patternsAllowed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SelectedActions {\n");
        sb.append("    githubOwnedAllowed: ")
                .append(toIndentedString(githubOwnedAllowed))
                .append("\n");
        sb.append("    verifiedAllowed: ")
                .append(toIndentedString(verifiedAllowed))
                .append("\n");
        sb.append("    patternsAllowed: ")
                .append(toIndentedString(patternsAllowed))
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
