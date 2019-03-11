package uk.gov.ons.census.fwmt.common.data.modelcase;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * TotalMobileCometWebApiModelsOfficerRequest
 */
@Data
@NoArgsConstructor
public class TotalMobileCometWebApiModelsOfficerRequest {
  private String mobile = null;
  private Boolean welshSpeaker = null;
  private String notes = null;
  private Location location = null;
  private String startingOAName = null;
  private TravelModeEnum travelMode = null;
  private Float maxTravelDistance = null;

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TotalMobileCometWebApiModelsOfficerRequest totalMobileCometWebApiModelsOfficerRequest = (TotalMobileCometWebApiModelsOfficerRequest) o;
    return Objects.equals(this.mobile, totalMobileCometWebApiModelsOfficerRequest.mobile) &&
        Objects.equals(this.welshSpeaker, totalMobileCometWebApiModelsOfficerRequest.welshSpeaker) &&
        Objects.equals(this.notes, totalMobileCometWebApiModelsOfficerRequest.notes) &&
        Objects.equals(this.location, totalMobileCometWebApiModelsOfficerRequest.location) &&
        Objects.equals(this.startingOAName, totalMobileCometWebApiModelsOfficerRequest.startingOAName) &&
        Objects.equals(this.travelMode, totalMobileCometWebApiModelsOfficerRequest.travelMode) &&
        Objects.equals(this.maxTravelDistance, totalMobileCometWebApiModelsOfficerRequest.maxTravelDistance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mobile, welshSpeaker, notes, location, startingOAName, travelMode, maxTravelDistance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TotalMobileCometWebApiModelsOfficerRequest {\n");

    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    welshSpeaker: ").append(toIndentedString(welshSpeaker)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    startingOAName: ").append(toIndentedString(startingOAName)).append("\n");
    sb.append("    travelMode: ").append(toIndentedString(travelMode)).append("\n");
    sb.append("    maxTravelDistance: ").append(toIndentedString(maxTravelDistance)).append("\n");
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
