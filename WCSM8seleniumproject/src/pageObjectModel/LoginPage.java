package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// to record all the webElement of loginPage by using @FindBy annotation
	
	@FindBy(name="username") private WebElement usernameTB;
	@FindBy(name="pwd") private WebElement passwordTB;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(xpath= "//input[@name='remember']") private WebElement checkBox;
	@FindBy(linkText="http://www.actimind.com") private WebElement actiMindLink;
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	// utilization 
	
	public WebElement getUsernameTB() {
		return usernameTB;
	}


	public WebElement getPasswordTB() {
		return passwordTB;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	public WebElement getCheckBox() {
		return checkBox;
	}


	public WebElement getActiMindLink() {
		return actiMindLink;
	}
	
	
	
	//operational methods
	public void validLogin(String validUsername,String validPassword)
	{
		usernameTB.sendKeys(validUsername);
		
		passwordTB.sendKeys(validPassword);
		
		loginButton.click();
	}


	
	
	
	
}
