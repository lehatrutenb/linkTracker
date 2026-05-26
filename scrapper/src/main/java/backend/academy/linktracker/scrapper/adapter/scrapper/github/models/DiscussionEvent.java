package backend.academy.linktracker.scrapper.adapter.scrapper.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.Objects;

/**
 * DiscussionEvent
 */
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DiscussionEvent implements EventPayload {

    private String action;

    private Discussion discussion;

    public DiscussionEvent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DiscussionEvent(String action, Discussion discussion) {
        this.action = action;
        this.discussion = discussion;
    }

    public DiscussionEvent action(String action) {
        this.action = action;
        return this;
    }

    /**
     * Get action
     * @return action
     */
    @NotNull
    @Schema(name = "action", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public DiscussionEvent discussion(Discussion discussion) {
        this.discussion = discussion;
        return this;
    }

    /**
     * Get discussion
     * @return discussion
     */
    @NotNull
    @Valid
    @Schema(name = "discussion", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("discussion")
    public Discussion getDiscussion() {
        return discussion;
    }

    public void setDiscussion(Discussion discussion) {
        this.discussion = discussion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiscussionEvent discussionEvent = (DiscussionEvent) o;
        return Objects.equals(this.action, discussionEvent.action)
                && Objects.equals(this.discussion, discussionEvent.discussion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, discussion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiscussionEvent {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    discussion: ").append(toIndentedString(discussion)).append("\n");
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
