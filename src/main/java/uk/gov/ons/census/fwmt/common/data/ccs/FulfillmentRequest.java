package uk.gov.ons.census.fwmt.common.data.ccs;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class FulfillmentRequest {

  @ApiModelProperty(notes = "Scanned from paper app")
  @Size(max = 16)
  private String questionnaireId;

}
