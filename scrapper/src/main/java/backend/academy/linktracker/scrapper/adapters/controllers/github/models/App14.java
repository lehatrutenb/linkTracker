package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are first class actors within GitHub.
 */
@Schema(
        name = "App_14",
        description =
                "GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are first class actors within GitHub.")
@JsonTypeName("App_14")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class App14 {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> createdAt = JsonNullable.<OffsetDateTime>undefined();

    private JsonNullable<String> description = JsonNullable.<String>undefined();

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

        PULL_REQUEST_REVIEW_THREAD("pull_request_review_thread"),

        REMINDER("reminder");

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

    private JsonNullable<URI> externalUrl = JsonNullable.<URI>undefined();

    private URI htmlUrl;

    private JsonNullable<Long> id = JsonNullable.<Long>undefined();

    private String name;

    private String nodeId;

    private JsonNullable<User> owner = JsonNullable.<User>undefined();

    private Optional<AppPermissions> permissions = Optional.empty();

    private Optional<String> slug = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.<OffsetDateTime>undefined();

    public App14() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public App14(
            OffsetDateTime createdAt,
            String description,
            URI externalUrl,
            URI htmlUrl,
            Long id,
            String name,
            String nodeId,
            User owner,
            OffsetDateTime updatedAt) {
        this.createdAt = JsonNullable.of(createdAt);
        this.description = JsonNullable.of(description);
        this.externalUrl = JsonNullable.of(externalUrl);
        this.htmlUrl = htmlUrl;
        this.id = JsonNullable.of(id);
        this.name = name;
        this.nodeId = nodeId;
        this.owner = JsonNullable.of(owner);
        this.updatedAt = JsonNullable.of(updatedAt);
    }

    public App14 createdAt(OffsetDateTime createdAt) {
        this.createdAt = JsonNullable.of(createdAt);
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
    public JsonNullable<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(JsonNullable<OffsetDateTime> createdAt) {
        this.createdAt = createdAt;
    }

    public App14 description(String description) {
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public App14 events(List<EventsEnum> events) {
        this.events = events;
        return this;
    }

    public App14 addEventsItem(EventsEnum eventsItem) {
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

    public App14 externalUrl(URI externalUrl) {
        this.externalUrl = JsonNullable.of(externalUrl);
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
    public JsonNullable<URI> getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(JsonNullable<URI> externalUrl) {
        this.externalUrl = externalUrl;
    }

    public App14 htmlUrl(URI htmlUrl) {
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

    public App14 id(Long id) {
        this.id = JsonNullable.of(id);
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
    public JsonNullable<Long> getId() {
        return id;
    }

    public void setId(JsonNullable<Long> id) {
        this.id = id;
    }

    public App14 name(String name) {
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

    public App14 nodeId(String nodeId) {
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

    public App14 owner(User owner) {
        this.owner = JsonNullable.of(owner);
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
    public JsonNullable<User> getOwner() {
        return owner;
    }

    public void setOwner(JsonNullable<User> owner) {
        this.owner = owner;
    }

    public App14 permissions(AppPermissions permissions) {
        this.permissions = Optional.ofNullable(permissions);
        return this;
    }

    /**
     * Get permissions
     * @return permissions
     */
    @Valid
    @Schema(name = "permissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("permissions")
    public Optional<AppPermissions> getPermissions() {
        return permissions;
    }

    public void setPermissions(Optional<AppPermissions> permissions) {
        this.permissions = permissions;
    }

    public App14 slug(String slug) {
        this.slug = Optional.ofNullable(slug);
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
    public Optional<String> getSlug() {
        return slug;
    }

    public void setSlug(Optional<String> slug) {
        this.slug = slug;
    }

    public App14 updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = JsonNullable.of(updatedAt);
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
    public JsonNullable<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
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
        App14 app14 = (App14) o;
        return Objects.equals(this.createdAt, app14.createdAt)
                && Objects.equals(this.description, app14.description)
                && Objects.equals(this.events, app14.events)
                && Objects.equals(this.externalUrl, app14.externalUrl)
                && Objects.equals(this.htmlUrl, app14.htmlUrl)
                && Objects.equals(this.id, app14.id)
                && Objects.equals(this.name, app14.name)
                && Objects.equals(this.nodeId, app14.nodeId)
                && Objects.equals(this.owner, app14.owner)
                && Objects.equals(this.permissions, app14.permissions)
                && Objects.equals(this.slug, app14.slug)
                && Objects.equals(this.updatedAt, app14.updatedAt);
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
        sb.append("class App14 {\n");
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
