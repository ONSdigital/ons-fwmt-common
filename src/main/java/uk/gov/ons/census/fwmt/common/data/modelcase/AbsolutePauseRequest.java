package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Absolute pause.
 */
@Data
@NoArgsConstructor
public class AbsolutePauseRequest {
  private OffsetDateTime until = null;
  private String reason = null;

  /**
   * Reason for the pause.
   *
   * @return reason
   **/
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbsolutePauseRequest absolutePauseRequest = (AbsolutePauseRequest) o;
    return Objects.equals(this.until, absolutePauseRequest.until) &&
        Objects.equals(this.reason, absolutePauseRequest.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(until, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbsolutePauseRequest {\n");

    sb.append("    until: ").append(toIndentedString(until)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
