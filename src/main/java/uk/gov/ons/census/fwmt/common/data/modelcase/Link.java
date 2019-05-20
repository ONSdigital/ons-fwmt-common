package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Link
 */
@Data
@NoArgsConstructor
public class Link {

  private String rel = null;

  private String href = null;

}
