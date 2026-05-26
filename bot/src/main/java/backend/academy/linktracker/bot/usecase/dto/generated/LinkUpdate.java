<<<<<<<< HEAD:.bot/src/main/java/backend/academy/linktracker/bot/usecase/dtos/models/LinkUpdateRequest.java
package backend.academy.linktracker.bot.usecase.dtos.models;
========
package backend.academy.linktracker.bot.usecase.dto.generated;
>>>>>>>> HW2:bot/src/main/java/backend/academy/linktracker/bot/usecase/dto/generated/LinkUpdate.java

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * LinkUpdate
 */
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T12:43:50.364860284Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class LinkUpdateRequest {

    private Optional<Long> id = Optional.empty();

    private Optional<URI> url = Optional.empty();

    private Optional<String> description = Optional.empty();

    @Valid
    private List<Long> tgChatIds = new ArrayList<>();

    public LinkUpdateRequest id(Long id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public LinkUpdateRequest url(URI url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public Optional<URI> getUrl() {
        return url;
    }

    public void setUrl(Optional<URI> url) {
        this.url = url;
    }

    public LinkUpdateRequest description(String description) {
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(Optional<String> description) {
        this.description = description;
    }

    public LinkUpdateRequest tgChatIds(List<Long> tgChatIds) {
        this.tgChatIds = tgChatIds;
        return this;
    }

    public LinkUpdateRequest addTgChatIdsItem(Long tgChatIdsItem) {
        if (this.tgChatIds == null) {
            this.tgChatIds = new ArrayList<>();
        }
        this.tgChatIds.add(tgChatIdsItem);
        return this;
    }

    /**
     * Get tgChatIds
     * @return tgChatIds
     */
    @Schema(name = "tgChatIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tgChatIds")
    public List<Long> getTgChatIds() {
        return tgChatIds;
    }

    public void setTgChatIds(List<Long> tgChatIds) {
        this.tgChatIds = tgChatIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LinkUpdateRequest linkUpdate = (LinkUpdateRequest) o;
        return Objects.equals(this.id, linkUpdate.id)
                && Objects.equals(this.url, linkUpdate.url)
                && Objects.equals(this.description, linkUpdate.description)
                && Objects.equals(this.tgChatIds, linkUpdate.tgChatIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url, description, tgChatIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinkUpdate {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tgChatIds: ").append(toIndentedString(tgChatIds)).append("\n");
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
