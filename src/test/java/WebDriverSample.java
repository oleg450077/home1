import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverSample {

    public static void main(String[]args) throws InterruptedException {
        String path = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", path);
//        String path = System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver";
//        System.setProperty("webdriver.gecko.driver", path);
        WebDriver driver= new ChromeDriver();
//        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.amazon.com");
        String title = driver.getTitle();
        Assertions.assertThat(title.toLowerCase().contains("amazon.com"));
        System.out.println("Amazon page is loaded");
        WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        element.sendKeys("iphone 11");
        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();
        WebElement results = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
        Thread.sleep(3000);
        Assertions.assertThat(results.getText().contains("iphone 11"));
        System.out.println("Iphone 11 is in the results");
        driver.quit();
    }
}
