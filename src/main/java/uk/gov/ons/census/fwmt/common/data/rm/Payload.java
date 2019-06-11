package uk.gov.ons.census.fwmt.common.data.rm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payload {

  private InvalidAddress invalidAddress;

  private Refusal refusal;

  private Uac uac;

  private Fulfillment fulfillment;

  private Contact contact;

  private CollectionCase collectionCase;

}
