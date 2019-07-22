package uk.gov.ons.census.fwmt.common.data.ccs;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class Location {

  private BigDecimal lat;

  @JsonProperty("long")
  private BigDecimal _long;

}
