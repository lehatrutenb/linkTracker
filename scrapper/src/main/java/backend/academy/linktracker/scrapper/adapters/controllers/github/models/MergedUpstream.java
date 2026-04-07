package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * Results of a successful merge upstream request
 */
@Schema(name = "merged-upstream", description = "Results of a successful merge upstream request")
@JsonTypeName("merged-upstream")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MergedUpstream {

    private Optional<String> message = Optional.empty();

    /**
     * Gets or Sets mergeType
     */
    public enum MergeTypeEnum {
        MERGE("merge"),

        FAST_FORWARD("fast-forward"),

        NONE("none");

        private final String value;

        MergeTypeEnum(String value) {
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
        public static MergeTypeEnum fromValue(String value) {
            for (MergeTypeEnum b : MergeTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<MergeTypeEnum> mergeType = Optional.empty();

    private Optional<String> baseBranch = Optional.empty();

    public MergedUpstream message(String message) {
        this.message = Optional.ofNullable(message);
        return this;
    }

    /**
     * Get message
     * @return message
     */
    @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("message")
    public Optional<String> getMessage() {
        return message;
    }

    public void setMessage(Optional<String> message) {
        this.message = message;
    }

    public MergedUpstream mergeType(MergeTypeEnum mergeType) {
        this.mergeType = Optional.ofNullable(mergeType);
        return this;
    }

    /**
     * Get mergeType
     * @return mergeType
     */
    @Schema(name = "merge_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("merge_type")
    public Optional<MergeTypeEnum> getMergeType() {
        return mergeType;
    }

    public void setMergeType(Optional<MergeTypeEnum> mergeType) {
        this.mergeType = mergeType;
    }

    public MergedUpstream baseBranch(String baseBranch) {
        this.baseBranch = Optional.ofNullable(baseBranch);
        return this;
    }

    /**
     * Get baseBranch
     * @return baseBranch
     */
    @Schema(name = "base_branch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("base_branch")
    public Optional<String> getBaseBranch() {
        return baseBranch;
    }

    public void setBaseBranch(Optional<String> baseBranch) {
        this.baseBranch = baseBranch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MergedUpstream mergedUpstream = (MergedUpstream) o;
        return Objects.equals(this.message, mergedUpstream.message)
                && Objects.equals(this.mergeType, mergedUpstream.mergeType)
                && Objects.equals(this.baseBranch, mergedUpstream.baseBranch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, mergeType, baseBranch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergedUpstream {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    mergeType: ").append(toIndentedString(mergeType)).append("\n");
        sb.append("    baseBranch: ").append(toIndentedString(baseBranch)).append("\n");
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
