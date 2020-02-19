package uk.gov.ons.census.fwmt.common.data.modelcase;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Location
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {

  private Float lat;

  @JsonProperty("long")
  private Float _long;

}
