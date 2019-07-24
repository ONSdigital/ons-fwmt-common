package uk.gov.ons.census.fwmt.common.data.modelcase;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Location
 */
@Data
@NoArgsConstructor
public class Location {

  private Float lat;

  @JsonProperty("long")
  private Float _long;

}
