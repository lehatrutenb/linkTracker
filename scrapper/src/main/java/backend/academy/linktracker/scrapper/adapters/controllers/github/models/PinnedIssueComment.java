package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Context around who pinned an issue comment and when it was pinned.
 */
@Schema(
        name = "Pinned_Issue_Comment",
        description = "Context around who pinned an issue comment and when it was pinned.")
@JsonTypeName("Pinned_Issue_Comment")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PinnedIssueComment {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime pinnedAt;

    private JsonNullable<SimpleUser> pinnedBy = JsonNullable.<SimpleUser>undefined();

    public PinnedIssueComment() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PinnedIssueComment(OffsetDateTime pinnedAt, SimpleUser pinnedBy) {
        this.pinnedAt = pinnedAt;
        this.pinnedBy = JsonNullable.of(pinnedBy);
    }

    public PinnedIssueComment pinnedAt(OffsetDateTime pinnedAt) {
        this.pinnedAt = pinnedAt;
        return this;
    }

    /**
     * Get pinnedAt
     * @return pinnedAt
     */
    @NotNull
    @Valid
    @Schema(name = "pinned_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pinned_at")
    public OffsetDateTime getPinnedAt() {
        return pinnedAt;
    }

    public void setPinnedAt(OffsetDateTime pinnedAt) {
        this.pinnedAt = pinnedAt;
    }

    public PinnedIssueComment pinnedBy(SimpleUser pinnedBy) {
        this.pinnedBy = JsonNullable.of(pinnedBy);
        return this;
    }

    /**
     * Get pinnedBy
     * @return pinnedBy
     */
    @NotNull
    @Valid
    @Schema(name = "pinned_by", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pinned_by")
    public JsonNullable<SimpleUser> getPinnedBy() {
        return pinnedBy;
    }

    public void setPinnedBy(JsonNullable<SimpleUser> pinnedBy) {
        this.pinnedBy = pinnedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PinnedIssueComment pinnedIssueComment = (PinnedIssueComment) o;
        return Objects.equals(this.pinnedAt, pinnedIssueComment.pinnedAt)
                && Objects.equals(this.pinnedBy, pinnedIssueComment.pinnedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pinnedAt, pinnedBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PinnedIssueComment {\n");
        sb.append("    pinnedAt: ").append(toIndentedString(pinnedAt)).append("\n");
        sb.append("    pinnedBy: ").append(toIndentedString(pinnedBy)).append("\n");
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
