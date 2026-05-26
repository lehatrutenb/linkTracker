package backend.academy.linktracker.scrapper.adapter.scrapper.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.*;
import java.util.Objects;

/**
 * The status of the code search index for this repository
 */
@Schema(
        name = "Repository_code_search_index_status",
        description = "The status of the code search index for this repository")
@JsonTypeName("Repository_code_search_index_status")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryCodeSearchIndexStatus {

    private Optional<Boolean> lexicalSearchOk = Optional.empty();

    private Optional<String> lexicalCommitSha = Optional.empty();

    public RepositoryCodeSearchIndexStatus lexicalSearchOk(Boolean lexicalSearchOk) {
        this.lexicalSearchOk = Optional.ofNullable(lexicalSearchOk);
        return this;
    }

    /**
     * Get lexicalSearchOk
     * @return lexicalSearchOk
     */
    @Schema(name = "lexical_search_ok", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("lexical_search_ok")
    public Optional<Boolean> getLexicalSearchOk() {
        return lexicalSearchOk;
    }

    public void setLexicalSearchOk(Optional<Boolean> lexicalSearchOk) {
        this.lexicalSearchOk = lexicalSearchOk;
    }

    public RepositoryCodeSearchIndexStatus lexicalCommitSha(String lexicalCommitSha) {
        this.lexicalCommitSha = Optional.ofNullable(lexicalCommitSha);
        return this;
    }

    /**
     * Get lexicalCommitSha
     * @return lexicalCommitSha
     */
    @Schema(name = "lexical_commit_sha", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("lexical_commit_sha")
    public Optional<String> getLexicalCommitSha() {
        return lexicalCommitSha;
    }

    public void setLexicalCommitSha(Optional<String> lexicalCommitSha) {
        this.lexicalCommitSha = lexicalCommitSha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryCodeSearchIndexStatus repositoryCodeSearchIndexStatus = (RepositoryCodeSearchIndexStatus) o;
        return Objects.equals(this.lexicalSearchOk, repositoryCodeSearchIndexStatus.lexicalSearchOk)
                && Objects.equals(this.lexicalCommitSha, repositoryCodeSearchIndexStatus.lexicalCommitSha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lexicalSearchOk, lexicalCommitSha);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryCodeSearchIndexStatus {\n");
        sb.append("    lexicalSearchOk: ")
                .append(toIndentedString(lexicalSearchOk))
                .append("\n");
        sb.append("    lexicalCommitSha: ")
                .append(toIndentedString(lexicalCommitSha))
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
