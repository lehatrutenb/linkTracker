package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadataInner
 */
@JsonTypeName("webhook_registry_package_published_registry_package_package_version_nuget_metadata_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadataInner {

    private JsonNullable<WebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadataInnerId> id =
            JsonNullable.<WebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadataInnerId>undefined();

    private Optional<String> name = Optional.empty();

    private Optional<WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue> value = Optional.empty();

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadataInner id(
            WebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadataInnerId id) {
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Valid
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public JsonNullable<WebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadataInnerId> getId() {
        return id;
    }

    public void setId(
            JsonNullable<WebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadataInnerId> id) {
        this.id = id;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadataInner name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public WebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadataInner value(
            WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue value) {
        this.value = Optional.ofNullable(value);
        return this;
    }

    /**
     * Get value
     * @return value
     */
    @Valid
    @Schema(name = "value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("value")
    public Optional<WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue> getValue() {
        return value;
    }

    public void setValue(Optional<WebhookPackagePublishedPackagePackageVersionNugetMetadataInnerValue> value) {
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
        WebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadataInner
                webhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadataInner =
                        (WebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadataInner) o;
        return equalsNullable(
                        this.id, webhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadataInner.id)
                && Objects.equals(
                        this.name, webhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadataInner.name)
                && Objects.equals(
                        this.value,
                        webhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadataInner.value);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashCodeNullable(id), name, value);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadataInner {\n");
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
