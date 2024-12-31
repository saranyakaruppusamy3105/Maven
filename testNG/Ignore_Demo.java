package testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Demo {
  @Test
  public void login() {
	  System.out.println("Login");
  }
  @Test
  public void searchhotel() {
	  System.out.println("Search the Hotel");

}
  @Test(enabled=false)
  public void selecthotel() {
	  System.out.println("Select the Hotel");

}
  @Test
  @Ignore
  public void logout() {
	  System.out.println("Logout");

}
  
}
         