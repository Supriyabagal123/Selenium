package Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment6RobotAndActionClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn"));
		WebElement target = driver.findElement(By.xpath("//a[.='Watch Jewellery ']"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(target).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Band']")).click();
		WebElement filterBy = driver.findElement(By.xpath("//span[.='FILTERED BY']"));
		Robot robot = new Robot();
		
		
	}
}
