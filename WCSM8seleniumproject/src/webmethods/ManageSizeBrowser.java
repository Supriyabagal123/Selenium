package webmethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ManageSizeBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","./drivers/chromedriver.exe");

		 ChromeOptions co = new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		  WebDriver driver = new ChromeDriver(co);
		  driver.manage().window().maximize();
		  
		Dimension targetSize= new Dimension(350,450);
		Thread.sleep(2000);
		driver.manage().window().setSize(targetSize);
	}
}
// manage method is used to set the size of browser