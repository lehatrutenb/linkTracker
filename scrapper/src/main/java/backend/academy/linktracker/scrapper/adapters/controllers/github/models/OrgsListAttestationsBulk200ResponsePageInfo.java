package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * Information about the current page.
 */
@Schema(
        name = "orgs_list_attestations_bulk_200_response_page_info",
        description = "Information about the current page.")
@JsonTypeName("orgs_list_attestations_bulk_200_response_page_info")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsListAttestationsBulk200ResponsePageInfo {

    private Optional<Boolean> hasNext = Optional.empty();

    private Optional<Boolean> hasPrevious = Optional.empty();

    private Optional<String> next = Optional.empty();

    private Optional<String> previous = Optional.empty();

    public OrgsListAttestationsBulk200ResponsePageInfo hasNext(Boolean hasNext) {
        this.hasNext = Optional.ofNullable(hasNext);
        return this;
    }

    /**
     * Indicates whether there is a next page.
     * @return hasNext
     */
    @Schema(
            name = "has_next",
            description = "Indicates whether there is a next page.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_next")
    public Optional<Boolean> getHasNext() {
        return hasNext;
    }

    public void setHasNext(Optional<Boolean> hasNext) {
        this.hasNext = hasNext;
    }

    public OrgsListAttestationsBulk200ResponsePageInfo hasPrevious(Boolean hasPrevious) {
        this.hasPrevious = Optional.ofNullable(hasPrevious);
        return this;
    }

    /**
     * Indicates whether there is a previous page.
     * @return hasPrevious
     */
    @Schema(
            name = "has_previous",
            description = "Indicates whether there is a previous page.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_previous")
    public Optional<Boolean> getHasPrevious() {
        return hasPrevious;
    }

    public void setHasPrevious(Optional<Boolean> hasPrevious) {
        this.hasPrevious = hasPrevious;
    }

    public OrgsListAttestationsBulk200ResponsePageInfo next(String next) {
        this.next = Optional.ofNullable(next);
        return this;
    }

    /**
     * The cursor to the next page.
     * @return next
     */
    @Schema(
            name = "next",
            description = "The cursor to the next page.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("next")
    public Optional<String> getNext() {
        return next;
    }

    public void setNext(Optional<String> next) {
        this.next = next;
    }

    public OrgsListAttestationsBulk200ResponsePageInfo previous(String previous) {
        this.previous = Optional.ofNullable(previous);
        return this;
    }

    /**
     * The cursor to the previous page.
     * @return previous
     */
    @Schema(
            name = "previous",
            description = "The cursor to the previous page.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("previous")
    public Optional<String> getPrevious() {
        return previous;
    }

    public void setPrevious(Optional<String> previous) {
        this.previous = previous;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsListAttestationsBulk200ResponsePageInfo orgsListAttestationsBulk200ResponsePageInfo =
                (OrgsListAttestationsBulk200ResponsePageInfo) o;
        return Objects.equals(this.hasNext, orgsListAttestationsBulk200ResponsePageInfo.hasNext)
                && Objects.equals(this.hasPrevious, orgsListAttestationsBulk200ResponsePageInfo.hasPrevious)
                && Objects.equals(this.next, orgsListAttestationsBulk200ResponsePageInfo.next)
                && Objects.equals(this.previous, orgsListAttestationsBulk200ResponsePageInfo.previous);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasNext, hasPrevious, next, previous);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsListAttestationsBulk200ResponsePageInfo {\n");
        sb.append("    hasNext: ").append(toIndentedString(hasNext)).append("\n");
        sb.append("    hasPrevious: ").append(toIndentedString(hasPrevious)).append("\n");
        sb.append("    next: ").append(toIndentedString(next)).append("\n");
        sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
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
