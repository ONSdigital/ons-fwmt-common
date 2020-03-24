package uk.gov.ons.census.fwmt.common.rm.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// This class is set to mirror uk.gov.ons.census.fwmtadapter.model.dto.DFieldworkFollowup from census-rm-fieldwork-adapter
// https://github.com/ONSdigital/census-rm-fieldwork-adapter/blob/master/src/main/java/uk/gov/ons/census/fwmtadapter/model/dto/FieldworkFollowup.java

// Additions include:
//  actionInstruction
//  secureEstablishment
//  handDeliver
//  uaa

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class FieldworkFollowup {

  private String addressLine1;
  private String addressLine2;
  private String addressLine3;
  private String townName;
  private String postcode;
  private String estabType;
  private String organisationName;
  private String arid;
  private String uprn;
  private String oa;
  private String latitude;
  private String longitude;
  private String actionPlan;
  private String actionType;
  private String caseId;
  private String caseRef;
  private String addressType;
  private String addressLevel;
  private String treatmentCode;
  private String fieldOfficerId;
  private String fieldCoordinatorId;
  private Integer ceExpectedCapacity;
  private Integer ceActualResponses;
  private String surveyName;
  private Boolean undeliveredAsAddress;
  private Boolean blankQreReturned;
  private Boolean receipted;

  private String actionInstruction;
  private Boolean secureEstablishment;
  private Boolean handDeliver;
  private Boolean uaa;

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
