package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.net.URI;
import java.util.Objects;
import java.util.Optional;

/**
 * Key/value pairs to provide settings for this webhook.
 */
@Schema(
        name = "repos_create_webhook_request_config",
        description = "Key/value pairs to provide settings for this webhook.")
@JsonTypeName("repos_create_webhook_request_config")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreateWebhookRequestConfig {

    private Optional<URI> url = Optional.empty();

    private Optional<String> contentType = Optional.empty();

    private Optional<String> secret = Optional.empty();

    private Optional<WebhookConfigInsecureSsl> insecureSsl = Optional.empty();

    public ReposCreateWebhookRequestConfig url(URI url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * The URL to which the payloads will be delivered.
     * @return url
     */
    @Valid
    @Schema(
            name = "url",
            example = "https://example.com/webhook",
            description = "The URL to which the payloads will be delivered.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public Optional<URI> getUrl() {
        return url;
    }

    public void setUrl(Optional<URI> url) {
        this.url = url;
    }

    public ReposCreateWebhookRequestConfig contentType(String contentType) {
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

    public ReposCreateWebhookRequestConfig secret(String secret) {
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

    public ReposCreateWebhookRequestConfig insecureSsl(WebhookConfigInsecureSsl insecureSsl) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposCreateWebhookRequestConfig reposCreateWebhookRequestConfig = (ReposCreateWebhookRequestConfig) o;
        return Objects.equals(this.url, reposCreateWebhookRequestConfig.url)
                && Objects.equals(this.contentType, reposCreateWebhookRequestConfig.contentType)
                && Objects.equals(this.secret, reposCreateWebhookRequestConfig.secret)
                && Objects.equals(this.insecureSsl, reposCreateWebhookRequestConfig.insecureSsl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, contentType, secret, insecureSsl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposCreateWebhookRequestConfig {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
        sb.append("    insecureSsl: ").append(toIndentedString(insecureSsl)).append("\n");
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
