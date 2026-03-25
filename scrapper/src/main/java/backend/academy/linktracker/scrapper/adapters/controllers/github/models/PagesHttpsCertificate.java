package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * PagesHttpsCertificate
 */
@JsonTypeName("pages-https-certificate")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PagesHttpsCertificate {

    /**
     * Gets or Sets state
     */
    public enum StateEnum {
        NEW("new"),

        AUTHORIZATION_CREATED("authorization_created"),

        AUTHORIZATION_PENDING("authorization_pending"),

        AUTHORIZED("authorized"),

        AUTHORIZATION_REVOKED("authorization_revoked"),

        ISSUED("issued"),

        UPLOADED("uploaded"),

        APPROVED("approved"),

        ERRORED("errored"),

        BAD_AUTHZ("bad_authz"),

        DESTROY_PENDING("destroy_pending"),

        DNS_CHANGED("dns_changed");

        private final String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            for (StateEnum b : StateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private StateEnum state;

    private String description;

    @Valid
    private List<String> domains = new ArrayList<>();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate expiresAt;

    public PagesHttpsCertificate() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PagesHttpsCertificate(StateEnum state, String description, List<String> domains) {
        this.state = state;
        this.description = description;
        this.domains = domains;
    }

    public PagesHttpsCertificate state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @NotNull
    @Schema(name = "state", example = "approved", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public PagesHttpsCertificate description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", example = "Certificate is approved", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PagesHttpsCertificate domains(List<String> domains) {
        this.domains = domains;
        return this;
    }

    public PagesHttpsCertificate addDomainsItem(String domainsItem) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domainsItem);
        return this;
    }

    /**
     * Array of the domain set and its alternate name (if it is configured)
     * @return domains
     */
    @NotNull
    @Schema(
            name = "domains",
            example = "[\"example.com\",\"www.example.com\"]",
            description = "Array of the domain set and its alternate name (if it is configured)",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("domains")
    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public PagesHttpsCertificate expiresAt(LocalDate expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * Get expiresAt
     * @return expiresAt
     */
    @Valid
    @Schema(name = "expires_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("expires_at")
    public LocalDate getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(LocalDate expiresAt) {
        this.expiresAt = expiresAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PagesHttpsCertificate pagesHttpsCertificate = (PagesHttpsCertificate) o;
        return Objects.equals(this.state, pagesHttpsCertificate.state)
                && Objects.equals(this.description, pagesHttpsCertificate.description)
                && Objects.equals(this.domains, pagesHttpsCertificate.domains)
                && Objects.equals(this.expiresAt, pagesHttpsCertificate.expiresAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, description, domains, expiresAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PagesHttpsCertificate {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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
