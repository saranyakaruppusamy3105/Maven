package testNG;

import org.testng.annotations.Test;

public class Groupsofgroup {
  @Test(groups="degree")
  public void pg() {
	  System.out.println("PG");
  }
  @Test(groups="degree")
  public void ug() {
	  System.out.println("UG");
  }
  @Test(groups="Testingcourse")
  public void java() {
	  System.out.println("Java");
  }
  @Test(groups="Testingcourse")
  public void selenium() {
	  System.out.println("Selenium");
  }
  @Test(groups="Backendcourse")
  public void aws() {
	  System.out.println("AWS");
  }
  @Test(groups="Backendcourse")
  public void sap() {
	  System.out.println("SAP");
  }
}
