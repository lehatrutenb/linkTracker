package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * UsersUpdateAuthenticatedRequest
 */
@JsonTypeName("users_update_authenticated_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class UsersUpdateAuthenticatedRequest {

    private Optional<String> name = Optional.empty();

    private Optional<String> email = Optional.empty();

    private Optional<String> blog = Optional.empty();

    private JsonNullable<String> twitterUsername = JsonNullable.<String>undefined();

    private Optional<String> company = Optional.empty();

    private Optional<String> location = Optional.empty();

    private Optional<Boolean> hireable = Optional.empty();

    private Optional<String> bio = Optional.empty();

    public UsersUpdateAuthenticatedRequest name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * The new name of the user.
     * @return name
     */
    @Schema(
            name = "name",
            example = "Omar Jahandar",
            description = "The new name of the user.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public UsersUpdateAuthenticatedRequest email(String email) {
        this.email = Optional.ofNullable(email);
        return this;
    }

    /**
     * The publicly visible email address of the user.
     * @return email
     */
    @Schema(
            name = "email",
            example = "omar@example.com",
            description = "The publicly visible email address of the user.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("email")
    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }

    public UsersUpdateAuthenticatedRequest blog(String blog) {
        this.blog = Optional.ofNullable(blog);
        return this;
    }

    /**
     * The new blog URL of the user.
     * @return blog
     */
    @Schema(
            name = "blog",
            example = "blog.example.com",
            description = "The new blog URL of the user.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("blog")
    public Optional<String> getBlog() {
        return blog;
    }

    public void setBlog(Optional<String> blog) {
        this.blog = blog;
    }

    public UsersUpdateAuthenticatedRequest twitterUsername(String twitterUsername) {
        this.twitterUsername = JsonNullable.of(twitterUsername);
        return this;
    }

    /**
     * The new Twitter username of the user.
     * @return twitterUsername
     */
    @Schema(
            name = "twitter_username",
            example = "therealomarj",
            description = "The new Twitter username of the user.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("twitter_username")
    public JsonNullable<String> getTwitterUsername() {
        return twitterUsername;
    }

    public void setTwitterUsername(JsonNullable<String> twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    public UsersUpdateAuthenticatedRequest company(String company) {
        this.company = Optional.ofNullable(company);
        return this;
    }

    /**
     * The new company of the user.
     * @return company
     */
    @Schema(
            name = "company",
            example = "Acme corporation",
            description = "The new company of the user.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("company")
    public Optional<String> getCompany() {
        return company;
    }

    public void setCompany(Optional<String> company) {
        this.company = company;
    }

    public UsersUpdateAuthenticatedRequest location(String location) {
        this.location = Optional.ofNullable(location);
        return this;
    }

    /**
     * The new location of the user.
     * @return location
     */
    @Schema(
            name = "location",
            example = "Berlin, Germany",
            description = "The new location of the user.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("location")
    public Optional<String> getLocation() {
        return location;
    }

    public void setLocation(Optional<String> location) {
        this.location = location;
    }

    public UsersUpdateAuthenticatedRequest hireable(Boolean hireable) {
        this.hireable = Optional.ofNullable(hireable);
        return this;
    }

    /**
     * The new hiring availability of the user.
     * @return hireable
     */
    @Schema(
            name = "hireable",
            description = "The new hiring availability of the user.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("hireable")
    public Optional<Boolean> getHireable() {
        return hireable;
    }

    public void setHireable(Optional<Boolean> hireable) {
        this.hireable = hireable;
    }

    public UsersUpdateAuthenticatedRequest bio(String bio) {
        this.bio = Optional.ofNullable(bio);
        return this;
    }

    /**
     * The new short biography of the user.
     * @return bio
     */
    @Schema(
            name = "bio",
            description = "The new short biography of the user.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("bio")
    public Optional<String> getBio() {
        return bio;
    }

    public void setBio(Optional<String> bio) {
        this.bio = bio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UsersUpdateAuthenticatedRequest usersUpdateAuthenticatedRequest = (UsersUpdateAuthenticatedRequest) o;
        return Objects.equals(this.name, usersUpdateAuthenticatedRequest.name)
                && Objects.equals(this.email, usersUpdateAuthenticatedRequest.email)
                && Objects.equals(this.blog, usersUpdateAuthenticatedRequest.blog)
                && equalsNullable(this.twitterUsername, usersUpdateAuthenticatedRequest.twitterUsername)
                && Objects.equals(this.company, usersUpdateAuthenticatedRequest.company)
                && Objects.equals(this.location, usersUpdateAuthenticatedRequest.location)
                && Objects.equals(this.hireable, usersUpdateAuthenticatedRequest.hireable)
                && Objects.equals(this.bio, usersUpdateAuthenticatedRequest.bio);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, blog, hashCodeNullable(twitterUsername), company, location, hireable, bio);
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
        sb.append("class UsersUpdateAuthenticatedRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    blog: ").append(toIndentedString(blog)).append("\n");
        sb.append("    twitterUsername: ")
                .append(toIndentedString(twitterUsername))
                .append("\n");
        sb.append("    company: ").append(toIndentedString(company)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    hireable: ").append(toIndentedString(hireable)).append("\n");
        sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
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
