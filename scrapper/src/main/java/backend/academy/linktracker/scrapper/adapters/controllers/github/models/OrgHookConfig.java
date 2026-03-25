package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * OrgHookConfig
 */
@JsonTypeName("org_hook_config")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgHookConfig {

    private String url;

    private String insecureSsl;

    private String contentType;

    private String secret;

    public OrgHookConfig url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(name = "url", example = "\"http://example.com/2\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public OrgHookConfig insecureSsl(String insecureSsl) {
        this.insecureSsl = insecureSsl;
        return this;
    }

    /**
     * Get insecureSsl
     * @return insecureSsl
     */
    @Schema(name = "insecure_ssl", example = "\"0\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("insecure_ssl")
    public String getInsecureSsl() {
        return insecureSsl;
    }

    public void setInsecureSsl(String insecureSsl) {
        this.insecureSsl = insecureSsl;
    }

    public OrgHookConfig contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get contentType
     * @return contentType
     */
    @Schema(name = "content_type", example = "\"form\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("content_type")
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public OrgHookConfig secret(String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * Get secret
     * @return secret
     */
    @Schema(name = "secret", example = "\"********\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret")
    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgHookConfig orgHookConfig = (OrgHookConfig) o;
        return Objects.equals(this.url, orgHookConfig.url)
                && Objects.equals(this.insecureSsl, orgHookConfig.insecureSsl)
                && Objects.equals(this.contentType, orgHookConfig.contentType)
                && Objects.equals(this.secret, orgHookConfig.secret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, insecureSsl, contentType, secret);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgHookConfig {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    insecureSsl: ").append(toIndentedString(insecureSsl)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
