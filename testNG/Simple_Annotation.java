package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Simple_Annotation {
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Pay Fees");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("BE Course joined");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Select Course");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("1st year Completed");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Course Details");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("2nd year Started");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Collage Details");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("2nd year Completed");
  }

}
