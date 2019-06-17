package uk.gov.ons.census.fwmt.common.data.rm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.ons.census.fwmt.common.data.modelcase.Address;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CollectionCase {

  private UUID id;

  private int ceExpectedResponses;

  private Address address;

}