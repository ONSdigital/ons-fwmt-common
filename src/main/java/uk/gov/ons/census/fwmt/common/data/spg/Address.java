package uk.gov.ons.census.fwmt.common.data.spg;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class Address {

  @ApiModelProperty(notes = "Address line 1")
  private String addressLine1;

  @ApiModelProperty(notes = "Address line 2")
  private String addressLine2;

  @ApiModelProperty(notes = "Address line 3")
  private String addressLine3;

  @ApiModelProperty(notes = "Locality (town)")
  private String locality;

  @ApiModelProperty(notes = "Postcode")
  private String postCode;

  @ApiModelProperty(notes = "Latitude", required = true)
  private BigDecimal latitude;

  @ApiModelProperty(notes = "Longitude", required = true)
  private BigDecimal longitude;

}
