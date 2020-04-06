package definitions;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {

    WebDriver driver;

    @Before
    public void before(){
        String path = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", path);

        driver = new ChromeDriver();
    }
//    print hello world
    @Test
    public void print(){
        System.out.println("Hello World!");
        System.out.println("This is upadte");
    }

//    get title of the page
    @Test
    public void e2eTest(){

        driver.get("http://quote-qa.portnov.com/");
        String actualTitle = driver.getTitle();
        Assertions.assertThat(actualTitle).isEqualTo("Get a Quote");
    }

    @After
    public void after(){

        driver.quit();
    }
}

