package training;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesTest {

    WebDriver driver;

    @Test
    public void frameTest(){
        openBrowser();
        clickOnAlertsFramesAndWindows();
        clickOnFramesSubMenu();
        interactWithFrameOne();
        switchToDefaultPage();
        interactWithFrameTwo();
        switchToDefaultPage();
    }

    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
    }

    public void clickOnAlertsFramesAndWindows(){
        scrollDown();
        WebElement alertsFramesAndWindowsMenuElement = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        alertsFramesAndWindowsMenuElement.click();
    }

    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
    }

    public void clickOnFramesSubMenu(){
        WebElement framesSubMenuElement = driver.findElement(By.xpath("//span[text()='Frames']"));
        framesSubMenuElement.click();
    }

    public void interactWithFrameOne (){
        WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frameElement);
        System.out.println("Textul din primul frame este: " + driver.findElement(By.id("sampleHeading")).getText());
    }

    public void switchToDefaultPage(){
        driver.switchTo().defaultContent();
    }

    public void interactWithFrameTwo (){
        WebElement frame2Element = driver.findElement(By.xpath("//iframe[@id='frame2']"));
        driver.switchTo().frame(frame2Element);
        System.out.println("Textul din al doilea frame este: " + driver.findElement(By.id("sampleHeading")).getText());
    }
}
