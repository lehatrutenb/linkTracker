package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookSecurityAndAnalysisChanges
 */
@JsonTypeName("webhook_security_and_analysis_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookSecurityAndAnalysisChanges {

    private Optional<WebhookSecurityAndAnalysisChangesFrom> from = Optional.empty();

    public WebhookSecurityAndAnalysisChanges from(WebhookSecurityAndAnalysisChangesFrom from) {
        this.from = Optional.ofNullable(from);
        return this;
    }

    /**
     * Get from
     * @return from
     */
    @Valid
    @Schema(name = "from", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("from")
    public Optional<WebhookSecurityAndAnalysisChangesFrom> getFrom() {
        return from;
    }

    public void setFrom(Optional<WebhookSecurityAndAnalysisChangesFrom> from) {
        this.from = from;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookSecurityAndAnalysisChanges webhookSecurityAndAnalysisChanges = (WebhookSecurityAndAnalysisChanges) o;
        return Objects.equals(this.from, webhookSecurityAndAnalysisChanges.from);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookSecurityAndAnalysisChanges {\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
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
