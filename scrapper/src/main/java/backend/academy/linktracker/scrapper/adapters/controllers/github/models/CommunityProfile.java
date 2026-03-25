package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Community Profile
 */
@Schema(name = "community-profile", description = "Community Profile")
@JsonTypeName("community-profile")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CommunityProfile {

    private Long healthPercentage;

    private String description = null;

    private String documentation = null;

    private CommunityProfileFiles files;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt = null;

    private Boolean contentReportsEnabled;

    public CommunityProfile() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CommunityProfile(
            Long healthPercentage,
            String description,
            String documentation,
            CommunityProfileFiles files,
            OffsetDateTime updatedAt) {
        this.healthPercentage = healthPercentage;
        this.description = description;
        this.documentation = documentation;
        this.files = files;
        this.updatedAt = updatedAt;
    }

    public CommunityProfile healthPercentage(Long healthPercentage) {
        this.healthPercentage = healthPercentage;
        return this;
    }

    /**
     * Get healthPercentage
     * @return healthPercentage
     */
    @NotNull
    @Schema(name = "health_percentage", example = "100", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("health_percentage")
    public Long getHealthPercentage() {
        return healthPercentage;
    }

    public void setHealthPercentage(Long healthPercentage) {
        this.healthPercentage = healthPercentage;
    }

    public CommunityProfile description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(
            name = "description",
            example = "My first repository on GitHub!",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CommunityProfile documentation(String documentation) {
        this.documentation = documentation;
        return this;
    }

    /**
     * Get documentation
     * @return documentation
     */
    @NotNull
    @Schema(name = "documentation", example = "example.com", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("documentation")
    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public CommunityProfile files(CommunityProfileFiles files) {
        this.files = files;
        return this;
    }

    /**
     * Get files
     * @return files
     */
    @NotNull
    @Valid
    @Schema(name = "files", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("files")
    public CommunityProfileFiles getFiles() {
        return files;
    }

    public void setFiles(CommunityProfileFiles files) {
        this.files = files;
    }

    public CommunityProfile updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", example = "2017-02-28T19:09:29Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CommunityProfile contentReportsEnabled(Boolean contentReportsEnabled) {
        this.contentReportsEnabled = contentReportsEnabled;
        return this;
    }

    /**
     * Get contentReportsEnabled
     * @return contentReportsEnabled
     */
    @Schema(name = "content_reports_enabled", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("content_reports_enabled")
    public Boolean getContentReportsEnabled() {
        return contentReportsEnabled;
    }

    public void setContentReportsEnabled(Boolean contentReportsEnabled) {
        this.contentReportsEnabled = contentReportsEnabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommunityProfile communityProfile = (CommunityProfile) o;
        return Objects.equals(this.healthPercentage, communityProfile.healthPercentage)
                && Objects.equals(this.description, communityProfile.description)
                && Objects.equals(this.documentation, communityProfile.documentation)
                && Objects.equals(this.files, communityProfile.files)
                && Objects.equals(this.updatedAt, communityProfile.updatedAt)
                && Objects.equals(this.contentReportsEnabled, communityProfile.contentReportsEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(healthPercentage, description, documentation, files, updatedAt, contentReportsEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommunityProfile {\n");
        sb.append("    healthPercentage: ")
                .append(toIndentedString(healthPercentage))
                .append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    contentReportsEnabled: ")
                .append(toIndentedString(contentReportsEnabled))
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
