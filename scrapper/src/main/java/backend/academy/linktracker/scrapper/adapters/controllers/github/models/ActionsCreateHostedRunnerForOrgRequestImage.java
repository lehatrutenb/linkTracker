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
 * The image of runner. To list all available images, use &#x60;GET /actions/hosted-runners/images/github-owned&#x60; or &#x60;GET /actions/hosted-runners/images/partner&#x60;.
 */
@Schema(
        name = "actions_create_hosted_runner_for_org_request_image",
        description =
                "The image of runner. To list all available images, use `GET /actions/hosted-runners/images/github-owned` or `GET /actions/hosted-runners/images/partner`.")
@JsonTypeName("actions_create_hosted_runner_for_org_request_image")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsCreateHostedRunnerForOrgRequestImage {

    private String id;

    /**
     * The source of the runner image.
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

    private String version = null;

    public ActionsCreateHostedRunnerForOrgRequestImage id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the runner image.
     * @return id
     */
    @Schema(
            name = "id",
            description = "The unique identifier of the runner image.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ActionsCreateHostedRunnerForOrgRequestImage source(SourceEnum source) {
        this.source = source;
        return this;
    }

    /**
     * The source of the runner image.
     * @return source
     */
    @Schema(
            name = "source",
            description = "The source of the runner image.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("source")
    public SourceEnum getSource() {
        return source;
    }

    public void setSource(SourceEnum source) {
        this.source = source;
    }

    public ActionsCreateHostedRunnerForOrgRequestImage version(String version) {
        this.version = version;
        return this;
    }

    /**
     * The version of the runner image to deploy. This is relevant only for runners using custom images.
     * @return version
     */
    @Schema(
            name = "version",
            description =
                    "The version of the runner image to deploy. This is relevant only for runners using custom images.",
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
        ActionsCreateHostedRunnerForOrgRequestImage actionsCreateHostedRunnerForOrgRequestImage =
                (ActionsCreateHostedRunnerForOrgRequestImage) o;
        return Objects.equals(this.id, actionsCreateHostedRunnerForOrgRequestImage.id)
                && Objects.equals(this.source, actionsCreateHostedRunnerForOrgRequestImage.source)
                && Objects.equals(this.version, actionsCreateHostedRunnerForOrgRequestImage.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, source, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsCreateHostedRunnerForOrgRequestImage {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
