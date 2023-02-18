import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomePageTest {
    BaseTest baseTest = new BaseTest();
    ChromeDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = baseTest.setUp("https://www.worldmarket.com");

    }


    @Test(priority = 1)
    public void verifyThatHomeScreenIsOpenedSuccessfully() {
        WebElement homePageImage = driver.findElement(By.xpath("//*[@id='slider-container']/div/div/div/div/a/div/div/img[2]"));
        assertTrue(homePageImage.isEnabled());

    }

    @Test(priority = 2)
    public void verifyThatFeedbackButtonIsDisplayed() {
        WebElement feedbackButton = driver.findElement(By.xpath("//*[@id='oo_tab']"));
        assertTrue(feedbackButton.isDisplayed());
    }

    @AfterClass
    public void tearDown() {
        baseTest.tearDown();
    }

}
