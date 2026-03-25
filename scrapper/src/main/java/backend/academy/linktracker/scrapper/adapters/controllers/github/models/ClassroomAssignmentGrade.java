package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Grade for a student or groups GitHub Classroom assignment
 */
@Schema(name = "classroom-assignment-grade", description = "Grade for a student or groups GitHub Classroom assignment")
@JsonTypeName("classroom-assignment-grade")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ClassroomAssignmentGrade {

    private String assignmentName;

    private String assignmentUrl;

    private String starterCodeUrl;

    private String githubUsername;

    private String rosterIdentifier;

    private String studentRepositoryName;

    private String studentRepositoryUrl;

    private String submissionTimestamp;

    private Long pointsAwarded;

    private Long pointsAvailable;

    private String groupName;

    public ClassroomAssignmentGrade() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ClassroomAssignmentGrade(
            String assignmentName,
            String assignmentUrl,
            String starterCodeUrl,
            String githubUsername,
            String rosterIdentifier,
            String studentRepositoryName,
            String studentRepositoryUrl,
            String submissionTimestamp,
            Long pointsAwarded,
            Long pointsAvailable) {
        this.assignmentName = assignmentName;
        this.assignmentUrl = assignmentUrl;
        this.starterCodeUrl = starterCodeUrl;
        this.githubUsername = githubUsername;
        this.rosterIdentifier = rosterIdentifier;
        this.studentRepositoryName = studentRepositoryName;
        this.studentRepositoryUrl = studentRepositoryUrl;
        this.submissionTimestamp = submissionTimestamp;
        this.pointsAwarded = pointsAwarded;
        this.pointsAvailable = pointsAvailable;
    }

    public ClassroomAssignmentGrade assignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
        return this;
    }

    /**
     * Name of the assignment
     * @return assignmentName
     */
    @NotNull
    @Schema(
            name = "assignment_name",
            description = "Name of the assignment",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("assignment_name")
    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public ClassroomAssignmentGrade assignmentUrl(String assignmentUrl) {
        this.assignmentUrl = assignmentUrl;
        return this;
    }

    /**
     * URL of the assignment
     * @return assignmentUrl
     */
    @NotNull
    @Schema(name = "assignment_url", description = "URL of the assignment", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("assignment_url")
    public String getAssignmentUrl() {
        return assignmentUrl;
    }

    public void setAssignmentUrl(String assignmentUrl) {
        this.assignmentUrl = assignmentUrl;
    }

    public ClassroomAssignmentGrade starterCodeUrl(String starterCodeUrl) {
        this.starterCodeUrl = starterCodeUrl;
        return this;
    }

    /**
     * URL of the starter code for the assignment
     * @return starterCodeUrl
     */
    @NotNull
    @Schema(
            name = "starter_code_url",
            description = "URL of the starter code for the assignment",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("starter_code_url")
    public String getStarterCodeUrl() {
        return starterCodeUrl;
    }

    public void setStarterCodeUrl(String starterCodeUrl) {
        this.starterCodeUrl = starterCodeUrl;
    }

    public ClassroomAssignmentGrade githubUsername(String githubUsername) {
        this.githubUsername = githubUsername;
        return this;
    }

    /**
     * GitHub username of the student
     * @return githubUsername
     */
    @NotNull
    @Schema(
            name = "github_username",
            description = "GitHub username of the student",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("github_username")
    public String getGithubUsername() {
        return githubUsername;
    }

    public void setGithubUsername(String githubUsername) {
        this.githubUsername = githubUsername;
    }

    public ClassroomAssignmentGrade rosterIdentifier(String rosterIdentifier) {
        this.rosterIdentifier = rosterIdentifier;
        return this;
    }

    /**
     * Roster identifier of the student
     * @return rosterIdentifier
     */
    @NotNull
    @Schema(
            name = "roster_identifier",
            description = "Roster identifier of the student",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("roster_identifier")
    public String getRosterIdentifier() {
        return rosterIdentifier;
    }

    public void setRosterIdentifier(String rosterIdentifier) {
        this.rosterIdentifier = rosterIdentifier;
    }

    public ClassroomAssignmentGrade studentRepositoryName(String studentRepositoryName) {
        this.studentRepositoryName = studentRepositoryName;
        return this;
    }

    /**
     * Name of the student's assignment repository
     * @return studentRepositoryName
     */
    @NotNull
    @Schema(
            name = "student_repository_name",
            description = "Name of the student's assignment repository",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("student_repository_name")
    public String getStudentRepositoryName() {
        return studentRepositoryName;
    }

    public void setStudentRepositoryName(String studentRepositoryName) {
        this.studentRepositoryName = studentRepositoryName;
    }

    public ClassroomAssignmentGrade studentRepositoryUrl(String studentRepositoryUrl) {
        this.studentRepositoryUrl = studentRepositoryUrl;
        return this;
    }

    /**
     * URL of the student's assignment repository
     * @return studentRepositoryUrl
     */
    @NotNull
    @Schema(
            name = "student_repository_url",
            description = "URL of the student's assignment repository",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("student_repository_url")
    public String getStudentRepositoryUrl() {
        return studentRepositoryUrl;
    }

    public void setStudentRepositoryUrl(String studentRepositoryUrl) {
        this.studentRepositoryUrl = studentRepositoryUrl;
    }

    public ClassroomAssignmentGrade submissionTimestamp(String submissionTimestamp) {
        this.submissionTimestamp = submissionTimestamp;
        return this;
    }

    /**
     * Timestamp of the student's assignment submission
     * @return submissionTimestamp
     */
    @NotNull
    @Schema(
            name = "submission_timestamp",
            description = "Timestamp of the student's assignment submission",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("submission_timestamp")
    public String getSubmissionTimestamp() {
        return submissionTimestamp;
    }

    public void setSubmissionTimestamp(String submissionTimestamp) {
        this.submissionTimestamp = submissionTimestamp;
    }

    public ClassroomAssignmentGrade pointsAwarded(Long pointsAwarded) {
        this.pointsAwarded = pointsAwarded;
        return this;
    }

    /**
     * Number of points awarded to the student
     * @return pointsAwarded
     */
    @NotNull
    @Schema(
            name = "points_awarded",
            description = "Number of points awarded to the student",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("points_awarded")
    public Long getPointsAwarded() {
        return pointsAwarded;
    }

    public void setPointsAwarded(Long pointsAwarded) {
        this.pointsAwarded = pointsAwarded;
    }

    public ClassroomAssignmentGrade pointsAvailable(Long pointsAvailable) {
        this.pointsAvailable = pointsAvailable;
        return this;
    }

    /**
     * Number of points available for the assignment
     * @return pointsAvailable
     */
    @NotNull
    @Schema(
            name = "points_available",
            description = "Number of points available for the assignment",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("points_available")
    public Long getPointsAvailable() {
        return pointsAvailable;
    }

    public void setPointsAvailable(Long pointsAvailable) {
        this.pointsAvailable = pointsAvailable;
    }

    public ClassroomAssignmentGrade groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * If a group assignment, name of the group the student is in
     * @return groupName
     */
    @Schema(
            name = "group_name",
            description = "If a group assignment, name of the group the student is in",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("group_name")
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClassroomAssignmentGrade classroomAssignmentGrade = (ClassroomAssignmentGrade) o;
        return Objects.equals(this.assignmentName, classroomAssignmentGrade.assignmentName)
                && Objects.equals(this.assignmentUrl, classroomAssignmentGrade.assignmentUrl)
                && Objects.equals(this.starterCodeUrl, classroomAssignmentGrade.starterCodeUrl)
                && Objects.equals(this.githubUsername, classroomAssignmentGrade.githubUsername)
                && Objects.equals(this.rosterIdentifier, classroomAssignmentGrade.rosterIdentifier)
                && Objects.equals(this.studentRepositoryName, classroomAssignmentGrade.studentRepositoryName)
                && Objects.equals(this.studentRepositoryUrl, classroomAssignmentGrade.studentRepositoryUrl)
                && Objects.equals(this.submissionTimestamp, classroomAssignmentGrade.submissionTimestamp)
                && Objects.equals(this.pointsAwarded, classroomAssignmentGrade.pointsAwarded)
                && Objects.equals(this.pointsAvailable, classroomAssignmentGrade.pointsAvailable)
                && Objects.equals(this.groupName, classroomAssignmentGrade.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                assignmentName,
                assignmentUrl,
                starterCodeUrl,
                githubUsername,
                rosterIdentifier,
                studentRepositoryName,
                studentRepositoryUrl,
                submissionTimestamp,
                pointsAwarded,
                pointsAvailable,
                groupName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClassroomAssignmentGrade {\n");
        sb.append("    assignmentName: ")
                .append(toIndentedString(assignmentName))
                .append("\n");
        sb.append("    assignmentUrl: ").append(toIndentedString(assignmentUrl)).append("\n");
        sb.append("    starterCodeUrl: ")
                .append(toIndentedString(starterCodeUrl))
                .append("\n");
        sb.append("    githubUsername: ")
                .append(toIndentedString(githubUsername))
                .append("\n");
        sb.append("    rosterIdentifier: ")
                .append(toIndentedString(rosterIdentifier))
                .append("\n");
        sb.append("    studentRepositoryName: ")
                .append(toIndentedString(studentRepositoryName))
                .append("\n");
        sb.append("    studentRepositoryUrl: ")
                .append(toIndentedString(studentRepositoryUrl))
                .append("\n");
        sb.append("    submissionTimestamp: ")
                .append(toIndentedString(submissionTimestamp))
                .append("\n");
        sb.append("    pointsAwarded: ").append(toIndentedString(pointsAwarded)).append("\n");
        sb.append("    pointsAvailable: ")
                .append(toIndentedString(pointsAvailable))
                .append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
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
