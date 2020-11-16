package definitions;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TicketMaster {
    public static void main(String[] args) {


        String path = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.ticketmaster.com/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@placeholder='City or Zip Code']")).sendKeys("San Francisco");
        driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
        WebElement frame = driver.findElement(By.id("google_osd_static_frame_3244652922308"));

        driver.switchTo().frame(frame);


        driver.findElement(By.xpath("//div[contains(@class,'DropDownGroupstyles__StyledSelectedText-sc-1b4fjl8-5 hzMbCp')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Date Range')]")).click();
        driver.findElement(By.xpath("//span[contains(@class,'DayCellstyle__DayText-sc-140tl2e-3 cbrmDV selectedToday')]")).click();
        driver.findElement(By.xpath("//button[contains(@class,'DayCellstyle__Day-sc-140tl2e-1 kDSnER dayEndOfMonth')]//span[contains(@class,'DayCellstyle__DayText-sc-140tl2e-3 cbrmDV')][contains(text(),'30')]")).click();
        driver.findElement(By.xpath("//button[contains(@class,'Basestyles__StyledButton-sc-1s81zy5-0 ciEvLP button--apply noFocus')]")).click();



    }
}
