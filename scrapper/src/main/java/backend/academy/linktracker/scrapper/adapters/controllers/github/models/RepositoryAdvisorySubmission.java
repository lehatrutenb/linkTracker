package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;

/**
 * RepositoryAdvisorySubmission
 */
@JsonTypeName("repository_advisory_submission")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryAdvisorySubmission {

    private Boolean accepted;

    public RepositoryAdvisorySubmission() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryAdvisorySubmission(Boolean accepted) {
        this.accepted = accepted;
    }

    public RepositoryAdvisorySubmission accepted(Boolean accepted) {
        this.accepted = accepted;
        return this;
    }

    /**
     * Whether a private vulnerability report was accepted by the repository's administrators.
     * @return accepted
     */
    @Schema(
            name = "accepted",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "Whether a private vulnerability report was accepted by the repository's administrators.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("accepted")
    public Boolean getAccepted() {
        return accepted;
    }

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryAdvisorySubmission repositoryAdvisorySubmission = (RepositoryAdvisorySubmission) o;
        return Objects.equals(this.accepted, repositoryAdvisorySubmission.accepted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accepted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryAdvisorySubmission {\n");
        sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
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
