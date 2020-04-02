package uk.gov.ons.census.fwmt.common.rm.dto;

import lombok.Data;

@Data
public class FwmtCancelActionInstruction {
  private ActionInstructionType actionInstruction;
  private String surveyName;
  private String addressType;
  private String addressLevel;
  private String caseId;
  private Integer ceExpectedCapacity;
  private Integer ceActualResponses;


  // display only the details related to request routing
  public String toRoutingString() {
    return "FwmtCancelActionInstruction(" +
        "actionInstruction=" + this.actionInstruction + ", " +
        "surveyName=" + this.surveyName + ", " +
        "addressType=" + this.addressType + ", " +
        "addressLevel=" + this.addressLevel + ")";
  }
}
