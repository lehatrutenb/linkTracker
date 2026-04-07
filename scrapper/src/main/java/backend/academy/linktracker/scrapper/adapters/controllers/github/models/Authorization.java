package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * The authorization for an OAuth app, GitHub App, or a Personal Access Token.
 */
@Schema(
        name = "authorization",
        description = "The authorization for an OAuth app, GitHub App, or a Personal Access Token.")
@JsonTypeName("authorization")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Authorization {

    private Long id;

    private URI url;

    @Valid
    private JsonNullable<List<String>> scopes = JsonNullable.<List<String>>undefined();

    private String token;

    private JsonNullable<String> tokenLastEight = JsonNullable.<String>undefined();

    private JsonNullable<String> hashedToken = JsonNullable.<String>undefined();

    private AuthorizationApp app;

    private JsonNullable<String> note = JsonNullable.<String>undefined();

    private JsonNullable<URI> noteUrl = JsonNullable.<URI>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private JsonNullable<String> fingerprint = JsonNullable.<String>undefined();

    private JsonNullable<NullableSimpleUser> user = JsonNullable.<NullableSimpleUser>undefined();

    private JsonNullable<NullableScopedInstallation> installation =
            JsonNullable.<NullableScopedInstallation>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> expiresAt = JsonNullable.<OffsetDateTime>undefined();

    public Authorization() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Authorization(
            Long id,
            URI url,
            List<String> scopes,
            String token,
            String tokenLastEight,
            String hashedToken,
            AuthorizationApp app,
            String note,
            URI noteUrl,
            OffsetDateTime updatedAt,
            OffsetDateTime createdAt,
            String fingerprint,
            OffsetDateTime expiresAt) {
        this.id = id;
        this.url = url;
        this.scopes = JsonNullable.of(scopes);
        this.token = token;
        this.tokenLastEight = JsonNullable.of(tokenLastEight);
        this.hashedToken = JsonNullable.of(hashedToken);
        this.app = app;
        this.note = JsonNullable.of(note);
        this.noteUrl = JsonNullable.of(noteUrl);
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.fingerprint = JsonNullable.of(fingerprint);
        this.expiresAt = JsonNullable.of(expiresAt);
    }

    public Authorization id(Long id) {
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

    public Authorization url(URI url) {
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

    public Authorization scopes(List<String> scopes) {
        this.scopes = JsonNullable.of(scopes);
        return this;
    }

    public Authorization addScopesItem(String scopesItem) {
        if (this.scopes == null || !this.scopes.isPresent()) {
            this.scopes = JsonNullable.of(new ArrayList<>());
        }
        this.scopes.get().add(scopesItem);
        return this;
    }

    /**
     * A list of scopes that this authorization is in.
     * @return scopes
     */
    @NotNull
    @Schema(
            name = "scopes",
            description = "A list of scopes that this authorization is in.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("scopes")
    public JsonNullable<List<String>> getScopes() {
        return scopes;
    }

    public void setScopes(JsonNullable<List<String>> scopes) {
        this.scopes = scopes;
    }

    public Authorization token(String token) {
        this.token = token;
        return this;
    }

    /**
     * Get token
     * @return token
     */
    @NotNull
    @Schema(name = "token", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Authorization tokenLastEight(String tokenLastEight) {
        this.tokenLastEight = JsonNullable.of(tokenLastEight);
        return this;
    }

    /**
     * Get tokenLastEight
     * @return tokenLastEight
     */
    @NotNull
    @Schema(name = "token_last_eight", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("token_last_eight")
    public JsonNullable<String> getTokenLastEight() {
        return tokenLastEight;
    }

    public void setTokenLastEight(JsonNullable<String> tokenLastEight) {
        this.tokenLastEight = tokenLastEight;
    }

    public Authorization hashedToken(String hashedToken) {
        this.hashedToken = JsonNullable.of(hashedToken);
        return this;
    }

    /**
     * Get hashedToken
     * @return hashedToken
     */
    @NotNull
    @Schema(name = "hashed_token", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("hashed_token")
    public JsonNullable<String> getHashedToken() {
        return hashedToken;
    }

    public void setHashedToken(JsonNullable<String> hashedToken) {
        this.hashedToken = hashedToken;
    }

    public Authorization app(AuthorizationApp app) {
        this.app = app;
        return this;
    }

    /**
     * Get app
     * @return app
     */
    @NotNull
    @Valid
    @Schema(name = "app", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("app")
    public AuthorizationApp getApp() {
        return app;
    }

    public void setApp(AuthorizationApp app) {
        this.app = app;
    }

    public Authorization note(String note) {
        this.note = JsonNullable.of(note);
        return this;
    }

    /**
     * Get note
     * @return note
     */
    @NotNull
    @Schema(name = "note", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("note")
    public JsonNullable<String> getNote() {
        return note;
    }

    public void setNote(JsonNullable<String> note) {
        this.note = note;
    }

    public Authorization noteUrl(URI noteUrl) {
        this.noteUrl = JsonNullable.of(noteUrl);
        return this;
    }

    /**
     * Get noteUrl
     * @return noteUrl
     */
    @NotNull
    @Valid
    @Schema(name = "note_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("note_url")
    public JsonNullable<URI> getNoteUrl() {
        return noteUrl;
    }

    public void setNoteUrl(JsonNullable<URI> noteUrl) {
        this.noteUrl = noteUrl;
    }

    public Authorization updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Authorization createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Authorization fingerprint(String fingerprint) {
        this.fingerprint = JsonNullable.of(fingerprint);
        return this;
    }

    /**
     * Get fingerprint
     * @return fingerprint
     */
    @NotNull
    @Schema(name = "fingerprint", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("fingerprint")
    public JsonNullable<String> getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(JsonNullable<String> fingerprint) {
        this.fingerprint = fingerprint;
    }

    public Authorization user(NullableSimpleUser user) {
        this.user = JsonNullable.of(user);
        return this;
    }

    /**
     * Get user
     * @return user
     */
    @Valid
    @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("user")
    public JsonNullable<NullableSimpleUser> getUser() {
        return user;
    }

    public void setUser(JsonNullable<NullableSimpleUser> user) {
        this.user = user;
    }

    public Authorization installation(NullableScopedInstallation installation) {
        this.installation = JsonNullable.of(installation);
        return this;
    }

    /**
     * Get installation
     * @return installation
     */
    @Valid
    @Schema(name = "installation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("installation")
    public JsonNullable<NullableScopedInstallation> getInstallation() {
        return installation;
    }

    public void setInstallation(JsonNullable<NullableScopedInstallation> installation) {
        this.installation = installation;
    }

    public Authorization expiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = JsonNullable.of(expiresAt);
        return this;
    }

    /**
     * Get expiresAt
     * @return expiresAt
     */
    @NotNull
    @Valid
    @Schema(name = "expires_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("expires_at")
    public JsonNullable<OffsetDateTime> getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(JsonNullable<OffsetDateTime> expiresAt) {
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
        Authorization authorization = (Authorization) o;
        return Objects.equals(this.id, authorization.id)
                && Objects.equals(this.url, authorization.url)
                && Objects.equals(this.scopes, authorization.scopes)
                && Objects.equals(this.token, authorization.token)
                && Objects.equals(this.tokenLastEight, authorization.tokenLastEight)
                && Objects.equals(this.hashedToken, authorization.hashedToken)
                && Objects.equals(this.app, authorization.app)
                && Objects.equals(this.note, authorization.note)
                && Objects.equals(this.noteUrl, authorization.noteUrl)
                && Objects.equals(this.updatedAt, authorization.updatedAt)
                && Objects.equals(this.createdAt, authorization.createdAt)
                && Objects.equals(this.fingerprint, authorization.fingerprint)
                && equalsNullable(this.user, authorization.user)
                && equalsNullable(this.installation, authorization.installation)
                && Objects.equals(this.expiresAt, authorization.expiresAt);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                url,
                scopes,
                token,
                tokenLastEight,
                hashedToken,
                app,
                note,
                noteUrl,
                updatedAt,
                createdAt,
                fingerprint,
                hashCodeNullable(user),
                hashCodeNullable(installation),
                expiresAt);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Authorization {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    tokenLastEight: ")
                .append(toIndentedString(tokenLastEight))
                .append("\n");
        sb.append("    hashedToken: ").append(toIndentedString(hashedToken)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    noteUrl: ").append(toIndentedString(noteUrl)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
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
