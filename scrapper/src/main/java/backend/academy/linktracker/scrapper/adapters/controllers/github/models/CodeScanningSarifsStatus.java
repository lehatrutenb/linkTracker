package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CodeScanningSarifsStatus
 */
@JsonTypeName("code-scanning-sarifs-status")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
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

    private ProcessingStatusEnum processingStatus;

    private URI analysesUrl = null;

    @Valid
    private List<String> errors;

    public CodeScanningSarifsStatus processingStatus(ProcessingStatusEnum processingStatus) {
        this.processingStatus = processingStatus;
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
    public ProcessingStatusEnum getProcessingStatus() {
        return processingStatus;
    }

    public void setProcessingStatus(ProcessingStatusEnum processingStatus) {
        this.processingStatus = processingStatus;
    }

    public CodeScanningSarifsStatus analysesUrl(URI analysesUrl) {
        this.analysesUrl = analysesUrl;
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
    public URI getAnalysesUrl() {
        return analysesUrl;
    }

    public void setAnalysesUrl(URI analysesUrl) {
        this.analysesUrl = analysesUrl;
    }

    public CodeScanningSarifsStatus errors(List<String> errors) {
        this.errors = errors;
        return this;
    }

    public CodeScanningSarifsStatus addErrorsItem(String errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(errorsItem);
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
    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
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
                && Objects.equals(this.analysesUrl, codeScanningSarifsStatus.analysesUrl)
                && Objects.equals(this.errors, codeScanningSarifsStatus.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processingStatus, analysesUrl, errors);
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
