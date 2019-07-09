package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Case
 */
@Data
@NoArgsConstructor
public class CaseRequest {

  private String reference = null;

  private TypeEnum type = null;

  private String surveyType = null;

  private String category = null;

  private String estabType = null;

  private String requiredOfficer = null;

  private String coordCode = null;

  private Contact contact = null;

  private Address address = null;

  private Location location = null;

  private String description = null;

  private String specialInstructions = null;

  private boolean uaa = false;

  private boolean blankFormReturned;

  private boolean sai = false;

  private CeCaseExtension ce = null;

  private CcsCaseExtension ccs = null;

  private CasePauseRequest pause = null;

  /**
   * Case Type.
   */
  public enum TypeEnum {
    HH("HH"),

    CE("CE"),

    CCSPL("CCSPL");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
  }
}
