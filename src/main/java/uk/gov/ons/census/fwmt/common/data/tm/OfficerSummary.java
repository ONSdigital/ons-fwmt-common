package uk.gov.ons.census.fwmt.common.data.tm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OfficerSummary {
  private String officerIdentifier;
  private String phoneNumber;
  private OffsetDateTime lastSignIn;
  private OfficerState officerState;
  private Boolean welshSpeaker;
  private Boolean officerRetired;
}
