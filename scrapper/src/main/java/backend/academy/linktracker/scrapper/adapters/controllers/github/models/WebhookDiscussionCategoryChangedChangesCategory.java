package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * WebhookDiscussionCategoryChangedChangesCategory
 */
@JsonTypeName("webhook_discussion_category_changed_changes_category")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookDiscussionCategoryChangedChangesCategory {

    private DiscussionCategory from;

    public WebhookDiscussionCategoryChangedChangesCategory() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookDiscussionCategoryChangedChangesCategory(DiscussionCategory from) {
        this.from = from;
    }

    public WebhookDiscussionCategoryChangedChangesCategory from(DiscussionCategory from) {
        this.from = from;
        return this;
    }

    /**
     * Get from
     * @return from
     */
    @NotNull
    @Valid
    @Schema(name = "from", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("from")
    public DiscussionCategory getFrom() {
        return from;
    }

    public void setFrom(DiscussionCategory from) {
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
        WebhookDiscussionCategoryChangedChangesCategory webhookDiscussionCategoryChangedChangesCategory =
                (WebhookDiscussionCategoryChangedChangesCategory) o;
        return Objects.equals(this.from, webhookDiscussionCategoryChangedChangesCategory.from);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookDiscussionCategoryChangedChangesCategory {\n");
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
