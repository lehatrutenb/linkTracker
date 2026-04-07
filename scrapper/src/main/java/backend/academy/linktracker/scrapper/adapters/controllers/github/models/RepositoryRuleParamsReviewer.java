package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * A required reviewing team
 */
@Schema(name = "repository-rule-params-reviewer", description = "A required reviewing team")
@JsonTypeName("repository-rule-params-reviewer")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleParamsReviewer {

    private Long id;

    /**
     * The type of the reviewer
     */
    public enum TypeEnum {
        TEAM("Team");

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

    public RepositoryRuleParamsReviewer() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRuleParamsReviewer(Long id, TypeEnum type) {
        this.id = id;
        this.type = type;
    }

    public RepositoryRuleParamsReviewer id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * ID of the reviewer which must review changes to matching files.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            description = "ID of the reviewer which must review changes to matching files.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RepositoryRuleParamsReviewer type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of the reviewer
     * @return type
     */
    @NotNull
    @Schema(name = "type", description = "The type of the reviewer", requiredMode = Schema.RequiredMode.REQUIRED)
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
        RepositoryRuleParamsReviewer repositoryRuleParamsReviewer = (RepositoryRuleParamsReviewer) o;
        return Objects.equals(this.id, repositoryRuleParamsReviewer.id)
                && Objects.equals(this.type, repositoryRuleParamsReviewer.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRuleParamsReviewer {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
