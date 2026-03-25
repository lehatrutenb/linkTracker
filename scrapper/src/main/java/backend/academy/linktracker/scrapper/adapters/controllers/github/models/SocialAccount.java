package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Social media account
 */
@Schema(name = "social-account", description = "Social media account")
@JsonTypeName("social-account")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SocialAccount {

    private String provider;

    private String url;

    public SocialAccount() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SocialAccount(String provider, String url) {
        this.provider = provider;
        this.url = url;
    }

    public SocialAccount provider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get provider
     * @return provider
     */
    @NotNull
    @Schema(name = "provider", example = "linkedin", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("provider")
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public SocialAccount url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Schema(
            name = "url",
            example = "https://www.linkedin.com/company/github/",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
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
        SocialAccount socialAccount = (SocialAccount) o;
        return Objects.equals(this.provider, socialAccount.provider) && Objects.equals(this.url, socialAccount.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provider, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SocialAccount {\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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
