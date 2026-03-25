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
 * OrgsListArtifactStorageRecords200Response
 */
@JsonTypeName("orgs_list_artifact_storage_records_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsListArtifactStorageRecords200Response {

    private Long totalCount;

    @Valid
    private List<@Valid OrgsListArtifactStorageRecords200ResponseStorageRecordsInner> storageRecords =
            new ArrayList<>();

    public OrgsListArtifactStorageRecords200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * The number of storage records for this digest and organization
     * @return totalCount
     */
    @Schema(
            name = "total_count",
            example = "3",
            description = "The number of storage records for this digest and organization",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_count")
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public OrgsListArtifactStorageRecords200Response storageRecords(
            List<@Valid OrgsListArtifactStorageRecords200ResponseStorageRecordsInner> storageRecords) {
        this.storageRecords = storageRecords;
        return this;
    }

    public OrgsListArtifactStorageRecords200Response addStorageRecordsItem(
            OrgsListArtifactStorageRecords200ResponseStorageRecordsInner storageRecordsItem) {
        if (this.storageRecords == null) {
            this.storageRecords = new ArrayList<>();
        }
        this.storageRecords.add(storageRecordsItem);
        return this;
    }

    /**
     * Get storageRecords
     * @return storageRecords
     */
    @Valid
    @Schema(name = "storage_records", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("storage_records")
    public List<@Valid OrgsListArtifactStorageRecords200ResponseStorageRecordsInner> getStorageRecords() {
        return storageRecords;
    }

    public void setStorageRecords(
            List<@Valid OrgsListArtifactStorageRecords200ResponseStorageRecordsInner> storageRecords) {
        this.storageRecords = storageRecords;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsListArtifactStorageRecords200Response orgsListArtifactStorageRecords200Response =
                (OrgsListArtifactStorageRecords200Response) o;
        return Objects.equals(this.totalCount, orgsListArtifactStorageRecords200Response.totalCount)
                && Objects.equals(this.storageRecords, orgsListArtifactStorageRecords200Response.storageRecords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, storageRecords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsListArtifactStorageRecords200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    storageRecords: ")
                .append(toIndentedString(storageRecords))
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
