package uk.gov.ons.census.fwmt.common.data.tm;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {
  private Long uprn;
  private Long estabUprn;
  @JsonProperty(required = true) private List<String> lines;
  private String town;
  private String postcode;
  private Geography geography;
}
