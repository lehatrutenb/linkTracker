package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Provides details of a hosted runner image
 */
@Schema(name = "nullable-actions-hosted-runner-pool-image", description = "Provides details of a hosted runner image")
@JsonTypeName("nullable-actions-hosted-runner-pool-image")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class NullableActionsHostedRunnerPoolImage {

    private String id;

    private Long sizeGb;

    private String displayName;

    /**
     * The image provider.
     */
    public enum SourceEnum {
        GITHUB("github"),

        PARTNER("partner"),

        CUSTOM("custom");

        private final String value;

        SourceEnum(String value) {
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
        public static SourceEnum fromValue(String value) {
            for (SourceEnum b : SourceEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private SourceEnum source;

    private String version;

    public NullableActionsHostedRunnerPoolImage() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public NullableActionsHostedRunnerPoolImage(String id, Long sizeGb, String displayName, SourceEnum source) {
        this.id = id;
        this.sizeGb = sizeGb;
        this.displayName = displayName;
        this.source = source;
    }

    public NullableActionsHostedRunnerPoolImage id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the image. Use this ID for the `image` parameter when creating a new larger runner.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "ubuntu-20.04",
            description =
                    "The ID of the image. Use this ID for the `image` parameter when creating a new larger runner.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NullableActionsHostedRunnerPoolImage sizeGb(Long sizeGb) {
        this.sizeGb = sizeGb;
        return this;
    }

    /**
     * Image size in GB.
     * @return sizeGb
     */
    @NotNull
    @Schema(
            name = "size_gb",
            example = "86",
            description = "Image size in GB.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("size_gb")
    public Long getSizeGb() {
        return sizeGb;
    }

    public void setSizeGb(Long sizeGb) {
        this.sizeGb = sizeGb;
    }

    public NullableActionsHostedRunnerPoolImage displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Display name for this image.
     * @return displayName
     */
    @NotNull
    @Schema(
            name = "display_name",
            example = "20.04",
            description = "Display name for this image.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public NullableActionsHostedRunnerPoolImage source(SourceEnum source) {
        this.source = source;
        return this;
    }

    /**
     * The image provider.
     * @return source
     */
    @NotNull
    @Schema(name = "source", description = "The image provider.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("source")
    public SourceEnum getSource() {
        return source;
    }

    public void setSource(SourceEnum source) {
        this.source = source;
    }

    public NullableActionsHostedRunnerPoolImage version(String version) {
        this.version = version;
        return this;
    }

    /**
     * The image version of the hosted runner pool.
     * @return version
     */
    @Schema(
            name = "version",
            example = "latest",
            description = "The image version of the hosted runner pool.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NullableActionsHostedRunnerPoolImage nullableActionsHostedRunnerPoolImage =
                (NullableActionsHostedRunnerPoolImage) o;
        return Objects.equals(this.id, nullableActionsHostedRunnerPoolImage.id)
                && Objects.equals(this.sizeGb, nullableActionsHostedRunnerPoolImage.sizeGb)
                && Objects.equals(this.displayName, nullableActionsHostedRunnerPoolImage.displayName)
                && Objects.equals(this.source, nullableActionsHostedRunnerPoolImage.source)
                && Objects.equals(this.version, nullableActionsHostedRunnerPoolImage.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sizeGb, displayName, source, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NullableActionsHostedRunnerPoolImage {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sizeGb: ").append(toIndentedString(sizeGb)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
