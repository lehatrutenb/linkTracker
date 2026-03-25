package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The deleted webhook. This will contain different keys based on the type of webhook it is: repository, organization, business, app, or GitHub Marketplace.
 */
@Schema(
        name = "webhook_meta_deleted_hook",
        description =
                "The deleted webhook. This will contain different keys based on the type of webhook it is: repository, organization, business, app, or GitHub Marketplace.")
@JsonTypeName("webhook_meta_deleted_hook")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookMetaDeletedHook {

    private Boolean active;

    private WebhookMetaDeletedHookConfig config;

    private String createdAt;

    /**
     * Gets or Sets events
     */
    public enum EventsEnum {
        STAR("*"),

        BRANCH_PROTECTION_RULE("branch_protection_rule"),

        CHECK_RUN("check_run"),

        CHECK_SUITE("check_suite"),

        CODE_SCANNING_ALERT("code_scanning_alert"),

        COMMIT_COMMENT("commit_comment"),

        CREATE("create"),

        DELETE("delete"),

        DEPLOYMENT("deployment"),

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

        META("meta"),

        MILESTONE("milestone"),

        ORGANIZATION("organization"),

        ORG_BLOCK("org_block"),

        PACKAGE("package"),

        PAGE_BUILD("page_build"),

        PROJECT("project"),

        PROJECT_CARD("project_card"),

        PROJECT_COLUMN("project_column"),

        PUBLIC("public"),

        PULL_REQUEST("pull_request"),

        PULL_REQUEST_REVIEW("pull_request_review"),

        PULL_REQUEST_REVIEW_COMMENT("pull_request_review_comment"),

        PULL_REQUEST_REVIEW_THREAD("pull_request_review_thread"),

        PUSH("push"),

        REGISTRY_PACKAGE("registry_package"),

        RELEASE("release"),

        REPOSITORY("repository"),

        REPOSITORY_IMPORT("repository_import"),

        REPOSITORY_VULNERABILITY_ALERT("repository_vulnerability_alert"),

        SECRET_SCANNING_ALERT("secret_scanning_alert"),

        SECRET_SCANNING_ALERT_LOCATION("secret_scanning_alert_location"),

        SECURITY_AND_ANALYSIS("security_and_analysis"),

        STAR2("star"),

        STATUS("status"),

        TEAM("team"),

        TEAM_ADD("team_add"),

        WATCH("watch"),

        WORKFLOW_JOB("workflow_job"),

        WORKFLOW_RUN("workflow_run"),

        REPOSITORY_DISPATCH("repository_dispatch"),

        PROJECTS_V2_ITEM("projects_v2_item");

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

    private Long id;

    private String name;

    private String type;

    private String updatedAt;

    public WebhookMetaDeletedHook() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookMetaDeletedHook(
            Boolean active,
            WebhookMetaDeletedHookConfig config,
            String createdAt,
            List<EventsEnum> events,
            Long id,
            String name,
            String type,
            String updatedAt) {
        this.active = active;
        this.config = config;
        this.createdAt = createdAt;
        this.events = events;
        this.id = id;
        this.name = name;
        this.type = type;
        this.updatedAt = updatedAt;
    }

    public WebhookMetaDeletedHook active(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Get active
     * @return active
     */
    @NotNull
    @Schema(name = "active", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public WebhookMetaDeletedHook config(WebhookMetaDeletedHookConfig config) {
        this.config = config;
        return this;
    }

    /**
     * Get config
     * @return config
     */
    @NotNull
    @Valid
    @Schema(name = "config", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("config")
    public WebhookMetaDeletedHookConfig getConfig() {
        return config;
    }

    public void setConfig(WebhookMetaDeletedHookConfig config) {
        this.config = config;
    }

    public WebhookMetaDeletedHook createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public WebhookMetaDeletedHook events(List<EventsEnum> events) {
        this.events = events;
        return this;
    }

    public WebhookMetaDeletedHook addEventsItem(EventsEnum eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    /**
     *
     * @return events
     */
    @NotNull
    @Schema(name = "events", description = "", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("events")
    public List<EventsEnum> getEvents() {
        return events;
    }

    public void setEvents(List<EventsEnum> events) {
        this.events = events;
    }

    public WebhookMetaDeletedHook id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WebhookMetaDeletedHook name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebhookMetaDeletedHook type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WebhookMetaDeletedHook updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
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
        WebhookMetaDeletedHook webhookMetaDeletedHook = (WebhookMetaDeletedHook) o;
        return Objects.equals(this.active, webhookMetaDeletedHook.active)
                && Objects.equals(this.config, webhookMetaDeletedHook.config)
                && Objects.equals(this.createdAt, webhookMetaDeletedHook.createdAt)
                && Objects.equals(this.events, webhookMetaDeletedHook.events)
                && Objects.equals(this.id, webhookMetaDeletedHook.id)
                && Objects.equals(this.name, webhookMetaDeletedHook.name)
                && Objects.equals(this.type, webhookMetaDeletedHook.type)
                && Objects.equals(this.updatedAt, webhookMetaDeletedHook.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(active, config, createdAt, events, id, name, type, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookMetaDeletedHook {\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
