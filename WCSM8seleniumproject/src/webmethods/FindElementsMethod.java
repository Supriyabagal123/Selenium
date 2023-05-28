package webmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementsMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","./drivers/chromedriver.exe");

		 ChromeOptions co = new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		 
		  WebDriver driver = new ChromeDriver(co);
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 Thread.sleep(2000);
		 driver.switchTo().activeElement().sendKeys("pizza");
		  List<WebElement> pizzaOptions = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
		 Thread.sleep(2000);
		 
		 for (int i= 1; i<pizzaOptions.size();i++)
		 {
			  String pizza = pizzaOptions.get(i).getText();
			  System.out.println(pizza);
			  Thread.sleep(2000);
		 }

}
}
// findElements method is used to find multiple elements