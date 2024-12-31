package testNG;

import org.testng.annotations.Test;

public class DependsOnMethod {
  @Test
  public void login() {
	  System.out.println("Login");
  }
  @Test(dependsOnMethods = "login")
  public void searchhotel() {
	  System.out.println("Search the Hotel");

}
}
