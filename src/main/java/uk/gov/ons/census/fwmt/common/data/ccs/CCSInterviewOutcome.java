package uk.gov.ons.census.fwmt.common.data.ccs;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.ons.census.fwmt.common.data.household.FulfilmentRequest;

import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class CCSInterviewOutcome {

  @ApiModelProperty(notes = "Unique identifier for the request", required = true)
  private UUID transactionId;

  @ApiModelProperty(notes = "Date/time of the recorded the outcome", example = "2011-08-12T20:17:46.384Z", required = true)
  private LocalDateTime eventDate;

  @ApiModelProperty(notes = "Identifier of the field officer that recorded the outcome", required = true)
  @Size(max = 10)
  private String username;

  @ApiModelProperty(notes = "Identifier of the case - this should be the request parameter rather than part of the body", required = true)
  private UUID caseId;

  @ApiModelProperty(notes = "Human readable identifier of the case", required = true)
  private String caseReference;

  @ApiModelProperty(notes = "For CCS Cases, the 'category' on the case  record in COMET is set to either \"HH\" or"
      + " \"CE\" (see XXX #1- canonical-RM adapter mapping)."
      + " This is to enable future differentiation between HH and CE cases where the same secondary outcome may need to"
      + " drive different behaviour.")
  private String category;

  @ApiModelProperty(notes = "Primary outcome code, e.g. No Valid Household", required = true)
  private String primaryOutcome;

  @ApiModelProperty(notes = "Secondary outcome code, e.g. Derelict")
  private String secondaryOutcome;

  @ApiModelProperty(notes = "List of Fulfilment Requests")
  private List<FulfillmentRequest> fulfillmentRequests = null;


}
