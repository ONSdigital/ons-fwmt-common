package uk.gov.ons.census.fwmt.common.data.ccs;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class CeDetails {

  @ApiModelProperty(notes = "Type of the establishment", required = true)
  @Size(max = 30)
  private String establishmentType;

  @ApiModelProperty(notes = "Name of the establishment", required = true)
  @Size(max = 60)
  private String organisationName;

  @ApiModelProperty(notes = "Title of the CE Manager e.g. Mr, Mrs - only used to add to case created in RM,"
      + " hence not needed to be  broken down to title, forename, surname.")
  private String managerName;

  @ApiModelProperty(notes = "The number of actual responses to be expected from the CE")
  private Integer usualResidents;

  @ApiModelProperty(notes = "The number of bedspaces in the CE")
  private Integer bedspaces;

  @ApiModelProperty(notes = "Contact number of the CE")
  @Size(max = 13)
  private String contactPhone;

}
