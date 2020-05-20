package uk.gov.ons.census.fwmt.common.data.tm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkingAreaSlim {
  private OutputArea outputArea;
  private Float maximumTravelRadius;
  private TravelMode travelMode;
}
