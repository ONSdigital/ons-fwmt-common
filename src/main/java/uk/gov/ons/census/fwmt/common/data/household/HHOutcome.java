package uk.gov.ons.census.fwmt.common.data.household;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.ons.census.fwmt.common.data.shared.CeDetails;
import uk.gov.ons.census.fwmt.common.data.shared.CommonOutcome;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class HHOutcome extends CommonOutcome {

  @ApiModelProperty(notes = "Identifier to the field officer that accompanied the primary officer")
  private String accompanyingOfficerId;

  @ApiModelProperty(notes = "Populated with the CE SPG details")
  private CeDetails ceDetails;

}
