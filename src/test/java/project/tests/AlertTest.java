package project.tests;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

    WebDriver driver;

    //prima versiune fara page object model (POM)

    @Test
    public void alertTests(){
        openBrowser();
        clickOnAlertMenu();
        clickOnSimpleAlert();
        interactWithSimpleAlert();
        clickOnConfirmAlert();
        acceptConfirmAlert();
        dismissConfirmAlert();
        clickOnPromptAlert();
        interactWithPromptAlert();
        clickOnModernAlert();
        dismissModernAlert();
        closeBrowser();
    }

    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get("https://letcode.in/test");
        driver.manage().window().maximize();
    }

    public void clickOnAlertMenu(){
        WebElement alertElement = driver.findElement(By.xpath("//a[@href='/alert' and text()='Dialog']"));
        alertElement.click();
    }

    public void clickOnSimpleAlert(){
        WebElement simpleAlertElement = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
        simpleAlertElement.click();
    }

    public void interactWithSimpleAlert(){
        Alert alertOK = driver.switchTo().alert();
        alertOK.accept();
    }

    public void clickOnConfirmAlert(){
        WebElement confirmAlertElement = driver.findElement(By.xpath("//button[text()='Confirm Alert']"));
        confirmAlertElement.click();
    }

    public void acceptConfirmAlert(){
        Alert confirmOK = driver.switchTo().alert();
        confirmOK.accept();
    }

    public void dismissConfirmAlert(){
        clickOnConfirmAlert();
        Alert cancelConfirms = driver.switchTo().alert();
        cancelConfirms.dismiss();
    }

    public void clickOnPromptAlert(){
        WebElement promptAlertElement = driver.findElement(By.xpath("//button[text()='Prompt Alert']"));
        promptAlertElement.click();
    }

    public void interactWithPromptAlert(){
        Alert textAlert = driver.switchTo().alert();
        textAlert.sendKeys("John Snow");
        textAlert.accept();
    }

    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
    }

    public void clickOnModernAlert(){
        scrollDown();
        WebElement modernAlertElement = driver.findElement(By.xpath("//button[text()='Modern Alert']"));
        modernAlertElement.click();
    }

    public void dismissModernAlert(){
        WebElement closeButton = driver.findElement(By.xpath("//button[@aria-label='close' and contains(@class, 'modal-close')]"));
        closeButton.click();
    }

    public void closeBrowser(){
        driver.close();
    }

//    public void alertsTest(){
//        homePage.isPageLoaded();
//    }
//
//
//    @Test(priority = 1)
//    public void visitHomePageTest(){
//        homePageTest();
//    }
//    @Test(priority = 2)
//    public void clickAlertPageTest(){
//        homePage.clickAlert();
//    }
//    @Test(priority = 3)
//    public void clickConfirmAlertTest(){
//        alertPage.clickConfirmAlert();
//    }
//    @Test(priority = 4)
//    public void grabConfirmAlertTextTest(){
//        System.out.println(alertPage.grabAlertText());
//    }
//    @Test(priority = 5)
//    public void dissmissConfirmAlertTest(){
//        alertPage.dismissConfirmAlert();
//    }
//    @Test(priority = 6)
//    public void clickPromptAlertTest(){
//        alertPage.clickPromptAlert();
//    }
//    @Test(priority = 7)
//    public void enterPromptAlertNameTest(){
//        alertPage.enterNamePrompt("James Smith");
//    }
//    @Test(priority = 8)
//    public void acceptPromptAlertTest(){
//        alertPage.acceptPromptAlert();
//    }
//
//    @Test(priority = 9)
//    public void enteredPrompNameTest(){
//        Assert.assertTrue(alertPage.enteredPromptName().contains("James Smith"));
//    }
//
//    @Test(priority = 10)
//    public void clickModernAlertTest(){
//        alertPage.clickModernAlert();
//    }
//    @Test(priority = 11)
//    public void dissmissModernAlert(){
//        alertPage.dissmissModernAlert();
//    }
//    @AfterClass
//    public void close(){
//        driver.close();
//    }
}
