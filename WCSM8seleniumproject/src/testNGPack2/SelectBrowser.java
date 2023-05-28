package testNGPack2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class SelectBrowser {
	
	@Test
	@Parameters("browser")
  
  public void method1(String browser) {
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		}
		else
		{
			System.out.println("invalid browser value");
		}
  }
}
