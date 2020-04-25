package uk.gov.ons.census.fwmt.common.data.tm;

public enum SurveyType {
  HH("HH"),
  CE_EST("CE EST"),
  CE_UNIT("CE UNIT"),
  CCS_PL("CCS PL"),
  CCS_INT("CCS INT"),
  AC("AC"),
  SPG_Site("SPG Site"),
  SPG_Secure_Site(null),
  SPG_Unit_D("SPG Unit-D"),
  SPG_Unit_F("SPG Unit-F");

  public final String name;

  SurveyType(String name) {
    this.name = name;
  }

  @Override public String toString() {
    return name;
  }
}
