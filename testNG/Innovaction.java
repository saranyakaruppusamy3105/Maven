package testNG;

import org.testng.annotations.Test;

public class Innovaction {
  @Test(invocationCount=3)
  public void login() {
	  System.out.println("Click on the login button");
	  }
  
  @Test
  public void searchhotel() {
	  System.out.println("Search the Hotel");
  }
  @Test(invocationCount=2)
  public void selecthotel() {
	  System.out.println("Select the Hotel");
  }
}
