package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * SnapshotJob
 */
@JsonTypeName("snapshot_job")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SnapshotJob {

    private String id;

    private String correlator;

    private Optional<String> htmlUrl = Optional.empty();

    public SnapshotJob() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SnapshotJob(String id, String correlator) {
        this.id = id;
        this.correlator = correlator;
    }

    public SnapshotJob id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The external ID of the job.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "5622a2b0-63f6-4732-8c34-a1ab27e102a11",
            description = "The external ID of the job.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SnapshotJob correlator(String correlator) {
        this.correlator = correlator;
        return this;
    }

    /**
     * Correlator provides a key that is used to group snapshots submitted over time. Only the \"latest\" submitted snapshot for a given combination of `job.correlator` and `detector.name` will be considered when calculating a repository's current dependencies. Correlator should be as unique as it takes to distinguish all detection runs for a given \"wave\" of CI workflow you run. If you're using GitHub Actions, a good default value for this could be the environment variables GITHUB_WORKFLOW and GITHUB_JOB concatenated together. If you're using a build matrix, then you'll also need to add additional key(s) to distinguish between each submission inside a matrix variation.
     * @return correlator
     */
    @NotNull
    @Schema(
            name = "correlator",
            example = "yourworkflowname_yourjobname",
            description =
                    "Correlator provides a key that is used to group snapshots submitted over time. Only the \"latest\" submitted snapshot for a given combination of `job.correlator` and `detector.name` will be considered when calculating a repository's current dependencies. Correlator should be as unique as it takes to distinguish all detection runs for a given \"wave\" of CI workflow you run. If you're using GitHub Actions, a good default value for this could be the environment variables GITHUB_WORKFLOW and GITHUB_JOB concatenated together. If you're using a build matrix, then you'll also need to add additional key(s) to distinguish between each submission inside a matrix variation.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("correlator")
    public String getCorrelator() {
        return correlator;
    }

    public void setCorrelator(String correlator) {
        this.correlator = correlator;
    }

    public SnapshotJob htmlUrl(String htmlUrl) {
        this.htmlUrl = Optional.ofNullable(htmlUrl);
        return this;
    }

    /**
     * The url for the job.
     * @return htmlUrl
     */
    @Schema(
            name = "html_url",
            example = "http://example.com/build",
            description = "The url for the job.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public Optional<String> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(Optional<String> htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SnapshotJob snapshotJob = (SnapshotJob) o;
        return Objects.equals(this.id, snapshotJob.id)
                && Objects.equals(this.correlator, snapshotJob.correlator)
                && Objects.equals(this.htmlUrl, snapshotJob.htmlUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, correlator, htmlUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnapshotJob {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    correlator: ").append(toIndentedString(correlator)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
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
