package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	// to perform enabled or disabled
	
  @Test(enabled = true,description = "Login method")
  public void method1() {
	  Reporter.log("login performed!!",true);
  }
  
  @Test(enabled = true,description = "Logout method")
  public void method2() {
	  Reporter.log("logout performed!!",true);
  }
  
}
