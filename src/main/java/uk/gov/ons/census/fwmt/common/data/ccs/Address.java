package uk.gov.ons.census.fwmt.common.data.ccs;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
@ToString
public class Address {

  private String addressLine1;

  private String addressLine2;

  private String addressLine3;

  private String town;

  private String oa;

  private String postCode;

  @ApiModelProperty(notes = "The Address must include a child Location object")
  private Location location;

}
