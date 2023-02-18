import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations .AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RugsPageTest {
    BaseTest baseTest = new BaseTest();
    ChromeDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        driver = baseTest.setUp("https://www.worldmarket.com/category/rugs.do");
    }

    @Test
    public void verifyThatClickingNewRugsButtonOpensThePage() {
        WebElement newRugs = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[1]/div[2]/div[1]/div/div/div/ul/li[2]/a"));
        newRugs.isDisplayed();
    }

    @AfterClass
    public void tearDown() {
        baseTest.tearDown();
    }
}
