package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookIssueCommentCreatedIssueAllOfReactions
 */
@JsonTypeName("webhook_issue_comment_created_issue_allOf_reactions")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookIssueCommentCreatedIssueAllOfReactions {

    private Optional<Long> plus1 = Optional.empty();

    private Optional<Long> _1 = Optional.empty();

    private Optional<Long> confused = Optional.empty();

    private Optional<Long> eyes = Optional.empty();

    private Optional<Long> heart = Optional.empty();

    private Optional<Long> hooray = Optional.empty();

    private Optional<Long> laugh = Optional.empty();

    private Optional<Long> rocket = Optional.empty();

    private Optional<Long> totalCount = Optional.empty();

    private Optional<String> url = Optional.empty();

    public WebhookIssueCommentCreatedIssueAllOfReactions plus1(Long plus1) {
        this.plus1 = Optional.ofNullable(plus1);
        return this;
    }

    /**
     * Get plus1
     * @return plus1
     */
    @Schema(name = "+1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("+1")
    public Optional<Long> getPlus1() {
        return plus1;
    }

    public void setPlus1(Optional<Long> plus1) {
        this.plus1 = plus1;
    }

    public WebhookIssueCommentCreatedIssueAllOfReactions _1(Long _1) {
        this._1 = Optional.ofNullable(_1);
        return this;
    }

    /**
     * Get _1
     * @return _1
     */
    @Schema(name = "-1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("-1")
    public Optional<Long> get1() {
        return _1;
    }

    public void set1(Optional<Long> _1) {
        this._1 = _1;
    }

    public WebhookIssueCommentCreatedIssueAllOfReactions confused(Long confused) {
        this.confused = Optional.ofNullable(confused);
        return this;
    }

    /**
     * Get confused
     * @return confused
     */
    @Schema(name = "confused", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("confused")
    public Optional<Long> getConfused() {
        return confused;
    }

    public void setConfused(Optional<Long> confused) {
        this.confused = confused;
    }

    public WebhookIssueCommentCreatedIssueAllOfReactions eyes(Long eyes) {
        this.eyes = Optional.ofNullable(eyes);
        return this;
    }

    /**
     * Get eyes
     * @return eyes
     */
    @Schema(name = "eyes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("eyes")
    public Optional<Long> getEyes() {
        return eyes;
    }

    public void setEyes(Optional<Long> eyes) {
        this.eyes = eyes;
    }

    public WebhookIssueCommentCreatedIssueAllOfReactions heart(Long heart) {
        this.heart = Optional.ofNullable(heart);
        return this;
    }

    /**
     * Get heart
     * @return heart
     */
    @Schema(name = "heart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("heart")
    public Optional<Long> getHeart() {
        return heart;
    }

    public void setHeart(Optional<Long> heart) {
        this.heart = heart;
    }

    public WebhookIssueCommentCreatedIssueAllOfReactions hooray(Long hooray) {
        this.hooray = Optional.ofNullable(hooray);
        return this;
    }

    /**
     * Get hooray
     * @return hooray
     */
    @Schema(name = "hooray", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("hooray")
    public Optional<Long> getHooray() {
        return hooray;
    }

    public void setHooray(Optional<Long> hooray) {
        this.hooray = hooray;
    }

    public WebhookIssueCommentCreatedIssueAllOfReactions laugh(Long laugh) {
        this.laugh = Optional.ofNullable(laugh);
        return this;
    }

    /**
     * Get laugh
     * @return laugh
     */
    @Schema(name = "laugh", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("laugh")
    public Optional<Long> getLaugh() {
        return laugh;
    }

    public void setLaugh(Optional<Long> laugh) {
        this.laugh = laugh;
    }

    public WebhookIssueCommentCreatedIssueAllOfReactions rocket(Long rocket) {
        this.rocket = Optional.ofNullable(rocket);
        return this;
    }

    /**
     * Get rocket
     * @return rocket
     */
    @Schema(name = "rocket", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rocket")
    public Optional<Long> getRocket() {
        return rocket;
    }

    public void setRocket(Optional<Long> rocket) {
        this.rocket = rocket;
    }

    public WebhookIssueCommentCreatedIssueAllOfReactions totalCount(Long totalCount) {
        this.totalCount = Optional.ofNullable(totalCount);
        return this;
    }

    /**
     * Get totalCount
     * @return totalCount
     */
    @Schema(name = "total_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_count")
    public Optional<Long> getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Optional<Long> totalCount) {
        this.totalCount = totalCount;
    }

    public WebhookIssueCommentCreatedIssueAllOfReactions url(String url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public Optional<String> getUrl() {
        return url;
    }

    public void setUrl(Optional<String> url) {
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
        WebhookIssueCommentCreatedIssueAllOfReactions webhookIssueCommentCreatedIssueAllOfReactions =
                (WebhookIssueCommentCreatedIssueAllOfReactions) o;
        return Objects.equals(this.plus1, webhookIssueCommentCreatedIssueAllOfReactions.plus1)
                && Objects.equals(this._1, webhookIssueCommentCreatedIssueAllOfReactions._1)
                && Objects.equals(this.confused, webhookIssueCommentCreatedIssueAllOfReactions.confused)
                && Objects.equals(this.eyes, webhookIssueCommentCreatedIssueAllOfReactions.eyes)
                && Objects.equals(this.heart, webhookIssueCommentCreatedIssueAllOfReactions.heart)
                && Objects.equals(this.hooray, webhookIssueCommentCreatedIssueAllOfReactions.hooray)
                && Objects.equals(this.laugh, webhookIssueCommentCreatedIssueAllOfReactions.laugh)
                && Objects.equals(this.rocket, webhookIssueCommentCreatedIssueAllOfReactions.rocket)
                && Objects.equals(this.totalCount, webhookIssueCommentCreatedIssueAllOfReactions.totalCount)
                && Objects.equals(this.url, webhookIssueCommentCreatedIssueAllOfReactions.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plus1, _1, confused, eyes, heart, hooray, laugh, rocket, totalCount, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookIssueCommentCreatedIssueAllOfReactions {\n");
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
