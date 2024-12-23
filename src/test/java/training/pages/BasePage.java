package training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
//variabila driver va fi folosita in toate paginile care o sa mosteneasca BasePage
    public WebDriver driver;

//facem un constructor care sa initializeze driverul

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //facem o metoda abstracta pe care fiecare pagina sa o implementeze pt a verifica daca pag este incarcata corect

    abstract void isPageLoaded();
}
