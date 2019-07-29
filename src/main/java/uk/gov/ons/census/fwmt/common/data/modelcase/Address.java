package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Address
 */
@Data
@NoArgsConstructor
public class Address {

  private Long uprn;

  private List<String> lines;

  private String town;

  private String postcode;

  private Geography geography;

  private String addressType;

  private String estabType;

  private String orgName;

}
