package uk.gov.ons.census.fwmt.common.data.household;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uk.gov.ons.census.fwmt.common.data.shared.CommonOutcome;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class HHNewSplitAddress extends CommonOutcome {
}
