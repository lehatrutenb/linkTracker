package backend.academy.linktracker.scrapper.adapters.controllers.stackoverflow.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.net.URI;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents a user in a shallow form, typically used within other objects.
 */
@Schema(name = "ShallowUser", description = "Represents a user in a shallow form, typically used within other objects.")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:10:37.029105836Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ShallowUser {

    private Optional<Long> acceptRate = Optional.empty();

    private Optional<Long> accountId = Optional.empty();

    private Optional<String> displayName = Optional.empty();

    private Optional<URI> link = Optional.empty();

    private Optional<URI> profileImage = Optional.empty();

    private Optional<Long> reputation = Optional.empty();

    private Optional<Long> userId = Optional.empty();

    /**
     * The type of user account.
     */
    public enum UserTypeEnum {
        UNREGISTERED("unregistered"),

        REGISTERED("registered"),

        MODERATOR("moderator"),

        DOES_NOT_EXIST("does_not_exist");

        private final String value;

        UserTypeEnum(String value) {
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
        public static UserTypeEnum fromValue(String value) {
            for (UserTypeEnum b : UserTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<UserTypeEnum> userType = Optional.empty();

    public ShallowUser acceptRate(Long acceptRate) {
        this.acceptRate = Optional.ofNullable(acceptRate);
        return this;
    }

    /**
     * The percentage of questions the user has accepted answers for.
     * @return acceptRate
     */
    @Schema(
            name = "accept_rate",
            example = "52",
            description = "The percentage of questions the user has accepted answers for.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("accept_rate")
    public Optional<Long> getAcceptRate() {
        return acceptRate;
    }

    public void setAcceptRate(Optional<Long> acceptRate) {
        this.acceptRate = acceptRate;
    }

    public ShallowUser accountId(Long accountId) {
        this.accountId = Optional.ofNullable(accountId);
        return this;
    }

    /**
     * The user's account ID across the Stack Exchange network.
     * @return accountId
     */
    @Schema(
            name = "account_id",
            example = "20130",
            description = "The user's account ID across the Stack Exchange network.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("account_id")
    public Optional<Long> getAccountId() {
        return accountId;
    }

    public void setAccountId(Optional<Long> accountId) {
        this.accountId = accountId;
    }

    public ShallowUser displayName(String displayName) {
        this.displayName = Optional.ofNullable(displayName);
        return this;
    }

    /**
     * The user's display name.
     * @return displayName
     */
    @Schema(
            name = "display_name",
            example = "Matthew Flaschen",
            description = "The user's display name.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("display_name")
    public Optional<String> getDisplayName() {
        return displayName;
    }

    public void setDisplayName(Optional<String> displayName) {
        this.displayName = displayName;
    }

    public ShallowUser link(URI link) {
        this.link = Optional.ofNullable(link);
        return this;
    }

    /**
     * The URL to the user's profile.
     * @return link
     */
    @Valid
    @Schema(
            name = "link",
            example = "https://stackoverflow.com/users/47773/matthew-flaschen",
            description = "The URL to the user's profile.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("link")
    public Optional<URI> getLink() {
        return link;
    }

    public void setLink(Optional<URI> link) {
        this.link = link;
    }

    public ShallowUser profileImage(URI profileImage) {
        this.profileImage = Optional.ofNullable(profileImage);
        return this;
    }

    /**
     * The URL to the user's profile image.
     * @return profileImage
     */
    @Valid
    @Schema(
            name = "profile_image",
            example = "https://www.gravatar.com/avatar/e72946d7c81ee170b322f6e6abae3442?s=256&d=identicon&r=PG",
            description = "The URL to the user's profile image.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("profile_image")
    public Optional<URI> getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(Optional<URI> profileImage) {
        this.profileImage = profileImage;
    }

    public ShallowUser reputation(Long reputation) {
        this.reputation = Optional.ofNullable(reputation);
        return this;
    }

    /**
     * The user's reputation score.
     * @return reputation
     */
    @Schema(
            name = "reputation",
            example = "286628",
            description = "The user's reputation score.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reputation")
    public Optional<Long> getReputation() {
        return reputation;
    }

    public void setReputation(Optional<Long> reputation) {
        this.reputation = reputation;
    }

    public ShallowUser userId(Long userId) {
        this.userId = Optional.ofNullable(userId);
        return this;
    }

    /**
     * The user's unique identifier.
     * @return userId
     */
    @Schema(
            name = "user_id",
            example = "47773",
            description = "The user's unique identifier.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("user_id")
    public Optional<Long> getUserId() {
        return userId;
    }

    public void setUserId(Optional<Long> userId) {
        this.userId = userId;
    }

    public ShallowUser userType(UserTypeEnum userType) {
        this.userType = Optional.ofNullable(userType);
        return this;
    }

    /**
     * The type of user account.
     * @return userType
     */
    @Schema(
            name = "user_type",
            example = "registered",
            description = "The type of user account.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("user_type")
    public Optional<UserTypeEnum> getUserType() {
        return userType;
    }

    public void setUserType(Optional<UserTypeEnum> userType) {
        this.userType = userType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShallowUser shallowUser = (ShallowUser) o;
        return Objects.equals(this.acceptRate, shallowUser.acceptRate)
                && Objects.equals(this.accountId, shallowUser.accountId)
                && Objects.equals(this.displayName, shallowUser.displayName)
                && Objects.equals(this.link, shallowUser.link)
                && Objects.equals(this.profileImage, shallowUser.profileImage)
                && Objects.equals(this.reputation, shallowUser.reputation)
                && Objects.equals(this.userId, shallowUser.userId)
                && Objects.equals(this.userType, shallowUser.userType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acceptRate, accountId, displayName, link, profileImage, reputation, userId, userType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShallowUser {\n");
        sb.append("    acceptRate: ").append(toIndentedString(acceptRate)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
        sb.append("    reputation: ").append(toIndentedString(reputation)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
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
