package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * FetchCriteria
 */
@Data
@NoArgsConstructor
public class FetchCriteria {
  private String filter = null;
  private String order = null;
  private String include = null;

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FetchCriteria fetchCriteria = (FetchCriteria) o;
    return Objects.equals(this.filter, fetchCriteria.filter) &&
        Objects.equals(this.order, fetchCriteria.order) &&
        Objects.equals(this.include, fetchCriteria.include);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, order, include);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FetchCriteria {\n");

    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
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
