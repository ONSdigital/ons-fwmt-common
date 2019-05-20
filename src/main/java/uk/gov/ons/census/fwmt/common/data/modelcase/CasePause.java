package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

/**
 * Case pause
 */
@Data
@NoArgsConstructor
public class CasePause {

  private OffsetDateTime until = null;

  private String reason = null;

}
