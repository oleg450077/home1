import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class WebDriverGoogleTitle {

    public static void main(String[] args) {
         String path = "/Users/olegluks/IdeaProjects/home1/src/test/resources/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", path );
        String url = "http://google.com";
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Assertions.assertThat(driver.getTitle().contains("google"));
        System.out.println("Title of the loaded page is: " + driver.getTitle());
        driver.quit();


    }

}
