package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * PushEvent
 */
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PushEvent implements EventPayload {

    private Long repositoryId;

    private Long pushId;

    private String ref;

    private String head;

    private String before;

    public PushEvent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PushEvent(Long repositoryId, Long pushId, String ref, String head, String before) {
        this.repositoryId = repositoryId;
        this.pushId = pushId;
        this.ref = ref;
        this.head = head;
        this.before = before;
    }

    public PushEvent repositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * Get repositoryId
     * @return repositoryId
     */
    @NotNull
    @Schema(name = "repository_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_id")
    public Long getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
    }

    public PushEvent pushId(Long pushId) {
        this.pushId = pushId;
        return this;
    }

    /**
     * Get pushId
     * @return pushId
     */
    @NotNull
    @Schema(name = "push_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("push_id")
    public Long getPushId() {
        return pushId;
    }

    public void setPushId(Long pushId) {
        this.pushId = pushId;
    }

    public PushEvent ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * Get ref
     * @return ref
     */
    @NotNull
    @Schema(name = "ref", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public PushEvent head(String head) {
        this.head = head;
        return this;
    }

    /**
     * Get head
     * @return head
     */
    @NotNull
    @Schema(name = "head", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head")
    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public PushEvent before(String before) {
        this.before = before;
        return this;
    }

    /**
     * Get before
     * @return before
     */
    @NotNull
    @Schema(name = "before", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("before")
    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PushEvent pushEvent = (PushEvent) o;
        return Objects.equals(this.repositoryId, pushEvent.repositoryId)
                && Objects.equals(this.pushId, pushEvent.pushId)
                && Objects.equals(this.ref, pushEvent.ref)
                && Objects.equals(this.head, pushEvent.head)
                && Objects.equals(this.before, pushEvent.before);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, pushId, ref, head, before);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PushEvent {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    pushId: ").append(toIndentedString(pushId)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    head: ").append(toIndentedString(head)).append("\n");
        sb.append("    before: ").append(toIndentedString(before)).append("\n");
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
