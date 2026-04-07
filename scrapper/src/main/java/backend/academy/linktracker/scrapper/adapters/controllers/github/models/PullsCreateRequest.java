package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * PullsCreateRequest
 */
@JsonTypeName("pulls_create_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullsCreateRequest {

    private Optional<String> title = Optional.empty();

    private String head;

    private Optional<String> headRepo = Optional.empty();

    private String base;

    private Optional<String> body = Optional.empty();

    private Optional<Boolean> maintainerCanModify = Optional.empty();

    private Optional<Boolean> draft = Optional.empty();

    private Optional<Long> issue = Optional.empty();

    public PullsCreateRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullsCreateRequest(String head, String base) {
        this.head = head;
        this.base = base;
    }

    public PullsCreateRequest title(String title) {
        this.title = Optional.ofNullable(title);
        return this;
    }

    /**
     * The title of the new pull request. Required unless `issue` is specified.
     * @return title
     */
    @Schema(
            name = "title",
            description = "The title of the new pull request. Required unless `issue` is specified.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("title")
    public Optional<String> getTitle() {
        return title;
    }

    public void setTitle(Optional<String> title) {
        this.title = title;
    }

    public PullsCreateRequest head(String head) {
        this.head = head;
        return this;
    }

    /**
     * The name of the branch where your changes are implemented. For cross-repository pull requests in the same network, namespace `head` with a user like this: `username:branch`.
     * @return head
     */
    @NotNull
    @Schema(
            name = "head",
            description =
                    "The name of the branch where your changes are implemented. For cross-repository pull requests in the same network, namespace `head` with a user like this: `username:branch`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head")
    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public PullsCreateRequest headRepo(String headRepo) {
        this.headRepo = Optional.ofNullable(headRepo);
        return this;
    }

    /**
     * The name of the repository where the changes in the pull request were made. This field is required for cross-repository pull requests if both repositories are owned by the same organization.
     * @return headRepo
     */
    @Schema(
            name = "head_repo",
            example = "octo-org/octo-repo",
            description =
                    "The name of the repository where the changes in the pull request were made. This field is required for cross-repository pull requests if both repositories are owned by the same organization.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("head_repo")
    public Optional<String> getHeadRepo() {
        return headRepo;
    }

    public void setHeadRepo(Optional<String> headRepo) {
        this.headRepo = headRepo;
    }

    public PullsCreateRequest base(String base) {
        this.base = base;
        return this;
    }

    /**
     * The name of the branch you want the changes pulled into. This should be an existing branch on the current repository. You cannot submit a pull request to one repository that requests a merge to a base of another repository.
     * @return base
     */
    @NotNull
    @Schema(
            name = "base",
            description =
                    "The name of the branch you want the changes pulled into. This should be an existing branch on the current repository. You cannot submit a pull request to one repository that requests a merge to a base of another repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("base")
    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public PullsCreateRequest body(String body) {
        this.body = Optional.ofNullable(body);
        return this;
    }

    /**
     * The contents of the pull request.
     * @return body
     */
    @Schema(
            name = "body",
            description = "The contents of the pull request.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public Optional<String> getBody() {
        return body;
    }

    public void setBody(Optional<String> body) {
        this.body = body;
    }

    public PullsCreateRequest maintainerCanModify(Boolean maintainerCanModify) {
        this.maintainerCanModify = Optional.ofNullable(maintainerCanModify);
        return this;
    }

    /**
     * Indicates whether [maintainers can modify](https://docs.github.com/articles/allowing-changes-to-a-pull-request-branch-created-from-a-fork/) the pull request.
     * @return maintainerCanModify
     */
    @Schema(
            name = "maintainer_can_modify",
            description =
                    "Indicates whether [maintainers can modify](https://docs.github.com/articles/allowing-changes-to-a-pull-request-branch-created-from-a-fork/) the pull request.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("maintainer_can_modify")
    public Optional<Boolean> getMaintainerCanModify() {
        return maintainerCanModify;
    }

    public void setMaintainerCanModify(Optional<Boolean> maintainerCanModify) {
        this.maintainerCanModify = maintainerCanModify;
    }

    public PullsCreateRequest draft(Boolean draft) {
        this.draft = Optional.ofNullable(draft);
        return this;
    }

    /**
     * Indicates whether the pull request is a draft. See \"[Draft Pull Requests](https://docs.github.com/articles/about-pull-requests#draft-pull-requests)\" in the GitHub Help documentation to learn more.
     * @return draft
     */
    @Schema(
            name = "draft",
            description =
                    "Indicates whether the pull request is a draft. See \"[Draft Pull Requests](https://docs.github.com/articles/about-pull-requests#draft-pull-requests)\" in the GitHub Help documentation to learn more.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("draft")
    public Optional<Boolean> getDraft() {
        return draft;
    }

    public void setDraft(Optional<Boolean> draft) {
        this.draft = draft;
    }

    public PullsCreateRequest issue(Long issue) {
        this.issue = Optional.ofNullable(issue);
        return this;
    }

    /**
     * An issue in the repository to convert to a pull request. The issue title, body, and comments will become the title, body, and comments on the new pull request. Required unless `title` is specified.
     * @return issue
     */
    @Schema(
            name = "issue",
            example = "1",
            description =
                    "An issue in the repository to convert to a pull request. The issue title, body, and comments will become the title, body, and comments on the new pull request. Required unless `title` is specified.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issue")
    public Optional<Long> getIssue() {
        return issue;
    }

    public void setIssue(Optional<Long> issue) {
        this.issue = issue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PullsCreateRequest pullsCreateRequest = (PullsCreateRequest) o;
        return Objects.equals(this.title, pullsCreateRequest.title)
                && Objects.equals(this.head, pullsCreateRequest.head)
                && Objects.equals(this.headRepo, pullsCreateRequest.headRepo)
                && Objects.equals(this.base, pullsCreateRequest.base)
                && Objects.equals(this.body, pullsCreateRequest.body)
                && Objects.equals(this.maintainerCanModify, pullsCreateRequest.maintainerCanModify)
                && Objects.equals(this.draft, pullsCreateRequest.draft)
                && Objects.equals(this.issue, pullsCreateRequest.issue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, head, headRepo, base, body, maintainerCanModify, draft, issue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullsCreateRequest {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    head: ").append(toIndentedString(head)).append("\n");
        sb.append("    headRepo: ").append(toIndentedString(headRepo)).append("\n");
        sb.append("    base: ").append(toIndentedString(base)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    maintainerCanModify: ")
                .append(toIndentedString(maintainerCanModify))
                .append("\n");
        sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
        sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
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
