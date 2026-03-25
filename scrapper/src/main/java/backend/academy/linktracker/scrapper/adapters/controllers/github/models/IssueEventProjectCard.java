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
 * Issue Event Project Card
 */
@Schema(name = "issue-event-project-card", description = "Issue Event Project Card")
@JsonTypeName("issue-event-project-card")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssueEventProjectCard {

    private URI url;

    private Long id;

    private URI projectUrl;

    private Long projectId;

    private String columnName;

    private String previousColumnName;

    public IssueEventProjectCard() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssueEventProjectCard(URI url, Long id, URI projectUrl, Long projectId, String columnName) {
        this.url = url;
        this.id = id;
        this.projectUrl = projectUrl;
        this.projectId = projectId;
        this.columnName = columnName;
    }

    public IssueEventProjectCard url(URI url) {
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

    public IssueEventProjectCard id(Long id) {
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

    public IssueEventProjectCard projectUrl(URI projectUrl) {
        this.projectUrl = projectUrl;
        return this;
    }

    /**
     * Get projectUrl
     * @return projectUrl
     */
    @NotNull
    @Valid
    @Schema(name = "project_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("project_url")
    public URI getProjectUrl() {
        return projectUrl;
    }

    public void setProjectUrl(URI projectUrl) {
        this.projectUrl = projectUrl;
    }

    public IssueEventProjectCard projectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Get projectId
     * @return projectId
     */
    @NotNull
    @Schema(name = "project_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("project_id")
    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public IssueEventProjectCard columnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * Get columnName
     * @return columnName
     */
    @NotNull
    @Schema(name = "column_name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("column_name")
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public IssueEventProjectCard previousColumnName(String previousColumnName) {
        this.previousColumnName = previousColumnName;
        return this;
    }

    /**
     * Get previousColumnName
     * @return previousColumnName
     */
    @Schema(name = "previous_column_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("previous_column_name")
    public String getPreviousColumnName() {
        return previousColumnName;
    }

    public void setPreviousColumnName(String previousColumnName) {
        this.previousColumnName = previousColumnName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueEventProjectCard issueEventProjectCard = (IssueEventProjectCard) o;
        return Objects.equals(this.url, issueEventProjectCard.url)
                && Objects.equals(this.id, issueEventProjectCard.id)
                && Objects.equals(this.projectUrl, issueEventProjectCard.projectUrl)
                && Objects.equals(this.projectId, issueEventProjectCard.projectId)
                && Objects.equals(this.columnName, issueEventProjectCard.columnName)
                && Objects.equals(this.previousColumnName, issueEventProjectCard.previousColumnName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, id, projectUrl, projectId, columnName, previousColumnName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueEventProjectCard {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectUrl: ").append(toIndentedString(projectUrl)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    previousColumnName: ")
                .append(toIndentedString(previousColumnName))
                .append("\n");
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
