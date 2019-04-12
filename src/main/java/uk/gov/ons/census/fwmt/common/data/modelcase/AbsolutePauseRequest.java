package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

/**
 * Absolute pause.
 */
@Data
@NoArgsConstructor
public class AbsolutePauseRequest {

  private OffsetDateTime until = null;

  private String reason = null;
}
