package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Community Profile
 */
@Schema(name = "community-profile", description = "Community Profile")
@JsonTypeName("community-profile")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CommunityProfile {

    private Long healthPercentage;

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    private JsonNullable<String> documentation = JsonNullable.<String>undefined();

    private CommunityProfileFiles files;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.<OffsetDateTime>undefined();

    private Optional<Boolean> contentReportsEnabled = Optional.empty();

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
        this.description = JsonNullable.of(description);
        this.documentation = JsonNullable.of(documentation);
        this.files = files;
        this.updatedAt = JsonNullable.of(updatedAt);
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
        this.description = JsonNullable.of(description);
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
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public CommunityProfile documentation(String documentation) {
        this.documentation = JsonNullable.of(documentation);
        return this;
    }

    /**
     * Get documentation
     * @return documentation
     */
    @NotNull
    @Schema(name = "documentation", example = "example.com", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("documentation")
    public JsonNullable<String> getDocumentation() {
        return documentation;
    }

    public void setDocumentation(JsonNullable<String> documentation) {
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
        this.updatedAt = JsonNullable.of(updatedAt);
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
    public JsonNullable<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CommunityProfile contentReportsEnabled(Boolean contentReportsEnabled) {
        this.contentReportsEnabled = Optional.ofNullable(contentReportsEnabled);
        return this;
    }

    /**
     * Get contentReportsEnabled
     * @return contentReportsEnabled
     */
    @Schema(name = "content_reports_enabled", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("content_reports_enabled")
    public Optional<Boolean> getContentReportsEnabled() {
        return contentReportsEnabled;
    }

    public void setContentReportsEnabled(Optional<Boolean> contentReportsEnabled) {
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
