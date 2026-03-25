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
 * WebhookCreate
 */
@JsonTypeName("webhook-create")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookCreate {

    private String description = null;

    private EnterpriseWebhooks enterprise;

    private SimpleInstallation installation;

    private String masterBranch;

    private OrganizationSimpleWebhooks organization;

    private String pusherType;

    private String ref;

    /**
     * The type of Git ref object created in the repository.
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

    public WebhookCreate() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookCreate(
            String description,
            String masterBranch,
            String pusherType,
            String ref,
            RefTypeEnum refType,
            RepositoryWebhooks repository,
            SimpleUser sender) {
        this.description = description;
        this.masterBranch = masterBranch;
        this.pusherType = pusherType;
        this.ref = ref;
        this.refType = refType;
        this.repository = repository;
        this.sender = sender;
    }

    public WebhookCreate description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The repository's current description.
     * @return description
     */
    @NotNull
    @Schema(
            name = "description",
            description = "The repository's current description.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WebhookCreate enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookCreate installation(SimpleInstallation installation) {
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

    public WebhookCreate masterBranch(String masterBranch) {
        this.masterBranch = masterBranch;
        return this;
    }

    /**
     * The name of the repository's default branch (usually `main`).
     * @return masterBranch
     */
    @NotNull
    @Schema(
            name = "master_branch",
            description = "The name of the repository's default branch (usually `main`).",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("master_branch")
    public String getMasterBranch() {
        return masterBranch;
    }

    public void setMasterBranch(String masterBranch) {
        this.masterBranch = masterBranch;
    }

    public WebhookCreate organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookCreate pusherType(String pusherType) {
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

    public WebhookCreate ref(String ref) {
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

    public WebhookCreate refType(RefTypeEnum refType) {
        this.refType = refType;
        return this;
    }

    /**
     * The type of Git ref object created in the repository.
     * @return refType
     */
    @NotNull
    @Schema(
            name = "ref_type",
            description = "The type of Git ref object created in the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ref_type")
    public RefTypeEnum getRefType() {
        return refType;
    }

    public void setRefType(RefTypeEnum refType) {
        this.refType = refType;
    }

    public WebhookCreate repository(RepositoryWebhooks repository) {
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

    public WebhookCreate sender(SimpleUser sender) {
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
        WebhookCreate webhookCreate = (WebhookCreate) o;
        return Objects.equals(this.description, webhookCreate.description)
                && Objects.equals(this.enterprise, webhookCreate.enterprise)
                && Objects.equals(this.installation, webhookCreate.installation)
                && Objects.equals(this.masterBranch, webhookCreate.masterBranch)
                && Objects.equals(this.organization, webhookCreate.organization)
                && Objects.equals(this.pusherType, webhookCreate.pusherType)
                && Objects.equals(this.ref, webhookCreate.ref)
                && Objects.equals(this.refType, webhookCreate.refType)
                && Objects.equals(this.repository, webhookCreate.repository)
                && Objects.equals(this.sender, webhookCreate.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                description,
                enterprise,
                installation,
                masterBranch,
                organization,
                pusherType,
                ref,
                refType,
                repository,
                sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookCreate {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    masterBranch: ").append(toIndentedString(masterBranch)).append("\n");
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
