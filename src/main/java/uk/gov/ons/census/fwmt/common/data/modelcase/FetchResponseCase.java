package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class FetchResponseCase {
  private List<ModelCase> results = new ArrayList<>();
  private PagingInfo paging = null;
  private FetchCriteria criteria = null;

}

