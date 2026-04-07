package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A unique encryption key
 */
@Schema(name = "gpg-key", description = "A unique encryption key")
@JsonTypeName("gpg-key")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GpgKey {

    private Long id;

    private JsonNullable<String> name = JsonNullable.<String>undefined();

    private JsonNullable<Long> primaryKeyId = JsonNullable.<Long>undefined();

    private String keyId;

    private String publicKey;

    @Valid
    private List<@Valid GpgKeyEmailsInner> emails = new ArrayList<>();

    @Valid
    private List<@Valid GpgKeySubkeysInner> subkeys = new ArrayList<>();

    private Boolean canSign;

    private Boolean canEncryptComms;

    private Boolean canEncryptStorage;

    private Boolean canCertify;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> expiresAt = JsonNullable.<OffsetDateTime>undefined();

    private Boolean revoked;

    private JsonNullable<String> rawKey = JsonNullable.<String>undefined();

    public GpgKey() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GpgKey(
            Long id,
            Long primaryKeyId,
            String keyId,
            String publicKey,
            List<@Valid GpgKeyEmailsInner> emails,
            List<@Valid GpgKeySubkeysInner> subkeys,
            Boolean canSign,
            Boolean canEncryptComms,
            Boolean canEncryptStorage,
            Boolean canCertify,
            OffsetDateTime createdAt,
            OffsetDateTime expiresAt,
            Boolean revoked,
            String rawKey) {
        this.id = id;
        this.primaryKeyId = JsonNullable.of(primaryKeyId);
        this.keyId = keyId;
        this.publicKey = publicKey;
        this.emails = emails;
        this.subkeys = subkeys;
        this.canSign = canSign;
        this.canEncryptComms = canEncryptComms;
        this.canEncryptStorage = canEncryptStorage;
        this.canCertify = canCertify;
        this.createdAt = createdAt;
        this.expiresAt = JsonNullable.of(expiresAt);
        this.revoked = revoked;
        this.rawKey = JsonNullable.of(rawKey);
    }

    public GpgKey id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", example = "3", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GpgKey name(String name) {
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", example = "Octocat's GPG Key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public JsonNullable<String> getName() {
        return name;
    }

    public void setName(JsonNullable<String> name) {
        this.name = name;
    }

    public GpgKey primaryKeyId(Long primaryKeyId) {
        this.primaryKeyId = JsonNullable.of(primaryKeyId);
        return this;
    }

    /**
     * Get primaryKeyId
     * @return primaryKeyId
     */
    @NotNull
    @Schema(name = "primary_key_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("primary_key_id")
    public JsonNullable<Long> getPrimaryKeyId() {
        return primaryKeyId;
    }

    public void setPrimaryKeyId(JsonNullable<Long> primaryKeyId) {
        this.primaryKeyId = primaryKeyId;
    }

    public GpgKey keyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * Get keyId
     * @return keyId
     */
    @NotNull
    @Schema(name = "key_id", example = "3262EFF25BA0D270", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("key_id")
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public GpgKey publicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * Get publicKey
     * @return publicKey
     */
    @NotNull
    @Schema(name = "public_key", example = "xsBNBFayYZ...", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("public_key")
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public GpgKey emails(List<@Valid GpgKeyEmailsInner> emails) {
        this.emails = emails;
        return this;
    }

    public GpgKey addEmailsItem(GpgKeyEmailsInner emailsItem) {
        if (this.emails == null) {
            this.emails = new ArrayList<>();
        }
        this.emails.add(emailsItem);
        return this;
    }

    /**
     * Get emails
     * @return emails
     */
    @NotNull
    @Valid
    @Schema(
            name = "emails",
            example = "[{\"email\":\"octocat@users.noreply.github.com\",\"verified\":true}]",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("emails")
    public List<@Valid GpgKeyEmailsInner> getEmails() {
        return emails;
    }

    public void setEmails(List<@Valid GpgKeyEmailsInner> emails) {
        this.emails = emails;
    }

    public GpgKey subkeys(List<@Valid GpgKeySubkeysInner> subkeys) {
        this.subkeys = subkeys;
        return this;
    }

    public GpgKey addSubkeysItem(GpgKeySubkeysInner subkeysItem) {
        if (this.subkeys == null) {
            this.subkeys = new ArrayList<>();
        }
        this.subkeys.add(subkeysItem);
        return this;
    }

    /**
     * Get subkeys
     * @return subkeys
     */
    @NotNull
    @Valid
    @Schema(
            name = "subkeys",
            example =
                    "[{\"id\":4,\"primary_key_id\":3,\"key_id\":\"4A595D4C72EE49C7\",\"public_key\":\"zsBNBFayYZ...\",\"emails\":[],\"can_sign\":false,\"can_encrypt_comms\":true,\"can_encrypt_storage\":true,\"can_certify\":false,\"created_at\":\"2016-03-24T11:31:04-06:00\",\"expires_at\":null,\"revoked\":false}]",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("subkeys")
    public List<@Valid GpgKeySubkeysInner> getSubkeys() {
        return subkeys;
    }

    public void setSubkeys(List<@Valid GpgKeySubkeysInner> subkeys) {
        this.subkeys = subkeys;
    }

    public GpgKey canSign(Boolean canSign) {
        this.canSign = canSign;
        return this;
    }

    /**
     * Get canSign
     * @return canSign
     */
    @NotNull
    @Schema(name = "can_sign", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("can_sign")
    public Boolean getCanSign() {
        return canSign;
    }

    public void setCanSign(Boolean canSign) {
        this.canSign = canSign;
    }

    public GpgKey canEncryptComms(Boolean canEncryptComms) {
        this.canEncryptComms = canEncryptComms;
        return this;
    }

    /**
     * Get canEncryptComms
     * @return canEncryptComms
     */
    @NotNull
    @Schema(name = "can_encrypt_comms", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("can_encrypt_comms")
    public Boolean getCanEncryptComms() {
        return canEncryptComms;
    }

    public void setCanEncryptComms(Boolean canEncryptComms) {
        this.canEncryptComms = canEncryptComms;
    }

    public GpgKey canEncryptStorage(Boolean canEncryptStorage) {
        this.canEncryptStorage = canEncryptStorage;
        return this;
    }

    /**
     * Get canEncryptStorage
     * @return canEncryptStorage
     */
    @NotNull
    @Schema(name = "can_encrypt_storage", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("can_encrypt_storage")
    public Boolean getCanEncryptStorage() {
        return canEncryptStorage;
    }

    public void setCanEncryptStorage(Boolean canEncryptStorage) {
        this.canEncryptStorage = canEncryptStorage;
    }

    public GpgKey canCertify(Boolean canCertify) {
        this.canCertify = canCertify;
        return this;
    }

    /**
     * Get canCertify
     * @return canCertify
     */
    @NotNull
    @Schema(name = "can_certify", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("can_certify")
    public Boolean getCanCertify() {
        return canCertify;
    }

    public void setCanCertify(Boolean canCertify) {
        this.canCertify = canCertify;
    }

    public GpgKey createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", example = "2016-03-24T11:31:04-06:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public GpgKey expiresAt(OffsetDateTime expiresAt) {
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

    public GpgKey revoked(Boolean revoked) {
        this.revoked = revoked;
        return this;
    }

    /**
     * Get revoked
     * @return revoked
     */
    @NotNull
    @Schema(name = "revoked", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("revoked")
    public Boolean getRevoked() {
        return revoked;
    }

    public void setRevoked(Boolean revoked) {
        this.revoked = revoked;
    }

    public GpgKey rawKey(String rawKey) {
        this.rawKey = JsonNullable.of(rawKey);
        return this;
    }

    /**
     * Get rawKey
     * @return rawKey
     */
    @NotNull
    @Schema(name = "raw_key", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("raw_key")
    public JsonNullable<String> getRawKey() {
        return rawKey;
    }

    public void setRawKey(JsonNullable<String> rawKey) {
        this.rawKey = rawKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GpgKey gpgKey = (GpgKey) o;
        return Objects.equals(this.id, gpgKey.id)
                && equalsNullable(this.name, gpgKey.name)
                && Objects.equals(this.primaryKeyId, gpgKey.primaryKeyId)
                && Objects.equals(this.keyId, gpgKey.keyId)
                && Objects.equals(this.publicKey, gpgKey.publicKey)
                && Objects.equals(this.emails, gpgKey.emails)
                && Objects.equals(this.subkeys, gpgKey.subkeys)
                && Objects.equals(this.canSign, gpgKey.canSign)
                && Objects.equals(this.canEncryptComms, gpgKey.canEncryptComms)
                && Objects.equals(this.canEncryptStorage, gpgKey.canEncryptStorage)
                && Objects.equals(this.canCertify, gpgKey.canCertify)
                && Objects.equals(this.createdAt, gpgKey.createdAt)
                && Objects.equals(this.expiresAt, gpgKey.expiresAt)
                && Objects.equals(this.revoked, gpgKey.revoked)
                && Objects.equals(this.rawKey, gpgKey.rawKey);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                hashCodeNullable(name),
                primaryKeyId,
                keyId,
                publicKey,
                emails,
                subkeys,
                canSign,
                canEncryptComms,
                canEncryptStorage,
                canCertify,
                createdAt,
                expiresAt,
                revoked,
                rawKey);
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
        sb.append("class GpgKey {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    primaryKeyId: ").append(toIndentedString(primaryKeyId)).append("\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
        sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
        sb.append("    subkeys: ").append(toIndentedString(subkeys)).append("\n");
        sb.append("    canSign: ").append(toIndentedString(canSign)).append("\n");
        sb.append("    canEncryptComms: ")
                .append(toIndentedString(canEncryptComms))
                .append("\n");
        sb.append("    canEncryptStorage: ")
                .append(toIndentedString(canEncryptStorage))
                .append("\n");
        sb.append("    canCertify: ").append(toIndentedString(canCertify)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    revoked: ").append(toIndentedString(revoked)).append("\n");
        sb.append("    rawKey: ").append(toIndentedString(rawKey)).append("\n");
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
