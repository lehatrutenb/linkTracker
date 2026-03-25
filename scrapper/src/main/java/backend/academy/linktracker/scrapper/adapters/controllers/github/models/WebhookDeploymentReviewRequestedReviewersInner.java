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
 * WebhookDeploymentReviewRequestedReviewersInner
 */
@JsonTypeName("webhook_deployment_review_requested_reviewers_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookDeploymentReviewRequestedReviewersInner {

    private User6 reviewer = null;

    /**
     * Gets or Sets type
     */
    public enum TypeEnum {
        USER("User"),

        TEAM("Team");

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

    public WebhookDeploymentReviewRequestedReviewersInner reviewer(User6 reviewer) {
        this.reviewer = reviewer;
        return this;
    }

    /**
     * Get reviewer
     * @return reviewer
     */
    @Valid
    @Schema(name = "reviewer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reviewer")
    public User6 getReviewer() {
        return reviewer;
    }

    public void setReviewer(User6 reviewer) {
        this.reviewer = reviewer;
    }

    public WebhookDeploymentReviewRequestedReviewersInner type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookDeploymentReviewRequestedReviewersInner webhookDeploymentReviewRequestedReviewersInner =
                (WebhookDeploymentReviewRequestedReviewersInner) o;
        return Objects.equals(this.reviewer, webhookDeploymentReviewRequestedReviewersInner.reviewer)
                && Objects.equals(this.type, webhookDeploymentReviewRequestedReviewersInner.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviewer, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookDeploymentReviewRequestedReviewersInner {\n");
        sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
