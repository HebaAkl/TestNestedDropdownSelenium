package helpers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestConfigurations {

        public static WebDriver driver;


        public void startDriver()
        {

            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://nesteddropdown.w3spaces.com/index.html?bypass-cache=25928769");
        }

        @AfterMethod
        public static void tearDown() {
            if (null != driver) {
                driver.quit();
            }
        }

    }