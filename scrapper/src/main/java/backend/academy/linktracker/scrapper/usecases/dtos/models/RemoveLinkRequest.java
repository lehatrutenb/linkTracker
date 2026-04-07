package backend.academy.linktracker.scrapper.usecases.dtos.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.net.URI;
import java.util.Objects;
import java.util.Optional;

/**
 * RemoveLinkRequest
 */
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:05:18.391121671Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RemoveLinkRequest {

    private Optional<URI> link = Optional.empty();

    public RemoveLinkRequest link(URI link) {
        this.link = Optional.ofNullable(link);
        return this;
    }

    /**
     * Get link
     * @return link
     */
    @Valid
    @Schema(name = "link", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("link")
    public Optional<URI> getLink() {
        return link;
    }

    public void setLink(Optional<URI> link) {
        this.link = link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RemoveLinkRequest removeLinkRequest = (RemoveLinkRequest) o;
        return Objects.equals(this.link, removeLinkRequest.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(link);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveLinkRequest {\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
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
