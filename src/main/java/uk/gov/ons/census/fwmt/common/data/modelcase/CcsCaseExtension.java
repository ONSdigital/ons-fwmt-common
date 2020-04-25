package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CcsCaseExtension
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Deprecated
public class CcsCaseExtension {

  private String questionnaireUrl;

}
