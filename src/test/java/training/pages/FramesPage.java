package training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FramesPage extends BasePage{

    @FindBy(xpath = "//h1")
    private WebElement pageTitleElement;

    @FindBy (xpath = "//iframe[@id='frame1']")
    private WebElement frameOneElement;

    @FindBy (id = "sampleHeading")
    private WebElement sampleText;

    @FindBy (xpath = "//iframe[@id='frame2']")
    private WebElement frameTwoElement;

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    public void interactWithAllFrames(){
        interactiveFrameOne();
        interactiveFrameTwo();
    }

    public void interactiveFrameOne (){
        frameHelpers.switchOnFrame(frameOneElement);
        System.out.println("Testul din frame-ul 1 este: " + sampleText.getText());
        frameHelpers.switchToDefaultPage();
    }

//    public void switchToDefaultPage(){
//        driver.switchTo().defaultContent();
//    }

    public void interactiveFrameTwo (){
        frameHelpers.switchOnFrame(frameTwoElement);
        System.out.println("Testul din frame-ul 2 este: " + sampleText.getText());
        frameHelpers.switchToDefaultPage();
    }

    @Override
    public void isPageLoaded() {
        Assert.assertEquals(pageTitleElement.getText(), "Frames", "Title is invalid and actual value is: " +pageTitleElement.getText());
    }
}
