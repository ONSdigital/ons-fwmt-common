package uk.gov.ons.census.fwmt.common.rm.dto;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder(toBuilder = true)
public abstract class FwmtSuperInstruction {
  ActionInstructionType actionInstruction;
  String surveyName;
  String caseId;

  protected FwmtSuperInstruction() {
  }

  public abstract String toRoutingString();
}
