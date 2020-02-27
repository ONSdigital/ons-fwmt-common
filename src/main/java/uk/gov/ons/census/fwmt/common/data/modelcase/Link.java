package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Link
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Link {

  private String rel;

  private String href;

}
