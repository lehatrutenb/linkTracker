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
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * WebhookDeploymentStatusCreatedCheckRun
 */
@JsonTypeName("webhook_deployment_status_created_check_run")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookDeploymentStatusCreatedCheckRun {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime completedAt = null;

    /**
     * The result of the completed check run. This value will be `null` until the check run has completed.
     */
    public enum ConclusionEnum {
        SUCCESS("success"),

        FAILURE("failure"),

        NEUTRAL("neutral"),

        CANCELLED("cancelled"),

        TIMED_OUT("timed_out"),

        ACTION_REQUIRED("action_required"),

        STALE("stale"),

        SKIPPED("skipped");

        private final String value;

        ConclusionEnum(String value) {
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
        public static ConclusionEnum fromValue(String value) {
            for (ConclusionEnum b : ConclusionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }

    private ConclusionEnum conclusion = null;

    private URI detailsUrl;

    private String externalId;

    private String headSha;

    private URI htmlUrl;

    private Long id;

    private String name;

    private String nodeId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime startedAt;

    /**
     * The current status of the check run. Can be `queued`, `in_progress`, or `completed`.
     */
    public enum StatusEnum {
        QUEUED("queued"),

        IN_PROGRESS("in_progress"),

        COMPLETED("completed"),

        WAITING("waiting"),

        PENDING("pending");

        private final String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private StatusEnum status;

    private URI url;

    public WebhookDeploymentStatusCreatedCheckRun() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookDeploymentStatusCreatedCheckRun(
            OffsetDateTime completedAt,
            ConclusionEnum conclusion,
            URI detailsUrl,
            String externalId,
            String headSha,
            URI htmlUrl,
            Long id,
            String name,
            String nodeId,
            OffsetDateTime startedAt,
            StatusEnum status,
            URI url) {
        this.completedAt = completedAt;
        this.conclusion = conclusion;
        this.detailsUrl = detailsUrl;
        this.externalId = externalId;
        this.headSha = headSha;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.name = name;
        this.nodeId = nodeId;
        this.startedAt = startedAt;
        this.status = status;
        this.url = url;
    }

    public WebhookDeploymentStatusCreatedCheckRun completedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     * Get completedAt
     * @return completedAt
     */
    @NotNull
    @Valid
    @Schema(name = "completed_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("completed_at")
    public OffsetDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
    }

    public WebhookDeploymentStatusCreatedCheckRun conclusion(ConclusionEnum conclusion) {
        this.conclusion = conclusion;
        return this;
    }

    /**
     * The result of the completed check run. This value will be `null` until the check run has completed.
     * @return conclusion
     */
    @NotNull
    @Schema(
            name = "conclusion",
            description =
                    "The result of the completed check run. This value will be `null` until the check run has completed.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("conclusion")
    public ConclusionEnum getConclusion() {
        return conclusion;
    }

    public void setConclusion(ConclusionEnum conclusion) {
        this.conclusion = conclusion;
    }

    public WebhookDeploymentStatusCreatedCheckRun detailsUrl(URI detailsUrl) {
        this.detailsUrl = detailsUrl;
        return this;
    }

    /**
     * Get detailsUrl
     * @return detailsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "details_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("details_url")
    public URI getDetailsUrl() {
        return detailsUrl;
    }

    public void setDetailsUrl(URI detailsUrl) {
        this.detailsUrl = detailsUrl;
    }

    public WebhookDeploymentStatusCreatedCheckRun externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * Get externalId
     * @return externalId
     */
    @NotNull
    @Schema(name = "external_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("external_id")
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public WebhookDeploymentStatusCreatedCheckRun headSha(String headSha) {
        this.headSha = headSha;
        return this;
    }

    /**
     * The SHA of the commit that is being checked.
     * @return headSha
     */
    @NotNull
    @Schema(
            name = "head_sha",
            description = "The SHA of the commit that is being checked.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head_sha")
    public String getHeadSha() {
        return headSha;
    }

    public void setHeadSha(String headSha) {
        this.headSha = headSha;
    }

    public WebhookDeploymentStatusCreatedCheckRun htmlUrl(URI htmlUrl) {
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

    public WebhookDeploymentStatusCreatedCheckRun id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the check.
     * @return id
     */
    @NotNull
    @Schema(name = "id", description = "The id of the check.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WebhookDeploymentStatusCreatedCheckRun name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the check run.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "The name of the check run.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebhookDeploymentStatusCreatedCheckRun nodeId(String nodeId) {
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

    public WebhookDeploymentStatusCreatedCheckRun startedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * Get startedAt
     * @return startedAt
     */
    @NotNull
    @Valid
    @Schema(name = "started_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("started_at")
    public OffsetDateTime getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
    }

    public WebhookDeploymentStatusCreatedCheckRun status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The current status of the check run. Can be `queued`, `in_progress`, or `completed`.
     * @return status
     */
    @NotNull
    @Schema(
            name = "status",
            description = "The current status of the check run. Can be `queued`, `in_progress`, or `completed`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public WebhookDeploymentStatusCreatedCheckRun url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookDeploymentStatusCreatedCheckRun webhookDeploymentStatusCreatedCheckRun =
                (WebhookDeploymentStatusCreatedCheckRun) o;
        return Objects.equals(this.completedAt, webhookDeploymentStatusCreatedCheckRun.completedAt)
                && Objects.equals(this.conclusion, webhookDeploymentStatusCreatedCheckRun.conclusion)
                && Objects.equals(this.detailsUrl, webhookDeploymentStatusCreatedCheckRun.detailsUrl)
                && Objects.equals(this.externalId, webhookDeploymentStatusCreatedCheckRun.externalId)
                && Objects.equals(this.headSha, webhookDeploymentStatusCreatedCheckRun.headSha)
                && Objects.equals(this.htmlUrl, webhookDeploymentStatusCreatedCheckRun.htmlUrl)
                && Objects.equals(this.id, webhookDeploymentStatusCreatedCheckRun.id)
                && Objects.equals(this.name, webhookDeploymentStatusCreatedCheckRun.name)
                && Objects.equals(this.nodeId, webhookDeploymentStatusCreatedCheckRun.nodeId)
                && Objects.equals(this.startedAt, webhookDeploymentStatusCreatedCheckRun.startedAt)
                && Objects.equals(this.status, webhookDeploymentStatusCreatedCheckRun.status)
                && Objects.equals(this.url, webhookDeploymentStatusCreatedCheckRun.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                completedAt,
                conclusion,
                detailsUrl,
                externalId,
                headSha,
                htmlUrl,
                id,
                name,
                nodeId,
                startedAt,
                status,
                url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookDeploymentStatusCreatedCheckRun {\n");
        sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
        sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
        sb.append("    detailsUrl: ").append(toIndentedString(detailsUrl)).append("\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    headSha: ").append(toIndentedString(headSha)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
