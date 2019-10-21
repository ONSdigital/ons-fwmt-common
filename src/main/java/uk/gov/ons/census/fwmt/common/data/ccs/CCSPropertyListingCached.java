package uk.gov.ons.census.fwmt.common.data.ccs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CCSPropertyListingCached {

  private String allocatedOfficer;

  private String primaryOutcome;

  private String secondaryOutcome;

  private String oa;

  private String managerName;

  private Integer usualResidents;

  private Integer bedspaces;

  private String contactPhone;

  private String accessInfo;

  private List<CareCode> careCodes;

}
