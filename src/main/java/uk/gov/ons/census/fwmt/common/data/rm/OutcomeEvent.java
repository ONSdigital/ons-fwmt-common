package uk.gov.ons.census.fwmt.common.data.rm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OutcomeEvent {

  private Event event;

  private Payload payload;

}
