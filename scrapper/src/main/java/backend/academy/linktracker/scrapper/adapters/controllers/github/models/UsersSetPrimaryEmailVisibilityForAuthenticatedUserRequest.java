package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * UsersSetPrimaryEmailVisibilityForAuthenticatedUserRequest
 */
@JsonTypeName("users_set_primary_email_visibility_for_authenticated_user_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class UsersSetPrimaryEmailVisibilityForAuthenticatedUserRequest {

    /**
     * Denotes whether an email is publicly visible.
     */
    public enum VisibilityEnum {
        PUBLIC("public"),

        PRIVATE("private");

        private final String value;

        VisibilityEnum(String value) {
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
        public static VisibilityEnum fromValue(String value) {
            for (VisibilityEnum b : VisibilityEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private VisibilityEnum visibility;

    public UsersSetPrimaryEmailVisibilityForAuthenticatedUserRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public UsersSetPrimaryEmailVisibilityForAuthenticatedUserRequest(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public UsersSetPrimaryEmailVisibilityForAuthenticatedUserRequest visibility(VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Denotes whether an email is publicly visible.
     * @return visibility
     */
    @NotNull
    @Schema(
            name = "visibility",
            description = "Denotes whether an email is publicly visible.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("visibility")
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UsersSetPrimaryEmailVisibilityForAuthenticatedUserRequest
                usersSetPrimaryEmailVisibilityForAuthenticatedUserRequest =
                        (UsersSetPrimaryEmailVisibilityForAuthenticatedUserRequest) o;
        return Objects.equals(this.visibility, usersSetPrimaryEmailVisibilityForAuthenticatedUserRequest.visibility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(visibility);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsersSetPrimaryEmailVisibilityForAuthenticatedUserRequest {\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
