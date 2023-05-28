package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
	
  @Test(description = "Login Testcase")
  public void loginMethod() {
	  Reporter.log("Login Performed",true);
  }
  
  @Test(description = "Create User Testcase",dependsOnMethods = "loginMethod")
  public void createUser() {
	  Reporter.log("User Created",true);
  }
  
  @Test(description = "Logout Testcase",dependsOnMethods = "createUser")
  public void logoutMethod() {
	  Reporter.log("Logout Performed",true);
  }
}
