package testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameterized_Demo {
  @Test 
  @Parameters({"uName","password"})
  public void login(@Optional("xyz")String uName, String password) {
	  System.out.println("Enter the username:"+ uName);
	  System.out.println("Enter the password:"+ password);

	  
  }
  
}
