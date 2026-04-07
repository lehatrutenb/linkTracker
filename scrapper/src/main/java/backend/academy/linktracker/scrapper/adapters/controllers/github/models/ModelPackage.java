package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A software package
 */
@Schema(name = "_package", description = "A software package")
@JsonTypeName("_package")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ModelPackage {

    private Long id;

    private String name;

    /**
     * Gets or Sets packageType
     */
    public enum PackageTypeEnum {
        NPM("npm"),

        MAVEN("maven"),

        RUBYGEMS("rubygems"),

        DOCKER("docker"),

        NUGET("nuget"),

        CONTAINER("container");

        private final String value;

        PackageTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PackageTypeEnum fromValue(String value) {
            for (PackageTypeEnum b : PackageTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private PackageTypeEnum packageType;

    private String url;

    private String htmlUrl;

    private Long versionCount;

    /**
     * Gets or Sets visibility
     */
    public enum VisibilityEnum {
        PRIVATE("private"),

        PUBLIC("public");

        private final String value;

        VisibilityEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VisibilityEnum fromValue(String value) {
            for (VisibilityEnum b : VisibilityEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private VisibilityEnum visibility;

    private JsonNullable<NullableSimpleUser> owner = JsonNullable.<NullableSimpleUser>undefined();

    private JsonNullable<NullableMinimalRepository> repository = JsonNullable.<NullableMinimalRepository>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    public ModelPackage() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ModelPackage(
            Long id,
            String name,
            PackageTypeEnum packageType,
            String url,
            String htmlUrl,
            Long versionCount,
            VisibilityEnum visibility,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.packageType = packageType;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.versionCount = versionCount;
        this.visibility = visibility;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public ModelPackage id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the package.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "1",
            description = "Unique identifier of the package.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ModelPackage name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the package.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "super-linter",
            description = "The name of the package.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModelPackage packageType(PackageTypeEnum packageType) {
        this.packageType = packageType;
        return this;
    }

    /**
     * Get packageType
     * @return packageType
     */
    @NotNull
    @Schema(name = "package_type", example = "docker", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("package_type")
    public PackageTypeEnum getPackageType() {
        return packageType;
    }

    public void setPackageType(PackageTypeEnum packageType) {
        this.packageType = packageType;
    }

    public ModelPackage url(String url) {
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
            example = "https://api.github.com/orgs/github/packages/container/super-linter",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ModelPackage htmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Schema(
            name = "html_url",
            example = "https://github.com/orgs/github/packages/container/package/super-linter",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public ModelPackage versionCount(Long versionCount) {
        this.versionCount = versionCount;
        return this;
    }

    /**
     * The number of versions of the package.
     * @return versionCount
     */
    @NotNull
    @Schema(
            name = "version_count",
            example = "1",
            description = "The number of versions of the package.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("version_count")
    public Long getVersionCount() {
        return versionCount;
    }

    public void setVersionCount(Long versionCount) {
        this.versionCount = versionCount;
    }

    public ModelPackage visibility(VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Get visibility
     * @return visibility
     */
    @NotNull
    @Schema(name = "visibility", example = "private", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("visibility")
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public ModelPackage owner(NullableSimpleUser owner) {
        this.owner = JsonNullable.of(owner);
        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    @Valid
    @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("owner")
    public JsonNullable<NullableSimpleUser> getOwner() {
        return owner;
    }

    public void setOwner(JsonNullable<NullableSimpleUser> owner) {
        this.owner = owner;
    }

    public ModelPackage repository(NullableMinimalRepository repository) {
        this.repository = JsonNullable.of(repository);
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public JsonNullable<NullableMinimalRepository> getRepository() {
        return repository;
    }

    public void setRepository(JsonNullable<NullableMinimalRepository> repository) {
        this.repository = repository;
    }

    public ModelPackage createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ModelPackage updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModelPackage _package = (ModelPackage) o;
        return Objects.equals(this.id, _package.id)
                && Objects.equals(this.name, _package.name)
                && Objects.equals(this.packageType, _package.packageType)
                && Objects.equals(this.url, _package.url)
                && Objects.equals(this.htmlUrl, _package.htmlUrl)
                && Objects.equals(this.versionCount, _package.versionCount)
                && Objects.equals(this.visibility, _package.visibility)
                && equalsNullable(this.owner, _package.owner)
                && equalsNullable(this.repository, _package.repository)
                && Objects.equals(this.createdAt, _package.createdAt)
                && Objects.equals(this.updatedAt, _package.updatedAt);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                name,
                packageType,
                url,
                htmlUrl,
                versionCount,
                visibility,
                hashCodeNullable(owner),
                hashCodeNullable(repository),
                createdAt,
                updatedAt);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelPackage {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    versionCount: ").append(toIndentedString(versionCount)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
