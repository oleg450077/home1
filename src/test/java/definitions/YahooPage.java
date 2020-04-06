package definitions;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class YahooPage {
    public static void main(String[] args) throws InterruptedException {

    String path = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.yahoo.com");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        List<WebElement> links = driver.findElements(By.xpath("//a"));
        for (WebElement link: links){
            System.out.println(link.getText());
        }

        driver.quit();
}}
