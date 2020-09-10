package uk.gov.ons.census.fwmt.common.data.ccs;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
@ToString
public class FulfillmentRequest {

  @ApiModelProperty(notes = "Scanned from paper app", required = true)
  @Size(max = 16)
  private String questionnaireID;

}
