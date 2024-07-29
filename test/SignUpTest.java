package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import TestCase.SignUp; 
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;



    
    public class SignUpTest{
         WebDriver driver;
         //private static final Logger logger = LogManager.getLogger(SignUpTest.class);
         
         public void setUp() {
             System.setProperty("webdriver.chrome.driver", "C:\\Users\\joesa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
             driver = new ChromeDriver();
             driver.get("https://www.demoblaze.com/");
             //logger.info("Navigated to demoblaze.com");
         }

        @Test
        public void SignUp() {
            driver = new ChromeDriver();
            SignUp signup = new SignUp(driver);
            signup.enterUsername("SuganthiSamuel");
            signup.enterPassword("123456789");
            signup.clickSignUpButton();
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(signup.getSignupMessage().contains("Sign up successful"));
            softAssert.assertAll();
            driver.quit();
        }
    }

   