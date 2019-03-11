package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * FetchResponseTotalMobileCometWebApiModelsOfficerResponse
 */
@Data
@NoArgsConstructor
public class FetchResponseTotalMobileCometWebApiModelsOfficerResponse {
  private List<TotalMobileCometWebApiModelsOfficerResponse> results = new ArrayList<>();
  private PagingInfo paging = null;
  private FetchCriteria criteria = null;

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FetchResponseTotalMobileCometWebApiModelsOfficerResponse fetchResponseTotalMobileCometWebApiModelsOfficerResponse = (FetchResponseTotalMobileCometWebApiModelsOfficerResponse) o;
    return Objects.equals(this.results, fetchResponseTotalMobileCometWebApiModelsOfficerResponse.results) &&
        Objects.equals(this.paging, fetchResponseTotalMobileCometWebApiModelsOfficerResponse.paging) &&
        Objects.equals(this.criteria, fetchResponseTotalMobileCometWebApiModelsOfficerResponse.criteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, paging, criteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FetchResponseTotalMobileCometWebApiModelsOfficerResponse {\n");

    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
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
