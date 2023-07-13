package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTests {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "recources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://flickr.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println(driver.getTitle());
        driver.findElement(By.id("search-field"));
        driver.findElement(By.xpath("//li[@aria-label = 'Sign In']")).click();

        driver.quit();
    }

    public static void main(String args[]){
        BaseTests baseTests = new BaseTests();
        baseTests.setUp();
    }

}
