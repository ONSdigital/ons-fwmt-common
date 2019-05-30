package uk.gov.ons.census.fwmt.common.data.rm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fulfillment {

  private String productCode;

  private UUID caseId;

  private Contact contact;

}
