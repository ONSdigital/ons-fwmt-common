package uk.gov.ons.census.fwmt.common.data.tm;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
  private Date effectiveFrom;
  private String reason;
}
