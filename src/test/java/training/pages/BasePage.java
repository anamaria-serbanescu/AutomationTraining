package training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import training.helpers.AlertHelpers;
import training.helpers.ElementsHelper;
import training.helpers.FrameHelpers;
import training.helpers.WindowHelpers;

public abstract class BasePage {
//variabila driver va fi folosita in toate paginile care o sa mosteneasca BasePage
    public WebDriver driver;
    public ElementsHelper elementsHelper;
    public AlertHelpers alertHelpers;
    public WindowHelpers windowHelpers;
    public FrameHelpers frameHelpers;

//facem un constructor care sa initializeze driverul

    public BasePage(WebDriver driver) {
        this.driver = driver;
        elementsHelper = new ElementsHelper(driver);
        this.alertHelpers = new AlertHelpers(driver);
        this.windowHelpers = new WindowHelpers(driver);
        this.frameHelpers = new FrameHelpers(driver);
        PageFactory.initElements(driver,this);
    }

    //facem o metoda abstracta pe care fiecare pagina sa o implementeze pt a verifica daca pag este incarcata corect

    abstract void isPageLoaded();
}
