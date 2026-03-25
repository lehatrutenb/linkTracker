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
 * A GitHub Classroom accepted assignment
 */
@Schema(name = "classroom-accepted-assignment", description = "A GitHub Classroom accepted assignment")
@JsonTypeName("classroom-accepted-assignment")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ClassroomAcceptedAssignment {

    private Long id;

    private Boolean submitted;

    private Boolean passing;

    private Long commitCount;

    private String grade;

    @Valid
    private List<@Valid SimpleClassroomUser> students = new ArrayList<>();

    private SimpleClassroomRepository repository;

    private SimpleClassroomAssignment assignment;

    public ClassroomAcceptedAssignment() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ClassroomAcceptedAssignment(
            Long id,
            Boolean submitted,
            Boolean passing,
            Long commitCount,
            String grade,
            List<@Valid SimpleClassroomUser> students,
            SimpleClassroomRepository repository,
            SimpleClassroomAssignment assignment) {
        this.id = id;
        this.submitted = submitted;
        this.passing = passing;
        this.commitCount = commitCount;
        this.grade = grade;
        this.students = students;
        this.repository = repository;
        this.assignment = assignment;
    }

    public ClassroomAcceptedAssignment id(Long id) {
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

    public ClassroomAcceptedAssignment submitted(Boolean submitted) {
        this.submitted = submitted;
        return this;
    }

    /**
     * Whether an accepted assignment has been submitted.
     * @return submitted
     */
    @NotNull
    @Schema(
            name = "submitted",
            example = "true",
            description = "Whether an accepted assignment has been submitted.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("submitted")
    public Boolean getSubmitted() {
        return submitted;
    }

    public void setSubmitted(Boolean submitted) {
        this.submitted = submitted;
    }

    public ClassroomAcceptedAssignment passing(Boolean passing) {
        this.passing = passing;
        return this;
    }

    /**
     * Whether a submission passed.
     * @return passing
     */
    @NotNull
    @Schema(
            name = "passing",
            example = "true",
            description = "Whether a submission passed.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("passing")
    public Boolean getPassing() {
        return passing;
    }

    public void setPassing(Boolean passing) {
        this.passing = passing;
    }

    public ClassroomAcceptedAssignment commitCount(Long commitCount) {
        this.commitCount = commitCount;
        return this;
    }

    /**
     * Count of student commits.
     * @return commitCount
     */
    @NotNull
    @Schema(
            name = "commit_count",
            example = "5",
            description = "Count of student commits.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_count")
    public Long getCommitCount() {
        return commitCount;
    }

    public void setCommitCount(Long commitCount) {
        this.commitCount = commitCount;
    }

    public ClassroomAcceptedAssignment grade(String grade) {
        this.grade = grade;
        return this;
    }

    /**
     * Most recent grade.
     * @return grade
     */
    @NotNull
    @Schema(
            name = "grade",
            example = "10/10",
            description = "Most recent grade.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("grade")
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public ClassroomAcceptedAssignment students(List<@Valid SimpleClassroomUser> students) {
        this.students = students;
        return this;
    }

    public ClassroomAcceptedAssignment addStudentsItem(SimpleClassroomUser studentsItem) {
        if (this.students == null) {
            this.students = new ArrayList<>();
        }
        this.students.add(studentsItem);
        return this;
    }

    /**
     * Get students
     * @return students
     */
    @NotNull
    @Valid
    @Schema(name = "students", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("students")
    public List<@Valid SimpleClassroomUser> getStudents() {
        return students;
    }

    public void setStudents(List<@Valid SimpleClassroomUser> students) {
        this.students = students;
    }

    public ClassroomAcceptedAssignment repository(SimpleClassroomRepository repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @NotNull
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository")
    public SimpleClassroomRepository getRepository() {
        return repository;
    }

    public void setRepository(SimpleClassroomRepository repository) {
        this.repository = repository;
    }

    public ClassroomAcceptedAssignment assignment(SimpleClassroomAssignment assignment) {
        this.assignment = assignment;
        return this;
    }

    /**
     * Get assignment
     * @return assignment
     */
    @NotNull
    @Valid
    @Schema(name = "assignment", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("assignment")
    public SimpleClassroomAssignment getAssignment() {
        return assignment;
    }

    public void setAssignment(SimpleClassroomAssignment assignment) {
        this.assignment = assignment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClassroomAcceptedAssignment classroomAcceptedAssignment = (ClassroomAcceptedAssignment) o;
        return Objects.equals(this.id, classroomAcceptedAssignment.id)
                && Objects.equals(this.submitted, classroomAcceptedAssignment.submitted)
                && Objects.equals(this.passing, classroomAcceptedAssignment.passing)
                && Objects.equals(this.commitCount, classroomAcceptedAssignment.commitCount)
                && Objects.equals(this.grade, classroomAcceptedAssignment.grade)
                && Objects.equals(this.students, classroomAcceptedAssignment.students)
                && Objects.equals(this.repository, classroomAcceptedAssignment.repository)
                && Objects.equals(this.assignment, classroomAcceptedAssignment.assignment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, submitted, passing, commitCount, grade, students, repository, assignment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClassroomAcceptedAssignment {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    submitted: ").append(toIndentedString(submitted)).append("\n");
        sb.append("    passing: ").append(toIndentedString(passing)).append("\n");
        sb.append("    commitCount: ").append(toIndentedString(commitCount)).append("\n");
        sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
        sb.append("    students: ").append(toIndentedString(students)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    assignment: ").append(toIndentedString(assignment)).append("\n");
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
