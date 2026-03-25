package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Reactions to conversations provide a way to help people express their feelings more simply and effectively.
 */
@Schema(
        name = "reaction",
        description =
                "Reactions to conversations provide a way to help people express their feelings more simply and effectively.")
@JsonTypeName("reaction")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Reaction {

    private Long id;

    private String nodeId;

    private NullableSimpleUser user = null;

    /**
     * The reaction to use
     */
    public enum ContentEnum {
        _1("+1"),

        _12("-1"),

        LAUGH("laugh"),

        CONFUSED("confused"),

        HEART("heart"),

        HOORAY("hooray"),

        ROCKET("rocket"),

        EYES("eyes");

        private final String value;

        ContentEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ContentEnum fromValue(String value) {
            for (ContentEnum b : ContentEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ContentEnum content;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    public Reaction() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Reaction(Long id, String nodeId, NullableSimpleUser user, ContentEnum content, OffsetDateTime createdAt) {
        this.id = id;
        this.nodeId = nodeId;
        this.user = user;
        this.content = content;
        this.createdAt = createdAt;
    }

    public Reaction id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Reaction nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", example = "MDg6UmVhY3Rpb24x", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Reaction user(NullableSimpleUser user) {
        this.user = user;
        return this;
    }

    /**
     * Get user
     * @return user
     */
    @NotNull
    @Valid
    @Schema(name = "user", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("user")
    public NullableSimpleUser getUser() {
        return user;
    }

    public void setUser(NullableSimpleUser user) {
        this.user = user;
    }

    public Reaction content(ContentEnum content) {
        this.content = content;
        return this;
    }

    /**
     * The reaction to use
     * @return content
     */
    @NotNull
    @Schema(
            name = "content",
            example = "heart",
            description = "The reaction to use",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("content")
    public ContentEnum getContent() {
        return content;
    }

    public void setContent(ContentEnum content) {
        this.content = content;
    }

    public Reaction createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", example = "2016-05-20T20:09:31Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Reaction reaction = (Reaction) o;
        return Objects.equals(this.id, reaction.id)
                && Objects.equals(this.nodeId, reaction.nodeId)
                && Objects.equals(this.user, reaction.user)
                && Objects.equals(this.content, reaction.content)
                && Objects.equals(this.createdAt, reaction.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nodeId, user, content, createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Reaction {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
