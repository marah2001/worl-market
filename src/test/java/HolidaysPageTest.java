import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HolidaysPageTest {
    BaseTest baseTest = new BaseTest();
    ChromeDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        driver = baseTest.setUp("https://www.worldmarket.com/category/holiday.do");
    }

    @Test
    public void verifyThatImageSliderDisplayed() {
        WebElement imagesSlider = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[1]/div[2]/div[2]/span/div/div/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[1]/a/img"));
        //clickable?
//        wait.until(ExpectedConditions.elementToBeClickable(ikhlasElement));
        imagesSlider.isDisplayed();
    }

    @AfterClass
    public void tearDown() {
        baseTest.tearDown();
    }
}
