package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CeCaseExtension
 */
@Data
@NoArgsConstructor
public class CeCaseExtension {

  private Boolean ce1Complete = null;

  private Boolean deliveryRequired = null;

  private Integer expectedResponses = null;

  private Integer actualResponses = null;
}
