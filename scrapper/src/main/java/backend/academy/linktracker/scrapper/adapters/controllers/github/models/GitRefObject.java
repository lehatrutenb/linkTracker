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
 * GitRefObject
 */
@JsonTypeName("git_ref_object")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GitRefObject {

    private String type;

    private String sha;

    private URI url;

    public GitRefObject() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GitRefObject(String type, String sha, URI url) {
        this.type = type;
        this.sha = sha;
        this.url = url;
    }

    public GitRefObject type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GitRefObject sha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * SHA for the reference
     * @return sha
     */
    @NotNull
    @Size(min = 40, max = 40)
    @Schema(
            name = "sha",
            example = "7638417db6d59f3c431d3e1f261cc637155684cd",
            description = "SHA for the reference",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public GitRefObject url(URI url) {
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
        GitRefObject gitRefObject = (GitRefObject) o;
        return Objects.equals(this.type, gitRefObject.type)
                && Objects.equals(this.sha, gitRefObject.sha)
                && Objects.equals(this.url, gitRefObject.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, sha, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitRefObject {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
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
