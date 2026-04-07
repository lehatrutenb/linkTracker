package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * WebhookCustomPropertyDeletedDefinition
 */
@JsonTypeName("webhook_custom_property_deleted_definition")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookCustomPropertyDeletedDefinition {

    private String propertyName;

    public WebhookCustomPropertyDeletedDefinition() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookCustomPropertyDeletedDefinition(String propertyName) {
        this.propertyName = propertyName;
    }

    public WebhookCustomPropertyDeletedDefinition propertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }

    /**
     * The name of the property that was deleted.
     * @return propertyName
     */
    @NotNull
    @Schema(
            name = "property_name",
            description = "The name of the property that was deleted.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("property_name")
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookCustomPropertyDeletedDefinition webhookCustomPropertyDeletedDefinition =
                (WebhookCustomPropertyDeletedDefinition) o;
        return Objects.equals(this.propertyName, webhookCustomPropertyDeletedDefinition.propertyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookCustomPropertyDeletedDefinition {\n");
        sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
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
