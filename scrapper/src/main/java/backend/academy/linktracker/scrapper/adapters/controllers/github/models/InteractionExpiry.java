package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;

/**
 * The duration of the interaction restriction. Default: `one_day`.
 */
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public enum InteractionExpiry {
    ONE_DAY("one_day"),

    THREE_DAYS("three_days"),

    ONE_WEEK("one_week"),

    ONE_MONTH("one_month"),

    SIX_MONTHS("six_months");

    private final String value;

    InteractionExpiry(String value) {
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
    public static InteractionExpiry fromValue(String value) {
        for (InteractionExpiry b : InteractionExpiry.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
