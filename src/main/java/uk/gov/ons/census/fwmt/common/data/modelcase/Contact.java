package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Contact {
  private String name = null;
  private String organisationName = null;
  private String phone = null;
  private String email = null;
}

