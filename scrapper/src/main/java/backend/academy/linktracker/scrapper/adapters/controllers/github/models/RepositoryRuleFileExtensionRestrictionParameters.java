package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * RepositoryRuleFileExtensionRestrictionParameters
 */
@JsonTypeName("repository_rule_file_extension_restriction_parameters")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleFileExtensionRestrictionParameters {

    @Valid
    private List<String> restrictedFileExtensions = new ArrayList<>();

    public RepositoryRuleFileExtensionRestrictionParameters() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRuleFileExtensionRestrictionParameters(List<String> restrictedFileExtensions) {
        this.restrictedFileExtensions = restrictedFileExtensions;
    }

    public RepositoryRuleFileExtensionRestrictionParameters restrictedFileExtensions(
            List<String> restrictedFileExtensions) {
        this.restrictedFileExtensions = restrictedFileExtensions;
        return this;
    }

    public RepositoryRuleFileExtensionRestrictionParameters addRestrictedFileExtensionsItem(
            String restrictedFileExtensionsItem) {
        if (this.restrictedFileExtensions == null) {
            this.restrictedFileExtensions = new ArrayList<>();
        }
        this.restrictedFileExtensions.add(restrictedFileExtensionsItem);
        return this;
    }

    /**
     * The file extensions that are restricted from being pushed to the commit graph.
     * @return restrictedFileExtensions
     */
    @NotNull
    @Schema(
            name = "restricted_file_extensions",
            description = "The file extensions that are restricted from being pushed to the commit graph.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("restricted_file_extensions")
    public List<String> getRestrictedFileExtensions() {
        return restrictedFileExtensions;
    }

    public void setRestrictedFileExtensions(List<String> restrictedFileExtensions) {
        this.restrictedFileExtensions = restrictedFileExtensions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRuleFileExtensionRestrictionParameters repositoryRuleFileExtensionRestrictionParameters =
                (RepositoryRuleFileExtensionRestrictionParameters) o;
        return Objects.equals(
                this.restrictedFileExtensions,
                repositoryRuleFileExtensionRestrictionParameters.restrictedFileExtensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restrictedFileExtensions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRuleFileExtensionRestrictionParameters {\n");
        sb.append("    restrictedFileExtensions: ")
                .append(toIndentedString(restrictedFileExtensions))
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
