package uk.gov.ons.census.fwmt.common.data.modelcase;

import java.util.List;
import java.util.UUID;

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

  @Builder.Default
  private boolean uaa = false;

  @Builder.Default
  private boolean blankFormReturned = false;

  @Builder.Default
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
    CCS,
    AC
  }

}
