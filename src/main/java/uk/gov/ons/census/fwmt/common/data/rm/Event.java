package uk.gov.ons.census.fwmt.common.data.rm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {

  private UUID transactionId;

  private String type;

  private String source;

  private String channel;

  // "2011-08-12T20:17:46.384Z" example
  private LocalDateTime dateTime;

}
