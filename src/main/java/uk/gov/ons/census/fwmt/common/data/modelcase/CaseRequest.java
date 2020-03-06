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

  private Type type;

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

  @Builder.Default
  private boolean uaa = false;

  @Builder.Default
  private boolean blankFormReturned = false;

  @Builder.Default
  private boolean sai = false;

  private CeCaseExtension ce;

  private CcsCaseExtension ccs;

  private CasePauseRequest pause;

  /**
   * Case Type.
   */
  public enum Type {
    HH,
    CE,
    CCS,
    AC;
  }

  public enum SurveyType {
    HH("HH"),
    CE_EST("CE EST"),
    CE_UNIT("CE UNIT"),
    CCS_PL("CCS PL"),
    CCS_INT("CCS INT"),
    AC("AC"),
    SPG_Site("SPG Site"),
    SPG_Secure_Site(null),
    SPG_Unit_D("SPG Unit-D"),
    SPG_Unit_F("SPG Unit-F");

    public final String name;

    SurveyType(String name) {
      this.name = name;
    }

    @Override public String toString() {
      return name;
    }
  }
}
