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
 * A label for a self hosted runner
 */
@Schema(name = "runner-label", description = "A label for a self hosted runner")
@JsonTypeName("runner-label")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RunnerLabel {

    private Long id;

    private String name;

    /**
     * The type of label. Read-only labels are applied automatically when the runner is configured.
     */
    public enum TypeEnum {
        READ_ONLY("read-only"),

        CUSTOM("custom");

        private final String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private TypeEnum type;

    public RunnerLabel() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RunnerLabel(String name) {
        this.name = name;
    }

    public RunnerLabel id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the label.
     * @return id
     */
    @Schema(
            name = "id",
            description = "Unique identifier of the label.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RunnerLabel name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the label.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "Name of the label.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RunnerLabel type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of label. Read-only labels are applied automatically when the runner is configured.
     * @return type
     */
    @Schema(
            name = "type",
            description =
                    "The type of label. Read-only labels are applied automatically when the runner is configured.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunnerLabel runnerLabel = (RunnerLabel) o;
        return Objects.equals(this.id, runnerLabel.id)
                && Objects.equals(this.name, runnerLabel.name)
                && Objects.equals(this.type, runnerLabel.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunnerLabel {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
