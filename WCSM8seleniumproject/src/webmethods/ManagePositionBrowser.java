package webmethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ManagePositionBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","./drivers/chromedriver.exe");

		 ChromeOptions co = new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		  WebDriver driver = new ChromeDriver(co);
		  driver.manage().window().maximize();
		  
		 Point targetPosition=new Point (450,350);
		 Thread.sleep(2000);
		 driver.manage().window().setPosition(targetPosition);
	}
}
// manage method is used to set the position of browser