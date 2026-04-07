package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * TimelineCrossReferencedEventSource
 */
@JsonTypeName("timeline_cross_referenced_event_source")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class TimelineCrossReferencedEventSource {

    private Optional<String> type = Optional.empty();

    private Optional<Issue> issue = Optional.empty();

    public TimelineCrossReferencedEventSource type(String type) {
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public Optional<String> getType() {
        return type;
    }

    public void setType(Optional<String> type) {
        this.type = type;
    }

    public TimelineCrossReferencedEventSource issue(Issue issue) {
        this.issue = Optional.ofNullable(issue);
        return this;
    }

    /**
     * Get issue
     * @return issue
     */
    @Valid
    @Schema(name = "issue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issue")
    public Optional<Issue> getIssue() {
        return issue;
    }

    public void setIssue(Optional<Issue> issue) {
        this.issue = issue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TimelineCrossReferencedEventSource timelineCrossReferencedEventSource = (TimelineCrossReferencedEventSource) o;
        return Objects.equals(this.type, timelineCrossReferencedEventSource.type)
                && Objects.equals(this.issue, timelineCrossReferencedEventSource.issue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, issue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimelineCrossReferencedEventSource {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
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
