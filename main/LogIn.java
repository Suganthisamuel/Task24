package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
		private WebDriver driver;
		
	    @FindBy(id = "<input type=\"loginusername\">")
	    private WebElement usernameField;

	    @FindBy(id = "<input type=\"loginpassword\">")
	    private WebElement passwordField;

	    @FindBy(css = "button[onclick='logIn()']")
	    private WebElement loginButtonField;


	    public LogIn(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void enterUsername(String Username) {
			usernameField.sendKeys(Username);
	    }

	    public void enterPassword(String Password) { 
			passwordField.sendKeys(Password);
	    }

	    public void clickLoginButton() {
			loginButtonField.click();
	    }
			
			public String getLoginMessage() {
		        return driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();

	    }
	}