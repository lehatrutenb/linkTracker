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
 * Successful deletion of a code scanning analysis
 */
@Schema(name = "code-scanning-analysis-deletion", description = "Successful deletion of a code scanning analysis")
@JsonTypeName("code-scanning-analysis-deletion")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningAnalysisDeletion {

    private URI nextAnalysisUrl = null;

    private URI confirmDeleteUrl = null;

    public CodeScanningAnalysisDeletion() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodeScanningAnalysisDeletion(URI nextAnalysisUrl, URI confirmDeleteUrl) {
        this.nextAnalysisUrl = nextAnalysisUrl;
        this.confirmDeleteUrl = confirmDeleteUrl;
    }

    public CodeScanningAnalysisDeletion nextAnalysisUrl(URI nextAnalysisUrl) {
        this.nextAnalysisUrl = nextAnalysisUrl;
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
    public URI getNextAnalysisUrl() {
        return nextAnalysisUrl;
    }

    public void setNextAnalysisUrl(URI nextAnalysisUrl) {
        this.nextAnalysisUrl = nextAnalysisUrl;
    }

    public CodeScanningAnalysisDeletion confirmDeleteUrl(URI confirmDeleteUrl) {
        this.confirmDeleteUrl = confirmDeleteUrl;
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
    public URI getConfirmDeleteUrl() {
        return confirmDeleteUrl;
    }

    public void setConfirmDeleteUrl(URI confirmDeleteUrl) {
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
