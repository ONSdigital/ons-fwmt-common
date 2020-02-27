package uk.gov.ons.census.fwmt.common.data.modelcase;

import java.time.OffsetDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Case pause
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CasePause {

  private OffsetDateTime until;

  private String reason;

}
