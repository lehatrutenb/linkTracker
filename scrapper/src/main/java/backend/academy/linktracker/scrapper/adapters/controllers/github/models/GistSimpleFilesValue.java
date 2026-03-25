package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * GistSimpleFilesValue
 */
@JsonTypeName("gist_simple_files_value")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GistSimpleFilesValue {

    private String filename;

    private String type;

    private String language;

    private String rawUrl;

    private Long size;

    private Boolean truncated;

    private String content;

    private String encoding = "utf-8";

    public GistSimpleFilesValue filename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * Get filename
     * @return filename
     */
    @Schema(name = "filename", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("filename")
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public GistSimpleFilesValue type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GistSimpleFilesValue language(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get language
     * @return language
     */
    @Schema(name = "language", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public GistSimpleFilesValue rawUrl(String rawUrl) {
        this.rawUrl = rawUrl;
        return this;
    }

    /**
     * Get rawUrl
     * @return rawUrl
     */
    @Schema(name = "raw_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("raw_url")
    public String getRawUrl() {
        return rawUrl;
    }

    public void setRawUrl(String rawUrl) {
        this.rawUrl = rawUrl;
    }

    public GistSimpleFilesValue size(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get size
     * @return size
     */
    @Schema(name = "size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("size")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public GistSimpleFilesValue truncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }

    /**
     * Get truncated
     * @return truncated
     */
    @Schema(name = "truncated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("truncated")
    public Boolean getTruncated() {
        return truncated;
    }

    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    public GistSimpleFilesValue content(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get content
     * @return content
     */
    @Schema(name = "content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public GistSimpleFilesValue encoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * The encoding used for `content`. Currently, `\"utf-8\"` and `\"base64\"` are supported.
     * @return encoding
     */
    @Schema(
            name = "encoding",
            description = "The encoding used for `content`. Currently, `\"utf-8\"` and `\"base64\"` are supported.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("encoding")
    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GistSimpleFilesValue gistSimpleFilesValue = (GistSimpleFilesValue) o;
        return Objects.equals(this.filename, gistSimpleFilesValue.filename)
                && Objects.equals(this.type, gistSimpleFilesValue.type)
                && Objects.equals(this.language, gistSimpleFilesValue.language)
                && Objects.equals(this.rawUrl, gistSimpleFilesValue.rawUrl)
                && Objects.equals(this.size, gistSimpleFilesValue.size)
                && Objects.equals(this.truncated, gistSimpleFilesValue.truncated)
                && Objects.equals(this.content, gistSimpleFilesValue.content)
                && Objects.equals(this.encoding, gistSimpleFilesValue.encoding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filename, type, language, rawUrl, size, truncated, content, encoding);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GistSimpleFilesValue {\n");
        sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    rawUrl: ").append(toIndentedString(rawUrl)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    truncated: ").append(toIndentedString(truncated)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
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
