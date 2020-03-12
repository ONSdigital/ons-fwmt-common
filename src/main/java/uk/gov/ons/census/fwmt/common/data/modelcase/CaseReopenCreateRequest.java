package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CaseReopenCreateRequest {
  private final String id;
  private final SurveyType surveyType;
  private final Boolean uaa;
  private final Boolean blankFormReturned;
}
