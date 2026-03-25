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
 * Code of Conduct Simple
 */
@Schema(name = "nullable-code-of-conduct-simple", description = "Code of Conduct Simple")
@JsonTypeName("nullable-code-of-conduct-simple")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class NullableCodeOfConductSimple {

    private URI url;

    private String key;

    private String name;

    private URI htmlUrl = null;

    public NullableCodeOfConductSimple() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public NullableCodeOfConductSimple(URI url, String key, String name, URI htmlUrl) {
        this.url = url;
        this.key = key;
        this.name = name;
        this.htmlUrl = htmlUrl;
    }

    public NullableCodeOfConductSimple url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(
            name = "url",
            example = "https://api.github.com/repos/github/docs/community/code_of_conduct",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public NullableCodeOfConductSimple key(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get key
     * @return key
     */
    @NotNull
    @Schema(name = "key", example = "citizen_code_of_conduct", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public NullableCodeOfConductSimple name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", example = "Citizen Code of Conduct", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NullableCodeOfConductSimple htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "html_url",
            example = "https://github.com/github/docs/blob/main/CODE_OF_CONDUCT.md",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NullableCodeOfConductSimple nullableCodeOfConductSimple = (NullableCodeOfConductSimple) o;
        return Objects.equals(this.url, nullableCodeOfConductSimple.url)
                && Objects.equals(this.key, nullableCodeOfConductSimple.key)
                && Objects.equals(this.name, nullableCodeOfConductSimple.name)
                && Objects.equals(this.htmlUrl, nullableCodeOfConductSimple.htmlUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, key, name, htmlUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NullableCodeOfConductSimple {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
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
