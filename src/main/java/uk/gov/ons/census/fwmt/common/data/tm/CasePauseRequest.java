package uk.gov.ons.census.fwmt.common.data.tm;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * Pause to apply to a case.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CasePauseRequest {
  @JsonProperty(required = true)
  private String code;
  private Timestamp effectiveFrom;
  private String reason;
}
