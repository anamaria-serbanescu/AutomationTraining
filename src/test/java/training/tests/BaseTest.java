package training.tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import training.pages.CommonPage;
import training.pages.HomePage;

public class BaseTest {

    public WebDriver driver;
    public HomePage homePage;
    public CommonPage commonPage;

    @BeforeMethod
    public void openBrowser(){
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        commonPage = new CommonPage(driver);

        driver.get("https://demoqa.com/");
        //facem fereastra la dimensiuni maxime
        driver.manage().window().maximize();
        //facem fereastra la dimensiunea 1980 x 1080
        // driver.manage().window().setSize(new Dimension(1980, 1080));

    }

    @AfterMethod
    public void quitBrowser(){
        if (driver != null){
            driver.quit();
        }
    }
}
