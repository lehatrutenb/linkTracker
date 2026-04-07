package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.annotation.Generated;

/**
 * State of a code scanning alert instance.
 */
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public enum CodeScanningAlertInstanceState {
    OPEN("open"),

    FIXED("fixed");

    private final String value;

    CodeScanningAlertInstanceState(String value) {
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
    public static CodeScanningAlertInstanceState fromValue(String value) {
        for (CodeScanningAlertInstanceState b : CodeScanningAlertInstanceState.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}
