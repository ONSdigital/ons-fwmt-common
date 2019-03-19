package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Coded pause. Provides a code to indicate the length of pause to apply.
 */
@Data
@NoArgsConstructor
public class CodedPauseRequest {
  private String code = null;
  private OffsetDateTime effectiveFrom = null;
  private String reason = null;

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodedPauseRequest codedPauseRequest = (CodedPauseRequest) o;
    return Objects.equals(this.code, codedPauseRequest.code) &&
        Objects.equals(this.effectiveFrom, codedPauseRequest.effectiveFrom) &&
        Objects.equals(this.reason, codedPauseRequest.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, effectiveFrom, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodedPauseRequest {\n");

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
