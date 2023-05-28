package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath2 {
	public static void main(String[] args) throws InterruptedException {
		//XPATH by using contains function
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
				  
	    WebDriver driver = new ChromeDriver (co);
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[contains (@placeholder,'Username')]")).sendKeys("Admin");
				   
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("admin123");
				   
	    driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
	}

}
