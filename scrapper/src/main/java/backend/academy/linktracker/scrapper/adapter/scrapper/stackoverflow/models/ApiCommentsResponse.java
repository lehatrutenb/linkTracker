package backend.academy.linktracker.scrapper.adapter.scrapper.stackoverflow.models;

import java.net.URI;
import java.util.Objects;
import backend.academy.linktracker.scrapper.adapter.scrapper.stackoverflow.models.Comment;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Standard Stack Exchange API response wrapper for comments collections.
 */

@Schema(name = "ApiCommentsResponse", description = "Standard Stack Exchange API response wrapper for comments collections.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-05-09T22:14:15.603572775Z[Etc/UTC]", comments = "Generator version: 7.23.0-SNAPSHOT")
public class ApiCommentsResponse {

  @Valid
  private List<@Valid Comment> items = new ArrayList<>();

  private Boolean hasMore;

  private Long quotaMax;

  private Long quotaRemaining;

  private Optional<Long> page = Optional.empty();

  private Optional<Long> pageSize = Optional.empty();

  private Optional<Long> total = Optional.empty();

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

  private Optional<TypeEnum> type = Optional.empty();

  private Optional<Long> backoff = Optional.empty();

  private Optional<Long> errorId = Optional.empty();

  private Optional<String> errorMessage = Optional.empty();

  private Optional<String> errorName = Optional.empty();

  public ApiCommentsResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApiCommentsResponse(List<@Valid Comment> items, Boolean hasMore, Long quotaMax, Long quotaRemaining) {
    this.items = items;
    this.hasMore = hasMore;
    this.quotaMax = quotaMax;
    this.quotaRemaining = quotaRemaining;
  }

  public ApiCommentsResponse items(List<@Valid Comment> items) {
    this.items = items;
    return this;
  }

  public ApiCommentsResponse addItemsItem(Comment itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * The comments returned by the request.
   * @return items
   */
  @NotNull @Valid 
  @Schema(name = "items", description = "The comments returned by the request.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid Comment> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<@Valid Comment> items) {
    this.items = items;
  }

  public ApiCommentsResponse hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  /**
   * True if there are more items to fetch.
   * @return hasMore
   */
  @NotNull 
  @Schema(name = "has_more", example = "true", description = "True if there are more items to fetch.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("has_more")
  public Boolean getHasMore() {
    return hasMore;
  }

  @JsonProperty("has_more")
  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public ApiCommentsResponse quotaMax(Long quotaMax) {
    this.quotaMax = quotaMax;
    return this;
  }

  /**
   * Maximum quota for the API key.
   * @return quotaMax
   */
  @NotNull 
  @Schema(name = "quota_max", example = "10000", description = "Maximum quota for the API key.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("quota_max")
  public Long getQuotaMax() {
    return quotaMax;
  }

  @JsonProperty("quota_max")
  public void setQuotaMax(Long quotaMax) {
    this.quotaMax = quotaMax;
  }

  public ApiCommentsResponse quotaRemaining(Long quotaRemaining) {
    this.quotaRemaining = quotaRemaining;
    return this;
  }

  /**
   * Remaining quota for the API key.
   * @return quotaRemaining
   */
  @NotNull 
  @Schema(name = "quota_remaining", example = "9992", description = "Remaining quota for the API key.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("quota_remaining")
  public Long getQuotaRemaining() {
    return quotaRemaining;
  }

  @JsonProperty("quota_remaining")
  public void setQuotaRemaining(Long quotaRemaining) {
    this.quotaRemaining = quotaRemaining;
  }

  public ApiCommentsResponse page(Long page) {
    this.page = Optional.ofNullable(page);
    return this;
  }

  /**
   * Current page number.
   * @return page
   */
  
  @Schema(name = "page", example = "1", description = "Current page number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("page")
  public Optional<Long> getPage() {
    return page;
  }

  @JsonProperty("page")
  public void setPage(Optional<Long> page) {
    this.page = page;
  }

  public ApiCommentsResponse pageSize(Long pageSize) {
    this.pageSize = Optional.ofNullable(pageSize);
    return this;
  }

  /**
   * Number of items per page.
   * @return pageSize
   */
  
  @Schema(name = "page_size", example = "30", description = "Number of items per page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("page_size")
  public Optional<Long> getPageSize() {
    return pageSize;
  }

  @JsonProperty("page_size")
  public void setPageSize(Optional<Long> pageSize) {
    this.pageSize = pageSize;
  }

  public ApiCommentsResponse total(Long total) {
    this.total = Optional.ofNullable(total);
    return this;
  }

  /**
   * Total number of items available.
   * @return total
   */
  
  @Schema(name = "total", example = "152", description = "Total number of items available.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public Optional<Long> getTotal() {
    return total;
  }

  @JsonProperty("total")
  public void setTotal(Optional<Long> total) {
    this.total = total;
  }

  public ApiCommentsResponse type(TypeEnum type) {
    this.type = Optional.ofNullable(type);
    return this;
  }

  /**
   * Type of items returned.
   * @return type
   */
  
  @Schema(name = "type", example = "question", description = "Type of items returned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public Optional<TypeEnum> getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(Optional<TypeEnum> type) {
    this.type = type;
  }

  public ApiCommentsResponse backoff(Long backoff) {
    this.backoff = Optional.ofNullable(backoff);
    return this;
  }

  /**
   * Number of seconds to wait before making another request to avoid throttling.
   * @return backoff
   */
  
  @Schema(name = "backoff", example = "5", description = "Number of seconds to wait before making another request to avoid throttling.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("backoff")
  public Optional<Long> getBackoff() {
    return backoff;
  }

  @JsonProperty("backoff")
  public void setBackoff(Optional<Long> backoff) {
    this.backoff = backoff;
  }

  public ApiCommentsResponse errorId(Long errorId) {
    this.errorId = Optional.ofNullable(errorId);
    return this;
  }

  /**
   * Error ID if an error occurred.
   * @return errorId
   */
  
  @Schema(name = "error_id", example = "400", description = "Error ID if an error occurred.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error_id")
  public Optional<Long> getErrorId() {
    return errorId;
  }

  @JsonProperty("error_id")
  public void setErrorId(Optional<Long> errorId) {
    this.errorId = errorId;
  }

  public ApiCommentsResponse errorMessage(String errorMessage) {
    this.errorMessage = Optional.ofNullable(errorMessage);
    return this;
  }

  /**
   * Error message if an error occurred.
   * @return errorMessage
   */
  
  @Schema(name = "error_message", example = "Invalid parameter: page", description = "Error message if an error occurred.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error_message")
  public Optional<String> getErrorMessage() {
    return errorMessage;
  }

  @JsonProperty("error_message")
  public void setErrorMessage(Optional<String> errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ApiCommentsResponse errorName(String errorName) {
    this.errorName = Optional.ofNullable(errorName);
    return this;
  }

  /**
   * Error name if an error occurred.
   * @return errorName
   */
  
  @Schema(name = "error_name", example = "bad_parameter", description = "Error name if an error occurred.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error_name")
  public Optional<String> getErrorName() {
    return errorName;
  }

  @JsonProperty("error_name")
  public void setErrorName(Optional<String> errorName) {
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
    ApiCommentsResponse apiCommentsResponse = (ApiCommentsResponse) o;
    return Objects.equals(this.items, apiCommentsResponse.items) &&
        Objects.equals(this.hasMore, apiCommentsResponse.hasMore) &&
        Objects.equals(this.quotaMax, apiCommentsResponse.quotaMax) &&
        Objects.equals(this.quotaRemaining, apiCommentsResponse.quotaRemaining) &&
        Objects.equals(this.page, apiCommentsResponse.page) &&
        Objects.equals(this.pageSize, apiCommentsResponse.pageSize) &&
        Objects.equals(this.total, apiCommentsResponse.total) &&
        Objects.equals(this.type, apiCommentsResponse.type) &&
        Objects.equals(this.backoff, apiCommentsResponse.backoff) &&
        Objects.equals(this.errorId, apiCommentsResponse.errorId) &&
        Objects.equals(this.errorMessage, apiCommentsResponse.errorMessage) &&
        Objects.equals(this.errorName, apiCommentsResponse.errorName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, hasMore, quotaMax, quotaRemaining, page, pageSize, total, type, backoff, errorId, errorMessage, errorName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCommentsResponse {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    quotaMax: ").append(toIndentedString(quotaMax)).append("\n");
    sb.append("    quotaRemaining: ").append(toIndentedString(quotaRemaining)).append("\n");
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

