package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * DependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner
 */
@JsonTypeName("dependency_graph_spdx_sbom_sbom_packages_inner_externalRefs_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner {

    private String referenceCategory;

    private String referenceLocator;

    private String referenceType;

    public DependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner(
            String referenceCategory, String referenceLocator, String referenceType) {
        this.referenceCategory = referenceCategory;
        this.referenceLocator = referenceLocator;
        this.referenceType = referenceType;
    }

    public DependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner referenceCategory(String referenceCategory) {
        this.referenceCategory = referenceCategory;
        return this;
    }

    /**
     * The category of reference to an external resource this reference refers to.
     * @return referenceCategory
     */
    @NotNull
    @Schema(
            name = "referenceCategory",
            example = "PACKAGE-MANAGER",
            description = "The category of reference to an external resource this reference refers to.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("referenceCategory")
    public String getReferenceCategory() {
        return referenceCategory;
    }

    public void setReferenceCategory(String referenceCategory) {
        this.referenceCategory = referenceCategory;
    }

    public DependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner referenceLocator(String referenceLocator) {
        this.referenceLocator = referenceLocator;
        return this;
    }

    /**
     * A locator for the particular external resource this reference refers to.
     * @return referenceLocator
     */
    @NotNull
    @Schema(
            name = "referenceLocator",
            example = "pkg:gem/rails@6.0.1",
            description = "A locator for the particular external resource this reference refers to.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("referenceLocator")
    public String getReferenceLocator() {
        return referenceLocator;
    }

    public void setReferenceLocator(String referenceLocator) {
        this.referenceLocator = referenceLocator;
    }

    public DependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner referenceType(String referenceType) {
        this.referenceType = referenceType;
        return this;
    }

    /**
     * The category of reference to an external resource this reference refers to.
     * @return referenceType
     */
    @NotNull
    @Schema(
            name = "referenceType",
            example = "purl",
            description = "The category of reference to an external resource this reference refers to.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("referenceType")
    public String getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner
                dependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner =
                        (DependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner) o;
        return Objects.equals(
                        this.referenceCategory,
                        dependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner.referenceCategory)
                && Objects.equals(
                        this.referenceLocator,
                        dependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner.referenceLocator)
                && Objects.equals(
                        this.referenceType, dependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner.referenceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(referenceCategory, referenceLocator, referenceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner {\n");
        sb.append("    referenceCategory: ")
                .append(toIndentedString(referenceCategory))
                .append("\n");
        sb.append("    referenceLocator: ")
                .append(toIndentedString(referenceLocator))
                .append("\n");
        sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
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
