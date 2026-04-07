package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.annotation.Generated;

/**
 * The new status of the CodeQL variant analysis repository task.
 */
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public enum CodeScanningVariantAnalysisStatus {
    PENDING("pending"),

    IN_PROGRESS("in_progress"),

    SUCCEEDED("succeeded"),

    FAILED("failed"),

    CANCELED("canceled"),

    TIMED_OUT("timed_out");

    private final String value;

    CodeScanningVariantAnalysisStatus(String value) {
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
    public static CodeScanningVariantAnalysisStatus fromValue(String value) {
        for (CodeScanningVariantAnalysisStatus b : CodeScanningVariantAnalysisStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
