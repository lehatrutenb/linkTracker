package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * ReactionRollup
 */
@JsonTypeName("Reaction_Rollup")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReactionRollup {

    private URI url;

    private Long totalCount;

    private Long plus1;

    private Long _1;

    private Long laugh;

    private Long confused;

    private Long heart;

    private Long hooray;

    private Long eyes;

    private Long rocket;

    public ReactionRollup() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReactionRollup(
            URI url,
            Long totalCount,
            Long plus1,
            Long _1,
            Long laugh,
            Long confused,
            Long heart,
            Long hooray,
            Long eyes,
            Long rocket) {
        this.url = url;
        this.totalCount = totalCount;
        this.plus1 = plus1;
        this._1 = _1;
        this.laugh = laugh;
        this.confused = confused;
        this.heart = heart;
        this.hooray = hooray;
        this.eyes = eyes;
        this.rocket = rocket;
    }

    public ReactionRollup url(URI url) {
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

    public ReactionRollup totalCount(Long totalCount) {
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

    public ReactionRollup plus1(Long plus1) {
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

    public ReactionRollup _1(Long _1) {
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

    public ReactionRollup laugh(Long laugh) {
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

    public ReactionRollup confused(Long confused) {
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

    public ReactionRollup heart(Long heart) {
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

    public ReactionRollup hooray(Long hooray) {
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

    public ReactionRollup eyes(Long eyes) {
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

    public ReactionRollup rocket(Long rocket) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReactionRollup reactionRollup = (ReactionRollup) o;
        return Objects.equals(this.url, reactionRollup.url)
                && Objects.equals(this.totalCount, reactionRollup.totalCount)
                && Objects.equals(this.plus1, reactionRollup.plus1)
                && Objects.equals(this._1, reactionRollup._1)
                && Objects.equals(this.laugh, reactionRollup.laugh)
                && Objects.equals(this.confused, reactionRollup.confused)
                && Objects.equals(this.heart, reactionRollup.heart)
                && Objects.equals(this.hooray, reactionRollup.hooray)
                && Objects.equals(this.eyes, reactionRollup.eyes)
                && Objects.equals(this.rocket, reactionRollup.rocket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, totalCount, plus1, _1, laugh, confused, heart, hooray, eyes, rocket);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReactionRollup {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    plus1: ").append(toIndentedString(plus1)).append("\n");
        sb.append("    _1: ").append(toIndentedString(_1)).append("\n");
        sb.append("    laugh: ").append(toIndentedString(laugh)).append("\n");
        sb.append("    confused: ").append(toIndentedString(confused)).append("\n");
        sb.append("    heart: ").append(toIndentedString(heart)).append("\n");
        sb.append("    hooray: ").append(toIndentedString(hooray)).append("\n");
        sb.append("    eyes: ").append(toIndentedString(eyes)).append("\n");
        sb.append("    rocket: ").append(toIndentedString(rocket)).append("\n");
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
