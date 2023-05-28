package Assignments;
import org.openqa.selenium.chrome.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment2NameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  ChromeOptions co = new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  
		   WebDriver driver = new ChromeDriver (co);
		   driver.manage().window().maximize();
		   driver.get("http://admin/login.do");
		   Thread.sleep(2000);
		   driver.findElement(By.name("username")).sendKeys("admin");
		   Thread.sleep(2000);
		   driver.findElement(By.name("pwd")).sendKeys("manager");
		   Thread.sleep(2000);
		   driver.findElement(By.id("loginButton")).click();		   
	}
}
