package backend.academy.linktracker.scrapper.adapters.controllers.stackoverflow.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * CollectiveExternalLinksInner
 */
@JsonTypeName("Collective_external_links_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-24T12:15:15.683209678Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CollectiveExternalLinksInner {

    /**
     * Gets or Sets type
     */
    public enum TypeEnum {
        WEBSITE("website"),

        TWITTER("twitter"),

        GITHUB("github"),

        FACEBOOK("facebook"),

        INSTAGRAM("instagram"),

        SUPPORT("support"),

        CHAT("chat");

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

    private URI link;

    public CollectiveExternalLinksInner type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CollectiveExternalLinksInner link(URI link) {
        this.link = link;
        return this;
    }

    /**
     * Get link
     * @return link
     */
    @Valid
    @Schema(name = "link", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("link")
    public URI getLink() {
        return link;
    }

    public void setLink(URI link) {
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
        CollectiveExternalLinksInner collectiveExternalLinksInner = (CollectiveExternalLinksInner) o;
        return Objects.equals(this.type, collectiveExternalLinksInner.type)
                && Objects.equals(this.link, collectiveExternalLinksInner.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, link);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectiveExternalLinksInner {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
