package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Address
 */
@Data
@NoArgsConstructor
public class Address {
  private Long uprn = null;
  private List<String> lines = new ArrayList<String>();
  private String town = null;
  private String postcode = null;
  private Geography geography = null;

  /**
   * Get geography
   *
   * @return geography
   **/
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.uprn, address.uprn) &&
        Objects.equals(this.lines, address.lines) &&
        Objects.equals(this.town, address.town) &&
        Objects.equals(this.postcode, address.postcode) &&
        Objects.equals(this.geography, address.geography);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uprn, lines, town, postcode, geography);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");

    sb.append("    uprn: ").append(toIndentedString(uprn)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    town: ").append(toIndentedString(town)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    geography: ").append(toIndentedString(geography)).append("\n");
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
