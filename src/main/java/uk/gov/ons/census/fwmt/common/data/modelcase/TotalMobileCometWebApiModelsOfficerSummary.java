package uk.gov.ons.census.fwmt.common.data.modelcase;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * TotalMobileCometWebApiModelsOfficerSummary
 */
@Data
@NoArgsConstructor
public class TotalMobileCometWebApiModelsOfficerSummary {
  private String officerIdentifier = null;
  private String phoneNumber = null;
  private OffsetDateTime lastSignIn = null;
  private OfficerStateEnum officerState = null;
  private Boolean welshSpeaker = null;

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TotalMobileCometWebApiModelsOfficerSummary totalMobileCometWebApiModelsOfficerSummary = (TotalMobileCometWebApiModelsOfficerSummary) o;
    return Objects.equals(this.officerIdentifier, totalMobileCometWebApiModelsOfficerSummary.officerIdentifier) &&
        Objects.equals(this.phoneNumber, totalMobileCometWebApiModelsOfficerSummary.phoneNumber) &&
        Objects.equals(this.lastSignIn, totalMobileCometWebApiModelsOfficerSummary.lastSignIn) &&
        Objects.equals(this.officerState, totalMobileCometWebApiModelsOfficerSummary.officerState) &&
        Objects.equals(this.welshSpeaker, totalMobileCometWebApiModelsOfficerSummary.welshSpeaker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(officerIdentifier, phoneNumber, lastSignIn, officerState, welshSpeaker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TotalMobileCometWebApiModelsOfficerSummary {\n");

    sb.append("    officerIdentifier: ").append(toIndentedString(officerIdentifier)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    lastSignIn: ").append(toIndentedString(lastSignIn)).append("\n");
    sb.append("    officerState: ").append(toIndentedString(officerState)).append("\n");
    sb.append("    welshSpeaker: ").append(toIndentedString(welshSpeaker)).append("\n");
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
   * Gets or Sets officerState
   */
  public enum OfficerStateEnum {
    ACTIVE("Active"),

    INACTIVE("Inactive");

    private String value;

    OfficerStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OfficerStateEnum fromValue(String text) {
      for (OfficerStateEnum b : OfficerStateEnum.values()) {
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
