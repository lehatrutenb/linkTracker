package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DependencyGraphSpdxSbomSbom
 */
@JsonTypeName("dependency_graph_spdx_sbom_sbom")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DependencyGraphSpdxSbomSbom {

    private String SPDXID;

    private String spdxVersion;

    private String comment;

    private DependencyGraphSpdxSbomSbomCreationInfo creationInfo;

    private String name;

    private String dataLicense;

    private String documentNamespace;

    @Valid
    private List<@Valid DependencyGraphSpdxSbomSbomPackagesInner> packages = new ArrayList<>();

    @Valid
    private List<@Valid DependencyGraphSpdxSbomSbomRelationshipsInner> relationships = new ArrayList<>();

    public DependencyGraphSpdxSbomSbom() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DependencyGraphSpdxSbomSbom(
            String SPDXID,
            String spdxVersion,
            DependencyGraphSpdxSbomSbomCreationInfo creationInfo,
            String name,
            String dataLicense,
            String documentNamespace,
            List<@Valid DependencyGraphSpdxSbomSbomPackagesInner> packages) {
        this.SPDXID = SPDXID;
        this.spdxVersion = spdxVersion;
        this.creationInfo = creationInfo;
        this.name = name;
        this.dataLicense = dataLicense;
        this.documentNamespace = documentNamespace;
        this.packages = packages;
    }

    public DependencyGraphSpdxSbomSbom SPDXID(String SPDXID) {
        this.SPDXID = SPDXID;
        return this;
    }

    /**
     * The SPDX identifier for the SPDX document.
     * @return SPDXID
     */
    @NotNull
    @Schema(
            name = "SPDXID",
            example = "SPDXRef-DOCUMENT",
            description = "The SPDX identifier for the SPDX document.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("SPDXID")
    public String getSPDXID() {
        return SPDXID;
    }

    public void setSPDXID(String SPDXID) {
        this.SPDXID = SPDXID;
    }

    public DependencyGraphSpdxSbomSbom spdxVersion(String spdxVersion) {
        this.spdxVersion = spdxVersion;
        return this;
    }

    /**
     * The version of the SPDX specification that this document conforms to.
     * @return spdxVersion
     */
    @NotNull
    @Schema(
            name = "spdxVersion",
            example = "SPDX-2.3",
            description = "The version of the SPDX specification that this document conforms to.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("spdxVersion")
    public String getSpdxVersion() {
        return spdxVersion;
    }

    public void setSpdxVersion(String spdxVersion) {
        this.spdxVersion = spdxVersion;
    }

    public DependencyGraphSpdxSbomSbom comment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * An optional comment about the SPDX document.
     * @return comment
     */
    @Schema(
            name = "comment",
            example =
                    "Exact versions could not be resolved for some packages. For more information: https://docs.github.com/en/code-security/supply-chain-security/understanding-your-software-supply-chain/",
            description = "An optional comment about the SPDX document.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public DependencyGraphSpdxSbomSbom creationInfo(DependencyGraphSpdxSbomSbomCreationInfo creationInfo) {
        this.creationInfo = creationInfo;
        return this;
    }

    /**
     * Get creationInfo
     * @return creationInfo
     */
    @NotNull
    @Valid
    @Schema(name = "creationInfo", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("creationInfo")
    public DependencyGraphSpdxSbomSbomCreationInfo getCreationInfo() {
        return creationInfo;
    }

    public void setCreationInfo(DependencyGraphSpdxSbomSbomCreationInfo creationInfo) {
        this.creationInfo = creationInfo;
    }

    public DependencyGraphSpdxSbomSbom name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the SPDX document.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "github/github",
            description = "The name of the SPDX document.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DependencyGraphSpdxSbomSbom dataLicense(String dataLicense) {
        this.dataLicense = dataLicense;
        return this;
    }

    /**
     * The license under which the SPDX document is licensed.
     * @return dataLicense
     */
    @NotNull
    @Schema(
            name = "dataLicense",
            example = "CC0-1.0",
            description = "The license under which the SPDX document is licensed.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("dataLicense")
    public String getDataLicense() {
        return dataLicense;
    }

    public void setDataLicense(String dataLicense) {
        this.dataLicense = dataLicense;
    }

    public DependencyGraphSpdxSbomSbom documentNamespace(String documentNamespace) {
        this.documentNamespace = documentNamespace;
        return this;
    }

    /**
     * The namespace for the SPDX document.
     * @return documentNamespace
     */
    @NotNull
    @Schema(
            name = "documentNamespace",
            example = "https://spdx.org/spdxdocs/protobom/15e41dd2-f961-4f4d-b8dc-f8f57ad70d57",
            description = "The namespace for the SPDX document.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("documentNamespace")
    public String getDocumentNamespace() {
        return documentNamespace;
    }

    public void setDocumentNamespace(String documentNamespace) {
        this.documentNamespace = documentNamespace;
    }

    public DependencyGraphSpdxSbomSbom packages(List<@Valid DependencyGraphSpdxSbomSbomPackagesInner> packages) {
        this.packages = packages;
        return this;
    }

    public DependencyGraphSpdxSbomSbom addPackagesItem(DependencyGraphSpdxSbomSbomPackagesInner packagesItem) {
        if (this.packages == null) {
            this.packages = new ArrayList<>();
        }
        this.packages.add(packagesItem);
        return this;
    }

    /**
     * Get packages
     * @return packages
     */
    @NotNull
    @Valid
    @Schema(name = "packages", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("packages")
    public List<@Valid DependencyGraphSpdxSbomSbomPackagesInner> getPackages() {
        return packages;
    }

    public void setPackages(List<@Valid DependencyGraphSpdxSbomSbomPackagesInner> packages) {
        this.packages = packages;
    }

    public DependencyGraphSpdxSbomSbom relationships(
            List<@Valid DependencyGraphSpdxSbomSbomRelationshipsInner> relationships) {
        this.relationships = relationships;
        return this;
    }

    public DependencyGraphSpdxSbomSbom addRelationshipsItem(
            DependencyGraphSpdxSbomSbomRelationshipsInner relationshipsItem) {
        if (this.relationships == null) {
            this.relationships = new ArrayList<>();
        }
        this.relationships.add(relationshipsItem);
        return this;
    }

    /**
     * Get relationships
     * @return relationships
     */
    @Valid
    @Schema(name = "relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("relationships")
    public List<@Valid DependencyGraphSpdxSbomSbomRelationshipsInner> getRelationships() {
        return relationships;
    }

    public void setRelationships(List<@Valid DependencyGraphSpdxSbomSbomRelationshipsInner> relationships) {
        this.relationships = relationships;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DependencyGraphSpdxSbomSbom dependencyGraphSpdxSbomSbom = (DependencyGraphSpdxSbomSbom) o;
        return Objects.equals(this.SPDXID, dependencyGraphSpdxSbomSbom.SPDXID)
                && Objects.equals(this.spdxVersion, dependencyGraphSpdxSbomSbom.spdxVersion)
                && Objects.equals(this.comment, dependencyGraphSpdxSbomSbom.comment)
                && Objects.equals(this.creationInfo, dependencyGraphSpdxSbomSbom.creationInfo)
                && Objects.equals(this.name, dependencyGraphSpdxSbomSbom.name)
                && Objects.equals(this.dataLicense, dependencyGraphSpdxSbomSbom.dataLicense)
                && Objects.equals(this.documentNamespace, dependencyGraphSpdxSbomSbom.documentNamespace)
                && Objects.equals(this.packages, dependencyGraphSpdxSbomSbom.packages)
                && Objects.equals(this.relationships, dependencyGraphSpdxSbomSbom.relationships);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                SPDXID,
                spdxVersion,
                comment,
                creationInfo,
                name,
                dataLicense,
                documentNamespace,
                packages,
                relationships);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependencyGraphSpdxSbomSbom {\n");
        sb.append("    SPDXID: ").append(toIndentedString(SPDXID)).append("\n");
        sb.append("    spdxVersion: ").append(toIndentedString(spdxVersion)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    creationInfo: ").append(toIndentedString(creationInfo)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dataLicense: ").append(toIndentedString(dataLicense)).append("\n");
        sb.append("    documentNamespace: ")
                .append(toIndentedString(documentNamespace))
                .append("\n");
        sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
        sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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
