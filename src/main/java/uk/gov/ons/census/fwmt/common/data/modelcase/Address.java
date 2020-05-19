package uk.gov.ons.census.fwmt.common.data.modelcase;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Address
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Deprecated
public class Address {

  private Long uprn;

  private Long estabUprn;

  private List<String> lines;

  private String town;

  private String postcode;

  private Geography geography;

  private String addressType;

  private String estabType;

  private String orgName;

}
