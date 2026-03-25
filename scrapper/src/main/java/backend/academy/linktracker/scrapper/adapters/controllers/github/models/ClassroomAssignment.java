package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A GitHub Classroom assignment
 */
@Schema(name = "classroom-assignment", description = "A GitHub Classroom assignment")
@JsonTypeName("classroom-assignment")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ClassroomAssignment {

    private Long id;

    private Boolean publicRepo;

    private String title;

    /**
     * Whether it's a group assignment or individual assignment.
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

    private Long maxTeams = null;

    private Long maxMembers = null;

    private String editor;

    private Long accepted;

    private Long submitted;

    private Long passing;

    private String language;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime deadline = null;

    private SimpleClassroomRepository starterCodeRepository;

    private Classroom classroom;

    public ClassroomAssignment() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ClassroomAssignment(
            Long id,
            Boolean publicRepo,
            String title,
            TypeEnum type,
            String inviteLink,
            Boolean invitationsEnabled,
            String slug,
            Boolean studentsAreRepoAdmins,
            Boolean feedbackPullRequestsEnabled,
            Long maxTeams,
            Long maxMembers,
            String editor,
            Long accepted,
            Long submitted,
            Long passing,
            String language,
            OffsetDateTime deadline,
            SimpleClassroomRepository starterCodeRepository,
            Classroom classroom) {
        this.id = id;
        this.publicRepo = publicRepo;
        this.title = title;
        this.type = type;
        this.inviteLink = inviteLink;
        this.invitationsEnabled = invitationsEnabled;
        this.slug = slug;
        this.studentsAreRepoAdmins = studentsAreRepoAdmins;
        this.feedbackPullRequestsEnabled = feedbackPullRequestsEnabled;
        this.maxTeams = maxTeams;
        this.maxMembers = maxMembers;
        this.editor = editor;
        this.accepted = accepted;
        this.submitted = submitted;
        this.passing = passing;
        this.language = language;
        this.deadline = deadline;
        this.starterCodeRepository = starterCodeRepository;
        this.classroom = classroom;
    }

    public ClassroomAssignment id(Long id) {
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

    public ClassroomAssignment publicRepo(Boolean publicRepo) {
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

    public ClassroomAssignment title(String title) {
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

    public ClassroomAssignment type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Whether it's a group assignment or individual assignment.
     * @return type
     */
    @NotNull
    @Schema(
            name = "type",
            example = "individual",
            description = "Whether it's a group assignment or individual assignment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ClassroomAssignment inviteLink(String inviteLink) {
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

    public ClassroomAssignment invitationsEnabled(Boolean invitationsEnabled) {
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

    public ClassroomAssignment slug(String slug) {
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

    public ClassroomAssignment studentsAreRepoAdmins(Boolean studentsAreRepoAdmins) {
        this.studentsAreRepoAdmins = studentsAreRepoAdmins;
        return this;
    }

    /**
     * Whether students are admins on created repository when a student accepts the assignment.
     * @return studentsAreRepoAdmins
     */
    @NotNull
    @Schema(
            name = "students_are_repo_admins",
            example = "true",
            description = "Whether students are admins on created repository when a student accepts the assignment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("students_are_repo_admins")
    public Boolean getStudentsAreRepoAdmins() {
        return studentsAreRepoAdmins;
    }

    public void setStudentsAreRepoAdmins(Boolean studentsAreRepoAdmins) {
        this.studentsAreRepoAdmins = studentsAreRepoAdmins;
    }

    public ClassroomAssignment feedbackPullRequestsEnabled(Boolean feedbackPullRequestsEnabled) {
        this.feedbackPullRequestsEnabled = feedbackPullRequestsEnabled;
        return this;
    }

    /**
     * Whether feedback pull request will be created when a student accepts the assignment.
     * @return feedbackPullRequestsEnabled
     */
    @NotNull
    @Schema(
            name = "feedback_pull_requests_enabled",
            example = "true",
            description = "Whether feedback pull request will be created when a student accepts the assignment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("feedback_pull_requests_enabled")
    public Boolean getFeedbackPullRequestsEnabled() {
        return feedbackPullRequestsEnabled;
    }

    public void setFeedbackPullRequestsEnabled(Boolean feedbackPullRequestsEnabled) {
        this.feedbackPullRequestsEnabled = feedbackPullRequestsEnabled;
    }

    public ClassroomAssignment maxTeams(Long maxTeams) {
        this.maxTeams = maxTeams;
        return this;
    }

    /**
     * The maximum allowable teams for the assignment.
     * @return maxTeams
     */
    @NotNull
    @Schema(
            name = "max_teams",
            example = "0",
            description = "The maximum allowable teams for the assignment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("max_teams")
    public Long getMaxTeams() {
        return maxTeams;
    }

    public void setMaxTeams(Long maxTeams) {
        this.maxTeams = maxTeams;
    }

    public ClassroomAssignment maxMembers(Long maxMembers) {
        this.maxMembers = maxMembers;
        return this;
    }

    /**
     * The maximum allowable members per team.
     * @return maxMembers
     */
    @NotNull
    @Schema(
            name = "max_members",
            example = "0",
            description = "The maximum allowable members per team.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("max_members")
    public Long getMaxMembers() {
        return maxMembers;
    }

    public void setMaxMembers(Long maxMembers) {
        this.maxMembers = maxMembers;
    }

    public ClassroomAssignment editor(String editor) {
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

    public ClassroomAssignment accepted(Long accepted) {
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

    public ClassroomAssignment submitted(Long submitted) {
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

    public ClassroomAssignment passing(Long passing) {
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

    public ClassroomAssignment language(String language) {
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

    public ClassroomAssignment deadline(OffsetDateTime deadline) {
        this.deadline = deadline;
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
    public OffsetDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(OffsetDateTime deadline) {
        this.deadline = deadline;
    }

    public ClassroomAssignment starterCodeRepository(SimpleClassroomRepository starterCodeRepository) {
        this.starterCodeRepository = starterCodeRepository;
        return this;
    }

    /**
     * Get starterCodeRepository
     * @return starterCodeRepository
     */
    @NotNull
    @Valid
    @Schema(name = "starter_code_repository", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("starter_code_repository")
    public SimpleClassroomRepository getStarterCodeRepository() {
        return starterCodeRepository;
    }

    public void setStarterCodeRepository(SimpleClassroomRepository starterCodeRepository) {
        this.starterCodeRepository = starterCodeRepository;
    }

    public ClassroomAssignment classroom(Classroom classroom) {
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
    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
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
        ClassroomAssignment classroomAssignment = (ClassroomAssignment) o;
        return Objects.equals(this.id, classroomAssignment.id)
                && Objects.equals(this.publicRepo, classroomAssignment.publicRepo)
                && Objects.equals(this.title, classroomAssignment.title)
                && Objects.equals(this.type, classroomAssignment.type)
                && Objects.equals(this.inviteLink, classroomAssignment.inviteLink)
                && Objects.equals(this.invitationsEnabled, classroomAssignment.invitationsEnabled)
                && Objects.equals(this.slug, classroomAssignment.slug)
                && Objects.equals(this.studentsAreRepoAdmins, classroomAssignment.studentsAreRepoAdmins)
                && Objects.equals(this.feedbackPullRequestsEnabled, classroomAssignment.feedbackPullRequestsEnabled)
                && Objects.equals(this.maxTeams, classroomAssignment.maxTeams)
                && Objects.equals(this.maxMembers, classroomAssignment.maxMembers)
                && Objects.equals(this.editor, classroomAssignment.editor)
                && Objects.equals(this.accepted, classroomAssignment.accepted)
                && Objects.equals(this.submitted, classroomAssignment.submitted)
                && Objects.equals(this.passing, classroomAssignment.passing)
                && Objects.equals(this.language, classroomAssignment.language)
                && Objects.equals(this.deadline, classroomAssignment.deadline)
                && Objects.equals(this.starterCodeRepository, classroomAssignment.starterCodeRepository)
                && Objects.equals(this.classroom, classroomAssignment.classroom);
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
                maxTeams,
                maxMembers,
                editor,
                accepted,
                submitted,
                passing,
                language,
                deadline,
                starterCodeRepository,
                classroom);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClassroomAssignment {\n");
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
        sb.append("    starterCodeRepository: ")
                .append(toIndentedString(starterCodeRepository))
                .append("\n");
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
