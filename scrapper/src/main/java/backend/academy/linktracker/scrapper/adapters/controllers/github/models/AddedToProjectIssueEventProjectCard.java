package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;
import java.util.Optional;

/**
 * AddedToProjectIssueEventProjectCard
 */
@JsonTypeName("added_to_project_issue_event_project_card")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class AddedToProjectIssueEventProjectCard {

    private Long id;

    private URI url;

    private Long projectId;

    private URI projectUrl;

    private String columnName;

    private Optional<String> previousColumnName = Optional.empty();

    public AddedToProjectIssueEventProjectCard() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public AddedToProjectIssueEventProjectCard(Long id, URI url, Long projectId, URI projectUrl, String columnName) {
        this.id = id;
        this.url = url;
        this.projectId = projectId;
        this.projectUrl = projectUrl;
        this.columnName = columnName;
    }

    public AddedToProjectIssueEventProjectCard id(Long id) {
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

    public AddedToProjectIssueEventProjectCard url(URI url) {
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

    public AddedToProjectIssueEventProjectCard projectId(Long projectId) {
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

    public AddedToProjectIssueEventProjectCard projectUrl(URI projectUrl) {
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

    public AddedToProjectIssueEventProjectCard columnName(String columnName) {
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

    public AddedToProjectIssueEventProjectCard previousColumnName(String previousColumnName) {
        this.previousColumnName = Optional.ofNullable(previousColumnName);
        return this;
    }

    /**
     * Get previousColumnName
     * @return previousColumnName
     */
    @Schema(name = "previous_column_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("previous_column_name")
    public Optional<String> getPreviousColumnName() {
        return previousColumnName;
    }

    public void setPreviousColumnName(Optional<String> previousColumnName) {
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
        AddedToProjectIssueEventProjectCard addedToProjectIssueEventProjectCard =
                (AddedToProjectIssueEventProjectCard) o;
        return Objects.equals(this.id, addedToProjectIssueEventProjectCard.id)
                && Objects.equals(this.url, addedToProjectIssueEventProjectCard.url)
                && Objects.equals(this.projectId, addedToProjectIssueEventProjectCard.projectId)
                && Objects.equals(this.projectUrl, addedToProjectIssueEventProjectCard.projectUrl)
                && Objects.equals(this.columnName, addedToProjectIssueEventProjectCard.columnName)
                && Objects.equals(this.previousColumnName, addedToProjectIssueEventProjectCard.previousColumnName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url, projectId, projectUrl, columnName, previousColumnName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddedToProjectIssueEventProjectCard {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectUrl: ").append(toIndentedString(projectUrl)).append("\n");
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
