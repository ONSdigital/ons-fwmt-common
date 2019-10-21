package uk.gov.ons.census.fwmt.common.data.ccs;

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
public class CCSPropertyListingOutcome {

  @ApiModelProperty(notes = "Unique identifier for the request", required = true)
  private UUID transactionId;

  @ApiModelProperty(notes = "Date/time of the recorded the outcome", example = "2011-08-12T20:17:46.384Z", required = true)
  private LocalDateTime eventDate;

  @ApiModelProperty(notes = "Identifier of the field officer that recorded the outcome", required = true)
  @Size(max = 10)
  private String username;

  @ApiModelProperty(notes = "CaseId of the property listing case - for reference/logging/tracking only", required = true)
  private UUID propertyListingCaseId;

  @ApiModelProperty(notes = "For CCS PL, contains the postcode", required = true)
  private String propertyListingCaseReference;

  @ApiModelProperty(notes = "Primary outcome code, e.g. No Valid Household", required = true)
  private String primaryOutcome;

  @ApiModelProperty(notes = "Secondary outcome code, e.g. Derelict")
  private String secondaryOutcome;

  private Address address;

  @ApiModelProperty(notes = "CE details")
  private CeDetails ceDetails;

  @ApiModelProperty(notes = "Coordinator Code (ID), e.g. CAR1_HA")
  private String coordinatorCode;

  @ApiModelProperty(notes = "Field Officer Code (ID), e.g. CAR1_HA_01")
  private String fieldOfficerCode;

  @ApiModelProperty(notes = "Access/security info")
  private String accessInfo;

  @ApiModelProperty(notes = "Care Codes applied to the case, can be 0, 1 or more of:\n"
      + "Access control\n"
      + "Aggressive animal\n"
      + "Caution required")
  private List<CareCode> careCodes;

  @ApiModelProperty(notes = "List of Fulfilment Requests")
  private List<FulfillmentRequest> fulfillmentRequests = null;

}
