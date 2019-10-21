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

  private UUID id;

  private String reference;

  private TypeEnum type;

  private String surveyType;

  private String category;

  private String estabType;

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

  private CasePause pause;

  private List<Link> _links;

  /**
   * Case Type.
   */
  public enum TypeEnum {
    HH,
    CE,
    CCS
  }

}
