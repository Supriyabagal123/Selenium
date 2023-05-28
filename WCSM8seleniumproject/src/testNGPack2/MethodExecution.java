package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodExecution {
  @Test
  public void method1() {
	  long threadID = Thread.currentThread().getId();
	  Reporter.log(threadID +": is a thread ID of method1",true);
	  Reporter.log("method1",true);
  }
  
  @Test
  public void method2() {
	  long threadID = Thread.currentThread().getId();
	  Reporter.log(threadID +": is a thread ID of method2",true);
	  Reporter.log("method2",true);
  }
}
