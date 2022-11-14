//TEST WAS IGNORED. NEED TO CHECK AGAIN
//need to convert into xml or execute groups without xml file conversion
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class MultipleBrowser {
    // main class not needed: public static void main(String[] args) {
       public WebDriver driver;

    @Parameters("browser") // testng annotataion
        @BeforeClass
        void beforeClass(String browser) {
            if (browser.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            }
            driver.get("www.google.com");
        }
        @Test
        void Search() {
            driver.findElement(By.name("q")).sendKeys("Hello World!");
        }
        @AfterTest
        void quit() {
            driver.quit();
        }
    }

