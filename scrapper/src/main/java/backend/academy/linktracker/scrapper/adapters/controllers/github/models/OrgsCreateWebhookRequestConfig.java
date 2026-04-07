package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;
import java.util.Optional;

/**
 * Key/value pairs to provide settings for this webhook.
 */
@Schema(
        name = "orgs_create_webhook_request_config",
        description = "Key/value pairs to provide settings for this webhook.")
@JsonTypeName("orgs_create_webhook_request_config")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsCreateWebhookRequestConfig {

    private URI url;

    private Optional<String> contentType = Optional.empty();

    private Optional<String> secret = Optional.empty();

    private Optional<WebhookConfigInsecureSsl> insecureSsl = Optional.empty();

    private Optional<String> username = Optional.empty();

    private Optional<String> password = Optional.empty();

    public OrgsCreateWebhookRequestConfig() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrgsCreateWebhookRequestConfig(URI url) {
        this.url = url;
    }

    public OrgsCreateWebhookRequestConfig url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * The URL to which the payloads will be delivered.
     * @return url
     */
    @NotNull
    @Valid
    @Schema(
            name = "url",
            example = "https://example.com/webhook",
            description = "The URL to which the payloads will be delivered.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public OrgsCreateWebhookRequestConfig contentType(String contentType) {
        this.contentType = Optional.ofNullable(contentType);
        return this;
    }

    /**
     * The media type used to serialize the payloads. Supported values include `json` and `form`. The default is `form`.
     * @return contentType
     */
    @Schema(
            name = "content_type",
            example = "\"json\"",
            description =
                    "The media type used to serialize the payloads. Supported values include `json` and `form`. The default is `form`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("content_type")
    public Optional<String> getContentType() {
        return contentType;
    }

    public void setContentType(Optional<String> contentType) {
        this.contentType = contentType;
    }

    public OrgsCreateWebhookRequestConfig secret(String secret) {
        this.secret = Optional.ofNullable(secret);
        return this;
    }

    /**
     * If provided, the `secret` will be used as the `key` to generate the HMAC hex digest value for [delivery signature headers](https://docs.github.com/webhooks/event-payloads/#delivery-headers).
     * @return secret
     */
    @Schema(
            name = "secret",
            example = "\"********\"",
            description =
                    "If provided, the `secret` will be used as the `key` to generate the HMAC hex digest value for [delivery signature headers](https://docs.github.com/webhooks/event-payloads/#delivery-headers).",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret")
    public Optional<String> getSecret() {
        return secret;
    }

    public void setSecret(Optional<String> secret) {
        this.secret = secret;
    }

    public OrgsCreateWebhookRequestConfig insecureSsl(WebhookConfigInsecureSsl insecureSsl) {
        this.insecureSsl = Optional.ofNullable(insecureSsl);
        return this;
    }

    /**
     * Get insecureSsl
     * @return insecureSsl
     */
    @Valid
    @Schema(name = "insecure_ssl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("insecure_ssl")
    public Optional<WebhookConfigInsecureSsl> getInsecureSsl() {
        return insecureSsl;
    }

    public void setInsecureSsl(Optional<WebhookConfigInsecureSsl> insecureSsl) {
        this.insecureSsl = insecureSsl;
    }

    public OrgsCreateWebhookRequestConfig username(String username) {
        this.username = Optional.ofNullable(username);
        return this;
    }

    /**
     * Get username
     * @return username
     */
    @Schema(name = "username", example = "\"kdaigle\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("username")
    public Optional<String> getUsername() {
        return username;
    }

    public void setUsername(Optional<String> username) {
        this.username = username;
    }

    public OrgsCreateWebhookRequestConfig password(String password) {
        this.password = Optional.ofNullable(password);
        return this;
    }

    /**
     * Get password
     * @return password
     */
    @Schema(name = "password", example = "\"password\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("password")
    public Optional<String> getPassword() {
        return password;
    }

    public void setPassword(Optional<String> password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsCreateWebhookRequestConfig orgsCreateWebhookRequestConfig = (OrgsCreateWebhookRequestConfig) o;
        return Objects.equals(this.url, orgsCreateWebhookRequestConfig.url)
                && Objects.equals(this.contentType, orgsCreateWebhookRequestConfig.contentType)
                && Objects.equals(this.secret, orgsCreateWebhookRequestConfig.secret)
                && Objects.equals(this.insecureSsl, orgsCreateWebhookRequestConfig.insecureSsl)
                && Objects.equals(this.username, orgsCreateWebhookRequestConfig.username)
                && Objects.equals(this.password, orgsCreateWebhookRequestConfig.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, contentType, secret, insecureSsl, username, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsCreateWebhookRequestConfig {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
        sb.append("    insecureSsl: ").append(toIndentedString(insecureSsl)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
