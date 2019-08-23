package uk.gov.ons.census.fwmt.common.data.ccs;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class CCSPropertyListingCached {

  @ApiModelProperty(notes = "Primary outcome code, e.g. No Valid Household", required = true)
  private String primaryOutcome;

  @ApiModelProperty(notes = "Secondary outcome code, e.g. Derelict")
  private String secondaryOutcome;

  private String oa;

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

  @ApiModelProperty(notes = "Access/security info")
  private String accessInfo;

  @ApiModelProperty(notes = "Care Codes applied to the case, can be 0, 1 or more of:\n"
      + "Access control\n"
      + "Aggressive animal\n"
      + "Caution required")
  private List<CareCode> careCodes;

}
