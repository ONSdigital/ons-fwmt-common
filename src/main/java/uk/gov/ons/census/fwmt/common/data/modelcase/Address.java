package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Address
 */
@Data
@NoArgsConstructor
public class Address {

  private Long uprn = null;

  private List<String> lines = new ArrayList<>();

  private String town = null;

  private String postcode = null;

  private Geography geography = null;
}
