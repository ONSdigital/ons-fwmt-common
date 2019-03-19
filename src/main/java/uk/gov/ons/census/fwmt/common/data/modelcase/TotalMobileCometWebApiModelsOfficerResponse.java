package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * TotalMobileCometWebApiModelsOfficerResponse
 */
@Data
@NoArgsConstructor
public class TotalMobileCometWebApiModelsOfficerResponse {
  private UUID id = null;
  private TotalMobileCometWebApiModelsOfficerStartingLocation startingLocation = null;
  private Double contractedHours = null;
  private TotalMobileCometWebApiModelsOfficerSummary summary = null;
  private List<TotalMobileCometWebApiModelsOfficerObservations> observations = null;

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TotalMobileCometWebApiModelsOfficerResponse totalMobileCometWebApiModelsOfficerResponse = (TotalMobileCometWebApiModelsOfficerResponse) o;
    return Objects.equals(this.id, totalMobileCometWebApiModelsOfficerResponse.id) &&
        Objects.equals(this.startingLocation, totalMobileCometWebApiModelsOfficerResponse.startingLocation) &&
        Objects.equals(this.contractedHours, totalMobileCometWebApiModelsOfficerResponse.contractedHours) &&
        Objects.equals(this.summary, totalMobileCometWebApiModelsOfficerResponse.summary) &&
        Objects.equals(this.observations, totalMobileCometWebApiModelsOfficerResponse.observations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startingLocation, contractedHours, summary, observations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TotalMobileCometWebApiModelsOfficerResponse {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startingLocation: ").append(toIndentedString(startingLocation)).append("\n");
    sb.append("    contractedHours: ").append(toIndentedString(contractedHours)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    observations: ").append(toIndentedString(observations)).append("\n");
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
