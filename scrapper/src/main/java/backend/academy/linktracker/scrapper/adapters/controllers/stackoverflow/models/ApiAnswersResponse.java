package backend.academy.linktracker.scrapper.adapters.controllers.stackoverflow.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Standard Stack Exchange API response wrapper for answer collections.
 */
@Schema(
        name = "ApiAnswersResponse",
        description = "Standard Stack Exchange API response wrapper for answer collections.")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-24T12:15:15.683209678Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ApiAnswersResponse {

    @Valid
    private List<@Valid Answer> items = new ArrayList<>();

    private Boolean hasMore;

    private Long quotaMax;

    private Long quotaRemaining;

    private Long page;

    private Long pageSize;

    private Long total;

    /**
     * Type of items returned.
     */
    public enum TypeEnum {
        QUESTION("question"),

        ANSWER("answer"),

        COMMENT("comment"),

        USER("user"),

        TAG("tag"),

        BADGE("badge"),

        ETC_("etc.");

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

    private Long backoff;

    private Long errorId;

    private String errorMessage;

    private String errorName;

    public ApiAnswersResponse() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ApiAnswersResponse(List<@Valid Answer> items, Boolean hasMore, Long quotaMax, Long quotaRemaining) {
        this.items = items;
        this.hasMore = hasMore;
        this.quotaMax = quotaMax;
        this.quotaRemaining = quotaRemaining;
    }

    public ApiAnswersResponse items(List<@Valid Answer> items) {
        this.items = items;
        return this;
    }

    public ApiAnswersResponse addItemsItem(Answer itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * The answers returned by the request.
     * @return items
     */
    @NotNull
    @Valid
    @Schema(
            name = "items",
            description = "The answers returned by the request.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("items")
    public List<@Valid Answer> getItems() {
        return items;
    }

    public void setItems(List<@Valid Answer> items) {
        this.items = items;
    }

    public ApiAnswersResponse hasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    /**
     * True if there are more items to fetch.
     * @return hasMore
     */
    @NotNull
    @Schema(
            name = "has_more",
            example = "true",
            description = "True if there are more items to fetch.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("has_more")
    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public ApiAnswersResponse quotaMax(Long quotaMax) {
        this.quotaMax = quotaMax;
        return this;
    }

    /**
     * Maximum quota for the API key.
     * @return quotaMax
     */
    @NotNull
    @Schema(
            name = "quota_max",
            example = "10000",
            description = "Maximum quota for the API key.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("quota_max")
    public Long getQuotaMax() {
        return quotaMax;
    }

    public void setQuotaMax(Long quotaMax) {
        this.quotaMax = quotaMax;
    }

    public ApiAnswersResponse quotaRemaining(Long quotaRemaining) {
        this.quotaRemaining = quotaRemaining;
        return this;
    }

    /**
     * Remaining quota for the API key.
     * @return quotaRemaining
     */
    @NotNull
    @Schema(
            name = "quota_remaining",
            example = "9992",
            description = "Remaining quota for the API key.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("quota_remaining")
    public Long getQuotaRemaining() {
        return quotaRemaining;
    }

    public void setQuotaRemaining(Long quotaRemaining) {
        this.quotaRemaining = quotaRemaining;
    }

    public ApiAnswersResponse page(Long page) {
        this.page = page;
        return this;
    }

    /**
     * Current page number.
     * @return page
     */
    @Schema(
            name = "page",
            example = "1",
            description = "Current page number.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("page")
    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public ApiAnswersResponse pageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Number of items per page.
     * @return pageSize
     */
    @Schema(
            name = "page_size",
            example = "30",
            description = "Number of items per page.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("page_size")
    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public ApiAnswersResponse total(Long total) {
        this.total = total;
        return this;
    }

    /**
     * Total number of items available.
     * @return total
     */
    @Schema(
            name = "total",
            example = "152",
            description = "Total number of items available.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total")
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ApiAnswersResponse type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Type of items returned.
     * @return type
     */
    @Schema(
            name = "type",
            example = "answer",
            description = "Type of items returned.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ApiAnswersResponse backoff(Long backoff) {
        this.backoff = backoff;
        return this;
    }

    /**
     * Number of seconds to wait before making another request to avoid throttling.
     * @return backoff
     */
    @Schema(
            name = "backoff",
            example = "5",
            description = "Number of seconds to wait before making another request to avoid throttling.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("backoff")
    public Long getBackoff() {
        return backoff;
    }

    public void setBackoff(Long backoff) {
        this.backoff = backoff;
    }

    public ApiAnswersResponse errorId(Long errorId) {
        this.errorId = errorId;
        return this;
    }

    /**
     * Error ID if an error occurred.
     * @return errorId
     */
    @Schema(
            name = "error_id",
            example = "400",
            description = "Error ID if an error occurred.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("error_id")
    public Long getErrorId() {
        return errorId;
    }

    public void setErrorId(Long errorId) {
        this.errorId = errorId;
    }

    public ApiAnswersResponse errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Error message if an error occurred.
     * @return errorMessage
     */
    @Schema(
            name = "error_message",
            example = "Invalid parameter: page",
            description = "Error message if an error occurred.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("error_message")
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ApiAnswersResponse errorName(String errorName) {
        this.errorName = errorName;
        return this;
    }

    /**
     * Error name if an error occurred.
     * @return errorName
     */
    @Schema(
            name = "error_name",
            example = "bad_parameter",
            description = "Error name if an error occurred.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("error_name")
    public String getErrorName() {
        return errorName;
    }

    public void setErrorName(String errorName) {
        this.errorName = errorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiAnswersResponse apiAnswersResponse = (ApiAnswersResponse) o;
        return Objects.equals(this.items, apiAnswersResponse.items)
                && Objects.equals(this.hasMore, apiAnswersResponse.hasMore)
                && Objects.equals(this.quotaMax, apiAnswersResponse.quotaMax)
                && Objects.equals(this.quotaRemaining, apiAnswersResponse.quotaRemaining)
                && Objects.equals(this.page, apiAnswersResponse.page)
                && Objects.equals(this.pageSize, apiAnswersResponse.pageSize)
                && Objects.equals(this.total, apiAnswersResponse.total)
                && Objects.equals(this.type, apiAnswersResponse.type)
                && Objects.equals(this.backoff, apiAnswersResponse.backoff)
                && Objects.equals(this.errorId, apiAnswersResponse.errorId)
                && Objects.equals(this.errorMessage, apiAnswersResponse.errorMessage)
                && Objects.equals(this.errorName, apiAnswersResponse.errorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                items,
                hasMore,
                quotaMax,
                quotaRemaining,
                page,
                pageSize,
                total,
                type,
                backoff,
                errorId,
                errorMessage,
                errorName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiAnswersResponse {\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
        sb.append("    quotaMax: ").append(toIndentedString(quotaMax)).append("\n");
        sb.append("    quotaRemaining: ")
                .append(toIndentedString(quotaRemaining))
                .append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    backoff: ").append(toIndentedString(backoff)).append("\n");
        sb.append("    errorId: ").append(toIndentedString(errorId)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    errorName: ").append(toIndentedString(errorName)).append("\n");
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
