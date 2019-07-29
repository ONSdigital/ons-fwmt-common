package uk.gov.ons.census.fwmt.common.data.household;

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

  @ApiModelProperty(notes = "H1/HC1/I1, plus other values for languages - H4/I4 for NI", required = true)
  @Size(max = 16)
  private String questionnaireType;

  @ApiModelProperty(notes = "Scanned from paper app")
  @Size(max = 16)
  private String questionnaireId;

  @ApiModelProperty(notes = "For posting paper I forms (H/H1 can be addressed to household)")
  @Size(max = 20)
  private String requesterTitle;

  @ApiModelProperty(notes = "For posting paper I forms (H/H1 can be addressed to household)")
  @Size(max = 35)
  private String requesterForename;

  @ApiModelProperty(notes = "For posting paper I forms (H/H1 can be addressed to household)")
  @Size(max = 35)
  private String requesterSurname;

  @ApiModelProperty(notes = "For texting UACs")
  @Size(max = 13)
  private String requesterPhone;

}