package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * RenamedIssueEventRename
 */
@JsonTypeName("renamed_issue_event_rename")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RenamedIssueEventRename {

    private String from;

    private String to;

    public RenamedIssueEventRename() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RenamedIssueEventRename(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public RenamedIssueEventRename from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Get from
     * @return from
     */
    @NotNull
    @Schema(name = "from", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public RenamedIssueEventRename to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Get to
     * @return to
     */
    @NotNull
    @Schema(name = "to", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RenamedIssueEventRename renamedIssueEventRename = (RenamedIssueEventRename) o;
        return Objects.equals(this.from, renamedIssueEventRename.from)
                && Objects.equals(this.to, renamedIssueEventRename.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RenamedIssueEventRename {\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
