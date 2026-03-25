package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WebhookPackagePublishedPackagePackageVersionNugetMetadataInner
 */
@JsonTypeName("webhook_package_published_package_package_version_nuget_metadata_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPackagePublishedPackagePackageVersionNugetMetadataInner {

    private ActionsGetWorkflowWorkflowIdParameter id;

    private String name;

    private WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue value;

    public WebhookPackagePublishedPackagePackageVersionNugetMetadataInner id(ActionsGetWorkflowWorkflowIdParameter id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Valid
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public ActionsGetWorkflowWorkflowIdParameter getId() {
        return id;
    }

    public void setId(ActionsGetWorkflowWorkflowIdParameter id) {
        this.id = id;
    }

    public WebhookPackagePublishedPackagePackageVersionNugetMetadataInner name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebhookPackagePublishedPackagePackageVersionNugetMetadataInner value(
            WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     * @return value
     */
    @Valid
    @Schema(name = "value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("value")
    public WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue getValue() {
        return value;
    }

    public void setValue(WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookPackagePublishedPackagePackageVersionNugetMetadataInner
                webhookPackagePublishedPackagePackageVersionNugetMetadataInner =
                        (WebhookPackagePublishedPackagePackageVersionNugetMetadataInner) o;
        return Objects.equals(this.id, webhookPackagePublishedPackagePackageVersionNugetMetadataInner.id)
                && Objects.equals(this.name, webhookPackagePublishedPackagePackageVersionNugetMetadataInner.name)
                && Objects.equals(this.value, webhookPackagePublishedPackagePackageVersionNugetMetadataInner.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPackagePublishedPackagePackageVersionNugetMetadataInner {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
