package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * CeCaseExtension
 */
@Data
@NoArgsConstructor
public class CeCaseExtension {
  private Boolean ce1Complete = null;
  private Boolean deliveryRequired = null;
  private Integer expectedResponses = null;
  private Integer actualResponses = null;

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CeCaseExtension ceCaseExtension = (CeCaseExtension) o;
    return Objects.equals(this.ce1Complete, ceCaseExtension.ce1Complete) &&
        Objects.equals(this.deliveryRequired, ceCaseExtension.deliveryRequired) &&
        Objects.equals(this.expectedResponses, ceCaseExtension.expectedResponses) &&
        Objects.equals(this.actualResponses, ceCaseExtension.actualResponses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ce1Complete, deliveryRequired, expectedResponses, actualResponses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CeCaseExtension {\n");

    sb.append("    ce1Complete: ").append(toIndentedString(ce1Complete)).append("\n");
    sb.append("    deliveryRequired: ").append(toIndentedString(deliveryRequired)).append("\n");
    sb.append("    expectedResponses: ").append(toIndentedString(expectedResponses)).append("\n");
    sb.append("    actualResponses: ").append(toIndentedString(actualResponses)).append("\n");
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
