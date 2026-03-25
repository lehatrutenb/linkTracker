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
 * Porter Author
 */
@Schema(name = "porter-author", description = "Porter Author")
@JsonTypeName("porter-author")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PorterAuthor {

    private Long id;

    private String remoteId;

    private String remoteName;

    private String email;

    private String name;

    private URI url;

    private URI importUrl;

    public PorterAuthor() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PorterAuthor(
            Long id, String remoteId, String remoteName, String email, String name, URI url, URI importUrl) {
        this.id = id;
        this.remoteId = remoteId;
        this.remoteName = remoteName;
        this.email = email;
        this.name = name;
        this.url = url;
        this.importUrl = importUrl;
    }

    public PorterAuthor id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PorterAuthor remoteId(String remoteId) {
        this.remoteId = remoteId;
        return this;
    }

    /**
     * Get remoteId
     * @return remoteId
     */
    @NotNull
    @Schema(name = "remote_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("remote_id")
    public String getRemoteId() {
        return remoteId;
    }

    public void setRemoteId(String remoteId) {
        this.remoteId = remoteId;
    }

    public PorterAuthor remoteName(String remoteName) {
        this.remoteName = remoteName;
        return this;
    }

    /**
     * Get remoteName
     * @return remoteName
     */
    @NotNull
    @Schema(name = "remote_name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("remote_name")
    public String getRemoteName() {
        return remoteName;
    }

    public void setRemoteName(String remoteName) {
        this.remoteName = remoteName;
    }

    public PorterAuthor email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     * @return email
     */
    @NotNull
    @Schema(name = "email", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PorterAuthor name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PorterAuthor url(URI url) {
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

    public PorterAuthor importUrl(URI importUrl) {
        this.importUrl = importUrl;
        return this;
    }

    /**
     * Get importUrl
     * @return importUrl
     */
    @NotNull
    @Valid
    @Schema(name = "import_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("import_url")
    public URI getImportUrl() {
        return importUrl;
    }

    public void setImportUrl(URI importUrl) {
        this.importUrl = importUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PorterAuthor porterAuthor = (PorterAuthor) o;
        return Objects.equals(this.id, porterAuthor.id)
                && Objects.equals(this.remoteId, porterAuthor.remoteId)
                && Objects.equals(this.remoteName, porterAuthor.remoteName)
                && Objects.equals(this.email, porterAuthor.email)
                && Objects.equals(this.name, porterAuthor.name)
                && Objects.equals(this.url, porterAuthor.url)
                && Objects.equals(this.importUrl, porterAuthor.importUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, remoteId, remoteName, email, name, url, importUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PorterAuthor {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
        sb.append("    remoteName: ").append(toIndentedString(remoteName)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    importUrl: ").append(toIndentedString(importUrl)).append("\n");
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
