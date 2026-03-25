package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Details for the vulnerable package.
 */
@Schema(name = "dependabot-alert-package", description = "Details for the vulnerable package.")
@JsonTypeName("dependabot-alert-package")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DependabotAlertPackage {

    private String ecosystem;

    private String name;

    public DependabotAlertPackage() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DependabotAlertPackage(String ecosystem, String name) {
        this.ecosystem = ecosystem;
        this.name = name;
    }

    public DependabotAlertPackage ecosystem(String ecosystem) {
        this.ecosystem = ecosystem;
        return this;
    }

    /**
     * The package's language or package management ecosystem.
     * @return ecosystem
     */
    @Schema(
            name = "ecosystem",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The package's language or package management ecosystem.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ecosystem")
    public String getEcosystem() {
        return ecosystem;
    }

    public void setEcosystem(String ecosystem) {
        this.ecosystem = ecosystem;
    }

    public DependabotAlertPackage name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The unique package name within its ecosystem.
     * @return name
     */
    @Schema(
            name = "name",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The unique package name within its ecosystem.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DependabotAlertPackage dependabotAlertPackage = (DependabotAlertPackage) o;
        return Objects.equals(this.ecosystem, dependabotAlertPackage.ecosystem)
                && Objects.equals(this.name, dependabotAlertPackage.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ecosystem, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependabotAlertPackage {\n");
        sb.append("    ecosystem: ").append(toIndentedString(ecosystem)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
