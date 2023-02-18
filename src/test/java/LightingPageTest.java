import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LightingPageTest {
    BaseTest baseTest = new BaseTest();
    ChromeDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        driver = baseTest.setUp("https://www.worldmarket.com/category/lighting.do");
    }

    @Test
    public void verifyThatJoinedButtonDisplayed() {
        WebElement joinButton = driver.findElement(By.xpath("//*[@id='header']/div[3]/button"));
        //clickable?
//        wait.until(ExpectedConditions.elementToBeClickable(ikhlasElement));
        joinButton.isDisplayed();
    }

    @AfterClass
    public void tearDown() {
        baseTest.tearDown();
    }
}

