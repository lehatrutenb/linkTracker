package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GpgKeySubkeysInner
 */
@JsonTypeName("gpg_key_subkeys_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GpgKeySubkeysInner {

    private Long id;

    private Long primaryKeyId;

    private String keyId;

    private String publicKey;

    @Valid
    private List<@Valid GpgKeyEmailsInner> emails = new ArrayList<>();

    @Valid
    private List<Object> subkeys = new ArrayList<>();

    private Boolean canSign;

    private Boolean canEncryptComms;

    private Boolean canEncryptStorage;

    private Boolean canCertify;

    private String createdAt;

    private String expiresAt = null;

    private String rawKey = null;

    private Boolean revoked;

    public GpgKeySubkeysInner id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GpgKeySubkeysInner primaryKeyId(Long primaryKeyId) {
        this.primaryKeyId = primaryKeyId;
        return this;
    }

    /**
     * Get primaryKeyId
     * @return primaryKeyId
     */
    @Schema(name = "primary_key_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("primary_key_id")
    public Long getPrimaryKeyId() {
        return primaryKeyId;
    }

    public void setPrimaryKeyId(Long primaryKeyId) {
        this.primaryKeyId = primaryKeyId;
    }

    public GpgKeySubkeysInner keyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * Get keyId
     * @return keyId
     */
    @Schema(name = "key_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("key_id")
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public GpgKeySubkeysInner publicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * Get publicKey
     * @return publicKey
     */
    @Schema(name = "public_key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("public_key")
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
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
        this.canSign = canSign;
        return this;
    }

    /**
     * Get canSign
     * @return canSign
     */
    @Schema(name = "can_sign", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("can_sign")
    public Boolean getCanSign() {
        return canSign;
    }

    public void setCanSign(Boolean canSign) {
        this.canSign = canSign;
    }

    public GpgKeySubkeysInner canEncryptComms(Boolean canEncryptComms) {
        this.canEncryptComms = canEncryptComms;
        return this;
    }

    /**
     * Get canEncryptComms
     * @return canEncryptComms
     */
    @Schema(name = "can_encrypt_comms", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("can_encrypt_comms")
    public Boolean getCanEncryptComms() {
        return canEncryptComms;
    }

    public void setCanEncryptComms(Boolean canEncryptComms) {
        this.canEncryptComms = canEncryptComms;
    }

    public GpgKeySubkeysInner canEncryptStorage(Boolean canEncryptStorage) {
        this.canEncryptStorage = canEncryptStorage;
        return this;
    }

    /**
     * Get canEncryptStorage
     * @return canEncryptStorage
     */
    @Schema(name = "can_encrypt_storage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("can_encrypt_storage")
    public Boolean getCanEncryptStorage() {
        return canEncryptStorage;
    }

    public void setCanEncryptStorage(Boolean canEncryptStorage) {
        this.canEncryptStorage = canEncryptStorage;
    }

    public GpgKeySubkeysInner canCertify(Boolean canCertify) {
        this.canCertify = canCertify;
        return this;
    }

    /**
     * Get canCertify
     * @return canCertify
     */
    @Schema(name = "can_certify", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("can_certify")
    public Boolean getCanCertify() {
        return canCertify;
    }

    public void setCanCertify(Boolean canCertify) {
        this.canCertify = canCertify;
    }

    public GpgKeySubkeysInner createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public GpgKeySubkeysInner expiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * Get expiresAt
     * @return expiresAt
     */
    @Schema(name = "expires_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("expires_at")
    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    public GpgKeySubkeysInner rawKey(String rawKey) {
        this.rawKey = rawKey;
        return this;
    }

    /**
     * Get rawKey
     * @return rawKey
     */
    @Schema(name = "raw_key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("raw_key")
    public String getRawKey() {
        return rawKey;
    }

    public void setRawKey(String rawKey) {
        this.rawKey = rawKey;
    }

    public GpgKeySubkeysInner revoked(Boolean revoked) {
        this.revoked = revoked;
        return this;
    }

    /**
     * Get revoked
     * @return revoked
     */
    @Schema(name = "revoked", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("revoked")
    public Boolean getRevoked() {
        return revoked;
    }

    public void setRevoked(Boolean revoked) {
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
                && Objects.equals(this.expiresAt, gpgKeySubkeysInner.expiresAt)
                && Objects.equals(this.rawKey, gpgKeySubkeysInner.rawKey)
                && Objects.equals(this.revoked, gpgKeySubkeysInner.revoked);
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
                expiresAt,
                rawKey,
                revoked);
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
