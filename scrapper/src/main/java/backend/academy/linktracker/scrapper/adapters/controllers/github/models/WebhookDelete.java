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
import java.util.Objects;

/**
 * WebhookDelete
 */
@JsonTypeName("webhook-delete")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookDelete {

    private EnterpriseWebhooks enterprise;

    private SimpleInstallation installation;

    private OrganizationSimpleWebhooks organization;

    private String pusherType;

    private String ref;

    /**
     * The type of Git ref object deleted in the repository.
     */
    public enum RefTypeEnum {
        TAG("tag"),

        BRANCH("branch");

        private final String value;

        RefTypeEnum(String value) {
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
        public static RefTypeEnum fromValue(String value) {
            for (RefTypeEnum b : RefTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private RefTypeEnum refType;

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    public WebhookDelete() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookDelete(
            String pusherType, String ref, RefTypeEnum refType, RepositoryWebhooks repository, SimpleUser sender) {
        this.pusherType = pusherType;
        this.ref = ref;
        this.refType = refType;
        this.repository = repository;
        this.sender = sender;
    }

    public WebhookDelete enterprise(EnterpriseWebhooks enterprise) {
        this.enterprise = enterprise;
        return this;
    }

    /**
     * Get enterprise
     * @return enterprise
     */
    @Valid
    @Schema(name = "enterprise", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enterprise")
    public EnterpriseWebhooks getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(EnterpriseWebhooks enterprise) {
        this.enterprise = enterprise;
    }

    public WebhookDelete installation(SimpleInstallation installation) {
        this.installation = installation;
        return this;
    }

    /**
     * Get installation
     * @return installation
     */
    @Valid
    @Schema(name = "installation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("installation")
    public SimpleInstallation getInstallation() {
        return installation;
    }

    public void setInstallation(SimpleInstallation installation) {
        this.installation = installation;
    }

    public WebhookDelete organization(OrganizationSimpleWebhooks organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get organization
     * @return organization
     */
    @Valid
    @Schema(name = "organization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization")
    public OrganizationSimpleWebhooks getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationSimpleWebhooks organization) {
        this.organization = organization;
    }

    public WebhookDelete pusherType(String pusherType) {
        this.pusherType = pusherType;
        return this;
    }

    /**
     * The pusher type for the event. Can be either `user` or a deploy key.
     * @return pusherType
     */
    @NotNull
    @Schema(
            name = "pusher_type",
            description = "The pusher type for the event. Can be either `user` or a deploy key.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pusher_type")
    public String getPusherType() {
        return pusherType;
    }

    public void setPusherType(String pusherType) {
        this.pusherType = pusherType;
    }

    public WebhookDelete ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * The [`git ref`](https://docs.github.com/rest/git/refs#get-a-reference) resource.
     * @return ref
     */
    @NotNull
    @Schema(
            name = "ref",
            description = "The [`git ref`](https://docs.github.com/rest/git/refs#get-a-reference) resource.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public WebhookDelete refType(RefTypeEnum refType) {
        this.refType = refType;
        return this;
    }

    /**
     * The type of Git ref object deleted in the repository.
     * @return refType
     */
    @NotNull
    @Schema(
            name = "ref_type",
            description = "The type of Git ref object deleted in the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ref_type")
    public RefTypeEnum getRefType() {
        return refType;
    }

    public void setRefType(RefTypeEnum refType) {
        this.refType = refType;
    }

    public WebhookDelete repository(RepositoryWebhooks repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @NotNull
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository")
    public RepositoryWebhooks getRepository() {
        return repository;
    }

    public void setRepository(RepositoryWebhooks repository) {
        this.repository = repository;
    }

    public WebhookDelete sender(SimpleUser sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Get sender
     * @return sender
     */
    @NotNull
    @Valid
    @Schema(name = "sender", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sender")
    public SimpleUser getSender() {
        return sender;
    }

    public void setSender(SimpleUser sender) {
        this.sender = sender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookDelete webhookDelete = (WebhookDelete) o;
        return Objects.equals(this.enterprise, webhookDelete.enterprise)
                && Objects.equals(this.installation, webhookDelete.installation)
                && Objects.equals(this.organization, webhookDelete.organization)
                && Objects.equals(this.pusherType, webhookDelete.pusherType)
                && Objects.equals(this.ref, webhookDelete.ref)
                && Objects.equals(this.refType, webhookDelete.refType)
                && Objects.equals(this.repository, webhookDelete.repository)
                && Objects.equals(this.sender, webhookDelete.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterprise, installation, organization, pusherType, ref, refType, repository, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookDelete {\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    pusherType: ").append(toIndentedString(pusherType)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    refType: ").append(toIndentedString(refType)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
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
