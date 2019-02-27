package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class Warning {
  private UUID outcomeId = null;
  private UUID warningId = null;
  private String warningContent = null;
  private String dateCreated = null;

}

