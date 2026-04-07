package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * The source branch and directory used to publish your Pages site.
 */
@Schema(
        name = "repos_create_pages_site_request",
        description = "The source branch and directory used to publish your Pages site.")
@JsonTypeName("repos_create_pages_site_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreatePagesSiteRequest {

    /**
     * The process in which the Page will be built. Possible values are `\"legacy\"` and `\"workflow\"`.
     */
    public enum BuildTypeEnum {
        LEGACY("legacy"),

        WORKFLOW("workflow");

        private final String value;

        BuildTypeEnum(String value) {
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
        public static BuildTypeEnum fromValue(String value) {
            for (BuildTypeEnum b : BuildTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<BuildTypeEnum> buildType = Optional.empty();

    private Optional<ReposCreatePagesSiteRequestSource> source = Optional.empty();

    public ReposCreatePagesSiteRequest buildType(BuildTypeEnum buildType) {
        this.buildType = Optional.ofNullable(buildType);
        return this;
    }

    /**
     * The process in which the Page will be built. Possible values are `\"legacy\"` and `\"workflow\"`.
     * @return buildType
     */
    @Schema(
            name = "build_type",
            description =
                    "The process in which the Page will be built. Possible values are `\"legacy\"` and `\"workflow\"`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("build_type")
    public Optional<BuildTypeEnum> getBuildType() {
        return buildType;
    }

    public void setBuildType(Optional<BuildTypeEnum> buildType) {
        this.buildType = buildType;
    }

    public ReposCreatePagesSiteRequest source(ReposCreatePagesSiteRequestSource source) {
        this.source = Optional.ofNullable(source);
        return this;
    }

    /**
     * Get source
     * @return source
     */
    @Valid
    @Schema(name = "source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("source")
    public Optional<ReposCreatePagesSiteRequestSource> getSource() {
        return source;
    }

    public void setSource(Optional<ReposCreatePagesSiteRequestSource> source) {
        this.source = source;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposCreatePagesSiteRequest reposCreatePagesSiteRequest = (ReposCreatePagesSiteRequest) o;
        return Objects.equals(this.buildType, reposCreatePagesSiteRequest.buildType)
                && Objects.equals(this.source, reposCreatePagesSiteRequest.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buildType, source);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposCreatePagesSiteRequest {\n");
        sb.append("    buildType: ").append(toIndentedString(buildType)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
