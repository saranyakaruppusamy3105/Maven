package testNG;

import org.testng.annotations.Test;

public class Priority_Test {
  @Test(priority = 0)
  public void login() {
	  System.out.println("Click the login button");
  }
  @Test(priority =-1 )
  public void password() {
	  System.out.println("Enter the password");
  }
  @Test(priority = 1)
  public void searchhotel() {
	  System.out.println("Search the Hotel");
  }
  @Test(priority =-2)
  public void username() {
	  System.out.println("Enter the username");
  }
  @Test(priority = 2)
  public void selecthotel() {
	  System.out.println("Select the Hotel");
  }
}
