package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A GitHub Classroom assignment
 */
@Schema(name = "simple-classroom-assignment", description = "A GitHub Classroom assignment")
@JsonTypeName("simple-classroom-assignment")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SimpleClassroomAssignment {

    private Long id;

    private Boolean publicRepo;

    private String title;

    /**
     * Whether it's a Group Assignment or Individual Assignment.
     */
    public enum TypeEnum {
        INDIVIDUAL("individual"),

        GROUP("group");

        private final String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private TypeEnum type;

    private String inviteLink;

    private Boolean invitationsEnabled;

    private String slug;

    private Boolean studentsAreRepoAdmins;

    private Boolean feedbackPullRequestsEnabled;

    private JsonNullable<Long> maxTeams = JsonNullable.<Long>undefined();

    private JsonNullable<Long> maxMembers = JsonNullable.<Long>undefined();

    private String editor;

    private Long accepted;

    private Long submitted;

    private Long passing;

    private String language;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> deadline = JsonNullable.<OffsetDateTime>undefined();

    private SimpleClassroom classroom;

    public SimpleClassroomAssignment() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SimpleClassroomAssignment(
            Long id,
            Boolean publicRepo,
            String title,
            TypeEnum type,
            String inviteLink,
            Boolean invitationsEnabled,
            String slug,
            Boolean studentsAreRepoAdmins,
            Boolean feedbackPullRequestsEnabled,
            String editor,
            Long accepted,
            Long submitted,
            Long passing,
            String language,
            OffsetDateTime deadline,
            SimpleClassroom classroom) {
        this.id = id;
        this.publicRepo = publicRepo;
        this.title = title;
        this.type = type;
        this.inviteLink = inviteLink;
        this.invitationsEnabled = invitationsEnabled;
        this.slug = slug;
        this.studentsAreRepoAdmins = studentsAreRepoAdmins;
        this.feedbackPullRequestsEnabled = feedbackPullRequestsEnabled;
        this.editor = editor;
        this.accepted = accepted;
        this.submitted = submitted;
        this.passing = passing;
        this.language = language;
        this.deadline = JsonNullable.of(deadline);
        this.classroom = classroom;
    }

    public SimpleClassroomAssignment id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the repository.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "42",
            description = "Unique identifier of the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SimpleClassroomAssignment publicRepo(Boolean publicRepo) {
        this.publicRepo = publicRepo;
        return this;
    }

    /**
     * Whether an accepted assignment creates a public repository.
     * @return publicRepo
     */
    @NotNull
    @Schema(
            name = "public_repo",
            example = "true",
            description = "Whether an accepted assignment creates a public repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("public_repo")
    public Boolean getPublicRepo() {
        return publicRepo;
    }

    public void setPublicRepo(Boolean publicRepo) {
        this.publicRepo = publicRepo;
    }

    public SimpleClassroomAssignment title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Assignment title.
     * @return title
     */
    @NotNull
    @Schema(
            name = "title",
            example = "Intro to Binaries",
            description = "Assignment title.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public SimpleClassroomAssignment type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Whether it's a Group Assignment or Individual Assignment.
     * @return type
     */
    @NotNull
    @Schema(
            name = "type",
            example = "individual",
            description = "Whether it's a Group Assignment or Individual Assignment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public SimpleClassroomAssignment inviteLink(String inviteLink) {
        this.inviteLink = inviteLink;
        return this;
    }

    /**
     * The link that a student can use to accept the assignment.
     * @return inviteLink
     */
    @NotNull
    @Schema(
            name = "invite_link",
            example = "https://classroom.github.com/a/Lx7jiUgx",
            description = "The link that a student can use to accept the assignment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("invite_link")
    public String getInviteLink() {
        return inviteLink;
    }

    public void setInviteLink(String inviteLink) {
        this.inviteLink = inviteLink;
    }

    public SimpleClassroomAssignment invitationsEnabled(Boolean invitationsEnabled) {
        this.invitationsEnabled = invitationsEnabled;
        return this;
    }

    /**
     * Whether the invitation link is enabled. Visiting an enabled invitation link will accept the assignment.
     * @return invitationsEnabled
     */
    @NotNull
    @Schema(
            name = "invitations_enabled",
            example = "true",
            description =
                    "Whether the invitation link is enabled. Visiting an enabled invitation link will accept the assignment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("invitations_enabled")
    public Boolean getInvitationsEnabled() {
        return invitationsEnabled;
    }

    public void setInvitationsEnabled(Boolean invitationsEnabled) {
        this.invitationsEnabled = invitationsEnabled;
    }

    public SimpleClassroomAssignment slug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * Sluggified name of the assignment.
     * @return slug
     */
    @NotNull
    @Schema(
            name = "slug",
            example = "intro-to-binaries",
            description = "Sluggified name of the assignment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public SimpleClassroomAssignment studentsAreRepoAdmins(Boolean studentsAreRepoAdmins) {
        this.studentsAreRepoAdmins = studentsAreRepoAdmins;
        return this;
    }

    /**
     * Whether students are admins on created repository on accepted assignment.
     * @return studentsAreRepoAdmins
     */
    @NotNull
    @Schema(
            name = "students_are_repo_admins",
            example = "true",
            description = "Whether students are admins on created repository on accepted assignment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("students_are_repo_admins")
    public Boolean getStudentsAreRepoAdmins() {
        return studentsAreRepoAdmins;
    }

    public void setStudentsAreRepoAdmins(Boolean studentsAreRepoAdmins) {
        this.studentsAreRepoAdmins = studentsAreRepoAdmins;
    }

    public SimpleClassroomAssignment feedbackPullRequestsEnabled(Boolean feedbackPullRequestsEnabled) {
        this.feedbackPullRequestsEnabled = feedbackPullRequestsEnabled;
        return this;
    }

    /**
     * Whether feedback pull request will be created on assignment acceptance.
     * @return feedbackPullRequestsEnabled
     */
    @NotNull
    @Schema(
            name = "feedback_pull_requests_enabled",
            example = "true",
            description = "Whether feedback pull request will be created on assignment acceptance.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("feedback_pull_requests_enabled")
    public Boolean getFeedbackPullRequestsEnabled() {
        return feedbackPullRequestsEnabled;
    }

    public void setFeedbackPullRequestsEnabled(Boolean feedbackPullRequestsEnabled) {
        this.feedbackPullRequestsEnabled = feedbackPullRequestsEnabled;
    }

    public SimpleClassroomAssignment maxTeams(Long maxTeams) {
        this.maxTeams = JsonNullable.of(maxTeams);
        return this;
    }

    /**
     * The maximum allowable teams for the assignment.
     * @return maxTeams
     */
    @Schema(
            name = "max_teams",
            example = "0",
            description = "The maximum allowable teams for the assignment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("max_teams")
    public JsonNullable<Long> getMaxTeams() {
        return maxTeams;
    }

    public void setMaxTeams(JsonNullable<Long> maxTeams) {
        this.maxTeams = maxTeams;
    }

    public SimpleClassroomAssignment maxMembers(Long maxMembers) {
        this.maxMembers = JsonNullable.of(maxMembers);
        return this;
    }

    /**
     * The maximum allowable members per team.
     * @return maxMembers
     */
    @Schema(
            name = "max_members",
            example = "0",
            description = "The maximum allowable members per team.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("max_members")
    public JsonNullable<Long> getMaxMembers() {
        return maxMembers;
    }

    public void setMaxMembers(JsonNullable<Long> maxMembers) {
        this.maxMembers = maxMembers;
    }

    public SimpleClassroomAssignment editor(String editor) {
        this.editor = editor;
        return this;
    }

    /**
     * The selected editor for the assignment.
     * @return editor
     */
    @NotNull
    @Schema(
            name = "editor",
            example = "codespaces",
            description = "The selected editor for the assignment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("editor")
    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public SimpleClassroomAssignment accepted(Long accepted) {
        this.accepted = accepted;
        return this;
    }

    /**
     * The number of students that have accepted the assignment.
     * @return accepted
     */
    @NotNull
    @Schema(
            name = "accepted",
            example = "25",
            description = "The number of students that have accepted the assignment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("accepted")
    public Long getAccepted() {
        return accepted;
    }

    public void setAccepted(Long accepted) {
        this.accepted = accepted;
    }

    public SimpleClassroomAssignment submitted(Long submitted) {
        this.submitted = submitted;
        return this;
    }

    /**
     * The number of students that have submitted the assignment.
     * @return submitted
     */
    @NotNull
    @Schema(
            name = "submitted",
            example = "10",
            description = "The number of students that have submitted the assignment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("submitted")
    public Long getSubmitted() {
        return submitted;
    }

    public void setSubmitted(Long submitted) {
        this.submitted = submitted;
    }

    public SimpleClassroomAssignment passing(Long passing) {
        this.passing = passing;
        return this;
    }

    /**
     * The number of students that have passed the assignment.
     * @return passing
     */
    @NotNull
    @Schema(
            name = "passing",
            example = "10",
            description = "The number of students that have passed the assignment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("passing")
    public Long getPassing() {
        return passing;
    }

    public void setPassing(Long passing) {
        this.passing = passing;
    }

    public SimpleClassroomAssignment language(String language) {
        this.language = language;
        return this;
    }

    /**
     * The programming language used in the assignment.
     * @return language
     */
    @NotNull
    @Schema(
            name = "language",
            example = "elixir",
            description = "The programming language used in the assignment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public SimpleClassroomAssignment deadline(OffsetDateTime deadline) {
        this.deadline = JsonNullable.of(deadline);
        return this;
    }

    /**
     * The time at which the assignment is due.
     * @return deadline
     */
    @NotNull
    @Valid
    @Schema(
            name = "deadline",
            example = "2011-01-26T19:06:43Z",
            description = "The time at which the assignment is due.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("deadline")
    public JsonNullable<OffsetDateTime> getDeadline() {
        return deadline;
    }

    public void setDeadline(JsonNullable<OffsetDateTime> deadline) {
        this.deadline = deadline;
    }

    public SimpleClassroomAssignment classroom(SimpleClassroom classroom) {
        this.classroom = classroom;
        return this;
    }

    /**
     * Get classroom
     * @return classroom
     */
    @NotNull
    @Valid
    @Schema(name = "classroom", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("classroom")
    public SimpleClassroom getClassroom() {
        return classroom;
    }

    public void setClassroom(SimpleClassroom classroom) {
        this.classroom = classroom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SimpleClassroomAssignment simpleClassroomAssignment = (SimpleClassroomAssignment) o;
        return Objects.equals(this.id, simpleClassroomAssignment.id)
                && Objects.equals(this.publicRepo, simpleClassroomAssignment.publicRepo)
                && Objects.equals(this.title, simpleClassroomAssignment.title)
                && Objects.equals(this.type, simpleClassroomAssignment.type)
                && Objects.equals(this.inviteLink, simpleClassroomAssignment.inviteLink)
                && Objects.equals(this.invitationsEnabled, simpleClassroomAssignment.invitationsEnabled)
                && Objects.equals(this.slug, simpleClassroomAssignment.slug)
                && Objects.equals(this.studentsAreRepoAdmins, simpleClassroomAssignment.studentsAreRepoAdmins)
                && Objects.equals(
                        this.feedbackPullRequestsEnabled, simpleClassroomAssignment.feedbackPullRequestsEnabled)
                && equalsNullable(this.maxTeams, simpleClassroomAssignment.maxTeams)
                && equalsNullable(this.maxMembers, simpleClassroomAssignment.maxMembers)
                && Objects.equals(this.editor, simpleClassroomAssignment.editor)
                && Objects.equals(this.accepted, simpleClassroomAssignment.accepted)
                && Objects.equals(this.submitted, simpleClassroomAssignment.submitted)
                && Objects.equals(this.passing, simpleClassroomAssignment.passing)
                && Objects.equals(this.language, simpleClassroomAssignment.language)
                && Objects.equals(this.deadline, simpleClassroomAssignment.deadline)
                && Objects.equals(this.classroom, simpleClassroomAssignment.classroom);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                publicRepo,
                title,
                type,
                inviteLink,
                invitationsEnabled,
                slug,
                studentsAreRepoAdmins,
                feedbackPullRequestsEnabled,
                hashCodeNullable(maxTeams),
                hashCodeNullable(maxMembers),
                editor,
                accepted,
                submitted,
                passing,
                language,
                deadline,
                classroom);
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
        sb.append("class SimpleClassroomAssignment {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    publicRepo: ").append(toIndentedString(publicRepo)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    inviteLink: ").append(toIndentedString(inviteLink)).append("\n");
        sb.append("    invitationsEnabled: ")
                .append(toIndentedString(invitationsEnabled))
                .append("\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    studentsAreRepoAdmins: ")
                .append(toIndentedString(studentsAreRepoAdmins))
                .append("\n");
        sb.append("    feedbackPullRequestsEnabled: ")
                .append(toIndentedString(feedbackPullRequestsEnabled))
                .append("\n");
        sb.append("    maxTeams: ").append(toIndentedString(maxTeams)).append("\n");
        sb.append("    maxMembers: ").append(toIndentedString(maxMembers)).append("\n");
        sb.append("    editor: ").append(toIndentedString(editor)).append("\n");
        sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
        sb.append("    submitted: ").append(toIndentedString(submitted)).append("\n");
        sb.append("    passing: ").append(toIndentedString(passing)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
        sb.append("    classroom: ").append(toIndentedString(classroom)).append("\n");
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
