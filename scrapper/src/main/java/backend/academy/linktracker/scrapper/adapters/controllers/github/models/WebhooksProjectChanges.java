package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhooksProjectChanges
 */
@JsonTypeName("webhooks_project_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksProjectChanges {

    private Optional<WebhooksProjectChangesArchivedAt> archivedAt = Optional.empty();

    public WebhooksProjectChanges archivedAt(WebhooksProjectChangesArchivedAt archivedAt) {
        this.archivedAt = Optional.ofNullable(archivedAt);
        return this;
    }

    /**
     * Get archivedAt
     * @return archivedAt
     */
    @Valid
    @Schema(name = "archived_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("archived_at")
    public Optional<WebhooksProjectChangesArchivedAt> getArchivedAt() {
        return archivedAt;
    }

    public void setArchivedAt(Optional<WebhooksProjectChangesArchivedAt> archivedAt) {
        this.archivedAt = archivedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhooksProjectChanges webhooksProjectChanges = (WebhooksProjectChanges) o;
        return Objects.equals(this.archivedAt, webhooksProjectChanges.archivedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(archivedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksProjectChanges {\n");
        sb.append("    archivedAt: ").append(toIndentedString(archivedAt)).append("\n");
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
