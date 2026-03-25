package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WebhookOrganizationRenamedChanges
 */
@JsonTypeName("webhook_organization_renamed_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookOrganizationRenamedChanges {

    private WebhookOrganizationRenamedChangesLogin login;

    public WebhookOrganizationRenamedChanges login(WebhookOrganizationRenamedChangesLogin login) {
        this.login = login;
        return this;
    }

    /**
     * Get login
     * @return login
     */
    @Valid
    @Schema(name = "login", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("login")
    public WebhookOrganizationRenamedChangesLogin getLogin() {
        return login;
    }

    public void setLogin(WebhookOrganizationRenamedChangesLogin login) {
        this.login = login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookOrganizationRenamedChanges webhookOrganizationRenamedChanges = (WebhookOrganizationRenamedChanges) o;
        return Objects.equals(this.login, webhookOrganizationRenamedChanges.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookOrganizationRenamedChanges {\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
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
