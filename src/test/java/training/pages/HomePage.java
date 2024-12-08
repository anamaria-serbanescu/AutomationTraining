package training.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class HomePage extends BasePage{

    //identificam web-elementele specifice paginii
    @FindBy(xpath = "//h5")
    private List<WebElement> menuListElements;
    @FindBy(xpath = "//img[@class='banner-image']")
    private WebElement pageTitle;

    //un constructor care match-uieste constructorul din clasa mostenita BasePage
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //implementare a metodei abstracte pentru HomePage din BasePage
    @Override
    public void isPageLoaded() {
        Assert.assertTrue(pageTitle.getAttribute("alt").equals("Selenium Online Training"),"Page is not loaded correctly");

    }

    //facem metode specifice pentru pagina
    //facem o metoda care sa faca click pe meniul Forms
//    public void clickOnFormsMenu() {
//        scrollDown();
//        formsMenuElement.click();
//    }

    //facem o metoda care sa faca click pe un meniu ales de noi

    public void clickOnDesireMenu(String menuName){
        scrollDown();
        for (WebElement element: menuListElements){
            if (element.getText().equals(menuName)){
                element.click();
                break;
            }
        }

    }


    // facem o metoda care sa faca scroll in jos pe pagina
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
    }
}
