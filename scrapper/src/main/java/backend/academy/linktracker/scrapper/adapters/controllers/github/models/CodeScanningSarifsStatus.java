package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.net.URI;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CodeScanningSarifsStatus
 */
@JsonTypeName("code-scanning-sarifs-status")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningSarifsStatus {

    /**
     * `pending` files have not yet been processed, while `complete` means results from the SARIF have been stored. `failed` files have either not been processed at all, or could only be partially processed.
     */
    public enum ProcessingStatusEnum {
        PENDING("pending"),

        COMPLETE("complete"),

        FAILED("failed");

        private final String value;

        ProcessingStatusEnum(String value) {
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
        public static ProcessingStatusEnum fromValue(String value) {
            for (ProcessingStatusEnum b : ProcessingStatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<ProcessingStatusEnum> processingStatus = Optional.empty();

    private JsonNullable<URI> analysesUrl = JsonNullable.<URI>undefined();

    @Valid
    private JsonNullable<List<String>> errors = JsonNullable.<List<String>>undefined();

    public CodeScanningSarifsStatus processingStatus(ProcessingStatusEnum processingStatus) {
        this.processingStatus = Optional.ofNullable(processingStatus);
        return this;
    }

    /**
     * `pending` files have not yet been processed, while `complete` means results from the SARIF have been stored. `failed` files have either not been processed at all, or could only be partially processed.
     * @return processingStatus
     */
    @Schema(
            name = "processing_status",
            description =
                    "`pending` files have not yet been processed, while `complete` means results from the SARIF have been stored. `failed` files have either not been processed at all, or could only be partially processed.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("processing_status")
    public Optional<ProcessingStatusEnum> getProcessingStatus() {
        return processingStatus;
    }

    public void setProcessingStatus(Optional<ProcessingStatusEnum> processingStatus) {
        this.processingStatus = processingStatus;
    }

    public CodeScanningSarifsStatus analysesUrl(URI analysesUrl) {
        this.analysesUrl = JsonNullable.of(analysesUrl);
        return this;
    }

    /**
     * The REST API URL for getting the analyses associated with the upload.
     * @return analysesUrl
     */
    @Valid
    @Schema(
            name = "analyses_url",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The REST API URL for getting the analyses associated with the upload.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("analyses_url")
    public JsonNullable<URI> getAnalysesUrl() {
        return analysesUrl;
    }

    public void setAnalysesUrl(JsonNullable<URI> analysesUrl) {
        this.analysesUrl = analysesUrl;
    }

    public CodeScanningSarifsStatus errors(List<String> errors) {
        this.errors = JsonNullable.of(errors);
        return this;
    }

    public CodeScanningSarifsStatus addErrorsItem(String errorsItem) {
        if (this.errors == null || !this.errors.isPresent()) {
            this.errors = JsonNullable.of(new ArrayList<>());
        }
        this.errors.get().add(errorsItem);
        return this;
    }

    /**
     * Any errors that ocurred during processing of the delivery.
     * @return errors
     */
    @Schema(
            name = "errors",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "Any errors that ocurred during processing of the delivery.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("errors")
    public JsonNullable<List<String>> getErrors() {
        return errors;
    }

    public void setErrors(JsonNullable<List<String>> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeScanningSarifsStatus codeScanningSarifsStatus = (CodeScanningSarifsStatus) o;
        return Objects.equals(this.processingStatus, codeScanningSarifsStatus.processingStatus)
                && equalsNullable(this.analysesUrl, codeScanningSarifsStatus.analysesUrl)
                && equalsNullable(this.errors, codeScanningSarifsStatus.errors);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(processingStatus, hashCodeNullable(analysesUrl), hashCodeNullable(errors));
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
        sb.append("class CodeScanningSarifsStatus {\n");
        sb.append("    processingStatus: ")
                .append(toIndentedString(processingStatus))
                .append("\n");
        sb.append("    analysesUrl: ").append(toIndentedString(analysesUrl)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
