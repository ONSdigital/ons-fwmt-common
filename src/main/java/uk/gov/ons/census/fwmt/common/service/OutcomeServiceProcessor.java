package uk.gov.ons.census.fwmt.common.service;

import uk.gov.ons.census.fwmt.common.dto.OutcomeSuperSetDto;
import uk.gov.ons.census.fwmt.common.error.GatewayException;

import java.util.UUID;

public interface OutcomeServiceProcessor {
  UUID process(OutcomeSuperSetDto outcome, UUID caseIdHolder, String type) throws GatewayException;
}
