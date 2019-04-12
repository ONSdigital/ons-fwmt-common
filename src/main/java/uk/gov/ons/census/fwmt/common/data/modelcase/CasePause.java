package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Case pause
 */
@Data
@NoArgsConstructor
public class CasePause {

  private OffsetDateTime until = null;

  private String reason = null;

  private List<Link> _links = null;
}
