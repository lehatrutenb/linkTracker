package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * WorkflowRunPullRequestsInner
 */
@JsonTypeName("Workflow_Run_pull_requests_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WorkflowRunPullRequestsInner {

    private CheckRunPullRequestBase base;

    private CheckRunPullRequestBase head;

    private BigDecimal id;

    private BigDecimal number;

    private URI url;

    public WorkflowRunPullRequestsInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WorkflowRunPullRequestsInner(
            CheckRunPullRequestBase base, CheckRunPullRequestBase head, BigDecimal id, BigDecimal number, URI url) {
        this.base = base;
        this.head = head;
        this.id = id;
        this.number = number;
        this.url = url;
    }

    public WorkflowRunPullRequestsInner base(CheckRunPullRequestBase base) {
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

    public WorkflowRunPullRequestsInner head(CheckRunPullRequestBase head) {
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

    public WorkflowRunPullRequestsInner id(BigDecimal id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Valid
    @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public WorkflowRunPullRequestsInner number(BigDecimal number) {
        this.number = number;
        return this;
    }

    /**
     * Get number
     * @return number
     */
    @NotNull
    @Valid
    @Schema(name = "number", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("number")
    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    public WorkflowRunPullRequestsInner url(URI url) {
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
        WorkflowRunPullRequestsInner workflowRunPullRequestsInner = (WorkflowRunPullRequestsInner) o;
        return Objects.equals(this.base, workflowRunPullRequestsInner.base)
                && Objects.equals(this.head, workflowRunPullRequestsInner.head)
                && Objects.equals(this.id, workflowRunPullRequestsInner.id)
                && Objects.equals(this.number, workflowRunPullRequestsInner.number)
                && Objects.equals(this.url, workflowRunPullRequestsInner.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, head, id, number, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowRunPullRequestsInner {\n");
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
