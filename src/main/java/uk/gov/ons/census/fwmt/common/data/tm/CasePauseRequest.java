package uk.gov.ons.census.fwmt.common.data.tm;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import uk.gov.ons.census.fwmt.common.data.modelcase.AbsolutePauseRequest;

import java.time.OffsetDateTime;

/**
 * Pause to apply to a case, the pause can be derived from a Code or an Absolute date.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CasePauseRequest {
  @JsonProperty(required = true) private OffsetDateTime until;
  private String reason;
  @JsonProperty(required = true) private String code;
  private OffsetDateTime effectiveFrom;
}
