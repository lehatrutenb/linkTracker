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
 * Represents an &#39;issue_title&#39; secret scanning location type. This location type shows that a secret was detected in the title of an issue.
 */
@Schema(
        name = "secret-scanning-location-issue-title",
        description =
                "Represents an 'issue_title' secret scanning location type. This location type shows that a secret was detected in the title of an issue.")
@JsonTypeName("secret-scanning-location-issue-title")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningLocationIssueTitle
        implements NullableSecretScanningFirstDetectedLocation, SecretScanningLocationDetails {

    private URI issueTitleUrl;

    public SecretScanningLocationIssueTitle() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SecretScanningLocationIssueTitle(URI issueTitleUrl) {
        this.issueTitleUrl = issueTitleUrl;
    }

    public SecretScanningLocationIssueTitle issueTitleUrl(URI issueTitleUrl) {
        this.issueTitleUrl = issueTitleUrl;
        return this;
    }

    /**
     * The API URL to get the issue where the secret was detected.
     * @return issueTitleUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "issue_title_url",
            example = "https://api.github.com/repos/octocat/Hello-World/issues/1347",
            description = "The API URL to get the issue where the secret was detected.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue_title_url")
    public URI getIssueTitleUrl() {
        return issueTitleUrl;
    }

    public void setIssueTitleUrl(URI issueTitleUrl) {
        this.issueTitleUrl = issueTitleUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretScanningLocationIssueTitle secretScanningLocationIssueTitle = (SecretScanningLocationIssueTitle) o;
        return Objects.equals(this.issueTitleUrl, secretScanningLocationIssueTitle.issueTitleUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueTitleUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningLocationIssueTitle {\n");
        sb.append("    issueTitleUrl: ").append(toIndentedString(issueTitleUrl)).append("\n");
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
