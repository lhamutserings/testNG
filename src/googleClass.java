import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class googleClass {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "/Users/lhamusherpa/Documents/AUTOMATION/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            WebElement apps = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/div/div/div"));
            apps.click();
            WebElement googleApps = driver.findElement(By.cssSelector("//*[@id=\"gbwa\"]/div/a/svg/path")); //couldn't find this one because link is not correct
            driver.switchTo().frame(driver.findElement(By.cssSelector("//*[@id=\"gb\"]/div/div[4]/iframe")));
            List<WebElement> copyAll = driver.findElements(By.xpath("//*[@id=\"gbwa\"]/div/a"));
            for (WebElement appsName: copyAll) {
                System.out.println(appsName.getText());
            }

        }
    }



