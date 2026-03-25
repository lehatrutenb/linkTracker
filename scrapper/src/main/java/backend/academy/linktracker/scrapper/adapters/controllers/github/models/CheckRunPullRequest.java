package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * CheckRunPullRequest
 */
@JsonTypeName("Check_Run_Pull_Request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CheckRunPullRequest {

    private CheckRunPullRequestBase base;

    private CheckRunPullRequestBase head;

    private Long id;

    private Long number;

    private URI url;

    public CheckRunPullRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CheckRunPullRequest(
            CheckRunPullRequestBase base, CheckRunPullRequestBase head, Long id, Long number, URI url) {
        this.base = base;
        this.head = head;
        this.id = id;
        this.number = number;
        this.url = url;
    }

    public CheckRunPullRequest base(CheckRunPullRequestBase base) {
        this.base = base;
        return this;
    }

    /**
     * Get base
     * @return base
     */
    @NotNull
    @Valid
    @Schema(name = "base", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("base")
    public CheckRunPullRequestBase getBase() {
        return base;
    }

    public void setBase(CheckRunPullRequestBase base) {
        this.base = base;
    }

    public CheckRunPullRequest head(CheckRunPullRequestBase head) {
        this.head = head;
        return this;
    }

    /**
     * Get head
     * @return head
     */
    @NotNull
    @Valid
    @Schema(name = "head", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head")
    public CheckRunPullRequestBase getHead() {
        return head;
    }

    public void setHead(CheckRunPullRequestBase head) {
        this.head = head;
    }

    public CheckRunPullRequest id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CheckRunPullRequest number(Long number) {
        this.number = number;
        return this;
    }

    /**
     * Get number
     * @return number
     */
    @NotNull
    @Schema(name = "number", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public CheckRunPullRequest url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckRunPullRequest checkRunPullRequest = (CheckRunPullRequest) o;
        return Objects.equals(this.base, checkRunPullRequest.base)
                && Objects.equals(this.head, checkRunPullRequest.head)
                && Objects.equals(this.id, checkRunPullRequest.id)
                && Objects.equals(this.number, checkRunPullRequest.number)
                && Objects.equals(this.url, checkRunPullRequest.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, head, id, number, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckRunPullRequest {\n");
        sb.append("    base: ").append(toIndentedString(base)).append("\n");
        sb.append("    head: ").append(toIndentedString(head)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
