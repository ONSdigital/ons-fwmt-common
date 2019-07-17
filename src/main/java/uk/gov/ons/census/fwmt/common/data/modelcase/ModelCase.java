package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

/**
 * Case
 */
@Data
@NoArgsConstructor
public class ModelCase {

  private UUID id = null;

  private String reference = null;

  private TypeEnum type = null;

  private String surveyType = null;

  private String category = null;

  private String estabType = null;

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

  private CasePause pause = null;

  private List<Link> _links = null;

  /**
   * Case Type.
   */
  public enum TypeEnum {
    HH("HH"),

    CE("CE"),

    CCSPL("CCSPL"),

    CCSIV("CCSIV");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
  }
}
