package testNG;



import TestCase.LogIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;




    public class LogInTest {
         WebDriver driver;
         //private static final Logger logger = LogManager.getLogger(LogInTest.class);
         
        	 public void setUp() {
        	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\joesa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        	        driver = new ChromeDriver();
        	        driver.get("https://www.demoblaze.com/");
        	        
         }

        @Test
        public void LogIn() {
            driver = new ChromeDriver();
            LogIn login = new LogIn(driver);
            login.enterUsername("SuganthiSamuel");
            login.enterPassword("123456789");
            login.clickLoginButton();
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(login.getLoginMessage().contains("Login successful"));
            softAssert.assertAll();
            driver.quit();
        }
    }
