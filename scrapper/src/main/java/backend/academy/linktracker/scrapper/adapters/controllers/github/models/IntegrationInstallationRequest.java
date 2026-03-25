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
 * Request to install an integration on a target
 */
@Schema(name = "integration-installation-request", description = "Request to install an integration on a target")
@JsonTypeName("integration-installation-request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IntegrationInstallationRequest {

    private Long id;

    private String nodeId;

    private IntegrationInstallationRequestAccount account;

    private SimpleUser requester;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    public IntegrationInstallationRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IntegrationInstallationRequest(
            Long id, IntegrationInstallationRequestAccount account, SimpleUser requester, OffsetDateTime createdAt) {
        this.id = id;
        this.account = account;
        this.requester = requester;
        this.createdAt = createdAt;
    }

    public IntegrationInstallationRequest id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the request installation.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "42",
            description = "Unique identifier of the request installation.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IntegrationInstallationRequest nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(name = "node_id", example = "MDExOkludGVncmF0aW9uMQ==", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public IntegrationInstallationRequest account(IntegrationInstallationRequestAccount account) {
        this.account = account;
        return this;
    }

    /**
     * Get account
     * @return account
     */
    @NotNull
    @Valid
    @Schema(name = "account", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("account")
    public IntegrationInstallationRequestAccount getAccount() {
        return account;
    }

    public void setAccount(IntegrationInstallationRequestAccount account) {
        this.account = account;
    }

    public IntegrationInstallationRequest requester(SimpleUser requester) {
        this.requester = requester;
        return this;
    }

    /**
     * Get requester
     * @return requester
     */
    @NotNull
    @Valid
    @Schema(name = "requester", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("requester")
    public SimpleUser getRequester() {
        return requester;
    }

    public void setRequester(SimpleUser requester) {
        this.requester = requester;
    }

    public IntegrationInstallationRequest createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", example = "2022-07-08T16:18:44-04:00", requiredMode = Schema.RequiredMode.REQUIRED)
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
        IntegrationInstallationRequest integrationInstallationRequest = (IntegrationInstallationRequest) o;
        return Objects.equals(this.id, integrationInstallationRequest.id)
                && Objects.equals(this.nodeId, integrationInstallationRequest.nodeId)
                && Objects.equals(this.account, integrationInstallationRequest.account)
                && Objects.equals(this.requester, integrationInstallationRequest.requester)
                && Objects.equals(this.createdAt, integrationInstallationRequest.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nodeId, account, requester, createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntegrationInstallationRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    requester: ").append(toIndentedString(requester)).append("\n");
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
