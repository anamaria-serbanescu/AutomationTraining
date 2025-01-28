package training.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import training.pages.AlertsPage;

import java.time.Duration;

import static extendUtility.ExtentManager.logEvents;
import static extendUtility.ReportEventType.*;
import static training.constants.MenuKeys.ALERTS_FRAMES_WINDOWS_MENU;
import static training.constants.SubMenuKeys.ALERTS_SUBMENU;

public class AlertsTest extends BaseTest {

//    WebDriver driver;
    @Test
    public void alertsTests() {
        homePage.isPageLoaded();
        logEvents(PASS_STEP, "Verify if homepage is loaded correctly");
        homePage.clickOnDesireMenu(ALERTS_FRAMES_WINDOWS_MENU);
        logEvents(INFO_STEP, "Select ALERTS_FRAMES_WINDOWS from menu");
        commonPage.isPageLoaded();
        commonPage.selectSubMenu(ALERTS_SUBMENU);
        logEvents(INFO_STEP, "Select ALERTS_SUBMENU from Common Page");
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.isPageLoaded();
        logEvents(PASS_STEP, "Verify if Alert Page is loaded correctly");
        alertsPage.interactWithAllAlerts("Alerts test");
        logEvents(PASS_STEP, "Interact with all the alerts form Alert Page");
    }
//        alertsPage.clickFirstAlertButton();
//        alertsPage.interactWithWaitingAlert();
//        alertsPage.clickThirdButton();
//        alertsPage.clickFourthButton();

    //prima versiune fara page object model (POM)
//        openBrowser();
//        scrollDown();
//        clickOnAlertsFramesAndWindows();
//        clickOnAlertsSubMenu();
//        clickOnFirstAlertButton();
//        interactWithAlertOk();
//        clickOnSecondAlertButton();
//        interactWithTimerAlert();
//        clickOnThirdAlertButton();
//        interactWithConfirmAlert();
//        clickOnFourthAlertButton();
//        interactWithTextAlert();
//
    }

//    public void openBrowser(){
//        driver = new ChromeDriver();
//        driver.get("https://demoqa.com/");
//        driver.manage().window().maximize();
//    }
//
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
//    public void clickOnAlertsSubMenu(){
//        WebElement alertsElement = driver.findElement(By.xpath("//span[text()='Alerts']"));
//        alertsElement.click();
//    }
//
//    public void clickOnFirstAlertButton(){
//        WebElement firstAlertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
//        firstAlertButton.click();
//    }
//
//    public void interactWithAlertOk(){
//        Alert alertOk = driver.switchTo().alert();
//        alertOk.accept();
//    }
//
//    public void clickOnSecondAlertButton(){
//        WebElement secondAlertButton = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
//        secondAlertButton.click();
//    }
//
//    public void interactWithTimerAlert(){
//        waitForAlert();
//        Alert timerAlert = driver.switchTo().alert();
//        timerAlert.accept();
//    }
//
//    public void waitForAlert(){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());
//    }
//
//    public void clickOnThirdAlertButton(){
//        WebElement thirdAlertButtonElement = driver.findElement(By.xpath("//button[@id='confirmButton']"));
//        thirdAlertButtonElement.click();
//    }
//
//    public void interactWithConfirmAlert(){
//        Alert confirmAlert = driver.switchTo().alert();
//        confirmAlert.dismiss();
//    }
//
//    public void clickOnFourthAlertButton(){
//        WebElement fourthAlertButtonElement = driver.findElement(By.xpath("//button[@id='promtButton']"));
//        fourthAlertButtonElement.click();
//    }
//
//    public void interactWithTextAlert(){
//        Alert textAlert = driver.switchTo().alert();
//        textAlert.sendKeys("hasta la vista baby");
//        textAlert.accept();
//    }


//}