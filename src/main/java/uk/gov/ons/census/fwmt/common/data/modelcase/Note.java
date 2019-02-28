package uk.gov.ons.census.fwmt.common.data.modelcase;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class Note {
  private UUID outcomeId = null;
  private UUID noteId = null;
  private String noteContent = null;
  private String dateCreated = null;
}