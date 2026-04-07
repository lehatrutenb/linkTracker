package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A value assigned to an issue field
 */
@Schema(name = "issue-field-value", description = "A value assigned to an issue field")
@JsonTypeName("issue-field-value")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssueFieldValue {

    private Long issueFieldId;

    private String nodeId;

    /**
     * The data type of the issue field
     */
    public enum DataTypeEnum {
        TEXT("text"),

        SINGLE_SELECT("single_select"),

        NUMBER("number"),

        DATE("date");

        private final String value;

        DataTypeEnum(String value) {
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
        public static DataTypeEnum fromValue(String value) {
            for (DataTypeEnum b : DataTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private DataTypeEnum dataType;

    private JsonNullable<IssueFieldValueValue> value = JsonNullable.<IssueFieldValueValue>undefined();

    private JsonNullable<IssueFieldValueSingleSelectOption> singleSelectOption =
            JsonNullable.<IssueFieldValueSingleSelectOption>undefined();

    public IssueFieldValue() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssueFieldValue(Long issueFieldId, String nodeId, DataTypeEnum dataType, IssueFieldValueValue value) {
        this.issueFieldId = issueFieldId;
        this.nodeId = nodeId;
        this.dataType = dataType;
        this.value = JsonNullable.of(value);
    }

    public IssueFieldValue issueFieldId(Long issueFieldId) {
        this.issueFieldId = issueFieldId;
        return this;
    }

    /**
     * Unique identifier for the issue field.
     * @return issueFieldId
     */
    @NotNull
    @Schema(
            name = "issue_field_id",
            example = "1",
            description = "Unique identifier for the issue field.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue_field_id")
    public Long getIssueFieldId() {
        return issueFieldId;
    }

    public void setIssueFieldId(Long issueFieldId) {
        this.issueFieldId = issueFieldId;
    }

    public IssueFieldValue nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", example = "IFT_GDKND", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public IssueFieldValue dataType(DataTypeEnum dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * The data type of the issue field
     * @return dataType
     */
    @NotNull
    @Schema(
            name = "data_type",
            example = "text",
            description = "The data type of the issue field",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("data_type")
    public DataTypeEnum getDataType() {
        return dataType;
    }

    public void setDataType(DataTypeEnum dataType) {
        this.dataType = dataType;
    }

    public IssueFieldValue value(IssueFieldValueValue value) {
        this.value = JsonNullable.of(value);
        return this;
    }

    /**
     * Get value
     * @return value
     */
    @NotNull
    @Valid
    @Schema(name = "value", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("value")
    public JsonNullable<IssueFieldValueValue> getValue() {
        return value;
    }

    public void setValue(JsonNullable<IssueFieldValueValue> value) {
        this.value = value;
    }

    public IssueFieldValue singleSelectOption(IssueFieldValueSingleSelectOption singleSelectOption) {
        this.singleSelectOption = JsonNullable.of(singleSelectOption);
        return this;
    }

    /**
     * Get singleSelectOption
     * @return singleSelectOption
     */
    @Valid
    @Schema(name = "single_select_option", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("single_select_option")
    public JsonNullable<IssueFieldValueSingleSelectOption> getSingleSelectOption() {
        return singleSelectOption;
    }

    public void setSingleSelectOption(JsonNullable<IssueFieldValueSingleSelectOption> singleSelectOption) {
        this.singleSelectOption = singleSelectOption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueFieldValue issueFieldValue = (IssueFieldValue) o;
        return Objects.equals(this.issueFieldId, issueFieldValue.issueFieldId)
                && Objects.equals(this.nodeId, issueFieldValue.nodeId)
                && Objects.equals(this.dataType, issueFieldValue.dataType)
                && Objects.equals(this.value, issueFieldValue.value)
                && equalsNullable(this.singleSelectOption, issueFieldValue.singleSelectOption);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueFieldId, nodeId, dataType, value, hashCodeNullable(singleSelectOption));
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
        sb.append("class IssueFieldValue {\n");
        sb.append("    issueFieldId: ").append(toIndentedString(issueFieldId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    singleSelectOption: ")
                .append(toIndentedString(singleSelectOption))
                .append("\n");
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
