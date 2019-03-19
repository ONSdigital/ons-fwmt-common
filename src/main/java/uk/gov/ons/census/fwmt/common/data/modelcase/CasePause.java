package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Case pause
 */
@Data
@NoArgsConstructor
public class CasePause {
  private OffsetDateTime until = null;
  private String reason = null;
  private List<Link> _links = null;

  /**
   * Get _links
   *
   * @return _links
   **/
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CasePause casePause = (CasePause) o;
    return Objects.equals(this.until, casePause.until) &&
        Objects.equals(this.reason, casePause.reason) &&
        Objects.equals(this._links, casePause._links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(until, reason, _links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CasePause {\n");

    sb.append("    until: ").append(toIndentedString(until)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
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
