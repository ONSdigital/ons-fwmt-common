package uk.gov.ons.census.fwmt.common.data.household;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import uk.gov.ons.census.fwmt.common.data.shared.CommonOutcome;

import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@ApiModel
@ToString(callSuper = true)
public class HHNewSplitAddress extends CommonOutcome {

  @ApiModelProperty(notes = "The original case Id that has/will be split ")
  private UUID originatingCaseId;

}
