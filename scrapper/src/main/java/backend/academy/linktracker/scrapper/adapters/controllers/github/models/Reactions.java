package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * Reactions
 */
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Reactions {

    private Long plus1;

    private Long _1;

    private Long confused;

    private Long eyes;

    private Long heart;

    private Long hooray;

    private Long laugh;

    private Long rocket;

    private Long totalCount;

    private URI url;

    public Reactions() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Reactions(
            Long plus1,
            Long _1,
            Long confused,
            Long eyes,
            Long heart,
            Long hooray,
            Long laugh,
            Long rocket,
            Long totalCount,
            URI url) {
        this.plus1 = plus1;
        this._1 = _1;
        this.confused = confused;
        this.eyes = eyes;
        this.heart = heart;
        this.hooray = hooray;
        this.laugh = laugh;
        this.rocket = rocket;
        this.totalCount = totalCount;
        this.url = url;
    }

    public Reactions plus1(Long plus1) {
        this.plus1 = plus1;
        return this;
    }

    /**
     * Get plus1
     * @return plus1
     */
    @NotNull
    @Schema(name = "+1", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("+1")
    public Long getPlus1() {
        return plus1;
    }

    public void setPlus1(Long plus1) {
        this.plus1 = plus1;
    }

    public Reactions _1(Long _1) {
        this._1 = _1;
        return this;
    }

    /**
     * Get _1
     * @return _1
     */
    @NotNull
    @Schema(name = "-1", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("-1")
    public Long get1() {
        return _1;
    }

    public void set1(Long _1) {
        this._1 = _1;
    }

    public Reactions confused(Long confused) {
        this.confused = confused;
        return this;
    }

    /**
     * Get confused
     * @return confused
     */
    @NotNull
    @Schema(name = "confused", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("confused")
    public Long getConfused() {
        return confused;
    }

    public void setConfused(Long confused) {
        this.confused = confused;
    }

    public Reactions eyes(Long eyes) {
        this.eyes = eyes;
        return this;
    }

    /**
     * Get eyes
     * @return eyes
     */
    @NotNull
    @Schema(name = "eyes", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("eyes")
    public Long getEyes() {
        return eyes;
    }

    public void setEyes(Long eyes) {
        this.eyes = eyes;
    }

    public Reactions heart(Long heart) {
        this.heart = heart;
        return this;
    }

    /**
     * Get heart
     * @return heart
     */
    @NotNull
    @Schema(name = "heart", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("heart")
    public Long getHeart() {
        return heart;
    }

    public void setHeart(Long heart) {
        this.heart = heart;
    }

    public Reactions hooray(Long hooray) {
        this.hooray = hooray;
        return this;
    }

    /**
     * Get hooray
     * @return hooray
     */
    @NotNull
    @Schema(name = "hooray", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("hooray")
    public Long getHooray() {
        return hooray;
    }

    public void setHooray(Long hooray) {
        this.hooray = hooray;
    }

    public Reactions laugh(Long laugh) {
        this.laugh = laugh;
        return this;
    }

    /**
     * Get laugh
     * @return laugh
     */
    @NotNull
    @Schema(name = "laugh", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("laugh")
    public Long getLaugh() {
        return laugh;
    }

    public void setLaugh(Long laugh) {
        this.laugh = laugh;
    }

    public Reactions rocket(Long rocket) {
        this.rocket = rocket;
        return this;
    }

    /**
     * Get rocket
     * @return rocket
     */
    @NotNull
    @Schema(name = "rocket", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("rocket")
    public Long getRocket() {
        return rocket;
    }

    public void setRocket(Long rocket) {
        this.rocket = rocket;
    }

    public Reactions totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get totalCount
     * @return totalCount
     */
    @NotNull
    @Schema(name = "total_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total_count")
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Reactions url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Reactions reactions = (Reactions) o;
        return Objects.equals(this.plus1, reactions.plus1)
                && Objects.equals(this._1, reactions._1)
                && Objects.equals(this.confused, reactions.confused)
                && Objects.equals(this.eyes, reactions.eyes)
                && Objects.equals(this.heart, reactions.heart)
                && Objects.equals(this.hooray, reactions.hooray)
                && Objects.equals(this.laugh, reactions.laugh)
                && Objects.equals(this.rocket, reactions.rocket)
                && Objects.equals(this.totalCount, reactions.totalCount)
                && Objects.equals(this.url, reactions.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plus1, _1, confused, eyes, heart, hooray, laugh, rocket, totalCount, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Reactions {\n");
        sb.append("    plus1: ").append(toIndentedString(plus1)).append("\n");
        sb.append("    _1: ").append(toIndentedString(_1)).append("\n");
        sb.append("    confused: ").append(toIndentedString(confused)).append("\n");
        sb.append("    eyes: ").append(toIndentedString(eyes)).append("\n");
        sb.append("    heart: ").append(toIndentedString(heart)).append("\n");
        sb.append("    hooray: ").append(toIndentedString(hooray)).append("\n");
        sb.append("    laugh: ").append(toIndentedString(laugh)).append("\n");
        sb.append("    rocket: ").append(toIndentedString(rocket)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
