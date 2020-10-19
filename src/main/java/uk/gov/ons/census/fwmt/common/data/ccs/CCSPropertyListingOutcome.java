package uk.gov.ons.census.fwmt.common.data.ccs;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import uk.gov.ons.census.fwmt.common.data.shared.CeDetails;
import uk.gov.ons.census.fwmt.common.data.shared.CommonOutcome;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
@ToString
public class CCSPropertyListingOutcome {

  @ApiModelProperty(notes = "Unique identifier for the request", required = true)
  private UUID transactionId;
public class CCSPropertyListingOutcome extends CommonOutcome {

  @ApiModelProperty(notes = "Flag to indicate whether Dummy Information has been collected")
  private Boolean dummyInfoCollected;

  @ApiModelProperty(notes = "Populated with the CE SPG details")
  private CeDetails ceDetails;

  @ApiModelProperty(notes = "Access/security info - not used for 2019;\n"
      + " pre-empting the need to be able to create a CE case from a HH case in 2021.")
  private String accessInfo;

  @ApiModelProperty(notes = "Care Codes applied to the case, can be 0, 1 or more of:\n"
      + "Access control\n"
      + "Aggressive animal\n"
      + "Caution required")
  private List<CareCode> careCodes;

  @ApiModelProperty(notes = "The CCSPropertyListingOutcome may include a child FulfillmentRequest object.")
  private List<FulfillmentRequest> fulfilmentRequests = null;

}
