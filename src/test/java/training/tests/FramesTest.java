package training.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import training.pages.FramesPage;

import static training.constants.MenuKeys.ALERTS_FRAMES_WINDOWS_MENU;
import static training.constants.SubMenuKeys.ALERTS_SUBMENU;
import static training.constants.SubMenuKeys.FRAMES_SUBMENU;

public class FramesTest extends BaseTest {

//    WebDriver driver;

    @Test
    public void frameTest(){
        homePage.isPageLoaded();
        homePage.clickOnDesireMenu(ALERTS_FRAMES_WINDOWS_MENU);
        commonPage.isPageLoaded();
        commonPage.selectSubMenu(FRAMES_SUBMENU);
        FramesPage framesPage = new FramesPage(driver);
        framesPage.isPageLoaded();
        framesPage.interactWithAllFrames();

//        openBrowser();
//        clickOnAlertsFramesAndWindows();
//        clickOnFramesSubMenu();
//        interactWithFrameOne();
//        switchToDefaultPage();
//        interactWithFrameTwo();
//        switchToDefaultPage();
    }

//    public void openBrowser(){
//        driver = new ChromeDriver();
//        driver.get("https://demoqa.com/");
//        driver.manage().window().maximize();
//    }

//    public void clickOnAlertsFramesAndWindows(){
//        scrollDown();
//        WebElement alertsFramesAndWindowsMenuElement = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
//        alertsFramesAndWindowsMenuElement.click();
//    }
//
//    public void scrollDown(){
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,250)");
//    }
//
//    public void clickOnFramesSubMenu(){
//        WebElement framesSubMenuElement = driver.findElement(By.xpath("//span[text()='Frames']"));
//        framesSubMenuElement.click();
//    }
//
//    public void interactWithFrameOne (){
//        WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='frame1']"));
//        driver.switchTo().frame(frameElement);
//        System.out.println("Textul din primul frame este: " + driver.findElement(By.id("sampleHeading")).getText());
//    }

//    public void switchToDefaultPage(){
//        driver.switchTo().defaultContent();
//    }
//
//    public void interactWithFrameTwo (){
//        WebElement frame2Element = driver.findElement(By.xpath("//iframe[@id='frame2']"));
//        driver.switchTo().frame(frame2Element);
//        System.out.println("Textul din al doilea frame este: " + driver.findElement(By.id("sampleHeading")).getText());
//    }
}
