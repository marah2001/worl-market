import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JoinWithEmail {

    BaseTest baseTest = new BaseTest();
    ChromeDriver driver;

    @BeforeClass
    public void setUp() {
        driver = baseTest.setUp("https://www.worldmarket.com/account/login.do");
    }


    @Test(priority = 1)
    public void verifyJoinIsDisplayed() {
        WebElement joinButton = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/form/div[2]/div/button"));
        Assert.assertTrue(joinButton.isDisplayed());
    }

//    @Test(priority = 2)
//    public void verifyClickingJoinButtonOpensLogin() {
//        WebElement joinButton = driver.findElement(By.xpath("/html/body/div[2]/footer/div[2]/div[4]/div[1]/div[2]/div/div[4]/div[1]/form/div/div/div[3]/button"));
//        joinButton.click();
//        WebElement loginForm = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[2]/ul/li[2]/a"));
//        Assert.assertTrue(loginForm.isDisplayed());
//    }


    @Test(priority = 2)
    public void verifyClickingJoinButtonsSaveUser() {
        WebElement firstName = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/form/div[1]/fieldset[1]/div[1]/div/div/input"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(firstName));
        WebElement lastName = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/form/div[1]/fieldset[1]/div[2]/div/div/input"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(lastName));
        WebElement email = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/form/div[1]/fieldset[2]/div[1]/div/div/input"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(email));
        WebElement password = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/form/div[1]/fieldset[2]/div[2]/div/div/input[1]"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(password));
        WebElement mobile = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/form/div[1]/fieldset[2]/div[3]/div/div/input"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(mobile));
        WebElement month = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/form/div[1]/fieldset[3]/div/div[1]/div/div/select"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(month));
        WebElement day = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/form/div[1]/fieldset[3]/div/div[2]/div/div/select"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(day));
        WebElement zipCode = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/form/div[1]/fieldset[4]/div[4]/div/div/input"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(zipCode));
        firstName.sendKeys(TestData.firstName);
        lastName.sendKeys(TestData.lastName);
        mobile.sendKeys(TestData.mobile);
        day.sendKeys(TestData.day);
        month.sendKeys(TestData.month);
        email.sendKeys(TestData.gmail);
        password.sendKeys(TestData.password);
        zipCode.sendKeys(TestData.zipCode);
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/form/div[2]/div/button")).click();
//        BaseTest.wait.until(ExpectedConditions.visibilityOf(successLabel));
//        Assert.assertEquals(successLabel.getText(), TestData.NewSpecialistData.successMessage);
    }

    public void tearDown() {
        baseTest.tearDown();
    }


}
