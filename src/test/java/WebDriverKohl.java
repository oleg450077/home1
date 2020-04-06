import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class WebDriverKohl {

    public static void main(String[] args) {

        String path = System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.kohls.com/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement searchBox = driver.findElement(By.id("search"));
        searchBox.sendKeys("pillow");
        searchBox.submit();
        WebElement searchResults= driver.findElement(By.xpath("//strong[contains (text(), 'pillow')]"));
        Assertions.assertThat(searchResults.getText().contains("pillow"));
        System.out.println(searchResults.getText());
        driver.quit();
    }

}
