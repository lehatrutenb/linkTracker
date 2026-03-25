package backend.academy.linktracker.scrapper.adapters.controllers.stackoverflow.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A notice applied to a question.
 */
@Schema(name = "Notice", description = "A notice applied to a question.")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-24T12:15:15.683209678Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Notice {

    private String body;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime creationDate;

    private Long ownerUserId;

    public Notice body(String body) {
        this.body = body;
        return this;
    }

    /**
     * Get body
     * @return body
     */
    @Schema(name = "body", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Notice creationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * Get creationDate
     * @return creationDate
     */
    @Valid
    @Schema(name = "creation_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("creation_date")
    public OffsetDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Notice ownerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId;
        return this;
    }

    /**
     * The user ID of the notice owner, if any.
     * @return ownerUserId
     */
    @Schema(
            name = "owner_user_id",
            description = "The user ID of the notice owner, if any.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("owner_user_id")
    public Long getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Notice notice = (Notice) o;
        return Objects.equals(this.body, notice.body)
                && Objects.equals(this.creationDate, notice.creationDate)
                && Objects.equals(this.ownerUserId, notice.ownerUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, creationDate, ownerUserId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Notice {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    ownerUserId: ").append(toIndentedString(ownerUserId)).append("\n");
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
