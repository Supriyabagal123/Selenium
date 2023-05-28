package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 
		   WebDriver driver = new ChromeDriver ();
		   driver.manage().window().maximize();
		   driver.get("https://www.instagram.com/accounts/login/");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		  WebElement loginButton = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		  boolean verifyButton = loginButton.isEnabled();
		  System.out.println(verifyButton);
		  driver.findElement(By.name("username")).sendKeys("Supriya@123");
		  driver.findElement(By.name("password")).sendKeys("Suppu@123");
		  boolean verify = loginButton.isEnabled();
		  System.out.println(verify);
	}

}
