package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Pause to apply to a case, the pause can be derived from a Code or an Absolute date.
 */
@Data
@NoArgsConstructor
public class CasePauseRequest extends AbsolutePauseRequest {

  private String id = null;

  private OffsetDateTime until = null;

  private String reason = null;

}
