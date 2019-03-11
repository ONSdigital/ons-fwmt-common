package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * PagingInfo
 */
@Data
@NoArgsConstructor
public class PagingInfo {
  private Integer pageNo = null;
  private Integer pageSize = null;
  private Integer pageCount = null;
  private Integer totalCount = null;
  private String previous = null;
  private String next = null;

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagingInfo pagingInfo = (PagingInfo) o;
    return Objects.equals(this.pageNo, pagingInfo.pageNo) &&
        Objects.equals(this.pageSize, pagingInfo.pageSize) &&
        Objects.equals(this.pageCount, pagingInfo.pageCount) &&
        Objects.equals(this.totalCount, pagingInfo.totalCount) &&
        Objects.equals(this.previous, pagingInfo.previous) &&
        Objects.equals(this.next, pagingInfo.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNo, pageSize, pageCount, totalCount, previous, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagingInfo {\n");

    sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
