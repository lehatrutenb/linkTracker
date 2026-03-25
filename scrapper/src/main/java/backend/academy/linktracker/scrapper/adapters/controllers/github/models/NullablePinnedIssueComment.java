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
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Context around who pinned an issue comment and when it was pinned.
 */
@Schema(
        name = "nullable-pinned-issue-comment",
        description = "Context around who pinned an issue comment and when it was pinned.")
@JsonTypeName("nullable-pinned-issue-comment")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class NullablePinnedIssueComment {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime pinnedAt;

    private NullableSimpleUser pinnedBy = null;

    public NullablePinnedIssueComment() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public NullablePinnedIssueComment(OffsetDateTime pinnedAt, NullableSimpleUser pinnedBy) {
        this.pinnedAt = pinnedAt;
        this.pinnedBy = pinnedBy;
    }

    public NullablePinnedIssueComment pinnedAt(OffsetDateTime pinnedAt) {
        this.pinnedAt = pinnedAt;
        return this;
    }

    /**
     * Get pinnedAt
     * @return pinnedAt
     */
    @NotNull
    @Valid
    @Schema(name = "pinned_at", example = "2011-04-14T16:00:49Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pinned_at")
    public OffsetDateTime getPinnedAt() {
        return pinnedAt;
    }

    public void setPinnedAt(OffsetDateTime pinnedAt) {
        this.pinnedAt = pinnedAt;
    }

    public NullablePinnedIssueComment pinnedBy(NullableSimpleUser pinnedBy) {
        this.pinnedBy = pinnedBy;
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
    public NullableSimpleUser getPinnedBy() {
        return pinnedBy;
    }

    public void setPinnedBy(NullableSimpleUser pinnedBy) {
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
        NullablePinnedIssueComment nullablePinnedIssueComment = (NullablePinnedIssueComment) o;
        return Objects.equals(this.pinnedAt, nullablePinnedIssueComment.pinnedAt)
                && Objects.equals(this.pinnedBy, nullablePinnedIssueComment.pinnedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pinnedAt, pinnedBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NullablePinnedIssueComment {\n");
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
