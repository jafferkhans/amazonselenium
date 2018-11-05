package in.amazon;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */



    @Test
    public void CheckIfSiteLoads()
    {
       System.setProperty("webdriver.chrome.driver", "/Users/jafferkhans/Softwares/Selenium/chromedriver");
       WebDriver Drive = new ChromeDriver();
       Drive.get("https://amazon.in");
       Drive.close();
       Drive.quit();
    }
}
