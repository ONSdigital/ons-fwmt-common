package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Pause to apply to a case, the pause can be derived from a Code or an Absolute date.
 */
@Data
@NoArgsConstructor
public class CasePauseRequest extends AbsolutePauseRequest {
  private String code = null;
  private OffsetDateTime effectiveFrom = null;
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
    CasePauseRequest casePauseRequest = (CasePauseRequest) o;
    return Objects.equals(this.code, casePauseRequest.code) &&
        Objects.equals(this.effectiveFrom, casePauseRequest.effectiveFrom) &&
        Objects.equals(this.reason, casePauseRequest.reason) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, effectiveFrom, reason, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CasePauseRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    effectiveFrom: ").append(toIndentedString(effectiveFrom)).append("\n");
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
