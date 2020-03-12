package uk.gov.ons.census.fwmt.common.data.ccs;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.ons.census.fwmt.common.data.shared.CareCode;

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

  @ApiModelProperty(notes = "Secondary outcome code, e.g. Derelict", required = true)
  private String secondaryOutcome;

  @ApiModelProperty(notes = "The CCSPropertyListingOutcome must include a child Address object", required = true)
  private Address address;

  @ApiModelProperty(notes = "Coordinator Code (ID), e.g. CAR1_HA", required = true)
  private String coordinatorCode;

  @ApiModelProperty(notes = "Field Officer Code (ID), e.g. CAR1_HA_01 \n"
      + "Duplicate of username, but explicitly called out for clarity in the mapping to the new interview case.",
  required = true)
  private String fieldOfficerCode;

  @ApiModelProperty(notes = "The CCSPropertyListingOutcome may include a child CEDetailobject")
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
  private List<FulfilmentRequest> fulfilmentRequests = null;

}
