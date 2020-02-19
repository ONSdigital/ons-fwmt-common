package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CeCaseExtension
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CeCaseExtension {

  private Boolean ce1Complete = false;

  private Boolean deliveryRequired = false;

  private Integer expectedResponses;

  private Integer actualResponses;

}
