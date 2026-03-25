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
 * FeedLinks
 */
@JsonTypeName("feed__links")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class FeedLinks {

    private LinkWithType timeline;

    private LinkWithType user;

    private LinkWithType securityAdvisories;

    private LinkWithType currentUser;

    private LinkWithType currentUserPublic;

    private LinkWithType currentUserActor;

    private LinkWithType currentUserOrganization;

    @Valid
    private List<@Valid LinkWithType> currentUserOrganizations = new ArrayList<>();

    private LinkWithType repositoryDiscussions;

    private LinkWithType repositoryDiscussionsCategory;

    public FeedLinks() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public FeedLinks(LinkWithType timeline, LinkWithType user) {
        this.timeline = timeline;
        this.user = user;
    }

    public FeedLinks timeline(LinkWithType timeline) {
        this.timeline = timeline;
        return this;
    }

    /**
     * Get timeline
     * @return timeline
     */
    @NotNull
    @Valid
    @Schema(name = "timeline", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("timeline")
    public LinkWithType getTimeline() {
        return timeline;
    }

    public void setTimeline(LinkWithType timeline) {
        this.timeline = timeline;
    }

    public FeedLinks user(LinkWithType user) {
        this.user = user;
        return this;
    }

    /**
     * Get user
     * @return user
     */
    @NotNull
    @Valid
    @Schema(name = "user", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("user")
    public LinkWithType getUser() {
        return user;
    }

    public void setUser(LinkWithType user) {
        this.user = user;
    }

    public FeedLinks securityAdvisories(LinkWithType securityAdvisories) {
        this.securityAdvisories = securityAdvisories;
        return this;
    }

    /**
     * Get securityAdvisories
     * @return securityAdvisories
     */
    @Valid
    @Schema(name = "security_advisories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("security_advisories")
    public LinkWithType getSecurityAdvisories() {
        return securityAdvisories;
    }

    public void setSecurityAdvisories(LinkWithType securityAdvisories) {
        this.securityAdvisories = securityAdvisories;
    }

    public FeedLinks currentUser(LinkWithType currentUser) {
        this.currentUser = currentUser;
        return this;
    }

    /**
     * Get currentUser
     * @return currentUser
     */
    @Valid
    @Schema(name = "current_user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("current_user")
    public LinkWithType getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(LinkWithType currentUser) {
        this.currentUser = currentUser;
    }

    public FeedLinks currentUserPublic(LinkWithType currentUserPublic) {
        this.currentUserPublic = currentUserPublic;
        return this;
    }

    /**
     * Get currentUserPublic
     * @return currentUserPublic
     */
    @Valid
    @Schema(name = "current_user_public", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("current_user_public")
    public LinkWithType getCurrentUserPublic() {
        return currentUserPublic;
    }

    public void setCurrentUserPublic(LinkWithType currentUserPublic) {
        this.currentUserPublic = currentUserPublic;
    }

    public FeedLinks currentUserActor(LinkWithType currentUserActor) {
        this.currentUserActor = currentUserActor;
        return this;
    }

    /**
     * Get currentUserActor
     * @return currentUserActor
     */
    @Valid
    @Schema(name = "current_user_actor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("current_user_actor")
    public LinkWithType getCurrentUserActor() {
        return currentUserActor;
    }

    public void setCurrentUserActor(LinkWithType currentUserActor) {
        this.currentUserActor = currentUserActor;
    }

    public FeedLinks currentUserOrganization(LinkWithType currentUserOrganization) {
        this.currentUserOrganization = currentUserOrganization;
        return this;
    }

    /**
     * Get currentUserOrganization
     * @return currentUserOrganization
     */
    @Valid
    @Schema(name = "current_user_organization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("current_user_organization")
    public LinkWithType getCurrentUserOrganization() {
        return currentUserOrganization;
    }

    public void setCurrentUserOrganization(LinkWithType currentUserOrganization) {
        this.currentUserOrganization = currentUserOrganization;
    }

    public FeedLinks currentUserOrganizations(List<@Valid LinkWithType> currentUserOrganizations) {
        this.currentUserOrganizations = currentUserOrganizations;
        return this;
    }

    public FeedLinks addCurrentUserOrganizationsItem(LinkWithType currentUserOrganizationsItem) {
        if (this.currentUserOrganizations == null) {
            this.currentUserOrganizations = new ArrayList<>();
        }
        this.currentUserOrganizations.add(currentUserOrganizationsItem);
        return this;
    }

    /**
     * Get currentUserOrganizations
     * @return currentUserOrganizations
     */
    @Valid
    @Schema(name = "current_user_organizations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("current_user_organizations")
    public List<@Valid LinkWithType> getCurrentUserOrganizations() {
        return currentUserOrganizations;
    }

    public void setCurrentUserOrganizations(List<@Valid LinkWithType> currentUserOrganizations) {
        this.currentUserOrganizations = currentUserOrganizations;
    }

    public FeedLinks repositoryDiscussions(LinkWithType repositoryDiscussions) {
        this.repositoryDiscussions = repositoryDiscussions;
        return this;
    }

    /**
     * Get repositoryDiscussions
     * @return repositoryDiscussions
     */
    @Valid
    @Schema(name = "repository_discussions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_discussions")
    public LinkWithType getRepositoryDiscussions() {
        return repositoryDiscussions;
    }

    public void setRepositoryDiscussions(LinkWithType repositoryDiscussions) {
        this.repositoryDiscussions = repositoryDiscussions;
    }

    public FeedLinks repositoryDiscussionsCategory(LinkWithType repositoryDiscussionsCategory) {
        this.repositoryDiscussionsCategory = repositoryDiscussionsCategory;
        return this;
    }

    /**
     * Get repositoryDiscussionsCategory
     * @return repositoryDiscussionsCategory
     */
    @Valid
    @Schema(name = "repository_discussions_category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_discussions_category")
    public LinkWithType getRepositoryDiscussionsCategory() {
        return repositoryDiscussionsCategory;
    }

    public void setRepositoryDiscussionsCategory(LinkWithType repositoryDiscussionsCategory) {
        this.repositoryDiscussionsCategory = repositoryDiscussionsCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeedLinks feedLinks = (FeedLinks) o;
        return Objects.equals(this.timeline, feedLinks.timeline)
                && Objects.equals(this.user, feedLinks.user)
                && Objects.equals(this.securityAdvisories, feedLinks.securityAdvisories)
                && Objects.equals(this.currentUser, feedLinks.currentUser)
                && Objects.equals(this.currentUserPublic, feedLinks.currentUserPublic)
                && Objects.equals(this.currentUserActor, feedLinks.currentUserActor)
                && Objects.equals(this.currentUserOrganization, feedLinks.currentUserOrganization)
                && Objects.equals(this.currentUserOrganizations, feedLinks.currentUserOrganizations)
                && Objects.equals(this.repositoryDiscussions, feedLinks.repositoryDiscussions)
                && Objects.equals(this.repositoryDiscussionsCategory, feedLinks.repositoryDiscussionsCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                timeline,
                user,
                securityAdvisories,
                currentUser,
                currentUserPublic,
                currentUserActor,
                currentUserOrganization,
                currentUserOrganizations,
                repositoryDiscussions,
                repositoryDiscussionsCategory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeedLinks {\n");
        sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    securityAdvisories: ")
                .append(toIndentedString(securityAdvisories))
                .append("\n");
        sb.append("    currentUser: ").append(toIndentedString(currentUser)).append("\n");
        sb.append("    currentUserPublic: ")
                .append(toIndentedString(currentUserPublic))
                .append("\n");
        sb.append("    currentUserActor: ")
                .append(toIndentedString(currentUserActor))
                .append("\n");
        sb.append("    currentUserOrganization: ")
                .append(toIndentedString(currentUserOrganization))
                .append("\n");
        sb.append("    currentUserOrganizations: ")
                .append(toIndentedString(currentUserOrganizations))
                .append("\n");
        sb.append("    repositoryDiscussions: ")
                .append(toIndentedString(repositoryDiscussions))
                .append("\n");
        sb.append("    repositoryDiscussionsCategory: ")
                .append(toIndentedString(repositoryDiscussionsCategory))
                .append("\n");
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
