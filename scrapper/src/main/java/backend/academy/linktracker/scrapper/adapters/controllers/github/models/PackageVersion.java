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
 * A version of a software package
 */
@Schema(name = "package-version", description = "A version of a software package")
@JsonTypeName("package-version")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PackageVersion {

    private Long id;

    private String name;

    private String url;

    private String packageHtmlUrl;

    private String htmlUrl;

    private String license;

    private String description;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime deletedAt;

    private PackageVersionMetadata metadata;

    public PackageVersion() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PackageVersion(
            Long id,
            String name,
            String url,
            String packageHtmlUrl,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.packageHtmlUrl = packageHtmlUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public PackageVersion id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the package version.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "1",
            description = "Unique identifier of the package version.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PackageVersion name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the package version.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "latest",
            description = "The name of the package version.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PackageVersion url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Schema(
            name = "url",
            example = "https://api.github.com/orgs/github/packages/container/super-linter/versions/786068",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PackageVersion packageHtmlUrl(String packageHtmlUrl) {
        this.packageHtmlUrl = packageHtmlUrl;
        return this;
    }

    /**
     * Get packageHtmlUrl
     * @return packageHtmlUrl
     */
    @NotNull
    @Schema(
            name = "package_html_url",
            example = "https://github.com/orgs/github/packages/container/package/super-linter",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("package_html_url")
    public String getPackageHtmlUrl() {
        return packageHtmlUrl;
    }

    public void setPackageHtmlUrl(String packageHtmlUrl) {
        this.packageHtmlUrl = packageHtmlUrl;
    }

    public PackageVersion htmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Schema(
            name = "html_url",
            example = "https://github.com/orgs/github/packages/container/super-linter/786068",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public PackageVersion license(String license) {
        this.license = license;
        return this;
    }

    /**
     * Get license
     * @return license
     */
    @Schema(name = "license", example = "MIT", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("license")
    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public PackageVersion description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PackageVersion createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", example = "2011-04-10T20:09:31Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public PackageVersion updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", example = "2014-03-03T18:58:10Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public PackageVersion deletedAt(OffsetDateTime deletedAt) {
        this.deletedAt = deletedAt;
        return this;
    }

    /**
     * Get deletedAt
     * @return deletedAt
     */
    @Valid
    @Schema(name = "deleted_at", example = "2014-03-03T18:58:10Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deleted_at")
    public OffsetDateTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(OffsetDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    public PackageVersion metadata(PackageVersionMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    @Valid
    @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("metadata")
    public PackageVersionMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(PackageVersionMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PackageVersion packageVersion = (PackageVersion) o;
        return Objects.equals(this.id, packageVersion.id)
                && Objects.equals(this.name, packageVersion.name)
                && Objects.equals(this.url, packageVersion.url)
                && Objects.equals(this.packageHtmlUrl, packageVersion.packageHtmlUrl)
                && Objects.equals(this.htmlUrl, packageVersion.htmlUrl)
                && Objects.equals(this.license, packageVersion.license)
                && Objects.equals(this.description, packageVersion.description)
                && Objects.equals(this.createdAt, packageVersion.createdAt)
                && Objects.equals(this.updatedAt, packageVersion.updatedAt)
                && Objects.equals(this.deletedAt, packageVersion.deletedAt)
                && Objects.equals(this.metadata, packageVersion.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                name,
                url,
                packageHtmlUrl,
                htmlUrl,
                license,
                description,
                createdAt,
                updatedAt,
                deletedAt,
                metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PackageVersion {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    packageHtmlUrl: ")
                .append(toIndentedString(packageHtmlUrl))
                .append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    license: ").append(toIndentedString(license)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
