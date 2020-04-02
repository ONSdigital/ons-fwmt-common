package uk.gov.ons.census.fwmt.common.rm.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ActionInstruction {
  private ActionInstructionType actionInstruction;
  private String surveyName;
  private String addressType;
  private String addressLevel;
  private String caseId;
  private String caseRef;
  private String estabType;
  private String fieldOfficerId;
  private String fieldCoordinatorId;
  private String organisationName;
  private String uprn;
  private String addressLine1;
  private String addressLine2;
  private String addressLine3;
  private String townName;
  private String postcode;
  private String oa;
  private Double latitude;
  private Double longitude;
  private boolean ce1Complete;
  private boolean handDeliver;
  private Integer ceExpectedCapacity;
  private Integer ceActualResponses;
  private Boolean undeliveredAsAddress;
  private Boolean blankFormReturned;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Boolean secureEstablishment;


  // display only the details related to request routing
  public String toRoutingString() {
    return "FieldworkFollowup(" +
        "actionInstruction=" + this.actionInstruction + ", " +
        "surveyName=" + this.surveyName + ", " +
        "addressType=" + this.addressType + ", " +
        "addressLevel=" + this.addressLevel + ", " +
        "secureEstablishment=" + this.secureEstablishment + ", " +
        "handDeliver=" + this.handDeliver + ", " +
        "uaa=" + this.uaa + ", " +
        "blankQreReturned=" + this.blankQreReturned + ")";
  }
}