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
public class CaseRequest {

  private String reference;

  private TypeEnum type;

  private String surveyType;

  private String category;

  private String estabType;

  private String requiredOfficer;

  private String coordCode;

  private Contact contact;

  private Address address;

  private Location location;

  private String description;

  private String specialInstructions;

  private boolean uaa = false;

  private boolean blankFormReturned = false;

  private boolean sai = false;

  private CeCaseExtension ce;

  private CcsCaseExtension ccs;

  private CasePauseRequest pause;

  /**
   * Case Type.
   */
  public enum TypeEnum {
    SPG_SITE,
    HH,
    CE,
    CCS,
    AC
  }

}
