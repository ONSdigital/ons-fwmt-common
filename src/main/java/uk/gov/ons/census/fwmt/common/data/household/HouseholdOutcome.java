package uk.gov.ons.census.fwmt.common.data.household;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class HouseholdOutcome {

  @ApiModelProperty(notes = "Unique identifier for the request", required = true)
  private UUID transactionId;

  @ApiModelProperty(notes = "Date/time of the recorded the outcome", example = "2011-08-12T20:17:46.384Z", required = true)
  private LocalDateTime eventDate;

  @ApiModelProperty(notes = "Identifier of the field officer that recorded the outcome", required = true)
  @Size(max = 10)
  private String username;

  // Remove from object and instead pass from POST param
  @ApiModelProperty(notes = "Identifier of the case")
  private UUID caseId;

  @ApiModelProperty(notes = "Human readable identifier of the case", required = true)
  private String caseReference;

  @ApiModelProperty(notes = "Primary outcome code, e.g. No Valid Household", required = true)
  private String primaryOutcome;

  @ApiModelProperty(notes = "Secondary outcome code, e.g. Derelict")
  private String secondaryOutcome;

  @ApiModelProperty(notes = "CE details")
  private CeDetails ceDetails;

  @ApiModelProperty(notes = "List of Fulfilment Request objects")
  private List<FulfilmentRequest> fulfillmentRequests = null;

}
