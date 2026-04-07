package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * The set of permissions for the GitHub app
 */
@Schema(name = "integration_permissions", description = "The set of permissions for the GitHub app")
@JsonTypeName("integration_permissions")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IntegrationPermissions {

    private Optional<String> issues = Optional.empty();

    private Optional<String> checks = Optional.empty();

    private Optional<String> metadata = Optional.empty();

    private Optional<String> contents = Optional.empty();

    private Optional<String> deployments = Optional.empty();

    public IntegrationPermissions issues(String issues) {
        this.issues = Optional.ofNullable(issues);
        return this;
    }

    /**
     * Get issues
     * @return issues
     */
    @Schema(name = "issues", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issues")
    public Optional<String> getIssues() {
        return issues;
    }

    public void setIssues(Optional<String> issues) {
        this.issues = issues;
    }

    public IntegrationPermissions checks(String checks) {
        this.checks = Optional.ofNullable(checks);
        return this;
    }

    /**
     * Get checks
     * @return checks
     */
    @Schema(name = "checks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("checks")
    public Optional<String> getChecks() {
        return checks;
    }

    public void setChecks(Optional<String> checks) {
        this.checks = checks;
    }

    public IntegrationPermissions metadata(String metadata) {
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("metadata")
    public Optional<String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Optional<String> metadata) {
        this.metadata = metadata;
    }

    public IntegrationPermissions contents(String contents) {
        this.contents = Optional.ofNullable(contents);
        return this;
    }

    /**
     * Get contents
     * @return contents
     */
    @Schema(name = "contents", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("contents")
    public Optional<String> getContents() {
        return contents;
    }

    public void setContents(Optional<String> contents) {
        this.contents = contents;
    }

    public IntegrationPermissions deployments(String deployments) {
        this.deployments = Optional.ofNullable(deployments);
        return this;
    }

    /**
     * Get deployments
     * @return deployments
     */
    @Schema(name = "deployments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deployments")
    public Optional<String> getDeployments() {
        return deployments;
    }

    public void setDeployments(Optional<String> deployments) {
        this.deployments = deployments;
    }
    /**
     * A container for additional, undeclared properties.
     * This is a holder for any undeclared properties as specified with
     * the 'additionalProperties' keyword in the OAS document.
     */
    private Map<String, String> additionalProperties;

    /**
     * Set the additional (undeclared) property with the specified name and value.
     * If the property does not already exist, create it otherwise replace it.
     */
    @JsonAnySetter
    public IntegrationPermissions putAdditionalProperty(String key, String value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, String>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
     * Return the additional (undeclared) property.
     */
    @JsonAnyGetter
    public Map<String, String> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
     * Return the additional (undeclared) property with the specified name.
     */
    public String getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IntegrationPermissions integrationPermissions = (IntegrationPermissions) o;
        return Objects.equals(this.issues, integrationPermissions.issues)
                && Objects.equals(this.checks, integrationPermissions.checks)
                && Objects.equals(this.metadata, integrationPermissions.metadata)
                && Objects.equals(this.contents, integrationPermissions.contents)
                && Objects.equals(this.deployments, integrationPermissions.deployments)
                && Objects.equals(this.additionalProperties, integrationPermissions.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issues, checks, metadata, contents, deployments, additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntegrationPermissions {\n");
        sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
        sb.append("    checks: ").append(toIndentedString(checks)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
        sb.append("    deployments: ").append(toIndentedString(deployments)).append("\n");

        sb.append("    additionalProperties: ")
                .append(toIndentedString(additionalProperties))
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
