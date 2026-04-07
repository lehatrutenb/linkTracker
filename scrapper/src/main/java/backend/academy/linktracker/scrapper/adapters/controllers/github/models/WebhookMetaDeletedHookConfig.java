package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookMetaDeletedHookConfig
 */
@JsonTypeName("webhook_meta_deleted_hook_config")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookMetaDeletedHookConfig {

    /**
     * Gets or Sets contentType
     */
    public enum ContentTypeEnum {
        JSON("json"),

        FORM("form");

        private final String value;

        ContentTypeEnum(String value) {
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
        public static ContentTypeEnum fromValue(String value) {
            for (ContentTypeEnum b : ContentTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ContentTypeEnum contentType;

    private String insecureSsl;

    private Optional<String> secret = Optional.empty();

    private URI url;

    public WebhookMetaDeletedHookConfig() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookMetaDeletedHookConfig(ContentTypeEnum contentType, String insecureSsl, URI url) {
        this.contentType = contentType;
        this.insecureSsl = insecureSsl;
        this.url = url;
    }

    public WebhookMetaDeletedHookConfig contentType(ContentTypeEnum contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get contentType
     * @return contentType
     */
    @NotNull
    @Schema(name = "content_type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("content_type")
    public ContentTypeEnum getContentType() {
        return contentType;
    }

    public void setContentType(ContentTypeEnum contentType) {
        this.contentType = contentType;
    }

    public WebhookMetaDeletedHookConfig insecureSsl(String insecureSsl) {
        this.insecureSsl = insecureSsl;
        return this;
    }

    /**
     * Get insecureSsl
     * @return insecureSsl
     */
    @NotNull
    @Schema(name = "insecure_ssl", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("insecure_ssl")
    public String getInsecureSsl() {
        return insecureSsl;
    }

    public void setInsecureSsl(String insecureSsl) {
        this.insecureSsl = insecureSsl;
    }

    public WebhookMetaDeletedHookConfig secret(String secret) {
        this.secret = Optional.ofNullable(secret);
        return this;
    }

    /**
     * Get secret
     * @return secret
     */
    @Schema(name = "secret", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret")
    public Optional<String> getSecret() {
        return secret;
    }

    public void setSecret(Optional<String> secret) {
        this.secret = secret;
    }

    public WebhookMetaDeletedHookConfig url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookMetaDeletedHookConfig webhookMetaDeletedHookConfig = (WebhookMetaDeletedHookConfig) o;
        return Objects.equals(this.contentType, webhookMetaDeletedHookConfig.contentType)
                && Objects.equals(this.insecureSsl, webhookMetaDeletedHookConfig.insecureSsl)
                && Objects.equals(this.secret, webhookMetaDeletedHookConfig.secret)
                && Objects.equals(this.url, webhookMetaDeletedHookConfig.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentType, insecureSsl, secret, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookMetaDeletedHookConfig {\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    insecureSsl: ").append(toIndentedString(insecureSsl)).append("\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
