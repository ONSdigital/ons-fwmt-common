package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * CcsCaseExtension
 */
@Data
@NoArgsConstructor
public class CcsCaseExtension {
  private String questionnaireUrl = null;

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CcsCaseExtension ccsCaseExtension = (CcsCaseExtension) o;
    return Objects.equals(this.questionnaireUrl, ccsCaseExtension.questionnaireUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionnaireUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CcsCaseExtension {\n");

    sb.append("    questionnaireUrl: ").append(toIndentedString(questionnaireUrl)).append("\n");
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
