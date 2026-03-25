package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;

/**
 * State of a code scanning alert.
 */
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public enum CodeScanningAlertState {
    OPEN("open"),

    DISMISSED("dismissed"),

    FIXED("fixed");

    private final String value;

    CodeScanningAlertState(String value) {
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
    public static CodeScanningAlertState fromValue(String value) {
        for (CodeScanningAlertState b : CodeScanningAlertState.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}
