package uk.gov.ons.census.fwmt.common.data.ccs;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class CareCode {

  @ApiModelProperty(notes = "Value of an applied care code on the case, an enumeration of Access control,"
      + " Aggressive animal and Caution required", required = true)
  private String careCode;

}