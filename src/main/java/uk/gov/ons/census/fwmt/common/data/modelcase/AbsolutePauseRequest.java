package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

/**
 * Absolute pause.
 */
@Data
@NoArgsConstructor
@Deprecated
public class AbsolutePauseRequest {

  private OffsetDateTime until;

  private String reason;

}
