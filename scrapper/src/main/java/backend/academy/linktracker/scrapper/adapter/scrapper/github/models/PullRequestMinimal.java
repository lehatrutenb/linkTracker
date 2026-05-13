package backend.academy.linktracker.scrapper.adapter.scrapper.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.Objects;

/**
 * PullRequestMinimal
 */
@JsonTypeName("Pull_Request_Minimal")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequestMinimal {

    private Long id;

    private Long number;

    private String url;

    private PullRequestMinimalHead head;

    private PullRequestMinimalHead base;

    public PullRequestMinimal() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequestMinimal(
            Long id, Long number, String url, PullRequestMinimalHead head, PullRequestMinimalHead base) {
        this.id = id;
        this.number = number;
        this.url = url;
        this.head = head;
        this.base = base;
    }

    public PullRequestMinimal id(Long id) {
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

    public PullRequestMinimal number(Long number) {
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

    public PullRequestMinimal url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PullRequestMinimal head(PullRequestMinimalHead head) {
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
    public PullRequestMinimalHead getHead() {
        return head;
    }

    public void setHead(PullRequestMinimalHead head) {
        this.head = head;
    }

    public PullRequestMinimal base(PullRequestMinimalHead base) {
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
    public PullRequestMinimalHead getBase() {
        return base;
    }

    public void setBase(PullRequestMinimalHead base) {
        this.base = base;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PullRequestMinimal pullRequestMinimal = (PullRequestMinimal) o;
        return Objects.equals(this.id, pullRequestMinimal.id)
                && Objects.equals(this.number, pullRequestMinimal.number)
                && Objects.equals(this.url, pullRequestMinimal.url)
                && Objects.equals(this.head, pullRequestMinimal.head)
                && Objects.equals(this.base, pullRequestMinimal.base);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, url, head, base);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullRequestMinimal {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    head: ").append(toIndentedString(head)).append("\n");
        sb.append("    base: ").append(toIndentedString(base)).append("\n");
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
