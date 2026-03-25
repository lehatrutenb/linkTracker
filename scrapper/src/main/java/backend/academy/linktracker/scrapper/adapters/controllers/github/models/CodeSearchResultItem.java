package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Code Search Result Item
 */
@Schema(name = "code-search-result-item", description = "Code Search Result Item")
@JsonTypeName("code-search-result-item")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeSearchResultItem {

    private String name;

    private String path;

    private String sha;

    private URI url;

    private URI gitUrl;

    private URI htmlUrl;

    private MinimalRepository repository;

    private BigDecimal score;

    private Long fileSize;

    private String language = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime lastModifiedAt;

    @Valid
    private List<String> lineNumbers = new ArrayList<>();

    @Valid
    private List<@Valid SearchResultTextMatchesInner> textMatches = new ArrayList<>();

    public CodeSearchResultItem() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodeSearchResultItem(
            String name,
            String path,
            String sha,
            URI url,
            URI gitUrl,
            URI htmlUrl,
            MinimalRepository repository,
            BigDecimal score) {
        this.name = name;
        this.path = path;
        this.sha = sha;
        this.url = url;
        this.gitUrl = gitUrl;
        this.htmlUrl = htmlUrl;
        this.repository = repository;
        this.score = score;
    }

    public CodeSearchResultItem name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CodeSearchResultItem path(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get path
     * @return path
     */
    @NotNull
    @Schema(name = "path", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public CodeSearchResultItem sha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * Get sha
     * @return sha
     */
    @NotNull
    @Schema(name = "sha", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public CodeSearchResultItem url(URI url) {
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

    public CodeSearchResultItem gitUrl(URI gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    /**
     * Get gitUrl
     * @return gitUrl
     */
    @NotNull
    @Valid
    @Schema(name = "git_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("git_url")
    public URI getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(URI gitUrl) {
        this.gitUrl = gitUrl;
    }

    public CodeSearchResultItem htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public CodeSearchResultItem repository(MinimalRepository repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @NotNull
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository")
    public MinimalRepository getRepository() {
        return repository;
    }

    public void setRepository(MinimalRepository repository) {
        this.repository = repository;
    }

    public CodeSearchResultItem score(BigDecimal score) {
        this.score = score;
        return this;
    }

    /**
     * Get score
     * @return score
     */
    @NotNull
    @Valid
    @Schema(name = "score", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("score")
    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public CodeSearchResultItem fileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * Get fileSize
     * @return fileSize
     */
    @Schema(name = "file_size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("file_size")
    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public CodeSearchResultItem language(String language) {
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

    public CodeSearchResultItem lastModifiedAt(OffsetDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     * Get lastModifiedAt
     * @return lastModifiedAt
     */
    @Valid
    @Schema(name = "last_modified_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("last_modified_at")
    public OffsetDateTime getLastModifiedAt() {
        return lastModifiedAt;
    }

    public void setLastModifiedAt(OffsetDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public CodeSearchResultItem lineNumbers(List<String> lineNumbers) {
        this.lineNumbers = lineNumbers;
        return this;
    }

    public CodeSearchResultItem addLineNumbersItem(String lineNumbersItem) {
        if (this.lineNumbers == null) {
            this.lineNumbers = new ArrayList<>();
        }
        this.lineNumbers.add(lineNumbersItem);
        return this;
    }

    /**
     * Get lineNumbers
     * @return lineNumbers
     */
    @Schema(name = "line_numbers", example = "[\"73..77\",\"77..78\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("line_numbers")
    public List<String> getLineNumbers() {
        return lineNumbers;
    }

    public void setLineNumbers(List<String> lineNumbers) {
        this.lineNumbers = lineNumbers;
    }

    public CodeSearchResultItem textMatches(List<@Valid SearchResultTextMatchesInner> textMatches) {
        this.textMatches = textMatches;
        return this;
    }

    public CodeSearchResultItem addTextMatchesItem(SearchResultTextMatchesInner textMatchesItem) {
        if (this.textMatches == null) {
            this.textMatches = new ArrayList<>();
        }
        this.textMatches.add(textMatchesItem);
        return this;
    }

    /**
     * Get textMatches
     * @return textMatches
     */
    @Valid
    @Schema(name = "text_matches", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("text_matches")
    public List<@Valid SearchResultTextMatchesInner> getTextMatches() {
        return textMatches;
    }

    public void setTextMatches(List<@Valid SearchResultTextMatchesInner> textMatches) {
        this.textMatches = textMatches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeSearchResultItem codeSearchResultItem = (CodeSearchResultItem) o;
        return Objects.equals(this.name, codeSearchResultItem.name)
                && Objects.equals(this.path, codeSearchResultItem.path)
                && Objects.equals(this.sha, codeSearchResultItem.sha)
                && Objects.equals(this.url, codeSearchResultItem.url)
                && Objects.equals(this.gitUrl, codeSearchResultItem.gitUrl)
                && Objects.equals(this.htmlUrl, codeSearchResultItem.htmlUrl)
                && Objects.equals(this.repository, codeSearchResultItem.repository)
                && Objects.equals(this.score, codeSearchResultItem.score)
                && Objects.equals(this.fileSize, codeSearchResultItem.fileSize)
                && Objects.equals(this.language, codeSearchResultItem.language)
                && Objects.equals(this.lastModifiedAt, codeSearchResultItem.lastModifiedAt)
                && Objects.equals(this.lineNumbers, codeSearchResultItem.lineNumbers)
                && Objects.equals(this.textMatches, codeSearchResultItem.textMatches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                path,
                sha,
                url,
                gitUrl,
                htmlUrl,
                repository,
                score,
                fileSize,
                language,
                lastModifiedAt,
                lineNumbers,
                textMatches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeSearchResultItem {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    lastModifiedAt: ")
                .append(toIndentedString(lastModifiedAt))
                .append("\n");
        sb.append("    lineNumbers: ").append(toIndentedString(lineNumbers)).append("\n");
        sb.append("    textMatches: ").append(toIndentedString(textMatches)).append("\n");
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
