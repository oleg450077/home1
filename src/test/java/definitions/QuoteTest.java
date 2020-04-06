package definitions;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.lang.model.util.Elements;
import java.util.List;
import java.util.Set;

public class QuoteTest {

    static WebDriver driver;
    static String url = "http://quote-qa.portnov.com/";

    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver", "/Users/olegluks/IdeaProjects/home1/src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

    }


    @Test
    public void checkTitle() {

        System.out.println(driver.getCurrentUrl());
        String title = driver.getTitle();
        Assertions.assertThat(title.contains("Quote"));
        Assertions.assertThat(title).containsIgnoringCase("Get a Quote");
    }

    @Test
    public void selectRussia() throws InterruptedException {
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='countryOfOrigin']"));
        Select select = new Select(dropdown);
        select.selectByValue("Ukraine");
        Thread.sleep(3000);
        select.selectByVisibleText("Russia");
        Thread.sleep(3000);
    }


    @After
    public void after() {
        driver.quit();
    }


}

