package prima.pabam.data;

/**
 * Categories for the learner.
 *
 * @author Lisa Nguyen Quang Do
 * @modifier Feiyang Tang
 *
 */

public enum Category {
    //SOURCE(Constants.SOURCE, false), SINK(Constants.SINK, false), AUTHENTICATION_TO_HIGH(
    //        Constants.AUTHENTICATION_SAFE, false), AUTHENTICATION_TO_LOW(
    //        Constants.AUTHENTICATION_UNSAFE, false), AUTHENTICATION_NEUTRAL(
    //        Constants.AUTHENTICATION_NOCHANGE, false), SANITIZER(Constants.SANITIZER,
    //        false), NONE(Constants.NONE, false),

  //CWE089("CWE089", true),CWE306("CWE306", true), CWE078("CWE078",
  //    true), CWE862("CWE862", true), CWE863("CWE863", 
  //        true), CWE601("CWE601", true), CWETEST("CWEtest", true), CWE079("CWE079",true), CWE_NONE("none", true);
  NONE(Constants.NONE, false),
  SOURCE(Constants.SOURCE, false), 
  SINK(Constants.SINK, false), 
  SANITIZER(Constants.SANITIZER, false),
  CHECKER(Constants.CHECKER, false),
  PERMISSION(Constants.PERMISSION, false),
  AUTHENTICATE(Constants.AUTHENTICATE, false),
  CRYPTO(Constants.CRYPTO, false),
  TERMINATION(Constants.TERMINATION, false),
  INTERACTION(Constants.INTERACTION, false),
  TRANSFER(Constants.TRANSFER, false),
  ACQUISITION(Constants.ACQUISITION, false),
  DELETION(Constants.DELETION, false),
  STORAGE(Constants.STORAGE, false),
  DATABASE(Constants.DATABASE, false),
  BSC1("Biometric Class 1", true),
  BSC2("Biometric Class 2", true),
  BSC3("Biometric Class 3", true);

  private final String id;
  private final boolean cwe;

  private Category(String id, boolean cwe) {
    this.id = id;
    this.cwe = cwe;
  }

  public boolean isCwe() {
    return cwe;
  }

  @Override
  public String toString() {
    return id;
  }

  public static Category getCategoryForCWE(String cweName) {
    for (Category c : Category.values())
      if (c.id.toLowerCase().equals(cweName.toLowerCase()))
        return c;
    return null;
  }
}
