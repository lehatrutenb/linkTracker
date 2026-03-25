package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;

/**
 * How the author is associated with the repository.
 */
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public enum AuthorAssociation {
    COLLABORATOR("COLLABORATOR"),

    CONTRIBUTOR("CONTRIBUTOR"),

    FIRST_TIMER("FIRST_TIMER"),

    FIRST_TIME_CONTRIBUTOR("FIRST_TIME_CONTRIBUTOR"),

    MANNEQUIN("MANNEQUIN"),

    MEMBER("MEMBER"),

    NONE("NONE"),

    OWNER("OWNER");

    private final String value;

    AuthorAssociation(String value) {
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
    public static AuthorAssociation fromValue(String value) {
        for (AuthorAssociation b : AuthorAssociation.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
