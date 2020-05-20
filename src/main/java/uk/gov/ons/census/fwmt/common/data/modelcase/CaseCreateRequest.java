package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Case
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Deprecated
public class CaseCreateRequest {

  private String reference;
  private CaseType type;
  private SurveyType surveyType;
  private String category;
  private String estabType;
  private String requiredOfficer;
  private String coordCode;
  private Contact contact;
  private Address address;
  private Location location;
  private String description;
  private String specialInstructions;
  @Builder.Default private boolean uaa = false;
  @Builder.Default private boolean blankFormReturned = false;
  @Builder.Default private boolean sai = false;
  private CeCaseExtension ce;
  private CcsCaseExtension ccs;
  private CasePauseRequest pause;

}
