package Assignments;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment5 {
	// to eliminate duplicate
	
	public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver ();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Supriya/Desktop/webelements/multiselectdropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement dropDown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDown);
		List<WebElement> allOptions = sel.getOptions();
		//to eliminate duplicate & maintain the order of insertion order
		TreeSet<String> ts = new TreeSet<String>();
		
		for (int i=0; i<allOptions.size();i++)
		{
			String op=allOptions.get(i).getText();
			ts.add(op);
		}
		for (String options:ts)
		{
			System.out.println(options);
			
		}
	}

}
