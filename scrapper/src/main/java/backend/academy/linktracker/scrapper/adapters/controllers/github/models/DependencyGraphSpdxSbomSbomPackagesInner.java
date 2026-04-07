package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * DependencyGraphSpdxSbomSbomPackagesInner
 */
@JsonTypeName("dependency_graph_spdx_sbom_sbom_packages_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DependencyGraphSpdxSbomSbomPackagesInner {

    private Optional<String> SPDXID = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> versionInfo = Optional.empty();

    private Optional<String> downloadLocation = Optional.empty();

    private Optional<Boolean> filesAnalyzed = Optional.empty();

    private Optional<String> licenseConcluded = Optional.empty();

    private Optional<String> licenseDeclared = Optional.empty();

    private Optional<String> supplier = Optional.empty();

    private Optional<String> copyrightText = Optional.empty();

    @Valid
    private List<@Valid DependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner> externalRefs = new ArrayList<>();

    public DependencyGraphSpdxSbomSbomPackagesInner SPDXID(String SPDXID) {
        this.SPDXID = Optional.ofNullable(SPDXID);
        return this;
    }

    /**
     * A unique SPDX identifier for the package.
     * @return SPDXID
     */
    @Schema(
            name = "SPDXID",
            example = "SPDXRef-Package",
            description = "A unique SPDX identifier for the package.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("SPDXID")
    public Optional<String> getSPDXID() {
        return SPDXID;
    }

    public void setSPDXID(Optional<String> SPDXID) {
        this.SPDXID = SPDXID;
    }

    public DependencyGraphSpdxSbomSbomPackagesInner name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * The name of the package.
     * @return name
     */
    @Schema(
            name = "name",
            example = "github/github",
            description = "The name of the package.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public DependencyGraphSpdxSbomSbomPackagesInner versionInfo(String versionInfo) {
        this.versionInfo = Optional.ofNullable(versionInfo);
        return this;
    }

    /**
     * The version of the package. If the package does not have an exact version specified, a version range is given.
     * @return versionInfo
     */
    @Schema(
            name = "versionInfo",
            example = "1.0.0",
            description =
                    "The version of the package. If the package does not have an exact version specified, a version range is given.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("versionInfo")
    public Optional<String> getVersionInfo() {
        return versionInfo;
    }

    public void setVersionInfo(Optional<String> versionInfo) {
        this.versionInfo = versionInfo;
    }

    public DependencyGraphSpdxSbomSbomPackagesInner downloadLocation(String downloadLocation) {
        this.downloadLocation = Optional.ofNullable(downloadLocation);
        return this;
    }

    /**
     * The location where the package can be downloaded, or NOASSERTION if this has not been determined.
     * @return downloadLocation
     */
    @Schema(
            name = "downloadLocation",
            example = "NOASSERTION",
            description =
                    "The location where the package can be downloaded, or NOASSERTION if this has not been determined.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("downloadLocation")
    public Optional<String> getDownloadLocation() {
        return downloadLocation;
    }

    public void setDownloadLocation(Optional<String> downloadLocation) {
        this.downloadLocation = downloadLocation;
    }

    public DependencyGraphSpdxSbomSbomPackagesInner filesAnalyzed(Boolean filesAnalyzed) {
        this.filesAnalyzed = Optional.ofNullable(filesAnalyzed);
        return this;
    }

    /**
     * Whether the package's file content has been subjected to analysis during the creation of the SPDX document.
     * @return filesAnalyzed
     */
    @Schema(
            name = "filesAnalyzed",
            example = "false",
            description =
                    "Whether the package's file content has been subjected to analysis during the creation of the SPDX document.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("filesAnalyzed")
    public Optional<Boolean> getFilesAnalyzed() {
        return filesAnalyzed;
    }

    public void setFilesAnalyzed(Optional<Boolean> filesAnalyzed) {
        this.filesAnalyzed = filesAnalyzed;
    }

    public DependencyGraphSpdxSbomSbomPackagesInner licenseConcluded(String licenseConcluded) {
        this.licenseConcluded = Optional.ofNullable(licenseConcluded);
        return this;
    }

    /**
     * The license of the package as determined while creating the SPDX document.
     * @return licenseConcluded
     */
    @Schema(
            name = "licenseConcluded",
            example = "MIT",
            description = "The license of the package as determined while creating the SPDX document.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("licenseConcluded")
    public Optional<String> getLicenseConcluded() {
        return licenseConcluded;
    }

    public void setLicenseConcluded(Optional<String> licenseConcluded) {
        this.licenseConcluded = licenseConcluded;
    }

    public DependencyGraphSpdxSbomSbomPackagesInner licenseDeclared(String licenseDeclared) {
        this.licenseDeclared = Optional.ofNullable(licenseDeclared);
        return this;
    }

    /**
     * The license of the package as declared by its author, or NOASSERTION if this information was not available when the SPDX document was created.
     * @return licenseDeclared
     */
    @Schema(
            name = "licenseDeclared",
            example = "NOASSERTION",
            description =
                    "The license of the package as declared by its author, or NOASSERTION if this information was not available when the SPDX document was created.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("licenseDeclared")
    public Optional<String> getLicenseDeclared() {
        return licenseDeclared;
    }

    public void setLicenseDeclared(Optional<String> licenseDeclared) {
        this.licenseDeclared = licenseDeclared;
    }

    public DependencyGraphSpdxSbomSbomPackagesInner supplier(String supplier) {
        this.supplier = Optional.ofNullable(supplier);
        return this;
    }

    /**
     * The distribution source of this package, or NOASSERTION if this was not determined.
     * @return supplier
     */
    @Schema(
            name = "supplier",
            example = "NOASSERTION",
            description = "The distribution source of this package, or NOASSERTION if this was not determined.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("supplier")
    public Optional<String> getSupplier() {
        return supplier;
    }

    public void setSupplier(Optional<String> supplier) {
        this.supplier = supplier;
    }

    public DependencyGraphSpdxSbomSbomPackagesInner copyrightText(String copyrightText) {
        this.copyrightText = Optional.ofNullable(copyrightText);
        return this;
    }

    /**
     * The copyright holders of the package, and any dates present with those notices, if available.
     * @return copyrightText
     */
    @Schema(
            name = "copyrightText",
            example = "Copyright (c) 1985 GitHub.com",
            description =
                    "The copyright holders of the package, and any dates present with those notices, if available.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("copyrightText")
    public Optional<String> getCopyrightText() {
        return copyrightText;
    }

    public void setCopyrightText(Optional<String> copyrightText) {
        this.copyrightText = copyrightText;
    }

    public DependencyGraphSpdxSbomSbomPackagesInner externalRefs(
            List<@Valid DependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner> externalRefs) {
        this.externalRefs = externalRefs;
        return this;
    }

    public DependencyGraphSpdxSbomSbomPackagesInner addExternalRefsItem(
            DependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner externalRefsItem) {
        if (this.externalRefs == null) {
            this.externalRefs = new ArrayList<>();
        }
        this.externalRefs.add(externalRefsItem);
        return this;
    }

    /**
     * Get externalRefs
     * @return externalRefs
     */
    @Valid
    @Schema(name = "externalRefs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("externalRefs")
    public List<@Valid DependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner> getExternalRefs() {
        return externalRefs;
    }

    public void setExternalRefs(List<@Valid DependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner> externalRefs) {
        this.externalRefs = externalRefs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DependencyGraphSpdxSbomSbomPackagesInner dependencyGraphSpdxSbomSbomPackagesInner =
                (DependencyGraphSpdxSbomSbomPackagesInner) o;
        return Objects.equals(this.SPDXID, dependencyGraphSpdxSbomSbomPackagesInner.SPDXID)
                && Objects.equals(this.name, dependencyGraphSpdxSbomSbomPackagesInner.name)
                && Objects.equals(this.versionInfo, dependencyGraphSpdxSbomSbomPackagesInner.versionInfo)
                && Objects.equals(this.downloadLocation, dependencyGraphSpdxSbomSbomPackagesInner.downloadLocation)
                && Objects.equals(this.filesAnalyzed, dependencyGraphSpdxSbomSbomPackagesInner.filesAnalyzed)
                && Objects.equals(this.licenseConcluded, dependencyGraphSpdxSbomSbomPackagesInner.licenseConcluded)
                && Objects.equals(this.licenseDeclared, dependencyGraphSpdxSbomSbomPackagesInner.licenseDeclared)
                && Objects.equals(this.supplier, dependencyGraphSpdxSbomSbomPackagesInner.supplier)
                && Objects.equals(this.copyrightText, dependencyGraphSpdxSbomSbomPackagesInner.copyrightText)
                && Objects.equals(this.externalRefs, dependencyGraphSpdxSbomSbomPackagesInner.externalRefs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                SPDXID,
                name,
                versionInfo,
                downloadLocation,
                filesAnalyzed,
                licenseConcluded,
                licenseDeclared,
                supplier,
                copyrightText,
                externalRefs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependencyGraphSpdxSbomSbomPackagesInner {\n");
        sb.append("    SPDXID: ").append(toIndentedString(SPDXID)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    versionInfo: ").append(toIndentedString(versionInfo)).append("\n");
        sb.append("    downloadLocation: ")
                .append(toIndentedString(downloadLocation))
                .append("\n");
        sb.append("    filesAnalyzed: ").append(toIndentedString(filesAnalyzed)).append("\n");
        sb.append("    licenseConcluded: ")
                .append(toIndentedString(licenseConcluded))
                .append("\n");
        sb.append("    licenseDeclared: ")
                .append(toIndentedString(licenseDeclared))
                .append("\n");
        sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
        sb.append("    copyrightText: ").append(toIndentedString(copyrightText)).append("\n");
        sb.append("    externalRefs: ").append(toIndentedString(externalRefs)).append("\n");
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
