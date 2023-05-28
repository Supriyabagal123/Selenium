package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner (System.in);
		System.out.println("select the browser which you want to open");
		String browservalue = sc.next();
		if (browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
			 ChromeOptions co = new ChromeOptions();
			co.addArguments ("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}
		else if (browservalue.equalsIgnoreCase("firefox"))
		{ 
			System.setProperty("webdriver.gecko.driver","./drivers/chromedriver.exe");
			
			WebDriver driver =new FirefoxDriver ();
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 driver.close();
		}
	}
}
