package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;

/**
 * The reason for bypassing push protection.
 */
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public enum SecretScanningPushProtectionBypassReason {
    FALSE_POSITIVE("false_positive"),

    USED_IN_TESTS("used_in_tests"),

    WILL_FIX_LATER("will_fix_later");

    private final String value;

    SecretScanningPushProtectionBypassReason(String value) {
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
    public static SecretScanningPushProtectionBypassReason fromValue(String value) {
        for (SecretScanningPushProtectionBypassReason b : SecretScanningPushProtectionBypassReason.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
