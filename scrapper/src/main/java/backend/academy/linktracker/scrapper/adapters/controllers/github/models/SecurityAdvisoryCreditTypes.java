package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;

/**
 * The type of credit the user is receiving.
 */
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public enum SecurityAdvisoryCreditTypes {
    ANALYST("analyst"),

    FINDER("finder"),

    REPORTER("reporter"),

    COORDINATOR("coordinator"),

    REMEDIATION_DEVELOPER("remediation_developer"),

    REMEDIATION_REVIEWER("remediation_reviewer"),

    REMEDIATION_VERIFIER("remediation_verifier"),

    TOOL("tool"),

    SPONSOR("sponsor"),

    OTHER("other");

    private final String value;

    SecurityAdvisoryCreditTypes(String value) {
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
    public static SecurityAdvisoryCreditTypes fromValue(String value) {
        for (SecurityAdvisoryCreditTypes b : SecurityAdvisoryCreditTypes.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
