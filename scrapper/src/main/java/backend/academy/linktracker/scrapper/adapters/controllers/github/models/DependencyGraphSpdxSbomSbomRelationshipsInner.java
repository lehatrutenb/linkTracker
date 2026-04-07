package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * DependencyGraphSpdxSbomSbomRelationshipsInner
 */
@JsonTypeName("dependency_graph_spdx_sbom_sbom_relationships_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DependencyGraphSpdxSbomSbomRelationshipsInner {

    private Optional<String> relationshipType = Optional.empty();

    private Optional<String> spdxElementId = Optional.empty();

    private Optional<String> relatedSpdxElement = Optional.empty();

    public DependencyGraphSpdxSbomSbomRelationshipsInner relationshipType(String relationshipType) {
        this.relationshipType = Optional.ofNullable(relationshipType);
        return this;
    }

    /**
     * The type of relationship between the two SPDX elements.
     * @return relationshipType
     */
    @Schema(
            name = "relationshipType",
            example = "DEPENDS_ON",
            description = "The type of relationship between the two SPDX elements.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("relationshipType")
    public Optional<String> getRelationshipType() {
        return relationshipType;
    }

    public void setRelationshipType(Optional<String> relationshipType) {
        this.relationshipType = relationshipType;
    }

    public DependencyGraphSpdxSbomSbomRelationshipsInner spdxElementId(String spdxElementId) {
        this.spdxElementId = Optional.ofNullable(spdxElementId);
        return this;
    }

    /**
     * The SPDX identifier of the package that is the source of the relationship.
     * @return spdxElementId
     */
    @Schema(
            name = "spdxElementId",
            description = "The SPDX identifier of the package that is the source of the relationship.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("spdxElementId")
    public Optional<String> getSpdxElementId() {
        return spdxElementId;
    }

    public void setSpdxElementId(Optional<String> spdxElementId) {
        this.spdxElementId = spdxElementId;
    }

    public DependencyGraphSpdxSbomSbomRelationshipsInner relatedSpdxElement(String relatedSpdxElement) {
        this.relatedSpdxElement = Optional.ofNullable(relatedSpdxElement);
        return this;
    }

    /**
     * The SPDX identifier of the package that is the target of the relationship.
     * @return relatedSpdxElement
     */
    @Schema(
            name = "relatedSpdxElement",
            description = "The SPDX identifier of the package that is the target of the relationship.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("relatedSpdxElement")
    public Optional<String> getRelatedSpdxElement() {
        return relatedSpdxElement;
    }

    public void setRelatedSpdxElement(Optional<String> relatedSpdxElement) {
        this.relatedSpdxElement = relatedSpdxElement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DependencyGraphSpdxSbomSbomRelationshipsInner dependencyGraphSpdxSbomSbomRelationshipsInner =
                (DependencyGraphSpdxSbomSbomRelationshipsInner) o;
        return Objects.equals(this.relationshipType, dependencyGraphSpdxSbomSbomRelationshipsInner.relationshipType)
                && Objects.equals(this.spdxElementId, dependencyGraphSpdxSbomSbomRelationshipsInner.spdxElementId)
                && Objects.equals(
                        this.relatedSpdxElement, dependencyGraphSpdxSbomSbomRelationshipsInner.relatedSpdxElement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relationshipType, spdxElementId, relatedSpdxElement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependencyGraphSpdxSbomSbomRelationshipsInner {\n");
        sb.append("    relationshipType: ")
                .append(toIndentedString(relationshipType))
                .append("\n");
        sb.append("    spdxElementId: ").append(toIndentedString(spdxElementId)).append("\n");
        sb.append("    relatedSpdxElement: ")
                .append(toIndentedString(relatedSpdxElement))
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
