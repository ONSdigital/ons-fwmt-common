package uk.gov.ons.census.fwmt.common.rm.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import uk.gov.ons.census.fwmt.common.data.tm.SurveyType;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FwmtActionInstruction extends FwmtSuperInstruction {
  private String addressType;
  private String addressLevel;
  private String caseRef;
  private String estabType;
  private String fieldOfficerId;
  private String fieldCoordinatorId;
  private String organisationName;
  private String uprn;
  private String estabUprn;
  private String addressLine1;
  private String addressLine2;
  private String addressLine3;
  private String townName;
  private String postcode;
  private String oa;
  private Double latitude;
  private Double longitude;
  private boolean ce1Complete = false;
  private boolean handDeliver = false;
  private Integer ceExpectedCapacity = 0;
  private Integer ceActualResponses = 0;
  private boolean undeliveredAsAddress = false;
  private boolean blankFormReturned = false;
  private boolean secureEstablishment = false;
  private SurveyType surveyType;


  // display only the details related to request routing
  public String toRoutingString() {
    return "FieldworkFollowup(" +
        "actionInstruction=" + this.actionInstruction + ", " +
        "surveyName=" + this.surveyName + ", " +
        "addressType=" + this.addressType + ", " +
        "addressLevel=" + this.addressLevel + ", " +
        "secureEstablishment=" + this.secureEstablishment + ", " +
        "handDeliver=" + this.handDeliver + ", " +
        "undeliveredAsAddress=" + this.undeliveredAsAddress + ", " +
        "blankFormReturned=" + this.blankFormReturned + ")";
  }
}