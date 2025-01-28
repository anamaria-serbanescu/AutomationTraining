package project.tests;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import project.pages.HomePage;
import propertyUtility.PropertyUtility;
import training.pages.CommonPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

//    public WebDriver driver;
//    public training.pages.HomePage homePage;
//
//    @BeforeMethod
//    public void openBrowser(){
//        driver = new ChromeDriver();
//        homePage = new training.pages.HomePage(driver);
//
//        driver.get("https://letcode.in/test");
//        //facem fereastra la dimensiuni maxime
//        driver.manage().window().maximize();
//        //facem fereastra la dimensiunea 1980 x 1080
//        // driver.manage().window().setSize(new Dimension(1980, 1080));
//
//    }
//
//    @AfterMethod
//    public void quitBrowser(){
//        if (driver != null){
//            driver.quit();
//        }
//    }
}

