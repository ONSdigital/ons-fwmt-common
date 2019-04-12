package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

/**
 * Pause to apply to a case, the pause can be derived from a Code or an Absolute date.
 */
@Data
@NoArgsConstructor
public class CasePauseRequest extends AbsolutePauseRequest {

  private String reason = null;

  private String code = null;

  private OffsetDateTime effectiveFrom = null;
}
