package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickMethod {
	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 
		   WebDriver driver = new ChromeDriver ();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("https://www.selenium.dev/downloads/");
		   WebElement target = driver.findElement(By.xpath("//a[.='4.9.0']"));
		   Actions act = new Actions(driver);
		   act.contextClick(target).perform();
	}
}
