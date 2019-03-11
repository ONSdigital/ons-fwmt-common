package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 * TotalMobileCometWebApiModelsOfficerObservations
 */
@Data
@NoArgsConstructor
public class TotalMobileCometWebApiModelsOfficerObservations {
  private UUID observationId = null;
  private String note = null;
  private OffsetDateTime date = null;

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TotalMobileCometWebApiModelsOfficerObservations totalMobileCometWebApiModelsOfficerObservations = (TotalMobileCometWebApiModelsOfficerObservations) o;
    return Objects.equals(this.observationId, totalMobileCometWebApiModelsOfficerObservations.observationId) &&
        Objects.equals(this.note, totalMobileCometWebApiModelsOfficerObservations.note) &&
        Objects.equals(this.date, totalMobileCometWebApiModelsOfficerObservations.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(observationId, note, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TotalMobileCometWebApiModelsOfficerObservations {\n");

    sb.append("    observationId: ").append(toIndentedString(observationId)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
