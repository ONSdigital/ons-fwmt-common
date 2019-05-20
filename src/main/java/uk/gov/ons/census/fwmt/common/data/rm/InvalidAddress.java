package uk.gov.ons.census.fwmt.common.data.rm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.ons.census.fwmt.common.data.rm.CollectionCase;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "reason",
    "collectionCase"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvalidAddress {

  @JsonProperty("reason")
  private String reason;

  @JsonProperty("collectionCase")
  private CollectionCase collectionCase;

}