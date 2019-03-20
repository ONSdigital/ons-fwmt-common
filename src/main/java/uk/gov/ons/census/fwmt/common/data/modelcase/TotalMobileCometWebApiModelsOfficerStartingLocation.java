package uk.gov.ons.census.fwmt.common.data.modelcase;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * TotalMobileCometWebApiModelsOfficerStartingLocation
 */
@Data
@NoArgsConstructor
public class TotalMobileCometWebApiModelsOfficerStartingLocation {
  private Float lat = null;
  private Float lng = null;
  private Float radius = null;
  private TravelModeEnum travelMode = null;

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TotalMobileCometWebApiModelsOfficerStartingLocation totalMobileCometWebApiModelsOfficerStartingLocation = (TotalMobileCometWebApiModelsOfficerStartingLocation) o;
    return Objects.equals(this.lat, totalMobileCometWebApiModelsOfficerStartingLocation.lat) &&
        Objects.equals(this.lng, totalMobileCometWebApiModelsOfficerStartingLocation.lng) &&
        Objects.equals(this.radius, totalMobileCometWebApiModelsOfficerStartingLocation.radius) &&
        Objects.equals(this.travelMode, totalMobileCometWebApiModelsOfficerStartingLocation.travelMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lng, radius, travelMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TotalMobileCometWebApiModelsOfficerStartingLocation {\n");

    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    radius: ").append(toIndentedString(radius)).append("\n");
    sb.append("    travelMode: ").append(toIndentedString(travelMode)).append("\n");
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

  /**
   * Gets or Sets travelMode
   */
  public enum TravelModeEnum {
    DRIVER("Driver"),

    WALKER("Walker");

    private String value;

    TravelModeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TravelModeEnum fromValue(String text) {
      for (TravelModeEnum b : TravelModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
}
