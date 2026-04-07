package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * WebhookRepositoryRenamedChanges
 */
@JsonTypeName("webhook_repository_renamed_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRepositoryRenamedChanges {

    private WebhookRepositoryRenamedChangesRepository repository;

    public WebhookRepositoryRenamedChanges() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookRepositoryRenamedChanges(WebhookRepositoryRenamedChangesRepository repository) {
        this.repository = repository;
    }

    public WebhookRepositoryRenamedChanges repository(WebhookRepositoryRenamedChangesRepository repository) {
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
    public WebhookRepositoryRenamedChangesRepository getRepository() {
        return repository;
    }

    public void setRepository(WebhookRepositoryRenamedChangesRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookRepositoryRenamedChanges webhookRepositoryRenamedChanges = (WebhookRepositoryRenamedChanges) o;
        return Objects.equals(this.repository, webhookRepositoryRenamedChanges.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repository);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookRepositoryRenamedChanges {\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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
