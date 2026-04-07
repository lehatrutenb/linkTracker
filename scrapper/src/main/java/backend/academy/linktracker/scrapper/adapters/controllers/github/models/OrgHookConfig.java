package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * OrgHookConfig
 */
@JsonTypeName("org_hook_config")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgHookConfig {

    private Optional<String> url = Optional.empty();

    private Optional<String> insecureSsl = Optional.empty();

    private Optional<String> contentType = Optional.empty();

    private Optional<String> secret = Optional.empty();

    public OrgHookConfig url(String url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(name = "url", example = "\"http://example.com/2\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public Optional<String> getUrl() {
        return url;
    }

    public void setUrl(Optional<String> url) {
        this.url = url;
    }

    public OrgHookConfig insecureSsl(String insecureSsl) {
        this.insecureSsl = Optional.ofNullable(insecureSsl);
        return this;
    }

    /**
     * Get insecureSsl
     * @return insecureSsl
     */
    @Schema(name = "insecure_ssl", example = "\"0\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("insecure_ssl")
    public Optional<String> getInsecureSsl() {
        return insecureSsl;
    }

    public void setInsecureSsl(Optional<String> insecureSsl) {
        this.insecureSsl = insecureSsl;
    }

    public OrgHookConfig contentType(String contentType) {
        this.contentType = Optional.ofNullable(contentType);
        return this;
    }

    /**
     * Get contentType
     * @return contentType
     */
    @Schema(name = "content_type", example = "\"form\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("content_type")
    public Optional<String> getContentType() {
        return contentType;
    }

    public void setContentType(Optional<String> contentType) {
        this.contentType = contentType;
    }

    public OrgHookConfig secret(String secret) {
        this.secret = Optional.ofNullable(secret);
        return this;
    }

    /**
     * Get secret
     * @return secret
     */
    @Schema(name = "secret", example = "\"********\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret")
    public Optional<String> getSecret() {
        return secret;
    }

    public void setSecret(Optional<String> secret) {
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
