package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassNameLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeOptions co = new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		  WebDriver driver = new ChromeDriver(co);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		driver.get("https://www.google.com/");
			Thread.sleep(2000);
			driver.switchTo().activeElement().sendKeys("phoebe buffay" , Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.className("lNPNe")).click ();
	}
}
