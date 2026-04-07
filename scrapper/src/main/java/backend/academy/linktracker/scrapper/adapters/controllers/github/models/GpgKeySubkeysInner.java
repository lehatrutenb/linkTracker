package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * GpgKeySubkeysInner
 */
@JsonTypeName("gpg_key_subkeys_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GpgKeySubkeysInner {

    private Optional<Long> id = Optional.empty();

    private Optional<Long> primaryKeyId = Optional.empty();

    private Optional<String> keyId = Optional.empty();

    private Optional<String> publicKey = Optional.empty();

    @Valid
    private List<@Valid GpgKeyEmailsInner> emails = new ArrayList<>();

    @Valid
    private List<Object> subkeys = new ArrayList<>();

    private Optional<Boolean> canSign = Optional.empty();

    private Optional<Boolean> canEncryptComms = Optional.empty();

    private Optional<Boolean> canEncryptStorage = Optional.empty();

    private Optional<Boolean> canCertify = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private JsonNullable<String> expiresAt = JsonNullable.<String>undefined();

    private JsonNullable<String> rawKey = JsonNullable.<String>undefined();

    private Optional<Boolean> revoked = Optional.empty();

    public GpgKeySubkeysInner id(Long id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public GpgKeySubkeysInner primaryKeyId(Long primaryKeyId) {
        this.primaryKeyId = Optional.ofNullable(primaryKeyId);
        return this;
    }

    /**
     * Get primaryKeyId
     * @return primaryKeyId
     */
    @Schema(name = "primary_key_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("primary_key_id")
    public Optional<Long> getPrimaryKeyId() {
        return primaryKeyId;
    }

    public void setPrimaryKeyId(Optional<Long> primaryKeyId) {
        this.primaryKeyId = primaryKeyId;
    }

    public GpgKeySubkeysInner keyId(String keyId) {
        this.keyId = Optional.ofNullable(keyId);
        return this;
    }

    /**
     * Get keyId
     * @return keyId
     */
    @Schema(name = "key_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("key_id")
    public Optional<String> getKeyId() {
        return keyId;
    }

    public void setKeyId(Optional<String> keyId) {
        this.keyId = keyId;
    }

    public GpgKeySubkeysInner publicKey(String publicKey) {
        this.publicKey = Optional.ofNullable(publicKey);
        return this;
    }

    /**
     * Get publicKey
     * @return publicKey
     */
    @Schema(name = "public_key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("public_key")
    public Optional<String> getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(Optional<String> publicKey) {
        this.publicKey = publicKey;
    }

    public GpgKeySubkeysInner emails(List<@Valid GpgKeyEmailsInner> emails) {
        this.emails = emails;
        return this;
    }

    public GpgKeySubkeysInner addEmailsItem(GpgKeyEmailsInner emailsItem) {
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
    @Valid
    @Schema(name = "emails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("emails")
    public List<@Valid GpgKeyEmailsInner> getEmails() {
        return emails;
    }

    public void setEmails(List<@Valid GpgKeyEmailsInner> emails) {
        this.emails = emails;
    }

    public GpgKeySubkeysInner subkeys(List<Object> subkeys) {
        this.subkeys = subkeys;
        return this;
    }

    public GpgKeySubkeysInner addSubkeysItem(Object subkeysItem) {
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
    @Schema(name = "subkeys", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subkeys")
    public List<Object> getSubkeys() {
        return subkeys;
    }

    public void setSubkeys(List<Object> subkeys) {
        this.subkeys = subkeys;
    }

    public GpgKeySubkeysInner canSign(Boolean canSign) {
        this.canSign = Optional.ofNullable(canSign);
        return this;
    }

    /**
     * Get canSign
     * @return canSign
     */
    @Schema(name = "can_sign", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("can_sign")
    public Optional<Boolean> getCanSign() {
        return canSign;
    }

    public void setCanSign(Optional<Boolean> canSign) {
        this.canSign = canSign;
    }

    public GpgKeySubkeysInner canEncryptComms(Boolean canEncryptComms) {
        this.canEncryptComms = Optional.ofNullable(canEncryptComms);
        return this;
    }

    /**
     * Get canEncryptComms
     * @return canEncryptComms
     */
    @Schema(name = "can_encrypt_comms", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("can_encrypt_comms")
    public Optional<Boolean> getCanEncryptComms() {
        return canEncryptComms;
    }

    public void setCanEncryptComms(Optional<Boolean> canEncryptComms) {
        this.canEncryptComms = canEncryptComms;
    }

    public GpgKeySubkeysInner canEncryptStorage(Boolean canEncryptStorage) {
        this.canEncryptStorage = Optional.ofNullable(canEncryptStorage);
        return this;
    }

    /**
     * Get canEncryptStorage
     * @return canEncryptStorage
     */
    @Schema(name = "can_encrypt_storage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("can_encrypt_storage")
    public Optional<Boolean> getCanEncryptStorage() {
        return canEncryptStorage;
    }

    public void setCanEncryptStorage(Optional<Boolean> canEncryptStorage) {
        this.canEncryptStorage = canEncryptStorage;
    }

    public GpgKeySubkeysInner canCertify(Boolean canCertify) {
        this.canCertify = Optional.ofNullable(canCertify);
        return this;
    }

    /**
     * Get canCertify
     * @return canCertify
     */
    @Schema(name = "can_certify", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("can_certify")
    public Optional<Boolean> getCanCertify() {
        return canCertify;
    }

    public void setCanCertify(Optional<Boolean> canCertify) {
        this.canCertify = canCertify;
    }

    public GpgKeySubkeysInner createdAt(String createdAt) {
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public Optional<String> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Optional<String> createdAt) {
        this.createdAt = createdAt;
    }

    public GpgKeySubkeysInner expiresAt(String expiresAt) {
        this.expiresAt = JsonNullable.of(expiresAt);
        return this;
    }

    /**
     * Get expiresAt
     * @return expiresAt
     */
    @Schema(name = "expires_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("expires_at")
    public JsonNullable<String> getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(JsonNullable<String> expiresAt) {
        this.expiresAt = expiresAt;
    }

    public GpgKeySubkeysInner rawKey(String rawKey) {
        this.rawKey = JsonNullable.of(rawKey);
        return this;
    }

    /**
     * Get rawKey
     * @return rawKey
     */
    @Schema(name = "raw_key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("raw_key")
    public JsonNullable<String> getRawKey() {
        return rawKey;
    }

    public void setRawKey(JsonNullable<String> rawKey) {
        this.rawKey = rawKey;
    }

    public GpgKeySubkeysInner revoked(Boolean revoked) {
        this.revoked = Optional.ofNullable(revoked);
        return this;
    }

    /**
     * Get revoked
     * @return revoked
     */
    @Schema(name = "revoked", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("revoked")
    public Optional<Boolean> getRevoked() {
        return revoked;
    }

    public void setRevoked(Optional<Boolean> revoked) {
        this.revoked = revoked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GpgKeySubkeysInner gpgKeySubkeysInner = (GpgKeySubkeysInner) o;
        return Objects.equals(this.id, gpgKeySubkeysInner.id)
                && Objects.equals(this.primaryKeyId, gpgKeySubkeysInner.primaryKeyId)
                && Objects.equals(this.keyId, gpgKeySubkeysInner.keyId)
                && Objects.equals(this.publicKey, gpgKeySubkeysInner.publicKey)
                && Objects.equals(this.emails, gpgKeySubkeysInner.emails)
                && Objects.equals(this.subkeys, gpgKeySubkeysInner.subkeys)
                && Objects.equals(this.canSign, gpgKeySubkeysInner.canSign)
                && Objects.equals(this.canEncryptComms, gpgKeySubkeysInner.canEncryptComms)
                && Objects.equals(this.canEncryptStorage, gpgKeySubkeysInner.canEncryptStorage)
                && Objects.equals(this.canCertify, gpgKeySubkeysInner.canCertify)
                && Objects.equals(this.createdAt, gpgKeySubkeysInner.createdAt)
                && equalsNullable(this.expiresAt, gpgKeySubkeysInner.expiresAt)
                && equalsNullable(this.rawKey, gpgKeySubkeysInner.rawKey)
                && Objects.equals(this.revoked, gpgKeySubkeysInner.revoked);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
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
                hashCodeNullable(expiresAt),
                hashCodeNullable(rawKey),
                revoked);
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
        sb.append("class GpgKeySubkeysInner {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
        sb.append("    rawKey: ").append(toIndentedString(rawKey)).append("\n");
        sb.append("    revoked: ").append(toIndentedString(revoked)).append("\n");
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
