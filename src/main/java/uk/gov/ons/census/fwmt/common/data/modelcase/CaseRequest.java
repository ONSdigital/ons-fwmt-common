package uk.gov.ons.census.fwmt.common.data.modelcase;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

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
  private String coordCode = null;
  private Contact contact = null;
  private Address address = null;
  private Location location = null;
  private String description = null;
  private String specialInstructions = null;
  private Boolean uaa = false;
  private Boolean sai = false;
  private CeCaseExtension ce = null;
  private CcsCaseExtension ccs = null;
  private CasePauseRequest pause = null;

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseRequest caseRequest = (CaseRequest) o;
    return Objects.equals(this.reference, caseRequest.reference) &&
        Objects.equals(this.type, caseRequest.type) &&
        Objects.equals(this.surveyType, caseRequest.surveyType) &&
        Objects.equals(this.category, caseRequest.category) &&
        Objects.equals(this.estabType, caseRequest.estabType) &&
        Objects.equals(this.coordCode, caseRequest.coordCode) &&
        Objects.equals(this.contact, caseRequest.contact) &&
        Objects.equals(this.address, caseRequest.address) &&
        Objects.equals(this.location, caseRequest.location) &&
        Objects.equals(this.description, caseRequest.description) &&
        Objects.equals(this.specialInstructions, caseRequest.specialInstructions) &&
        Objects.equals(this.uaa, caseRequest.uaa) &&
        Objects.equals(this.sai, caseRequest.sai) &&
        Objects.equals(this.ce, caseRequest.ce) &&
        Objects.equals(this.ccs, caseRequest.ccs) &&
        Objects.equals(this.pause, caseRequest.pause);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(reference, type, surveyType, category, estabType, coordCode, contact, address, location, description,
            specialInstructions, uaa, sai, ce, ccs, pause);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseRequest {\n");

    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    surveyType: ").append(toIndentedString(surveyType)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    estabType: ").append(toIndentedString(estabType)).append("\n");
    sb.append("    coordCode: ").append(toIndentedString(coordCode)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    specialInstructions: ").append(toIndentedString(specialInstructions)).append("\n");
    sb.append("    uaa: ").append(toIndentedString(uaa)).append("\n");
    sb.append("    sai: ").append(toIndentedString(sai)).append("\n");
    sb.append("    ce: ").append(toIndentedString(ce)).append("\n");
    sb.append("    ccs: ").append(toIndentedString(ccs)).append("\n");
    sb.append("    pause: ").append(toIndentedString(pause)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Case Type.
   */
  public enum TypeEnum {
    HH("HH"),

    CE("CE"),

    CCS("CCS");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }
}
