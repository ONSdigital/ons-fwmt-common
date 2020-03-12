package uk.gov.ons.census.fwmt.common.data.shared;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.ons.census.fwmt.common.data.spg.Address;
import uk.gov.ons.census.fwmt.common.data.spg.CeDetails;
import uk.gov.ons.census.fwmt.common.data.spg.FulfilmentRequest;

import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class CommonOutcome {

  @ApiModelProperty(notes = "Case is passed into here in gateway to be used internally", hidden = true)
  private UUID caseId;

  @ApiModelProperty(notes = "Unique identifier for the request", required = true)
  private UUID transactionId;

  @ApiModelProperty(notes = "Date/time of the recorded the outcome", example = "2011-08-12T20:17:46.384Z", required = true)
  private LocalDateTime eventDate;

  @ApiModelProperty(notes = "Identifier of the field officer that recorded the outcome", required = true)
  @Size(max = 10)
  private String officerId;

  @ApiModelProperty(notes = "Identifier of the field officer's coordinator Id", required = true)
  @Size(max = 10)
  private String coordinatorId;

  @ApiModelProperty(notes = "Human readable identifier of the case", required = true)
  private String caseReference;

  @ApiModelProperty(notes = "Primary outcome code, e.g. Non Valid Household", required = true)
  private String primaryOutcomeDescription;

  @ApiModelProperty(notes = "Secondary outcome code, e.g. Derelict")
  private String secondaryOutcomeDescription;

  @ApiModelProperty(notes = "The full outcome code in computer format (i.e. s-yy-zz); where s is survey type,"
      + " yy is primary and zz is secondary codes", required = true)
  private String outcomeCode;

  @ApiModelProperty(notes = "Populated with the CE SPG details")
  private CeDetails ceDetails;

  @ApiModelProperty(notes = "Address details for case")
  private Address address;

  @ApiModelProperty(notes = "Access/security info")
  private String accessInfo;

  @ApiModelProperty(notes = "Care Codes applied to the case, can be 0, 1 or more of:\n"
      + "Access control\n"
      + "Aggressive animal\n"
      + "Caution required")
  private List<CareCode> careCodes;

  @ApiModelProperty(notes = "List of fulfillment requests")
  private List<FulfilmentRequest> fulfillmentRequests = null;

}
