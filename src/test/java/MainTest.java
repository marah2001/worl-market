import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class MainTest {
    ChromeDriver chromeDriver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        wait = new WebDriverWait(chromeDriver, 60);
        chromeDriver.get("https://www.worldmarket.com");
    }


    @Test(priority = 1)
    public void verifyThatHomeScreenIsOpenedSuccessfully() {
        WebElement homePageImage = chromeDriver.findElement(By.xpath("//*[@id='slider-container']/div/div/div/div/a/div/div/img[2]"));
        assertTrue(homePageImage.isEnabled());

    }

    @Test(priority = 1)
    public void verifyThatFeedbackButtonIsDisplayed() {
        WebElement feedbackButton = chromeDriver.findElement(By.xpath("//*[@id='oo_tab']"));
        assertTrue(feedbackButton.isDisplayed());
    }

//    @Test(priority = 3)
//    public void verifyThatClickingFeedbackButtonOpensFeedbackPage() {
//        WebElement feedbackButton = chromeDriver.findElement(By.xpath("//*[@id='oo_tab']"));
//        feedbackButton.click();
//
//    }




    @AfterClass
    public void tearDown() {
        chromeDriver.quit();
    }
}
