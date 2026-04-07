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
 * Represents a &#39;discussion_title&#39; secret scanning location type. This location type shows that a secret was detected in the title of a discussion.
 */
@Schema(
        name = "secret-scanning-location-discussion-title",
        description =
                "Represents a 'discussion_title' secret scanning location type. This location type shows that a secret was detected in the title of a discussion.")
@JsonTypeName("secret-scanning-location-discussion-title")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningLocationDiscussionTitle
        implements NullableSecretScanningFirstDetectedLocation, SecretScanningLocationDetails {

    private URI discussionTitleUrl;

    public SecretScanningLocationDiscussionTitle() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SecretScanningLocationDiscussionTitle(URI discussionTitleUrl) {
        this.discussionTitleUrl = discussionTitleUrl;
    }

    public SecretScanningLocationDiscussionTitle discussionTitleUrl(URI discussionTitleUrl) {
        this.discussionTitleUrl = discussionTitleUrl;
        return this;
    }

    /**
     * The URL to the discussion where the secret was detected.
     * @return discussionTitleUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "discussion_title_url",
            example = "https://github.com/community/community/discussions/39082",
            description = "The URL to the discussion where the secret was detected.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("discussion_title_url")
    public URI getDiscussionTitleUrl() {
        return discussionTitleUrl;
    }

    public void setDiscussionTitleUrl(URI discussionTitleUrl) {
        this.discussionTitleUrl = discussionTitleUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretScanningLocationDiscussionTitle secretScanningLocationDiscussionTitle =
                (SecretScanningLocationDiscussionTitle) o;
        return Objects.equals(this.discussionTitleUrl, secretScanningLocationDiscussionTitle.discussionTitleUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discussionTitleUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningLocationDiscussionTitle {\n");
        sb.append("    discussionTitleUrl: ")
                .append(toIndentedString(discussionTitleUrl))
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
