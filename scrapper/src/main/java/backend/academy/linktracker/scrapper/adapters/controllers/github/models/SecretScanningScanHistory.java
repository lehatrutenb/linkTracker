package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SecretScanningScanHistory
 */
@JsonTypeName("secret-scanning-scan-history")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningScanHistory {

    @Valid
    private List<@Valid SecretScanningScan> incrementalScans = new ArrayList<>();

    @Valid
    private List<@Valid SecretScanningScan> patternUpdateScans = new ArrayList<>();

    @Valid
    private List<@Valid SecretScanningScan> backfillScans = new ArrayList<>();

    @Valid
    private List<SecretScanningScanHistoryCustomPatternBackfillScansInner> customPatternBackfillScans =
            new ArrayList<>();

    public SecretScanningScanHistory incrementalScans(List<@Valid SecretScanningScan> incrementalScans) {
        this.incrementalScans = incrementalScans;
        return this;
    }

    public SecretScanningScanHistory addIncrementalScansItem(SecretScanningScan incrementalScansItem) {
        if (this.incrementalScans == null) {
            this.incrementalScans = new ArrayList<>();
        }
        this.incrementalScans.add(incrementalScansItem);
        return this;
    }

    /**
     * Get incrementalScans
     * @return incrementalScans
     */
    @Valid
    @Schema(name = "incremental_scans", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("incremental_scans")
    public List<@Valid SecretScanningScan> getIncrementalScans() {
        return incrementalScans;
    }

    public void setIncrementalScans(List<@Valid SecretScanningScan> incrementalScans) {
        this.incrementalScans = incrementalScans;
    }

    public SecretScanningScanHistory patternUpdateScans(List<@Valid SecretScanningScan> patternUpdateScans) {
        this.patternUpdateScans = patternUpdateScans;
        return this;
    }

    public SecretScanningScanHistory addPatternUpdateScansItem(SecretScanningScan patternUpdateScansItem) {
        if (this.patternUpdateScans == null) {
            this.patternUpdateScans = new ArrayList<>();
        }
        this.patternUpdateScans.add(patternUpdateScansItem);
        return this;
    }

    /**
     * Get patternUpdateScans
     * @return patternUpdateScans
     */
    @Valid
    @Schema(name = "pattern_update_scans", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pattern_update_scans")
    public List<@Valid SecretScanningScan> getPatternUpdateScans() {
        return patternUpdateScans;
    }

    public void setPatternUpdateScans(List<@Valid SecretScanningScan> patternUpdateScans) {
        this.patternUpdateScans = patternUpdateScans;
    }

    public SecretScanningScanHistory backfillScans(List<@Valid SecretScanningScan> backfillScans) {
        this.backfillScans = backfillScans;
        return this;
    }

    public SecretScanningScanHistory addBackfillScansItem(SecretScanningScan backfillScansItem) {
        if (this.backfillScans == null) {
            this.backfillScans = new ArrayList<>();
        }
        this.backfillScans.add(backfillScansItem);
        return this;
    }

    /**
     * Get backfillScans
     * @return backfillScans
     */
    @Valid
    @Schema(name = "backfill_scans", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("backfill_scans")
    public List<@Valid SecretScanningScan> getBackfillScans() {
        return backfillScans;
    }

    public void setBackfillScans(List<@Valid SecretScanningScan> backfillScans) {
        this.backfillScans = backfillScans;
    }

    public SecretScanningScanHistory customPatternBackfillScans(
            List<SecretScanningScanHistoryCustomPatternBackfillScansInner> customPatternBackfillScans) {
        this.customPatternBackfillScans = customPatternBackfillScans;
        return this;
    }

    public SecretScanningScanHistory addCustomPatternBackfillScansItem(
            SecretScanningScanHistoryCustomPatternBackfillScansInner customPatternBackfillScansItem) {
        if (this.customPatternBackfillScans == null) {
            this.customPatternBackfillScans = new ArrayList<>();
        }
        this.customPatternBackfillScans.add(customPatternBackfillScansItem);
        return this;
    }

    /**
     * Get customPatternBackfillScans
     * @return customPatternBackfillScans
     */
    @Valid
    @Schema(name = "custom_pattern_backfill_scans", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("custom_pattern_backfill_scans")
    public List<SecretScanningScanHistoryCustomPatternBackfillScansInner> getCustomPatternBackfillScans() {
        return customPatternBackfillScans;
    }

    public void setCustomPatternBackfillScans(
            List<SecretScanningScanHistoryCustomPatternBackfillScansInner> customPatternBackfillScans) {
        this.customPatternBackfillScans = customPatternBackfillScans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretScanningScanHistory secretScanningScanHistory = (SecretScanningScanHistory) o;
        return Objects.equals(this.incrementalScans, secretScanningScanHistory.incrementalScans)
                && Objects.equals(this.patternUpdateScans, secretScanningScanHistory.patternUpdateScans)
                && Objects.equals(this.backfillScans, secretScanningScanHistory.backfillScans)
                && Objects.equals(
                        this.customPatternBackfillScans, secretScanningScanHistory.customPatternBackfillScans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(incrementalScans, patternUpdateScans, backfillScans, customPatternBackfillScans);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningScanHistory {\n");
        sb.append("    incrementalScans: ")
                .append(toIndentedString(incrementalScans))
                .append("\n");
        sb.append("    patternUpdateScans: ")
                .append(toIndentedString(patternUpdateScans))
                .append("\n");
        sb.append("    backfillScans: ").append(toIndentedString(backfillScans)).append("\n");
        sb.append("    customPatternBackfillScans: ")
                .append(toIndentedString(customPatternBackfillScans))
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
