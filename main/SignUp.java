package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//SignUpPage.java


public class SignUp {
 private WebDriver driver;

 @FindBy(id = "<input type=\"sign-username\">")
 private WebElement usernameField;

 @FindBy(name = "<input type=\"sign-password\">")
 private WebElement passwordField;

 @FindBy(css = "button[onclick='register()']")
 private WebElement signUpButton;

 public SignUp(WebDriver driver) {
     this.driver = driver;
     PageFactory.initElements(driver, this);
 }

 public void enterUsername(String Username) {
     usernameField.sendKeys(Username);
 }

 public void enterPassword(String Password) {
     passwordField.sendKeys(Password);
 }

 public void clickSignUpButton() {
     signUpButton.click();
 }
     public String getSignupMessage() {
         return driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();

 }
}



 





   

    