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
import java.util.Objects;

/**
 * Details for the vulnerable dependency.
 */
@Schema(name = "dependabot_alert_with_repository_dependency", description = "Details for the vulnerable dependency.")
@JsonTypeName("dependabot_alert_with_repository_dependency")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DependabotAlertWithRepositoryDependency {

    private DependabotAlertPackage _package;

    private String manifestPath;

    /**
     * The execution scope of the vulnerable dependency.
     */
    public enum ScopeEnum {
        DEVELOPMENT("development"),

        RUNTIME("runtime");

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
            return null;
        }
    }

    private ScopeEnum scope = null;

    /**
     * The vulnerable dependency's relationship to your project.  > [!NOTE] > We are rolling out support for dependency relationship across ecosystems. This value will be \"unknown\" for all dependencies in unsupported ecosystems.
     */
    public enum RelationshipEnum {
        UNKNOWN("unknown"),

        DIRECT("direct"),

        TRANSITIVE("transitive");

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
            return null;
        }
    }

    private RelationshipEnum relationship = null;

    public DependabotAlertWithRepositoryDependency _package(DependabotAlertPackage _package) {
        this._package = _package;
        return this;
    }

    /**
     * Get _package
     * @return _package
     */
    @Valid
    @Schema(name = "package", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("package")
    public DependabotAlertPackage getPackage() {
        return _package;
    }

    public void setPackage(DependabotAlertPackage _package) {
        this._package = _package;
    }

    public DependabotAlertWithRepositoryDependency manifestPath(String manifestPath) {
        this.manifestPath = manifestPath;
        return this;
    }

    /**
     * The full path to the dependency manifest file, relative to the root of the repository.
     * @return manifestPath
     */
    @Schema(
            name = "manifest_path",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The full path to the dependency manifest file, relative to the root of the repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("manifest_path")
    public String getManifestPath() {
        return manifestPath;
    }

    public void setManifestPath(String manifestPath) {
        this.manifestPath = manifestPath;
    }

    public DependabotAlertWithRepositoryDependency scope(ScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /**
     * The execution scope of the vulnerable dependency.
     * @return scope
     */
    @Schema(
            name = "scope",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The execution scope of the vulnerable dependency.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("scope")
    public ScopeEnum getScope() {
        return scope;
    }

    public void setScope(ScopeEnum scope) {
        this.scope = scope;
    }

    public DependabotAlertWithRepositoryDependency relationship(RelationshipEnum relationship) {
        this.relationship = relationship;
        return this;
    }

    /**
     * The vulnerable dependency's relationship to your project.  > [!NOTE] > We are rolling out support for dependency relationship across ecosystems. This value will be \"unknown\" for all dependencies in unsupported ecosystems.
     * @return relationship
     */
    @Schema(
            name = "relationship",
            accessMode = Schema.AccessMode.READ_ONLY,
            description =
                    "The vulnerable dependency's relationship to your project.  > [!NOTE] > We are rolling out support for dependency relationship across ecosystems. This value will be \"unknown\" for all dependencies in unsupported ecosystems. ",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("relationship")
    public RelationshipEnum getRelationship() {
        return relationship;
    }

    public void setRelationship(RelationshipEnum relationship) {
        this.relationship = relationship;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DependabotAlertWithRepositoryDependency dependabotAlertWithRepositoryDependency =
                (DependabotAlertWithRepositoryDependency) o;
        return Objects.equals(this._package, dependabotAlertWithRepositoryDependency._package)
                && Objects.equals(this.manifestPath, dependabotAlertWithRepositoryDependency.manifestPath)
                && Objects.equals(this.scope, dependabotAlertWithRepositoryDependency.scope)
                && Objects.equals(this.relationship, dependabotAlertWithRepositoryDependency.relationship);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_package, manifestPath, scope, relationship);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependabotAlertWithRepositoryDependency {\n");
        sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
        sb.append("    manifestPath: ").append(toIndentedString(manifestPath)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
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
