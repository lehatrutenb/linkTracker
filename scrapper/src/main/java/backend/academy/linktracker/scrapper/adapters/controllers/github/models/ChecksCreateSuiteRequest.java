package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ChecksCreateSuiteRequest
 */
@JsonTypeName("checks_create_suite_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ChecksCreateSuiteRequest {

    private String headSha;

    public ChecksCreateSuiteRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ChecksCreateSuiteRequest(String headSha) {
        this.headSha = headSha;
    }

    public ChecksCreateSuiteRequest headSha(String headSha) {
        this.headSha = headSha;
        return this;
    }

    /**
     * The sha of the head commit.
     * @return headSha
     */
    @NotNull
    @Schema(name = "head_sha", description = "The sha of the head commit.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head_sha")
    public String getHeadSha() {
        return headSha;
    }

    public void setHeadSha(String headSha) {
        this.headSha = headSha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChecksCreateSuiteRequest checksCreateSuiteRequest = (ChecksCreateSuiteRequest) o;
        return Objects.equals(this.headSha, checksCreateSuiteRequest.headSha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headSha);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChecksCreateSuiteRequest {\n");
        sb.append("    headSha: ").append(toIndentedString(headSha)).append("\n");
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
