package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;

/**
 * Represents a &#39;discussion_body&#39; secret scanning location type. This location type shows that a secret was detected in the body of a discussion.
 */
@Schema(
        name = "secret-scanning-location-discussion-body",
        description =
                "Represents a 'discussion_body' secret scanning location type. This location type shows that a secret was detected in the body of a discussion.")
@JsonTypeName("secret-scanning-location-discussion-body")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningLocationDiscussionBody
        implements NullableSecretScanningFirstDetectedLocation, SecretScanningLocationDetails {

    private URI discussionBodyUrl;

    public SecretScanningLocationDiscussionBody() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SecretScanningLocationDiscussionBody(URI discussionBodyUrl) {
        this.discussionBodyUrl = discussionBodyUrl;
    }

    public SecretScanningLocationDiscussionBody discussionBodyUrl(URI discussionBodyUrl) {
        this.discussionBodyUrl = discussionBodyUrl;
        return this;
    }

    /**
     * The URL to the discussion where the secret was detected.
     * @return discussionBodyUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "discussion_body_url",
            example = "https://github.com/community/community/discussions/39082#discussion-4566270",
            description = "The URL to the discussion where the secret was detected.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("discussion_body_url")
    public URI getDiscussionBodyUrl() {
        return discussionBodyUrl;
    }

    public void setDiscussionBodyUrl(URI discussionBodyUrl) {
        this.discussionBodyUrl = discussionBodyUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretScanningLocationDiscussionBody secretScanningLocationDiscussionBody =
                (SecretScanningLocationDiscussionBody) o;
        return Objects.equals(this.discussionBodyUrl, secretScanningLocationDiscussionBody.discussionBodyUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discussionBodyUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningLocationDiscussionBody {\n");
        sb.append("    discussionBodyUrl: ")
                .append(toIndentedString(discussionBodyUrl))
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
