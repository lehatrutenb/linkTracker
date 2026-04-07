package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * MemberEvent
 */
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MemberEvent implements EventPayload {

    private String action;

    private SimpleUser1 member;

    public MemberEvent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public MemberEvent(String action, SimpleUser1 member) {
        this.action = action;
        this.member = member;
    }

    public MemberEvent action(String action) {
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

    public MemberEvent member(SimpleUser1 member) {
        this.member = member;
        return this;
    }

    /**
     * Get member
     * @return member
     */
    @NotNull
    @Valid
    @Schema(name = "member", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("member")
    public SimpleUser1 getMember() {
        return member;
    }

    public void setMember(SimpleUser1 member) {
        this.member = member;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MemberEvent memberEvent = (MemberEvent) o;
        return Objects.equals(this.action, memberEvent.action) && Objects.equals(this.member, memberEvent.member);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, member);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemberEvent {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    member: ").append(toIndentedString(member)).append("\n");
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
