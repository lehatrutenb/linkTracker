package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * PagesDeploymentStatus
 */
@JsonTypeName("pages-deployment-status")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PagesDeploymentStatus {

    /**
     * The current status of the deployment.
     */
    public enum StatusEnum {
        DEPLOYMENT_IN_PROGRESS("deployment_in_progress"),

        SYNCING_FILES("syncing_files"),

        FINISHED_FILE_SYNC("finished_file_sync"),

        UPDATING_PAGES("updating_pages"),

        PURGING_CDN("purging_cdn"),

        DEPLOYMENT_CANCELLED("deployment_cancelled"),

        DEPLOYMENT_FAILED("deployment_failed"),

        DEPLOYMENT_CONTENT_FAILED("deployment_content_failed"),

        DEPLOYMENT_ATTEMPT_ERROR("deployment_attempt_error"),

        DEPLOYMENT_LOST("deployment_lost"),

        SUCCEED("succeed");

        private final String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private StatusEnum status;

    public PagesDeploymentStatus status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The current status of the deployment.
     * @return status
     */
    @Schema(
            name = "status",
            description = "The current status of the deployment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PagesDeploymentStatus pagesDeploymentStatus = (PagesDeploymentStatus) o;
        return Objects.equals(this.status, pagesDeploymentStatus.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PagesDeploymentStatus {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
