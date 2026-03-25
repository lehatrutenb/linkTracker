package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * SecretScanningLocation
 */
@JsonTypeName("secret-scanning-location")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningLocation {

    /**
     * The location type. Because secrets may be found in different types of resources (ie. code, comments, issues, pull requests, discussions), this field identifies the type of resource where the secret was found.
     */
    public enum TypeEnum {
        COMMIT("commit"),

        WIKI_COMMIT("wiki_commit"),

        ISSUE_TITLE("issue_title"),

        ISSUE_BODY("issue_body"),

        ISSUE_COMMENT("issue_comment"),

        DISCUSSION_TITLE("discussion_title"),

        DISCUSSION_BODY("discussion_body"),

        DISCUSSION_COMMENT("discussion_comment"),

        PULL_REQUEST_TITLE("pull_request_title"),

        PULL_REQUEST_BODY("pull_request_body"),

        PULL_REQUEST_COMMENT("pull_request_comment"),

        PULL_REQUEST_REVIEW("pull_request_review"),

        PULL_REQUEST_REVIEW_COMMENT("pull_request_review_comment");

        private final String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private TypeEnum type;

    private SecretScanningLocationDetails details;

    public SecretScanningLocation type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The location type. Because secrets may be found in different types of resources (ie. code, comments, issues, pull requests, discussions), this field identifies the type of resource where the secret was found.
     * @return type
     */
    @Schema(
            name = "type",
            example = "commit",
            description =
                    "The location type. Because secrets may be found in different types of resources (ie. code, comments, issues, pull requests, discussions), this field identifies the type of resource where the secret was found.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public SecretScanningLocation details(SecretScanningLocationDetails details) {
        this.details = details;
        return this;
    }

    /**
     * Get details
     * @return details
     */
    @Valid
    @Schema(name = "details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("details")
    public SecretScanningLocationDetails getDetails() {
        return details;
    }

    public void setDetails(SecretScanningLocationDetails details) {
        this.details = details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretScanningLocation secretScanningLocation = (SecretScanningLocation) o;
        return Objects.equals(this.type, secretScanningLocation.type)
                && Objects.equals(this.details, secretScanningLocation.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, details);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningLocation {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
