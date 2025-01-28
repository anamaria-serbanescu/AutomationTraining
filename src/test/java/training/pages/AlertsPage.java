package training.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static extendUtility.ExtentManager.logEvents;
import static extendUtility.ReportEventType.INFO_STEP;

public class AlertsPage extends BasePage{

    //Webelemente specifice pt pagina:
    @FindBy(xpath = "//h1")
    private WebElement pageTitleElement;

    @FindBy (id = "alertButton")
    private WebElement firstAlertButton;

    @FindBy (id = "timerAlertButton")
    private WebElement secondAlert ;

    @FindBy (id = "confirmButton")
    private WebElement thirdButton;

    @FindBy (xpath = "//button[@id='promtButton']")
    private WebElement fourthButton ;

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    //Metode specifice pt pagina:
    public void interactWithAllAlerts(String alertText){
        interactWithFirstAlert();
        logEvents(INFO_STEP, "Interact with first alert");
        interactWithWaitingAlert();
        logEvents(INFO_STEP, "Interact with waiting alert");
        interactWithThirdAlert();
        logEvents(INFO_STEP, "Interact with third alert");
        interactWithFourthAlert(alertText);
        logEvents(INFO_STEP, "Interact with forth alert");
    }

    public void interactWithFirstAlert(){
        elementsHelper.clickElement(firstAlertButton);
        logEvents(INFO_STEP, "Click on First Alert Button");
        alertHelpers.acceptAlert();
        logEvents(INFO_STEP, "Accept First Alert");
    }

    public void interactWithWaitingAlert(){
        elementsHelper.clickElement(secondAlert);
        logEvents(INFO_STEP, "Click on Second Alert Button");
        alertHelpers.timerAlert();
        logEvents(INFO_STEP, "Wait for second alert and accept");
    }

    public void interactWithSecondAlert(){
        elementsHelper.clickElement(secondAlert);
    }

    public void waitForSecondAlert(){
        //elementsHelper.waitForElement(secondAlert);
    }

    public void acceptSecondAlert(){
        Alert timerAlert = driver.switchTo().alert();
        timerAlert.accept();
    }

    public void interactWithThirdAlert(){
        elementsHelper.clickElement(thirdButton);
        logEvents(INFO_STEP, "Click on Third Alert Button");
        alertHelpers.dismissAlert();
        logEvents(INFO_STEP, "Dismiss Third Alert");
//        thirdButton.click();
//        Alert confirmBoxAlert = driver.switchTo().alert();
//        confirmBoxAlert.dismiss();
    }

    public void interactWithFourthAlert(String text){
        elementsHelper.clickElement(fourthButton);
        logEvents(INFO_STEP, "Click on Forth Alert Button");
        alertHelpers.promptAlert(text);
        logEvents(INFO_STEP, "Write " +text +" and after click on accept");

//        fourthButton.click();
//        Alert promtAlert = driver.switchTo().alert();
//        promtAlert.sendKeys("Emanuel");
//        promtAlert.accept();
    }

    @Override
    public void isPageLoaded() {
        Assert.assertEquals(pageTitleElement.getText(), "Alerts", "Title is invalid and actual value is: " +pageTitleElement.getText());
    }
}

