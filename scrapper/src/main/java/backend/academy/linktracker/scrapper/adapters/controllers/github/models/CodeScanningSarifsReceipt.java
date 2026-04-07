package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.net.URI;
import java.util.Objects;
import java.util.Optional;

/**
 * CodeScanningSarifsReceipt
 */
@JsonTypeName("code-scanning-sarifs-receipt")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningSarifsReceipt {

    private Optional<String> id = Optional.empty();

    private Optional<URI> url = Optional.empty();

    public CodeScanningSarifsReceipt id(String id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * An identifier for the upload.
     * @return id
     */
    @Schema(
            name = "id",
            example = "6c81cd8e-b078-4ac3-a3be-1dad7dbd0b53",
            description = "An identifier for the upload.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    public void setId(Optional<String> id) {
        this.id = id;
    }

    public CodeScanningSarifsReceipt url(URI url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * The REST API URL for checking the status of the upload.
     * @return url
     */
    @Valid
    @Schema(
            name = "url",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The REST API URL for checking the status of the upload.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public Optional<URI> getUrl() {
        return url;
    }

    public void setUrl(Optional<URI> url) {
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
        CodeScanningSarifsReceipt codeScanningSarifsReceipt = (CodeScanningSarifsReceipt) o;
        return Objects.equals(this.id, codeScanningSarifsReceipt.id)
                && Objects.equals(this.url, codeScanningSarifsReceipt.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeScanningSarifsReceipt {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
