package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.annotation.Generated;

/**
 * **Required when the `state` is `resolved`.** The reason for resolving the alert.
 */
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public enum SecretScanningAlertResolution {
    FALSE_POSITIVE("false_positive"),

    WONT_FIX("wont_fix"),

    REVOKED("revoked"),

    USED_IN_TESTS("used_in_tests");

    private final String value;

    SecretScanningAlertResolution(String value) {
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
    public static SecretScanningAlertResolution fromValue(String value) {
        for (SecretScanningAlertResolution b : SecretScanningAlertResolution.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}
