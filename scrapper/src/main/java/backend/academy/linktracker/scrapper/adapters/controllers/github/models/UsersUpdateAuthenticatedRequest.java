package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * UsersUpdateAuthenticatedRequest
 */
@JsonTypeName("users_update_authenticated_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class UsersUpdateAuthenticatedRequest {

    private String name;

    private String email;

    private String blog;

    private String twitterUsername = null;

    private String company;

    private String location;

    private Boolean hireable;

    private String bio;

    public UsersUpdateAuthenticatedRequest name(String name) {
        this.name = name;
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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UsersUpdateAuthenticatedRequest email(String email) {
        this.email = email;
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
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UsersUpdateAuthenticatedRequest blog(String blog) {
        this.blog = blog;
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
    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public UsersUpdateAuthenticatedRequest twitterUsername(String twitterUsername) {
        this.twitterUsername = twitterUsername;
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
    public String getTwitterUsername() {
        return twitterUsername;
    }

    public void setTwitterUsername(String twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    public UsersUpdateAuthenticatedRequest company(String company) {
        this.company = company;
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
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public UsersUpdateAuthenticatedRequest location(String location) {
        this.location = location;
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
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public UsersUpdateAuthenticatedRequest hireable(Boolean hireable) {
        this.hireable = hireable;
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
    public Boolean getHireable() {
        return hireable;
    }

    public void setHireable(Boolean hireable) {
        this.hireable = hireable;
    }

    public UsersUpdateAuthenticatedRequest bio(String bio) {
        this.bio = bio;
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
    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
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
                && Objects.equals(this.twitterUsername, usersUpdateAuthenticatedRequest.twitterUsername)
                && Objects.equals(this.company, usersUpdateAuthenticatedRequest.company)
                && Objects.equals(this.location, usersUpdateAuthenticatedRequest.location)
                && Objects.equals(this.hireable, usersUpdateAuthenticatedRequest.hireable)
                && Objects.equals(this.bio, usersUpdateAuthenticatedRequest.bio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, blog, twitterUsername, company, location, hireable, bio);
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
