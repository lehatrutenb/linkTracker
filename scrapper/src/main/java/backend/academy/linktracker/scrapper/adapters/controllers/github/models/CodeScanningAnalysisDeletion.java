package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.net.URI;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Successful deletion of a code scanning analysis
 */
@Schema(name = "code-scanning-analysis-deletion", description = "Successful deletion of a code scanning analysis")
@JsonTypeName("code-scanning-analysis-deletion")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningAnalysisDeletion {

    private JsonNullable<URI> nextAnalysisUrl = JsonNullable.<URI>undefined();

    private JsonNullable<URI> confirmDeleteUrl = JsonNullable.<URI>undefined();

    public CodeScanningAnalysisDeletion() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodeScanningAnalysisDeletion(URI nextAnalysisUrl, URI confirmDeleteUrl) {
        this.nextAnalysisUrl = JsonNullable.of(nextAnalysisUrl);
        this.confirmDeleteUrl = JsonNullable.of(confirmDeleteUrl);
    }

    public CodeScanningAnalysisDeletion nextAnalysisUrl(URI nextAnalysisUrl) {
        this.nextAnalysisUrl = JsonNullable.of(nextAnalysisUrl);
        return this;
    }

    /**
     * Next deletable analysis in chain, without last analysis deletion confirmation
     * @return nextAnalysisUrl
     */
    @Valid
    @Schema(
            name = "next_analysis_url",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "Next deletable analysis in chain, without last analysis deletion confirmation",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("next_analysis_url")
    public JsonNullable<URI> getNextAnalysisUrl() {
        return nextAnalysisUrl;
    }

    public void setNextAnalysisUrl(JsonNullable<URI> nextAnalysisUrl) {
        this.nextAnalysisUrl = nextAnalysisUrl;
    }

    public CodeScanningAnalysisDeletion confirmDeleteUrl(URI confirmDeleteUrl) {
        this.confirmDeleteUrl = JsonNullable.of(confirmDeleteUrl);
        return this;
    }

    /**
     * Next deletable analysis in chain, with last analysis deletion confirmation
     * @return confirmDeleteUrl
     */
    @Valid
    @Schema(
            name = "confirm_delete_url",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "Next deletable analysis in chain, with last analysis deletion confirmation",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("confirm_delete_url")
    public JsonNullable<URI> getConfirmDeleteUrl() {
        return confirmDeleteUrl;
    }

    public void setConfirmDeleteUrl(JsonNullable<URI> confirmDeleteUrl) {
        this.confirmDeleteUrl = confirmDeleteUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeScanningAnalysisDeletion codeScanningAnalysisDeletion = (CodeScanningAnalysisDeletion) o;
        return Objects.equals(this.nextAnalysisUrl, codeScanningAnalysisDeletion.nextAnalysisUrl)
                && Objects.equals(this.confirmDeleteUrl, codeScanningAnalysisDeletion.confirmDeleteUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nextAnalysisUrl, confirmDeleteUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeScanningAnalysisDeletion {\n");
        sb.append("    nextAnalysisUrl: ")
                .append(toIndentedString(nextAnalysisUrl))
                .append("\n");
        sb.append("    confirmDeleteUrl: ")
                .append(toIndentedString(confirmDeleteUrl))
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
