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
 * Represents an &#39;issue_body&#39; secret scanning location type. This location type shows that a secret was detected in the body of an issue.
 */
@Schema(
        name = "secret-scanning-location-issue-body",
        description =
                "Represents an 'issue_body' secret scanning location type. This location type shows that a secret was detected in the body of an issue.")
@JsonTypeName("secret-scanning-location-issue-body")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningLocationIssueBody
        implements NullableSecretScanningFirstDetectedLocation, SecretScanningLocationDetails {

    private URI issueBodyUrl;

    public SecretScanningLocationIssueBody() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SecretScanningLocationIssueBody(URI issueBodyUrl) {
        this.issueBodyUrl = issueBodyUrl;
    }

    public SecretScanningLocationIssueBody issueBodyUrl(URI issueBodyUrl) {
        this.issueBodyUrl = issueBodyUrl;
        return this;
    }

    /**
     * The API URL to get the issue where the secret was detected.
     * @return issueBodyUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "issue_body_url",
            example = "https://api.github.com/repos/octocat/Hello-World/issues/1347",
            description = "The API URL to get the issue where the secret was detected.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue_body_url")
    public URI getIssueBodyUrl() {
        return issueBodyUrl;
    }

    public void setIssueBodyUrl(URI issueBodyUrl) {
        this.issueBodyUrl = issueBodyUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretScanningLocationIssueBody secretScanningLocationIssueBody = (SecretScanningLocationIssueBody) o;
        return Objects.equals(this.issueBodyUrl, secretScanningLocationIssueBody.issueBodyUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueBodyUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningLocationIssueBody {\n");
        sb.append("    issueBodyUrl: ").append(toIndentedString(issueBodyUrl)).append("\n");
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
