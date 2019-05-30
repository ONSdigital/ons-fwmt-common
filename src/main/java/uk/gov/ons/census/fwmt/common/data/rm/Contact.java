package uk.gov.ons.census.fwmt.common.data.rm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact {

  private String title;

  private String forename;

  private String surname;

  private String email;

  private String telNo;

}

