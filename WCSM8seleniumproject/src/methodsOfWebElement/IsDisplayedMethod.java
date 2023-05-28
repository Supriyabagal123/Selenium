package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 
		   WebDriver driver = new ChromeDriver ();
		   driver.manage().window().maximize();
		   driver.get("https://www.instagram.com/accounts/login/");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    WebElement usnTB = driver.findElement(By.name("username"));
		    if (usnTB.isDisplayed())
		    {
		    	usnTB.sendKeys("Supriya@123");
		    }
		    else
		    {
		    	System.out.println("will get Exception");
		    }
	}
}
