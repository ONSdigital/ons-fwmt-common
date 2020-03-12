package uk.gov.ons.census.fwmt.common.data.household;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class CeDetails {

  @ApiModelProperty(notes = "Name of the CE", required = true)
  @Size(max = 60)
  private String establishmentName;

  @ApiModelProperty(notes = "Type of the establishment", required = true)
  @Size(max = 30)
  private String establishmentType;

  @ApiModelProperty(notes = "Title of the CE Manager e.g. Mr, Mrs")
  @Size(max = 20)
  private String managerTitle;

  @ApiModelProperty(notes = "Forename of the CE Manager")
  @Size(max = 35)
  private String managerForename;

  @ApiModelProperty(notes = "Surname of the CE Manager")
  @Size(max = 35)
  private String managerSurname;

  @ApiModelProperty(notes = "The number of actual responses to be expected from the CE")
  private Integer usualResidents;

  @ApiModelProperty(notes = "Contact number of the CE")
  @Size(max = 13)
  private String contactPhone;

  @ApiModelProperty(notes = "Access/security info")
  private String accessInfo;

  @ApiModelProperty(notes = "Care Codes applied to the case, can be 0, 1 or more of:\n"
      + "Access control\n"
      + "Aggressive animal\n"
      + "Caution required")
  private List<CareCode> careCodes = null;

}
