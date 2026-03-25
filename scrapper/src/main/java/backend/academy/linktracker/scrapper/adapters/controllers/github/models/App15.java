package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are first class actors within GitHub.
 */
@Schema(
        name = "App_15",
        description =
                "GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are first class actors within GitHub.")
@JsonTypeName("App_15")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class App15 {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt = null;

    private String description = null;

    /**
     * Gets or Sets events
     */
    public enum EventsEnum {
        BRANCH_PROTECTION_RULE("branch_protection_rule"),

        CHECK_RUN("check_run"),

        CHECK_SUITE("check_suite"),

        CODE_SCANNING_ALERT("code_scanning_alert"),

        COMMIT_COMMENT("commit_comment"),

        CONTENT_REFERENCE("content_reference"),

        CREATE("create"),

        DELETE("delete"),

        DEPLOYMENT("deployment"),

        DEPLOYMENT_REVIEW("deployment_review"),

        DEPLOYMENT_STATUS("deployment_status"),

        DEPLOY_KEY("deploy_key"),

        DISCUSSION("discussion"),

        DISCUSSION_COMMENT("discussion_comment"),

        FORK("fork"),

        GOLLUM("gollum"),

        ISSUES("issues"),

        ISSUE_COMMENT("issue_comment"),

        LABEL("label"),

        MEMBER("member"),

        MEMBERSHIP("membership"),

        MILESTONE("milestone"),

        ORGANIZATION("organization"),

        ORG_BLOCK("org_block"),

        PAGE_BUILD("page_build"),

        PROJECT("project"),

        PROJECT_CARD("project_card"),

        PROJECT_COLUMN("project_column"),

        PUBLIC("public"),

        PULL_REQUEST("pull_request"),

        PULL_REQUEST_REVIEW("pull_request_review"),

        PULL_REQUEST_REVIEW_COMMENT("pull_request_review_comment"),

        PUSH("push"),

        REGISTRY_PACKAGE("registry_package"),

        RELEASE("release"),

        REPOSITORY("repository"),

        REPOSITORY_DISPATCH("repository_dispatch"),

        SECRET_SCANNING_ALERT("secret_scanning_alert"),

        STAR("star"),

        STATUS("status"),

        TEAM("team"),

        TEAM_ADD("team_add"),

        WATCH("watch"),

        WORKFLOW_DISPATCH("workflow_dispatch"),

        WORKFLOW_RUN("workflow_run"),

        REMINDER("reminder"),

        SECURITY_AND_ANALYSIS("security_and_analysis");

        private final String value;

        EventsEnum(String value) {
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
        public static EventsEnum fromValue(String value) {
            for (EventsEnum b : EventsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @Valid
    private List<EventsEnum> events = new ArrayList<>();

    private URI externalUrl = null;

    private URI htmlUrl;

    private Long id = null;

    private String name;

    private String nodeId;

    private User owner = null;

    private App1Permissions permissions;

    private String slug;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt = null;

    public App15() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public App15(
            OffsetDateTime createdAt,
            String description,
            URI externalUrl,
            URI htmlUrl,
            Long id,
            String name,
            String nodeId,
            User owner,
            OffsetDateTime updatedAt) {
        this.createdAt = createdAt;
        this.description = description;
        this.externalUrl = externalUrl;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.name = name;
        this.nodeId = nodeId;
        this.owner = owner;
        this.updatedAt = updatedAt;
    }

    public App15 createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public App15 description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public App15 events(List<EventsEnum> events) {
        this.events = events;
        return this;
    }

    public App15 addEventsItem(EventsEnum eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    /**
     * The list of events for the GitHub app
     * @return events
     */
    @Schema(
            name = "events",
            description = "The list of events for the GitHub app",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("events")
    public List<EventsEnum> getEvents() {
        return events;
    }

    public void setEvents(List<EventsEnum> events) {
        this.events = events;
    }

    public App15 externalUrl(URI externalUrl) {
        this.externalUrl = externalUrl;
        return this;
    }

    /**
     * Get externalUrl
     * @return externalUrl
     */
    @NotNull
    @Valid
    @Schema(name = "external_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("external_url")
    public URI getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(URI externalUrl) {
        this.externalUrl = externalUrl;
    }

    public App15 htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public App15 id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the GitHub app
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            description = "Unique identifier of the GitHub app",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public App15 name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the GitHub app
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "The name of the GitHub app", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public App15 nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public App15 owner(User owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    @NotNull
    @Valid
    @Schema(name = "owner", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("owner")
    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public App15 permissions(App1Permissions permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get permissions
     * @return permissions
     */
    @Valid
    @Schema(name = "permissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("permissions")
    public App1Permissions getPermissions() {
        return permissions;
    }

    public void setPermissions(App1Permissions permissions) {
        this.permissions = permissions;
    }

    public App15 slug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * The slug name of the GitHub app
     * @return slug
     */
    @Schema(
            name = "slug",
            description = "The slug name of the GitHub app",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public App15 updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        App15 app15 = (App15) o;
        return Objects.equals(this.createdAt, app15.createdAt)
                && Objects.equals(this.description, app15.description)
                && Objects.equals(this.events, app15.events)
                && Objects.equals(this.externalUrl, app15.externalUrl)
                && Objects.equals(this.htmlUrl, app15.htmlUrl)
                && Objects.equals(this.id, app15.id)
                && Objects.equals(this.name, app15.name)
                && Objects.equals(this.nodeId, app15.nodeId)
                && Objects.equals(this.owner, app15.owner)
                && Objects.equals(this.permissions, app15.permissions)
                && Objects.equals(this.slug, app15.slug)
                && Objects.equals(this.updatedAt, app15.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                createdAt,
                description,
                events,
                externalUrl,
                htmlUrl,
                id,
                name,
                nodeId,
                owner,
                permissions,
                slug,
                updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class App15 {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
