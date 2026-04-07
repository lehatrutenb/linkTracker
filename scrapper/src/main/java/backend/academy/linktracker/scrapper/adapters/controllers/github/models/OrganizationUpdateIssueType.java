package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * OrganizationUpdateIssueType
 */
@JsonTypeName("organization-update-issue-type")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrganizationUpdateIssueType {

    private String name;

    private Boolean isEnabled;

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    /**
     * Color for the issue type.
     */
    public enum ColorEnum {
        GRAY("gray"),

        BLUE("blue"),

        GREEN("green"),

        YELLOW("yellow"),

        ORANGE("orange"),

        RED("red"),

        PINK("pink"),

        PURPLE("purple");

        private final String value;

        ColorEnum(String value) {
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
        public static ColorEnum fromValue(String value) {
            for (ColorEnum b : ColorEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }

    private JsonNullable<ColorEnum> color = JsonNullable.<ColorEnum>undefined();

    public OrganizationUpdateIssueType() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrganizationUpdateIssueType(String name, Boolean isEnabled) {
        this.name = name;
        this.isEnabled = isEnabled;
    }

    public OrganizationUpdateIssueType name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the issue type.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "Name of the issue type.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrganizationUpdateIssueType isEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Whether or not the issue type is enabled at the organization level.
     * @return isEnabled
     */
    @NotNull
    @Schema(
            name = "is_enabled",
            description = "Whether or not the issue type is enabled at the organization level.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("is_enabled")
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public OrganizationUpdateIssueType description(String description) {
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Description of the issue type.
     * @return description
     */
    @Schema(
            name = "description",
            description = "Description of the issue type.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public OrganizationUpdateIssueType color(ColorEnum color) {
        this.color = JsonNullable.of(color);
        return this;
    }

    /**
     * Color for the issue type.
     * @return color
     */
    @Schema(name = "color", description = "Color for the issue type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("color")
    public JsonNullable<ColorEnum> getColor() {
        return color;
    }

    public void setColor(JsonNullable<ColorEnum> color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrganizationUpdateIssueType organizationUpdateIssueType = (OrganizationUpdateIssueType) o;
        return Objects.equals(this.name, organizationUpdateIssueType.name)
                && Objects.equals(this.isEnabled, organizationUpdateIssueType.isEnabled)
                && equalsNullable(this.description, organizationUpdateIssueType.description)
                && equalsNullable(this.color, organizationUpdateIssueType.color);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isEnabled, hashCodeNullable(description), hashCodeNullable(color));
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
        sb.append("class OrganizationUpdateIssueType {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
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
