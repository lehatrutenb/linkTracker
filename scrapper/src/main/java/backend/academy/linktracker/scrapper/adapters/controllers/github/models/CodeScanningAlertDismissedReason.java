package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;

/**
 * **Required when the state is dismissed.** The reason for dismissing or closing the alert.
 */
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public enum CodeScanningAlertDismissedReason {
    FALSE_POSITIVE("false positive"),

    WON_T_FIX("won't fix"),

    USED_IN_TESTS("used in tests");

    private final String value;

    CodeScanningAlertDismissedReason(String value) {
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
    public static CodeScanningAlertDismissedReason fromValue(String value) {
        for (CodeScanningAlertDismissedReason b : CodeScanningAlertDismissedReason.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}
