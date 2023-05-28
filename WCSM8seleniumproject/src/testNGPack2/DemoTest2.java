package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest2 {
  @Test
  public void d() {
	  Reporter.log("d method From DemoTest2",true);
  }
  
  @Test
  public void e() {
	  Reporter.log("e method From DemoTest2",true);
  }
  
  @Test
  public void f() {
	  int i=10;
	  int j=5;
	  int res=i/j;
	  Reporter.log("f method From DemoTest2",true);
  }
}

