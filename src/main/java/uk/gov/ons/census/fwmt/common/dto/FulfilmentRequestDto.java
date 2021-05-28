package uk.gov.ons.census.fwmt.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class  FulfilmentRequestDto {
  private String questionnaireType;
  private String questionnaireID;
  private String requesterTitle;
  private String requesterForename;
  private String requesterSurname;
  private String requesterPhone;
}