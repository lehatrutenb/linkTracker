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
 * BranchProtectionRequiredSignatures
 */
@JsonTypeName("branch_protection_required_signatures")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class BranchProtectionRequiredSignatures {

    private URI url;

    private Boolean enabled;

    public BranchProtectionRequiredSignatures() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public BranchProtectionRequiredSignatures(URI url, Boolean enabled) {
        this.url = url;
        this.enabled = enabled;
    }

    public BranchProtectionRequiredSignatures url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(
            name = "url",
            example = "https://api.github.com/repos/octocat/Hello-World/branches/master/protection/required_signatures",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public BranchProtectionRequiredSignatures enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get enabled
     * @return enabled
     */
    @NotNull
    @Schema(name = "enabled", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BranchProtectionRequiredSignatures branchProtectionRequiredSignatures = (BranchProtectionRequiredSignatures) o;
        return Objects.equals(this.url, branchProtectionRequiredSignatures.url)
                && Objects.equals(this.enabled, branchProtectionRequiredSignatures.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BranchProtectionRequiredSignatures {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
