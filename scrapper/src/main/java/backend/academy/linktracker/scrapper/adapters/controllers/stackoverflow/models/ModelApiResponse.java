package backend.academy.linktracker.scrapper.adapters.controllers.stackoverflow.models;

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
 * Sample API response wrapper for demonstration purposes.
 */
@Schema(name = "ApiResponse", description = "Sample API response wrapper for demonstration purposes.")
@JsonTypeName("ApiResponse")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-24T12:15:15.683209678Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ModelApiResponse {

    @Valid
    private List<ApiResponseItemsInner> items = new ArrayList<>();

    private Boolean hasMore;

    private Long quotaMax;

    private Long quotaRemaining;

    private Long page;

    private Long pageSize;

    private Long total;

    private String type;

    private Long backoff;

    private Long errorId;

    private String errorMessage;

    private String errorName;

    public ModelApiResponse() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ModelApiResponse(List<ApiResponseItemsInner> items, Boolean hasMore, Long quotaMax, Long quotaRemaining) {
        this.items = items;
        this.hasMore = hasMore;
        this.quotaMax = quotaMax;
        this.quotaRemaining = quotaRemaining;
    }

    public ModelApiResponse items(List<ApiResponseItemsInner> items) {
        this.items = items;
        return this;
    }

    public ModelApiResponse addItemsItem(ApiResponseItemsInner itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * The items returned by the request.
     * @return items
     */
    @NotNull
    @Valid
    @Schema(
            name = "items",
            description = "The items returned by the request.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("items")
    public List<ApiResponseItemsInner> getItems() {
        return items;
    }

    public void setItems(List<ApiResponseItemsInner> items) {
        this.items = items;
    }

    public ModelApiResponse hasMore(Boolean hasMore) {
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
            example = "false",
            description = "True if there are more items to fetch.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("has_more")
    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public ModelApiResponse quotaMax(Long quotaMax) {
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

    public ModelApiResponse quotaRemaining(Long quotaRemaining) {
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
            example = "9985",
            description = "Remaining quota for the API key.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("quota_remaining")
    public Long getQuotaRemaining() {
        return quotaRemaining;
    }

    public void setQuotaRemaining(Long quotaRemaining) {
        this.quotaRemaining = quotaRemaining;
    }

    public ModelApiResponse page(Long page) {
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

    public ModelApiResponse pageSize(Long pageSize) {
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

    public ModelApiResponse total(Long total) {
        this.total = total;
        return this;
    }

    /**
     * Total number of items available.
     * @return total
     */
    @Schema(
            name = "total",
            example = "15",
            description = "Total number of items available.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total")
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ModelApiResponse type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Type of items returned.
     * @return type
     */
    @Schema(
            name = "type",
            example = "mixed",
            description = "Type of items returned.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ModelApiResponse backoff(Long backoff) {
        this.backoff = backoff;
        return this;
    }

    /**
     * Number of seconds to wait before making another request to avoid throttling.
     * @return backoff
     */
    @Schema(
            name = "backoff",
            description = "Number of seconds to wait before making another request to avoid throttling.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("backoff")
    public Long getBackoff() {
        return backoff;
    }

    public void setBackoff(Long backoff) {
        this.backoff = backoff;
    }

    public ModelApiResponse errorId(Long errorId) {
        this.errorId = errorId;
        return this;
    }

    /**
     * Get errorId
     * @return errorId
     */
    @Schema(name = "error_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("error_id")
    public Long getErrorId() {
        return errorId;
    }

    public void setErrorId(Long errorId) {
        this.errorId = errorId;
    }

    public ModelApiResponse errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Get errorMessage
     * @return errorMessage
     */
    @Schema(name = "error_message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("error_message")
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ModelApiResponse errorName(String errorName) {
        this.errorName = errorName;
        return this;
    }

    /**
     * Get errorName
     * @return errorName
     */
    @Schema(name = "error_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        ModelApiResponse _apiResponse = (ModelApiResponse) o;
        return Objects.equals(this.items, _apiResponse.items)
                && Objects.equals(this.hasMore, _apiResponse.hasMore)
                && Objects.equals(this.quotaMax, _apiResponse.quotaMax)
                && Objects.equals(this.quotaRemaining, _apiResponse.quotaRemaining)
                && Objects.equals(this.page, _apiResponse.page)
                && Objects.equals(this.pageSize, _apiResponse.pageSize)
                && Objects.equals(this.total, _apiResponse.total)
                && Objects.equals(this.type, _apiResponse.type)
                && Objects.equals(this.backoff, _apiResponse.backoff)
                && Objects.equals(this.errorId, _apiResponse.errorId)
                && Objects.equals(this.errorMessage, _apiResponse.errorMessage)
                && Objects.equals(this.errorName, _apiResponse.errorName);
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
        sb.append("class ModelApiResponse {\n");
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
