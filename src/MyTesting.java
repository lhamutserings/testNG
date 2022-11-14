// RAN SMOOTHLY
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MyTesting {
    WebDriver driver;
    final String browser = "firefox";

    // TEST CASE 1: TITLE IS GOOOGLE OR NOT - PASSED
    @Test
    void titleTest() {
        System.setProperty("webdriver.gecko.driver", "/Users/lhamusherpa/Documents/AUTOMATION/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");

        final String title = driver.getTitle();
        // Test: to see if the title is Google
        Assert.assertEquals(title, "Google"); //we get title from the browser and see if it google; in this case: Test case passed
        // an example of a failed case could be:   Assert.assertEquals(title, "HP");
    }
    // TEST CASE 2: TITLE IS HP OR NOT - FAILED
@Test
void titleTest2(){
        System.setProperty("webdriver.chrome.driver", "/Users/lhamusherpa/Documents/AUTOMATION/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("www.google.com");
    String title = driver.getTitle();
        Assert.assertEquals(title, "HP");
}
// TEST CASE 3: LOGO DISPLAYED OR NOT? - PASSED
    @Test
    void logoTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/lhamusherpa/Documents/AUTOMATION/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
        Assert.assertTrue(logo.isDisplayed());

    }


}
