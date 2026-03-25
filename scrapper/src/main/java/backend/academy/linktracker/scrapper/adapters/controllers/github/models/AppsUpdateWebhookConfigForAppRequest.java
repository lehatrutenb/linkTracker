package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * AppsUpdateWebhookConfigForAppRequest
 */
@JsonTypeName("apps_update_webhook_config_for_app_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class AppsUpdateWebhookConfigForAppRequest {

    private URI url;

    private String contentType;

    private String secret;

    private WebhookConfigInsecureSsl insecureSsl;

    public AppsUpdateWebhookConfigForAppRequest url(URI url) {
        this.url = url;
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
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public AppsUpdateWebhookConfigForAppRequest contentType(String contentType) {
        this.contentType = contentType;
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
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public AppsUpdateWebhookConfigForAppRequest secret(String secret) {
        this.secret = secret;
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
    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public AppsUpdateWebhookConfigForAppRequest insecureSsl(WebhookConfigInsecureSsl insecureSsl) {
        this.insecureSsl = insecureSsl;
        return this;
    }

    /**
     * Get insecureSsl
     * @return insecureSsl
     */
    @Valid
    @Schema(name = "insecure_ssl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("insecure_ssl")
    public WebhookConfigInsecureSsl getInsecureSsl() {
        return insecureSsl;
    }

    public void setInsecureSsl(WebhookConfigInsecureSsl insecureSsl) {
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
        AppsUpdateWebhookConfigForAppRequest appsUpdateWebhookConfigForAppRequest =
                (AppsUpdateWebhookConfigForAppRequest) o;
        return Objects.equals(this.url, appsUpdateWebhookConfigForAppRequest.url)
                && Objects.equals(this.contentType, appsUpdateWebhookConfigForAppRequest.contentType)
                && Objects.equals(this.secret, appsUpdateWebhookConfigForAppRequest.secret)
                && Objects.equals(this.insecureSsl, appsUpdateWebhookConfigForAppRequest.insecureSsl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, contentType, secret, insecureSsl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppsUpdateWebhookConfigForAppRequest {\n");
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
