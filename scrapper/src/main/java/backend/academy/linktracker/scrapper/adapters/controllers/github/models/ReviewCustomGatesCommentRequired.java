package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ReviewCustomGatesCommentRequired
 */
@JsonTypeName("review-custom-gates-comment-required")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReviewCustomGatesCommentRequired {

    private String environmentName;

    private String comment;

    public ReviewCustomGatesCommentRequired() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReviewCustomGatesCommentRequired(String environmentName, String comment) {
        this.environmentName = environmentName;
        this.comment = comment;
    }

    public ReviewCustomGatesCommentRequired environmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * The name of the environment to approve or reject.
     * @return environmentName
     */
    @NotNull
    @Schema(
            name = "environment_name",
            description = "The name of the environment to approve or reject.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("environment_name")
    public String getEnvironmentName() {
        return environmentName;
    }

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    public ReviewCustomGatesCommentRequired comment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Comment associated with the pending deployment protection rule. **Required when state is not provided.**
     * @return comment
     */
    @NotNull
    @Schema(
            name = "comment",
            description =
                    "Comment associated with the pending deployment protection rule. **Required when state is not provided.**",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReviewCustomGatesCommentRequired reviewCustomGatesCommentRequired = (ReviewCustomGatesCommentRequired) o;
        return Objects.equals(this.environmentName, reviewCustomGatesCommentRequired.environmentName)
                && Objects.equals(this.comment, reviewCustomGatesCommentRequired.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(environmentName, comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReviewCustomGatesCommentRequired {\n");
        sb.append("    environmentName: ")
                .append(toIndentedString(environmentName))
                .append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
