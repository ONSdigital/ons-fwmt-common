package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Contact
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {

  private String name = "The Occupier";

  private String organisationName;

  private String phone;

  private String email;
}
