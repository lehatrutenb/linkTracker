package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Dependency
 */
@JsonTypeName("dependency")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Dependency {

    private String packageUrl;

    @Valid
    private Map<String, MetadataValue> metadata = new HashMap<>();

    /**
     * A notation of whether a dependency is requested directly by this manifest or is a dependency of another dependency.
     */
    public enum RelationshipEnum {
        DIRECT("direct"),

        INDIRECT("indirect");

        private final String value;

        RelationshipEnum(String value) {
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
        public static RelationshipEnum fromValue(String value) {
            for (RelationshipEnum b : RelationshipEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private RelationshipEnum relationship;

    /**
     * A notation of whether the dependency is required for the primary build artifact (runtime) or is only used for development. Future versions of this specification may allow for more granular scopes.
     */
    public enum ScopeEnum {
        RUNTIME("runtime"),

        DEVELOPMENT("development");

        private final String value;

        ScopeEnum(String value) {
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
        public static ScopeEnum fromValue(String value) {
            for (ScopeEnum b : ScopeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ScopeEnum scope;

    @Valid
    private List<String> dependencies = new ArrayList<>();

    public Dependency packageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }

    /**
     * Package-url (PURL) of dependency. See https://github.com/package-url/purl-spec for more details.
     * @return packageUrl
     */
    @Pattern(regexp = "^pkg")
    @Schema(
            name = "package_url",
            example = "pkg:/npm/%40actions/http-client@1.0.11",
            description =
                    "Package-url (PURL) of dependency. See https://github.com/package-url/purl-spec for more details.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("package_url")
    public String getPackageUrl() {
        return packageUrl;
    }

    public void setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
    }

    public Dependency metadata(Map<String, MetadataValue> metadata) {
        this.metadata = metadata;
        return this;
    }

    public Dependency putMetadataItem(String key, MetadataValue metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
     * User-defined metadata to store domain-specific information limited to 8 keys with scalar values.
     * @return metadata
     */
    @Valid
    @Size(max = 8)
    @Schema(
            name = "metadata",
            description =
                    "User-defined metadata to store domain-specific information limited to 8 keys with scalar values.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("metadata")
    public Map<String, MetadataValue> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, MetadataValue> metadata) {
        this.metadata = metadata;
    }

    public Dependency relationship(RelationshipEnum relationship) {
        this.relationship = relationship;
        return this;
    }

    /**
     * A notation of whether a dependency is requested directly by this manifest or is a dependency of another dependency.
     * @return relationship
     */
    @Schema(
            name = "relationship",
            example = "direct",
            description =
                    "A notation of whether a dependency is requested directly by this manifest or is a dependency of another dependency.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("relationship")
    public RelationshipEnum getRelationship() {
        return relationship;
    }

    public void setRelationship(RelationshipEnum relationship) {
        this.relationship = relationship;
    }

    public Dependency scope(ScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /**
     * A notation of whether the dependency is required for the primary build artifact (runtime) or is only used for development. Future versions of this specification may allow for more granular scopes.
     * @return scope
     */
    @Schema(
            name = "scope",
            example = "runtime",
            description =
                    "A notation of whether the dependency is required for the primary build artifact (runtime) or is only used for development. Future versions of this specification may allow for more granular scopes.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("scope")
    public ScopeEnum getScope() {
        return scope;
    }

    public void setScope(ScopeEnum scope) {
        this.scope = scope;
    }

    public Dependency dependencies(List<String> dependencies) {
        this.dependencies = dependencies;
        return this;
    }

    public Dependency addDependenciesItem(String dependenciesItem) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<>();
        }
        this.dependencies.add(dependenciesItem);
        return this;
    }

    /**
     * Array of package-url (PURLs) of direct child dependencies.
     * @return dependencies
     */
    @Schema(
            name = "dependencies",
            example = "@actions/http-client",
            description = "Array of package-url (PURLs) of direct child dependencies.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dependencies")
    public List<String> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<String> dependencies) {
        this.dependencies = dependencies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Dependency dependency = (Dependency) o;
        return Objects.equals(this.packageUrl, dependency.packageUrl)
                && Objects.equals(this.metadata, dependency.metadata)
                && Objects.equals(this.relationship, dependency.relationship)
                && Objects.equals(this.scope, dependency.scope)
                && Objects.equals(this.dependencies, dependency.dependencies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageUrl, metadata, relationship, scope, dependencies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Dependency {\n");
        sb.append("    packageUrl: ").append(toIndentedString(packageUrl)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
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
