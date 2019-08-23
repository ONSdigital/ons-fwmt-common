package uk.gov.ons.census.fwmt.common.data.ccs;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class Address {

  private String addressLine1;

  private String addressLine2;

  private String addressLine3;

  private String town;

  private String oa;

  private String postCode;

  private Location location;

}
