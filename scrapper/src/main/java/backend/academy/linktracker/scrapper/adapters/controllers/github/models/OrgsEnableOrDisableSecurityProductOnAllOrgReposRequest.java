package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * OrgsEnableOrDisableSecurityProductOnAllOrgReposRequest
 */
@JsonTypeName("orgs_enable_or_disable_security_product_on_all_org_repos_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsEnableOrDisableSecurityProductOnAllOrgReposRequest {

    /**
     * CodeQL query suite to be used. If you specify the `query_suite` parameter, the default setup will be configured with this query suite only on all repositories that didn't have default setup already configured. It will not change the query suite on repositories that already have default setup configured. If you don't specify any `query_suite` in your request, the preferred query suite of the organization will be applied.
     */
    public enum QuerySuiteEnum {
        DEFAULT("default"),

        EXTENDED("extended");

        private final String value;

        QuerySuiteEnum(String value) {
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
        public static QuerySuiteEnum fromValue(String value) {
            for (QuerySuiteEnum b : QuerySuiteEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<QuerySuiteEnum> querySuite = Optional.empty();

    public OrgsEnableOrDisableSecurityProductOnAllOrgReposRequest querySuite(QuerySuiteEnum querySuite) {
        this.querySuite = Optional.ofNullable(querySuite);
        return this;
    }

    /**
     * CodeQL query suite to be used. If you specify the `query_suite` parameter, the default setup will be configured with this query suite only on all repositories that didn't have default setup already configured. It will not change the query suite on repositories that already have default setup configured. If you don't specify any `query_suite` in your request, the preferred query suite of the organization will be applied.
     * @return querySuite
     */
    @Schema(
            name = "query_suite",
            description =
                    "CodeQL query suite to be used. If you specify the `query_suite` parameter, the default setup will be configured with this query suite only on all repositories that didn't have default setup already configured. It will not change the query suite on repositories that already have default setup configured. If you don't specify any `query_suite` in your request, the preferred query suite of the organization will be applied.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("query_suite")
    public Optional<QuerySuiteEnum> getQuerySuite() {
        return querySuite;
    }

    public void setQuerySuite(Optional<QuerySuiteEnum> querySuite) {
        this.querySuite = querySuite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsEnableOrDisableSecurityProductOnAllOrgReposRequest orgsEnableOrDisableSecurityProductOnAllOrgReposRequest =
                (OrgsEnableOrDisableSecurityProductOnAllOrgReposRequest) o;
        return Objects.equals(this.querySuite, orgsEnableOrDisableSecurityProductOnAllOrgReposRequest.querySuite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(querySuite);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsEnableOrDisableSecurityProductOnAllOrgReposRequest {\n");
        sb.append("    querySuite: ").append(toIndentedString(querySuite)).append("\n");
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
