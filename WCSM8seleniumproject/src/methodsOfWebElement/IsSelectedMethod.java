package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 
		   WebDriver driver = new ChromeDriver ();
		   driver.manage().window().maximize();
		   driver.get("http://127.0.0.1/login.do");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		  WebElement checkBox = driver.findElement(By.name("remember"));
		  boolean verify = checkBox.isSelected();
		  System.out.println(verify);
		  Thread.sleep(2000);
		  checkBox.click();
		  boolean verify1 = checkBox.isSelected();
		  System.out.println(verify1);
	}
}
